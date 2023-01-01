package qqtest.qqClient.service;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import qqtest.qqcommon.Message;
import qqtest.qqcommon.MessageType;
import qqtest.qqcommon.User;


public class UserClientService {
	private User u = new User();
	Socket socket;

	public boolean checkUser(String userId, String pwd) {
		boolean b = false;
		u.setUserId(userId);
		u.setPassWd(pwd);

		try {
			socket = new Socket(InetAddress.getLocalHost(), 9991);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(u);
			
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			Message ms = (Message)ois.readObject();
			if (ms.getMesType()==(MessageType.MESSAGE_LOGIN_SUCCEED)) {
				ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
				clientConnectServerThread.start();
				ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServerThread);
				b = true;
			}else {
				socket.close();
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		return false;
	}
}
