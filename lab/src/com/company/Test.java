package com.company;

public class Test {

    public static void main(String[] args) {

        Car car1 = new Car('P',"AHSGAS462",4);
        Motorcycle motorcycle1 = new Motorcycle('P',"AASEUY7627");


        car1.accelerate();
        car1.applyBreaks();
        car1.reverse();

        System.out.println("---------------------------------------------------------------------------------");

        motorcycle1.accelerate();
        motorcycle1.applyBreaks();

        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("Details of the Car: Fuel type - "+car1.getFuelType()+", Serial number – "+car1.getSerialNumber()+", Number of doors - "+car1.getNumberOfDoors());

        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("Details of the Car: Fuel type - "+motorcycle1.getFuelType()+", Serial number – "+motorcycle1.getSerialNumber());

        System.out.println("---------------------------------------------------------------------------------");

        Car car2 = new Car('P',"AHSGAS462",4);
        Car car3 = new Car('D',"AHSGAS463",4);
        Motorcycle motorcycle2 = new Motorcycle('P',"AASEUY7628");
        Motorcycle motorcycle3 = new Motorcycle('P',"AASEUY7629");
        Motorcycle motorcycle4 = new Motorcycle('P',"AASEUY7630");

        Vehicle []vehicleArray = new Vehicle[]{car2,car3,motorcycle2,motorcycle3,motorcycle4};

        for (Vehicle vehicle : vehicleArray){
            System.out.println("Serial Number : "+vehicle.getSerialNumber());
        }
        System.out.println("---------------------------------------------------------------------------------");

    }
}
