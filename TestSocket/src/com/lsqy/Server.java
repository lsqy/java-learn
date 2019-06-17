package com.lsqy;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(3000);
			while (true) {
				Socket s = ss.accept();
				PrintStream ps = new PrintStream(s.getOutputStream());
				ps.println("服务端连接已建立");
				ps.close();
				s.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
