
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }
    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }
    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }
    public int incrementTodaysCount() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1]++;
    
    }
    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int count = 0;

        for (int birds : birdsPerDay) {
            if (count == numberOfDays) {
                break; // stop once we've counted enough days
            }
            total += birds;
            count++;
        }
        return total;
    }
    public int getBusyDays() {
        int busyDays = 0;
        
        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
    
}
