package entidades;

public class Jamon {
	
	double peso;
	String nivelDeCalidad;
	int aniosDeMaduracion;
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getNivelDeCalidad() {
		return nivelDeCalidad;
	}
	public void setNivelDeCalidad(String nivelDeCalidad) {
		this.nivelDeCalidad = nivelDeCalidad;
	}
	public int getAniosDeMaduracion() {
		return aniosDeMaduracion;
	}
	public void setAniosDeMaduracion(int aniosDeMaduracion) {
		this.aniosDeMaduracion = aniosDeMaduracion;
	}
	
	public static Jamon NuevoJamon() {
		Jamon ret = null;
		System.out.println("introduce el peso del jamon: ");
		System.out.println("probamos");
		return ret;
	}
	
	

}
