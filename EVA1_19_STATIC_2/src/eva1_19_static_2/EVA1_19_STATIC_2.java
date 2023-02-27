package eva1_19_static_2;
    
/**
 * @author Diego
 */
public class EVA1_19_STATIC_2 {
    int x = 100; 
    
    public static void main(String[] args) {
        EVA1_19_STATIC_2 obj = new EVA1_19_STATIC_2();
        obj.noStaticMessage();
        System.out.println(obj.x);
        staticMessage();
    }
    public void noStaticMessage(){
        System.out.println("No Static Message");
    }
    public static void staticMessage(){
        System.out.println("Regular Message");
    }
}
