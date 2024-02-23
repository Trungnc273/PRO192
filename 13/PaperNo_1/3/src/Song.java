/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Song implements Comparable<Song>
{
    private String name;
    private int duration;
    private int duraation;

    public Song() 
    {
    }

    public Song(String name, int duration) 
    {
        this.name = name.toUpperCase();
        if(duration<1)
            this.duration=1;
        else
            this.duration = duration;
    }

    public String getName() 
    {
        return name;
    }

    public int getDuration() 
    {
        return duration;
    }

    @Override
    public String toString() 
    {
        return name+","+duration;
    }
    

    @Override
    public int compareTo(Song o) 
    {
        return this.name.compareTo(o.getName());
    }
    
}
