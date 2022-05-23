package net.Builder.builder;

import net.Builder.order.Order;
import net.Builder.type.BreadType;
import net.Builder.type.OrderType;
import net.Builder.type.SauceType;
import net.Builder.type.VegetableType;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);
    
    OrderBuilder orderBread(BreadType breadType);
 
    OrderBuilder orderSauce(SauceType sauceType);
 
    OrderBuilder orderVegetable(VegetableType vegetableType);
 
    Order build();
}
