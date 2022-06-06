public class Main2 {
    public static void main(String[] args) {        
        Coche miCoche = new Coche(2);
        
        System.out.println(miCoche.numeroPuertas);
        
        miCoche.aumentarPuertas();
        
        System.out.println(miCoche.numeroPuertas);

    }
}