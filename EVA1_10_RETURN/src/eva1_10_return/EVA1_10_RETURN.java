package eva1_10_return;

/**
 * @author Diego Rivera
 */
public class EVA1_10_RETURN {

    public static void main(String[] args) {
        int r = square(10);
        System.out.println(r);
        System.out.println(square(89));
    }
    public static int square(int num){
        return num*num; 
    }
}
