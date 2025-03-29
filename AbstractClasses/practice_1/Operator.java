public class Operator implements Employee {

    private Company company;
    private int salary;
    public Operator(Company company, int salary) {
        this.salary = (int) (salary * Math.random() + salary);
        this.company = company;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
