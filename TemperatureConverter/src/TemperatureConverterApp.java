import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter temp in  F");
		double f = scan.nextDouble();
		TemperatureConvertor temperatureConverter = new TemperatureConvertor();
		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));

	}

}
