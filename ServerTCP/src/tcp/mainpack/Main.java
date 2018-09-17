package tcp.mainpack;

import tcp.capitalize.server.CapitalizeServer;

public class Main {

	public static void main(String[] args) {
		//
		CapitalizeServer cvs = new CapitalizeServer();
		try {
			cvs.runServer();
		} catch (Exception e) {
			//
			e.printStackTrace();
		}
	}

}
