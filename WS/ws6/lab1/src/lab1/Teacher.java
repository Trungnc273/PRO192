/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author TRUNG
 */
public class Teacher extends Person
{
    public String teacherId;

    public Teacher(String name, int age, String teacherId) 
    {
        super(name, age);
        this.teacherId = teacherId;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("teacherId:"+this.teacherId);
    }
    
}
