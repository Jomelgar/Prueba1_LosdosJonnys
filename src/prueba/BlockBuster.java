
package prueba;

import java.util.ArrayList;

/**
 *
 * @author jomel
 */
public class BlockBuster {
    
     private ArrayList<BlockBusterItem> items;

    public BlockBuster() {
        this.items = new ArrayList<>();
    }

    public BlockBusterItem buscarItem(int codigo, String tipo) {
        for (BlockBusterItem item : items) {
            if (item.getCodigo() == codigo && 
                    (item instanceof MovieItem && tipo.equals("MOVIE")|| 
                    item instanceof VideoGameItem && tipo.equals("GAME"))) {
                return item;
            }
        }
        return null;
    }

    public void agregarItem(int codigo, String nombre, String tipoItem) {
       
        if (buscarItem(codigo, tipoItem) == null) {
            
            BlockBusterItem newItem = null;
            if (tipoItem.equals("MOVIE")) {
                newItem = new MovieItem(codigo, nombre, Double.parseDouble(tipoItem));
            } else if (tipoItem.equals("GAME")) {
                newItem = new VideoGameItem(codigo, nombre, tipoItem);
            }
           
            if (newItem != null) {
                items.add(newItem);
            }
        } else {
            System.out.println("Ya existe un ítem con ese código y tipo.");
        }
    }

    public void rentar(int codigo, String tipoItem, int dias) {
        BlockBusterItem item = buscarItem(codigo, tipoItem);
        if (item != null) {
            
            System.out.println(item);
       
            double monto = item.pagoRenta(dias);
            System.out.println("Monto a pagar: " + monto);
        } else {
            System.out.println("Item No Existe");
        }
    }

    public void auditarMovieEstados() {
        auditarMovieEstados(0);
    }
    
    private void auditarMovieEstados(int pos){
        if(pos< items.size()){
            if(items.get(pos) instanceof MovieItem){
                ((MovieItem) items.get(pos)).evaluarEstado();
            }
            auditarMovieEstados();
        }
    }
}
