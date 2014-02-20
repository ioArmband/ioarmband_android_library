package org.ioarmband.android.connection.aidl;

import org.ioarmband.android.connection.message.impl.android.MessageContainer; 

interface RemoteCommunicationServiceListener {
	  
	void onConnectionStarted(); 
	  
	void onWinControl();

	void onCommandReiceved(in MessageContainer command);
	
	void onLoseControl();
	
	void onConnectionClose();

	}