import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class Moneda {

    @SerializedName("base_code")
    private String denominacionBase;

    @SerializedName("conversion_rates")
    private Map<String, Double> factoresDeConversion;

    public String getDenominacionBase() {
        return denominacionBase;
    }

    public void setDenominacionBase(String denominacionBase) {
        this.denominacionBase = denominacionBase;
    }

    public Map<String, Double> getFactoresDeConversion() {
        return factoresDeConversion;
    }

    public void setFactoresDeConversion(Map<String, Double> factoresDeConversion) {
        this.factoresDeConversion = factoresDeConversion;
    }

    public double obtenerCoeficiente(String clave) {
        if (factoresDeConversion.containsKey(clave)) {
            return factoresDeConversion.get(clave);
        } else {
            // Manejar caso cuando la clave no existe en el mapa
            System.out.println("La clave " + clave + " no existe en los factores de conversión.");
            return -1; // Valor por defecto o manejo de error
        }
    }

    public double convertirMoneda(String clave, double valorMoneda) {
        double coeficienteConversion = obtenerCoeficiente(clave);
        if (coeficienteConversion!= -1) { // Verifica que el valor obtenido no sea el valor por defecto/error
            return coeficienteConversion * valorMoneda;
        } else {
            System.out.println("Error al obtener el valor para la clave " + clave);
            return -1; // Retornar un valor por defecto o manejo de error
        }
    }

}
