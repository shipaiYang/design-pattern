package factorypattern.abstractfactory;

/**
 * @author pai
 * @date 2020/3/11
 */
public interface CarFactory {
    MPVCar createMVPCar();
    SUVCar createSUVCar();
}