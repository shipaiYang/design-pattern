package decoratepattern;

/**
 * @author pai
 * @date 2020/1/1
 */
public class Soy extends Sauce {
    public Soy(Drink drink) {
        super(drink);
        this.price = 2.5f;
    }
}
