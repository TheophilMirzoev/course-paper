import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        EmployeeMethods employee1 = new EmployeeMethods();

        Employee[] employee  = new Employee[10];
        employee[0] = new Employee("Жуков", "Бронислав", "Робертович", 30000, 1);
        employee[1] = new Employee("Шестаков", "Владислав", "Тимурович", 35000, 2);
        employee[2] = new Employee("Одинцов", "Авраам", "Авдеевич", 32000, 3);
        employee[3] = new Employee("Емельянов", "Захар", "Геннадьевич", 33000, 4);
        employee[4] = new Employee("Ефремов", "Май", "Даниилович", 38000, 5);
        employee[5] = new Employee("Шубин", "Мстислав", "Викторович", 44000, 1);
        employee[6] = new Employee("Молчанов", "Исак", "Георгиевич", 56000, 2);
        employee[7] = new Employee("Сидоров", "Макар", "Пётрович", 48000, 1);
        employee[8] = new Employee("Юдин", "Мартын", "Донатович", 47000, 4);
        employee[9] = new Employee("Маслов", "Ростислав", "Станиславович", 54000, 2);
        //System.out.print(Arrays.toString(employee));

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
        System.out.println(employee1.countingAllSalaries(employee));
        System.out.println(employee1.getMin(employee));
        System.out.println(employee1.getMax(employee));
        System.out.println(employee1.countingAverageSalary(employee));
        employee1.outputOfValues(employee);


        int[] Array = new int[5];
        Array[0] = 0;
        Array[1] = 1;
        Array[2] = 2;
        Array[3] = 3;
        Array[4] = 4;

        int[] Array2 = new int[Array.length];


        for (int i = Array.length-1; i > 0;) {
            for (int j = 0; j < Array.length; j++) {
                 Array2[j] = Array[i];
                 i--;
            }
        }

        for (int i = 0; i < Array2.length; i++) {
            System.out.println(Array2[i]);
        }











    }


}
