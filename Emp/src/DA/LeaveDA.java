/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import BO.Leave;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

/**String Name;
    int id,contact,total_leaves,leaves_taken,empid;
    Date from,to;
 *
 * @author Mr. vipul
 */
public class LeaveDA extends Abstractdao
{
    static Connection con=getConnection();
    public static void add(Leave le) 
    {
        try
        {
        PreparedStatement stat=con.prepareStatement("insert into Leave1(empid,Name,id,contact,total_no_of_leaves,leaves_taken,from_date,to_date,type_of_leave) values (?,?,?,?,?,?,?,?,?)");
        stat.setInt(1,le.getEmpid());
        stat.setString(2,le.getName());
        stat.setInt(3,le.getId());
        stat.setInt(4,le.getContact());
        stat.setInt(5,le.getTotal_no_of_leaves());
        stat.setInt(6,le.getLeaves_taken());
        stat.setString(7,le.getFrom_Date());
        stat.setString(8,le.getTo_Date());
        stat.setString(9,le.getType_of_leave());
        stat.execute();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
