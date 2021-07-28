package interation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import interfaces.web.IActionsInBrowser;
import interfaces.web.IClick;
import interfaces.web.ICombo;
import interfaces.web.IDrag;
import interfaces.web.IGet;
import interfaces.web.IMove;
import interfaces.web.IWait;
import interfaces.web.IWrite;

public interface InteractionWeb
		extends IActionsInBrowser, IDrag, IClick, ICombo, IWrite,	IWait, IMove, IGet {
	Log logger = LogFactory.getLog(InteractionWeb.class);
}