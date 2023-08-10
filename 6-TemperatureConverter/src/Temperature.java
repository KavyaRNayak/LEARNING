import java.util.Scanner;

		public class Temperature {

			public static void main(String[] args) {
				Scanner scan =new Scanner(System.in);
				System.out.println("Enter the temperature in Fahrenheit");
				double f1=scan.nextDouble();
				TemperatureConverter temperatureConverter = new TemperatureConverter();

				System.out.println(temperatureConverter.convertFahrenheitToCelsius(f1));
				}}
