/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author TRUNG
 */
public class Fresher extends Staff implements KPI
{
    private double quality; 
    private boolean deadline; 

    public Fresher(String employeeID, String cardID, String name, String skill, double quality, boolean deadline) 
    {
        super(employeeID, cardID, name, skill);
        this.quality = quality;
        this.deadline = deadline;
    }
    
    @Override
    public String getLevel() 
    {
        return "Fresher";
    }

    @Override
    public double kpi() 
    {
        if(deadline)
            return quality*60+20;
        else
            return quality*60;
    }

    public boolean isDeadline() 
    {
        return deadline;
    }

    public double getQuality() 
    {
        return quality;
    }
    
    
}
