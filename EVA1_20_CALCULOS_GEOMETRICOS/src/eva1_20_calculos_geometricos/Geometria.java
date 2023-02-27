package eva1_20_calculos_geometricos;

/**
 *
 * @author Diego
 */
public class Geometria {
    //Constantes:
    public static final double PI = 3.1416;
    
    //Perimetro de un circulo
    public static double circuloPerimetro(double radio){
        return PI * (radio * 2);
    }
    
    public static double circuloArea(double radio){
        return PI * (radio * radio);
    }
    
    public static double esferaVolumen(double radio){
        return (4/3) * (PI * (radio * radio * radio));
    }
    
}
