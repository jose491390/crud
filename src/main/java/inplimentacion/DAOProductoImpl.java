/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inplimentacion;

import conexionbd.BdConexion;
import interfazDAO.DAOProducto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tablas.TablaProducto;

/**
 *
 * @author ISABELLA
 */
public class DAOProductoImpl extends BdConexion implements DAOProducto {

    //metodo heredado para registar 
    @Override
    public void registrar(TablaProducto producto) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO tablaproducto(id, nombre, descripcion,"
                    + " precioUnidadCompra, iva, precioUnidadVenta)VALUES (?, ?, ?, ?, ?, ?)");
            st.setInt(1, producto.getId());
            st.setString(2, producto.getNombre());
            st.setString(3, producto.getDescripcion());
            st.setInt(4, producto.getPrecioUnidadCompra());
            st.setInt(5, producto.getIva());
            st.setInt(6, producto.getPrecioUnidadVenta());
            st.executeUpdate();
        } catch (Exception e) {
        } finally {
            this.cerrar();
        }
    }

    //metodo heredado para eliminar 
    @Override
    public void eliminar(int productoId) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM tablaproducto WHERE id = ?;");
            st.setInt(1, productoId);
            st.executeUpdate();
        } catch (Exception e) {
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void modificar(TablaProducto producto) throws Exception {
        try {
            // Aquí debes escribir el código para realizar la actualización en la base de datos
            this.conectar();  // Método ficticio para obtener una conexión a la base de datos
            String sql = "UPDATE tablaproducto SET nombre=?, descripcion=?, precioUnidadCompra=?, iva=?, precioUnidadVenta=? WHERE id=?";
            try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
                stmt.setString(1, producto.getNombre());
                stmt.setString(2, producto.getDescripcion());
                stmt.setDouble(3, producto.getPrecioUnidadCompra());
                stmt.setDouble(4, producto.getIva());
                stmt.setDouble(5, producto.getPrecioUnidadVenta());
                stmt.setInt(6, producto.getId());

                // Ejecutar la actualización
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            // Manejar la excepción adecuadamente
            throw new Exception("Error al modificar el producto en la base de datos", e);
        }
    }

    //metodo para ver una lista de la tabla en labase de datos
    @Override
    public List<TablaProducto> listar() throws Exception {
        List<TablaProducto> productos = new ArrayList<>();

        // Establecer la conexión a la base de datos (reemplaza las credenciales y la URL según tu configuración)
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "")) {
            // Preparar la consulta SQL
            String sql = "SELECT * FROM tablaproducto";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                // Ejecutar la consulta y obtener resultados
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Iterar sobre los resultados y agregar productos a la lista
                    while (resultSet.next()) {
                        TablaProducto producto = new TablaProducto();
                        producto.setId(resultSet.getInt("id"));
                        producto.setNombre(resultSet.getString("nombre"));
                        producto.setDescripcion(resultSet.getString("descripcion"));
                        producto.setPrecioUnidadCompra(resultSet.getInt("precioUnidadCompra"));
                        producto.setIva(resultSet.getInt("iva"));
                        producto.setPrecioUnidadVenta(resultSet.getInt("precioUnidadVenta"));

                        productos.add(producto);
                    }
                }
            }
        }

        return productos;
    }

    @Override
    public TablaProducto getUserById(int userId) throws Exception {
        TablaProducto producto = new TablaProducto();

        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM tablaproducto WHERE id = ?");
            st.setInt(1, userId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioUnidadCompra(rs.getInt("precioUnidadCompra"));
                producto.setIva(rs.getInt("iva"));
                producto.setPrecioUnidadVenta(rs.getInt("precioUnidadVenta"));

            }
        } catch (Exception e) {
        } finally {
            this.cerrar();
        }
        return producto;
    }

    @Override
    public List<TablaProducto> buscar(String name) throws Exception {
        List<TablaProducto> productos = null;
    try {
        this.conectar();
        String query = name.isEmpty() ? "SELECT * FROM tablaproducto" :
                "SELECT * FROM tablaproducto WHERE nombre LIKE '%" + name  + "%'; ";
        PreparedStatement st = this.conexion.prepareStatement(query);
        productos = new ArrayList<>();
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            TablaProducto producto = new TablaProducto();
            producto.setId(rs.getInt("id"));
            producto.setNombre(rs.getString("nombre"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecioUnidadCompra(rs.getInt("precioUnidadCompra"));
            producto.setIva(rs.getInt("iva"));
            producto.setPrecioUnidadVenta(rs.getInt("precioUnidadVenta"));

            productos.add(producto);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Cerrar recursos como PreparedStatement y ResultSet en esta sección si es necesario
        this.cerrar();
    }
    return productos;
    }
}
