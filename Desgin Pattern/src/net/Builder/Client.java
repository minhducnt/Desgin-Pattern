package net.Builder;

import net.Builder.concretebuilder.FastFoodOrderBuilder;
import net.Builder.nested.BankAccount;
import net.Builder.order.Order;
import net.Builder.type.BreadType;
import net.Builder.type.OrderType;

public class Client {
	public static void main(String[] args) {
		Order order = new FastFoodOrderBuilder().orderBread(BreadType.BEEF).orderType(OrderType.TAKE_AWAY).build();
		System.out.println(order.toString());
		
		BankAccount bankAccount= new BankAccount.BankAccountBuilder("Cong Danh", "1234").withEmail("abc@1234").build();
		System.out.println(bankAccount.toString());
	}
}
