package interacoes;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import interfaces.web.IActionsInBrowser;
import interfaces.web.IAlert;
import interfaces.web.IDrag;
import interfaces.web.IClick;
import interfaces.web.IClickJS;
import interfaces.web.ICombo;
import interfaces.web.IDesambiguador;
import interfaces.web.IWrite;
import interfaces.web.IWriteJS;
import interfaces.web.IWait;
import interfaces.web.IFrame;
import interfaces.web.IClear;
import interfaces.web.IMove;
import interfaces.web.IMoveJS;
import interfaces.web.IGetJS;
import interfaces.web.ISearch;
import interfaces.web.IUtils;
import interfaces.web.IValidationsWeb;

public interface InteracaoWeb
		extends IAlert, IActionsInBrowser, IDrag, IClick, IClickJS, ICombo, IWrite, IWriteJS, IDesambiguador,
		IWait, IFrame, IClear, IMove, IMoveJS, IGetJS, ISearch, IValidationsWeb, IUtils {
	Log logger = LogFactory.getLog(InteracaoWeb.class);
}