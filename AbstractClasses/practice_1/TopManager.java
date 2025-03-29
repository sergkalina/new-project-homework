public class TopManager implements Employee{

    private Company company;
    private int salary;

    public TopManager(Company company, int salary) {
        this.salary = (int) (salary * Math.random() + salary);
        this.company = company;
    }


    @Override
    public int getMonthSalary() {
        if (company.getIncome() > 10_000_000) {
            return (int) (salary * 1.5);
        }
        return salary;
    }
}
