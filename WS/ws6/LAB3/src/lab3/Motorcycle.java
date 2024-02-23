/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author TRUNG
 */
public class Motorcycle extends Vehicle
{

    @Override
    public void start() 
    {
        System.out.println("Motorcycle start");
    }

    @Override
    public void stop() 
    {
        System.out.println("Motorcycle stop");
    }
    
    public void bocdau()
    {
        System.out.println("Xe may dang boc dau");
    }
}
