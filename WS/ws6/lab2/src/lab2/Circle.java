/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author TRUNG
 */
public class Circle implements Shape
{

    @Override
    public void draw() 
    {
        System.out.println("Vẽ hình tròn ");
    }

    @Override
    public void resize() 
    {
        System.out.println("Thay đổi kích thước hình tròn");
    }
    
}
