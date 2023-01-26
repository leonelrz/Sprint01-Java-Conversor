package ValidacionErrores;

public class ValidarInput {

	public static boolean validaMoneda(String texto) {
		return texto.matches("^[0-9]+([\\.][0-9]+)?$");
		
	}
	
	public static boolean validaTemperatura(String texto) {
		return texto.matches("^-?[0-9]+([\\.][0-9]+)?$");
		
	}
}
