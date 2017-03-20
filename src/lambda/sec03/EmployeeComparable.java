package lambda.sec03;

public class EmployeeComparable implements Comparable<EmployeeComparable> {
    private String name;
    private double salary;
        
    public EmployeeComparable(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public EmployeeComparable(double salary) {
        this.name = "";
        this.salary = salary;
    }        
    
    public EmployeeComparable(String name) {
        // salary automatically set to zero
        this.name = name;
    } 
    
    public EmployeeComparable() {
        this("", 0);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;    
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public int compareTo(EmployeeComparable other) {
        return Double.compare(salary, other.salary);
    }

    @Override
    public String toString() {
        return "EmployeeComparable{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
