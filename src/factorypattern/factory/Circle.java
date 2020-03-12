package factorypattern.factory;

/**
 * @author pai
 * @date 2020/3/11
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画圆");
    }
}
