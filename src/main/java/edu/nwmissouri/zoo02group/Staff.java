/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo02group;

import java.util.ArrayList;

/**
 *
 * @author Pavan Kumar Atmakuri
 */
public class Staff extends Person {
     private static ArrayList<Staff> StaffList=new ArrayList<>();
     private int staffId;
    public Staff(int staffId,String firstName, String lastName, int age, String gender) {
        super(firstName, lastName, age, gender);
        this.staffId=staffId;
    }
    
     public static void creat(){  
       StaffList.add(new Staff(1001,"Uday","allipi",26,"Male"));
       StaffList.add(new Staff(1002,"Rohit","Gangguru",24,"Male"));
       StaffList.add(new Staff(1003,"Nikhil","Nagabandi",25,"Male"));
       StaffList.add(new Staff(1004,"Parasana","allipi",22,"Male"));
   }

    public static ArrayList<Staff> getStaffList() {
        return StaffList;
    }

    public static void setStaffList(ArrayList<Staff> StaffList) {
        Staff.StaffList = StaffList;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
     
    public static boolean check(int empid)
   {
       
       Staff.creat();
       for(Staff v:Staff.getStaffList())
       {
       if(v.getStaffId()==empid)
       {
           System.out.println("Hello "+v.firstName+" Welcome into Maryville Zoo");
           return true;
       }
       }
       return false;
   }
}