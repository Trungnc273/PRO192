/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Brick 
{
    private String place;
    private int price;

    public Brick() 
    {
    }

    public Brick(String place, int price) 
    {
        this.place = place;
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public void setPlace(String place) 
    {
        this.place = place;
    }

    @Override
    public String toString() 
    {
        return place+","+price;
    }
    
}
