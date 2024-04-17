package actividad4;

public class Asignatura {
	
	private int id;
	private double calificacion;
	
	//Constructores
	public Asignatura(int id)
	{
		this.id = id;
		this.calificacion = 0.0;
	}

	//Getters y Setters
	public int getId() {
		return id;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

}
