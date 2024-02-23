/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws1;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class Part3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String[] list=new String[10];
        String s;
        for(int i=0;i<10;i++)
        {
            System.out.print("st["+i+"]=");
            list[i]=sc.nextLine();
            
        }
        for(int i=0;i<10;i++)
        {
            s=Character.toUpperCase(list[i].charAt(0))+list[i].substring(1);
            System.out.println("s1="+s);
        }
    }
}
