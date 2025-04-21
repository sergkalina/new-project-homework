public interface Employee extends Comparable<Employee> {


    @Override
    default int compareTo(Employee o) {
        return getMonthSalary() - o.getMonthSalary();
    }

    int getMonthSalary();

}
