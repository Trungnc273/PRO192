
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class ProcessStudent extends ArrayList<Student>
{
    public List<Student> findByName(String strName)
    {
        ArrayList<Student> s= new ArrayList<>();
        for(Student student:this)
        {
            if(student.getName().equalsIgnoreCase(strName))
                s.add(student);
        }
            return s.isEmpty()?null:s;
    }
    public List<Student> findByGpa(double nGpa)
    {
        ArrayList<Student> s= new ArrayList<>();
        for(Student student:this)
        {
            if(student.getGpa()>=nGpa)
                s.add(student);
        }
        return s.isEmpty()?null:s;
    }
}
