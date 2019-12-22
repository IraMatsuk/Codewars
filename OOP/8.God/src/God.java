import human.Human;
import human.Man;
import human.Woman;

public class God {
  public static Human[] create() {
    Man adam = new Man();
    Woman eva = new Woman();
    Human[] humans = new Human[2];
    humans[0] = adam;
    humans[1] = eva;
    return humans;
  }
}
