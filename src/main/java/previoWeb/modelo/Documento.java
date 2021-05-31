package previoWeb.modelo;

public class Documento {
private int id;
private String descipcion;

public Documento(int id, String descipcion) {
	super();
	this.id = id;
	this.descipcion = descipcion;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getDescipcion() {
	return descipcion;
}

public void setDescipcion(String descipcion) {
	this.descipcion = descipcion;
}

@Override
public String toString() {
	return "Documento [id=" + id + ", descipcion=" + descipcion + "]";
}


}