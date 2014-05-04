package observer;

public class WeatherStation {
	public static void main(String[] args){
		WeatherData weatherData=new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(12, 5, 10);
		weatherData.setMeasurements(23, 34, 56);
	}
}
