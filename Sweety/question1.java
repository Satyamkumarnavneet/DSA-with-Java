package Sweety;

import java.io.IOException;
import java.util.Scanner;

public class question1 {
    static class EmployeeDetails{
        int empcode, exp, salary;
        String name,desg,dept;

        void SetData()
                throws IOException{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Employee's code: ");
            empcode = sc.nextInt(); sc.nextLine();
            System.out.println("Enter the Employee's Name: ");
            name = sc.nextLine();
            System.out.println("Enter the Employee's Designation: ");
            desg = sc.nextLine();
            System.out.println("Enter the Employee's Department: ");
            dept = sc.nextLine();
            System.out.println("Enter the Employee's Experience: ");
            exp = sc.nextInt(); sc.nextLine();
            System.out.println("Enter the Employee's Salary: ");
            salary = sc.nextInt(); sc.nextLine();
            System.out.print('\n');
            sc.close();

        }
        void showinfo() {
            System.out.println("Emp Code: "+empcode);
            System.out.println("Emp Name: "+name);
            System.out.println("Emp Designation: "+desg);
            System.out.println("Emp Department: "+dept);
            System.out.println("Emp Experience: "+exp);
            System.out.println("Emp Salary: "+salary);
            System.out.print('\n');
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        try {
            EmployeeDetails Employee[] = new EmployeeDetails[n];
            System.out.println("Enter the details of the employees: ");
            for(i=0;i<=n;i++) {
                Employee[i] = new EmployeeDetails();
                Employee[i].SetData();
            }
            System.out.println("The Details of the Employee: ");
            for(i=0;i<=n;i++) {
                Employee[i].showinfo();
            }
        }
        catch(IOException e) {
            System.out.println("Please Enter correct details!!");

        }
        sc.close();

    }
}

