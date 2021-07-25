package steps;

import io.cucumber.java8.En;
import paginas.PaginaExemploPagina;

public class ExemploSteps implements En{

	/**
	 * Exemplo de uma classe steps
	 * @author leonardoananias
	 */
	
	private PaginaExemploPagina exemplo = new PaginaExemploPagina();
	/**
	 * *********************************************************************************************************************************
	 * 																																   *
	 * Exemplo do step com cucumber java 8 - Caso deseja utilizar, alterar a classe CucumberExecute.								   *
	 * 																																   *																																   *
	 * ********************************************************************************************************************************/
	public ExemploSteps() {
		Given("que acesse o sistema", () -> {
			exemplo.acessarSistema();
		});
	}
	
	/**
	 * *********************************************************************************************************************************
	 * 																																   *
	 * Exemplo do step com cucumber java 7																							   *
	 * 																																   *																																   *	
	 * @Given("^que acesse o sistema$")																								   *
	 *	 public void acessarGoogle(){																								   *
	 *		exemplo.acessarSistema();																								   *
	 * }																															   *
	 * 																																   *
	 * @see Alterar o nome do método que é gerado pelo cucumber																		   *
	 * Exemplo: 																													   *
	 * 																																   *
	 * public void oSistemaApresentaOResultadoEsperado(), altera para um nome mais legivel cadastroComSucesso()						   *
	 *																												                   *
     * ********************************************************************************************************************************/
}
