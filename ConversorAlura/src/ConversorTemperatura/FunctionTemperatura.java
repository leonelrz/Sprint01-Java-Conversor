package ConversorTemperatura;

import javax.swing.JOptionPane;

public class FunctionTemperatura {
	
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura (double ValorRecibido) {
		String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la temperatura a la que deseas convertir ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De °C a °F", "De °F a °C", "De Kelvin a °C","De °C a Kelvin","De °F a Kelvin","De Kelvin a °F"}, 
    			"Seleccion")).toString();
		switch(opcion) {
        case "De °C a °F":
        	temperatura.ConvertirCelsiusAFahrenheit(ValorRecibido);
        	break;
        case "De °F a °C":
        	temperatura.ConvertirFahrenheitACelsius(ValorRecibido);
        	break;
        case "De Kelvin a °C":
        	temperatura.ConvertirKelvinACelsius(ValorRecibido);
        	break;
        case "De °C a Kelvin":
        	temperatura.ConvertirCelsiusAKelvin(ValorRecibido);
        	break;
        case "De °F a Kelvin":
        	temperatura.ConvertirFahrenheitAKelvin(ValorRecibido);
        	break;
        case "De Kelvin a °F":
        	temperatura.ConvertirKelvinAFahrenheit(ValorRecibido);
        	break;
}
		
	}
}
