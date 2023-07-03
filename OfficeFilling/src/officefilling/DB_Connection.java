/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package officefilling;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
    public static Connection mycon(){
        Connection connection = null;
        
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\DELL\\OfficeFilling\\DataBase\\Office_Filing.mdb");
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
