/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b44;

/**
 *
 * @author TRUNG
 */
import java.io.*;
import java.util.*;

class Student {
    public String maSV;
    public String hoDem;
    public String ten;
    public int tuoi;
    public String gioiTinh;
    public float diemTrungBinh;

    public Student(String maSV, String hoDem, String ten, int tuoi, String gioiTinh, float diemTrungBinh) {
        this.maSV = maSV;
        this.hoDem = hoDem;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diemTrungBinh = diemTrungBinh;
    }
}

