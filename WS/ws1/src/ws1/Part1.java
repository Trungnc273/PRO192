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
public class Part1 
{
    
    public static void main(String[] args) 
    {
    int r,c,s=0;
    double a;
    int m[][];
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of rows:");
    r=sc.nextInt();
    System.out.print("Enter number of columns:");
    c=sc.nextInt();
    m=new int[r][c];
    System.out.println("Enter the matrix");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            System.out.format("m[%d][%d]=",i,j);
            m[i][j]=sc.nextInt();
        }
    }
        System.out.println("Matrix inputted:");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            System.out.print(m[i][j]+" ");
            s+=m[i][j];
        }
        System.out.println("");
    }
    a=1.0*s/(r*c);
    System.out.println("Sum: "+s);
    System.out.format("Average: %.2f",a);
    }
}
