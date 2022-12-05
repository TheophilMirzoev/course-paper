public class Employee {
    private String name;
    private String middleName;
    private int id;
    private static int count = 396;
    private String lastName;
    private int department;
    private int salary;

    public String getName() {return this.name;}
    public String getMiddleName() {return this.middleName;}
    public String getLastName() {return this.lastName;}
    public int getDepartment() {return this.department;}
    public int getId() {return this.id;}
    public int getSalary() {return this.salary;}
    public void setDepartment(int department) {this.department = department;};
    public void setSalary(int salary) {this.salary = salary;}

    @Override
    public String toString() {
        return "id " + id + " " + name + " " + middleName + " " + lastName + " зарплата " + salary + " департамент " + department;

    }


    public Employee(String lastName, String name, String middleName, int salary, int department) {
      this.name = name;
      this.middleName = middleName;
      this.lastName = lastName;
      this.id = count++;
      this.salary = salary;
      this.department = department;
    }

}
