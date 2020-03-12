package factorypattern.factory;

/**
 * @author pai
 * @date 2020/3/11
 */
public class Client {

    public static void main(String[] args) {
        //画圆
        ShapeFactory circleFactory = new CircleFactory();
        circleFactory.getInstance().draw();

        //画正方形
        ShapeFactory squareFactory = new SquareFactory();
        squareFactory.getInstance().draw();
    }
}
