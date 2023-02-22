package eva1_11_califas;

/**
 * @author Diego Rivera
 */
public class EVA1_11_CALIFAS {

    public static void main(String[] args) {
        System.out.println(transformarCalif(40));
        
    }
    public static String transformarCalif(int score){
        String letra;
        if(score<0 || score>100)
            letra = "Calificacion invalida";
        else if(score > 90 && score <=100)
            letra = "A";
        else if(score > 80 && score <=90)
            letra = "B";
        else if(score > 70 && score <=80)
            letra = "C";
        else
            letra = "D";
        
        return letra;
    }
}
