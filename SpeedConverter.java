public class SpeedConverter {

    public static long  toMilesPerHour (double kilometersPerHour) {
        long value =0;
        if(kilometersPerHour<0){
            value = -1;

        }
        else{
            value=Math.round(kilometersPerHour/1.609);
        }
        return value;
    }

    public static void printConversion(double kilometersPerHour) {
       if(kilometersPerHour<0){
        System.out.println("Invalid Value");

    }
    else{
        System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour) +" mi/h");

    }
    
    }
   
}