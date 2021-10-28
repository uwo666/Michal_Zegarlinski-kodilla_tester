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



    public void showResponsibilities() {
        System.out.println(job.getResponsibilities());
    }




    public static void main(String[] args) {
        Person tester = new Person("Adam", 27, new Tester());
        System.out.println("The responsibility of " + tester.firstName + " is ");
        tester.showResponsibilities();



        }
    }





