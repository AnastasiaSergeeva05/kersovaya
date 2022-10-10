
public class Employee {

    private String fullName;
    private int workingDepartment;
    private int salaryWorks;

    private int id;
    private static int count;

    public Employee(String fullName, int workingDepartment, int salaryWorks) {
        this.fullName = fullName;
        this.workingDepartment = workingDepartment;
        this.salaryWorks = salaryWorks;
        this.id = count++;

    }

    public String getFullName() {
        return fullName;
    }

    public int getWorkingDepartment() {
        return workingDepartment;
    }

    public int getSalaryWorks() {
        return salaryWorks;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setWorkingDepartment(int workingDepartment) {
        this.workingDepartment = workingDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", workingDepartment=" + workingDepartment +
                ", salaryWorks=" + salaryWorks +
                ", id=" + id +
                '}';
    }
}