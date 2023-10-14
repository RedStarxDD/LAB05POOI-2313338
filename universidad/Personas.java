package universidad;

public class Personas {
	    private String id;
	    private String cargo;
	    private String dni;
	    private int edad;
	    

		public Personas(String id, String cargo, String dni, int edad) {
			super();
			this.id = id;
			this.cargo = cargo;
			this.dni = dni;
			this.edad = edad;
		}


		public String getId() {
			return id;
		}


		public String getCargo() {
			return cargo;
		}


		public String getDni() {
			return dni;
		}


		public int getEdad() {
			return edad;
		}


		@Override
		public String toString() {
			return "Personas [id=" + id + ", cargo=" + cargo + ", dni=" + dni + ", edad=" + edad + "]";
		}
		
		 
	}


