package eva1_2_clases_java;

/**
 *
 * @author DIEGO RIVERA
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona perso1 = new Persona();
        perso1.setName("Diego");
        perso1.setLastName("Rivera Baquera");
        perso1.setAge(18);
        perso1.setGender('M');
        
        
        System.out.println(perso1.getName());
        System.out.println(perso1.getLastName());
        System.out.println(perso1.getAge());
        System.out.println(perso1.getGender());
        
    }
    
}
