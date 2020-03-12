package decoratepattern;

/**
 * @author pai
 * @date 2019/12/28
 */
public abstract class Coffe extends Drink {
    @Override
    public float cost() {
        return this.price;
    }
}
