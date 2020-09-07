package org.luanchcode.ExpenseTracker.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Expense extends AbstractEntity{

    @NotNull
    @Size(min=3, max=50)
    private String name;
    private String amount;
    private String income;

    public Expense() {
    }

    // Initialize the id and value fields.
    public Expense(String aName, String anAmount, String anIncome) {
        super();
        this.name = aName;
        this.amount = anAmount;
        this.income = anIncome;
    }

    // Getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return name;
    }
}
