package eva1_6_automovil;

/**
 *
 * @author invitado
 */
public class Carro {
    private String marca;
    private String modelo;
    private String placas;
    private int ano;
    private String dueno;
    
    //Constructores
    public Carro(){
        
    }
    public Carro(String brand, String model, String plates, int year, String owner){
        marca = brand;
        modelo = model;
        placas = plates;
        ano = year;
        dueno = owner;
    }
    
    
    //Metodos
    
        //SETS
    public void setBrand(String valor){
        marca = valor;
    }
    public void setModel(String mod){
        modelo = mod;
    }
    public void setPlates(String valor){
        placas = valor;
    }
    public void setBrand(int valor){
        ano = valor;
    }
    public void setOwner(String valor){
        dueno = valor;
    }
    
        //GETS
    public String getBrand(){
        return marca;
    }
    public String getModel(){
        return marca;
    }
    public String getPlates(){
        return marca;
    }
    public int getYear(){
        return ano;
    }
    public String getOwner(){
        return dueno;
    }
    
    
    public int calcularAdeudo(){
        int adeudo = 0;
        if(ano <= 2000)
            adeudo = 1500;
        else if(ano >=2001 && ano <=2005)
            adeudo = 2000;
        else if(ano >=2006 && ano <=2010)
            adeudo = 2500;
        else if(ano >=2011 && ano <=2015)
            adeudo = 3000;
        else
            adeudo = 4000;
        
        
        return adeudo;
    }
}
