public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int time) {
        return expectedMinutesInOven() - time;
    }
    public int preparationTimeInMinutes(int capas) {
        return capas * 2;
    }
    public int totalTimeInMinutes(int capas, int time) {
        Lasagna lasagna = new Lasagna();
        return lasagna.preparationTimeInMinutes(capas) + time;
    }
}
