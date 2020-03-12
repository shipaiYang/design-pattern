package factorypattern.abstractfactory;

/**
 * @author pai
 * @date 2020/3/11
 */
public class BenzCarFactory implements CarFactory {
    @Override
    public MPVCar createMVPCar() {
        return new BenzMPVCar();
    }

    @Override
    public SUVCar createSUVCar() {
        return new BenzSUVCar();
    }
}
