/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author TRUNG
 */
final public class Professor extends Lecturer
{
    public static int countProfessors=0;
    private int numberOfProjects;

    public Professor(String name, int age, String gender, String employeeID, int numberOfPublications, int numberOfProjects) 
    {
        super(name, age, gender, employeeID, numberOfPublications);
        this.numberOfProjects = numberOfProjects;
        countProfessors++;
    }
    @Override
    public String getRole()
    {
        String s="Professor";
        return s;
    }
    @Override
    public double calculateKPI()
    {
        return super.calculateKPI()+numberOfProjects*10;
    }
}
