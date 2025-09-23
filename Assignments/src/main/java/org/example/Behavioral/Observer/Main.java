package org.example.Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        Subject ws = new WeatherStation();
        new Thread(ws).start();

        Observer th1 = new Thermometer(ws, "Unique message 1: ");
        Observer th2 = new Thermometer(ws, "Unique message 2: ");
        Observer th3 = new Thermometer(ws, "Unique message 3: ");
    }
}
