package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKFINANCIALDETAILS")
public class TaskFinancialDetails {
    private int id;
    private double price;
    private boolean paid;
    private Task task;

    public TaskFinancialDetails() {
    }

    public TaskFinancialDetails(double price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "PRICE")
    public double getPrice() {
        return price;
    }

    @Column(name = "PAID")
    public boolean getPaid() {
        return paid;
    }

    @OneToOne(
            targetEntity = Task.class,
            mappedBy = "taskFinancialDetails",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    public Task getTask() {
        return task;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
