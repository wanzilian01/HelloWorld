package qqtest.qqClient.service;

import java.io.ObjectInputStream;
import java.net.Socket;

import qqtest.qqcommon.Message;

public class ClientConnectServerThread extends Thread {
	private Socket socket;

	public ClientConnectServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("客户端线程，等待读取服务器发送的消息");
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				Message message = (Message) ois.readObject();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

		}

	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

}
