package previoWeb.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import previoWeb.modelo.Eleccion;
import previoWeb.modelo.Usuario;
import previoWeb.util.ConexionPostgreSQL;

public class EleccionDao implements crud<Eleccion> {
	private ConexionPostgreSQL conexion;

	private static final String buscarId = "SELECT * FROM eleccion WHERE id=?";

	public EleccionDao() {
		this.conexion = ConexionPostgreSQL.getConexion();
	}

	@Override
	public void insertar(Eleccion obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Eleccion obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Eleccion> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Eleccion buscarId(int id) {
		Eleccion servicio = null;
		try {
			PreparedStatement preparedStatement = conexion.setPreparedStatement(buscarId);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				String descripcion = rs.getString("descripcion");
				int tienda = rs.getInt("tienda");
				servicio =new Eleccion(id, descripcion, null, null, descripcion);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
