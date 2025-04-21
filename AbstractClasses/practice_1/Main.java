import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Company company = new Company();
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 180; i ++) {
            employees.add(new Operator(company, 60_000));
        }
        for (int i = 0; i < 80; i ++) {
            employees.add(new Manager(company, 70_000));
        }
        for (int i = 0; i < 10; i ++) {
            employees.add(new TopManager(company, 90_000));
        }

        company.hereAll(employees);
        System.out.println("Размер компании: " + employees.size());
        System.out.println("Доход компании " + company.getIncome() + " руб.");

        System.out.println();

        System.out.println("Список из 15 самых высоких зарплат в компании:");
        List<Employee> topSalaryStaff = company.getTopSalaryStaff(15);
        for (int i = 0; i < topSalaryStaff.size(); i++) {
            System.out.println(i + 1 + ". " + topSalaryStaff.get(i).getMonthSalary() + " руб.");
        }

        System.out.println();

        System.out.println("Список из 30 самых низких зарплат в компании:");
        List<Employee> lowestSalaryStaff = company.getLowestSalaryStaff(30);
        for (int i = 0; i < lowestSalaryStaff.size(); i++) {
            System.out.println(i + 1 + ". " + lowestSalaryStaff.get(i).getMonthSalary() + " руб.");
        }

        System.out.println();

        employees = company.getEmployees();
        Collections.shuffle(employees);
        for (int i = 0; i < employees.size() / 2; i ++) {
            company.fire(employees.get(i));
        }

        System.out.println("Размер компании: " + company.getEmployees().size());
        System.out.println("Доход компании " + company.getIncome() + " руб.");

        System.out.println();

        System.out.println("Список из 15 самых высоких зарплат в компании:");
        List<Employee> topSalaryStaff2 = company.getTopSalaryStaff(15);
        for (int i = 0; i < topSalaryStaff2.size(); i++) {
            System.out.println(i + 1 + ". " + topSalaryStaff2.get(i).getMonthSalary() + " руб.");
        }

        System.out.println();

        System.out.println("Список из 30 самых низких зарплат в компании:");
        List<Employee> lowestSalaryStaff2 = company.getLowestSalaryStaff(30);
        for (int i = 0; i < lowestSalaryStaff2.size(); i++) {
            System.out.println(i + 1 + ". " + lowestSalaryStaff2.get(i).getMonthSalary() + " руб.");
        }
    }
}
