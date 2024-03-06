/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author TRUNG
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n=0;
        while(true) 
        {
            try
            {
                System.out.print("Nhap so luong: ");
                n = sc.nextInt();
                if(n<3||n>10)
                {
                    System.out.println("Nhap lai!");
                    continue;
                }
                    
            }
            catch(Exception e)
            {
                System.out.println("Nhap lai!");
            }
            break;
        } 

        PersonManager pm = new PersonManager();
        
        for (int i = 0; i < n; i++) 
        {
            int age=0;
            System.out.println("Nhập thông tin cho đối tượng thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            String name = sc.next();
            sc.nextLine();
            
            System.out.print("Loại đối tượng (Student/Teacher/Staff): ");
            String type = sc.next();
            switch (type.toLowerCase())
            {
                case "student":
                    double gpa=0;
                    while(true)
                    {
                        try
                        {
                            System.out.print("Tuổi: ");
                            age = sc.nextInt();
                            if(age<9||age>30)
                            {
                                System.out.println("Nhap lai!");
                                continue;
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("Nhap lai!");
                        }
                        break;
                    }
                    while(true)
                    {
                        try
                        {
                            System.out.print("GPA: ");
                            gpa = sc.nextDouble();
                            if(gpa<0||gpa>4)
                            {
                                System.out.println("Nhap lai!");
                                continue;
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("Nhap lai!");
                        }
                        break;
                    }
                   
                    pm.addPerson(new Student(name, age, gpa));
                    break;
                case "teacher":
                    double salary=0;
                    while(true)
                    {
                        try
                        {
                            System.out.print("Tuổi: ");
                            age = sc.nextInt();
                            if(age<18||age>80)
                            {
                                System.out.println("Nhap lai!");
                                continue;
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("Nhap lai!");
                        }
                        break;
                    }
                    while(true)
                    {
                        try
                        {
                            System.out.print("Salary: ");
                            salary = sc.nextDouble();
                            if(salary<0)
                            {
                                System.out.println("Nhap lai!");
                                continue;
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("Nhap lai!");
                        }
                        break;
                    }
                    pm.addPerson(new Teacher(name, age, salary));
                    break;
                case "staff":
                    System.out.print("Role: ");
                    String role = sc.next();
                    while(true)
                    {
                        try
                        {
                            System.out.print("Tuổi: ");
                            age = sc.nextInt();
                            if(age<18||age>100)
                            {
                                System.out.println("Nhap lai!");
                                continue;
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("Nhap lai!");
                        }
                        break;
                    }
                    pm.addPerson(new Staff(name, age, role));
                    break;
                default:
                    System.out.println("Nhap lai!");
                    i--;
            }
        }

        System.out.println("Các đối tượng đã nhập:");
        pm.displayPersons();

        System.out.println("Tổng lương của tất cả Teacher: " + pm.getTotalTeacherSalary());
    }
    
}
