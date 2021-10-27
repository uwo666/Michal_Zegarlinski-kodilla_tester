package com.kodilla.abstracts.homeworkJob;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public Job getJob() {
        System.out.println(job.getResponsibilities());
        return job;
    }

    public static void main(String[] args) {
        Job tester1 = new Tester();
        Job developer1 = new Developer();
        Job driver1 = new Driver();
        JobProcessor processor = new JobProcessor();
        Person tester = new Person("Adam", 27, tester1);
        Person driver = new Person("Paweł", 22, driver1);
        Person developer = new Person("Paulina", 29, developer1);
        System.out.println("The responsibility of " + tester + " " + tester.firstName + " is ");

        System.out.println("The responsibility of " + driver.job + " " + driver.firstName + " is ");
        processor.responsibilities(driver1);
        System.out.println("The responsibility of " + developer.job + " " + developer.firstName + " is ");
        processor.responsibilities(developer1);


    }
}




