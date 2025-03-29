import java.util.*;

public class Company {
    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
    
    public List<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(employees);
        List<Employee> lowestEmployees = new ArrayList<>();
        if (employees.isEmpty() || count < 0) {
            System.out.println("Список пуст или переданно отрицательное значение");
        } else if (employees.size() < count) {
            System.out.println("Список меньше запрашиваемого значения");
        } else {
            for (int i = 0; i < count; i++){
                lowestEmployees.add(employees.get(i));
            }
        }
        return lowestEmployees;
    }

    public List<Employee> getTopSalaryStaff(int count) {

        Collections.sort(employees);
        Collections.reverse(employees);
        List<Employee> topEmployees = new ArrayList<>();
        if (employees.isEmpty() || count < 0) {
            System.out.println("Список пуст или переданно отрицательное значение");
        } else if (employees.size() < count) {
            System.out.println("Список меньше запрашиваемого значения");
        } else {
            for (int i = employees.size(); employees.size() < i + count; i--){
                topEmployees.add(employees.get(employees.size() - i));
            }
        }
        return topEmployees;
    }


    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hereAll(Collection<Employee> employees) {
        for (Employee employee : employees) {
            hire(employee);
        }
    }

    public void fire(Employee employee){

        employees.remove(employee);
    }

    public int getIncome() {
        int income = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                income += Manager.getSalesCompany();
            }
        }
        return income;
    }
}
