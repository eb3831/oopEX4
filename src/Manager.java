public class Manager extends Employee
{
    public double bonus;
    public double commission;

    public Manager( double baseSalary,double bonus, double commission )
    {
        super( baseSalary );
        this.bonus = bonus;
        this.commission = commission;
    }

    @Override
    public void calculateSalary()
    {
        System.out.println( baseSalary + commission + bonus );
    }

    @Override
    public void getDetails()
    {
        System.out.println("Manager with base salary: " + baseSalary + ", commission: " + commission + ", bonus: " + bonus);
    }

    @Override
    public void performTask()
    {
        System.out.println("managing the team");
    }
}