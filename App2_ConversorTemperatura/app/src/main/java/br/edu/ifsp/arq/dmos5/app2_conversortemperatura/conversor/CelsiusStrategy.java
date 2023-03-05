package br.edu.ifsp.arq.dmos5.app2_conversortemperatura.conversor;

public class CelsiusStrategy implements ConversorTemperatura {

    private static CelsiusStrategy celsiusStrategy = new CelsiusStrategy();

    public static CelsiusStrategy getInstance(){
        return celsiusStrategy;
    }

    @Override
    public double getConversion(double temperature) {
        return (temperature - 32) / 1.8;
    }
}
