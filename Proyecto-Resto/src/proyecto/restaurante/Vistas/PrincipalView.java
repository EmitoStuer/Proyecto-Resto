package proyecto.restaurante.Vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import proyecto.restaurante.Control.MeseroData;
import proyecto.restaurante.Entidades.Mesero;

public class PrincipalView extends javax.swing.JFrame {
    private static MeseroData meseroData;
    private static Mesero m;
    private int dni;
    private String password;
        
    public PrincipalView() {
        initComponents();
        this.setLocationRelativeTo(null);
        estilos();
        MenuLateral.setVisible(false);
        meseroData = new MeseroData();
        jLabel9.setVisible(false);
        btReservaMeseros.setVisible(false);
        
        
    }
    public void estilos (){
        FondoTransparente.setBackground(new Color(35,34,36,210));
        FondoTransparente1.setBackground(new Color(35,34,36,210));
        EscritorioFrames.setBackground(new Color(0,0,0,0));
        LogOut.setVisible(false);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Escritorio = new javax.swing.JDesktopPane();
        MenuLateral = new javax.swing.JPanel();
        jlEncargado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btMeseros = new javax.swing.JButton();
        btMesas = new javax.swing.JButton();
        btIngresos = new javax.swing.JButton();
        btProductos = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jlMeseros = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btMesasMeseros = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        IconMeseros = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btPedidosMeseros = new javax.swing.JButton();
        btReservaMeseros = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        FondoTransparente = new javax.swing.JLabel();
        EscritorioFrames = new javax.swing.JDesktopPane();
        Login = new javax.swing.JPanel();
        LogoMesero = new javax.swing.JLabel();
        CerrarIFrame = new javax.swing.JLabel();
        loginMesero = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jbIngresar = new javax.swing.JButton();
        jcMostrarContraseña = new javax.swing.JCheckBox();
        jtPassword = new javax.swing.JPasswordField();
        FondoTransparente1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        LogIn = new javax.swing.JLabel();
        Contenedor = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuLateral.setBackground(new java.awt.Color(9, 9, 9));
        MenuLateral.setOpaque(false);
        MenuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlEncargado.setBackground(new java.awt.Color(51, 51, 51));
        jlEncargado.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlEncargado.setForeground(new java.awt.Color(255, 255, 255));
        jlEncargado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEncargado.setText("Encargado");
        MenuLateral.add(jlEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 50));

        jSeparator1.setBackground(new java.awt.Color(189, 193, 96));
        jSeparator1.setForeground(new java.awt.Color(189, 193, 96));
        MenuLateral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 240, 10));

        btMeseros.setBackground(new java.awt.Color(153, 153, 0));
        btMeseros.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btMeseros.setForeground(new java.awt.Color(51, 51, 51));
        btMeseros.setText("Usuarios");
        btMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMeserosActionPerformed(evt);
            }
        });
        MenuLateral.add(btMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 170, 50));

        btMesas.setBackground(new java.awt.Color(153, 153, 0));
        btMesas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btMesas.setForeground(new java.awt.Color(51, 51, 51));
        btMesas.setText("Mesas");
        btMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMesasActionPerformed(evt);
            }
        });
        MenuLateral.add(btMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 171, 50));

        btIngresos.setBackground(new java.awt.Color(153, 153, 0));
        btIngresos.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btIngresos.setForeground(new java.awt.Color(51, 51, 51));
        btIngresos.setText("Ingresos");
        btIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresosActionPerformed(evt);
            }
        });
        MenuLateral.add(btIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 171, 50));

        btProductos.setBackground(new java.awt.Color(153, 153, 0));
        btProductos.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btProductos.setForeground(new java.awt.Color(51, 51, 51));
        btProductos.setText("Productos");
        btProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProductosActionPerformed(evt);
            }
        });
        MenuLateral.add(btProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 171, 50));

        jSeparator2.setBackground(new java.awt.Color(189, 193, 96));
        jSeparator2.setForeground(new java.awt.Color(189, 193, 96));
        MenuLateral.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 240, 10));

        jlMeseros.setBackground(new java.awt.Color(51, 51, 51));
        jlMeseros.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlMeseros.setForeground(new java.awt.Color(255, 255, 255));
        jlMeseros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMeseros.setText("Meseros");
        MenuLateral.add(jlMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 240, 50));

        jSeparator3.setBackground(new java.awt.Color(189, 193, 96));
        jSeparator3.setForeground(new java.awt.Color(189, 193, 96));
        MenuLateral.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 240, -1));

        btMesasMeseros.setBackground(new java.awt.Color(153, 153, 0));
        btMesasMeseros.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btMesasMeseros.setForeground(new java.awt.Color(51, 51, 51));
        btMesasMeseros.setText("Mesas");
        btMesasMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMesasMeserosActionPerformed(evt);
            }
        });
        MenuLateral.add(btMesasMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 169, 50));

        jSeparator5.setBackground(new java.awt.Color(189, 193, 96));
        jSeparator5.setForeground(new java.awt.Color(189, 193, 96));
        MenuLateral.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 10));

        IconMeseros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconMeseros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/restaurante/resources/imagenes/meseroIcon.png"))); // NOI18N
        MenuLateral.add(IconMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/restaurante/resources/imagenes/mesaIcon.png"))); // NOI18N
        MenuLateral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 60, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/restaurante/resources/imagenes/productoIcon.png"))); // NOI18N
        MenuLateral.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 60, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/restaurante/resources/imagenes/ingresosIcon.png"))); // NOI18N
        MenuLateral.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 60, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/restaurante/resources/imagenes/mesaIcon.png"))); // NOI18N
        MenuLateral.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 60, 50));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/restaurante/resources/imagenes/pedidoIcon.png"))); // NOI18N
        MenuLateral.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 60, 50));

        btPedidosMeseros.setBackground(new java.awt.Color(153, 153, 0));
        btPedidosMeseros.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btPedidosMeseros.setForeground(new java.awt.Color(51, 51, 51));
        btPedidosMeseros.setText("Pedidos");
        btPedidosMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedidosMeserosActionPerformed(evt);
            }
        });
        MenuLateral.add(btPedidosMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 169, 50));

        btReservaMeseros.setBackground(new java.awt.Color(153, 153, 0));
        btReservaMeseros.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btReservaMeseros.setForeground(new java.awt.Color(51, 51, 51));
        btReservaMeseros.setText("Reserva");
        btReservaMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservaMeserosActionPerformed(evt);
            }
        });
        MenuLateral.add(btReservaMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 169, 50));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/restaurante/resources/imagenes/pedidoIcon.png"))); // NOI18N
        MenuLateral.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 60, 50));

        FondoTransparente.setOpaque(true);
        MenuLateral.add(FondoTransparente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 600));

        Escritorio.add(MenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 600));

        EscritorioFrames.setOpaque(false);
        EscritorioFrames.setLayout(new java.awt.GridLayout(1, 0));

        Login.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoMesero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoMesero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/restaurante/resources/imagenes/usuario.png"))); // NOI18N
        Login.add(LogoMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 500, 200));

        CerrarIFrame.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CerrarIFrame.setForeground(new java.awt.Color(255, 255, 255));
        CerrarIFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CerrarIFrame.setText("Exit");
        CerrarIFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarIFrameMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarIFrameMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarIFrameMouseEntered(evt);
            }
        });
        Login.add(CerrarIFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 80, -1));

        loginMesero.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        loginMesero.setForeground(new java.awt.Color(255, 255, 255));
        loginMesero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginMesero.setText("Login");
        Login.add(loginMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 100, 500, -1));

        Password.setFont(new java.awt.Font("Roboto", 1, 17)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password:");
        Login.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        Usuario.setFont(new java.awt.Font("Roboto", 1, 17)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Usuario:");
        Login.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 90, -1));

        jtUsuario.setBackground(new java.awt.Color(245, 233, 144));
        jtUsuario.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jtUsuario.setText("Ingrese Dni");
        jtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtUsuarioMousePressed(evt);
            }
        });
        jtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUsuarioActionPerformed(evt);
            }
        });
        Login.add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 240, -1));

        jbIngresar.setBackground(new java.awt.Color(153, 153, 0));
        jbIngresar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbIngresar.setText("Ingresar");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });
        Login.add(jbIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 150, -1));

        jcMostrarContraseña.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jcMostrarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jcMostrarContraseña.setText("Mostrar contraseña");
        jcMostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMostrarContraseñaActionPerformed(evt);
            }
        });
        Login.add(jcMostrarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        jtPassword.setBackground(new java.awt.Color(245, 233, 144));
        jtPassword.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jtPassword.setForeground(new java.awt.Color(153, 153, 153));
        jtPassword.setText("********");
        jtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtPasswordMousePressed(evt);
            }
        });
        Login.add(jtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 240, -1));

        FondoTransparente1.setOpaque(true);
        Login.add(FondoTransparente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 350, 460));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/restaurante/resources/imagenes/FondoInternalFrames.jpg"))); // NOI18N
        Login.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 590));

        EscritorioFrames.add(Login);

        Escritorio.add(EscritorioFrames, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 5, 540, 590));

        Cerrar.setBackground(new java.awt.Color(255, 255, 255));
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
        Escritorio.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 40, 30));

        LogOut.setBackground(new java.awt.Color(255, 255, 255));
        LogOut.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogOut.setText("Log-Out");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOutMouseEntered(evt);
            }
        });
        Escritorio.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 60, 30));

        LogIn.setBackground(new java.awt.Color(255, 255, 255));
        LogIn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        LogIn.setForeground(new java.awt.Color(255, 255, 255));
        LogIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogIn.setText("Login");
        LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogInMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogInMouseEntered(evt);
            }
        });
        Escritorio.add(LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 60, 30));

        Contenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/restaurante/resources/imagenes/FondoInicioConLogo.jpg"))); // NOI18N
        Escritorio.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMeserosActionPerformed
        EscritorioFrames.removeAll();
        EscritorioFrames.repaint();        
        CargaMeserosView cmv = new CargaMeserosView();
        cmv.setVisible(true);
        EscritorioFrames.add(cmv);
        EscritorioFrames.moveToFront(cmv);   
    }//GEN-LAST:event_btMeserosActionPerformed

    private void btMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMesasActionPerformed
        EscritorioFrames.removeAll();
        EscritorioFrames.repaint();
        CargaMesasView mv= new CargaMesasView();
        mv.setVisible(true);
        EscritorioFrames.add(mv);
        EscritorioFrames.moveToFront(mv);
    }//GEN-LAST:event_btMesasActionPerformed

    private void btIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresosActionPerformed
        EscritorioFrames.removeAll();
        EscritorioFrames.repaint();
        //IngresosView iv= new IngresosView();
        IngresosView1 iv = new IngresosView1();
        iv.setVisible(true);
        EscritorioFrames.add(iv);
        EscritorioFrames.moveToFront(iv);
    }//GEN-LAST:event_btIngresosActionPerformed

    private void btProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProductosActionPerformed
        EscritorioFrames.removeAll();
        EscritorioFrames.repaint();
        CargaProductosView cpv = new CargaProductosView();
        cpv.setVisible(true);
        EscritorioFrames.add(cpv);
        EscritorioFrames.moveToFront(cpv);
    }//GEN-LAST:event_btProductosActionPerformed

    private void btMesasMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMesasMeserosActionPerformed
        EscritorioFrames.removeAll();
        EscritorioFrames.repaint();
        int DNI = m.getDni();
        MeserosView mv = new MeserosView(DNI);
        mv.setVisible(true);
        EscritorioFrames.add(mv);
        EscritorioFrames.moveToFront(mv); 
    }//GEN-LAST:event_btMesasMeserosActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        int desicion = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿DESEA SALIR?","SALIR",desicion);
        if (resultado==0){
            System.exit(0);
        }
    }//GEN-LAST:event_CerrarMouseClicked

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        // TODO add your handling code here:
        Cerrar.setForeground(Color.white);
    }//GEN-LAST:event_CerrarMouseExited

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        // TODO add your handling code here:
        Cerrar.setForeground(Color.gray);
    }//GEN-LAST:event_CerrarMouseEntered

    private void jtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuarioMousePressed
        if (jtUsuario.getText().equalsIgnoreCase("Ingrese Dni")){
            jtUsuario.setText("");
            jtUsuario.setForeground(Color.black);
        }
        if(String.valueOf(jtPassword.getPassword()).isEmpty()){
            jtPassword.setText("********");
            jtPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtUsuarioMousePressed

    private void jtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsuarioActionPerformed

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        m = new Mesero();
        try{
            if (jtUsuario.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Complete el campo Dni");
                jtUsuario.requestFocus();    
            }else{
                if (jtUsuario.getText().length()!=8){
                    JOptionPane.showMessageDialog(null,"Ingrese Numero de 8 digitos.");
                    jtUsuario.setText("");
                    jtUsuario.requestFocus();
                }else{
                dni=Integer.parseInt(jtUsuario.getText());
                    if (jtPassword.toString().equals("********")){
                      JOptionPane.showMessageDialog(null,"Complete el campo Contraseña");
                      jtPassword.requestFocus();
                    }else{
                        password=String.valueOf(jtPassword.getPassword());
                        m = meseroData.buscarMeseroPorLogin(dni);
                        if (m.isEstado()){
                            if(meseroData.loginMesero(dni, password)){
                                JOptionPane.showMessageDialog(null, "Bienvenido "+m.getNombre());
                                EscritorioFrames.removeAll();
                                EscritorioFrames.repaint();
                                MenuLateral.setVisible(true);
                                LogIn.setVisible(false);
                                LogOut.setVisible(true);
                                    if (m.getAcceso() == 1){
                                    DesactivarMesero();
                                    ActivarAdmin(dni);
                                    } else if (m.getAcceso() == 2){
                                    DesactivarAdmin();
                                    ActivarMesero(dni);
                                    }
                                
                            }else{
                                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta.");
                                jtPassword.setText("");
                                jtPassword.setForeground(Color.black);
                                jtPassword.requestFocus();
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"El usuario No Existe o esta Inactivo.");
                            jtUsuario.setText("Ingrese Dni");
                            jtUsuario.setForeground(Color.gray);
                            jtPassword.setText("********");
                            jtPassword.setForeground(Color.gray);
                        }
                    }
                }
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese numero de dni"+e);
        }
        catch(NullPointerException e){
            
        }
          
//        try{
//            dni=Integer.parseInt(jtUsuario.getText());
//            password=String.valueOf(jtPassword.getPassword());
//            m = meseroData.buscarMeseroPorLogin(dni);
//            if (m.isEstado()){
//            if(meseroData.loginMesero(dni, password)){
//                
//                EscritorioFrames.removeAll();
//                EscritorioFrames.repaint();
//                MenuLateral.setVisible(true);
//                LogIn.setVisible(false);
//                LogOut.setVisible(true);
//                    if (m.getAcceso() == 1){
//                    DesactivarMesero();
//                    ActivarAdmin(dni);
//                    } else if (m.getAcceso() == 2){
//                    DesactivarAdmin();
//                    ActivarMesero(dni);
//                    }
//            }else{
//                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta.");
//                jtPassword.setText("");
//                jtPassword.requestFocus();
//            }
//            }else{
//                JOptionPane.showMessageDialog(null,"El usuario No Existe o esta Inactivo.");
//                jtUsuario.setText("Ingrese Dni");
//                jtUsuario.setForeground(Color.gray);
//                jtPassword.setText("********");
//                jtPassword.setForeground(Color.gray);
//            }
//        }catch (NumberFormatException e){
//            JOptionPane.showMessageDialog(null, "Ingrese numero de dni"+e);
//        }
//        catch(NullPointerException e){
//            JOptionPane.showMessageDialog(null, "Complete todos los campos "+e);
//        }
        
    }//GEN-LAST:event_jbIngresarActionPerformed

    private void jtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPasswordMousePressed
        if (String.valueOf(jtPassword.getPassword()).equals("********")){
            jtPassword.setText("");
            jtPassword.setForeground(Color.black);
        }
        if (jtUsuario.getText().isEmpty()){
            jtUsuario.setText("Ingrese Dni");
            jtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtPasswordMousePressed

    private void CerrarIFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarIFrameMouseClicked
        // TODO add your handling code here:
        jtUsuario.setForeground(Color.gray);
        jtUsuario.setText("Ingrese Dni");
        jtPassword.setForeground(Color.gray);
        jtPassword.setText("********");
        Login.setVisible(false);
    }//GEN-LAST:event_CerrarIFrameMouseClicked

    private void CerrarIFrameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarIFrameMouseEntered
        // TODO add your handling code here:
        CerrarIFrame.setForeground(Color.gray);
    }//GEN-LAST:event_CerrarIFrameMouseEntered

    private void CerrarIFrameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarIFrameMouseExited
        // TODO add your handling code here:
        CerrarIFrame.setForeground(Color.white);
    }//GEN-LAST:event_CerrarIFrameMouseExited

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        
        LogOut.setVisible(false);
        LogIn.setVisible(true);
        //Escritorio.moveToFront(Login);
        MenuLateral.setVisible(false);
        Login.setVisible(true);
        EscritorioFrames.add(Login);
        jtUsuario.setForeground(Color.gray);
        jtUsuario.setText("Ingrese Dni");
        jtPassword.setForeground(Color.gray);
        jtPassword.setText("********");
        
    }//GEN-LAST:event_LogOutMouseClicked

    private void LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseExited
        // TODO add your handling code here:
        LogOut.setForeground(Color.white);
    }//GEN-LAST:event_LogOutMouseExited

    private void LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseEntered
        // TODO add your handling code here:
        LogOut.setForeground(Color.gray);
    }//GEN-LAST:event_LogOutMouseEntered

    private void LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInMouseClicked
        // TODO add your handling code here:
        Login.setVisible(true);
        //EscritorioFrames.add(Login);
    }//GEN-LAST:event_LogInMouseClicked

    private void LogInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInMouseExited
        // TODO add your handling code here:
        LogIn.setForeground(Color.white);
    }//GEN-LAST:event_LogInMouseExited

    private void LogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInMouseEntered
        // TODO add your handling code here:
        LogIn.setForeground(Color.gray);
    }//GEN-LAST:event_LogInMouseEntered

    private void btPedidosMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedidosMeserosActionPerformed
        EscritorioFrames.removeAll();
        EscritorioFrames.repaint();
        int DNI = m.getDni();
        PedidosView pv = new PedidosView(DNI);
        pv.setVisible(true);
        EscritorioFrames.add(pv);
        EscritorioFrames.moveToFront(pv);         
    }//GEN-LAST:event_btPedidosMeserosActionPerformed

    private void btReservaMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservaMeserosActionPerformed
        EscritorioFrames.removeAll();
        EscritorioFrames.repaint();
        int DNI = m.getDni();
        ReservaMeseroView rm = new ReservaMeseroView(DNI);
        rm.setVisible(true);
        EscritorioFrames.add(rm);
        EscritorioFrames.moveToFront(rm);
    }//GEN-LAST:event_btReservaMeserosActionPerformed

    private void jcMostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMostrarContraseñaActionPerformed
        if (jcMostrarContraseña.isSelected()){
            jtPassword.setEchoChar((char)0);
        }else{
            jtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jcMostrarContraseñaActionPerformed

    private void ActivarMesero(int dni){
        m =  new Mesero();
        m=meseroData.buscarMeseroPorLogin(dni);
        jlMeseros.setText(m.getNombre());
        btMesasMeseros.setEnabled(true);
        btPedidosMeseros.setEnabled(true);
        btReservaMeseros.setEnabled(true);
    }
    
    private void DesactivarMesero(){
        jlMeseros.setText("Meseros");
        btMesasMeseros.setEnabled(false);
        btPedidosMeseros.setEnabled(false);
        btReservaMeseros.setEnabled(false);
    }
    
    private void ActivarAdmin(int dni){
        m = new Mesero();
        m=meseroData.buscarMeseroPorLogin(dni);
        jlEncargado.setText(m.getNombre());
        btMeseros.setEnabled(true);
        btMesas.setEnabled(true);
        btProductos.setEnabled(true);
        btIngresos.setEnabled(true);
        
    
    }
    
    private void DesactivarAdmin(){
        jlEncargado.setText("Encargado");
        btMeseros.setEnabled(false);
        btMesas.setEnabled(false);
        btProductos.setEnabled(false);
        btIngresos.setEnabled(false);
    }
    
    public static void cargaProductosView(int dni, int idMesa, int idPedido){
        EscritorioFrames.removeAll();
        EscritorioFrames.repaint();
        ProductosView prov = new ProductosView(dni,idMesa,idPedido);
        prov.setVisible(true);
        EscritorioFrames.add(prov);
        EscritorioFrames.moveToFront(prov);
        
    }
    
    public static void cargaMesasView(int dni, int idMesa){
        EscritorioFrames.removeAll();
        EscritorioFrames.repaint();
        int DNI = m.getDni();
        MeserosView mv = new MeserosView(dni, idMesa);
        mv.setVisible(true);
        EscritorioFrames.add(mv);
        EscritorioFrames.moveToFront(mv); 
        
    }
    
    public static void cargaMesasView(int dni){
        EscritorioFrames.removeAll();
        EscritorioFrames.repaint();
        int DNI = m.getDni();
        MeserosView mv = new MeserosView(dni);
        mv.setVisible(true);
        EscritorioFrames.add(mv);
        EscritorioFrames.moveToFront(mv); 
        
    }
    
    public static void detallePedidosView(int idPedido){
        DetalledePedidosView dpv = new DetalledePedidosView(idPedido);
        dpv.setVisible(true);
        EscritorioFrames.add(dpv);
        EscritorioFrames.moveToFront(dpv);
    }
    
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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel CerrarIFrame;
    private javax.swing.JLabel Contenedor;
    private javax.swing.JDesktopPane Escritorio;
    private static javax.swing.JDesktopPane EscritorioFrames;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoTransparente;
    private javax.swing.JLabel FondoTransparente1;
    private javax.swing.JLabel IconMeseros;
    private javax.swing.JLabel LogIn;
    private javax.swing.JLabel LogOut;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel LogoMesero;
    private javax.swing.JPanel MenuLateral;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton btIngresos;
    private javax.swing.JButton btMesas;
    private javax.swing.JButton btMesasMeseros;
    private javax.swing.JButton btMeseros;
    private javax.swing.JButton btPedidosMeseros;
    private javax.swing.JButton btProductos;
    private javax.swing.JButton btReservaMeseros;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JCheckBox jcMostrarContraseña;
    private javax.swing.JLabel jlEncargado;
    private javax.swing.JLabel jlMeseros;
    private javax.swing.JPasswordField jtPassword;
    public javax.swing.JTextField jtUsuario;
    private javax.swing.JLabel loginMesero;
    // End of variables declaration//GEN-END:variables
}