package tema4;

public class Run {

	public static void main(String[] args) {
		prueba1();
		prueba2();
		prueba3();
		prueba4();
		prueba5();
	}

	private static void prueba1() {
		NIF miNif = new NIF();
		miNif.calculaLetra("18073860");
		System.out.println(miNif);
	}

	private static void prueba2() {
		NIF miNif = new NIF();
		miNif.calculaLetra("123");
		System.out.println(miNif);
	}

	private static void prueba3() {
		NIF miNif = new NIF();
		miNif.calculaLetra("16687334");
		System.out.println(miNif);
	}
	
	private static void prueba4() {
		NIF miNif = new NIF();
		miNif.calculaLetra("17656334");
		System.out.println(miNif);
	}
	
	private static void prueba5() {
		NIF miNif = new NIF();
		miNif.calculaLetra("19456924");
		System.out.println(miNif);
	}

}
