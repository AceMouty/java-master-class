public class Main {
    public static void main(String[] args) {

        double kilometersPerHour = 120.0;
        double miles = SpeedConverter.toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + "km/h is " + miles + " mph" );

        SpeedConverter.printConversion(10.5);
        SpeedConverter.printConversion(90.0);
    }
}
