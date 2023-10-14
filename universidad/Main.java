package universidad;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Universidad uni=new Universidad("UCHILL", 50, "La Molina");
		
		Administrador admin1=new Administrador("1414", "Coordinador", "10439516", 40, 48, "Ingeniería");
		Administrador admin2=new Administrador("3425", "Coordinador", "65463311", 45, 48, "Administración");
		Departamentos depa1=new Departamentos("A1", "Ingenería", "Campus 1");
		Departamentos depa2=new Departamentos("A2", "Administración", "Campus 2");
		
		Estudiante estu=new Estudiante("4210", "Estudiante", "74340912", 18, 3, "Ingeniería de sistemas");
		Profesor profe=new Profesor("4382", "Docente", "57328952", 54, true);
		
		Cursos curso1=new Cursos("Programación orientada a objetos", 16, "A505");
		Cursos curso2=new Cursos("Matemática", 16, "C304");
		Cursos[] cursos= {curso1, curso2};
		Programas progra1=new Programas("Ingeniería de sistemas", 1000, cursos);
		
		Departamentos[] departamentos= {depa1,depa2};
		Personas[] personas= {admin1,admin2, profe, estu};
		
		estu.setCursos(cursos);
		
		depa1.setAdministrador(admin1);
		depa2.setAdministrador(admin2);
		depa1.setProfesor(profe);
		depa1.setProgramas(progra1);
		
		uni.setDepartamentos(departamentos);
		uni.setPersonas(personas);
		
		System.out.println(uni);
		for(Personas p:uni.getPersonas()) {
			p.calcularAccesoAscensor();
		}
	}

}
