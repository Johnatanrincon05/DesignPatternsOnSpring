package co.edu.poli.adapter.model;

/**
 * 
 */
public class DetalleCliente {

    /**
     * Default constructor
     */
    public DetalleCliente() {
    }
    
	/**
     * 
     */
    private String id;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String contacto;
    


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}