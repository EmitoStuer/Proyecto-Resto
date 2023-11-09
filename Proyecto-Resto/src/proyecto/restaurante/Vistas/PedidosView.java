/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.restaurante.Vistas;

import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import proyecto.restaurante.Control.MesaData;
import proyecto.restaurante.Control.MeseroData;
import proyecto.restaurante.Control.PedidoData;
import proyecto.restaurante.Entidades.Actividad;
import proyecto.restaurante.Entidades.Mesa;
import proyecto.restaurante.Entidades.Mesero;
import proyecto.restaurante.Entidades.Pedido;
import static proyecto.restaurante.Vistas.PrincipalView.cargaProductosView;

/**
 *
 * @author Emito
 */
public class PedidosView extends javax.swing.JInternalFrame {

    private PedidoData pedidoData = new PedidoData();
    private Mesero mesero;
    private MeseroData meseroData;
    private MesaData mesaData;
    private Mesa mesa;
    private Pedido pedido;
    private Mesero meseroActual;
    private Mesa mesaActual;
    private List<Pedido> listaPedidosPorMesero;
    
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c){
                return false;
        }
    };
    /**
     * Creates new form CargaMeserosView
     * @param DNI
     */
    public PedidosView(){}
    public PedidosView(int DNI) {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        estilos();
        meseroData = new MeseroData();
        mesaData = new MesaData();
        meseroActual = meseroData.buscarMeseroPorDNI(DNI);     
        armarCabecera();
        borrarFilas();
        cargarPedidosDeMesero(meseroActual,LocalDate.now());
        jcbActividad.setEnabled(false);
    }
    private void estilos(){
        Fondo.setBackground(new Color(35,34,36,210));
        jpMesas.setBackground(new Color(35,34,36,160));
        jpPedidos.setBackground(new Color(35,34,36,160));
    }
    
    public void cargarComboBox(){
        jcbActividad.addItem(Actividad.INICIADA);
        jcbActividad.addItem(Actividad.COBRADA);
        jcbActividad.addItem(Actividad.CANCELADA);
        jcbActividad.addItem(Actividad.FACTURADA);
        
    }
    
    private void armarCabecera(){       
        modelo.addColumn("Pedido");
        modelo.addColumn("Mesa");
        modelo.addColumn("Importe"); 
        modelo.addColumn("Hora");
        modelo.addColumn("Actividad");
        jtPedidos.setModel(modelo);

    }
    
     private void borrarFilas(){
        int f = jtPedidos.getRowCount()-1;
        for(;f >= 0; f--){
            modelo.removeRow(f);
        }
    }
     
    private void cargarTabla(){
        borrarFilas();
        pedidoData = new PedidoData();
        mesa = new Mesa();        
        List<Pedido> listaPedidos = new ArrayList();  
        
        Mesa mesaSeleccionada = (Mesa)jcbActividad.getSelectedItem();
        if(mesaSeleccionada != null){
            listaPedidos = pedidoData.listarPedidosPorMesa(mesaSeleccionada.getIdMesa(), meseroActual.getIdMesero());
        }
        if(!listaPedidos.isEmpty()){
            for (Pedido pedidos:listaPedidos){
                modelo.addRow(new Object[]{
                pedidos.getIdPedido(),
                pedidos.getMesa().getIdMesa(),                
                pedidos.getImporte(),                
                pedidos.getHoraPedido(),
                });
            }
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

        Fondo = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        jpMesas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcbActividad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jpPedidos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbRendirCaja = new javax.swing.JButton();
        jbListarTodo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FondoImagen = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        setPreferredSize(new java.awt.Dimension(540, 590));

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jpMesas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filtro por Estado de Pedido");
        jpMesas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 27));

        jcbActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbActividadMouseClicked(evt);
            }
        });
        jcbActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbActividadActionPerformed(evt);
            }
        });
        jpMesas.add(jcbActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 221, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lista de pedidos.");
        jpMesas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 24));

        Fondo.add(jpMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 500, 130));

        jpPedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtPedidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtPedidos);

        jpPedidos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 480, 270));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pedidos por mesa");
        jpPedidos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jbRendirCaja.setBackground(new java.awt.Color(153, 153, 0));
        jbRendirCaja.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jbRendirCaja.setForeground(new java.awt.Color(51, 51, 51));
        jbRendirCaja.setText("Rendir Caja");
        jbRendirCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRendirCajaActionPerformed(evt);
            }
        });
        jpPedidos.add(jbRendirCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jbListarTodo.setBackground(new java.awt.Color(153, 153, 0));
        jbListarTodo.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jbListarTodo.setForeground(new java.awt.Color(51, 51, 51));
        jbListarTodo.setText("Listar pedidos");
        jbListarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarTodoActionPerformed(evt);
            }
        });
        jpPedidos.add(jbListarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        Fondo.add(jpPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 500, 370));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pedidos");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 346, 24));

        FondoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/restaurante/resources/imagenes/FondoInternalFrames.jpg"))); // NOI18N
        FondoImagen.setLabelFor(Fondo);
        Fondo.add(FondoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 540, 610));

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

    private void jbRendirCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRendirCajaActionPerformed
        comprobarEstadoDePedidos(meseroActual,LocalDate.now());
    }//GEN-LAST:event_jbRendirCajaActionPerformed

    private void jcbActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbActividadActionPerformed
        Actividad actividadSeleccionada = (Actividad) jcbActividad.getSelectedItem();
        borrarFilas();
        
        cargarPedidosSegunActividad(meseroActual, LocalDate.now(),actividadSeleccionada);
    }//GEN-LAST:event_jcbActividadActionPerformed

    private void jcbActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbActividadMouseClicked
        if(!jcbActividad.isEnabled()){
            jcbActividad.setEnabled(true);
            cargarComboBox();
            
        }
    }//GEN-LAST:event_jcbActividadMouseClicked

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        // TODO add your handling code here:
        Cerrar.setForeground(Color.gray);
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        // TODO add your handling code here:
        Cerrar.setForeground(Color.white);
    }//GEN-LAST:event_CerrarMouseExited

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void jbListarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarTodoActionPerformed
        jcbActividad.setEnabled(false);
        jcbActividad.removeAllItems();
        borrarFilas();
        cargarPedidosDeMesero(meseroActual,LocalDate.now());
    }//GEN-LAST:event_jbListarTodoActionPerformed
    
    private void cargarPedidosDeMesero(Mesero m, LocalDate fecha){
        listaPedidosPorMesero = pedidoData.Pedidos(m, fecha);
        
            if(!listaPedidosPorMesero.isEmpty()){
            for (Pedido pedidos:listaPedidosPorMesero){
                
                    modelo.addRow(new Object[]{
                    pedidos.getIdPedido(),
                    pedidos.getMesa().getIdMesa(),               
                    pedidos.getImporte(),                
                    pedidos.getHoraPedido(),
                    pedidos.getActividad()
                    });
                   
            }
        }
        
    }
    
    private void comprobarEstadoDePedidos(Mesero m, LocalDate fecha){
        listaPedidosPorMesero = pedidoData.Pedidos(m, fecha);
        double importeCobradas=0;
        double importeCanceladas=0;
        if (listaPedidosPorMesero.isEmpty()){
            JOptionPane.showMessageDialog(null, "Actualmente no tiene ningun pedido");
        }else{
            for (Pedido pedido:listaPedidosPorMesero){
                if (pedido.getActividad().equals(Actividad.INICIADA)){
                    JOptionPane.showMessageDialog(null,"No puede rendir Caja porque todavia tiene pedidos INICIADOS");
                    PrincipalView.cargaMesasView(meseroActual.getDni());
                    return;
                }else if (pedido.getActividad().equals(Actividad.COBRADA)){
                    importeCobradas+=pedido.getImporte();
                }else if (pedido.getActividad().equals(Actividad.CANCELADA)){
                    importeCanceladas+=pedido.getImporte();
                }
                
            }
                if (importeCobradas ==0){
                    JOptionPane.showMessageDialog(null,"No tiene ningun pedido para Rendir");
                }
                if (importeCanceladas == 0 && importeCobradas>0){
                    JOptionPane.showMessageDialog(null,"Felicidades por no tener Mesas Canceladas");
                    JOptionPane.showMessageDialog(null,"Debe rendir al Encargado un Total de: $"+importeCobradas);
                        for (Pedido pedido: listaPedidosPorMesero){
                        if (pedido.getActividad().equals(Actividad.COBRADA)){
                        pedidoData.facturarPedido(pedido.getIdPedido());
                        }
                        borrarFilas();
                        cargarPedidosDeMesero(meseroActual,LocalDate.now());
                }
                }else if(importeCobradas >0){
                JOptionPane.showMessageDialog(null,"Se cancelaron pedidos con un valor total a: $"+importeCanceladas);
                JOptionPane.showMessageDialog(null,"Debe rendir al Encargado un Total de: $"+importeCobradas);
                    for (Pedido pedido: listaPedidosPorMesero){
                        if (pedido.getActividad().equals(Actividad.COBRADA)){
                        pedidoData.facturarPedido(pedido.getIdPedido());
                        }
                        borrarFilas();
                        cargarPedidosDeMesero(meseroActual,LocalDate.now());
                    }
                }
        
        }
    
    }
    
    
    private void cargarPedidosSegunActividad(Mesero m, LocalDate fecha, Actividad actividad){
        listaPedidosPorMesero = pedidoData.Pedidos(m, fecha, actividad);
            if(!listaPedidosPorMesero.isEmpty()){
            for (Pedido pedidos:listaPedidosPorMesero){
                
                    modelo.addRow(new Object[]{
                    pedidos.getIdPedido(),
                    pedidos.getMesa().getIdMesa(),               
                    pedidos.getImporte(),                
                    pedidos.getHoraPedido(),
                    pedidos.getActividad()
                    });
                   
            }
        }else{
                if (jcbActividad.isEnabled()){
                    JOptionPane.showMessageDialog(null,"No tiene ningun Pedido con estado: "+actividad);
                }
            }
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel FondoImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbListarTodo;
    private javax.swing.JButton jbRendirCaja;
    private javax.swing.JComboBox<Actividad> jcbActividad;
    private javax.swing.JPanel jpMesas;
    private javax.swing.JPanel jpPedidos;
    private javax.swing.JTable jtPedidos;
    // End of variables declaration//GEN-END:variables
}
