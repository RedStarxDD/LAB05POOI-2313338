package universidad;

import java.util.Arrays;

public class Estudiante extends Personas{
	 
	    private int ciclo;
	    private String carrera;
	    private Cursos[] cursos;
	    
	    public Estudiante(String id, String cargo, String dni, int edad, int ciclo, String carrera) {
			super(id, cargo, dni, edad);
			this.ciclo = ciclo;
			this.carrera = carrera;
		}

		public Cursos[] getCursos() {
			return cursos;
		}

		public void setCursos(Cursos[] cursos) {
			this.cursos = cursos;
		}

		@Override
		public String toString() {
			return "Estudiante [ciclo=" + ciclo + ", carrera=" + carrera + ", cursos=" + Arrays.toString(cursos) + "]";
		}
}

