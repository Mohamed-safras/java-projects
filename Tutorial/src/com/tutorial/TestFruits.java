package com.tutorial;

public class TestFruits {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        fruit1.setName("Apple");
        fruit1.setUnitPrice(52.45);

        System.out.println("Fruit name is "+fruit1.getName()+".");
        System.out.println("Unit price is "+fruit1.getUnitPrice());
    }
}
