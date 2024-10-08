public class Employee
{
    public double baseSalary;

    public Employee( double baseSalary )
    {
        this.baseSalary = baseSalary;
    }

    public void calculateSalary()
    {
        System.out.println(baseSalary);
    }

    public void getDetails()
    {
        System.out.println("Employee with base salary: " + baseSalary);
    }

    public void performTask()
    {
        System.out.println("Employee performs general tasks.");
    }
}