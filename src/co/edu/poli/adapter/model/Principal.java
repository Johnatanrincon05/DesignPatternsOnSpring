package co.edu.poli.adapter.model;

/**
 * 
 */
public class Principal {


    /**
     * @param args
     */
    public static void main(String [ ] args) {
        // TODO implement here
    	
    	DetalleCliente d = new DetalleCliente();
    
    	d.setId("123556767");
    	d.setNombre("Wilson");
    	d.setContacto("31098833221");
    	
    	CreditoLibreInversion c = new Cliente();
    	
    	c.darInfoCliente(d);
    	
    	System.out.println(c.conseguirInfoProducto());

    	
    }
   

}