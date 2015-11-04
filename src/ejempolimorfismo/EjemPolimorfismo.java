package ejempolimorfismo;

public class EjemPolimorfismo {


    public static void main(String[] args) {
        Edificio bolivar = new Edificio();
        Casa hogar = new Casa();
        
        bolivar.setPuerta("El diametro de la puerta es: 2Mts Alto * 1Mt Ancho");
        hogar.setPuerta("El diametro de la puerta es: 1.70Mts Alto * 1Mt Ancho");
        
        System.out.println("Edificio: "+bolivar.getPuerta());
        System.out.println("Casa: "+hogar.getPuerta());
    }
    
}
