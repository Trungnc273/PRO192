/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG
 */
public class VNMotor extends Motor
{
    private String series;

    public VNMotor() 
    {
    }

    public VNMotor( String brandName, String series, double price) 
    {
        super(brandName, price);
        this.series = series;
    }
    
    public double getSalePrice()
    {
        if(super.getPrice()<3000)
            return super.getPrice()*0.95;
        else
            return super.getPrice()*0.90;
    }

    @Override
    public String toString() 
    {
        return super.getBrandName()+"\t"+ series+"\t"+super.getPrice();
    }
    
}
