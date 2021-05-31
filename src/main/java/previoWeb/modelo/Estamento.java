package previoWeb.modelo;

public class Estamento {
	private int id;
	private Eleccion eleccion;
	private String descripcion;

	public Estamento(int id, Eleccion eleccion, String descripcion) {
		super();
		this.id = id;
		this.eleccion = eleccion;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Eleccion getEleccion() {
		return eleccion;
	}

	public void setEleccion(Eleccion eleccion) {
		this.eleccion = eleccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Estamento [id=" + id + ", eleccion=" + eleccion + ", descripcion=" + descripcion + "]";
	}

}
