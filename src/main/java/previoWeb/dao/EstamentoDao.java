package previoWeb.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import previoWeb.modelo.Estamento;
import previoWeb.modelo.Usuario;
import previoWeb.util.ConexionPostgreSQL;

public class EstamentoDao implements crud<Estamento> {
	private ConexionPostgreSQL conexion;

	private static final String listar = "SELECT * FROM estamento";

	public EstamentoDao() {
		this.conexion = ConexionPostgreSQL.getConexion();
	}

	@Override
	public void insertar(Estamento obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Estamento obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Estamento> listar() {
		List<Estamento> estamento = new ArrayList();
		try {
			PreparedStatement preparedStatement = conexion.setPreparedStatement(listar);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String descripcion = rs.getString("descripcion");
				estamento.add(new Estamento(id, null, descripcion));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return estamento;
	}

	@Override
	public Estamento buscarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
