package actividad4;

import java.util.Random;

public class Profesor {
	
	public void ponerNotas(Alumno alumno)
	{
		Random aleatorio = new Random();
		alumno.getAsig1().setCalificacion(aleatorio.nextInt(0, 10));
		alumno.getAsig2().setCalificacion(aleatorio.nextInt(0, 10));
		alumno.getAsig3().setCalificacion(aleatorio.nextInt(0, 10));
	}
	
	public double calcularMedia(Alumno alumno)
	{
		double suma = alumno.getAsig1().getCalificacion() + alumno.getAsig2().getCalificacion() + alumno.getAsig3().getCalificacion();
		
		return suma / 3;
	}

}
