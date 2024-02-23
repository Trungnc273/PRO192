/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hoan2
 */
public class ElectricMotor 
{

    /**
     * @param args the command line arguments
     */
    private String name;
    private int voltage,current;

    public ElectricMotor() 
    {
    }

    public ElectricMotor(String name, int voltage, int current) 
    {
        this.name = name;
        this.voltage = voltage;
        this.current = current;
    }

    public String getName() 
    {
        return name;
    }
    
    public int getPower()
    {
        return voltage*current;
    }

    public void setVoltage(int voltage) 
    {
        if(voltage>=110&&voltage<=220)
            this.voltage = voltage;
        else
            System.out.println("Invalid value");
    }

    public void setCurrent(int current) 
    {
        if(current>0)
            this.current = current;
        else
            System.out.println("Invalid value");
    }
    
    public static void main(String args[]) 
    {
        // TODO code application logic here
        
    }
}
