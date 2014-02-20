package org.ioarmband.android.connection.message.impl.android;

import org.ioarmband.net.message.Message;

import android.os.Parcelable;


public interface MessageAndroid extends Parcelable{
	
	Message getOriginalMessage();
	void setOriginalMessage(Message message);
	
}
