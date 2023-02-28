package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author Diego
 */
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        //TODAS ESTAS CLASES ESTAN EN PAQUETE1
        //MISMO PAQUETE, PUBLIC Y DEFAULT SON
        //VISIBLES
        
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        ClaseC objC = new ClaseC();
        //objC.defaultC;
        //objC.publicC;
        
        ClaseD objD = new ClaseD();
        //objD.defaultD;
        //objD.publicD;
        
        
        //CLASES DEL PAQUETE DOS
        //TODO LO QUE ES DEFAULT ES AHORA INVISIBLE
        
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //CLASE F ES DEFAULT, Y NO ES VISIBLE
        //ClaseF objF = new ClaseF();
    }
}
class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB;
}