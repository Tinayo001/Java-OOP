public class CarsAssemble {
    
    public double productionRatePerHour(int speed) {
        double baseRate = 221.0;
        double successRate;
        
        if (speed >= 1 && speed <= 4) {
            successRate = 1.0;
        }
        else if (speed >= 5 && speed <= 8) {
            successRate = 0.9;
        }
        else if (speed == 9) {
            successRate = 0.8;
        }
        else if (speed == 10) {
            successRate = 0.77;
        }
        else {
            successRate = 0.0; // when speed == 0 (off)
        }
        
        return speed * baseRate * successRate;
    }
    
    public int workingItemsPerMinute(int speed) {
        double perHour = productionRatePerHour(speed);
        return (int) (perHour / 60);
    }
}