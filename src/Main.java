/**
 * Created by Nikos on 18-May-17.
 */
public class Main {

    public static void main(String[] args) {

        Animal a1 = new Animal("RoadRunner");

        a1.setStrategy(new CirclePattern());

        a1.run(12); // 12 units of energy from the start - where
        // will this bring the RoadRunner ?
    }

}
