package Paquete1;

import Paquete2.ClaseE;

/**
 * @author Diego
 */
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        //CLASE DEL MISMO PAQUETE
        ClaseB objB = new ClaseB();
        //objB.defaultB;
        //objB.publicB;
        
        //CLASE PAQUETE 2
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //F ESTA EN OTRO PAQUETE Y ES DEFAULT
        //ClaseF objF = new ClaseF();
    }
}
class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}