package es.studium.persona1;

public class TestPersona1
{

	public static void main(String[] args)
	{

		Persona1 persona1 = new Persona1();
		
		persona1.setNombre("");
		persona1.setApellidos("");
		persona1.setDni("");
		persona1.setDomicilio("");
		persona1.setTelefono(0);
		
		System.out.println("El nombre de la persona1 es: " + persona1.getNombre());
		System.out.println("Los apellidos de la persona1 son: " + persona1.getApellidos());
		System.out.println("El dni de la persona1 es: " + persona1.getDni());
		System.out.println("El domicilio de la persona1 es: " + persona1.getDomicilio());
		System.out.println("El teléfono de la persona1 es: " + persona1.getTelefono());
		
		
		Persona1 persona2 = new Persona1("Jorge", "Sánchez García", "34231232", "Avda, La Paz, nº 3", 954654756);
		System.out.println("Nombre de la persona2: " + persona2.getNombre());
		System.out.println("Apellidos de la persona2: " + persona2.getApellidos());
		System.out.println("Dni de la persona2: " + persona2.getDni());
		System.out.println("Domicilio de la persona2: " + persona2.getDomicilio());
		System.out.println("Teléfono de la persona2: " + persona2.getTelefono());
	}

}
