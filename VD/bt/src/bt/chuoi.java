/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class chuoi 
{
    public static void main(String[] args) 
    {
        String s;
        int k=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap chuoi:");
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
                k++;
        }
        System.out.println("a="+k);
        
    }
}
