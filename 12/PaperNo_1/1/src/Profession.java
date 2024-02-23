/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Profession 
{
    private String name;
    private int age;
    private String major;

    public Profession() 
    {
        this.name="Nguyen Van A";
        this.age=20;
        this.major="Student.";
    }

    public Profession(String name, int age, String major) 
    {
        this.name = name;
        if(age>=20)
            this.age = age;
        else
            this.age=20;
        this.major = major;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        if(name.equalsIgnoreCase("N/A"))
            this.name="No name";
        else
            this.name = name;
    }

    @Override
    public String toString() 
    {
        return name+"-"+age+"-"+major;
    }
    
}
