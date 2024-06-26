/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dulich.View;

import dulich.Model.DataAccess;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class DangKy extends javax.swing.JPanel {
    private DataAccess data;
    public DefaultTableModel model;
    private String idtk;
    /**
     * Creates new form TourForm
     */
    public DangKy(String idtk) {
        initComponents();
        setVisible(true);
        this.idtk=idtk;
        data = new DataAccess();
        model = (DefaultTableModel) tbTour.getModel();
        data.fetchDANGKY(model,idtk);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbTour = new dulich.Swing.CustomTable();
        roundJPanel7 = new dulich.Swing.RoundJPanel();
        jLabel7 = new javax.swing.JLabel();
        roundJPanel8 = new dulich.Swing.RoundJPanel();
        jLabel8 = new javax.swing.JLabel();
        roundJPanel9 = new dulich.Swing.RoundJPanel();
        jLabel6 = new javax.swing.JLabel();
        roundJPanel4 = new dulich.Swing.RoundJPanel();
        txtSL = new dulich.Swing.PlaceholderText();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tbTour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã chuyến", "Tên chuyến", "Ngày đi", "Ngày về", "Giá", "Số lượng", "Tổng tiền"
            }
        ));
        tbTour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTourMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTour);

        roundJPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundJPanel7MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("XÓA");

        javax.swing.GroupLayout roundJPanel7Layout = new javax.swing.GroupLayout(roundJPanel7);
        roundJPanel7.setLayout(roundJPanel7Layout);
        roundJPanel7Layout.setHorizontalGroup(
            roundJPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel7Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(30, 30, 30))
        );
        roundJPanel7Layout.setVerticalGroup(
            roundJPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        roundJPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundJPanel8MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("SỬA");

        javax.swing.GroupLayout roundJPanel8Layout = new javax.swing.GroupLayout(roundJPanel8);
        roundJPanel8.setLayout(roundJPanel8Layout);
        roundJPanel8Layout.setHorizontalGroup(
            roundJPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        roundJPanel8Layout.setVerticalGroup(
            roundJPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        roundJPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundJPanel9MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("IN HÓA ĐƠN");

        javax.swing.GroupLayout roundJPanel9Layout = new javax.swing.GroupLayout(roundJPanel9);
        roundJPanel9.setLayout(roundJPanel9Layout);
        roundJPanel9Layout.setHorizontalGroup(
            roundJPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        roundJPanel9Layout.setVerticalGroup(
            roundJPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        txtSL.setBackground(new java.awt.Color(195, 243, 255));
        txtSL.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout roundJPanel4Layout = new javax.swing.GroupLayout(roundJPanel4);
        roundJPanel4.setLayout(roundJPanel4Layout);
        roundJPanel4Layout.setHorizontalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel4Layout.setVerticalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSL, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Số lượng vé:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(roundJPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(roundJPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(roundJPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(roundJPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(roundJPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundJPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundJPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void roundJPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundJPanel9MouseClicked
        // TODO add your handling code here:
    Document document = new Document(PageSize.A4);
    String filename = idtk;

    try {
        File reportsDir = new File("reports");
        if (!reportsDir.exists()) {
          reportsDir.mkdirs();
        }
      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("reports/" + filename + ".pdf"));

      document.open();
      String fontPath = "fonts/ArialUnicodeMS.ttf";

      BaseFont baseFont = null;
        try {
            baseFont = BaseFont.createFont(fontPath, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        } catch (IOException ex) {
            Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
        }

      Font font = new Font(baseFont, 36, Font.NORMAL);
      Paragraph paragraph = new Paragraph("Hóa Đơn", font);
      paragraph.setAlignment(Paragraph.ALIGN_CENTER);
      document.add(paragraph);
      font = new Font(baseFont, 12, Font.NORMAL);
      try {
        PreparedStatement pst = data.getConnection().prepareStatement("SELECT * FROM KHACHHANG WHERE USERNAME = ?");
        pst.setString(1,idtk);
        ResultSet rs=pst.executeQuery();
        if (rs.next()) {
            String ho =rs.getString(1);
            String ten =rs.getString(2);
            String sdt =rs.getString(3);
            String email =rs.getString(4);
            document.add(new Paragraph("Họ và tên: "+ho+" "+ten,font));
            document.add(new Paragraph("Số điện thoại: "+sdt,font));
            document.add(new Paragraph("Email: "+email,font));
        }
      } catch (SQLException e) {  
      }
      document.add(new Paragraph(" "));
      PdfPTable table = new PdfPTable(7);
      table.setWidthPercentage(100); 
      PdfPCell cell = new PdfPCell(new Phrase("Mã chuyến", font));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase("Tên chuyến", font));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase("Ngày đi", font));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase("Ngày về", font));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase("Giá", font));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase("Số lượng", font));
      table.addCell(cell);
      cell = new PdfPCell(new Phrase("Tổng tiền", font));
      table.addCell(cell);
      int all =0;
   
      
      for (int i = 0; i < tbTour.getRowCount(); i++) {
                
                String ma = tbTour.getValueAt(i, 0).toString();
                String ten = tbTour.getValueAt(i, 1).toString();
                String ngaydi = tbTour.getValueAt(i, 2).toString();
                String ngayve = tbTour.getValueAt(i, 3).toString();
                String gia = tbTour.getValueAt(i, 4).toString();
                String sl = tbTour.getValueAt(i, 5).toString();
                String tong = tbTour.getValueAt(i, 6).toString();
                all = all + Integer.parseInt(tong);
                table.addCell(new Phrase(ma, font));
                table.addCell(new Phrase(ten, font));
                table.addCell(new Phrase(ngaydi, font));
                table.addCell(new Phrase(ngayve, font));
                table.addCell(new Phrase(gia, font));
                table.addCell(new Phrase(sl, font));
                table.addCell(new Phrase(tong, font));

            }

            // Thêm bảng vào tài liệu PDF
            document.add(table);      
            document.add(new Paragraph("Tổng tiền của hóa đơn: "+all,font));
      document.close();

      writer.close();
    } catch (DocumentException | FileNotFoundException ex) {
    }

    try {
      
      File file = new File("reports/" + filename + ".pdf");
      if (!Desktop.isDesktopSupported()) {
        System.out.println("Desktop functionality not supported");
      } else {
        Desktop desktop = Desktop.getDesktop();
        if (file.exists()) {
          desktop.open(file);
        }
      }
    } catch (IOException e) {
    }

    }//GEN-LAST:event_roundJPanel9MouseClicked

    private void tbTourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTourMouseClicked
        // TODO add your handling code here:
        int indextb = tbTour.getSelectedRow();
        if (indextb >= 0 && indextb < tbTour.getRowCount() ) {
            txtSL.setText(tbTour.getValueAt(indextb, 5).toString());
        }
    }//GEN-LAST:event_tbTourMouseClicked

    private void roundJPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundJPanel7MouseClicked
        // TODO add your handling code here:
        int indextb = tbTour.getSelectedRow();
        String MACHUYEN =tbTour.getValueAt(indextb, 0).toString();
        String SL =tbTour.getValueAt(indextb, 5).toString();
        int ret = JOptionPane.showConfirmDialog(null,"Bạn chắc chắn xóa chưa", "Chắn chắn chưa", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){

            String sql = "DELETE FROM DANGKY WHERE MACHUYEN = ? AND USERNAME = ? AND SL = ?";
            try {
                PreparedStatement pst = data.getConnection().prepareStatement(sql);
                pst.setString(1, MACHUYEN);
                pst.setString(2, idtk);
                pst.setString(3, SL);
                pst.executeUpdate();
                data.fetchDANGKY(model,idtk);
            } catch (SQLException ex) {
                Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try{
                      String sqlquery = "UPDATE CHUYEN SET SOLUONGVE = SOLUONGVE + ? WHERE MACHUYEN = ?";
                      PreparedStatement pst = data.getConnection().prepareStatement(sqlquery);
                      pst.setString(1,SL);
                      pst.setString(2,MACHUYEN);
                      ResultSet rs=pst.executeQuery();

                  }catch(HeadlessException | SQLException e){
                      JOptionPane.showMessageDialog(null, e);
                  }
    }//GEN-LAST:event_roundJPanel7MouseClicked

    private void roundJPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundJPanel8MouseClicked
        // TODO add your handling code here:
        int indextb = tbTour.getSelectedRow();
        String MACHUYEN =tbTour.getValueAt(indextb, 0).toString();
        String SL =tbTour.getValueAt(indextb, 5).toString();
        String SL_new = txtSL.getText();
        int ret = JOptionPane.showConfirmDialog(null,"Bạn chắc chắn muốn sửa chứ", "Chắn chắn chưa", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){

            String sql = "UPDATE DANGKY SET SL=? WHERE MACHUYEN = ? AND USERNAME = ? AND SL = ?";
            try {
                PreparedStatement pst = data.getConnection().prepareStatement(sql);
                pst.setString(1, SL_new);
                pst.setString(2, MACHUYEN);
                pst.setString(3, idtk);
                pst.setString(4, SL);
                pst.executeUpdate();
                data.fetchDANGKY(model,idtk);
            } catch (SQLException ex) {
                Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_roundJPanel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private dulich.Swing.RoundJPanel roundJPanel4;
    private dulich.Swing.RoundJPanel roundJPanel7;
    private dulich.Swing.RoundJPanel roundJPanel8;
    private dulich.Swing.RoundJPanel roundJPanel9;
    private dulich.Swing.CustomTable tbTour;
    private dulich.Swing.PlaceholderText txtSL;
    // End of variables declaration//GEN-END:variables
}
