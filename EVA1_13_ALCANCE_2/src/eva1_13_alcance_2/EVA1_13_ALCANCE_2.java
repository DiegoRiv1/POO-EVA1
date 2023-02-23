package eva1_13_alcance_2;

/**
 *
 * @author Diego Rivera
 */
public class EVA1_13_ALCANCE_2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            //System.out.println(x); NO SE PUEDE
            int x = 100;
            System.out.println(x);
            
            {
                int y = 100;
                System.out.println(y);
            }
            //System.out.println(y); NO SE PUEDE
        }
            //System.out.println(i); NO SE PUEDE
            //System.out.println(x); NO SE PUEDE
    }
    
}
