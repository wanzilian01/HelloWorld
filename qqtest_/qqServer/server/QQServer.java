package qqtest.qqServer.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import qqtest.qqcommon.Message;
import qqtest.qqcommon.MessageType;
import qqtest.qqcommon.User;

public class QQServer {
	private ServerSocket ss = null;

	public QQServer() {
		System.out.println("服务器在9991端口监听。。。");
		try {
			ss = new ServerSocket(9991);
			while (true) {
				Socket socket = ss.accept();
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				User u = (User)ois.readObject();
				Message message = new Message();
				
				if (u.getUserId().equals("100") && u.getPassWd().equals("123456")) {
					message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
					ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
					oos.writeObject(message);
					ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(socket,u.getUserId());
					serverConnectClientThread.start();
					ManageClientThread.addClientThread(u.getUserId(), serverConnectClientThread);
				}else {
					message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
					ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
					oos.writeObject(message);
					socket.close();
				}
			}

		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			ss.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
