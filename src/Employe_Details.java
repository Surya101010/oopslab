import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Employe_Details{
    int cno;
    String cname;
    int pm_reading,cm_reading,units;
    double billpay;
    void getdetails()
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the consumer No:");
        int cno=in.nextInt();
        System.out.println("Enter the consumer Nmae");
        String cname=in.next();
        System.out.println("Enter the previous Month Reading:");
        int pm_reading=in.nextInt();
        System.out.println("Enter the Current Month Reading:");
        int cm_reading=in.nextInt();
        int units=cm_reading-pm_reading;
        System.out.println("Choose the type of EB connection 1.Domestic connection 2.Commericial connection");
        int ch=in.nextInt();
        switch(ch)
        {
            case 1:
                Domestic_calculation(units);
                break;
            case 2:
                commercial_calculation(units);
                break;
        }
    }
    void Domestic_calculation(int units)
    {
        double billpay=0;
        if(units<=100)
        {
            billpay=units*1.00;
        }
        else if(units>100&&units<=200)
        {
            billpay=100*1.00+(units-100)*2.50;
        }
        else if(units>200&&units<=500)
        {
            billpay=100*1.00+200*2.50+(units-200)*4.00;
        }
        else if(units>500)
        {
            billpay=100*1.00+200*2.50+500*4.00+(units-500)*6.00;
        }
        show();
        {
            System.out.println("Amount to be paid:" +billpay);
        }
    }
    void commercial_calculation(int units)
    {
        double billpay=0;
        if(units<=100)
        {
            billpay=units*2.00;
        }
        else if(units>100 && units<=200)
        {
            billpay=100*2.00+(units-100)*4.50;
        }
        else if(units>200 && units<=500)
        {
            billpay=100*2.00+200*4.50+(units-200)*6.00;
        }
        else if(units>500)
        {
            billpay=100*2.00+200*4.50+500*6.00+(units-500)*700;
        }
        show();
        {
            System.out.println("Amount to be paid:"+billpay);
        }
    }
    public void show(){
        System.out.println("Customer Number:"+cno);
        System.out.println("Customer Name  :"+cname);
        System.out.println("Units consumed :"+units);
    }
    public static void main(String[] args)
    {
        Employe_Details b=new Employe_Details();
        b.getdetails();
    }
}
