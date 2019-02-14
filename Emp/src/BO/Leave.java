/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.util.Date;

/**
 *
 * @author Mr. vipul
 */
public class Leave 
{
    String Name;
    int id,contact,total_no_of_leaves,leaves_taken,empid;
    String from_Date,to_Date,type_of_leave;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getTotal_no_of_leaves() {
        return total_no_of_leaves;
    }

    public void setTotal_no_of_leaves(int total_no_of_leaves) {
        this.total_no_of_leaves = total_no_of_leaves;
    }

    public int getLeaves_taken() {
        return leaves_taken;
    }

    public void setLeaves_taken(int leaves_taken) {
        this.leaves_taken = leaves_taken;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getFrom_Date() {
        return from_Date;
    }

    public void setFrom_Date(String from_Date) {
        this.from_Date = from_Date;
    }

    public String getTo_Date() {
        return to_Date;
    }

    public void setTo_Date(String to_Date) {
        this.to_Date = to_Date;
    }

    public String getType_of_leave() {
        return type_of_leave;
    }

    public void setType_of_leave(String type_of_leave) {
        this.type_of_leave = type_of_leave;
    }

}