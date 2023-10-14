package universidad;

public class Profesor extends Personas{

	    private boolean aTiempoCompleto;

		public Profesor(String id, String cargo, String dni, int edad, boolean aTiempoCompleto) {
			super(id, cargo, dni, edad);
			this.aTiempoCompleto = aTiempoCompleto;
		}

		public boolean isaTiempoCompleto() {
			return aTiempoCompleto;
		}

		public void setaTiempoCompleto(boolean aTiempoCompleto) {
			this.aTiempoCompleto = aTiempoCompleto;
		}

		@Override
		public String toString() {
			return "Profesor [aTiempoCompleto=" + aTiempoCompleto + "]";
		}

		@Override
		public void calcularAccesoAscensor() {
			// TODO Auto-generated method stub
			System.out.println(getCargo()+ ": Del 1 al 9");
		} 

	}

