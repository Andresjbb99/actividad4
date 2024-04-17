package actividad4;

public class Profesor 
{
	public void ponerNotas(Alumno alumno)
	{
		alumno.getAsig1().setCalificacion(Math.random()*10);
		alumno.getAsig2().setCalificacion(Math.random()*10);
		alumno.getAsig3().setCalificacion(Math.random()*10);
	}
	
	public double calcularMedia(Alumno alumno)
	{
		double suma = alumno.getAsig1().getCalificacion() + alumno.getAsig2().getCalificacion() + alumno.getAsig3().getCalificacion();
		
		return suma / 3;
	}
}
