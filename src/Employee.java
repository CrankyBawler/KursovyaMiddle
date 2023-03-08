public class Employee {
    private String fio;
    private int department;
    private int salary;
    private static int idCount = 1;
    private int id;

    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = idCount;
        idCount++;
    }

    public String getFio() {

        return this.fio;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setDepartment(int fio) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return id + ". " + fio + ". Отдел: " + department + ". Заработная плата: " + salary + " руб.";
    }

    public static Employee[] toPrint(Employee[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        return a;
    }

    public static Employee[] toPrintFio(Employee[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getFio());
        }
        return a;
    }


    public static int sum(Employee[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].getSalary();
            sum = sum + a;
        }
        return sum;
    }

    public static int toPrintSum(Employee[] arr) {
        Employee.sum(arr);
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + Employee.sum(arr) + " рублей.");
        return Employee.sum(arr);
    }

    public static int min(Employee[] arr) {
        int a = 200_000;
        String b = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() <= a) {
                a = arr[i].getSalary();
                b = arr[i].getFio();
            }
        }
        System.out.println("Минимальная заработная плата составляет " + a + " рублей, у сторудника " + b);
        return a;
    }

    public static int max(Employee[] arr) {
        int a = 0;
        String b = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() >= a) {
                a = arr[i].getSalary();
                b = arr[i].getFio();
            }
        }
        System.out.println("Максимальная заработная плата составляет " + a + " рублей, у сторудника " + b);
        return a;
    }

    public static float middle(Employee[] arr) {
        Employee.sum(arr);
        int a = arr.length;
        float middle = (float) Employee.sum(arr) / a;
        System.out.println("Средняя сумма заработной платы составила " + middle);
        return middle;
    }

    public static float indexing(Employee[] arr, float ind) {
        float a = (float) 0;
        for (int i = 0; i < arr.length; i++) {
            a = arr[i].getSalary() * ind + arr[i].getSalary();
            arr[i].setSalary((int) a);
        }
        return a;
    }

    public static int minSalaryDepartment(Employee[] arr, int department) {
        int a = 200_000;
        String b = null;
        for (int i = 0; i < arr.length; i++) {
            if (department == arr[i].getDepartment()) {
                if (arr[i].getSalary() <= a) {
                    a = arr[i].getSalary();
                    b = arr[i].getFio();
                }
            }
        }
        System.out.println("Минимальная заработная плата  в отделе " + department + " составляет " + a + " рублей, у сторудника " + b);
        return a;
    }
    public static int maxSalaryDepartment(Employee[] arr, int department) {
        int a = 0;
        String b = null;
        for (int i = 0; i < arr.length; i++) {
            if (department == arr[i].getDepartment()) {
                if (arr[i].getSalary() >= a) {
                    a = arr[i].getSalary();
                    b = arr[i].getFio();
                }
            }
        }
        System.out.println("Максимальная заработная плата  в отделе " + department + " составляет " + a + " рублей, у сторудника " + b);
        return a;
    }
    public static int sumSalaryDepartment(Employee[] arr, int department) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (department == arr[i].getDepartment()) {
                int a = arr[i].getSalary();
                    sum = sum + a;
             }
        }
        System.out.println("Сумма заработной платы  в отделе " + department + " составляет " + sum + " рублей.");
        return sum;
    }
    public static float middleSalaryDepartment(Employee[] arr, int department) {
        float middle = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (0 != arr[i].getSalary()) {
            if (department == arr[i].getDepartment()) {
                    count++;
                    int a = arr[i].getSalary();
                    sum = sum + a;
                    middle = (float) sum / count;
                }
            }
                    }
                System.out.println("Средняя сумма заработной платы по отделу " + department + " составила " + middle + " рублей.");
        return middle;
    }
    public static float indexingDepartment(Employee[] arr, float ind, int department) {
        float a = (float) 0;
        for (int i = 0; i < arr.length; i++) {
            if (department == arr[i].getDepartment()) {
                a = arr[i].getSalary() * ind + arr[i].getSalary();
                arr[i].setSalary((int) a);
            }
        }
        return a;
    }
}