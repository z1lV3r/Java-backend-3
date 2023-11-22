import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        //Task 3
        TestTrack.race(new ProductionRemoteControlCar());
        TestTrack.race(new ExperimentalRemoteControlCar());

        //Task 4
        ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
        prc1.setNumberOfVictories(3);
        prc2.setNumberOfVictories(2);
        List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
        unsortedCars.add(prc1);
        unsortedCars.add(prc2);
        List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
    }
}