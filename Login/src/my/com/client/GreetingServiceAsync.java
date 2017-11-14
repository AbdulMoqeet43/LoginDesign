package my.com.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void greetServer(String input1, String input2, AsyncCallback<String> callback1) throws IllegalArgumentException;
	
}
