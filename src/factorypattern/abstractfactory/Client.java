package factorypattern.abstractfactory;

/**
 * @author pai
 * @date 2020/3/11
 */
public class Client {
    public static void main(String[] args) {
        //生产奔驰车族
        CarFactory benzCarFactory = new BenzCarFactory();
        benzCarFactory.createMVPCar();
        benzCarFactory.createSUVCar();

        //生产宝马车族
        BmwCarFactory bmwCarFactory = new BmwCarFactory();
        bmwCarFactory.createMVPCar();
        bmwCarFactory.createSUVCar();
    }
}
