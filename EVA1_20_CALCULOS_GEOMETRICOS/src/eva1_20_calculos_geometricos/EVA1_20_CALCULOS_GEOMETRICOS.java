package eva1_20_calculos_geometricos;

/**
 * @author Diego
 */
public class EVA1_20_CALCULOS_GEOMETRICOS {
    
    
    public static void main(String[] args) {
        final int x;
        x = 100;
        //x = 13;
        System.out.println("Area circulo rad 5: "
                +Geometria.circuloArea(5));
        System.out.println("Perimetro circulo rad=5: "
                +Geometria.circuloPerimetro(5));
        System.out.println("Volumen esfera rad=5: " +
                Geometria.esferaVolumen(5));
    }
    
}
