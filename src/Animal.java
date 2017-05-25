/**
 * Created by Nikos on 18-May-17.
 */
public class Animal {

    private final String name;
    private RunningPatternStrategy strategy;

    public Animal(String name) {
        this.name = name;
    }

    public void setStrategy(RunningPatternStrategy strategy) {
        this.strategy = strategy;
    }

    public void run(int energy){
        System.out.println(this.name + " started to run....");
        strategy.move(energy);
    }
}

