package interation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import interfaces.web.IActionsInBrowser;
import interfaces.web.IClick;
import interfaces.web.IClickJS;
import interfaces.web.ICombo;
import interfaces.web.IDrag;
import interfaces.web.IFrame;
import interfaces.web.IGet;
import interfaces.web.IMove;
import interfaces.web.IWait;
import interfaces.web.IWrite;
import interfaces.web.IWriteJS;

public interface InteractionWeb
		extends IActionsInBrowser, IDrag, IClick, IClickJS, ICombo, IWrite, IWriteJS,
		IWait, IFrame, IMove, IGet {
	Log logger = LogFactory.getLog(InteractionWeb.class);
}