/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.restaurante.Vistas;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import proyecto.restaurante.Control.*;
import proyecto.restaurante.Entidades.*;

/**
 *
 * @author Emito
 */
public class CargaProductosView extends javax.swing.JInternalFrame {
    private static Producto p;
    private ProductoData productoData;
    
    public CargaProductosView() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        estilos();
        jcbProductos.setEnabled(false);
        jcbInactivo.setEnabled(false);
        jrbActivo.setSelected(true);
        jrbInactivo.setSelected(false);
        jlIdProducto.setVisible(false);
        jbActualizarProducto.setEnabled(false);
        productoData = new ProductoData();
        
    }
    private void estilos(){
        Fondo.setBackground(new Color(35,34,36,210));
        TransparenciaCargar.setBackground(new Color(35,34,36,160));
        TransparenciaModificar.setBackground(new Color(35,34,36,160));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jbActualizarProducto = new javax.swing.JButton();
        TituloModificacion = new javax.swing.JLabel();
        jcbProductos = new javax.swing.JComboBox<>();
        Cerrar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jrbInactivo = new javax.swing.JRadioButton();
        jrbActivo = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jbCrearProducto = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        TituloCarga = new javax.swing.JLabel();
        JbLimpiar = new javax.swing.JButton();
        jcbInactivo = new javax.swing.JComboBox<>();
        jcbCategoria = new javax.swing.JComboBox<>();
        jtCantidad = new javax.swing.JTextField();
        TransparenciaCargar = new javax.swing.JLabel();
        TransparenciaModificar = new javax.swing.JLabel();
        jlIdProducto = new javax.swing.JLabel();
        FondoImagen = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        setPreferredSize(new java.awt.Dimension(540, 590));

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbActualizarProducto.setBackground(new java.awt.Color(153, 153, 0));
        jbActualizarProducto.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jbActualizarProducto.setForeground(new java.awt.Color(51, 51, 51));
        jbActualizarProducto.setText("Actualizar Producto");
        jbActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarProductoActionPerformed(evt);
            }
        });
        Fondo.add(jbActualizarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        TituloModificacion.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        TituloModificacion.setForeground(new java.awt.Color(255, 255, 255));
        TituloModificacion.setText("Seleccione Producto a Modificar.");
        Fondo.add(TituloModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jcbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbProductosMouseClicked(evt);
            }
        });
        jcbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProductosActionPerformed(evt);
            }
        });
        Fondo.add(jcbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 270, -1));

        Cerrar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("Exit");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
        });
        Fondo.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 50, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Seleccione Inactivos");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre:");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cantidad:");
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 130, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Categoria:");
        Fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 130, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Precio:");
        Fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 130, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Estado:");
        Fondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 130, 30));

        jtNombre.setBackground(new java.awt.Color(245, 233, 144));
        jtNombre.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        Fondo.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 320, -1));

        jtPrecio.setBackground(new java.awt.Color(245, 233, 144));
        jtPrecio.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        Fondo.add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 320, -1));

        jrbInactivo.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jrbInactivo.setForeground(new java.awt.Color(255, 255, 255));
        jrbInactivo.setText("Inactivo");
        jrbInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivoActionPerformed(evt);
            }
        });
        Fondo.add(jrbInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 120, -1));

        jrbActivo.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jrbActivo.setForeground(new java.awt.Color(255, 255, 255));
        jrbActivo.setText("Activo");
        jrbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivoActionPerformed(evt);
            }
        });
        Fondo.add(jrbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 120, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Seleccione Producto");
        Fondo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 190, 30));

        jbCrearProducto.setBackground(new java.awt.Color(153, 153, 0));
        jbCrearProducto.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jbCrearProducto.setForeground(new java.awt.Color(51, 51, 51));
        jbCrearProducto.setText("Cargar Producto");
        jbCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearProductoActionPerformed(evt);
            }
        });
        Fondo.add(jbCrearProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 140, -1));

        Titulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Carga y modificacion de Productos");
        Fondo.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TituloCarga.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        TituloCarga.setForeground(new java.awt.Color(255, 255, 255));
        TituloCarga.setText("Complete los Datos para un nuevo Producto");
        Fondo.add(TituloCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        JbLimpiar.setBackground(new java.awt.Color(153, 153, 0));
        JbLimpiar.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        JbLimpiar.setForeground(new java.awt.Color(51, 51, 51));
        JbLimpiar.setText("Limpiar Pantalla");
        JbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbLimpiarActionPerformed(evt);
            }
        });
        Fondo.add(JbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 130, -1));

        jcbInactivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbInactivoMouseClicked(evt);
            }
        });
        jcbInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbInactivoActionPerformed(evt);
            }
        });
        Fondo.add(jcbInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 270, -1));

        jcbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbCategoriaMouseClicked(evt);
            }
        });
        Fondo.add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 320, -1));

        jtCantidad.setBackground(new java.awt.Color(245, 233, 144));
        jtCantidad.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        Fondo.add(jtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 320, -1));

        TransparenciaCargar.setOpaque(true);
        Fondo.add(TransparenciaCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 46, 500, 140));

        TransparenciaModificar.setOpaque(true);
        Fondo.add(TransparenciaModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 500, 350));
        Fondo.add(jlIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 20, 20));

        FondoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/restaurante/resources/imagenes/FondoInternalFrames.jpg"))); // NOI18N
        FondoImagen.setLabelFor(Fondo);
        Fondo.add(FondoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarProductoActionPerformed
        try {
            p = new Producto();
            boolean cambiarTabla=false;
            int posicion=0;
            
                p.setIdProducto(Integer.parseInt(jlIdProducto.getText()));
                
            if (jtNombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ingrese nombre para el producto");
                jtNombre.requestFocus();
            }else{
                p.setNombre(jtNombre.getText());
                if (jtCantidad.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ingrese cantidad");
                    jtCantidad.requestFocus();
                }else{
                    p.setCantidad(Integer.parseInt(jtCantidad.getText()));
                    p.setCategoria((Categoria)jcbCategoria.getSelectedItem());
                    if (jtPrecio.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Ingrese precio");
                        jtPrecio.requestFocus();
                    }else{
                        p.setPrecio(Double.parseDouble(jtPrecio.getText()));

                        if (jrbActivo.isSelected()){
                                p.setEstado(true);
                            }else{
                                p.setEstado(false);
                        }

                        Producto productoActual = productoData.buscarProducto(p.getIdProducto());
                        if (productoActual.isEstado()!=p.isEstado()){
                            cambiarTabla=true;
                        }
                        productoData.modificarProducto(p);
                        if (cambiarTabla){
                            if (jcbProductos.isEnabled()){
                                List<Producto> listaInactivo = productoData.listarProductosInactivos();
                                    for (Producto prod:listaInactivo){
                                        if (prod.getIdProducto()==p.getIdProducto()){
                                            posicion = listaInactivo.indexOf(prod);
                                        }
                                    }
                                    jcbProductos.removeAllItems();
                                    jcbProductos.setEnabled(false);
                                    jcbInactivo.setEnabled(true);
                                    CargarComboInactivos();
                                    jcbInactivo.setSelectedIndex(posicion);
                            }else{
                                if (jcbInactivo.isEnabled()){
                                    List<Producto> listaProductos = productoData.listarProductos();
                                    for (Producto prod:listaProductos){
                                        if (prod.getIdProducto()==p.getIdProducto()){
                                            posicion= listaProductos.indexOf(prod);
                                        }
                                    }
                                    jcbInactivo.removeAllItems();
                                    jcbInactivo.setEnabled(false);
                                    jcbProductos.setEnabled(true);
                                    CargarComboProductos();
                                    jcbProductos.setSelectedIndex(posicion);
                                }
                            }
                        }else{
                            if (jcbProductos.isEnabled()){
                                jcbProductos.removeAllItems();
                                CargarComboProductos();
                                posicion=BuscarPosicionProductos(p);
                                jcbProductos.setSelectedIndex(posicion);
                            }else{
                                jcbInactivo.removeAllItems();
                                CargarComboInactivos();
                                posicion = BuscarPosicionInactivos(p);
                                jcbInactivo.setSelectedIndex(posicion);
                            }
                        }
                    }    
                }    
            }    
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"No puede ingresar letras en el campo de 'Cantidad' ni 'Precio'");
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this,"No puede haber campos vacios");
        }
    }//GEN-LAST:event_jbActualizarProductoActionPerformed

    private void jcbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductosActionPerformed
        
        if (jcbProductos.getItemCount()!=0){
            p = new Producto();
            p = (Producto) jcbProductos.getSelectedItem();
            if (p!=null){
                jlIdProducto.setText(String.valueOf(p.getIdProducto()));
                jtNombre.setText(p.getNombre());
                jtCantidad.setText(String.valueOf(p.getCantidad()));
                CargarComboCategoria();
                jcbCategoria.setEnabled(true);
                jcbCategoria.setSelectedItem((Categoria)p.getCategoria());
                jtPrecio.setText(String.valueOf(p.getPrecio()));
                jrbActivo.setEnabled(true);
                jrbInactivo.setEnabled(true);
                if (p.isEstado()){
                    jrbActivo.setSelected(true);
                }else{
                    jrbInactivo.setSelected(true);
                }
            }
        }
    }//GEN-LAST:event_jcbProductosActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        // TODO add your handling code here:
        Cerrar.setForeground(Color.gray);
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        // TODO add your handling code here:
        Cerrar.setForeground(Color.white);
    }//GEN-LAST:event_CerrarMouseExited

    private void jbCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearProductoActionPerformed
        try {
            p = new Producto();
            p.setNombre(jtNombre.getText());
            p.setCantidad(Integer.parseInt(jtCantidad.getText()));
            p.setCategoria((Categoria)jcbCategoria.getSelectedItem());
            p.setPrecio(Integer.parseInt(jtPrecio.getText()));
            if (jrbActivo.isSelected()){
                p.setEstado(true);
            }else{
                p.setEstado(false);
            }
            productoData.guardarProducto(p);
            int posicion=BuscarPosicionProductos(p);
            jcbProductos.setEnabled(true);
            CargarComboProductos();
            jcbProductos.setSelectedIndex(posicion);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"No puede ingresar letras en el campo 'Cantidad' ni 'Presio'");
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this,"No puede haber campos vacios");
        }
    }//GEN-LAST:event_jbCrearProductoActionPerformed

    private void jcbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbProductosMouseClicked
        
        if (!jcbProductos.isEnabled()){
        //jcbEncargado.removeAllItems();
        //jcbEncargado.addItem(null);
        //jcbProductos.setRenderer(jcbProductos.getRenderer());
        jcbProductos.setEnabled(true);
        //jcbEncargado.removeAllItems();
        //jcbEncargado.setEnabled(false);
        //jcbEncargado.removeAllItems();
        jcbInactivo.setEnabled(false);
        jcbInactivo.removeAllItems();
        LimpiarCampos();
        jbCrearProducto.setEnabled(false);
        jbActualizarProducto.setEnabled(true);
        jcbProductos.removeAllItems();
        CargarComboProductos();
        }
    }//GEN-LAST:event_jcbProductosMouseClicked

    private void jrbInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivoActionPerformed
        // TODO add your handling code here:
        if (jrbInactivo.isSelected()){
            jrbActivo.setSelected(false);
        }else{
            jrbActivo.setSelected(true);
        }
    }//GEN-LAST:event_jrbInactivoActionPerformed

    private void JbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbLimpiarActionPerformed
        LimpiarPantalla();
    }//GEN-LAST:event_JbLimpiarActionPerformed

    private void jcbInactivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbInactivoMouseClicked
        if (!jcbInactivo.isEnabled()){
        //jcbEncargado.removeAllItems();
        //jcbEncargado.addItem(null);
        //jcbProductos.setRenderer(jcbProductos.getRenderer());
        jcbInactivo.setEnabled(true);
        //jcbEncargado.removeAllItems();
        //jcbEncargado.setEnabled(false);
        //jcbEncargado.removeAllItems();
        jcbProductos.setEnabled(false);
        jcbProductos.removeAllItems();
        LimpiarCampos();
        jbCrearProducto.setEnabled(false);
        jbActualizarProducto.setEnabled(true);
        jcbInactivo.removeAllItems();
        CargarComboInactivos();
        if (jcbInactivo.getItemCount()==0){
            JOptionPane.showMessageDialog(this, "No hay Productos Inactivos");
            jcbInactivo.setEnabled(false);
        }
        }
    }//GEN-LAST:event_jcbInactivoMouseClicked

    private void jcbInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbInactivoActionPerformed
        if (jcbInactivo.getItemCount()!=0){
            p = new Producto();
            p = (Producto) jcbInactivo.getSelectedItem();
            if (p!=null){
                jlIdProducto.setText(String.valueOf(p.getIdProducto()));
                jtNombre.setText(p.getNombre());
                jtCantidad.setText(String.valueOf(p.getCantidad()));
                CargarComboCategoria();
                jcbCategoria.setEnabled(true);
                jcbCategoria.setSelectedItem((Categoria)p.getCategoria());
                jtPrecio.setText(String.valueOf(p.getPrecio()));
                jrbActivo.setEnabled(true);
                jrbInactivo.setEnabled(true);
                if (p.isEstado()){
                    jrbActivo.setSelected(true);
                }else{
                    jrbInactivo.setSelected(true);
                }
            }
        }
    }//GEN-LAST:event_jcbInactivoActionPerformed

    private void jrbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivoActionPerformed
        // TODO add your handling code here:
        if (jrbActivo.isSelected()){
            jrbInactivo.setSelected(false);
        }else{
            jrbInactivo.setSelected(true);
        }
    }//GEN-LAST:event_jrbActivoActionPerformed

    private void jcbCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCategoriaMouseClicked
        jcbCategoria.setEnabled(true);
        jcbCategoria.removeAllItems();
        CargarComboCategoria();
    }//GEN-LAST:event_jcbCategoriaMouseClicked
    private void CargarComboProductos(){
        for (Producto pro: productoData.listarProductos()){
            jcbProductos.addItem(pro);
        }
    }
    
    private void CargarComboInactivos(){
        for (Producto pro: productoData.listarProductosInactivos()){
                jcbInactivo.addItem(pro);
        }
    }
    
    private void CargarComboCategoria(){
        jcbCategoria.addItem(Categoria.ALIMENTO);
        jcbCategoria.addItem(Categoria.BEBIDA);
    }
    
    private void LimpiarCampos(){
        jlIdProducto.setText("");
        jtNombre.setText("");
        jtCantidad.setText("");
        jcbCategoria.removeAllItems();
        jcbCategoria.setEnabled(false);
        jtPrecio.setText("");
        jrbActivo.setSelected(false);
        jrbActivo.setEnabled(true);
        jrbInactivo.setSelected(false);
        jrbInactivo.setEnabled(true);    
    }
    
    private void LimpiarPantalla(){
        jcbProductos.setEnabled(false);
        jcbProductos.removeAllItems();
        jcbInactivo.setEnabled(false);
        jcbInactivo.removeAllItems();
        LimpiarCampos();
        jbCrearProducto.setEnabled(true);
        jbActualizarProducto.setEnabled(false);
    }
    
    private int BuscarPosicionProductos(Producto p){
        int posicion =-1;
        List<Producto> listaProductos = productoData.listarProductos();
            for (Producto producto:listaProductos){
                if (producto.getIdProducto()==p.getIdProducto()){
                    posicion = listaProductos.indexOf(producto);
                }
            }
        return posicion;
    }
    
    private int BuscarPosicionInactivos(Producto p){
        int posicion =-1;
        List<Producto> listaInactivos = productoData.listarProductosInactivos();
            for (Producto producto:listaInactivos){
                if (producto.getIdProducto()==p.getIdProducto()){
                    posicion = listaInactivos.indexOf(producto);
                }
            }
        return posicion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel FondoImagen;
    private javax.swing.JButton JbLimpiar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloCarga;
    private javax.swing.JLabel TituloModificacion;
    private javax.swing.JLabel TransparenciaCargar;
    private javax.swing.JLabel TransparenciaModificar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbActualizarProducto;
    private javax.swing.JButton jbCrearProducto;
    private javax.swing.JComboBox<Categoria> jcbCategoria;
    private javax.swing.JComboBox<Producto> jcbInactivo;
    private javax.swing.JComboBox<Producto> jcbProductos;
    private javax.swing.JLabel jlIdProducto;
    private javax.swing.JRadioButton jrbActivo;
    private javax.swing.JRadioButton jrbInactivo;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    // End of variables declaration//GEN-END:variables
}
