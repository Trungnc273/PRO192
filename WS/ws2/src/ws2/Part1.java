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
public class Part1 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            try
            {
                System.out.print("Enter the number: ");
                n=sc.nextInt();
                if(n<1)
                    throw new Exception();
                break;
            }
            catch(Exception e)
            {
                System.out.println("The number is invalid");
                sc.nextLine();
            }
        }
        System.out.println("The number is "+n);
    }
}
