package universidad;

public class Administrador extends Personas{
	 
	    private int horasdeTrabajo;
	    private String area;
		public Administrador(String id, String cargo, String dni, int edad, int horasdeTrabajo, String area) {
			super(id, cargo, dni, edad);
			this.horasdeTrabajo = horasdeTrabajo;
			this.area = area;
		}
		@Override
		public String toString() {
			return "Administrador [horasdeTrabajo=" + horasdeTrabajo + ", area=" + area + ", toString()="
					+ super.toString() + "]";
		}

	}


