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
    private int id,salary;
    private String firstname,lastname;

    public Employee() 
    {
    }

    public Employee(int id, String firstname, String lastname, int salary) 
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getID() 
    {
        return id;
    }

    public String getFirstName() 
    {
        return firstname;
    }

    public String getLastName() 
    {
        return lastname;
    }
    
    public int getSalary() 
    {
        return salary;
    }

    public void setID(int id) 
    {
        this.id = id;
    }

    public void setFirstName(String firstname) 
    {
        this.firstname = firstname;
    }

    public void setLastName(String lastname) 
    {
        this.lastname = lastname;
    }
    
    public void setSalary(int salary) 
    {
        this.salary = salary;
    }
    
    public String getName()
    {
        return firstname+" "+lastname;
    }
    
    public int getAnnualSalary()
    {
        return salary*12;
    }
    
    public int raiseSalary(int percent)
    {
        setSalary(getSalary()+(getSalary()*percent)/100);
        return percent;
    }

    @Override
    public String toString() 
    {
        return "Employee[" + "id=" + id + ",name="+getName()+",salary=" + salary +']';
    }
    
}
