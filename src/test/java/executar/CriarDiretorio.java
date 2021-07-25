package executar;

import java.io.File;

public class CriarDiretorio {

	private static final String caminhoDiretorio = System.getProperty("user.dir").concat(File.separator).concat("Evidencias");
	
	/**
	 * Validar se o diretório Evidencias existe
	 * @author leonardoananias
	 */
	public void validarDiretorio() {
		File diretorio = new File(caminhoDiretorio);
		if (!diretorio.exists()) {
			criarDiretorio();
		}
	}
	
	/**
	 * Cria diretório e subdiretorios 
	 * @author leonardoananias
	 */
	private void criarDiretorio() {
		File diretorio = new File(caminhoDiretorio);
		diretorio.mkdirs();
		File subPrints = new File(diretorio,"Prints");
		subPrints.mkdirs();
		File subPrintsDeErro = new File(diretorio, "PrintsDeErros");
		subPrintsDeErro.mkdirs();
	}	
}
