package client;

import java.util.Scanner;
import presentation.UserInterface;
import presentation.UserInterfaceImpl;

public class MyClient {

	public static void main(String[] args) {
		UserInterfaceImpl ui=new UserInterfaceImpl();
		Scanner sc=new Scanner(System.in);
		while(true){
			ui.showMenu();
			System.out.println("Enter choice : ");
			int choice=sc.nextInt();
			ui.perform(choice);
		}

	}

}
