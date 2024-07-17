package Modelos_Moneda;

import com.google.gson.Gson;

public class Divisa {

    private String codigo_base;
    private String codigo_objetivo;
    private Double conversion_incial;
    private Double conversion_resultado;

    public Divisa(Monedas monedas) {
        this.codigo_base = monedas.base_code();
        this.codigo_objetivo = monedas.target_code();
        this.conversion_incial = monedas.conversion_rate();
        this.conversion_resultado = monedas.conversion_result();
    }



    public String getCodigo_base() {
        return codigo_base;
    }

    public void setCodigo_base(String codigo_base) {
        this.codigo_base = codigo_base;
    }

    public String getCodigo_objetivo() {
        return codigo_objetivo;
    }

    public void setCodigo_objetivo(String codigo_objetivo) {
        this.codigo_objetivo = codigo_objetivo;
    }

    public Double getConversion_incial() {
        return conversion_incial;
    }

    public void setConversion_incial(Double conversion_incial) {
        this.conversion_incial = conversion_incial;
    }

    public Double getConversion_resultado() {
        return conversion_resultado;
    }

    public void setConversion_resultado(Double conversion_resultado) {
        this.conversion_resultado = conversion_resultado;
    }

    @Override
    public String toString() {
        return "\r\n#################################################################################################### \r\n" +
                "CONVERSION DE DIVISA =  \r\n" +
                "DE " +codigo_base +" A "+codigo_objetivo+"\r\n"+
                "valor de moneda  " + codigo_base +"  Actualmente para moneda que desea hacer conversion = "+conversion_incial+"\r\n"+
                "valor a convertir a moneda  =" + codigo_objetivo +"\r\n"+
                "RESULTADO = "+conversion_resultado+" "+codigo_objetivo+
                "\r\n##############################################################################################";
    }
}
