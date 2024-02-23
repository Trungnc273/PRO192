
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class Pet implements ITax
{
    private String name,birthday;
    
    private ArrayList<Service> usedService;

    public Pet(String name, String birthday) 
    {
        this.name = name;
        this.birthday = birthday;
        this.usedService=new ArrayList<>();
    }
    
    public void addService(String nameService,int price)
    {
        Service service = new Service(nameService, price);
        usedService.add(service);
    }

    @Override
    public String toString() {
        return name+"-"+getTotalMoney()+"-"+getTax();
    }
    
    
    @Override
    public double getTax() 
    {
        return VAT*getTotalMoney();
    }

    @Override
    public double getTotalMoney() 
    {
        double tt=0;
        for(Service service:usedService)
        {
            tt+=service.getPrice();
        }
        if(birthday.subSequence(0,2).equals("10")||birthday.subSequence(0,2).equals("11")||birthday.subSequence(0,2).equals("12"))
            tt=tt-(5*tt)/100;
        return tt;
    }
    
}
