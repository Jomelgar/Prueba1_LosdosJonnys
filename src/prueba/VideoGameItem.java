
package prueba;

/**
 *
 * @author jomel
 */
public class VideoGameItem extends BlockBusterItem{
    String consola;
    static final String PlayStation = "PLAYSTATION";
    static final String Wii = "WII";
    static final String Xbox = "XBOX";
    public VideoGameItem(int codigo, String nombre, String consola){
        super(codigo,nombre,30);
        evaluarConsola(consola);
    }
    
    public void evaluarConsola(String consola){
        if(consola.equalsIgnoreCase(PlayStation)){
            this.consola = PlayStation;
        }else if(consola.equalsIgnoreCase(Wii)){
            this.consola = Wii;
        }else if (consola.equalsIgnoreCase(Xbox)){   
            this.consola = Xbox;
        }
    }
    
    public String toString(){
        return super.toString() + ", Consola: "+ consola +" -Game";
    }
    
    public double pagoRenta(int dias){
        return precio * dias;
    }
}
