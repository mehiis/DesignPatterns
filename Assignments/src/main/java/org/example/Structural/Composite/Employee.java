package org.example.Structural.Composite;

public class Employee extends Organization {
    public int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void execute() {
        String currentIndent = this.parent.indent + "    ";

        System.out.println(currentIndent + "<employee>");
        System.out.println(currentIndent +  "    <name>" + name + "</name>");
        System.out.println(currentIndent + "    <salary>" + salary + "</salary>");
        System.out.println(currentIndent + "</employee>");
    }

    @Override
    public void calculateSalary() {
        addTotalSalary(salary);
    }

    @Override
    public void add(Organization organization) { throw new UnsupportedOperationException("You can't add objects inside an employee object."); }
}
