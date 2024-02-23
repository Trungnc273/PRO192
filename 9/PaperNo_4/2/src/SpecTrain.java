/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class SpecTrain extends Train
{
    private int load;

    public SpecTrain() 
    {
    }
    
    public SpecTrain(String name, String type, int load) 
    {
        super(name, type);
        this.load = load;
    }

    @Override
    public String toString() 
    {
        return super.getName()+","+load+","+super.getType();
    }
    
    public void setData()
    {
        super.setName(super.getName().substring(1));
    }
    public int getValue()
    {
        int count=0;
        for(int i=0;i<super.getType().length();i++)
        {
            if(Character.isDigit(super.getType().charAt(i)))
                count++;
        }
        if(count==1)
            return load*super.getName().length();
        else
            return load;
    }
}
