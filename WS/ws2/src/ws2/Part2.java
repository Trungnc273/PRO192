/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws2;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class Part2 
{
    public static void main(String[] args) 
    {
        String s;
        String p="SE\\d+";
        while(true)
        {
            try
            {
               Scanner sc= new Scanner(System.in);
               System.out.print("Input the string 1: ");
               s=sc.nextLine();
               if(!s.matches(p))
                   throw new Exception();
               break;
            }
            catch(Exception e)
            {
                System.out.println("the string is invalid");
            }
        }
        System.out.println("the string is "+s);
    }
}
