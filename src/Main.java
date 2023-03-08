import org.w3c.dom.ls.LSOutput;

import javax.naming.PartialResultException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Бобров Ефим Тимофеевич", 4, 26_136);
        employees[1] = new Employee("Гуляев Тихон Константинович", 4, 56_272);
        employees[2] = new Employee("Шашков Савелий Георгьевич", 1, 29_104);
        employees[3] = new Employee("Николаев Остап Пётрович", 3, 56_153);
        employees[4] = new Employee("Шаров Алексей Антонович", 3, 42_883);
        employees[5] = new Employee("Вишнякова Дарина Валентиновна", 1, 96_463);
        employees[6] = new Employee("Калашникова Астра Максовна", 2, 85_946);
        employees[7] = new Employee("Беспалова Роксана Еремеевна", 2, 44_277);
        employees[8] = new Employee("Лазарева Хильда Дмитрьевна", 5, 69_719);
        employees[9] = new Employee("Уварова Дана Евгеньевна", 5, 27_679);

        Employee.toPrint(employees);
        System.out.println();
        Employee.toPrintSum(employees);
        System.out.println();
        Employee.min(employees);
        System.out.println();
        Employee.max(employees);
        System.out.println();
        Employee.middle(employees);
        System.out.println();
        Employee.toPrintFio(employees);
        System.out.println();
        float index = (float) 0.15;
        Employee.indexing(employees, index);
        System.out.println();
        Employee.toPrint(employees);
        System.out.println();
        int department = 5;
        Employee.minSalaryDepartment(employees, department);
        System.out.println();
        Employee.maxSalaryDepartment(employees, department);
        System.out.println();
        Employee.sumSalaryDepartment(employees, department);
        System.out.println();
        Employee.middleSalaryDepartment(employees, department);
        System.out.println();
        Employee.indexingDepartment(employees, index, department);
        System.out.println();
        Employee.toPrint(employees);
        System.out.println();
        Employee.toPrintEmployeetoDepartment(employees, department);
        System.out.println();
        int sum = 50_000;
        Employee.toMinNumber(employees, sum);
        System.out.println();
        Employee.toMaxNumber(employees, sum);
        System.out.println();


    }
}