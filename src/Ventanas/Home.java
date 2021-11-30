/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Controladores.ConectarBD;
import Modelos.Producto;
import Modelos.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gerardo
 */
public class Home extends javax.swing.JFrame {
    
    private List<String> productosAgregados = new ArrayList<String>();
    private String modelo;
    private final String nombreColumnas[] = {"Nombre","Modelo","Numero de parte","Precio"};
    private final String nombreColumnasUsuarios[] = {"ID","Usuario","Password","Privilegio"};
    private final String nombreColumnasProductos[] = {"ID","Nombre","Modelo","Descripcion","Precio","Num Parte","Categoria","Estatus","Cantidad","Fecha Ingreso"};
    private Producto producto;
    private Usuario usuario;
    DefaultTableModel model = new DefaultTableModel(null, nombreColumnas){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        
    };
    DefaultTableModel modelTablaUsuarios = new DefaultTableModel(null, nombreColumnasUsuarios){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; //To change body of generated methods, choose Tools | Templates.
        }  
    };
    DefaultTableModel modelTablaProductos = new DefaultTableModel(null, nombreColumnasProductos){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; //To change body of generated methods, choose Tools | Templates.
        }
    };
    /**
     * Creates new form Home
     */
    public Home(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);
        jTable1.setModel(model);
        jLabelUsuarioName.setText(user.getUsuario());
        usuario = user;
        ocultarPantallaVentas();
        jLayeredPaneUsuarios.setVisible(false);
        jLayeredPaneProductos.setVisible(false);
        jTableUsuarios.setModel(modelTablaUsuarios);
        llenarTablaProductos();
        jTableProductos.setModel(modelTablaProductos);
    }
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTable1.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPaneProductos = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombreProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldModeloProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDescripcionProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPrecioProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNumParteProducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCategoriaProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldEstatusProducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCantidadProducto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLayeredPaneUsuarios = new javax.swing.JLayeredPane();
        jButtonBuscarUsuario = new javax.swing.JButton();
        jButtonAgregarUsuario = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPrivilegioUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPassUsuario = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonBorrarUsuario = new javax.swing.JButton();
        jButtonActualizarUsuario = new javax.swing.JButton();
        jButtonCerra = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jButtonVentas = new javax.swing.JButton();
        jButtonUsuarios = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonAlmacen = new javax.swing.JButton();
        jLabelFondoMenu = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabelDescripcion = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jLabelNameUsuario = new javax.swing.JLabel();
        jLabelDescripcionProd = new javax.swing.JLabel();
        jLabelNombreProd = new javax.swing.JLabel();
        jLabelIdProducto = new javax.swing.JLabel();
        jLabelCantidadProducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelUsuarioName = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPaneProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del producto");
        jLayeredPaneProductos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));
        jLayeredPaneProductos.add(jTextFieldNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 250, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modelo");
        jLayeredPaneProductos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));
        jLayeredPaneProductos.add(jTextFieldModeloProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripcion");
        jLayeredPaneProductos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));
        jLayeredPaneProductos.add(jTextFieldDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 250, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio");
        jLayeredPaneProductos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));
        jLayeredPaneProductos.add(jTextFieldPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Numero de parte");
        jLayeredPaneProductos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));
        jLayeredPaneProductos.add(jTextFieldNumParteProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 250, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Categoria");
        jLayeredPaneProductos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));
        jLayeredPaneProductos.add(jTextFieldCategoriaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estatus");
        jLayeredPaneProductos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));
        jLayeredPaneProductos.add(jTextFieldEstatusProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 120, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cantidad");
        jLayeredPaneProductos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));
        jLayeredPaneProductos.add(jTextFieldCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 120, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Borrar");
        jLayeredPaneProductos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 89, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Conpletar");
        jLayeredPaneProductos.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 89, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Actualizar");
        jLayeredPaneProductos.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Agregar");
        jLayeredPaneProductos.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 89, -1));

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableProductos);

        jLayeredPaneProductos.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 940, 170));

        getContentPane().add(jLayeredPaneProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 690));

        jLayeredPaneUsuarios.setBackground(new java.awt.Color(102, 255, 102));
        jLayeredPaneUsuarios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLayeredPaneUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBuscarUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBuscarUsuario.setText("Buscar");
        jButtonBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarUsuarioActionPerformed(evt);
            }
        });
        jLayeredPaneUsuarios.add(jButtonBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 80, -1));

        jButtonAgregarUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAgregarUsuario.setText("Agregar");
        jButtonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarUsuarioActionPerformed(evt);
            }
        });
        jLayeredPaneUsuarios.add(jButtonAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        Usuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Nombre del usuario");
        jLayeredPaneUsuarios.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));
        jLayeredPaneUsuarios.add(jTextFieldNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 250, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");
        jLayeredPaneUsuarios.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jTextFieldPrivilegioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrivilegioUsuarioActionPerformed(evt);
            }
        });
        jLayeredPaneUsuarios.add(jTextFieldPrivilegioUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 250, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Privilegio");
        jLayeredPaneUsuarios.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 274, -1, -1));

        jTextFieldPassUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassUsuarioActionPerformed(evt);
            }
        });
        jLayeredPaneUsuarios.add(jTextFieldPassUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 250, 30));

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableUsuarios);

        jLayeredPaneUsuarios.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 450, 340));

        jButtonBorrarUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBorrarUsuario.setText("Borrar usuario");
        jButtonBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarUsuarioActionPerformed(evt);
            }
        });
        jLayeredPaneUsuarios.add(jButtonBorrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, -1, -1));

        jButtonActualizarUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonActualizarUsuario.setText("Actualizar usuario");
        jButtonActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarUsuarioActionPerformed(evt);
            }
        });
        jLayeredPaneUsuarios.add(jButtonActualizarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));

        getContentPane().add(jLayeredPaneUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 690));

        jButtonCerra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCerra.setText("X");
        jButtonCerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerraActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, -1, -1));

        jButtonCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCerrarSesion.setText("Cerrar Sesion");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, -1, -1));

        jButtonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/iconCarShop.png"))); // NOI18N
        jButtonVentas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/iconCarShopSelec.png"))); // NOI18N
        jButtonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 30, -1, -1));

        jButtonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/iconUsers.png"))); // NOI18N
        jButtonUsuarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/iconUsersSelec.png"))); // NOI18N
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 130, -1, -1));

        jLabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/iconUser.png"))); // NOI18N
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 55, 60, 60));

        jButtonAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/iconStock.png"))); // NOI18N
        jButtonAlmacen.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/iconStockSelec.png"))); // NOI18N
        jButtonAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 230, -1, -1));

        jLabelFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 100, 690));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 250, 30));
        getContentPane().add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 250, 30));
        getContentPane().add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 250, 30));

        jLabelDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 240, 80));

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBuscar.setText("Buscar por #Parte");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));

        jButtonVender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonVender.setText("Vender");
        getContentPane().add(jButtonVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, -1, -1));

        jLabelNameUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNameUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNameUsuario.setText("Bienvenid@");
        getContentPane().add(jLabelNameUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 120, 100, -1));

        jLabelDescripcionProd.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDescripcionProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDescripcionProd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcionProd.setText("Descripcion");
        getContentPane().add(jLabelDescripcionProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jLabelNombreProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNombreProd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreProd.setText("Nombre del producto");
        getContentPane().add(jLabelNombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabelIdProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelIdProducto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIdProducto.setText("Numero de parte");
        getContentPane().add(jLabelIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jLabelCantidadProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCantidadProducto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidadProducto.setText("Cantidad disponible");
        getContentPane().add(jLabelCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 273, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, 340));

        jLabelUsuarioName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUsuarioName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuarioName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuarioName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelUsuarioName, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 134, 100, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerraActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCerraActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login frameInicio = new Login();
        frameInicio.setVisible(true);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        ConectarBD conexion = new ConectarBD();
        producto = conexion.buscarProducto(jTextFieldId.getText());
        if(producto!=null){
            if(producto.getCantidad()<1)
                JOptionPane.showMessageDialog(null, "El producto no esta disponible.");
            else{
                jTextFieldNombre.setText(producto.getNombreProducto());
                jTextFieldCantidad.setText(producto.getCantidad()+"");
                jLabelDescripcion.setText(producto.getDescripcion());
                modelo = producto.getModelo();
            }
        }else{
            JOptionPane.showMessageDialog(null, "El producto no esta disponible.");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        if(jTextFieldNombre.getText().equals("")||jTextFieldCantidad.getText().equals("") || jTextFieldCantidad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No ha seleccionado el articulo.");
        }
        else{
            if(productosAgregados.size()<1)
            productosAgregados.add(jTextFieldId.getText());
            agregarProductoTabla(producto);
            jTextFieldNombre.setText("");
            jTextFieldId.setText("");
            jTextFieldCantidad.setText("");
            jLabelDescripcion.setText("Se agrego correctamente");
        }
        
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentasActionPerformed
        // TODO add your handling code here:
        jButtonVentas.setSelected(true);
        jButtonUsuarios.setSelected(false);
        jButtonAlmacen.setSelected(false);
        mostrarPantallaVentas();
        jLayeredPaneUsuarios.setVisible(false);
        jLayeredPaneProductos.setVisible(false);
    }//GEN-LAST:event_jButtonVentasActionPerformed

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed
        // TODO add your handling code here:
        jButtonVentas.setSelected(false);
        jButtonUsuarios.setSelected(true);
        jButtonAlmacen.setSelected(false);
        ocultarPantallaVentas();
        jLayeredPaneUsuarios.setVisible(true);
        jLayeredPaneProductos.setVisible(false);
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void jButtonAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlmacenActionPerformed
        jButtonVentas.setSelected(false);
        jButtonUsuarios.setSelected(false);
        jButtonAlmacen.setSelected(true);
        ocultarPantallaVentas();
        jLayeredPaneUsuarios.setVisible(false);
        jLayeredPaneProductos.setVisible(true);
    }//GEN-LAST:event_jButtonAlmacenActionPerformed

    private void jTextFieldPrivilegioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrivilegioUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrivilegioUsuarioActionPerformed

    private void jTextFieldPassUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPassUsuarioActionPerformed

    private void jButtonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarUsuarioActionPerformed
        if(jTextFieldNombreUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No ha ingreso ningun nombre de usuario");
        }
        else{
            ConectarBD conexion = new ConectarBD();
            Usuario user = conexion.BuscarUsuario(jTextFieldNombreUsuario.getText().toString());
            if(user==null){
                JOptionPane.showMessageDialog(null, "El usuario no existe");
            }
            else{
                agregarUsuarioTabla(user);
            }
        }
    }//GEN-LAST:event_jButtonBuscarUsuarioActionPerformed

    private void jButtonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarUsuarioActionPerformed
        ConectarBD conexion = new ConectarBD();
        if(jTextFieldNombreUsuario.getText().equals("")||jTextFieldPassUsuario.getText().equals("")||jTextFieldPrivilegioUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete los campos");
        }else{
            
            if(conexion.BuscarUsuario(jTextFieldNombreUsuario.getText())!=null)
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
            else{
                if(validarPrivilegio(jTextFieldPrivilegioUsuario.getText())==0){
                    JOptionPane.showMessageDialog(null, "El privilegio no es valido, ingrese 1, 2 o 3");
                }
                else{
                    Usuario user = new Usuario();
                    user.setUsuario(jTextFieldNombreUsuario.getText());
                    user.setPassword(jTextFieldPassUsuario.getText());
                    user.setPrivilegio(Integer.parseInt(jTextFieldPrivilegioUsuario.getText()));
                    conexion.agregarUsuario(user);
                    JOptionPane.showMessageDialog(null, "Usuario agregado con exito");
                    user=conexion.BuscarUsuario(user.getUsuario());
                    jTextFieldPassUsuario.setText("");
                    jTextFieldPrivilegioUsuario.setText("");
                    agregarUsuarioTabla(user);
                }
             }
        }
    }//GEN-LAST:event_jButtonAgregarUsuarioActionPerformed

    private void jButtonBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarUsuarioActionPerformed
        ConectarBD conexion = new ConectarBD();
        if(modelTablaUsuarios.getRowCount()>0){
            conexion.borrarUsuario(jTableUsuarios.getValueAt(0, 1).toString(),jTableUsuarios.getValueAt(0, 2).toString());
            JOptionPane.showMessageDialog(null, "Usuario borrado con exito");
            jTextFieldNombreUsuario.setText("");
            jTextFieldPassUsuario.setText("");
            jTextFieldPrivilegioUsuario.setText("");
            modelTablaUsuarios.removeRow(0);
            jTableUsuarios.setModel(modelTablaUsuarios);
        }
        else
            JOptionPane.showMessageDialog(null,"No hay ningun usuario seleccionado");
    }//GEN-LAST:event_jButtonBorrarUsuarioActionPerformed

    private void jButtonActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarUsuarioActionPerformed
        if(modelTablaUsuarios.getRowCount()>0){
            if(jTextFieldPassUsuario.getText().equals("")&&jTextFieldPrivilegioUsuario.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese por lo menos un campo a modificar");
            else{
                if(jTextFieldPrivilegioUsuario.getText().equals("")){
                    ConectarBD conexion = new ConectarBD();
                    conexion.actualizarUsuario(jTableUsuarios.getValueAt(0, 1).toString(), jTableUsuarios.getValueAt(0, 2).toString(), jTextFieldPassUsuario.getText());
                    JOptionPane.showMessageDialog(null, "Contraseña actualizada correctamente");
                    limpiarPantallaNoJtfUsuario();
                }
                else{
                    if(jTextFieldPassUsuario.getText().equals("")){
                        if(validarPrivilegio(jTextFieldPrivilegioUsuario.getText())==0){
                        JOptionPane.showMessageDialog(null, "El privilegio no es valido, ingrese 1, 2 o 3");
                        }
                        else{
                            ConectarBD conexion = new ConectarBD();
                            conexion.actualizarUsuario(jTableUsuarios.getValueAt(0, 1).toString(), jTableUsuarios.getValueAt(0, 2).toString(), validarPrivilegio(jTextFieldPrivilegioUsuario.getText()));
                            JOptionPane.showMessageDialog(null, "Privilegio actualizado correctamente");
                            limpiarPantallaNoJtfUsuario();
                        }
                    }
                    else{
                        if(validarPrivilegio(jTextFieldPrivilegioUsuario.getText())==0){
                        JOptionPane.showMessageDialog(null, "El privilegio no es valido, ingrese 1, 2 o 3");
                        }
                        else{
                            ConectarBD conexion = new ConectarBD();
                            conexion.actualizarUsuario(jTableUsuarios.getValueAt(0, 1).toString(), jTableUsuarios.getValueAt(0, 2).toString(), jTextFieldPassUsuario.getText(), validarPrivilegio(jTextFieldPrivilegioUsuario.getText()));
                            JOptionPane.showMessageDialog(null, "Contraseña y privilegio actualizados correctamente");
                            limpiarPantallaNoJtfUsuario();
                        }
                    }
                }
            }
        }
        else
            JOptionPane.showMessageDialog(null,"No hay ningun usuario seleccionado");
    }//GEN-LAST:event_jButtonActualizarUsuarioActionPerformed
    public void llenarTablaProductos(){
        ConectarBD conexion = new ConectarBD();
        ArrayList<Producto> productos = conexion.getProductos();
        Object[] dato = new Object[nombreColumnasProductos.length];
        for(Producto produc:productos){
                dato[0] = produc.getId();
                dato[1] = produc.getNombreProducto();
                dato[2] = produc.getModelo();
                dato[3] = produc.getDescripcion();
                dato[4] = produc.getPrecio();
                dato[5] = produc.getNumeroParte();
                dato[6] = produc.getCategoria();
                dato[7] = produc.getEstatus();
                dato[8] = produc.getCantidad();
                dato[9] = produc.getFechaIngreso();
                modelTablaProductos.addRow(dato);
            }
    }
    public void agregarProductoTabla(Producto produc){
        Object[] dato = new Object[nombreColumnas.length];
        dato[0] = produc.getNombreProducto();
        dato[1] = produc.getModelo();
        dato[2] = produc.getNumeroParte();
        dato[3] = produc.getPrecio();
        model.addRow(dato);
    }
    public void agregarUsuarioTabla(Usuario user){
        Object[] dato = new Object[nombreColumnas.length];
                dato[0] = user.getId();
                dato[1] = user.getUsuario();
                dato[2] = user.getPassword();
                dato[3] = user.getPrivilegio();
                if(modelTablaUsuarios.getRowCount()>0)
                    modelTablaUsuarios.removeRow(0);
                modelTablaUsuarios.addRow(dato);
    }
    public int validarPrivilegio(String privilegio){
        if(privilegio.equals("1")||privilegio.equals("2")||privilegio.equals("3")){
            return Integer.parseInt(privilegio);
        }
        else{
            return 0;
        }
    }
    public void limpiarPantallaNoJtfUsuario(){
        jTextFieldPassUsuario.setText("");
        jTextFieldPrivilegioUsuario.setText("");
        if(modelTablaUsuarios.getRowCount()>0){
            modelTablaUsuarios.removeRow(0);
            jTableUsuarios.setModel(modelTablaUsuarios);
        }
    }
    public void ocultarPantallaVentas(){
        jButtonAgregar.setVisible(false);
        jButtonBuscar.setVisible(false);
        jButtonCancelar.setVisible(false);
        jButtonVender.setVisible(false);
        jLabelCantidadProducto.setVisible(false);
        jLabelDescripcion.setVisible(false);
        jLabelDescripcionProd.setVisible(false);
        jLabelIdProducto.setVisible(false);
        jLabelNombreProd.setVisible(false);
        jScrollPane1.setVisible(false);
        jTextFieldCantidad.setVisible(false);
        jTextFieldId.setVisible(false);
        jTextFieldNombre.setVisible(false);
    }
    public void mostrarPantallaVentas(){
        jButtonAgregar.setVisible(true);
        jButtonBuscar.setVisible(true);
        jButtonCancelar.setVisible(true);
        jButtonVender.setVisible(true);
        jLabelCantidadProducto.setVisible(true);
        jLabelDescripcion.setVisible(true);
        jLabelDescripcionProd.setVisible(true);
        jLabelIdProducto.setVisible(true);
        jLabelNombreProd.setVisible(true);
        jScrollPane1.setVisible(true);
        jTextFieldCantidad.setVisible(true);
        jTextFieldId.setVisible(true);
        jTextFieldNombre.setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonActualizarUsuario;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonAgregarUsuario;
    private javax.swing.JButton jButtonAlmacen;
    private javax.swing.JButton jButtonBorrarUsuario;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBuscarUsuario;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCerra;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonUsuarios;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JButton jButtonVentas;
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
    private javax.swing.JLabel jLabelCantidadProducto;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDescripcionProd;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondoMenu;
    private javax.swing.JLabel jLabelIdProducto;
    private javax.swing.JLabel jLabelNameUsuario;
    private javax.swing.JLabel jLabelNombreProd;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelUsuarioName;
    private javax.swing.JLayeredPane jLayeredPaneProductos;
    private javax.swing.JLayeredPane jLayeredPaneUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldCantidadProducto;
    private javax.swing.JTextField jTextFieldCategoriaProducto;
    private javax.swing.JTextField jTextFieldDescripcionProducto;
    private javax.swing.JTextField jTextFieldEstatusProducto;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldModeloProducto;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombreProducto;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    private javax.swing.JTextField jTextFieldNumParteProducto;
    private javax.swing.JTextField jTextFieldPassUsuario;
    private javax.swing.JTextField jTextFieldPrecioProducto;
    private javax.swing.JTextField jTextFieldPrivilegioUsuario;
    // End of variables declaration//GEN-END:variables
}
