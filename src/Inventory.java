

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Inventory extends javax.swing.JFrame {

    public Inventory() {
        initComponents();
        Connect();
        tableReaload();
    }

    
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InventorySystem","root","Silvatkp99");               

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

    
    public void tableReaload(){
        
        int c;
        
        try {
            pst =con.prepareStatement("select * from ItemsTable");
            rs = pst.executeQuery();
            
            
            ResultSetMetaData rsd;
            rsd =rs.getMetaData();
            c = rsd.getColumnCount();
            
            DefaultTableModel d =(DefaultTableModel) ItemTable.getModel();
            d.setRowCount(0);
            
            while(rs.next()){
                Vector v =new Vector();
                
                for(int i=1; i<=c;i++){
                    v.add(rs.getInt("Item_No"));
                    v.add(rs.getString("Name"));
                    v.add(rs.getInt("Quantity"));
                    v.add(rs.getDouble("Price"));
                } 
                
                d.addRow(v);
            }
     
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        menuBar3 = new java.awt.MenuBar();
        menu5 = new java.awt.Menu();
        menu6 = new java.awt.Menu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mainJPanel = new javax.swing.JPanel();
        scrollTable = new javax.swing.JScrollPane();
        ItemTable = new javax.swing.JTable();
        Tabs = new javax.swing.JTabbedPane();
        tabAdd = new javax.swing.JPanel();
        txtAddItemName = new javax.swing.JTextField();
        txtAddItemQuantity = new javax.swing.JTextField();
        txtAddItemPrice = new javax.swing.JTextField();
        btnDeleteItem = new javax.swing.JButton();
        txtDeleteItem = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRemoveItem = new javax.swing.JButton();
        tabUpdate = new javax.swing.JPanel();
        txtUpdateItemID = new javax.swing.JTextField();
        txtUpdateItemName = new javax.swing.JTextField();
        txtUpdateItemQunt = new javax.swing.JTextField();
        txtUpdateItemPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        menu5.setLabel("File");
        menuBar3.add(menu5);

        menu6.setLabel("Edit");
        menuBar3.add(menu6);

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainJPanel.setBackground(new java.awt.Color(102, 102, 102));

        ItemTable.setBackground(new java.awt.Color(204, 204, 204));
        ItemTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 51, 204)));
        ItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Index No.", "Item", "Qty.", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ItemTable.getTableHeader().setReorderingAllowed(false);
        ItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemTableMouseClicked(evt);
            }
        });
        scrollTable.setViewportView(ItemTable);

        Tabs.setBackground(new java.awt.Color(51, 153, 255));
        Tabs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 51, 153)));
        Tabs.setForeground(new java.awt.Color(255, 51, 102));
        Tabs.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        tabAdd.setBackground(new java.awt.Color(204, 204, 204));

        txtAddItemName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 51, 153)));
        txtAddItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddItemNameActionPerformed(evt);
            }
        });

        txtAddItemQuantity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 51, 153)));
        txtAddItemQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddItemQuantityActionPerformed(evt);
            }
        });

        txtAddItemPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 51, 153)));
        txtAddItemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddItemPriceActionPerformed(evt);
            }
        });

        btnDeleteItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteItem.setText("Delete");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        txtDeleteItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 51, 153)));
        txtDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteItemActionPerformed(evt);
            }
        });

        btnAddItem.setText("ADD");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        jLabel4.setText("ITEM");

        jLabel10.setText("QTY.");

        jLabel11.setText("PRICE");

        jLabel1.setText("ITEM");

        btnRemoveItem.setText("CLEAR");
        btnRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabAddLayout = new javax.swing.GroupLayout(tabAdd);
        tabAdd.setLayout(tabAddLayout);
        tabAddLayout.setHorizontalGroup(
            tabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAddLayout.createSequentialGroup()
                .addGroup(tabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabAddLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabAddLayout.createSequentialGroup()
                        .addGroup(tabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabAddLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(tabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(tabAddLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabAddLayout.createSequentialGroup()
                                .addComponent(btnAddItem)
                                .addGap(31, 31, 31)
                                .addComponent(btnRemoveItem)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtAddItemName)
                            .addComponent(txtAddItemQuantity)
                            .addComponent(txtAddItemPrice))))
                .addContainerGap())
            .addGroup(tabAddLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnDeleteItem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabAddLayout.setVerticalGroup(
            tabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(tabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(34, 34, 34)
                .addGroup(tabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtAddItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(tabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem)
                    .addComponent(btnRemoveItem))
                .addGap(54, 54, 54)
                .addGroup(tabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btnDeleteItem)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        Tabs.addTab("Add/Delete", tabAdd);

        tabUpdate.setBackground(new java.awt.Color(204, 204, 204));
        tabUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 51, 153)));

        txtUpdateItemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateItemIDActionPerformed(evt);
            }
        });

        txtUpdateItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateItemNameActionPerformed(evt);
            }
        });

        txtUpdateItemQunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateItemQuntActionPerformed(evt);
            }
        });

        txtUpdateItemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateItemPriceActionPerformed(evt);
            }
        });

        jLabel5.setText("Item");

        btnSearch.setText("Save Changes");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel6.setText("Change Item Name");

        jLabel8.setText("Qty");

        jLabel9.setText("Price");

        javax.swing.GroupLayout tabUpdateLayout = new javax.swing.GroupLayout(tabUpdate);
        tabUpdate.setLayout(tabUpdateLayout);
        tabUpdateLayout.setHorizontalGroup(
            tabUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabUpdateLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(tabUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUpdateItemID, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(txtUpdateItemPrice)
                    .addComponent(txtUpdateItemName)
                    .addComponent(txtUpdateItemQunt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabUpdateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        tabUpdateLayout.setVerticalGroup(
            tabUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabUpdateLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(tabUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(41, 41, 41)
                .addGroup(tabUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(44, 44, 44)
                .addGroup(tabUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateItemQunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(60, 60, 60)
                .addGroup(tabUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(44, 44, 44)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Tabs.addTab("Update", tabUpdate);

        jButton3.setText("DISPLAY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainJPanelLayout = new javax.swing.GroupLayout(mainJPanel);
        mainJPanel.setLayout(mainJPanelLayout);
        mainJPanelLayout.setHorizontalGroup(
            mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainJPanelLayout.createSequentialGroup()
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)))
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainJPanelLayout.setVerticalGroup(
            mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addComponent(scrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddItemNameActionPerformed

    private void txtAddItemQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddItemQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddItemQuantityActionPerformed

    private void txtAddItemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddItemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddItemPriceActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        //Delete Button

        DefaultTableModel d1 =(DefaultTableModel )ItemTable.getModel();
        int selectIndex =ItemTable.getSelectedRow();
        
        int id =Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        txtDeleteItem.setText(Integer.toString(id));
        
        

            if (txtDeleteItem.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter item!", "Oops Wait...!", JOptionPane.ERROR_MESSAGE);
            }
            else {
                
                try {
                    pst = con.prepareStatement("delete from ItemsTable where Item_No=?");
                    
                    pst.setInt(1, id);
                    int k = pst.executeUpdate();
                    
                    if(k==1){
                        
                        txtDeleteItem.setText("");
                        tableReaload();
                        JOptionPane.showMessageDialog(null, "Succesfully Deleted!", "Ok!  :-)", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
                }
                

                
                


                String[] itemline = new String[100];
                String[] temp;
                String delete = txtDeleteItem.getText();
                boolean found = false;



                
                //JOptionPane.showMessageDialog(null, "Item is already not in the list!", "Ooops!", JOptionPane.ERROR_MESSAGE);
                
                JOptionPane.showMessageDialog(null, "Succesfully Deleted!", "Ok!  :-)", JOptionPane.INFORMATION_MESSAGE);

                txtDeleteItem.setText("");

            }

    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void txtDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteItemActionPerformed
       
    }//GEN-LAST:event_txtDeleteItemActionPerformed

    private void txtUpdateItemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateItemIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateItemIDActionPerformed

    private void txtUpdateItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateItemNameActionPerformed
        //jButton8ActionPerformed(evt);
    }//GEN-LAST:event_txtUpdateItemNameActionPerformed

    private void txtUpdateItemQuntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateItemQuntActionPerformed
       // jButton8ActionPerformed(evt);
    }//GEN-LAST:event_txtUpdateItemQuntActionPerformed

    private void txtUpdateItemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateItemPriceActionPerformed
       // jButton8ActionPerformed(evt);
    }//GEN-LAST:event_txtUpdateItemPriceActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // Save Changes(Update)

        try{
            if( txtUpdateItemID.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Enter item!", "Ooops Wait...!", JOptionPane.ERROR_MESSAGE);

            else{
                BufferedReader rdfile= new BufferedReader( new FileReader("items.txt"));

                String[] itemline= new String[100];
                String temp[];
                String search= "", prod="", Qty="", Price="";
                search= txtUpdateItemID.getText();
                int qty=0, x=0; double price=0.0;
                boolean found= false;

                prod= txtUpdateItemName.getText();
                Qty= txtUpdateItemQunt.getText();
                Price= txtUpdateItemPrice.getText();
                if( (!(prod.equals(""))) || (!(Qty.equals(""))) || (!(Price.equals(""))) ){
                    while(( itemline[x]= rdfile.readLine()) != null){
                        temp= itemline[x].split("\t");

                        if( search.equals( temp[0])){
                            if( prod.equals(""))
                            prod= temp[0];
                            if( Qty.equals(""))
                            qty= Integer.parseInt(temp[1]);
                            else
                            qty= Integer.parseInt( Qty )+ Integer.parseInt(temp[1]);

                            if( Price.equals(""))
                            price= Double.parseDouble(temp[2]);
                            else
                            price= Double.parseDouble( Price);

                            itemline[x]= prod+"\t"+qty+"\t"+price;
                            found= true;
                        }
                        x++;

                    }
                    rdfile.close();

                    if( found ){
                        PrintWriter wrfile= new PrintWriter( new FileWriter("items.txt"));

                        for( int j=0; itemline[j] != null; j++)
                        wrfile.println( itemline[j]);

                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Changes Saved!");
                    } else
                    JOptionPane.showMessageDialog(null, "Item Not Found!");

                    txtUpdateItemID.setText("");
                    txtUpdateItemName.setText("");
                    txtUpdateItemQunt.setText("");
                    txtUpdateItemPrice.setText("");

                } else
                JOptionPane.showMessageDialog( null, "No Changes Yet!");
            }

        }catch(IOException e){} catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some input may be invalid!");

            txtUpdateItemID.setText("");
            txtUpdateItemName.setText("");
            txtUpdateItemQunt.setText("");
            txtUpdateItemPrice.setText("");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // Add Button
        
        


        try {
            if (txtAddItemName.getText().equals("") || txtAddItemQuantity.getText().equals("") ||  txtAddItemQuantity.getText().equals("")  ) {
                JOptionPane.showMessageDialog(null, "Enter item!", "Oops Wait...!", JOptionPane.ERROR_MESSAGE);
            } else {
                
               
                String name =txtAddItemName.getText();
                String sQunt=txtAddItemQuantity.getText();
                String sPrice=txtAddItemQuantity.getText();
                
                int Iqunt = Integer.parseInt(sQunt);
                double IPrice = Double.parseDouble(sQunt);
                
                
                try {
                    pst =con.prepareStatement("Insert into ItemsTable(Name,Quantity,Price) Value(?,?,?)");
                    
                    pst.setString(1, name);
                    pst.setInt(2, Iqunt);
                    pst.setDouble(3, IPrice);
       
                   int k = pst.executeUpdate();
                    
                   if(k==1){
                    txtAddItemName.setText("");
                    txtAddItemQuantity.setText("");
                    txtAddItemPrice.setText("");
                    txtAddItemName.requestFocus();
                    tableReaload();
                    
                    JOptionPane.showMessageDialog(null, "Succesfully Added!", " Ok!  :-)", JOptionPane.INFORMATION_MESSAGE);
                   }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
                }

                //JOptionPane.showMessageDialog(null, "Inventory Full!", "Warning!", JOptionPane.WARNING_MESSAGE);
                }
            

//            txtAddItemName.setText("");
//            txtAddItemQuantity.setText("");
//            txtAddItemPrice.setText("");

        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Some input may be invalid!", "Warning!", JOptionPane.WARNING_MESSAGE);
            txtAddItemName.setText("");
            txtAddItemQuantity.setText("");
            txtAddItemPrice.setText("");
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Display Button
        
        try {
                for (int r = 0; r < 100; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        ItemTable.setValueAt(null, r, c);
                    }
                }

                BufferedReader rdfile = new BufferedReader(new FileReader("items.txt"));

                String[] item = new String[100];
                String[] temp;

                int x = 0;  //read item
                while ((item[x] = rdfile.readLine()) != null) {
                    temp = item[x].split("\t");
                    ItemTable.setValueAt(( x + 1), x, 0);
                    for (int j = 1; j < 4; j++) {
                        ItemTable.setValueAt(temp[j - 1], x, j);
                    }

                    x++;
                }
                rdfile.close();

            } catch (IOException e) {
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveItemActionPerformed
         //Clear Button(Add/Delete)

        txtAddItemName.setText("");
        txtAddItemQuantity.setText("");
        txtAddItemPrice.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveItemActionPerformed

    private void ItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemTableMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel d1 =(DefaultTableModel )ItemTable.getModel();
        int selectIndex =ItemTable.getSelectedRow();
        
        int id =Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        txtDeleteItem.setText(Integer.toString(id));
    }//GEN-LAST:event_ItemTableMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ItemTable;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnRemoveItem;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel mainJPanel;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JPanel tabAdd;
    private javax.swing.JPanel tabUpdate;
    private javax.swing.JTextField txtAddItemName;
    private javax.swing.JTextField txtAddItemPrice;
    private javax.swing.JTextField txtAddItemQuantity;
    private javax.swing.JTextField txtDeleteItem;
    private javax.swing.JTextField txtUpdateItemID;
    private javax.swing.JTextField txtUpdateItemName;
    private javax.swing.JTextField txtUpdateItemPrice;
    private javax.swing.JTextField txtUpdateItemQunt;
    // End of variables declaration//GEN-END:variables
}
