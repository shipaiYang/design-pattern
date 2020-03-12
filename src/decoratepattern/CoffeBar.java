package decoratepattern;

/**
 * @author pai
 * @date 2019/12/28
 */
public class CoffeBar {

    public static void main(String[] args) {
        System.out.println("点一杯Espresso:");
        Espresso espresso = new Espresso();
        System.out.println("花费:"+espresso.cost());
        System.out.println("加一杯牛奶:");
        Milk milk = new Milk(espresso);
        System.out.println("花费:"+milk.cost());
        System.out.println("再加一杯牛奶:");
        Milk milk1 = new Milk(milk);
        System.out.println("花费:"+milk1.cost());
        System.out.println("再加一杯豆浆:");
        Soy soy = new Soy(milk1);
        System.out.println("花费:"+soy.cost());
        System.out.println("再加一杯LongBlack:");
        LongBlack longBlack = new LongBlack();
        System.out.println("花费:");
    }
}
