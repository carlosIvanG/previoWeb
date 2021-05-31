package previoWeb.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import previoWeb.modelo.Usuario;
import previoWeb.util.ConexionPostgreSQL;

public class UsuariosDao implements crud<Usuario> {
	private ConexionPostgreSQL conexion;

	private static final String insertar = "INSERT INTO servicio(nombre, descripcion, tienda) VALUES (?, ?, ?)";
	private static final String eliminar = "DELETE FROM servicio WHERE id=?";
	private static final String actualizar = "UPDATE servicio SET nombre=?, descripcion=?,tienda=? WHERE id=?";
	private static final String listar = "SELECT * FROM servicio";
	private static final String buscarId = "SELECT * FROM servicio WHERE id=?";

	public UsuariosDao() {
		this.conexion = ConexionPostgreSQL.getConexion();
	}

	@Override
	public void insertar(Usuario servicio) throws SQLException {
		PreparedStatement preparedStatement = conexion.prepareStatement(insertar);
		preparedStatement.setString(1, servicio.getNombre());
		preparedStatement.setString(1, servicio.getDescripcion());
		preparedStatement.setInt(1, servicio.getTienda());
		preparedStatement.executeUpdate();
	}

	@Override
	public void eliminar(int id) throws SQLException {
		PreparedStatement preparedStatement = conexion.prepareStatement(eliminar);
		preparedStatement.setInt(1, id);
		preparedStatement.execute();
	}

	@Override
	public void actualizar(Servicio servicio) throws SQLException {
		PreparedStatement preparedStatement = conexion.prepareStatement(actualizar);
		preparedStatement.setString(1, servicio.getNombre());
		preparedStatement.setString(2, servicio.getDescripcion());
		preparedStatement.setInt(3, servicio.getTienda());
		preparedStatement.setInt(4, servicio.getId());
		preparedStatement.execute();
	}

	@Override
	public List<Servicio> listar() {
		List<Servicio> servicio = new ArrayList();
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(listar);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String descripcion = rs.getString("descripcion");
				int tienda = rs.getInt("tienda");
				servicio.add(new Servicio(id, descripcion, descripcion, tienda));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return servicio;
	}

	@Override
	public Servicio buscarId(int id) {
		Servicio servicio = null;
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(buscarId);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				String descripcion = rs.getString("descripcion");
				int tienda = rs.getInt("tienda");
				servicio =new Servicio(id, descripcion, descripcion, tienda);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void actualizar(Usuario obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario buscarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
