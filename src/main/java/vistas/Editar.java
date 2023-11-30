/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import inplimentacion.DAOProductoImpl;
import interfazDAO.DAOProducto;
import javax.swing.JOptionPane;
import tablas.TablaProducto;

/**
 *
 * @author ISABELLA
 */
public class Editar extends javax.swing.JFrame {

    /**
     * Creates new form Registrar
     */
    public Editar() {
        initComponents();
        setLocationRelativeTo(null);
        //con esta linea se hace que la ventana emerquente se cierre pero no toda mi app
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

    }

    public void cargarDatos(TablaProducto producto) {
        // Configurar los campos de texto u otros componentes con los detalles del producto
        txtId.setText(String.valueOf(producto.getId()));
        txtNombre.setText(producto.getNombre());
        txtDecripcion.setText(producto.getDescripcion());
        txtIva.setText(String.valueOf(producto.getIva()));
        txtPrecioCompra.setText(String.valueOf(producto.getPrecioUnidadCompra()));
        txtPrecioVenta.setText(String.valueOf(producto.getPrecioUnidadVenta()));

        txtId.setEditable(false);
    }

    private boolean esEntero() {
        try {
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean esDouble() {
        try {

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        contenedorFormulario = new javax.swing.JPanel();
        tituloId = new javax.swing.JLabel();
        tituliNombre = new javax.swing.JLabel();
        tituloDescripcion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        ScrollDescripcion = new javax.swing.JScrollPane();
        txtDecripcion = new javax.swing.JTextArea();
        guardar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        tituloPrecioCompra = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        tituloIva = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        tituloPrecioventa = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("EDITAR");

        tituloId.setText("id producto");

        tituliNombre.setText("nombre");

        tituloDescripcion.setText("descripcion");

        txtDecripcion.setColumns(20);
        txtDecripcion.setRows(5);
        ScrollDescripcion.setViewportView(txtDecripcion);

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        tituloPrecioCompra.setText("precio compra unidad");

        tituloIva.setText("iva");

        tituloPrecioventa.setText("precio venta unidad");

        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });

        jButton1.setText("CALCULAR PRECIO VENTA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorFormularioLayout = new javax.swing.GroupLayout(contenedorFormulario);
        contenedorFormulario.setLayout(contenedorFormularioLayout);
        contenedorFormularioLayout.setHorizontalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScrollDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(tituloId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrecioCompra)
                    .addComponent(tituloPrecioCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                .addComponent(tituliNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorFormularioLayout.createSequentialGroup()
                                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                        .addComponent(guardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(limpiar))
                                    .addComponent(tituloPrecioventa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tituloIva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIva, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioVenta))
                                .addGap(15, 15, 15))))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)
                        .addGap(0, 62, Short.MAX_VALUE))))
        );
        contenedorFormularioLayout.setVerticalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituliNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloPrecioCompra)
                    .addComponent(tituloPrecioventa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloIva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardar)
                            .addComponent(limpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(ScrollDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(contenedorFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        txtId.setText("");
        txtDecripcion.setText("");
        txtNombre.setText("");
        txtIva.setText("");
        txtPrecioCompra.setText("");
        txtPrecioVenta.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try {
            String id = txtId.getText();
            String nombre = txtNombre.getText();
            String descripcion = txtDecripcion.getText();
            String precioCompraStr = txtPrecioCompra.getText();
            String ivaStr = txtIva.getText();
            String precioVentaStr = txtPrecioVenta.getText();

            boolean todasLasValidacionesExitosas = true;

            if (id.isEmpty() || nombre.isEmpty() || descripcion.isEmpty() || precioCompraStr.isEmpty()
                    || ivaStr.isEmpty() || precioVentaStr.isEmpty()) {
                // Mostrar un mensaje de error o realizar alguna acción si algún campo está vacío
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                todasLasValidacionesExitosas = false;
            }
            TablaProducto producto = new TablaProducto();
            producto.setNombre(nombre);
            producto.setDescripcion(descripcion);

            // Convertir las cadenas a los tipos de datos adecuados y validar            
            if (esEntero()) {
                int inId = Integer.parseInt(id);
                producto.setId(inId);

            } else {
                todasLasValidacionesExitosas = false;
            }
            if (esEntero()) {
                int precioCompra = Integer.parseInt(precioCompraStr);
                producto.setPrecioUnidadCompra(precioCompra);

            } else {
                todasLasValidacionesExitosas = false;
            }
            if (esEntero()) {
                int iva = Integer.parseInt(ivaStr);
                producto.setIva(iva);

            } else {
                todasLasValidacionesExitosas = false;
            }

            if (esEntero()) {
                int precioVenta = Integer.parseInt(precioVentaStr);
                producto.setPrecioUnidadVenta(precioVenta);

            } else {
                todasLasValidacionesExitosas = false;
            }

            if (todasLasValidacionesExitosas) {
                try {
                    DAOProducto dao = new DAOProductoImpl();
                    dao.modificar(producto);
                    JOptionPane.showMessageDialog(this, "Producto modificado correctamente.",
                            "MODIFICACION EXITOXA", JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception e) {

                }
            } else {

            }
        } catch (Exception e) {
            String mensajeUsuario = "no se puede registrar el producto por que los valores de PRECIO O IVAN "
                    + "son INVALIDOS";
            JOptionPane.showMessageDialog(this, mensajeUsuario,
                    "MENSAJE ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (esEntero() && esDouble()) {
            TablaProducto producto = new TablaProducto();
            String precioCompraStr = txtPrecioCompra.getText();
            String ivaStr = txtIva.getText();

            int precioCompra = Integer.parseInt(precioCompraStr);
            producto.setPrecioUnidadCompra(precioCompra);
            double ivaPorcentaje = Double.parseDouble(ivaStr) / 100.0;
            producto.setIva((int) ivaPorcentaje);

            // Calcular el precio de venta sumándole el porcentaje de IVA al precio de compra
            double precioVenta = precioCompra + (precioCompra * ivaPorcentaje);
            txtPrecioVenta.setText(String.valueOf((int) precioVenta));
            producto.setPrecioUnidadVenta(precioCompra);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Editar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollDescripcion;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel contenedorFormulario;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel tituliNombre;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloDescripcion;
    private javax.swing.JLabel tituloId;
    private javax.swing.JLabel tituloIva;
    private javax.swing.JLabel tituloPrecioCompra;
    private javax.swing.JLabel tituloPrecioventa;
    private javax.swing.JTextArea txtDecripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables

}
