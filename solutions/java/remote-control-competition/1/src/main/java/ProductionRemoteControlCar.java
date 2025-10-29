import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>  {
    private int distance = 0;
    private int numberOfVictories = 0;
    
    @Override
    public void drive() {
        distance += 10;
    }
    
    @Override
    public int getDistanceTravelled() {
        return distance;
    }
    
    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    
    public int getNumberOfVictories() {
        return numberOfVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        // Descending order: other's victories - this victories
        // If other has more victories, returns positive (other comes first)
        // If this has more victories, returns negative (this comes first)
        return other.numberOfVictories - this.numberOfVictories;
    }
}
