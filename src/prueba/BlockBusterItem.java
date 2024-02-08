
package prueba;
import java.util.Calendar;
/**
 *
 * @author jomel
 */
public abstract class BlockBusterItem {
    int codigo;
    String Nombre;
    double precio;
    Calendar fecha;

    public BlockBusterItem(int codigo, String Nombre, double precio) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.precio = precio;
        
        fecha = Calendar.getInstance();
    }
    
    public String toString(){
        return "Código: "+ codigo + ", Nombre: " + Nombre +", Precio de Renta: Lps. "+ precio;
    } 
    
    public abstract double pagoRenta(int dias);

    public int getCodigo() {
        return codigo;
    }
    
    
}
