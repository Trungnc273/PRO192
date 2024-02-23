/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author TRUNG
 */
public class Person 
{
    public String name;
    public int age;

    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo()
    {
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
    }
    
}
