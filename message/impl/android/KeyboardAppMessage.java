package org.ioarmband.android.connection.message.impl.android;

import static org.ioarmband.net.message.impl.AppMessage.AppStd.KEYBOARD;

public class KeyboardAppMessage  extends AppMessage{
	private static final long serialVersionUID = 4679425979414404587L;
	public KeyboardAppMessage(String type) {
		super(KEYBOARD.name(), type);
	}
	public KeyboardAppMessage() {
		super(AppStd.KEYBOARD_NUM);
	}


	
}
