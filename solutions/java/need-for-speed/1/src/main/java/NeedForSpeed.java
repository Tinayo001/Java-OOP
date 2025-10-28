class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distance;
    private int battery; 
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distance = 0;
        this.battery = 100;
    }
    
    public boolean batteryDrained() {
        return battery < batteryDrain;
    }
    
    public int distanceDriven() {
        return distance;
    }
    
    public void drive() {
        if (!batteryDrained()) {
            distance += speed;
            battery -= batteryDrain;
        }
    }
    
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public int getBatteryDrain() {
        return batteryDrain;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }
    
    public boolean canFinishRace(NeedForSpeed car) {
        int maxDistance = (100 / car.getBatteryDrain()) * car.getSpeed();
        return maxDistance >= distance;
    }
}
