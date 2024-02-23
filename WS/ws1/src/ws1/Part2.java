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
public class Part2 
{
    public static void main(String[] args) 
    {
        float n1,n2;
        String o;
        Scanner sc= new Scanner(System.in);
        Scanner scc= new Scanner(System.in);
        System.out.print("Input the number 1:");
        n1=sc.nextFloat();
        System.out.print("Input the number 2:");
        n2=sc.nextFloat();
        System.out.print("Input the operator:");
        o=scc.nextLine();
        switch(o)
        {
            case"+":
                System.out.println("the result of "+n1+"+"+n2+"="+(n1+n2));
                break;
            case"-":
                System.out.println("the result of "+n1+"-"+n2+"="+(n1-n2));
                break;
            case"*":
                System.out.println("the result of "+n1+"*"+n2+"="+(n1*n2));
                break;
            case"/":
                System.out.println("the result of "+n1+"/"+n2+"="+(n1/n2));
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
