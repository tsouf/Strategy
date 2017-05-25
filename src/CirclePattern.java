/**
 * Created by Nikos on 18-May-17.
 */
public class CirclePattern implements RunningPatternStrategy {

    @Override
    public void move(int energy) {

        do{
            if (energy > 0) {
                System.out.println("Go West");
                energy--;
            }

                if (energy > 0) {
                    System.out.println("Go South");
                    energy--;
                }

                    if (energy > 0) {
                        System.out.println("Go East");
                        energy--;
                    }

                    if (energy > 0) {
                            System.out.println("Go North");
                            energy--;
                        }
                    }while (energy > 0);
                    System.out.println("run completed...DEAD");
                }
                dick
            }





