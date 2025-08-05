public class Moneda {
    private String base_code;
    private String conversion;
    private double resultado;

    public Moneda() {
    }

    public Moneda(String base_code, String conversion, double resultado) {
        this.base_code = base_code;
        this.conversion = conversion;
        this.resultado = resultado;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getConversion() {
        return conversion;
    }

    public void setConversion(String conversion) {
        this.conversion = conversion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
