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
import java.util.ArrayList;
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
    public void agregarUsuario(Usuario user){
        if(ValidarUsuario(user.getUsuario(), user.getPassword())==null){
            try {
                stmt.executeUpdate("INSERT INTO usuarios (usuario, password, priviegio) VALUES ('"+user.getUsuario()+"', '"+user.getPassword()+"', "+ user.getPrivilegio()+")");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El usuario ya existe");
        }
    }
    public void borrarUsuario(String usuario, String password){
        if(ValidarUsuario(usuario, password)!=null){
            try {
                stmt.executeUpdate("DELETE FROM usuarios WHERE usuario = '"+usuario+"' AND password = '"+password+"'");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }
    }
    public void actualizarUsuario(String usuario, String password, String newPassword, int newPrivilegio){
        if(ValidarUsuario(usuario, password)!=null){
            try {
                stmt.executeUpdate("UPDATE usuarios SET password = '"+newPassword+"', priviegio = '"+newPrivilegio+"' WHERE usuario = '"+usuario+"' AND password = '"+password+"'");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }
    }
    public void actualizarUsuario(String usuario, String password, String newPassword){
        if(ValidarUsuario(usuario, password)!=null){
            try {
                stmt.executeUpdate("UPDATE usuarios SET password = '"+newPassword+"' WHERE usuario = '"+usuario+"' AND password = '"+password+"'");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }
    }
    public void actualizarUsuario(String usuario, String password, int newPrivilegio){
        if(ValidarUsuario(usuario, password)!=null){
            try {
                stmt.executeUpdate("UPDATE usuarios SET priviegio = '"+newPrivilegio+"' WHERE usuario = '"+usuario+"' AND password = '"+password+"'");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }
    }
    public Producto buscarProducto(String dato, String atributoBusqueda){
        Producto producto = new Producto();
        switch(atributoBusqueda){
            case "numParte":
                try {
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM inventario WHERE numeroParte='"+dato+"'");
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
                break;
            case "modelo":
                try {
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM inventario WHERE modelo='"+dato+"'");
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
                break;
            case "nombre":
                try {
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM inventario WHERE nombreProducto='"+dato+"'");
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
                break;
                default:
                    Logger.getLogger("Case no valido en metodo: buscarProducto");
        }
        return producto;
    }
    public ArrayList<Producto> getProductos(){
         ArrayList<Producto> productos = new ArrayList<>();
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM inventario");
                while(rs.next()){
                    Producto producto = new Producto();
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
                    productos.add(producto);
                }        
            } catch (SQLException ex) {
                Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
            return productos;
    }
    public void actualizarProducto(Producto produ, int id){
        try {
            stmt.executeUpdate("UPDATE inventario SET nombreProducto = '"+produ.getNombreProducto()+"', modelo = '"+produ.getModelo()+"', descripcion = '"+produ.getDescripcion()+"', precio = "+produ.getPrecio()+", numeroParte = '"+produ.getNumeroParte()+"', categoria = '"+produ.getCategoria()+"', estatus = '"+produ.getEstatus()+"', cantidad = '"+produ.getCantidad()+"' WHERE id = "+id+"");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void agregarProducto(Producto produc){
        try {
            stmt.executeUpdate("INSERT INTO inventario (nombreProducto, modelo, descripcion, precio, numeroParte, categoria, estatus, cantidad, fechaIngreso) VALUES ('"+produc.getNombreProducto()+"', '"+produc.getModelo()+"', '"+produc.getDescripcion()+"', "+produc.getPrecio()+", '"+produc.getNumeroParte()+"', '"+produc.getCategoria()+"', '"+produc.getEstatus()+"', "+produc.getCantidad()+", "+ produc.getFechaIngreso()+")");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
        }
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
