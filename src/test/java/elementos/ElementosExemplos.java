package elementos;

import org.openqa.selenium.By;

import interfaces.objects.WebBaseElements;

public class ElementosExemplos  implements WebBaseElements{

	/**
	 * *********************************************************************************************************************************
	 * 																																   *
	 * Atributos devem ser criados com o nível de acesso mais baixo, no caso private. Pois os atributos devem apenas serem utilizados  *
	 * em sua classe, seja necessário disponibilizar apenas entre os pacotes, no caso o modificador de acesso Proteceted. Para outras  *
	 * classes terem acesso aos atributos deve ser obtidos atráves dos métodos getters e setters.									   *
	 * 																																   *	
	 * 																																   *
	 * @author leonardoananias																										   *
	 * @serialData 15-10-2020																										   *
	 * 																																   *
	 * @see Utilizar os objetos By da interface WebBaseElements. Seguir um padrão na nomeclatura dos atributos. 					   *
	 * 					   																											   *		
	 * Input - Utilizar a abreviação (TXT)																							   *
	 * Button - Utilizar a abreviação (BTN)																							   *	
	 * Radio_Button - Utilizar a abreviação (RDB) 																					   *
	 * Check_Button - Utilizar a abreviação (CHK)																					   *	
	 * ComboBox/ListView - Utilizar a abreviação (CBX)																				   *
	 * Label - Utilizar a abreviação (LBL)																							   *
	 * Imagem - Utilizar a abreviação (IMG)																							   *
	 * Link/PartialLink - Utilizar a abreviação (LNK)																				   *
	 * Mensagem_do_sistema  - Utilizar a abreviação (MSG)  																			   *
	 * Modais - Utilizar a abreviação (MD)																							   *
	 * Frame/Iframe - Utilizar a abreviação (FRM)																					   *
	 *																																   *
	 *																																   *
	 *																																   *
	 * ********************************************************************************************************************************/
	
	private By txtUsuario = id("login");
	
	public By getTxtUsuario() {
		return txtUsuario;
	}
	
}
