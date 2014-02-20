package org.ioarmband.android.connection.message.impl.android;

import org.ioarmband.net.message.Message;
import org.ioarmband.net.message.impl.AppMessage;

import android.os.Parcel;
import android.os.Parcelable;


public class AppMessageAndroid extends AppMessage implements MessageAndroid{

	private static final long serialVersionUID = -1296839184429187004L;

	public AppMessageAndroid(String applicationName, String params) {
		super(applicationName,params);
	}
	
	public AppMessageAndroid(String applicationName){
		super(applicationName);
	}
	
	public AppMessageAndroid(AppStd appStd){
		super(appStd);
	}
	
	public AppMessageAndroid(AppMessage appMessage){
		super();
		setAppName(appMessage.getAppName());
		setParams(appMessage.getParams());
	}
	
	public AppMessageAndroid(Parcel in){
		super();
		readFromParcel(in);
	}

	
	//PARCELABLE
	
		public static final Parcelable.Creator<AppMessageAndroid> CREATOR = new Parcelable.Creator<AppMessageAndroid>() {
			public AppMessageAndroid createFromParcel(Parcel in) {
				return new AppMessageAndroid(in);
			}

			public AppMessageAndroid[] newArray(int size) {
				return new AppMessageAndroid[size];
			}
		};
	
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
	dest.writeString(getParams());
	dest.writeString(getAppName());
		
	}
	

	public void readFromParcel(Parcel dest) {
		setParams(dest.readString());
		setAppName(dest.readString());
		
	}
	

	@Override
	public Message getOriginalMessage() {
		return new AppMessage(getAppName(), getParams());
	}

	@Override
	public void setOriginalMessage(Message message) {
		setParams(getParams());
		setAppName(getAppName());
		
	}
	

	
	
	
	
	
	

}
