package execute;

import java.io.File;
import java.util.Arrays;

public class ValidateEvidence {
	
	
	/**
	 * In each new running this method will delete the old prints
	 * @author leonardoananias
	 */
	public static void deletePrints() {
		areTheseArchieve(inFolder("ErrorsPrint"));
		areTheseArchieve(inFolder("Prints"));
	}
	/**
	 * Validate if exists some archieve in the folder
	 * @author leonardoananias
	 * @param path
	 */
	public static void areTheseArchieve(String path) {
		try {
			File file = new File(path);
			if (file.listFiles().length > 0) {
				Arrays.stream(file.listFiles()).forEach(File::delete);
			}
		} catch (Exception e) {
			System.out.println("Prints are not deleted");
		}
	}
	
	/**
	 * Retorna a pasta com as evidencias.
	 * @author leonardoananias
	 * @param folderName
	 * @return
	 */
	public static String inFolder(String folderName) {
		return System.getProperty("user.dir")
				.concat(File.separator
				.concat("Evidences")
				.concat(File.separator.concat(folderName)));
	}
}
