package actividad4;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inicialización de las asignaturas
		Asignatura asig1 = new Asignatura(1);
		Asignatura asig2 = new Asignatura(2);
		Asignatura asig3 = new Asignatura(3);
				
		//Inicialización del alumno
		Alumno alumno = new Alumno(asig1, asig2, asig3);
				
		//Inicialización del profesor
		Profesor profesor = new Profesor();
				
		profesor.ponerNotas(alumno);
				
		System.out.println("La media del alumno es de " +String.format("%.2f", profesor.calcularMedia(alumno)));

	}

}
