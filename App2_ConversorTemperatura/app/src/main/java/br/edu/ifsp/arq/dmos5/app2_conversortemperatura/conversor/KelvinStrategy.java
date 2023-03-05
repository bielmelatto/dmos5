package br.edu.ifsp.arq.dmos5.app2_conversortemperatura.conversor;

public class KelvinStrategy implements ConversorTemperatura {

    private static KelvinStrategy kelvinStategy = new KelvinStrategy();

    public static KelvinStrategy getInstance(){
        return kelvinStategy;
    }

    @Override
    public double getConversion(double temperature) {
        return temperature + 273;
    }
}
