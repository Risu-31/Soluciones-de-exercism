public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1.0 : 1.0 - 0.15;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < 20 ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold < 20 ? 10 * productsSold : 13 * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
       double suma =(1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold));
        return suma > 2000 ? 2000 : suma;
    } 
}
