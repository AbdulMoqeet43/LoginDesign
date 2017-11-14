package my.com.server;

import my.com.client.GreetingService;
import my.com.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

	public String greetServer(String username,String pswd) throws IllegalArgumentException {
		
		String result ;
		
		if(username.equalsIgnoreCase("abc")&&pswd.equalsIgnoreCase("123"))
			result = "pass";
		else {
			result = "fail";
		}


		return result;
	}

}
