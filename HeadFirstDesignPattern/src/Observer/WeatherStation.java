package Observer;

/**
 * Created by xgh on 2016/1/23.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData=new WeatherData();

        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        ForeCastDisplay foreCastDisplay=new ForeCastDisplay(weatherData);

        weatherData.setMeasurements(80,22,00);
        weatherData.setMeasurements(55,233,3);

    }
}
