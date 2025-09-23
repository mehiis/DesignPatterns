package org.example.Structural.Composite;

public class Department extends Organization {
    public Department(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println(indent + "<department name=\"" + name +"\">");

        //dig deeper
        for(Organization child : children){
            child.execute();
        }

        System.out.println(indent + "</department>");
    }

    @Override
    public void calculateSalary() {
        //dig deeper
        for(Organization child : children){
            child.calculateSalary();
        }
    }

    @Override
    public void add(Organization organization) {
        children.add(organization);
        organization.indent += indent;
        organization.parent = this;
    }

}
