package org.example;


public class Main {

	public static void main(String[] args) {

//		Server server = new Server(Integer.parseInt(args[0]), Integer.parseInt(args[1])); // for production
		Server server = new Server(9999, 3); // for testing

		server.start();

		server.loop();

		server.stop();
	}

}
