public class Main {
    public static void main(String[] args) {
        String locationString = "UVA Library";
        System.out.println(" I am at " + locationString);
        locationString = locationString + " which is also called 'UB' ";
        System.out.println(" I am at " + locationString);
        locationString = locationString + "in Singel, Rokin \u00A9 1578, ";
        System.out.println(" I am studying at " + locationString);
        int year = 2022;
        double date = 12.05;
        locationString = " Here and now: " + locationString + date +"."+year;
        System.out.println(locationString);






    }
}