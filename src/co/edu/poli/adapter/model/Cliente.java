package co.edu.poli.adapter.model;

/**
 * 
 */
public class Cliente extends DetalleCliente implements CreditoLibreInversion {
	
    /**
     * Default constructor
     */
    public Cliente() {
    }

    /**
     * 
     */
    public void darInfoCliente(DetalleCliente d) {
    	
    	setId(d.getId());
    	setNombre(d.getNombre());
    	setContacto(d.getContacto());
    }

    /**
     * @return
     */
    public String conseguirInfoProducto() {
        
    	String g = "Producto de libre inversion aprobado a ";
    		
        return g + getNombre() + " contacto: " + getContacto();
    }
    
    
    public double calcularTasa () {
    	return 1.2;
    }

}