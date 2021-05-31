package previoWeb.dao;

import java.sql.SQLException;
import java.util.List;

import previoWeb.modelo.Documento;

public interface  crud <T>{
	
	public void insertar(T obj) throws SQLException;

	public void eliminar(int id) throws SQLException;

	public void actualizar(T obj) throws SQLException;

	public List<T> listar();

	public T buscarId(int id);
}