/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterlab;

/**
 *
 * @author USER
 */

public class adapterclass {
      private ThirdPartyTemperatureConverter Converter = new ThirdPartyTemperatureConverter();

    public double fahrenheitToCelsius(double fahrenheit) {
        double kelvin = Converter.fahrenheitToKelvin(fahrenheit);
        return kelvinToCelsius(kelvin);
    }

    private double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}

