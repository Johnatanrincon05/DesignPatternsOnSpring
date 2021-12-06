package co.edu.poli.facade.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
	private static int choice;

	public static void main(String args[]) throws NumberFormatException, IOException {
		
			HashMap<Integer, MobileShop> a = new HashMap<Integer, MobileShop>(); 
			a.put(1, new Iphone()); 
			a.put(2, new Samsung()); 
			a.put(3, new Blackberry()); 
		
		do {
			System.out.print("========= Mobile Shop ============ \n");
			System.out.print("            1. IPHONE.              \n");
			System.out.print("            2. SAMSUNG.              \n");
			System.out.print("            3. BLACKBERRY.            \n");
			System.out.print("            4. Exit.                     \n");
			System.out.print("Enter your choice: ");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			
			ShopKeeper sk = new ShopKeeper(a);

			switch (choice) {
			case 1: {
				sk.getMethods(1);
			}
				break;
			case 2: {
				sk.getMethods(2);
			}
				break;
			case 3: {
				sk.getMethods(3);
			}
				break;
			default: {
				System.out.println("Nothing You purchased");
			}
				return;
			}

		} while (choice != 4);
	}
}
