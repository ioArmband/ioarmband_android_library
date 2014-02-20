package org.ioarmband.android.connection.aidl;

import org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener;
import org.ioarmband.android.connection.message.impl.android.MessageContainer; 

interface IRemoteCommunicationService {
	  
	void useConnection(in RemoteCommunicationServiceListener communicationListener);
	void sendMessage(in MessageContainer messageContainer);
	void unUseConnection(in RemoteCommunicationServiceListener communicationListener);

	}