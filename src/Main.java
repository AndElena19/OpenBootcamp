public class Main {
	
	public static void main(String[] args) {
		Persona mujer = new Persona();
		mujer.setEdad(22);
		mujer.setNombre("Elena");
		mujer.setTelefono(671275720);
		
		System.out.println("Esta persona tiene " + mujer.getEdad() + " años");
		System.out.println("Esta persona se llama " + mujer.getNombre());
		System.out.println("El número de teléfono de esta persona es: " + mujer.getTelefono());
	}
	
}

class Persona {
	private int edad;
	private String nombre;
	private int telefono;
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public int getTelefono() {
		return this.telefono;
	}
	
}
