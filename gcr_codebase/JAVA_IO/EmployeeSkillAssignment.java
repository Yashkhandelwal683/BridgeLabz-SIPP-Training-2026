import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {

    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId, String name,
             String department, double salary) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSkillAssignment {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Department: ");
        String department = sc.nextLine();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee emp =
                new Employee(id, name, department, salary);

        ObjectOutputStream out =
                new ObjectOutputStream(
                        new FileOutputStream("employee.ser"));

        out.writeObject(emp);
        out.close();

        ObjectInputStream in =
                new ObjectInputStream(
                        new FileInputStream("employee.ser"));

        Employee recovered =
                (Employee) in.readObject();

        System.out.println("\nRecovered Employee:");

        System.out.println(recovered.employeeId);
        System.out.println(recovered.name);
        System.out.println(recovered.department);
        System.out.println(recovered.salary);

        in.close();
    }
}