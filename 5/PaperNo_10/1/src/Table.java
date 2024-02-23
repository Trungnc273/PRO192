
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Table 
{
    private String name;
    private int leg;

    public Table() 
    {
    }

    public Table(String name, int leg) 
    {
        this.name = name;
        this.leg = leg;
    }

    public String getName() 
    {
        String s="";
        s+=name.substring(name.length()-3, name.length());
        s=s.substring(0,1)+Character.toLowerCase(s.charAt(1))+s.substring(2);
        return s;
    }

    public int getLeg() 
    {
        return leg;
    }

    public void setLeg(int leg) 
    {
        this.leg = leg;
    }

    private Locale charAt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
