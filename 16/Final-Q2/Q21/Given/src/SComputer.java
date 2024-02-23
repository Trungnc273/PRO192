/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class SComputer extends Computer
{
    private String series;

    public SComputer()
    {
    }

    public SComputer(String series, String name, String color, double price) 
    {
        super(name, color, price);
        this.series = series;
    }
    
    public double getSalePrice()
    {
        if(series.substring(series.length()-1).equalsIgnoreCase("A"))
            return super.getPrice()*0.95;
        else
            return super.getPrice()*0.9;
    }

    @Override
    public String toString() 
    {
        return super.toString()+"\t"+series;
    }
    
}
