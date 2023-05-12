package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SQLUsuario {
    public boolean registrar(Usuario usuario){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("insert into usuario (nombreUsuario,contraseña,nombre,correo, idTipo_usuario) values (?,?,?,?,?)");
            ps.setString(1, usuario.getNombreUsuario());
            ps.setString(2, usuario.getContraseña());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getCorreo());
            ps.setInt(5, usuario.getIdTipo_usuario());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
