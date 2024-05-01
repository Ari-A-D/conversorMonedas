import com.google.gson.annotations.SerializedName;
import java.util.Map;
import java.util.HashMap;

public class Moneda {

    private double nuevoValor;
    private double Valor;

    public double getNuevoValor() {
        return nuevoValor;
    }

    public double getValor() {
        return Valor;
    }

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
}
