/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b14.a;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n;
        float x;
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            try
            {
                System.out.print("Nhap n:");
                n=sc.nextInt();
                System.out.print("Nhap x:");
                x=sc.nextFloat();
                break;
            }
            catch(Exception e)
            {
                System.out.println("Loi");
                sc.nextLine();
            }
        }
        System.out.println("n= "+n+"\n"+"x= "+x);
    }
    
}
