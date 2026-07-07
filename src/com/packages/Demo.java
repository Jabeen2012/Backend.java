package com.packages;
class Demo {

    public int a = 10;      // Accessible everywhere
    private int b = 20;     // Accessible only within this class
    protected int c = 30;   // Accessible within package and subclasses
    int d = 40;             // Default (package-private)

    public void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class Demo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
        System.out.println(obj.a);
        // System.out.println(obj.b); // Error: private member cannot be accessed
    }
}
