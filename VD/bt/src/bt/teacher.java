/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

/**
 *
 * @author TRUNG
 */

public class teacher{
    public static int so_gv=0;
    private String name;
    public teacher(String ten_gv)
    {
        this.name=ten_gv;
        so_gv++;
    }
    
    public String getName(){return name;}
    
}
