package net.Builder.concretebuilder;

import net.Builder.builder.OrderBuilder;
import net.Builder.order.Order;
import net.Builder.type.BreadType;
import net.Builder.type.OrderType;
import net.Builder.type.SauceType;
import net.Builder.type.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder{
	
	private OrderType orderType;
	private BreadType breadType;
	private SauceType sauceType;
	private VegetableType vegetableType;

	@Override
	public OrderBuilder orderType(OrderType orderType) {
		// TODO Auto-generated method stub
		this.orderType = orderType;
		return this;
	}

	@Override
	public OrderBuilder orderBread(BreadType breadType) {
		// TODO Auto-generated method stub
		this.breadType =breadType;
		return this;
		
	}

	@Override
	public OrderBuilder orderSauce(SauceType sauceType) {
		// TODO Auto-generated method stub
		this.sauceType = sauceType;
		return this;
		
	}

	@Override
	public OrderBuilder orderVegetable(VegetableType vegetableType) {
		// TODO Auto-generated method stub
		this.vegetableType = vegetableType;
		return this;
	}

	@Override
	public Order build() {
		// TODO Auto-generated method stub
		return new Order(orderType, breadType, sauceType, vegetableType);
	}

}
