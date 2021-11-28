/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import Modelos.Producto;
import Modelos.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Gerardo
 */
public class ConectarBD {
        String USUARIO="root";
        String PASS ="";
        String URL ="jdbc:mysql://localhost:3306/pruebasjava";
        Connection con;
        Statement stmt;
        ResultSet rs;
    public ConectarBD(){
               
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        try {
            con = DriverManager.getConnection(URL,USUARIO,PASS);
            System.out.println("CONEXION EXITOSA CONTINUA n.n");
        } catch (SQLException ex) {
            Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public Usuario ValidarUsuario(String usuario, String pass){
        Usuario usu = new Usuario();
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM usuarios WHERE usuario='"+usuario+"' AND password ='"+pass+"'");
                
                if(rs.next()){
                    usu.setId(Integer.parseInt(rs.getString("id")));
                    usu.setUsuario(rs.getString("usuario"));
                    usu.setPassword(rs.getString("password"));
                    usu.setPrivilegio(Integer.parseInt(rs.getString("priviegio")));
                    
                }
                else{
                    usu = null;
                }  
                return usu;
            } catch (SQLException ex) {
                Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
                return usu;
            }
    }
    public Usuario BuscarUsuario(String usuario){
        Usuario usu = new Usuario();
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM usuarios WHERE usuario='"+usuario+"'");
                
                if(rs.next()){
                    usu.setId(Integer.parseInt(rs.getString("id")));
                    usu.setUsuario(rs.getString("usuario"));
                    usu.setPassword(rs.getString("password"));
                    usu.setPrivilegio(Integer.parseInt(rs.getString("priviegio")));
                }
                else{
                    usu = null;
                }  
                return usu;
            } catch (SQLException ex) {
                Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
                return usu;
            }
    }
    public Producto buscarProducto(String numParte){
        Producto producto = new Producto();
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM inventario WHERE numeroParte='"+numParte+"'");
                if(rs.next()){
                    producto.setId(Integer.parseInt(rs.getString("id")));
                    producto.setNombreProducto(rs.getString("nombreProducto"));
                    producto.setModelo(rs.getString("modelo"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setPrecio(Integer.parseInt(rs.getString("precio")));
                    producto.setNumeroParte(rs.getString("numeroParte"));
                    producto.setCategoria(rs.getString("categoria"));
                    producto.setEstatus(rs.getString("estatus"));
                    producto.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                    producto.setFechaIngreso(rs.getString("fechaIngreso"));
                    producto.setFechaSalida(rs.getString("fechaSalida"));
                }
                else{
                    producto = null;
                } 
                
            } catch (SQLException ex) {
                Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
                producto = null;
            }
            return producto;
    }
    public void eliminarProductos(String numParte, int cantidad){
        
    }
    public void cerrarBD(){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
