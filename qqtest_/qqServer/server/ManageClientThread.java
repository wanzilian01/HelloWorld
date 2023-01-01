package qqtest.qqServer.server;

import java.awt.Taskbar.State;
import java.util.HashMap;

public class ManageClientThread {
	private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();
	 public static void addClientThread(String userId, ServerConnectClientThread serverConnectClientThread) {
		 hm.put(userId, serverConnectClientThread);
	}
	 
	 public static ServerConnectClientThread getServerConnectClientThread(String userId) {
		return hm.get(userId);
	 }
}
