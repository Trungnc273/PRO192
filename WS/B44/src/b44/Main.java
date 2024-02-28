/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b44;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class Main {
    public static List<Student> inputStudentList() 
    {
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin sinh viên (Nhập '#' để kết thúc nhập):");

        while (true) 
        {
            System.out.print("Mã sinh viên: ");
            String maSV = scanner.nextLine();
            if (maSV.equals("#")) {
                break;
            }

            System.out.print("Họ và đệm: ");
            String hoDem = scanner.nextLine();

            System.out.print("Tên: ");
            String ten = scanner.nextLine();

            System.out.print("Tuổi: ");
            int tuoi = Integer.parseInt(scanner.nextLine());

            System.out.print("Giới tính: ");
            String gioiTinh = scanner.nextLine();

            System.out.print("Điểm trung bình: ");
            float diemTrungBinh = Float.parseFloat(scanner.nextLine());

            Student student = new Student(maSV, hoDem, ten, tuoi, gioiTinh, diemTrungBinh);
            studentList.add(student);
        }

        return studentList;
    }

    public static void printStudentList(List<Student> studentList) {
        System.out.println("Danh sách sinh viên:");
        for (Student student : studentList) {
            System.out.println("Mã sinh viên: " + student.maSV);
            System.out.println("Họ và đệm: " + student.hoDem);
            System.out.println("Tên: " + student.ten);
            System.out.println("Tuổi: " + student.tuoi);
            System.out.println("Giới tính: " + student.gioiTinh);
            System.out.println("Điểm trung bình: " + student.diemTrungBinh);
            System.out.println("----------------------");
        }
    }

    public static List<Student> reverseStudentList(List<Student> studentList) {
        List<Student> reversedList = new ArrayList<>(studentList);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public static void writeStudentListToFile(List<Student> studentList, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Student student : studentList) {
                bufferedWriter.write(student.maSV + "," + student.hoDem + "," + student.ten + "," + student.tuoi + ","
                        + student.gioiTinh + "," + student.diemTrungBinh);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = inputStudentList();
        printStudentList(studentList);

       
        List<Student> reversedList = reverseStudentList(studentList);
        System.out.println("Danh sách sinh viên đảo ngược:");
        printStudentList(reversedList);

        writeStudentListToFile(studentList, "student_list.txt");
        System.out.println("Đã ghi danh sách sinh viên vào file student_list.txt");
 
    }
}
