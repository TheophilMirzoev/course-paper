public class EmployeeMethods {
    public Employee[] employee  = new Employee[10];
    public int countingAllSalaries(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
          sum += employee[i].getSalary();
        }
        return sum;
    }
    public static int getMin(Employee[] employee){
       int min = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min){
                min = employee[i].getSalary();
            }
        } return min;
    }
    public static int getMax(Employee[] employee){
        int max = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > max){
                max = employee[i].getSalary();
            }
        } return max;
    }
    public int countingAverageSalary(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        int average = sum / employee.length;
        return average;
    }
    public static String outputOfValues(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getLastName() + " " + employee[i].getName() + " " + employee[i].getMiddleName());
        }

        return null;
    }


}







