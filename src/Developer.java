public class Developer extends Employee
{
    public double bonus;

    public Developer( double baseSalary, double bonus )
    {
        super(baseSalary);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary()
    {
        System.out.println( baseSalary + bonus );
    }

    @Override
    public void getDetails()
    {
        System.out.println("Developer with base salary: " + baseSalary + ", bonus: " + bonus);
    }

    @Override
    public void performTask()
    {
        System.out.println("writing code");
    }
}