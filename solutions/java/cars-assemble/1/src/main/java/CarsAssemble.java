public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed == 1 ||speed == 2 ||speed == 3 ||speed == 4) {
            return speed * 221;
        }
        if (speed == 5 ||speed == 6 ||speed == 7 ||speed == 8) {
            return speed * 221 * 0.90;
        }
        if (speed == 9) {
            return speed * 221 * 0.80;
        }
        if (speed == 10) {
            return speed * 221 * 0.77;
        }
        return speed;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
