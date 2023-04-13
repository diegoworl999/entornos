package gitCentralizado;

public class Ciclo {
	
	private int codigo;
	private String nombre;
	private int duracion;
	private String comentarios;
	private String siglas;
	
	public Ciclo() {
		
	}

	public Ciclo(int codigo, String nombre, int duracion, String comentarios, String siglas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.duracion = duracion;
		this.comentarios = comentarios;
		this.siglas = siglas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getSiglas() {
		return siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

	@Override
	public String toString() {
		return "Ciclo [codigo=" + codigo + ", nombre=" + nombre + ", duracion=" + duracion + ", comentarios="
				+ comentarios + ", siglas=" + siglas + "]";
	}
}
