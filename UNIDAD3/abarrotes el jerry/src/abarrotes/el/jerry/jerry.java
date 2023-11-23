
package abarrotes.el.jerry;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class jerry extends javax.swing.JFrame {
    String productos[]= {"Maruchan","Cigarros","Cafe","Gorditas de nata","Tamales","Quesadillas"};
    double precios[]={25.0,75.0,20.0,16.0,20.0,85.0};
    
    double precio=0;
    int cantidad=0;
    
    DefaultComboBoxModel comboModel = new DefaultComboBoxModel(productos);
    DefaultTableModel tableModel = new DefaultTableModel();
    
    
    public boolean buscarVenta(Ventas nueva) {
    for (Ventas v : listaVentas) {
        if (v.getId() == nueva.getId()) {
            int nuevaCantidad=v.getCantidad()+nueva.getCantidad();
            v.setCantidad(nuevaCantidad);
            v.setImporte(v.getImporte()*nuevaCantidad);
            return true; 
        }
    }
    return false; 
}

    
    public void borrarVenta(){
        
        precio = 0;
        cantidad = 1;
        cboproductos.setSelectedIndex(0);
        spnCantidad.setValue(1);
        calcularPrecio();
    }
   
    
    
    
    
     ArrayList<Ventas> listaVentas = new ArrayList<Ventas>();              
    
    public jerry() {
        initComponents();
        this.setTitle("Abarrotes el Jerry");
        this.setLocationRelativeTo(null);
        
        cboproductos.setModel(comboModel);
        tableModel.addColumn("Descripcion");
        tableModel.addColumn("Precio U");
        tableModel.addColumn("Cantidad");
        tableModel.addColumn(("Importe"));
        
        actualizar();
        calcularPrecio();
    
    }
   ////alteracion 
    public String aMoneda (double precio){
       return "$ " + Math.round(precio * 100.0) / 100.0 + "MXN";
    }
    
    
    
    public void actualizar(){
        
        
        tblProductos.setModel(tableModel);
        while (tableModel.getRowCount()>0){
             tableModel.removeRow(0);
        }
        
        double subtotal=0;
        for(Ventas v: listaVentas){
            Object x[]= new Object[4];
            x[0] = v.getDescripcion();
            x[1] = aMoneda(v.getPrecio());
            x[2] = v.getCantidad();
            x[3] = aMoneda(v.getImporte());
            subtotal+=v.getImporte();
            tableModel.addRow(x);
      //////alteracion             
        
        }
        
        double iva=0.16;
        double total=subtotal+iva;
        double tot=subtotal*iva;
        lblSubtotal.setText(aMoneda(subtotal));
        lblIVA.setText(aMoneda(iva));
        lblTotal.setText(aMoneda(total));
    
    }
    
     

     
     
   
    
    

    
    public void calcularPrecio(){
    precio = precios [cboproductos.getSelectedIndex()];
    cantidad = Integer.parseInt (spnCantidad.getValue().toString());
    lblCosto.setText(aMoneda(precio));
    lblImporte.setText(aMoneda(precio*cantidad));
     
    
        
        
        
    
        
        
        
    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblcantidad = new javax.swing.JLabel();
        cboproductos = new javax.swing.JComboBox();
        spnCantidad = new javax.swing.JSpinner();
        costo = new javax.swing.JLabel();
        Importe = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblImporte = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        Subtotal = new javax.swing.JLabel();
        IVA = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        lblProducto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblProducto.setText("Producto");

        lblcantidad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblcantidad.setText("Cantidad");

        cboproductos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboproductosActionPerformed(evt);
            }
        });

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 0, 10, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });

        costo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        costo.setText("Costo");

        Importe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Importe.setText("Importe");

        lblCosto.setText("0.0 MX");

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblImporte.setText("0.0 MX");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        Subtotal.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Subtotal.setText("Subtotal");

        IVA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IVA.setText("IVA");

        Total.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Total.setText("Total");

        lblSubtotal.setText("0.0 MX");

        lblIVA.setText("0.0 MX");

        lblTotal.setText("0.0 MX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Importe)
                            .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCosto)
                            .addComponent(lblImporte))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(Total))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(IVA))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Subtotal)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIVA)
                            .addComponent(lblSubtotal)
                            .addComponent(lblTotal))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProducto)
                            .addComponent(cboproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costo)
                            .addComponent(lblCosto))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcantidad)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Importe)
                            .addComponent(lblImporte)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subtotal)
                            .addComponent(lblSubtotal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IVA)
                            .addComponent(lblIVA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Total)
                            .addComponent(lblTotal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       Ventas ventas = new Ventas();       
       ventas.setId(cboproductos.getSelectedIndex());
       ventas.setDescripcion(cboproductos.getSelectedItem().toString());
       ventas.setPrecio(precio);
       ventas.setCantidad(cantidad);
       ventas.setImporte(precio*cantidad);
       if (!buscarVenta(ventas)){
       listaVentas.add(ventas);   
           
       }
    
       ////////alteracion          
      
     

       
       
      
        
        
        
       
       
      
     

       actualizar();
       
       
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboproductosActionPerformed
        // TODO add your handling code here:
        
        calcularPrecio();
    }//GEN-LAST:event_cboproductosActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        // TODO add your handling code here:
        calcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(jerry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jerry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jerry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jerry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jerry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IVA;
    private javax.swing.JLabel Importe;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JLabel Total;
    private javax.swing.JComboBox cboproductos;
    private javax.swing.JLabel costo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}