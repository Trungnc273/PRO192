/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author TRUNG
 */
public class Lecturer extends Person
{
    public String employeeID;
    private int numberOfPublications;

    public Lecturer(String name, int age, String gender, String employeeID, int numberOfPublications) 
    {
        super(name, age, gender);
        this.employeeID = employeeID;
        this.numberOfPublications = numberOfPublications;
    }
    
    @Override
    public String getRole() 
    {
        String s=" Lecturer ";
        return s;
    }

    public double calculateKPI()
    {
        return numberOfPublications*7;
    }
    
}
