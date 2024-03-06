/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author TRUNG
 */
public class PersonManager 
{
    private ArrayList<Person> pls;

    public PersonManager() 
    {
        this.pls = new ArrayList<>();
    }
    
    public void addPerson(Person person) throws IllegalArgumentException 
    {
        if (person == null) {
            throw new IllegalArgumentException("Khong hop le");
        }
        pls.add(person);
    }

    public void displayPersons() {
        for (Person person : pls) {
            if (person instanceof Student) 
            {
                Student student = (Student) person;
                System.out.println("Name:"+student.getName());
                System.out.println("Age:"+student.getAge());
                System.out.println("GPA:"+student.getGpa());
            } 
            else if (person instanceof Teacher) 
            {
                Teacher teacher = (Teacher) person;
                System.out.println("Name:"+teacher.getName());
                System.out.println("Age:"+teacher.getAge());
                System.out.println("Salary:"+teacher.getSalary());
            } 
            else if (person instanceof Staff) 
            {
                Staff staff = (Staff) person;
                System.out.println("Name:"+staff.getName());
                System.out.println("Age:"+staff.getAge());
                System.out.println("Role:"+staff.getRole());
            }
        }
    }

    public double getTotalTeacherSalary() 
    {
        double totalSalary = 0;
        for (Person person : pls) {
            if (person instanceof Teacher) 
            {
                Teacher teacher = (Teacher) person;
                totalSalary += teacher.getSalary();
            }
        }
        return totalSalary;
    }
}
