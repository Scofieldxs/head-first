package observer;

import java.util.ArrayList;

import javax.management.Notification;

public class WeatherData implements Subject{
	private ArrayList observers;
	private float tmperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers=new ArrayList();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i=observers.indexOf(o);
		if(i>0) observers.remove(i);
	}
	
	public void notifyObservers(){
		for(int i=0;i<observers.size();i++){
			Observer observer=(Observer)observers.get(i);
			observer.update(tmperature, humidity, pressure);
		}
			
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float t,float h,float p){
		this.tmperature=t;
		this.humidity=h;
		this.pressure=p;
		measurementsChanged();
	}
	
}
