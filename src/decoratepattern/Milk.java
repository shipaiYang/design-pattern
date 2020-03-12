package decoratepattern;

/**
 * @author pai
 * @date 2019/12/30
 */
public class Milk extends Sauce {
    public Milk(Drink drink) {
        super(drink);
        this.price = 5.0f;
    }


}
