package Observer;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by xgh on 2016/1/23.
 */

public class WeatherData implements  Subject{
    private ArrayList observers;
    private float temprature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);
        if(i>=0){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            Observer observer=(Observer)observers.get(i);
            observer.update(temprature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temprature, float humidity, float pressure){
        this.temprature=temprature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

}
