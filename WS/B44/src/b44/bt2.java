/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b44;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author TRUNG
 */
public class bt2 
{
    public static void main(String[] args) 
    {
        ArrayList<Float> nList=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int n=0;
        int count=0;
        while(true)
        {
            System.out.print("Nhap n:");
            try
            {
                n=sc.nextInt();
            }
            catch(Exception e)
            {
                sc.nextLine();
                System.out.println("Nhap lai");
                continue;
            }
            if(n<=10&&n>=1)
                break;
            else
                System.out.println("Nhap lai");
        }
        
        for(int i=0;i<n;i++)
        {
            float d;
            try
            {
                System.out.print("d:");
                d=sc.nextFloat();
            }
            catch(Exception e)
            {
                sc.nextLine();
                i--;
                continue;
            }
            nList.add(d);
        }
        System.out.print("phần tử đầu tiên của list có giá trị > 0.5:");
        for(float nl:nList)
        {
            if(nl>0.5)
            {
                System.out.println(nl);
                break;
            }
        }
        System.out.println("Ds tang dan");
        Collections.sort(nList);
        for(float nl:nList)
        {
            System.out.println(nl+" ");
        }
    }
}
