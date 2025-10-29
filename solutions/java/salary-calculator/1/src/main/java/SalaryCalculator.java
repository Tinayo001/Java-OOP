public class SalaryCalculator {
    public static double salaryMultiplier(int daysSkipped) {
        return (daysSkipped >= 5) ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold >= 20) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold){
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000;
         
         double result = (baseSalary * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);

        return (result <= 2000) ? result : 2000;
    } 
}
