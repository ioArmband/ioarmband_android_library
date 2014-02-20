package org.ioarmband.android.connection.message.impl.android;

import org.ioarmband.net.message.Message;
import org.ioarmband.net.message.enums.GestureType;
import org.ioarmband.net.message.impl.GestureMessage;

import android.os.Parcel;
import android.os.Parcelable;


public class GestureMessageAndroid extends GestureMessage implements MessageAndroid{
	private static final long serialVersionUID = 5755452630440728655L;

	public GestureMessageAndroid() {
		super();
	}
	
	public GestureMessageAndroid(Parcel in) {
		super();
		readFromParcel(in);
	}
	
	public GestureMessageAndroid(GestureMessage message) {
		super();
		setType(message.getType());
		setSourceName(message.getSourceName());
	}

	//PARCELABLE
	
	public static final Parcelable.Creator<GestureMessageAndroid> CREATOR = new Parcelable.Creator<GestureMessageAndroid>() {
		public GestureMessageAndroid createFromParcel(Parcel in) {
			return new GestureMessageAndroid(in);
		}

		public GestureMessageAndroid[] newArray(int size) {
			return new GestureMessageAndroid[size];
		}
	};
	
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(getCommandName());
		dest.writeString(getSourceName());
		dest.writeString((getType() == null) ? "" : getType().name());
		
	}

	public void readFromParcel(Parcel in) {

		setCommandName(in.readString());
		setSourceName(in.readString());

		try {
			GestureType type = GestureType.valueOf(in.readString());
			setType(type);
		} catch (IllegalArgumentException x) {

		}
	}

	@Override
	public Message getOriginalMessage() {

		GestureMessage msg = new GestureMessage();
		msg.setCommandName(getCommandName());
		msg.setSourceName(getSourceName());
		msg.setType(getType());
		
		return msg;
	}

	@Override
	public void setOriginalMessage(Message message) {
		GestureMessage msg = (GestureMessage) message;
		setType( msg.getType());
		setSourceName(msg.getSourceName());

	}


	
}
