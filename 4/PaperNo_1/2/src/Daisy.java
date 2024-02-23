/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Daisy implements Flower
{

    @Override
    public int bloom_at(int currHour) 
    {
        int ba=currHour+5;
        if(ba<=24)
            return ba;
        else
            return ba-24;
    }

    @Override
    public int fade_at(int currHour) 
    {
        int fa=currHour+10;
        if(fa<=24)
            return fa;
        else
            return fa-24;
    }

    @Override
    public int price(int numOfFlower) 
    {
        return Flower.unitPrice*numOfFlower;
    }
    
}
