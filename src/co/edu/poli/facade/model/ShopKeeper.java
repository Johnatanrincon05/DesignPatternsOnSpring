package co.edu.poli.facade.model;

import java.util.HashMap;

public class ShopKeeper {

	private HashMap<Integer, MobileShop> arrayMobile;

	public ShopKeeper(HashMap<Integer, MobileShop> a) {
		arrayMobile = a;
	}

	public void getMethods(int serial) {
		arrayMobile.get(serial).modelNo();
		arrayMobile.get(serial).price();
	}

}