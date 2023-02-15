package eva_4_television;

public class Television {
    //atributos: estado
    private boolean power;
    private int volumen;
    private int canal;
    
    //métodos: comportamiento
    public Television(){ //constructor default
        power = false; //apagado
        volumen = 10;
        canal = 7;
    }
    
    public void OnOff(){
        if(power == false){ //De apagado a encendido
            power=true;
            System.out.println("Tv encendida");
        }
        else{
            power = false; //De encendido a apagado
            System.out.println("Tv apagada");
        }
    }
    
    public void VolumeUp(){
        
        if(power == true){
            if(volumen<100){
            volumen +=5;
            }
        System.out.println("Volumen: "+ volumen);
        }
    }
        
    public void VolumeDown(){
        if(power == true){
            if(volumen>0){
            volumen -=5;
            }
        System.out.println("Volumen: "+ volumen);
        }
    }
    
    public void CanalUp(){
        if(power == true){
            if(canal<10)
                canal = canal+1;
            else
                canal = 1;
            
            System.out.println("Canal: "+canal);
        }
    }
    public void CanalDown(){
        if(power == true){
            if(canal>1)
                canal = canal-1;
            else
                canal = 10;
            System.out.println("Canal: "+canal);

        }
    }
}
