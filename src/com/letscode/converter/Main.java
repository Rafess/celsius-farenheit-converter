package com.letscode.converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner temperatureScanner = new Scanner(System.in);
        System.out.print("Insira uma temperatura em Celsius:");
        float celsiusTemperature = temperatureScanner.nextFloat();
        calculateToFarenheit(celsiusTemperature);
    }
    private static void calculateToFarenheit(float celsiusDegrees) {
        final float FARENHEIT_VARIATION = 32f;
        final float MULTIPLIER_CONVERTER = 1.8f;
        float convertedValue = celsiusDegrees * MULTIPLIER_CONVERTER;
        System.out.printf("%.2fºC equivalem a %.2fºF %n", celsiusDegrees, (convertedValue + FARENHEIT_VARIATION));
    }
}
