/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ngo.ngoWorker;

import business.util.request.RequestItem;
import business.workQueue.CollectionWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vighnesh
 */
public class NGOWorkerViewRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOWorkerViewRequestJPanel
     */
    private JPanel userProcessContainer;
    private CollectionWorkRequest request;

    NGOWorkerViewRequestJPanel(JPanel userProcessContainer, CollectionWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        populateTable();
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblCost = new javax.swing.JLabel();
        lblQuantityVal = new javax.swing.JLabel();
        lblCostVal = new javax.swing.JLabel();
        lblRequestStatusVal = new javax.swing.JLabel();
        lblRequestDateVal = new javax.swing.JLabel();
        lblRequestFromVal = new javax.swing.JLabel();
        lblRequestDate = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblRequestStatus = new javax.swing.JLabel();
        lblRequestFrom = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Quantity", "Hours to perish"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblDetails);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("NGO Worker - View Request Details");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCost.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCost.setText("Pickup Cost:");

        lblQuantityVal.setText("<quantity>");

        lblCostVal.setText("<cost>");

        lblRequestStatusVal.setText("<request_status>");

        lblRequestDateVal.setText("<request_date>");

        lblRequestFromVal.setText("<request_from>");

        lblRequestDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestDate.setText("Request Date:");

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblQuantity.setText("Food Quantity:");

        lblRequestStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestStatus.setText("Request status:");

        lblRequestFrom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestFrom.setText("Request from:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRequestFrom)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCost)
                        .addGap(47, 47, 47)
                        .addComponent(lblCostVal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblRequestStatus)
                                    .addGap(26, 26, 26))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblRequestDate)
                                    .addGap(35, 35, 35)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblQuantity)
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantityVal)
                            .addComponent(lblRequestDateVal)
                            .addComponent(lblRequestStatusVal)
                            .addComponent(lblRequestFromVal)))
                    .addComponent(jLabel1))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestFrom)
                    .addComponent(lblRequestFromVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestDate)
                    .addComponent(lblRequestDateVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestStatus)
                    .addComponent(lblRequestStatusVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(lblQuantityVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost)
                    .addComponent(lblCostVal))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblCostVal;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantityVal;
    private javax.swing.JLabel lblRequestDate;
    private javax.swing.JLabel lblRequestDateVal;
    private javax.swing.JLabel lblRequestFrom;
    private javax.swing.JLabel lblRequestFromVal;
    private javax.swing.JLabel lblRequestStatus;
    private javax.swing.JLabel lblRequestStatusVal;
    private javax.swing.JTable tblDetails;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
        dtm.setRowCount(0);

        for (RequestItem ri : request.getRequestItems()) {

            Object row[] = new Object[3];
            row[0] = ri;
            row[1] = ri.getQuantity() == 0 ? "Sold Out" : ri.getQuantity();
            row[2] = ri.getHoursToPerish();

            dtm.addRow(row);
        }
    }

    private void populateData() {

        String status = request.getStatus();

        lblRequestStatusVal.setText(status);
        lblRequestFromVal.setText(request.getRaisedByRestaurant());
        lblRequestDateVal.setText(request.getRequestDate() + "");
        lblQuantityVal.setText(request.getTotalQuantity() + " pounds");

        String cost = request.getDeliveryCost() == 0 ? "Undelivered" : "$" + request.getDeliveryCost();
        lblCostVal.setText(cost);
    }
}
