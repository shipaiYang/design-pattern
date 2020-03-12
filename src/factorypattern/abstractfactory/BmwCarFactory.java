package factorypattern.abstractfactory;

/**
 * @author pai
 * @date 2020/3/11
 */
public class BmwCarFactory implements CarFactory {
    @Override
    public MPVCar createMVPCar() {
        return new BmwMPVCar();
    }

    @Override
    public SUVCar createSUVCar() {
        return new BmwSUVCar();
    }
}
