/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Staff> staffs = new ArrayList<>();
        inputStaffs(staffs);
        displayStaffsWithMoreThan5YearsExperience(staffs);
        System.out.println("Số Leader: "+Leader.countLeader);
        System.out.println("===============================");
        displayFresherWithID(staffs);
        writeStaffsToCSV(staffs);
    }
    
    public static void inputStaffs(ArrayList<Staff> staffs) 
    {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); 
        OUTER:
        while (true) {
            System.out.println("Nhập (fr : Fresher, js : Junior_Senior, le : Leader, ”#”: Kết thúc): ");
            String staffType = scanner.nextLine().toLowerCase();
            switch (staffType) 
            {
                case "#":
                    break OUTER;
                case "fr":
                    inputFresher(scanner, staffs);
                    break;
                case "js":
                    inputJunior_Senior(scanner, staffs);
                    break;
                case "le":
                    inputLeader(scanner, staffs);
                    break;
                default:
                    System.out.println("Nhap lai");
                    break;
            }
        }
    }
    public static void inputFresher(Scanner scanner, ArrayList<Staff> staffs) 
    {
        String employeeID;
        String cardID;
        String name;
        String skill;
        double quality;
        boolean deadline;
        while(true)
        {
            int k=0;
            System.out.print("Nhập employeeID(6 kí tự số): ");
            employeeID = scanner.nextLine();
            if(employeeID.length()!=6)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            for(int i=0; i < 6; i++)
            {
                if(!Character.isDigit(employeeID.charAt(i)))
                {
                    k=1;
                    break;
                }
            }
            if(k==1)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
        
        while(true)
        {
            int k=0;
            System.out.print("Nhập cardID(12 kí tự số): ");
            cardID = scanner.nextLine();
            if(cardID.length()!=12)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            for(int i=0; i < 12; i++)
            {
                if(!Character.isDigit(cardID.charAt(i)))
                {
                    k=1;
                    break;
                }
            }
            if(k==1)
            {
                System.out.println("Nhập lại!");
                continue;
            }                
            break;
                
        }
        
        System.out.print("Nhập name: ");
        name = scanner.nextLine();
        
        System.out.print("Nhập skill: ");
        skill = scanner.nextLine();
        
        while(true)
        {
            try
            {
                System.out.print("Nhập quality(0.0->1.0): ");
                quality = scanner.nextDouble();
                scanner.nextLine();
                if(quality>1.0||quality<0.0)
                {
                    System.out.println("Nhập lại!");
                    continue;
                }
            }
            catch(Exception e)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
        
        while(true)
        {
            try
            {
                System.out.print("Nhập deadline(true/false): ");
                deadline = scanner.nextBoolean();
                scanner.nextLine();
            }
            catch(Exception e)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
          
        staffs.add(new Fresher(employeeID, cardID, name, skill, quality, deadline));
    }
    
    public static void inputJunior_Senior(Scanner scanner, ArrayList<Staff> staffs) 
    {
        String employeeID;
        String cardID;
        String name;
        String skill;
        double quality;
        boolean deadline;
        int exp_year;
        while(true)
        {
            int k=0;
            System.out.print("Nhập employeeID(6 kí tự số): ");
            employeeID = scanner.nextLine();
            if(employeeID.length()!=6)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            for(int i=0; i < 6; i++)
            {
                if(!Character.isDigit(employeeID.charAt(i)))
                {
                    k=1;
                    break;
                }
            }
            if(k==1)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
        
        while(true)
        {
            int k=0;
            System.out.print("Nhập cardID(12 kí tự số): ");
            cardID = scanner.nextLine();
            if(cardID.length()!=12)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            for(int i=0; i < 12; i++)
            {
                if(!Character.isDigit(cardID.charAt(i)))
                {
                    k=1;
                    break;
                }
            }
            if(k==1)
            {
                System.out.println("Nhập lại!");
                continue;
            }                
            break;
                
        }
        
        System.out.print("Nhập name: ");
        name = scanner.nextLine();
        
        System.out.print("Nhập skill: ");
        skill = scanner.nextLine();
        
        while(true)
        {
            try
            {
                System.out.print("Nhập quality(0.0->1.0): ");
                quality = scanner.nextDouble();
                scanner.nextLine();
                if(quality>1.0||quality<0.0)
                {
                    System.out.println("Nhập lại!");
                    continue;
                }
            }
            catch(Exception e)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
        
        while(true)
        {
            try
            {
                System.out.print("Nhập deadline(true/false): ");
                deadline = scanner.nextBoolean();
                scanner.nextLine();
            }
            catch(Exception e)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
        
        while(true)
        {
            try
            {
                System.out.print("Nhập exp_year(>0): ");
                exp_year = scanner.nextInt();
                scanner.nextLine();
                if(exp_year<0)
                {
                    System.out.println("Nhập lại!");
                    continue;
                }
            }
            catch(Exception e)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
          
        staffs.add(new Junior_Senior(employeeID, cardID, name, skill, quality, deadline, exp_year));
    }
    
    public static void inputLeader(Scanner scanner, ArrayList<Staff> staffs) 
    {
        String employeeID;
        String cardID;
        String name;
        String skill;
        double quality;
        boolean deadline;
        int exp_year;
        double project;
        while(true)
        {
            int k=0;
            System.out.print("Nhập employeeID(6 kí tự số): ");
            employeeID = scanner.nextLine();
            if(employeeID.length()!=6)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            for(int i=0; i < 6; i++)
            {
                if(!Character.isDigit(employeeID.charAt(i)))
                {
                    k=1;
                    break;
                }
            }
            if(k==1)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
        
        while(true)
        {
            int k=0;
            System.out.print("Nhập cardID(12 kí tự số): ");
            cardID = scanner.nextLine();
            if(cardID.length()!=12)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            for(int i=0; i < 12; i++)
            {
                if(!Character.isDigit(cardID.charAt(i)))
                {
                    k=1;
                    break;
                }
            }
            if(k==1)
            {
                System.out.println("Nhập lại!");
                continue;
            }                
            break;
                
        }
        
        System.out.print("Nhập name: ");
        name = scanner.nextLine();
        
        System.out.print("Nhập skill: ");
        skill = scanner.nextLine();
        
        while(true)
        {
            try
            {
                System.out.print("Nhập quality(0.0->1.0): ");
                quality = scanner.nextDouble();
                scanner.nextLine();
                if(quality>1.0||quality<0.0)
                {
                    System.out.println("Nhập lại!");
                    continue;
                }
            }
            catch(Exception e)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
        
        while(true)
        {
            try
            {
                System.out.print("Nhập deadline(true/false): ");
                deadline = scanner.nextBoolean();
                scanner.nextLine();
            }
            catch(Exception e)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
        
        while(true)
        {
            try
            {
                System.out.print("Nhập exp_year(>0): ");
                exp_year = scanner.nextInt();
                scanner.nextLine();
                if(exp_year<0)
                {
                    System.out.println("Nhập lại!");
                    continue;
                }
            }
            catch(Exception e)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
        
        while(true)
        {
            try
            {
                System.out.print("Nhập project(1.0->10.0): ");
                project = scanner.nextDouble();
                scanner.nextLine();
                if(project>10.0||project<1.0)
                {
                    System.out.println("Nhập lại!");
                    continue;
                }
            }
            catch(Exception e)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
        staffs.add(new Leader(employeeID, cardID, name, skill, quality, deadline, exp_year, project));
    }
    
    public static void displayStaffsWithMoreThan5YearsExperience(ArrayList<Staff> staffs) {
        System.out.println("Danh sách đối tượng có hơn 5 năm kinh nghiệm:");
        for (Staff staff : staffs) 
        {
            if (staff instanceof Junior_Senior) 
            {
                Junior_Senior juniorSenior = (Junior_Senior) staff;
                if (juniorSenior.getExp_year() > 5) 
                {
                    System.out.println("EmployeeID: "+juniorSenior.employeeID);
                    System.out.println("CardID: "+juniorSenior.cardID);
                    System.out.println("Name: "+juniorSenior.name);
                    System.out.println("Skill: "+juniorSenior.skill);
                    System.out.println("Quality: "+juniorSenior.getQuality());
                    System.out.println("Deadline: "+juniorSenior.isDeadline());
                    System.out.println("Exp_year: "+juniorSenior.getExp_year());
                    System.out.println("Level: "+juniorSenior.getLevel());
                    System.out.println("Kpi: "+juniorSenior.kpi());
                    System.out.println("======================================");
                }
            }
            else if (staff instanceof Leader) 
            {
                Leader leader = (Leader) staff;
                if (leader.getExp_year() > 5) 
                {
                    System.out.println("EmployeeID: "+leader.employeeID);
                    System.out.println("CardID: "+leader.cardID);
                    System.out.println("Name: "+leader.name);
                    System.out.println("Skill: "+leader.skill);
                    System.out.println("Quality: "+leader.getQuality());
                    System.out.println("Deadline: "+leader.isDeadline());
                    System.out.println("Exp_year: "+leader.getExp_year());
                    System.out.println("Project: "+leader.getProject());
                    System.out.println("Level: "+leader.getLevel());
                    System.out.println("Kpi: "+leader.kpi());
                    System.out.println("======================================");
                }
            }
        }
    }
    
    public static void displayFresherWithID(ArrayList<Staff> staffs) 
    {
        Scanner scanner = new Scanner(System.in);
        String szID;
        while(true)
        {
            int k=0;
            System.out.print("Nhập szID(6 kí tự số): ");
            szID = scanner.nextLine();
            if(szID.length()!=6)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            for(int i=0; i < 6; i++)
            {
                if(!Character.isDigit(szID.charAt(i)))
                {
                    k=1;
                    break;
                }
            }
            if(k==1)
            {
                System.out.println("Nhập lại!");
                continue;
            }
            break;
        }
        int hashszID = Integer.parseInt(szID);
        for (Staff staff : staffs) 
        {
            if (staff instanceof Fresher) 
            {
                Fresher fresher = (Fresher) staff;
                if(staff.hashCode()==hashszID)
                    System.out.println("EmployeeID: "+fresher.employeeID);
                    System.out.println("CardID: "+fresher.cardID);
                    System.out.println("Name: "+fresher.name);
                    System.out.println("Skill: "+fresher.skill);
                    System.out.println("Quality: "+fresher.getQuality());
                    System.out.println("Deadline: "+fresher.isDeadline());
                    System.out.println("Level: "+fresher.getLevel());
                    System.out.println("Kpi: "+fresher.kpi());
                    System.out.println("======================================");
            }
        }
    }
    
    public static void writeStaffsToCSV(ArrayList<Staff> staffs) 
    {
        try 
        {
            try (FileWriter writer = new FileWriter("staff_list.csv")) 
            {
                writer.append("EmployeeID,CardID,Name,Skill,Quality,Deadline,Exp_Year,Project,Level,KPI\n");
                for (Staff staff : staffs) 
                {
                    writer.append(staff.getEmployeeID()).append(",").append(staff.getCardID()).append(",")
                          .append(staff.getName()).append(",").append(staff.getSkill()).append(",");

                    if (staff instanceof Fresher)
                    {
                        Fresher fresher = (Fresher) staff;
                        writer.append(String.valueOf(fresher.getQuality())).append(",")
                              .append(String.valueOf(fresher.isDeadline())).append(",,,")
                              .append(fresher.getLevel()).append(",")
                              .append(String.valueOf(fresher.kpi())).append("\n");
                    } 
                    else if (staff instanceof Junior_Senior)
                    {
                        Junior_Senior juniorSenior = (Junior_Senior) staff;
                        writer.append(",,,").append(String.valueOf(juniorSenior.getQuality())).append(",")
                              .append(String.valueOf(juniorSenior.isDeadline())).append(",")
                              .append(String.valueOf(juniorSenior.getExp_year())).append(",,")
                              .append(juniorSenior.getLevel()).append(",")
                              .append(String.valueOf(juniorSenior.kpi())).append("\n");
                    } 
                    else if (staff instanceof Leader)
                    {
                        Leader leader = (Leader) staff;
                        writer.append(",,,,").append(String.valueOf(leader.getQuality())).append(",")
                              .append(String.valueOf(leader.isDeadline())).append(",")
                              .append(String.valueOf(leader.getExp_year())).append(",")
                              .append(String.valueOf(leader.getProject())).append(",")
                              .append(leader.getLevel()).append(",")
                              .append(String.valueOf(leader.kpi())).append("\n");
                    }
                }
                writer.flush();
            }
            System.out.println("Đã ghi danh sách đối tượng ra file staff_list.csv");
        } 
        catch (IOException e) 
        {
            System.out.println("Lỗi");
        }
    }
}

