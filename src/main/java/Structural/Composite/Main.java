package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Organization department1 = new Department("Department 1");
        Organization department2 = new Department("Department 2");
        Organization department3 = new Department("Department 3");
        Organization department4 = new Department("Department 4");

        Organization employee1 = new Employee("Employee 1", 10);
        Organization employee2 = new Employee("Employee 2", 10);
        Organization employee3 = new Employee("Employee 3", 10);
        Organization employee4 = new Employee("Employee 4", 10);
        Organization employee5 = new Employee("Employee 5", 10);
        Organization employee6 = new Employee("Employee 6", 10);

        //department 1
        department1.add(employee1);
        department1.add(department2);
        department1.add(department3);

        //department 2
        department2.add(department4);
        department2.add(employee2);

        //department 3
        department2.add(employee3);

        //department 4
        department3.add(employee4);
        department3.add(employee5);
        department4.add(employee6);

        System.out.println("<organization>");
            department1.execute();
        System.out.println("</organization>");

        department1.getTotalSalary();
    }
}
