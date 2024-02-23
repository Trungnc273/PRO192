/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class Person 
{
    private String name;
    private int age;

    public Person() 
    {
    }

    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    
    public String getName() 
    {
        return name.toUpperCase();
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    @Override
    public String toString() 
    {
        return age+"\t"+name;
    }
    
}
