/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

/**
 *
 * @author TRUNG
 */
class A{
       public static int a=10;
       public int b=0;
}
public class Maint{
       public static void main(String[] args) 
        {
            A ob,oc; // ob=null
            ob=new A();
            oc=new A();
            oc.a=12;
            ob.a=9; //ok, thâm nhâp qua đối tượng
            ob.b=1;//ok
            oc.b=2;
            A.a=8; // ok, thâm nhập  biến static= tên lớp
            //A.b=2; // not ok
            System.out.println(ob.a+"   "+oc.a+"   ");
        }
}