package execute;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.mozilla.javascript.JavaScriptException;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.file.FileUtil;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import drivers.web.DriverWeb;
import interation.InteractionWeb;

/**
 * The Class ComplementsAfter.
 */
public class ComplementsAfter implements InteractionWeb {

	@After
	public void tearDown(Scenario scenario) throws IOException {
		try {
			Thread.sleep(2000);
			toEvidenceScenario(scenario, createScreenshootName(scenario));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	

	private String returnStatusScenarie(Scenario scenarie) {
		String text = null;
		if (scenarie.getStatus().contentEquals("passed")) {
			text = returnPositiveStatus().toString();
		} else {
			text = returnNegativeStatus().toString();
		}
		return text;
	}

	private void takeScreenshotWeb(String imagePath, String imageName) {
		logger.info("Take print "+imageName+" and saving in path " +imagePath);
		try {
		File destino = new File(imagePath.concat(File.separator) + imageName + ".png");
		BufferedImage image =  Shutterbug.shootPage(DriverWeb.getDriver(), ScrollStrategy.WHOLE_PAGE_CHROME, 10000, true).withName(imageName).getImage();
		
			//FileUtils.copyFile(screenshot, destino);
			FileUtil.writeImage(image, "png", destino);
		} catch (NullPointerException|JavaScriptException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " "+ e.getMessage());
		}
	}

	private String createScreenshootName(Scenario scenario) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("RESULTADO: \n" + returnStatusScenarie(scenario));
		return archieveName(scenario, sdf, timestamp);
	}

	private String archieveName(Scenario scenario, SimpleDateFormat sdf, Timestamp timestamp) {
		String archieveName = scenario.getId().replaceAll("-", " ").replaceAll("   ", " - ").substring(0,scenario.getId().indexOf(";"));
		archieveName = StringUtils.capitalize(archieveName) + " - " + scenario.getName() + " - " + sdf.format(timestamp).replaceAll("[\\\\/:*?\"<>|]", "");
		return archieveName;
	}

	private void toEvidenceScenario(Scenario scenario, String archieveName) {
		if (!scenario.isFailed()) {
			createPathToEvidence(ValidateEvidence.inFolder("Prints"));
			takeScreenshotWeb(ValidateEvidence.inFolder("Prints"), archieveName);
		} else {
			createPathToEvidence(ValidateEvidence.inFolder("ErrosPrint"));
			takeScreenshotWeb(ValidateEvidence.inFolder("ErrosPrint"), " ERROR - " + archieveName);
		}
	}
	private void createPathToEvidence(String nomeCaminho) {
		File path = new File(nomeCaminho);
		if(!path.exists() && !path.isDirectory()) { 
			path.mkdirs();
		}
	}

	private StringBuffer returnPositiveStatus() {
		StringBuffer stringBuilder = new StringBuffer();
		stringBuilder.append("\u2605\u2606\u2605\u2606\u2605\u2606\u2605\u2606\u2605\u2606"
				+ "\u2605\u2606\u2605\u2606\u2605\u2606\u2605\u2606\u2605\u2606\u2605\u2606"
				+ "\u2605\u2606\u2605\u2606\n");
		stringBuilder.append("╔═══╗╔═══╗╔═══╗╔═══╗\n");
		stringBuilder.append("║╔═╗║║╔═╗║║╔═╗║║╔═╗║\n");
		stringBuilder.append("║╚═╝║║║─║║║╚══╗║╚══╗\n");
		stringBuilder.append("║╔══╝║╚═╝║╚══╗║╚══╗║\n");
		stringBuilder.append("║║───║╔═╗║║╚═╝║║╚═╝║\n");
		stringBuilder.append("╚╝───╚╝─╚╝╚═══╝╚═══╝\n");
		stringBuilder.append("\u2605\u2606\u2605\u2606\u2605\u2606\u2605\u2606\u2605\u2606"
				+ "\u2605\u2606\u2605\u2606\u2605\u2606\u2605\u2606\u2605\u2606\u2605\u2606"
				+ "\u2605\u2606\u2605\u2606\n");
		stringBuilder.append("\n");
		return stringBuilder;
	}

	private StringBuffer returnNegativeStatus() {
		StringBuffer stringBuilder = new StringBuffer();
		stringBuilder.append("╔═══╗╔═══╗╔╗╔╗\n");
		stringBuilder.append("║╔══╝║╔═╗║║║║║\n");
		stringBuilder.append("║╚══╗║║─║║║║║║\n");
		stringBuilder.append("║╔══╝║╚═╝║║║║║─╔╗\n");
		stringBuilder.append("║║───║╔═╗║║║║╚═╝║\n");
		stringBuilder.append("╚╝───╚╝─╚╝╚╝╚═══╝\n");
		stringBuilder.append("\n");
		return stringBuilder;
	}
}
