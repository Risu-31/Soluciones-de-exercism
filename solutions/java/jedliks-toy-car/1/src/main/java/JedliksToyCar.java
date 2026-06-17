public class JedliksToyCar {

    public int batery = 100;
    public int distance;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        return batery <= 0 ?  "Battery empty":"Battery at " + batery + "%";
    }

    public void drive() {
        if (batery > 0){
            distance += 20 ;
            batery -= 1;
        }
    }
}
