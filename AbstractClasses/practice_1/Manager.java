public class Manager implements Employee {

    private Company company;
    private int salary;
//    private  int numberOfEmployees;
    private static final double MAX_SALES = 140_000.0;
    private static final double MIN_SALES = 115_000.0;


    public Manager(Company company, int salary) {
        this.salary = (int) (salary * Math.random() + salary);
        this.company = company;
    }

    public static int getSalesCompany(){
        double scale = Math.pow(10, 2);
        int sales = (int) (Math.round((Math.random() * ((MAX_SALES - MIN_SALES)) + MIN_SALES) * scale) / scale);
        return sales;
    }

    @Override
    public int getMonthSalary() {
        return (int) (salary + getSalesCompany() * 0.05); //бонус в виде 5% от заработанных для компании денег
    }
}
