package paginas;

import elementos.ElementosExemplos;
import interacoes.InteracaoWeb;
import utils.RegrasUtils;

public class PaginaExemploPagina extends ElementosExemplos implements InteracaoWeb {

	private RegrasUtils util = new RegrasUtils();
	
	/**
	 * Exemplo de uma classe Page
	 * @author leonardoananias
	 */
	
	public void acessarSistema() {
		openUrl(util.getUrl());
		waitUrlLoading(util.getUrl(), 10);
	}
	
	public void realizarLogin() {
		write(getTxtUsuario(), "brq");
	}
	
}
