package org.example.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Organization {
    public static float totalSalary = 0;

    protected String name;
    protected List<Organization> children;
    protected String indent = "    ";
    protected Organization parent;

    public Organization(String name) {
        children = new ArrayList<Organization>();
        this.name = name;
    }

    public abstract void execute();
    public abstract void calculateSalary();

    public abstract void add(Organization organization);

    public void remove(Organization organization){
        children.remove(organization);
    }

    protected void addTotalSalary(int amount){ totalSalary += amount; }

    protected void getTotalSalary(){
        if(totalSalary <= 0){
            calculateSalary();
        }

        System.out.println("\n\nTotal salary of the organization is " + totalSalary + "€.");
        totalSalary = 0;
    }
}
