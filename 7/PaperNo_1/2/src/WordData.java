/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class WordData extends Factory implements IConnect
{
    private String content;

    public WordData(String type, String dataSource) 
    {
        super(type, dataSource);
        this.content="this is a String";
    }
    
    @Override
    public void readData() 
    {
        if(super.getType().substring(super.getType().length()-4, super.getType().length()).equals(".doc"))
            content="humpty dumpty sat on the wall";
    }

    @Override
    public String writeData() 
    {
        String[] word=content.split("\\s");
        String s="";
        for(String w:word)
        {
            s+=Character.toUpperCase(w.charAt(0))+w.substring(1)+" ";
        }
        return s;
    }

    @Override
    public boolean makeConnection() 
    {
        return super.getDataSource().contains("localhost:8080");
    }
    
}
