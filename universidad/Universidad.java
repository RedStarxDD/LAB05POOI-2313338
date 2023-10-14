package universidad;

import java.util.Arrays;

public class Universidad {
	protected String nombre;
	protected int cantidadAulas;
	protected String ubicacion;
	protected Personas personas[];
	protected Departamentos departamentos[];

	public Universidad(String nombre, int cantidadAulas, String ubicacion) {
		super();
		this.nombre = nombre;
		this.cantidadAulas = cantidadAulas;
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Universidad [nombre=" + nombre + ", cantidadAulas=" + cantidadAulas + ", ubicacion=" + ubicacion
				+ ", personas=" + Arrays.toString(personas) + ", departamentos=" + Arrays.toString(departamentos) + "]";
	}

	public Personas[] getPersonas() {
		return personas;
	}

	public void setPersonas(Personas[] personas) {
		this.personas = personas;
	}

	public Departamentos[] getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamentos[] departamentos) {
		this.departamentos = departamentos;
	}
	
	
}
