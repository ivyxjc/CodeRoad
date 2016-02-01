package Observer;



/**
 * Created by xgh on 2016/1/23.
 */
public class CurrentConditionDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temprature "+temperature+"F. humidit "+humidity+" pressure "+pressure+".");
    }

    @Override
    public void update(float temperature, float humidity, float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }
}