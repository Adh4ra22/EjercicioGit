package tema4;
/**
 * 
 * @author Rocío Gallardo
 * @version 14-03-2016
 *
 */
public class operaciones {
	//private static final double SMI = 5322.234;
	
	private int a;
	private int b;
	
	/**
	 * Constructor por defecto.
	 * @param a
	 * @param b
	 */
	
	public operaciones(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Cosntructor inicializando los parametros a cero.
	 */
	public operaciones (){
		a=0;
		b=0;
		
	}
	
	/**
	 * Método que devuelve la suma de los dos dos parametros.
	 * @return a+b. La suma.
	 */
	public int calculaSuma(){
		return a + b;		
	}
	
	/**
	 *  Método que devuelve la restaa de los dos dos parametros.
	 * @return a-b.La resta.
	 */
	public int calculaResta(){
		return a-b;
	}
	
	/**
	 * Método que devuelve la multiplicacion de los dos números y el parámetro.
	 * @param parametro
	 * @return a*b*parametro. La multiplicación.
	 */
	public int multiplicaNumero(int parametro){
		return a*b*parametro;
	}
}
