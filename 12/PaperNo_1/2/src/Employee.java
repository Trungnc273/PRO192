/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Employee 
{
    protected String code, name;
    protected int baseSalary;

    public Employee() 
    {
    }

    public Employee(String code, String name, int baseSalary) 
    {
        this.code = code;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
}
