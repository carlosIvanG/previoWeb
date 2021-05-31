package previoWeb.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import previoWeb.modelo.Documento;
import previoWeb.modelo.Eleccion;
import previoWeb.modelo.Estamento;
import previoWeb.modelo.Usuario;
import previoWeb.util.ConexionPostgreSQL;

public class DocumentoDao implements crud<Documento> {
	private ConexionPostgreSQL conexion;

	private static final String listar = "SELECT * FROM documento";

	public DocumentoDao() {
		this.conexion = ConexionPostgreSQL.getConexion();
	}

	@Override
	public void insertar(Documento obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Documento obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Documento> listar() {
		List<Documento> documento = new ArrayList();
		try {
			PreparedStatement preparedStatement = conexion.setPreparedStatement(listar);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String descripcion = rs.getString("descripcion");
				documento.add(new Documento(id, descripcion));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return documento;
	}

	@Override
	public Documento buscarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
