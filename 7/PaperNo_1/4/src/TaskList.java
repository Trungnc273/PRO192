
import java.util.ArrayList;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class TaskList extends ArrayList<String> implements ITask
{
    public void addTask(String task)
    {
        super.add(task);
    }

    @Override
    public double getWorkingHours(String place) 
    {
        double wo=0;
        for(String task:this)
        {
            if(task.contains(place.toLowerCase())||task.contains(place.toUpperCase()))
            {
                if(place.equalsIgnoreCase("HCM"))
                    wo+=5;
                else
                    wo+=2;
            }
            
        }
        return wo;
    }

    @Override
    public String getTaskName(String place) 
    {
        String s="";
        for(String task:this)
        {
            String[] word =task.split("@");
            int count=0;
            for(String w:word)
            {
                if(count==0)
                {
                    if(task.contains(place.toLowerCase())||task.contains(place.toUpperCase()))
                    {
                        s+=w+";";
                        count++;
                    }
                }
                    
            }
        }
        return s;
    }
    
}
