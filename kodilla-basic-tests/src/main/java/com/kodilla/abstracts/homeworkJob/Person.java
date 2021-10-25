package com.kodilla.abstracts.homeworkJob;

public class Person {
    private String firstName;
    private int age;
    private String job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Job tester1 = new Tester();
        Job developer1 = new Developer();
        Job driver1 = new Driver();
        JobProcessor processor = new JobProcessor();
        Person tester = new Person("Adam", 27, "Tester");
        Person driver = new Person("Paweł", 22, "Driver");
        Person developer = new Person("Paulina", 29, "Developer");
        System.out.println("The responsibility of " + tester.job + " " + tester.firstName + " is ");
        processor.responsibilities(tester1);
        System.out.println("The responsibility of " + driver.job + " " + driver.firstName + " is ");
        processor.responsibilities(driver1);
        System.out.println("The responsibility of " + developer.job + " " + developer.firstName + " is ");
        processor.responsibilities(developer1);


    }
}




