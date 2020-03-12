package factorypattern.factory;



/**
 * 增加正方形用类扩展,但会有类爆炸问题
 * @author pai
 * @date 2020/3/11
 */
public class SquareFactory implements ShapeFactory {

    @Override
    public Shape getInstance() {
        return new Square();
    }
}
