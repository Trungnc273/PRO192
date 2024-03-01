/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author TRUNG
 */
public class Junior_Senior extends Fresher implements KPI
{
    private int exp_year; 

    public Junior_Senior(String employeeID, String cardID, String name, String skill, double quality, boolean deadline, int exp_year) 
    {
        super(employeeID, cardID, name, skill, quality, deadline);
        this.exp_year = exp_year;
    }

    
    
    @Override
    public String getLevel() 
    {
        return " Junior/Senior";
    }

    @Override
    public double kpi() 
    {
        if(super.isDeadline())
            return super.getQuality()*90+15;
        else
            return super.getQuality()*90-10;
    }

    public int getExp_year() 
    {
        return exp_year;
    }
    
}
