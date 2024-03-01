/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Objects;

/**
 *
 * @author TRUNG
 */
public abstract class Staff 
{
    protected String employeeID;
    public String cardID;
    public String name;
    public String skill;

    public Staff(String employeeID, String cardID, String name, String skill) 
    {
        this.employeeID = employeeID;
        this.cardID = cardID;
        this.name = name;
        this.skill = skill;
    }
    
    public abstract String getLevel();

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.employeeID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Staff other = (Staff) obj;
        return Objects.equals(this.employeeID, other.employeeID);
    }

    public String getEmployeeID() 
    {
        return employeeID;
    }

    public String getCardID() 
    {
        return cardID;
    }

    public String getName() 
    {
        return name;
    }

    public String getSkill() 
    {
        return skill;
    }

    
}
