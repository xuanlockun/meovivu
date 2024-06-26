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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ACER
 */
public class TourForm extends javax.swing.JPanel {
    public DataAccess data;
    public DefaultTableModel model;
    /**
     * Creates new form TourForm
     */
    public TourForm() {
        initComponents();
        setVisible(true);
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
        txtNGAYDI.setText("");
        txtNGAYVE.setText("");
        txtGIA.setText("");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roundJPanel1 = new dulich.Swing.RoundJPanel();
        txtMACHUYEN = new dulich.Swing.PlaceholderText();
        roundJPanel2 = new dulich.Swing.RoundJPanel();
        txtNGAYDI = new dulich.Swing.PlaceholderText();
        roundJPanel3 = new dulich.Swing.RoundJPanel();
        txtNGAYVE = new dulich.Swing.PlaceholderText();
        roundJPanel5 = new dulich.Swing.RoundJPanel();
        txtTENCHUYEN = new dulich.Swing.PlaceholderText();
        roundJPanel6 = new dulich.Swing.RoundJPanel();
        txtGIA = new dulich.Swing.PlaceholderText();
        roundJPanel7 = new dulich.Swing.RoundJPanel();
        jLabel7 = new javax.swing.JLabel();
        roundJPanel8 = new dulich.Swing.RoundJPanel();
        jLabel8 = new javax.swing.JLabel();
        roundJPanel9 = new dulich.Swing.RoundJPanel();
        jLabel6 = new javax.swing.JLabel();
        roundJPanel4 = new dulich.Swing.RoundJPanel();
        txtSL = new dulich.Swing.PlaceholderText();
        jLabel9 = new javax.swing.JLabel();
        roundJPanel10 = new dulich.Swing.RoundJPanel();
        jLabel10 = new javax.swing.JLabel();

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Ngày về:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày đi:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Giá");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundJPanel1Layout.setVerticalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMACHUYEN, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtNGAYDI.setBackground(new java.awt.Color(195, 243, 255));
        txtNGAYDI.setForeground(new java.awt.Color(0, 0, 0));
        txtNGAYDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNGAYDIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundJPanel2Layout = new javax.swing.GroupLayout(roundJPanel2);
        roundJPanel2.setLayout(roundJPanel2Layout);
        roundJPanel2Layout.setHorizontalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtNGAYDI, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundJPanel2Layout.setVerticalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNGAYDI, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtNGAYVE.setBackground(new java.awt.Color(195, 243, 255));
        txtNGAYVE.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout roundJPanel3Layout = new javax.swing.GroupLayout(roundJPanel3);
        roundJPanel3.setLayout(roundJPanel3Layout);
        roundJPanel3Layout.setHorizontalGroup(
            roundJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtNGAYVE, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundJPanel3Layout.setVerticalGroup(
            roundJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNGAYVE, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
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

        txtGIA.setBackground(new java.awt.Color(195, 243, 255));
        txtGIA.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout roundJPanel6Layout = new javax.swing.GroupLayout(roundJPanel6);
        roundJPanel6.setLayout(roundJPanel6Layout);
        roundJPanel6Layout.setHorizontalGroup(
            roundJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtGIA, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        roundJPanel6Layout.setVerticalGroup(
            roundJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGIA, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundJPanel8Layout.setVerticalGroup(
            roundJPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundJPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundJPanel9MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("THÊM");

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

        roundJPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundJPanel10MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("CLEAR");

        javax.swing.GroupLayout roundJPanel10Layout = new javax.swing.GroupLayout(roundJPanel10);
        roundJPanel10.setLayout(roundJPanel10Layout);
        roundJPanel10Layout.setHorizontalGroup(
            roundJPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundJPanel10Layout.setVerticalGroup(
            roundJPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(roundJPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundJPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(roundJPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundJPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundJPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundJPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roundJPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roundJPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roundJPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roundJPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundJPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundJPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundJPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundJPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundJPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundJPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTENCHUYENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTENCHUYENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTENCHUYENActionPerformed

    private void txtNGAYDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNGAYDIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNGAYDIActionPerformed

    private void roundJPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundJPanel9MouseClicked
        // TODO add your handling code here:
        String MACHUYEN = txtMACHUYEN.getText();
        String TENCHUYEN = txtTENCHUYEN.getText();
        String NGAYDI = txtNGAYDI.getText();
        String NGAYVE = txtNGAYVE.getText();
        String GIA = txtGIA.getText();
        String SL = txtSL.getText();
        try{
                      String sqlquery = "INSERT INTO CHUYEN VALUES(?,?,?,?,?,?,'Binh thuong',1)";
                      PreparedStatement pst = data.getConnection().prepareStatement(sqlquery);
                      pst.setString(1,MACHUYEN);
                      pst.setString(2,TENCHUYEN);
                      pst.setString(3,NGAYDI);
                      pst.setString(4,NGAYVE);
                      pst.setString(5,GIA);
                      pst.setString(6,SL);
                      ResultSet rs=pst.executeQuery();

                  }catch(HeadlessException | SQLException e){
//                      JOptionPane.showMessageDialog(null, e);
                      JOptionPane.showMessageDialog(null,"Mã chuyến đã bị trùng");
                  }
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
            txtNGAYDI.setText(tbTour.getValueAt(indextb, 2).toString());
            txtNGAYVE.setText(tbTour.getValueAt(indextb, 3).toString());
            txtGIA.setText(tbTour.getValueAt(indextb, 4).toString());
            txtSL.setText(tbTour.getValueAt(indextb, 5).toString());
        }
    }//GEN-LAST:event_tbTourMouseClicked

    private void roundJPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundJPanel7MouseClicked
        // TODO add your handling code here:
        int indextb = tbTour.getSelectedRow();
        String MACHUYEN =tbTour.getValueAt(indextb, 0).toString();
        int ret = JOptionPane.showConfirmDialog(null,"Bạn chắc chắn xóa chưa", "Chắn chắn chưa", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){

            String sql = "DELETE FROM CHUYEN WHERE MACHUYEN = ?";
            try {
                PreparedStatement pst = data.getConnection().prepareStatement(sql);
                pst.setString(1, MACHUYEN);
                pst.executeUpdate();
                data.fetchCHUYEN(model,"1");
            } catch (SQLException ex) {
                Logger.getLogger(TourForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        clear();
        data.fetchCHUYEN(model,"1");
        String searchString = txtMACHUYEN.getText();
        search(searchString);
    }//GEN-LAST:event_roundJPanel7MouseClicked

    private void roundJPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundJPanel8MouseClicked
        // TODO add your handling code here:
        String MACHUYEN = txtMACHUYEN.getText();
        String TENCHUYEN = txtTENCHUYEN.getText();
        String NGAYDI = txtNGAYDI.getText();
        String NGAYVE = txtNGAYVE.getText();
        String GIA = txtGIA.getText();
        String SL = txtSL.getText();
        try{
                      String sqlquery = "UPDATE CHUYEN SET TENCHUYEN = ?, NGAYDI = ?, NGAYDEN = ?, GIACHUYEN = ?, SOLUONGVE=?, MOTA='Normal', MATOUR=1  WHERE MACHUYEN = ? ";
                      PreparedStatement pst = data.getConnection().prepareStatement(sqlquery);
                      pst.setString(6,MACHUYEN);
                      pst.setString(1,TENCHUYEN);
                      pst.setString(2,NGAYDI);
                      pst.setString(3,NGAYVE);
                      pst.setString(4,GIA);
                      pst.setString(5,SL);
                      ResultSet rs=pst.executeQuery();

                  }catch(HeadlessException | SQLException e){
                      JOptionPane.showMessageDialog(null, e);
                  }
        clear();
        data.fetchCHUYEN(model,"1");
    }//GEN-LAST:event_roundJPanel8MouseClicked

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

    private void roundJPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundJPanel10MouseClicked
        // TODO add your handling code here:
        clear();
        data.fetchCHUYEN(model,"1");
        String searchString = txtMACHUYEN.getText();
        search(searchString);
    }//GEN-LAST:event_roundJPanel10MouseClicked

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private dulich.Swing.RoundJPanel roundJPanel1;
    private dulich.Swing.RoundJPanel roundJPanel10;
    private dulich.Swing.RoundJPanel roundJPanel2;
    private dulich.Swing.RoundJPanel roundJPanel3;
    private dulich.Swing.RoundJPanel roundJPanel4;
    private dulich.Swing.RoundJPanel roundJPanel5;
    private dulich.Swing.RoundJPanel roundJPanel6;
    private dulich.Swing.RoundJPanel roundJPanel7;
    private dulich.Swing.RoundJPanel roundJPanel8;
    private dulich.Swing.RoundJPanel roundJPanel9;
    private dulich.Swing.CustomTable tbTour;
    private dulich.Swing.PlaceholderText txtGIA;
    private dulich.Swing.PlaceholderText txtMACHUYEN;
    private dulich.Swing.PlaceholderText txtNGAYDI;
    private dulich.Swing.PlaceholderText txtNGAYVE;
    private dulich.Swing.PlaceholderText txtSL;
    private dulich.Swing.PlaceholderText txtTENCHUYEN;
    // End of variables declaration//GEN-END:variables
}
