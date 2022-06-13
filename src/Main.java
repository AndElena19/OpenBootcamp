public class Main {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.edad = 22;
		cliente.nombre = "Luisa";
		cliente.telefono = 654727893;
		cliente.credito = 345;
		
		Trabajador trabajador = new Trabajador();
		trabajador.edad = 32;
		trabajador.nombre = "Jorge";
		trabajador.telefono = 627890352;
		trabajador.salario = 3300;
		
		System.out.println("Tiene " + cliente.edad + " a�os");	
		System.out.println("Se llama " + cliente.nombre);
		System.out.println("Su n�mero de tel�fono es " + cliente.telefono);
		System.out.println("N�mero de cr�dito: " + cliente.credito);
		
		System.out.println("Tiene " + trabajador.edad + " a�os");	
		System.out.println("Se llama " + trabajador.nombre);
		System.out.println("Su n�mero de tel�fono es " + trabajador.telefono);
		System.out.println("Su salario es de " + trabajador.salario);
		
	}
	
}

class Persona {
	int edad;
	String nombre;
	int telefono;
}

class Cliente extends Persona {
	int credito;
}

class Trabajador extends Persona {
	int salario;
}