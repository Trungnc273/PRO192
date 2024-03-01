/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author TRUNG
 */
public class TeachingAssistant extends Person 
{

    public String employeeID;
    private int numberOfCourses;

    public TeachingAssistant(String name, int age, String gender, String employeeID, int numberOfCourses) 
    {
        super(name, age, gender);
        this.employeeID = employeeID;
        this.numberOfCourses = numberOfCourses;
    }
    
    @Override
    public String getRole() 
    {
        String s="Teaching Assistant";
        return s;
    }

    public double calculateKPI()
    {
        return numberOfCourses*5;
    }
    
}
