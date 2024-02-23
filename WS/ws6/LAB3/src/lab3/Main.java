/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author TRUNG
 */
public class Main 
{
    public static void main(String[] args) 
    {
        //Bai32
        Vehicle car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        System.out.println("Bai 32");
        car.start();
        car.stop();
        if (car instanceof Car) 
        {
            ((Car) car).duaxe();
        }
        motorcycle.start();
        motorcycle.stop();
        motorcycle.bocdau();
        System.out.println("\n");
        
        //Bai36
        System.out.println("Bai 36");
        SinhVien SinhVien= new SinhVien();
        GiangVien GiangVien= new GiangVien();
        GiaoVienNghienCuuSinh GiaoVienNghienCuuSinh= new GiaoVienNghienCuuSinh();
        SinhVien.hoc();
        SinhVien.lop();
        GiangVien.hoc();
        GiangVien.truong();
        GiaoVienNghienCuuSinh.hoc();
        GiaoVienNghienCuuSinh.detai();
    }
}
