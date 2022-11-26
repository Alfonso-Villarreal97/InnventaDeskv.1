package vista;

import controlador.CtrlProducto;
import controlador.Slide;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import modelo.Conexion;
import java.sql.SQLException;
import javax.swing.UIManager;
import modelo.ConsultasProducto;
import modelo.Producto;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    Slide slide; //Creo el objeto slide

    public Menu() {
        initComponents();
        slide = new Slide(); //Lo mando a llamar al arranque del programa

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public void moverPanelDerecha() {
        slide.jPanelXDerecha(-150, 0, 10, 5, jpSlide);
    }

    public void moverPanelIzquierda() {
        slide.jPanelXIzquierda(0, -150, 10, 5, jpSlide);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSlide = new javax.swing.JPanel();
        jlblMenu = new javax.swing.JLabel();
        jlblInv = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGestionar = new javax.swing.JButton();
        btnVales = new javax.swing.JButton();
        btnAcerca = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jlblTexto1 = new javax.swing.JLabel();
        jlblTexto2 = new javax.swing.JLabel();
        jlblTexto3 = new javax.swing.JLabel();
        jlblTexto4 = new javax.swing.JLabel();
        jlblSombra1 = new javax.swing.JLabel();
        jlblSombra2 = new javax.swing.JLabel();
        jlblSombra3 = new javax.swing.JLabel();
        jlblSombra4 = new javax.swing.JLabel();
        jlblPanel = new javax.swing.JLabel();
        jpNapbar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        jpBase = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos2 = new javax.swing.JTable();
        lblVista2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new vista.PanelRound();
        txtBuscar = new javax.swing.JTextField();
        jpBtnGuardar = new vista.PanelRound();
        btnExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(28, 29, 28));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSlide.setBackground(new java.awt.Color(28, 29, 28));
        jpSlide.setMinimumSize(new java.awt.Dimension(200, 550));
        jpSlide.setPreferredSize(new java.awt.Dimension(200, 550));
        jpSlide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu.png"))); // NOI18N
        jlblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblMenuMouseClicked(evt);
            }
        });
        jpSlide.add(jlblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 40, 50));

        jlblInv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Inventory.png"))); // NOI18N
        jpSlide.add(jlblInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ValeSalida.png"))); // NOI18N
        jpSlide.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 30, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jpSlide.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoC.png"))); // NOI18N
        jpSlide.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        jpSlide.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        btnGestionar.setBorderPainted(false);
        btnGestionar.setContentAreaFilled(false);
        btnGestionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionarMouseClicked(evt);
            }
        });
        btnGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarActionPerformed(evt);
            }
        });
        jpSlide.add(btnGestionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 60));

        btnVales.setBorderPainted(false);
        btnVales.setContentAreaFilled(false);
        btnVales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValesMouseClicked(evt);
            }
        });
        jpSlide.add(btnVales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 60));

        btnAcerca.setBorderPainted(false);
        btnAcerca.setContentAreaFilled(false);
        btnAcerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcercaMouseClicked(evt);
            }
        });
        jpSlide.add(btnAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 140, 60));

        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jpSlide.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 140, 40));

        jlblTexto1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlblTexto1.setForeground(new java.awt.Color(255, 255, 255));
        jlblTexto1.setText("Vales de salida");
        jpSlide.add(jlblTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jlblTexto2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlblTexto2.setForeground(new java.awt.Color(255, 255, 255));
        jlblTexto2.setText("Gestionar inventario");
        jpSlide.add(jlblTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jlblTexto3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlblTexto3.setForeground(new java.awt.Color(255, 255, 255));
        jlblTexto3.setText("Salir");
        jpSlide.add(jlblTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, 30));

        jlblTexto4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlblTexto4.setForeground(new java.awt.Color(255, 255, 255));
        jlblTexto4.setText("Acerca de");
        jpSlide.add(jlblTexto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 30));

        jlblSombra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/linea.png"))); // NOI18N
        jpSlide.add(jlblSombra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 150, 160, 20));

        jlblSombra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/linea.png"))); // NOI18N
        jpSlide.add(jlblSombra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 490, 160, 20));

        jlblSombra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/linea.png"))); // NOI18N
        jpSlide.add(jlblSombra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 530, 160, 20));

        jlblSombra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/linea.png"))); // NOI18N
        jpSlide.add(jlblSombra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 90, 160, 20));

        jlblPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Panel.png"))); // NOI18N
        jpSlide.add(jlblPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 590));

        getContentPane().add(jpSlide, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, -1, -1));

        jpNapbar.setBackground(new java.awt.Color(0, 52, 150));
        jpNapbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bienvenido usuario, hoy es:");
        jpNapbar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 180, 30));

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        jpNapbar.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 90, 30));

        getContentPane().add(jpNapbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 50));

        jpBase.setBackground(new java.awt.Color(32, 32, 32));
        jpBase.setMinimumSize(new java.awt.Dimension(1050, 550));
        jpBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProductos2.setBackground(new java.awt.Color(255, 255, 255));
        tblProductos2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tblProductos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Modelo", "Marca", "Precio (MXN)", "Tipo", "Existencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos2.getTableHeader().setReorderingAllowed(false);
        tblProductos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductos2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos2);

        jpBase.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 640, 340));

        lblVista2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Imagen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpBase.add(lblVista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 290, 350));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar por código:");
        jpBase.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, 30));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setBorder(null);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jpBase.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, 30));

        jpBtnGuardar.setBackground(new java.awt.Color(0, 102, 204));
        jpBtnGuardar.setRoundBottomLeft(25);
        jpBtnGuardar.setRoundBottomRight(25);
        jpBtnGuardar.setRoundTopLeft(25);
        jpBtnGuardar.setRoundTopRight(25);

        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("Exportar selección");
        btnExport.setBorderPainted(false);
        btnExport.setContentAreaFilled(false);
        btnExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpBtnGuardarLayout = new javax.swing.GroupLayout(jpBtnGuardar);
        jpBtnGuardar.setLayout(jpBtnGuardarLayout);
        jpBtnGuardarLayout.setHorizontalGroup(
            jpBtnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jpBtnGuardarLayout.setVerticalGroup(
            jpBtnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBase.add(jpBtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, 140, 30));

        getContentPane().add(jpBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMenuMouseClicked
        moverPanelDerecha();
        moverPanelIzquierda();
    }//GEN-LAST:event_jlblMenuMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jlblSombra4.setVisible(true);
        jlblSombra1.setVisible(false);
        jlblSombra2.setVisible(false);
        jlblSombra3.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void tblProductos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductos2MouseClicked
        // TODO add your handling code here:
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            int Fila = tblProductos2.getSelectedRow();
            String codigo = tblProductos2.getValueAt(Fila, 0).toString();

            ps = con.prepareStatement("SELECT id, codigo, nombre, modelo, marca, precio, tipo, existencia, descripcion, imagen FROM inventario WHERE codigo=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            BufferedImage buffing = null;
            byte[] image = null; //Declaro un arreglo de bytes vacio
            // byte[] cadena = null;
            while (rs.next()) {

                image = rs.getBytes("imagen");//temporal = Base64.getEncoder().encodeToString(cadena); // cadena = rs.getBytes("imagen");//txtBytes.setText(rs.getBinaryStream("imagenes"));//temporal = rs.getBytes("imagen");//System.out.println(temporal);

                InputStream img = rs.getBinaryStream(10);
                try {
                    buffing = ImageIO.read(img);
                    /*int x = lblVista.getWidth();
                    int y = lblVista.getHeight();
                    ImagenMySQL imagen = new ImagenMySQL(x, y, buffing);
                    lblVista.removeAll();
                    lblVista.add(imagen);
                    lblVista.repaint();*/
                    //txtSrc.setText(String.valueOf(buffing));
                    //Image foto = getToolkit().getImage(txtSrc.getText());
                    Image foto = buffing.getScaledInstance(lblVista2.getWidth(), lblVista2.getHeight(), Image.SCALE_DEFAULT);
                    lblVista2.setIcon(new ImageIcon(foto)); //Colocar imagen en el lbl
                } catch (IOException o) {
                    System.err.println(o);
                }
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_tblProductos2MouseClicked

    private void btnGestionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarMouseClicked
        // TODO add your handling code here:
        jlblSombra4.setVisible(true);
        jlblSombra1.setVisible(false);
        jlblSombra2.setVisible(false);
        jlblSombra3.setVisible(false);
    }//GEN-LAST:event_btnGestionarMouseClicked

    private void btnValesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValesMouseClicked
        // TODO add your handling code here:
        jlblSombra4.setVisible(false);
        jlblSombra1.setVisible(true);
        jlblSombra2.setVisible(false);
        jlblSombra3.setVisible(false);
    }//GEN-LAST:event_btnValesMouseClicked

    private void btnAcercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaMouseClicked
        // TODO add your handling code here:
        jlblSombra4.setVisible(false);
        jlblSombra1.setVisible(false);
        jlblSombra2.setVisible(true);
        jlblSombra3.setVisible(false);
    }//GEN-LAST:event_btnAcercaMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        jlblSombra4.setVisible(false);
        jlblSombra1.setVisible(false);
        jlblSombra2.setVisible(false);
        jlblSombra3.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarActionPerformed
        // TODO add your handling code here:
        //Inventario inv = new Inventario();
        //inv.setVisible(true);
        Inventario inv = new Inventario(); 
        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();
        CtrlProducto ctrl = new CtrlProducto(mod, modC, inv);
        ctrl.iniciar();
        inv.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnGestionarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAcerca;
    public javax.swing.JButton btnExport;
    public javax.swing.JButton btnGestionar;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnVales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlblInv;
    private javax.swing.JLabel jlblMenu;
    private javax.swing.JLabel jlblPanel;
    private javax.swing.JLabel jlblSombra1;
    private javax.swing.JLabel jlblSombra2;
    private javax.swing.JLabel jlblSombra3;
    private javax.swing.JLabel jlblSombra4;
    private javax.swing.JLabel jlblTexto1;
    private javax.swing.JLabel jlblTexto2;
    private javax.swing.JLabel jlblTexto3;
    private javax.swing.JLabel jlblTexto4;
    private javax.swing.JPanel jpBase;
    private vista.PanelRound jpBtnGuardar;
    private javax.swing.JPanel jpNapbar;
    private javax.swing.JPanel jpSlide;
    private javax.swing.JLabel lblVista2;
    private vista.PanelRound panelRound1;
    public javax.swing.JTable tblProductos2;
    private javax.swing.JTextField txtBuscar;
    public javax.swing.JLabel txtFecha;
    // End of variables declaration//GEN-END:variables
}
