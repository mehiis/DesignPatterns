package Behavioral.Observer;

import java.util.Random;

public class WeatherStation extends Subject {
    private int temperature;

    public WeatherStation() {
        Random rand = new Random();
        temperature = rand.nextInt(58);
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(1500); //sleep for 1.5 seconds.
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            changeTemperature();
        }
    }

    private void changeTemperature() {
        Random rand = new Random();
        int randomTemp = rand.nextInt(2);
        int tempTemperature = temperature;

        if(randomTemp == 0)  { tempTemperature++; } else { tempTemperature--; }
        tempTemperature = clamp(tempTemperature, -273, 57);

        if(temperature == tempTemperature) { return; }

        temperature = tempTemperature;
        notifyObservers();

        //System.out.println("changeTemperature(); Temperature: " + temperature );
    }

    @Override
    public String getStatus(){
        return temperature + "°C.";
    }

    private int clamp (float val, float min, float max) {
        return (int)(Math.max(min, Math.min(max, val)));
    }
}
