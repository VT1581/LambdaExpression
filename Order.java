package com.cg.degreed.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2)write an application  using lambda expressions to print Orders having 2 criteria implemented :1)order price more than 10000 2)order status is Accpeted or Completed
public class Order {

    private String orderId;
    private String product;
    private double price;
    private String status;

   

    public Order(String orderId, String product, double price, String status) {
		super();
		this.orderId = orderId;
		this.product = product;
		this.price = price;
		this.status = status;
	}

	public String getOrderId() {
        return orderId;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public String getProduct() {
        return product;
    }

    @Override
	public String toString() {
		return "Order [orderId=" + orderId + ", product=" + product + ", price=" + price + ", status=" + status + "]";
	}

	public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("1", "Soap", 800, "Accepted"),
                new Order("2", "shampoos", 5000, "Pending"),
                new Order("3", "HimalayaSoap", 10000, "Completed"),
                new Order("4", "Coconut oil", 1500, "Accepted")
        );


        
       orders.stream()
                .filter(order -> order.getPrice() > 1000.0 && (order.getStatus().equals("Accepted") || order.getStatus().equals("Completed")))
                .forEach(System.out::println);;


    }
}

	


