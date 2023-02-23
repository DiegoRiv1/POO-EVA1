package eva1_14_alcance3;

/**
 * @author Diego Rivera
 */
public class EVA1_14_ALCANCE3 {

    public static void main(String[] args) {
        
        int x = 0; //VISIBLE EN TODO EL MAIN
        System.out.println(x);
        
        for (int i = 0; i < 10; i++) {//I SOLO ES VISIBLE EN ESTE FOR
            System.out.println(i);
            System.out.println(x);
            //int x = 0;
            
            if(1 == 5){
                System.out.println(x);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    
    public static void Algo(int x){
                       //Aunque ambas tengan una variable X, cada X es diferente en cada bloque.
    }
    public static void Algo2(int x){
        
    }
}
