package universidad;

public class Cursos {
	
	private String nombre;
	private int duracion;
	private String aula;
	
	public Cursos(String nombre, int duracion, String aula) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.aula = aula;
	}

	@Override
	public String toString() {
		return "cursos [nombre=" + nombre + ", duracion=" + duracion + ", tiempo=" + aula + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getAula() {
		return aula;
	} 
	
	
}
