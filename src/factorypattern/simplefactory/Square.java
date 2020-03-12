package factorypattern.simplefactory;

/**
 * @author pai
 * @date 2020/3/11
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
