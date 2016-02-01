package Observer;

/**
 * Created by xgh on 2016/1/23.
 */
public class ForeCastDisplay  implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForeCastDisplay(Subject weatherData) {
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Future temperature: "+temperature+" humidity "+humidity+" pressure " +pressure);
    }

    @Override
    public void update(float tmperature, float humidity, float pressure) {

    }
}
