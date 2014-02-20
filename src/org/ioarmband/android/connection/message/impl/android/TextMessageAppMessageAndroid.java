package org.ioarmband.android.connection.message.impl.android;

import org.ioarmband.net.message.Message;
import org.ioarmband.net.message.impl.TextMessageAppMessage;

import android.os.Parcel;
import android.os.Parcelable;

public class TextMessageAppMessageAndroid extends  TextMessageAppMessage implements MessageAndroid  {
	
	private static final long serialVersionUID = -7649684440394383542L;
	
	//CONSTRUCTOR
	
	public TextMessageAppMessageAndroid() {
		super();
		}
	

	private TextMessageAppMessageAndroid(Parcel in) {
		super();
		readFromParcel(in);
	}
	
	public TextMessageAppMessageAndroid(TextMessageAppMessage msg) {
		super();
		this.setSource(msg.getSource());
		this.setMessage(msg.getMessage());
		this.setAuthor(msg.getAuthor());
		this.setEncodedImage(msg.getEncodedImage());
	}
	

	
	public TextMessageAppMessageAndroid( String source, String author, String message, String encodedImage) {
		super();
		this.setSource(source);
		this.setMessage(message);
		this.setAuthor(author);
		this.setEncodedImage(encodedImage);
	}
	
	public TextMessageAppMessageAndroid( String source, String author, String message) {
		this(source, author, message, null);
	}
	
	
	
	
	//PARCELABLE
	
	public static final Parcelable.Creator<TextMessageAppMessageAndroid> CREATOR = new Parcelable.Creator<TextMessageAppMessageAndroid>() {
		public TextMessageAppMessageAndroid createFromParcel(Parcel in) {
			return new TextMessageAppMessageAndroid(in);
		}

		public TextMessageAppMessageAndroid[] newArray(int size) {
			return new TextMessageAppMessageAndroid[size];
		}
	};

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		
		dest.writeString(getSource());
		dest.writeString(getMessage());
		dest.writeString(getAuthor());
		dest.writeString(getEncodedImage());
	}
	

	public void readFromParcel(Parcel in) {
		
		setSource(in.readString());
		setMessage(in.readString());
		setAuthor(in.readString());
		setEncodedImage(in.readString());
	}

	public TextMessageAppMessage getOriginalMessage() {
		TextMessageAppMessage textMessageAppMessage = new TextMessageAppMessage(getSource(), getAuthor(), getMessage(), getEncodedImage());
		return textMessageAppMessage;
	}
	

	@Override
	public void setOriginalMessage(Message message) {
		TextMessageAppMessage msg = (TextMessageAppMessage) message;
		this.setSource(msg.getSource());
		this.setMessage(msg.getMessage());
		this.setAuthor(msg.getAuthor());
		this.setEncodedImage(msg.getEncodedImage());
		
	}

}
