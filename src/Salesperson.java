public class Salesperson extends Employee
{
    public double commission;

    public Salesperson(double baseSalary, double commission)
    {
        super(baseSalary);
        this.commission = commission;
    }

    @Override
    public void calculateSalary()
    {
        System.out.println(baseSalary + commission);
    }

    @Override
    public void getDetails()
    {
        System.out.println("Salesperson with base salary: " + baseSalary + ", commission: " + commission);
    }

    @Override
    public void performTask()
    {
        System.out.println("making sales calls");
    }
}