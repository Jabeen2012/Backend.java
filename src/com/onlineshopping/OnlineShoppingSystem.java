package com.onlineshopping;
import java.util.*;
import java.util.function.*;
//Abstract Class 
abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayRole();
}
	

//Inheritance
class Customer extends Person {

 public Customer(String name) {
     super(name);
 }


 
 public void displayRole() {
     System.out.println("Role: Customer");
 }
}
//Encapsulation
class Order {
 private int orderId;
 private Customer customer;
 private double amount;

 public Order(int orderId, Customer customer, double amount) {
     this.orderId = orderId;
     this.customer = customer;
     this.amount = amount;
 }

 public int getOrderId() {
     return orderId;
 }

 public Customer getCustomer() {
     return customer;
 }

 public double getAmount() {
     return amount;
 }
}
//exception
//rasing the custom Exception
class InvalidOrderException extends Exception {
 public InvalidOrderException(String message) {
     super(message);
 }
}

public class OnlineShoppingSystem {

 public static Order placeOrder(int id, String customerName, double amount)
         throws InvalidOrderException {

     if (customerName == null || customerName.trim().isEmpty()) {
         throw new InvalidOrderException("Customer name cannot be empty");
     }

     if (amount <= 0) {
         throw new InvalidOrderException("Order amount must be greater than 500");
     }

     Customer customer = new Customer(customerName);
     return new Order(id, customer, amount);
 }
 public static void main(String[] args) {

     List<Order> orders = new ArrayList<>();

     try {
         orders.add(placeOrder(01, "jabeen", 900));
         orders.add(placeOrder(02, "Navya", 800));
         orders.add(placeOrder(03, "nandhu", 1500));
         orders.add(placeOrder(04, "Nafesa", 1200)); // Invalid
     }
     catch (InvalidOrderException e) {
         System.out.println("Exception: " + e.getMessage());
     }

     try {
         orders.add(placeOrder(05, "Anjali", -500)); // Invalid
     }
     catch (InvalidOrderException e) {
         System.out.println("Exception: " + e.getMessage());
     }
     Predicate<Order> highValueOrder =
             order -> order.getAmount() > 1000;
          // Function
             Function<Order, String> orderSummary =
                     order -> "Order ID: " + order.getOrderId()
                             + ", Customer: " + order.getCustomer().getName()
                             + ", Amount: ₹" + order.getAmount();
                     // Consumer
           Consumer<Order> displayOrder =order -> System.out.println(
            "Order ID: " + order.getOrderId()
                                     + " | Customer: " + order.getCustomer().getName()
                                     + " | Amount: ₹" + order.getAmount());

                     System.out.println("\nAll Valid Orders:");
                     orders.forEach(displayOrder);
                     System.out.println("\nOrders Amount Greater Than 1000:");
                     orders.stream()
                             .filter(highValueOrder)
                             .forEach(displayOrder);

                     System.out.println("\nOrder Summaries:");
                     orders.stream().map(orderSummary)
                             .forEach(System.out::println);

                     // Polymorphism
                     System.out.println("\n thank you ......:");
                     Person p = new Customer("chinni");
                     p.displayRole();
                 }
             }
