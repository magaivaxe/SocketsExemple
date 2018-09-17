package tcp.capitalize.server;

import java.net.ServerSocket;

public class CapitalizeServer {
	// fields
	
	// Constructor
	public CapitalizeServer() {}
	
	//
	public void runServer() throws Exception {
		// Status
		System.out.println("The capitalization serer is running.");
		// Locals
		int clientNumber = 0;
		ServerSocket listener = new ServerSocket(9898);
		try {
			while (true) {
				new Capitalizer(listener.accept(), clientNumber++).start();
			}
		} 
		finally {
			listener.close();
		}
	}
}
