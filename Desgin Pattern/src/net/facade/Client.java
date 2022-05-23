package net.facade;

public class Client {
	public static void main(String[] args) {
		ShopFacede.getInstace().buyByCashWithFreeShipping("abc@123");
		ShopFacede.getInstace().buyByCreditCardWithExpressShipping("def@456", "1122334455");
	}
}
