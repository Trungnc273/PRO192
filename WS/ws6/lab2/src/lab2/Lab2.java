/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

/**
 *
 * @author TRUNG
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Rectangle r1=new Rectangle();
        Circle c1= new Circle();
        SinhVien sv1= new SinhVien();
        GiangVien gv1=new GiangVien();
        GiaoVienNghienCuuSinh gvncs1= new GiaoVienNghienCuuSinh();
        System.out.println("Bai1:");
        r1.draw();
        r1.resize();
        c1.draw();
        c1.resize();
        System.out.println("\nBai2");
        sv1.hoc();
        gv1.hoc();
        gvncs1.hoc();
    }
    
}
