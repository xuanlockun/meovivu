/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dulich.View;

import dulich.Model.DataAccess;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ACER
 */
public class TourFormKH extends javax.swing.JPanel {
    public DataAccess data;
    public DefaultTableModel model;
    public String idtk;
    /**
     * Creates new form TourForm
     */
    public TourFormKH(String idtk) {
        initComponents();
        setVisible(true);
        this.idtk=idtk;
        data = new DataAccess();
        model = (DefaultTableModel) tbTour.getModel();
        data.fetchCHUYEN(model,"1");
    }
    public void search(String str) {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tbTour.setRowSorter(trs);

        // Chuyển đổi chuỗi tìm kiếm và dữ liệu trong bảng thành chữ thường
        String lowercaseSearchString = str.toLowerCase();
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + lowercaseSearchString));
    }
    public void clear() {
        txtMACHUYEN.setText("");
        txtTENCHUYEN.setText("");
        txtSL.setText("");
        data.fetchCHUYEN(model,"1");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roundJPanel1 = new dulich.Swing.RoundJPanel();
        txtMACHUYEN = new dulich.Swing.PlaceholderText();
        roundJPanel5 = new dulich.Swing.RoundJPanel();
        txtTENCHUYEN = new dulich.Swing.PlaceholderText();
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
                "Mã", "Tên", "Ngày đi", "Ngày về", "Giá", "Số lượng vé", "Mô tả"
            }
        ));
        tbTour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTourMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTour);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tên chuyến:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã chuyến:");

        roundJPanel1.setBackground(new java.awt.Color(204, 255, 255));

        txtMACHUYEN.setBackground(new java.awt.Color(195, 243, 255));
        txtMACHUYEN.setForeground(new java.awt.Color(0, 0, 0));
        txtMACHUYEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMACHUYENActionPerformed(evt);
            }
        });
        txtMACHUYEN.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtMACHUYENPropertyChange(evt);
            }
        });
        txtMACHUYEN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMACHUYENKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMACHUYENKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMACHUYENKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout roundJPanel1Layout = new javax.swing.GroupLayout(roundJPanel1);
        roundJPanel1.setLayout(roundJPanel1Layout);
        roundJPanel1Layout.setHorizontalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtMACHUYEN, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        roundJPanel1Layout.setVerticalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMACHUYEN, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtTENCHUYEN.setBackground(new java.awt.Color(195, 243, 255));
        txtTENCHUYEN.setForeground(new java.awt.Color(0, 0, 0));
        txtTENCHUYEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTENCHUYENActionPerformed(evt);
            }
        });
        txtTENCHUYEN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTENCHUYENKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout roundJPanel5Layout = new javax.swing.GroupLayout(roundJPanel5);
        roundJPanel5.setLayout(roundJPanel5Layout);
        roundJPanel5Layout.setHorizontalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTENCHUYEN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel5Layout.setVerticalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(txtTENCHUYEN, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundJPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundJPanel9MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ĐĂNG KÝ");

        javax.swing.GroupLayout roundJPanel9Layout = new javax.swing.GroupLayout(roundJPanel9);
        roundJPanel9.setLayout(roundJPanel9Layout);
        roundJPanel9Layout.setHorizontalGroup(
            roundJPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addContainerGap(34, Short.MAX_VALUE))
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
                            .addComponent(roundJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundJPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundJPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(roundJPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundJPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundJPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 276, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTENCHUYENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTENCHUYENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTENCHUYENActionPerformed

    private void roundJPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundJPanel9MouseClicked
        // TODO add your handling code here:
        String MACHUYEN = txtMACHUYEN.getText();
        String USERNAME = idtk;
        String SL = txtSL.getText();
        try{
                      String sqlquery = "INSERT INTO DANGKY VALUES(?,?,?)";
                      PreparedStatement pst = data.getConnection().prepareStatement(sqlquery);
                      pst.setString(1,USERNAME);
                      pst.setString(2,MACHUYEN);
                      pst.setString(3,SL);
                      ResultSet rs=pst.executeQuery();

                  }catch(HeadlessException | SQLException e){
                      JOptionPane.showMessageDialog(null, "Bạn đã đặt quá số lượng hiện có của chuyến này");
                  }
//        try{
//                      String sqlquery = "UPDATE CHUYEN SET SOLUONGVE = SOLUONGVE - ? WHERE MACHUYEN = ?";
//                      PreparedStatement pst = data.getConnection().prepareStatement(sqlquery);
//                      pst.setString(1,SL);
//                      pst.setString(2,MACHUYEN);
//                      ResultSet rs=pst.executeQuery();
//
//                  }catch(HeadlessException | SQLException e){
//                      JOptionPane.showMessageDialog(null, e);
//                  }
        clear();
        data.fetchCHUYEN(model,"1");
        String searchString = txtMACHUYEN.getText();
        search(searchString);
    }//GEN-LAST:event_roundJPanel9MouseClicked

    private void tbTourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTourMouseClicked
        // TODO add your handling code here:
        int indextb = tbTour.getSelectedRow();
        if (indextb >= 0 && indextb < tbTour.getRowCount() ) {
            txtMACHUYEN.setText(tbTour.getValueAt(indextb, 0).toString());
            txtTENCHUYEN.setText(tbTour.getValueAt(indextb, 1).toString());
        }
    }//GEN-LAST:event_tbTourMouseClicked

    private void txtMACHUYENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMACHUYENActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtMACHUYENActionPerformed

    private void txtMACHUYENPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtMACHUYENPropertyChange
        // TODO add your handling code here:
//        String MACHUYEN = txtMACHUYEN.getText();
//        String TENCHUYEN = txtTENCHUYEN.getText();
//        String NGAYDI = txtNGAYDI.getText();
//        String NGAYVE = txtNGAYVE.getText();
//        String GIA = txtGIA.getText();
//        String SL = txtSL.getText();
//        String MACHUYEN = null;
//        String TENCHUYEN = null;
//        String NGAYDI = null;
//        String NGAYVE = null;
//        String GIA = null;
//        String SL = null;
//        data.findCHUYEN(model, MACHUYEN, TENCHUYEN, NGAYDI, NGAYVE, GIA, SL);
//        data.findCHUYEN(model, '', '', '', '', '', '');
    }//GEN-LAST:event_txtMACHUYENPropertyChange

    private void txtMACHUYENKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMACHUYENKeyReleased
        // TODO add your handling code here:
        String searchString = txtMACHUYEN.getText();
        search(searchString);
    }//GEN-LAST:event_txtMACHUYENKeyReleased

    private void txtTENCHUYENKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTENCHUYENKeyReleased
        String searchString = txtTENCHUYEN.getText();
        search(searchString);
    }//GEN-LAST:event_txtTENCHUYENKeyReleased

    private void txtMACHUYENKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMACHUYENKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtMACHUYENKeyTyped

    private void txtMACHUYENKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMACHUYENKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtMACHUYENKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private dulich.Swing.RoundJPanel roundJPanel1;
    private dulich.Swing.RoundJPanel roundJPanel4;
    private dulich.Swing.RoundJPanel roundJPanel5;
    private dulich.Swing.RoundJPanel roundJPanel9;
    private dulich.Swing.CustomTable tbTour;
    private dulich.Swing.PlaceholderText txtMACHUYEN;
    private dulich.Swing.PlaceholderText txtSL;
    private dulich.Swing.PlaceholderText txtTENCHUYEN;
    // End of variables declaration//GEN-END:variables
}
