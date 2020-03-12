package factorypattern.simplefactory;

/**
 * @author pai
 * @date 2020/3/11
 */
public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory("circle");
        shapeFactory.getInstance().draw();

        //增加正方形
        shapeFactory.setType("square");
        shapeFactory.getInstance().draw();

    }
}
