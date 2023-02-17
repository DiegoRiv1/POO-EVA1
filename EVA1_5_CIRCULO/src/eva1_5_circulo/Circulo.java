package eva1_5_circulo;

/**
 * @author invitado
 */
public class Circulo {
    //Atributos
    private double area;
    private double perimetro;
    private double radio;
    private double pi;
    
    //Metodos
    
    
    public Circulo(){ //Constructor
        area = 0;
        perimetro = 0;
        radio = 0;
        pi = 3.141592;
    }
    
    public Circulo(double rad){ //Constructor
        area = 0;
        perimetro = 0;
        radio = rad;
        pi = 3.141592;
    }
    
    public void setRadio(double rad){
        radio = rad;
    }
    public double CalcularArea(){
        area = pi*(radio*radio);
        return area;
    }
    public double CalcularPerimetro(){
        perimetro = pi*(2*radio);
        return perimetro;
    }
    
    public void Imprimir(){
        System.out.println("EL area de un circulo con un radio de "+radio+" es: ");
        System.out.println(area);
        System.out.println("EL perimetro de un circulo con radio "+radio+" es: ");
        System.out.println(perimetro);
    }
}
