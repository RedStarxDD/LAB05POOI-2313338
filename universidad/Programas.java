package universidad;

public class Programas {
	private String tipodeprograma;
	private double costoMatricula;
	private Cursos[] cursos;
	
	public Programas(String tipodeprograma, double costoMatricula, Cursos[] cursos) {
		super();
		this.tipodeprograma = tipodeprograma;
		this.costoMatricula = costoMatricula;
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "programas [tipodeprograma=" + tipodeprograma + ", matricula=" + costoMatricula + "]";
	}

	public String getTipodeprograma() {
		return tipodeprograma;
	}

	public double getMatricula() {
		return costoMatricula;
	}

	public Cursos[] getCursos() {
		return cursos;
	}

	public void setCursos(Cursos[] cursos) {
		this.cursos = cursos;
	}
}
