package ec.edu.epn;

public class TaxCalculator {
    public double calculateTax(double valor, double impuesto) {
        return (valor * (impuesto / 100)) + valor;
    }
}
