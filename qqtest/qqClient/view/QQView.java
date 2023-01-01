package qqtest.qqClient.view;

import qqtest.Utility;
import qqtest.qqClient.service.UserClientService;

public class QQView {
	private boolean loop = true;
	private String key = "";
	UserClientService userClientService = new UserClientService();

	public static void main(String[] args) {
		new QQView().mainMenu();
	}

	private void mainMenu() {
		while (loop) {
			System.out.println("================欢迎登陆QQ网络通讯系统============");
			System.out.println("\t\t 1 登陆系统");
			System.out.println("\t\t 9 退出系统");
			System.out.print("请输入你的选择：");
			key = Utility.readString(1);
			switch (key) {
			case "1":
				System.out.print("请输入用户账号：");
				String userId = Utility.readString(20);
				System.out.print("请输入用户密码：");
				String psd = Utility.readString(20);
				if (userClientService.checkUser(userId, psd)) {
					System.out.println("=================欢迎用户（" + userId + "）登陆成功===================");
					while (loop) {
						System.out.println("\n===========网络通迅系统二级菜单（用户" + userId + ")===============");
						System.out.println("\t\t 1 显示在线用户列表");
						System.out.println("\t\t 2 群发消息");
						System.out.println("\t\t 3 私聊消息");
						System.out.println("\t\t 4 发送文件");
						System.out.println("\t\t 9 退出系统");

						System.out.print("请输入你的选择：");
						key = Utility.readString(1);
						switch (key) {
						case "1":
							System.out.println("显示用户列表");
							break;
						case "2":
							System.out.println("群发消息");
							break;
						case "3":
							System.out.println("私聊消息");
							break;
						case "4":
							System.out.println("发送文件");
							break;
						case "9":
							System.out.println("退出系统");
							loop = false;
							break;
						}
					}
				}else {
					System.out.println("登陆失败");
				}
				break;
			case "9":
				System.out.println("退出系统");
				loop = false;
				break;

			}
		}
	}
}
