package universidad;

public class Departamentos {
	private String idDepartamento;
	private String tipo;
	private String ubicacion;
	private Programas programas;
	private Administrador administrador;
	private Profesor profesor;
	
	public Departamentos(String idDepartamento, String tipo, String ubicacion) {
		super();
		this.idDepartamento = idDepartamento;
		this.tipo = tipo;
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Departamentos [idDepartamento=" + idDepartamento + ", tipo=" + tipo + ", ubicacion=" + ubicacion
				+ ", administrador=" + administrador + ", profesor=" + profesor + "]";
	}

	public String getNumerodedepartamentos() {
		return idDepartamento;
	}

	public void setNumerodedepartamentos(String numerodedepartamentos) {
		this.idDepartamento = numerodedepartamentos;
	}

	public String getTipo() {
		return tipo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public Programas getProgramas() {
		return programas;
	}

	public void setProgramas(Programas programas) {
		this.programas = programas;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	

}
