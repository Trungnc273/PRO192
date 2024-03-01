/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Person> persons = new ArrayList<>();
        inputPersons(persons);
        displayPersons(persons);
        displayProfessorCount(persons);
    }

    public static void inputPersons(ArrayList<Person> persons) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < numberOfPersons; i++) 
        {
            System.out.println("Enter person type (ta : Teaching Assistant, lec : Lecturer, gs : Professor): ");
            String personType = scanner.nextLine().toLowerCase();
            if (personType.equals("ta")) 
            {
                inputTeachingAssistant(scanner, persons);
            } else if (personType.equals("lec")) 
            {
                inputLecturer(scanner, persons);
            } else if (personType.equals("gs")) 
            {
                inputProfessor(scanner, persons);
            } else 
            {
                System.out.println("Nhap lai");
                i--; 
            }
        }
    }

    public static void inputTeachingAssistant(Scanner scanner, ArrayList<Person> persons) 
    {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        int age;
        while(true)
        {
            try
            {
                System.out.print("Enter age: ");
                age = scanner.nextInt();
                scanner.nextLine();
                if (age < 10 || age > 100) 
                {
                System.out.println("Nhap lai!");
                continue;
                }
                break;
            }
            catch(Exception e)
            {
                System.out.println("Nhap lai!");
                scanner.nextLine();
            }
        }
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        String employeeID = scanner.nextLine();
        int numberOfCourses;
        while(true)
        {
            try
            {
                System.out.print("Enter number of courses: ");
                numberOfCourses = scanner.nextInt();
                scanner.nextLine();
                if (numberOfCourses<0) 
                {
                System.out.println("Nhap lai!");
                continue;
                }
                break;
            }
            catch(Exception e)
            {
                System.out.println("Nhap lai!");
                scanner.nextLine();
            }
        }   
        persons.add(new TeachingAssistant(name, age, gender, employeeID, numberOfCourses));
    }
        
        
   

    public static void inputLecturer(Scanner scanner, ArrayList<Person> persons) 
    {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        int age;
        while(true)
        {
            try
            {
                System.out.print("Enter age: ");
                age = scanner.nextInt();
                scanner.nextLine();
                if (age < 10 || age > 100) 
                {
                System.out.println("Nhap lai!");
                continue;
                }
                break;
            }
            catch(Exception e)
            {
                System.out.println("Nhap lai!");
                scanner.nextLine();
            }
        } 
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        String employeeID = scanner.nextLine();
        int numberOfPublications;
        while(true)
        {
            try
            {
                System.out.print("Enter number of Publications: ");
                numberOfPublications = scanner.nextInt();
                scanner.nextLine();
                if (numberOfPublications<0) 
                {
                System.out.println("Nhap lai!");
                continue;
                }
                break;
            }
            catch(Exception e)
            {
                System.out.println("Nhap lai!");
                scanner.nextLine();
            }
        }
        persons.add(new Lecturer(name, age, gender, employeeID, numberOfPublications));
    }

    public static void inputProfessor(Scanner scanner, ArrayList<Person> persons) 
    {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        int age;
        while(true)
        {
            try
            {
                System.out.print("Enter age: ");
                age = scanner.nextInt();
                scanner.nextLine();
                if (age < 10 || age > 100) 
                {
                System.out.println("Nhap lai!");
                continue;
                }
                break;
            }
            catch(Exception e)
            {
                System.out.println("Nhap lai!");
                scanner.nextLine();
            }
        } 
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        String employeeID = scanner.nextLine();
        int numberOfPublications;
        while(true)
        {
            try
            {
                System.out.print("Enter number of Publications: ");
                numberOfPublications = scanner.nextInt();
                scanner.nextLine();
                if(numberOfPublications<0) 
                {
                System.out.println("Nhap lai!");
                continue;
                }
                break;
            }
            catch(Exception e)
            {
                System.out.println("Nhap lai!");
                scanner.nextLine();
            }
        } 
        int numberOfProjects;
        while(true)
        {
            try
            {
                System.out.print("Enter number Of Projects: ");
                numberOfProjects = scanner.nextInt();
                scanner.nextLine();
                if(numberOfProjects<0) 
                {
                System.out.println("Nhap lai!");
                continue;
                }
                break;
            }
            catch(Exception e)
            {
                System.out.println("Nhap lai!");
                scanner.nextLine();
            }
        }
        persons.add(new Professor(name, age, gender, employeeID, numberOfPublications, numberOfProjects));
    }

    public static void displayPersons(ArrayList<Person> persons) 
    {
        System.out.println("\nDisplaying persons:");
        for (Person person : persons) 
        {
            System.out.println("Name: " + person.name);
            System.out.println("Age: " + person.age);
            System.out.println("Gender: " + person.gender);
            System.out.println("Role: " + person.getRole());
            if (person instanceof TeachingAssistant) 
            {
            TeachingAssistant ta = (TeachingAssistant) person;
            System.out.println("KPI: " + ta.calculateKPI());
        } else if (person instanceof Lecturer) 
        {
            Lecturer lecturer = (Lecturer) person;
            System.out.println("KPI: " + lecturer.calculateKPI());
        } else if (person instanceof Professor) 
        {
            Professor professor = (Professor) person;
            System.out.println("KPI: " + professor.calculateKPI());
        }
            System.out.println("--------------------");
        }
    }

    public static void displayProfessorCount(ArrayList<Person> persons) 
    {
        int professorCount = 0;
        for (Person person : persons) 
        {
            if (person instanceof Professor) 
            {
                professorCount++;
            }
        }
        System.out.println("\nNumber of Professors: " + professorCount);
    }   
}
