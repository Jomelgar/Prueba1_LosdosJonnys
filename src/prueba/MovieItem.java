
package prueba;

import java.util.Calendar;

/**
 *
 * @author jomel
 */
public class MovieItem extends BlockBusterItem{
        String estado;
        
        public MovieItem(int codigo, String nombre, double precio){
            super(codigo, nombre,precio);
            estado = "ESTRENO";
        }
        
        public String toString(){
            return super.toString() + ", Estado: " + estado + "- Movie";    
        }
        
        public double pagoRenta(int dias){
            if(estado.equals("ESTRENO")){
                if(dias >2){
                return precio + ((dias - 2) * 50);
                }
                return precio;
            }
            
            if(dias> 5){
                return precio + ((dias - 2) * 30);
            }
            return precio;
        }
        
        public void evaluarEstado(){
            Calendar hoy= Calendar.getInstance();
            hoy.set(hoy.get(Calendar.YEAR),
                    hoy.get(Calendar.MONTH) - 5, 
                    hoy.get(Calendar.DATE));
            if(hoy.after(fecha)){
                estado = "NORMAL";
            }
        }
}
