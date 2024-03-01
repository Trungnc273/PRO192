/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author TRUNG
 */
public abstract class Person 
{
    public String name,gender;
    public int age;
    protected String bank_account;

    public Person(String name, int age, String gender) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bank_account = bank_account;
    }
    
    public abstract String getRole();
}
