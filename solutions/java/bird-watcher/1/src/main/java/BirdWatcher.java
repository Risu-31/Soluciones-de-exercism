
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0,2,5,3,7,8,4}; 
    }

    public int getToday() {
        int ultimoLugar = birdsPerDay.length - 1;
        return birdsPerDay[ultimoLugar];
    }

    public void incrementTodaysCount() {
        int incrementar = birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i: birdsPerDay) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int contador = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++)  {
            contador += birdsPerDay[i];
        }
        return contador;
    }

    public int getBusyDays() {
        int diaOcupados = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                diaOcupados += 1;
            }
        }
        return diaOcupados;
    }
}
