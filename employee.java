// Base Class
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Derived Class: Manager
class Manager extends Employee {
    private double incentive;

    public Manager(String name, double salary, double incentive) {
        super(name, salary); // Call to parent class constructor
        this.incentive = incentive;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to parent method
        System.out.println("Incentive: $" + incentive);
    }
}

// Derived Class: Developer
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary); // Call to parent class constructor
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to parent method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Main Program
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice Johnson", 80000, 10000);
        Developer developer = new Developer("Bob Smith", 70000, "Java");

        System.out.println("=== Manager Details ===");
        manager.displayDetails();

        System.out.println("\n=== Developer Details ===");
        developer.displayDetails();
    }
}
