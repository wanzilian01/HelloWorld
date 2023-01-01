package qqtest.qqServer.server;

import java.io.ObjectInputStream;
import java.net.Socket;

import qqtest.qqcommon.Message;

public class ServerConnectClientThread extends Thread {
	private Socket socket;
	private String userId;
	
	public ServerConnectClientThread(Socket socket, String userId) {
		this.socket = socket;
		this.userId = userId;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("服务器与客户端"+ userId+"保持通信，读取数据。。。");
			try {
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				Message message = (Message)ois.readObject();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
	}
	
	
}
