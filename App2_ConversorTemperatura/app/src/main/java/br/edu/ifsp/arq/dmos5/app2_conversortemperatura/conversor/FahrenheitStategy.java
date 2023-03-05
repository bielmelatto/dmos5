package br.edu.ifsp.arq.dmos5.app2_conversortemperatura.conversor;

public class FahrenheitStategy implements ConversorTemperatura{

    private static FahrenheitStategy fahrenheitStategy = new FahrenheitStategy();

    public static FahrenheitStategy getInstance(){
        return fahrenheitStategy;
    }

    @Override
    public double getConversion(double temperature) {
        return 1.8 * temperature + 32;
    }
}
