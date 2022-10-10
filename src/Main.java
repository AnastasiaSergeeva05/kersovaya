import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Ivanov Ivan Petrovich", 1, 10_985);
        employees[1] = new Employee("Sidorov Anrei Petrovich", 2, 20_784);
        employees[2] = new Employee("Kovalenko Michail Nokolevich", 3, 30_589);
        employees[3] = new Employee("Rakov Michail Aleksandrovich", 4, 29_451);
        employees[4] = new Employee("Petrov Dmitri Sergeevich", 2, 38_456);
        employees[5] = new Employee("Romanenko Dmitri Alekseevich", 1, 32_556);
        employees[6] = new Employee("Lobanov Andrei Sergeevich", 4, 36_457);
        employees[7] = new Employee("Lavorchyk Dmitri Sergeevich", 3, 38_876);
        employees[8] = new Employee("Ptichkin Dmitri Nokolaevich", 5, 37_126);
        employees[9] = new Employee("Rebonyrby Dmitri Nokolaevich", 5, 33_125);

        getAllEmployees(employees);
        System.out.println("Минимальная зарплата: " + getEmployeeWithMinSalary(employees).getFullName());
        System.out.println("Максимальная зарплата: "+getEmployeeWithMaxSalary(employees).getFullName());
        System.out.println("Средняя зарплата: "+getAverageSalary(employees));
        System.out.println("Сумма затрат: "+getSumSalary(employees));
        getAllFullNameEmployees(employees);

    }

    static void getAllEmployees(Employee[] employees) {
        System.out.println("Список: " + Arrays.toString(employees));
    }


    static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee result = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalaryWorks() < result.getSalaryWorks()) result = employees[i];
        }
        return result;

    }

    static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee result = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalaryWorks() > result.getSalaryWorks()) result = employees[i];
        }
        return result;

    }

    static int getSumSalary(Employee[] employees) {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            result += employees[i].getSalaryWorks() ;
        }
        return result;

    }

    static double getAverageSalary(Employee[] employees) {
        return (double) getSumSalary(employees) / employees.length;
    }

    static void getAllFullNameEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());

        }


    }
}