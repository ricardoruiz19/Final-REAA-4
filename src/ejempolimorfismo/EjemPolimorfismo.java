package ejempolimorfismo;

public class EjemPolimorfismo {


    public static void main(String[] args) {
        Edificio bolivar = new Edificio();
        Casa hogar = new Casa();
        
        bolivar.setPuerta("El diametro de la puerta es: 2Mts Alto * 1Mt Ancho");
        hogar.setPuerta("El diametro de la puerta es: 1.70Mts Alto * 1Mt Ancho");
        
        bolivar.setVentana(" /  El diametro de la ventana es: 1.50Mts Alto * 1Mt Ancho");
        hogar.setVentana(" /  El diametro de la ventana es: 1Mt Alto * 1Mt Ancho");
        
        System.out.println("Edificio: "+bolivar.getPuerta() +bolivar.getVentana());
        System.out.println("Casa: "+hogar.getPuerta() +hogar.getVentana());
        
    }
    
}
