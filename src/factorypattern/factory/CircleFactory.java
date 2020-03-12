package factorypattern.factory;



/**
 * @author pai
 * @date 2020/3/11
 */
public class CircleFactory implements ShapeFactory {

    @Override
    public Shape getInstance() {
        return new Circle();
    }
}
