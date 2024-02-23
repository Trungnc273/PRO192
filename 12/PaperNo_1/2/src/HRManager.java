/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class HRManager extends Employee
{
    private int expYear;

    public HRManager() 
    {
    }

    public HRManager(String code, String name, int baseSalary, int expYear) 
    {
        super(code, name, baseSalary);
        this.expYear = expYear;
    }

    @Override
    public String toString() 
    {
        return code+","+name+","+expYear+","+baseSalary+"(VND)";
    }
    
    public int getSalary()
    {
        int salary;
        if(expYear>=5)
            salary=baseSalary+expYear*1000000;
        else
            salary=baseSalary;
        return salary;
    }
}
