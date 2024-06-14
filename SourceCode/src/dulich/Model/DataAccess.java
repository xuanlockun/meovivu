/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dulich.Model;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;

public class DataAccess {
    private Connection connection;
    
    public DataAccess(){
        try {  
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";

            String username = "LOCLAAI";
            String password = "Oracle123456";
            
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
    
    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   

    private PreparedStatement pst;
    private ResultSet rs;
    private CallableStatement cst;
    public void fetchCHUYEN(DefaultTableModel tableModel,String MATOUR){
//        String sql = "SELECT * FROM CHUYEN WHERE MATOUR=? ORDER BY MACHUYEN ASC";
           String sql = "{CALL fetchCHUYEN(?, ?)}";
        tableModel.setRowCount(0);
        try {
//            pst = connection.prepareStatement(sql);
//            pst.setString(1,MATOUR);
//            rs = pst.executeQuery();
            cst = connection.prepareCall(sql);
            cst.setString(1, MATOUR);
            cst.registerOutParameter(2, OracleTypes.CURSOR);
            cst.execute(); // Thực thi stored procedure
            
            // Lấy kết quả từ tham số OUT kiểu SYS_REFCURSOR
            rs = (ResultSet) cst.getObject(2);
            String row[] = new String[7];
            DefaultTableModel df;
            df = (DefaultTableModel) tableModel;
            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                df.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
public void fetchDANGKY(DefaultTableModel tableModel, String idtk) {
    String sql = "SELECT DK.SL,C.MACHUYEN,C.TENCHUYEN,C.NGAYDI,C.NGAYDEN,C.GIACHUYEN \n" +
"FROM DANGKY DK, CHUYEN C\n" +
"WHERE DK.MACHUYEN = C.MACHUYEN \n" +
"AND DK.USERNAME =?";
    tableModel.setRowCount(0);
    PreparedStatement pst = null;
    ResultSet rs = null;
    try {
        pst = connection.prepareStatement(sql);
        pst.setString(1, idtk);
        rs = pst.executeQuery();
        String row[] = new String[7];
        DefaultTableModel df = (DefaultTableModel) tableModel;
        
        while (rs.next()) {
            String quantityStr = rs.getString(1);
            String giachuyenStr = rs.getString(6);
            int quantity = Integer.parseInt(quantityStr);
            int giachuyen = Integer.parseInt(giachuyenStr);
            int totalPrice = quantity * giachuyen;
            row[0] = rs.getString(2);
            row[1] = rs.getString(3);
            row[2] = rs.getString(4);
            row[3] = rs.getString(5);
            row[4] = rs.getString(6);
            row[5] = rs.getString(1);
            row[6] = String.valueOf(totalPrice);
                
            df.addRow(row);
        }

        
    } catch (SQLException ex) {
        Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    
    public Connection getConnection() {
        return connection;
    }
}
