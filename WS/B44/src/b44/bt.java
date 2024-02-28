/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b44;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class bt 
{
    public static void main(String[] args) 
    {
        List<Integer> numberList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào danh sách số nguyên dương (Nhập 2025 để kết thúc):");
        while(true)
        {
            int number;
            System.out.print("So:");
            try
            {
                number = sc.nextInt();
            }
            catch(Exception e)
            {
                sc.nextLine();
                continue;
            }
            if(number==2025)
                break;
            numberList.add(number);
        }
        System.out.println("Danh sach da nhap");
        for(int num: numberList)
        {
            System.out.println(num+" ");
        }
        System.out.println("So chia het cho 5");
        for(int num: numberList)
        {
            if(num%5==0)
                System.out.println(num+" ");
        }
    }
    
}
