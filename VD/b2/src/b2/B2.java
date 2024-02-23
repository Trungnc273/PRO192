/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        
        int n=0;
        while(true)
        {
            try
            {
                System.out.print("Nhap n:");
                n=scanner.nextInt();
                if(n>=1&&n<=20)
                    break;
            }
            catch(Exception e)
            {
                scanner.nextLine();
            }
        }
        
        float[] a= new float[n];
        for(int i=0;i<n;i++)
        {
            try
            {
            System.out.print("Nhap phan tu thu "+i+":");
            a[i]=scanner.nextFloat();  
            }
            catch(Exception e)
            {
                scanner.nextLine();
                i--;
            }
        }
        System.out.println("--------------------------------------");
        for(int i=0;i<n;i++)
        {
            System.out.println("Phan tu thu "+i+"="+a[i]);
        }
    }
    
}
