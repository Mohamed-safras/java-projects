package com.company;

public class Employee {
    private int id;
    private String name;
    private double salary;
    Dependent father;
    public Employee(int id, String name, double salary,String dName,int dAge) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        father = new Dependent(dName,dAge);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Dependent getFather() {
        return father;
    }

    public void setFather(Dependent father) {
        this.father = father;
    }

    public void display(){
        System.out.println(this.getName()+"-"+father.dep());
    }

}
