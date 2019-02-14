/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BO.Emp;
import DA.EmpDA;
import java.sql.SQLException;

/**
 *
 * @author Mr. vipul
 */
public class Test 
{
    public static void main(String[] args) throws SQLException 
    {
        Emp emp=new Emp();
        
        emp.setAddress("abb");
        emp.setD_id(1);
        emp.setEmail("sfsa");
        emp.setId(1);
        emp.setContact(9962104);
        emp.setName("asds");
        // EmpDA.add(emp);
         EmpDA.update(emp);
    }
    
}
