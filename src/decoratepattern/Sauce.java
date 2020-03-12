package decoratepattern;

/**
 * @author pai
 * @date 2019/12/30
 */
public abstract class Sauce extends Drink {
    protected Drink drink;

    public Sauce(Drink drink) {
        this.drink = drink;
    }



    @Override
    public float cost(){
        return drink.cost() + this.price;
    }



}
