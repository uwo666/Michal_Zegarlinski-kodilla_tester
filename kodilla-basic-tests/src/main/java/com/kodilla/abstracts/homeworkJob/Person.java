package com.kodilla.abstracts.homeworkJob;



public class Person {
    private String firstName;
    private int age;
    private Job tester;
    private Job driver;
    private Job developer;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
        this.tester = new Tester();
        this.driver = new Driver();
        this.developer = new Developer();
    }

    public void showResponsibilities() {
        System.out.println(tester.getResponsibilities());
    }

    public void showDriverResponsibilities() {
        System.out.println(driver.getResponsibilities());
    }

    public void showDeveloperResponsibilities() {
        System.out.println(developer.getResponsibilities());
    }


    public static void main(String[] args) {
        Person tester = new Person("Adam", 27);
        Person driver = new Person("Paweł", 22);
        Person developer = new Person("Paulina", 29);
        System.out.println("The responsibility of " + tester.firstName + " is ");
        tester.showResponsibilities();
        System.out.println("The responsibility of " + driver.firstName + " is ");
        driver.showDriverResponsibilities();
        System.out.println("The responsibility of " + developer.firstName + " is ");
        developer.showDeveloperResponsibilities();


        }
    }





