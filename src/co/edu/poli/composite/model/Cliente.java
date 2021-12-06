package co.edu.poli.composite.model;

/**
 * 
 */
public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Objeto file1 = new Archivo(100L,".txt");
		Objeto file2 = new Archivo(200L,".pdf");

		Objeto sub1 = new Directorio(0L,"dir");
		sub1.adiObj(file1);
		sub1.adiObj(file2);
		
		Objeto file3 = new Archivo(20L,".img");
		
		Objeto file4 = new Archivo(30L,".pdf");
		Objeto sub2 = new Directorio(0L,"dir");
		sub2.adiObj(file4);
		
		Objeto sub3 = new Directorio(0L,"dir");
		sub3.adiObj(sub1);
		sub3.adiObj(sub2);
		sub3.adiObj(file3);
		
		System.out.println(sub3 + "Tamanio sub3 : " + sub3.getTamanio());
		System.out.println(sub2 + "Tamanio sub2 : " + sub2.getTamanio());
		System.out.println(sub1 + "Tamanio sub1 : " + sub1.getTamanio());
		

	}

}