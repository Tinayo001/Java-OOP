import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int index = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[index];
        
    }

    String randomShipRegistryNumber() {
        // Generate a number between 1000 and 9999 (inclusive)
        int number = 1000 + random.nextInt(9000); // nextInt(9000) gives 0..8999
        return "NCC-" + number;
    }

    double randomStardate() {
        // random.nextDouble() gives 0.0 (inclusive) to 1.0 (exclusive)
        // Multiply by 1000.0 to get range 0.0 to 1000.0
        // Add 41000.0 to shift the range to 41000.0 to 42000.0
        return 41000.0 + random.nextDouble() * 1000.0;
        
    }
}
