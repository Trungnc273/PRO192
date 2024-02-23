/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

/**
 *
 * @author TRUNG
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Student st1= new Student("Hai Anh",30);
        Person ps1 = new Person("Trungdz", 18);
        Teacher tc1= new Teacher("Dong", 20, "HE124");
        System.out.println("Student\nName:"+st1.name+"\nAge:"+st1.age);
        System.out.println("");
        System.out.println("Person\nName:"+ps1.name+"\nAge:"+ps1.age);
        System.out.println("");
        System.out.println("Teacher\nName:"+tc1.name+"\nAge:"+tc1.age+"\nID:"+tc1.teacherId);
    }
    
}
