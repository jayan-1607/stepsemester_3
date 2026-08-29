public class Employee {
    private String empId;
    private double salary;

    public Employee(String empId, double salary) {
        this.empId = empId;   // 'this' resolves the clash in the constructor
        this.salary = salary;
    }

    // Requirement: method signature must be void raiseSalary(double salary)
    public void raiseSalary(double salary) {
        this.salary += salary; // 'this' ensures the instance variable is updated, not the parameter
    }

    public void printFinalSalary() {
        System.out.println(empId + " | Final Salary: Rs " + salary);
    }

    public static void main(String[] args) {
        String[] ids = {"E-101", "E-102", "E-103", "E-104"};
        double[] startingSalaries = {40000, 55000, 62000, 48000};
        double bonus = 5000;

        // Process in a single pass
        for (int i = 0; i < ids.length; i++) {
            Employee emp = new Employee(ids[i], startingSalaries[i]);
            emp.raiseSalary(bonus);
            emp.printFinalSalary();
        }
    }
}