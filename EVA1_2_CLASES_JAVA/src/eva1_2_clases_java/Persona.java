package eva1_2_clases_java;

/**
 *
 * @author invitado
 */
public class Persona {
    //DATOS --> ATRIBUTOS DE LA CLASE
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    //METODOS --> COMPORTAMIENTO DE LA CLASE
    //LEER Y ESCRIBIR LOS ATRIBUTOS
    //LEER --> GET
    //ESCRIBIR --> SET
    // modificador de acceso valor de retorno nombre del metodo
    
    public String getName (){
        
        return nombre;
    }
    
    public void setName (String valor){
        nombre = valor;
    }
    
    public String getLastName (){
        
        return apellido;
    }
    
    public void setLastName (String valor){
        apellido = valor;
    }
    
    public int getAge (){
        
        return edad;
    }
    
    public void setAge (int valor){
        edad = valor;
    }
    
    public char getGender (){
        
        return genero;
    }
    
    public void setGender (char valor){
        genero = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: "+ nombre + " "+apellido);
        System.out.println("Edad: "+ edad);
        System.out.println("Genero: "+ genero);
    }
}
