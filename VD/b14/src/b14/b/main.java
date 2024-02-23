/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b14.b;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class main 
{
    private static int nhapn()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        while(true)
        {
            try
            {
                System.out.print("Nhap n:");
                n=sc.nextInt();
                break;
            }
            catch(Exception e)
            {
                System.out.println("Loi");
                sc.nextLine();
            }
        }
        return n;      
    }
    
        private static float nhapx()
    {
        Scanner sc=new Scanner(System.in);
        float x;
        while(true)
        {
            try
            {
                System.out.print("Nhap x:");
                x=sc.nextInt();
                break;
            }
            catch(Exception e)
            {
                System.out.println("Loi");
                sc.nextLine();
            }
        }
        return x;      
    }
    
    public static void main(String[] args) 
    {
        System.out.println(nhapn());
        System.out.println(nhapx());
        
    }
    
}
