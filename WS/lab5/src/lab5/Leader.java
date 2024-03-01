/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author TRUNG
 */
final public class Leader extends Junior_Senior
{
    public static int countLeader =0; 
    private double project;

    public Leader(String employeeID, String cardID, String name, String skill, double quality, boolean deadline, int exp_year, double project) 
    {
        super(employeeID, cardID, name, skill, quality, deadline, exp_year);
        this.project = project;
        countLeader++;
    }
    
    @Override
    public String getLevel() 
    {
        return "Leader";
    }
    
    @Override
    public double kpi() 
    {
        if(super.isDeadline())
            return super.getQuality()*60+20;
        else
            return super.getQuality()*60-30+project*3;
    }

    public double getProject() 
    {
        return project;
    }
    
    
}
