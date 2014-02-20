package org.ioarmband.android.connection.message.impl.android;

import org.ioarmband.net.component.GenericContainer;
import org.ioarmband.net.message.Message;

public class GenericAppMessage extends Message{

	private static final long serialVersionUID = 6745639794184982795L;
	
	private String name;
	private GenericContainer mainView;
	
	
	public GenericAppMessage() {
		super("open_generic_app");
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GenericContainer getMainView() {
		return mainView;
	}
	public void setMainView(GenericContainer mainView) {
		this.mainView = mainView;
	}
	
	@Override
	public String toString() {
		return "GenericAppMessage [name=" + name + ", mainView=" + mainView
				+ "]";
	}
	
	
}
