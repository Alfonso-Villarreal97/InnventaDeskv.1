package vista;


import controlador.CtrlMenu;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.ConsultasProducto;
import modelo.Producto;

public class Inventario extends javax.swing.JFrame {

    //public String temporal;
    public Inventario() {
        initComponents();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpNapBar = new javax.swing.JPanel();
        jpBtnRegreso = new vista.PanelRound();
        btnRegreso = new javax.swing.JButton();
        jpBase = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelRound1 = new vista.PanelRound();
        txtCodigo = new javax.swing.JTextField();
        panelRound2 = new vista.PanelRound();
        txtNombre = new javax.swing.JTextField();
        panelRound3 = new vista.PanelRound();
        txtMarca = new javax.swing.JTextField();
        panelRound4 = new vista.PanelRound();
        txtModelo = new javax.swing.JTextField();
        panelRound6 = new vista.PanelRound();
        txtPrecio = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        spExistencias = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        lblVista = new javax.swing.JLabel();
        panelRound7 = new vista.PanelRound();
        txtDescripcion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        panelRound8 = new vista.PanelRound();
        txtSrc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        jpBtnDelete = new vista.PanelRound();
        btnEliminar = new javax.swing.JButton();
        jpBtnSelect = new vista.PanelRound();
        btnSelect = new javax.swing.JButton();
        jpBtnGuardar = new vista.PanelRound();
        btnAlta = new javax.swing.JButton();
        jpBtnUpdate = new vista.PanelRound();
        btnActualiza = new javax.swing.JButton();
        jpBtnLimpiar = new vista.PanelRound();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpNapBar.setBackground(new java.awt.Color(0, 52, 150));
        jpNapBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBtnRegreso.setBackground(new java.awt.Color(48, 48, 48));
        jpBtnRegreso.setRoundBottomLeft(25);
        jpBtnRegreso.setRoundBottomRight(25);
        jpBtnRegreso.setRoundTopLeft(25);
        jpBtnRegreso.setRoundTopRight(25);

        btnRegreso.setForeground(new java.awt.Color(255, 255, 255));
        btnRegreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Return.png"))); // NOI18N
        btnRegreso.setText("   Regresar");
        btnRegreso.setBorderPainted(false);
        btnRegreso.setContentAreaFilled(false);
        btnRegreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBtnRegresoLayout = new javax.swing.GroupLayout(jpBtnRegreso);
        jpBtnRegreso.setLayout(jpBtnRegresoLayout);
        jpBtnRegresoLayout.setHorizontalGroup(
            jpBtnRegresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegreso, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jpBtnRegresoLayout.setVerticalGroup(
            jpBtnRegresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnRegresoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpNapBar.add(jpBtnRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jpNapBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 50));

        jpBase.setBackground(new java.awt.Color(32, 32, 32));
        jpBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código:");
        jpBase.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar los siguientes datos:");
        jpBase.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo:");
        jpBase.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jpBase.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio ($ MXN): ");
        jpBase.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo:");
        jpBase.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Existencias:");
        jpBase.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Marca:");
        jpBase.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jpBase.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 200, 30));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(25);
        panelRound2.setRoundBottomRight(25);
        panelRound2.setRoundTopLeft(25);
        panelRound2.setRoundTopRight(25);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jpBase.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 200, 30));

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(25);
        panelRound3.setRoundBottomRight(25);
        panelRound3.setRoundTopLeft(25);
        panelRound3.setRoundTopRight(25);

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setBorder(null);
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jpBase.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 200, 30));

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setRoundBottomLeft(25);
        panelRound4.setRoundBottomRight(25);
        panelRound4.setRoundTopLeft(25);
        panelRound4.setRoundTopRight(25);

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setBorder(null);
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jpBase.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 200, 30));

        panelRound6.setBackground(new java.awt.Color(255, 255, 255));
        panelRound6.setRoundBottomLeft(25);
        panelRound6.setRoundBottomRight(25);
        panelRound6.setRoundTopLeft(25);
        panelRound6.setRoundTopRight(25);

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(null);
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jpBase.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 200, 30));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- -", "Refaccion", "Herramienta", "Tarjeta" }));
        cbTipo.setBorder(null);
        jpBase.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 100, 30));

        spExistencias.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));
        spExistencias.setBorder(null);
        jpBase.add(spExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 100, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descripción:");
        jpBase.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, 30));

        lblVista.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Vista previa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpBase.add(lblVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 200, 290));

        panelRound7.setBackground(new java.awt.Color(255, 255, 255));
        panelRound7.setRoundBottomLeft(25);
        panelRound7.setRoundBottomRight(25);
        panelRound7.setRoundTopLeft(25);
        panelRound7.setRoundTopRight(25);

        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setBorder(null);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jpBase.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 200, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Elegir imagen:");
        jpBase.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, 30));

        panelRound8.setBackground(new java.awt.Color(255, 255, 255));
        panelRound8.setRoundBottomLeft(25);
        panelRound8.setRoundBottomRight(25);
        panelRound8.setRoundTopLeft(25);
        panelRound8.setRoundTopRight(25);

        txtSrc.setBackground(new java.awt.Color(255, 255, 255));
        txtSrc.setBorder(null);
        txtSrc.setEnabled(false);

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSrc, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSrc, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jpBase.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 200, 30));

        tblProductos.setBackground(new java.awt.Color(255, 255, 255));
        tblProductos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProductos.getTableHeader().setReorderingAllowed(false);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jpBase.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 640, 380));
        jpBase.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 200, -1));

        jpBtnDelete.setBackground(new java.awt.Color(0, 102, 204));
        jpBtnDelete.setRoundBottomLeft(25);
        jpBtnDelete.setRoundBottomRight(25);
        jpBtnDelete.setRoundTopLeft(25);
        jpBtnDelete.setRoundTopRight(25);

        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpBtnDeleteLayout = new javax.swing.GroupLayout(jpBtnDelete);
        jpBtnDelete.setLayout(jpBtnDeleteLayout);
        jpBtnDeleteLayout.setHorizontalGroup(
            jpBtnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jpBtnDeleteLayout.setVerticalGroup(
            jpBtnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnDeleteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBase.add(jpBtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 520, 110, 30));

        jpBtnSelect.setBackground(new java.awt.Color(0, 102, 204));
        jpBtnSelect.setRoundBottomLeft(25);
        jpBtnSelect.setRoundBottomRight(25);
        jpBtnSelect.setRoundTopLeft(25);
        jpBtnSelect.setRoundTopRight(25);

        btnSelect.setForeground(new java.awt.Color(255, 255, 255));
        btnSelect.setText("Seleccionar");
        btnSelect.setBorderPainted(false);
        btnSelect.setContentAreaFilled(false);
        btnSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBtnSelectLayout = new javax.swing.GroupLayout(jpBtnSelect);
        jpBtnSelect.setLayout(jpBtnSelectLayout);
        jpBtnSelectLayout.setHorizontalGroup(
            jpBtnSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSelect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jpBtnSelectLayout.setVerticalGroup(
            jpBtnSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jpBase.add(jpBtnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 110, 30));

        jpBtnGuardar.setBackground(new java.awt.Color(0, 102, 204));
        jpBtnGuardar.setRoundBottomLeft(25);
        jpBtnGuardar.setRoundBottomRight(25);
        jpBtnGuardar.setRoundTopLeft(25);
        jpBtnGuardar.setRoundTopRight(25);

        btnAlta.setForeground(new java.awt.Color(255, 255, 255));
        btnAlta.setText("Guardar");
        btnAlta.setBorderPainted(false);
        btnAlta.setContentAreaFilled(false);
        btnAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpBtnGuardarLayout = new javax.swing.GroupLayout(jpBtnGuardar);
        jpBtnGuardar.setLayout(jpBtnGuardarLayout);
        jpBtnGuardarLayout.setHorizontalGroup(
            jpBtnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jpBtnGuardarLayout.setVerticalGroup(
            jpBtnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBase.add(jpBtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, -1, 30));

        jpBtnUpdate.setBackground(new java.awt.Color(0, 102, 204));
        jpBtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jpBtnUpdate.setRoundBottomLeft(25);
        jpBtnUpdate.setRoundBottomRight(25);
        jpBtnUpdate.setRoundTopLeft(25);
        jpBtnUpdate.setRoundTopRight(25);

        btnActualiza.setForeground(new java.awt.Color(255, 255, 255));
        btnActualiza.setText("Actualizar");
        btnActualiza.setBorderPainted(false);
        btnActualiza.setContentAreaFilled(false);
        btnActualiza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpBtnUpdateLayout = new javax.swing.GroupLayout(jpBtnUpdate);
        jpBtnUpdate.setLayout(jpBtnUpdateLayout);
        jpBtnUpdateLayout.setHorizontalGroup(
            jpBtnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualiza, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jpBtnUpdateLayout.setVerticalGroup(
            jpBtnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnUpdateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnActualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBase.add(jpBtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, 30));

        jpBtnLimpiar.setBackground(new java.awt.Color(0, 102, 204));
        jpBtnLimpiar.setRoundBottomLeft(25);
        jpBtnLimpiar.setRoundBottomRight(25);
        jpBtnLimpiar.setRoundTopLeft(25);
        jpBtnLimpiar.setRoundTopRight(25);

        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpBtnLimpiarLayout = new javax.swing.GroupLayout(jpBtnLimpiar);
        jpBtnLimpiar.setLayout(jpBtnLimpiarLayout);
        jpBtnLimpiarLayout.setHorizontalGroup(
            jpBtnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jpBtnLimpiarLayout.setVerticalGroup(
            jpBtnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnLimpiarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBase.add(jpBtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 520, -1, 30));

        getContentPane().add(jpBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        //BOTON SELECCIONAR IMAGEN        
        JFileChooser fc = new JFileChooser(); //Con la función JFileChooser genero un seleccionador de archivos
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de archivos (*.PNG, *.JPG, *.JPEG)", "png", "jpg", "jpeg");
        lblVista.removeAll();
        fc.setFileFilter(filtro);
        int seleccion = fc.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            String ruta = fichero.getAbsolutePath();
            txtSrc.setText(String.valueOf(ruta));
            Image foto = getToolkit().getImage(txtSrc.getText());
            foto = foto.getScaledInstance(188, 250, Image.SCALE_DEFAULT); //Dimensiono la foto dentro del label
            // lblVista.setIcon(new ImageIcon(foto)); //Colocar imagen en el lbl
            //buffing = ImageIO.read(img);
            //int x = lblVista.getWidth();
            //int y = lblVista.getHeight();
            //Imagen imagen = new Imagen(x, y, ruta);
            //Imagen imagen = new Imagen(lblVista.getHeight(), lblVista.getWidth(), ruta);
            lblVista.setIcon(new ImageIcon(foto)); //Colocar imagen en el lbl
            //lblVista.add(imagen);
            //lblVista.repaint();

        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        // TODO add your handling code here:
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            int Fila = tblProductos.getSelectedRow();
            String codigo = tblProductos.getValueAt(Fila, 0).toString();

            ps = con.prepareStatement("SELECT id, codigo, nombre, modelo, marca, precio, tipo, existencia, descripcion, imagen FROM inventario WHERE codigo=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            BufferedImage buffing = null;
            byte[] image = null; //Declaro un arreglo de bytes vacio
            // byte[] cadena = null;
            while (rs.next()) {
                txtId.setText(rs.getString("id"));
                txtCodigo.setText(rs.getString("codigo"));
                txtNombre.setText(rs.getString("nombre"));
                txtModelo.setText(rs.getString("modelo"));
                txtMarca.setText(rs.getString("marca"));
                txtPrecio.setText(rs.getString("precio"));
                cbTipo.setSelectedItem(rs.getString("tipo"));
                spExistencias.setValue(rs.getInt("existencia"));
                txtDescripcion.setText(rs.getString("descripcion"));

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
                    Image foto = buffing.getScaledInstance(lblVista.getWidth(), lblVista.getHeight(), Image.SCALE_DEFAULT);
                    lblVista.setIcon(new ImageIcon(foto)); //Colocar imagen en el lbl
                } catch (IOException o) {
                    System.err.println(o);
                }
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        btnAlta.setEnabled(false);

    }//GEN-LAST:event_tblProductosMouseClicked

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // VALIDO QUE SOLO SE INGRESEN NUMEROS - VALIDO EL TAMAÑO DE LO QUE SE INGRESE
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();        
        if(txtPrecio.getText().length() >= 15){
            evt.consume(); //Ejecuto evento
            Toolkit.getDefaultToolkit().beep(); //Mando a llamar esta "libería" que genera el sonido de lock de windows
        }
        
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        // VALIDO EL TAMAÑO DE LO QUE SE INGRESE
        if(txtCodigo.getText().length() >= 8){
            evt.consume(); //Ejecuto evento
            Toolkit.getDefaultToolkit().beep(); //Mando a llamar esta "libería" que genera el sonido de lock de windows
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // VALIDO EL TAMAÑO DE LO QUE SE INGRESE
        if(txtNombre.getText().length() >= 45){
            evt.consume(); //Ejecuto evento
            Toolkit.getDefaultToolkit().beep(); //Mando a llamar esta "libería" que genera el sonido de lock de windows
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        // VALIDO EL TAMAÑO DE LO QUE SE INGRESE
        if(txtModelo.getText().length() >= 45){
            evt.consume(); //Ejecuto evento
            Toolkit.getDefaultToolkit().beep(); //Mando a llamar esta "libería" que genera el sonido de lock de windows
        }
    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        // VALIDO EL TAMAÑO DE LO QUE SE INGRESE
        if(txtMarca.getText().length() >= 45){
            evt.consume(); //Ejecuto evento
            Toolkit.getDefaultToolkit().beep(); //Mando a llamar esta "libería" que genera el sonido de lock de windows
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        // VALIDO EL TAMAÑO DE LO QUE SE INGRESE
        if(txtDescripcion.getText().length() >= 45){
            evt.consume(); //Ejecuto evento
            Toolkit.getDefaultToolkit().beep(); //Mando a llamar esta "libería" que genera el sonido de lock de windows
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void btnRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresoActionPerformed
        // TODO add your handling code here:
        dispose(); 
        
        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();
        Menu menu = new Menu();
        CtrlMenu ctrlm = new CtrlMenu(mod, modC, menu);
        ctrlm.iniciar();
        menu.setVisible(true);
        
               
    }//GEN-LAST:event_btnRegresoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualiza;
    public javax.swing.JButton btnAlta;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnRegreso;
    private javax.swing.JButton btnSelect;
    public javax.swing.JComboBox<String> cbTipo;
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
    private javax.swing.JPanel jpBase;
    private vista.PanelRound jpBtnDelete;
    private vista.PanelRound jpBtnGuardar;
    private vista.PanelRound jpBtnLimpiar;
    private vista.PanelRound jpBtnRegreso;
    private vista.PanelRound jpBtnSelect;
    private vista.PanelRound jpBtnUpdate;
    private javax.swing.JPanel jpNapBar;
    public javax.swing.JLabel lblVista;
    private vista.PanelRound panelRound1;
    private vista.PanelRound panelRound2;
    private vista.PanelRound panelRound3;
    private vista.PanelRound panelRound4;
    private vista.PanelRound panelRound6;
    private vista.PanelRound panelRound7;
    private vista.PanelRound panelRound8;
    public javax.swing.JSpinner spExistencias;
    public javax.swing.JTable tblProductos;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtMarca;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextField txtSrc;
    // End of variables declaration//GEN-END:variables
}
