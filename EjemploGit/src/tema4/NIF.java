package tema4;

public class NIF {

	private static final String NIF_LETRA = "TRWAGMYFPDXBNJZSQVHLCKE";
	private static final int NUM_CIFRAS_DNI = 8;
	
	// campos de la clase
	private long numero;
	private char letra;

	public NIF() {
		numero = 0;
		letra = ' ';
	}
	
	public void mostrarNIF(){
		System.out.println(this);
	}

	public char calculaLetra(String dni) {
		long numero = Long.parseLong(dni); // pasamos string a numero
		setNumero(numero); // guardo el numero del dni
		
		char letra = letraDNI(); // obtenemos la letra
		setLetra(letra); // guardamos la letra
		
		return letra; // devolvemos la letra calculada
	}
	
	private char letraDNI() {
		return NIF_LETRA.charAt((int) (numero % 23));
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	@Override
	public String toString() {
		// si el nif no es válido
		if (letra == ' ' || numero == 0){
			return "NIF no válido";
		}
		
		return String.format("%0"+NUM_CIFRAS_DNI+"d", numero) + "-" + letra;
	}

}
