package org.ioarmband.android.connection.message.impl.android;

import org.ioarmband.net.message.Message;

public class CastingImageMessage extends Message {
	private static final long serialVersionUID = 4146474021541087077L;
	
	String encodedImage;
	
	public CastingImageMessage(String encodedImage) {
		super("casting_image");
		this.encodedImage = encodedImage;
	}
	
	public String getEncodedImage() {
		return encodedImage;
	}
	public void setEncodedImage(String encodedImage) {
		this.encodedImage = encodedImage;
	}
}
