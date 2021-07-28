package execute;

import java.io.File;

public class MakeDirectory {

	private static final String diretoryPath = System.getProperty("user.dir").concat(File.separator).concat("Evidence");
	
	/**
	 * Validate if there is a evidence directory
	 * @author leonardoananias
	 */
	public void validateDiretory() {
		File diretorio = new File(diretoryPath);
		if (!diretorio.exists()) {
			createDirectory();
		}
	}
	
	/**
	 * Create the directory
	 * @author leonardoananias
	 */
	private void createDirectory() {
		File diretorio = new File(diretoryPath);
		diretorio.mkdirs();
		File subPrints = new File(diretorio,"Prints");
		subPrints.mkdirs();
		File subPrintsDeErro = new File(diretorio, "ErrorsPrint");
		subPrintsDeErro.mkdirs();
	}	
}
