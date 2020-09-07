package org.luanchcode.ExpenseTracker.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Expense extends AbstractEntity{
    @NotNull
    @Size(min=3, max=50)
    private String name;


    public Expense() {
    }

    // Initialize the id and value fields.
    public Expense(String aName, String anEmployer, String someSkill) {
        super();
        this.name = aName;

    }

    // Getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}



