/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public abstract class Factory 
{
    private String type,dataSource;

    public Factory() 
    {
    }

    public Factory(String type, String dataSource) 
    {
        this.type = type;
        this.dataSource = dataSource;
    }

    public String getType() 
    {
        return type;
    }

    public String getDataSource() 
    {
        return dataSource;
    }
    
    public abstract void readData();

    public abstract String writeData();
}
    
   
