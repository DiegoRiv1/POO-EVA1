package eva1_18_static;

/**
 * @author Diego Rivera
 */
public class EVA1_18_STATIC {

    public static void main(String[] args) {
        Prueba obj = new Prueba();
        obj.mensaje();
        Prueba.mensajeEstatico();
        System.out.println("PI "+ Math.PI);
        System.out.println(Math.round(Math.random()*70));
    }
    
}
class Prueba{
    public void mensaje(){
        System.out.println("Holaaa");
    }
    public static void mensajeEstatico(){
        System.out.println("HOla Estatico");
    }
}
class otra{
}