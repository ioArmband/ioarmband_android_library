package org.ioarmband.android.connection.message.impl.android;

import android.os.Parcel;
import android.os.Parcelable;

public class MessageContainer implements Parcelable {
	private static final long serialVersionUID = -7649684440394383542L;

	String clazz;

	MessageAndroid messageAndroid;
	//Parcelable parcelable;
	

	
	public MessageContainer() {
		super();
		}
	
	private MessageContainer(Parcel in) {
		super();
		readFromParcel(in);

	}

	public static final Parcelable.Creator<MessageContainer> CREATOR = new Parcelable.Creator<MessageContainer>() {
		public MessageContainer createFromParcel(Parcel in) {
			return new MessageContainer(in);
		}

		public MessageContainer[] newArray(int size) {
			return new MessageContainer[size];
		}
	};

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(clazz);
		dest.writeParcelable(messageAndroid,flags);
	}

	public void readFromParcel(Parcel in) {
		clazz = in.readString();
		
		try {
			messageAndroid = in.readParcelable(Class.forName(clazz).getClassLoader());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public MessageAndroid getMessageAndroid() {
		return messageAndroid;
	}

	public void setMessageAndroid(MessageAndroid messageAndroid) {
		this.messageAndroid = messageAndroid;
		this.clazz = messageAndroid.getClass().getName();
	}

	/*
	public Parcelable getParcelable() {
		return parcelable;
	}

	public void setParcelable(Parcelable parcelable) {
		this.parcelable = parcelable;
		this.clazz = parcelable.getClass().getName();
		
	}*/
	

}
