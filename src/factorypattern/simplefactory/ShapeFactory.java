package factorypattern.simplefactory;

/**
 * @author pai
 * @date 2020/3/11
 */
public class ShapeFactory {
    private String type;

    public ShapeFactory() {
    }

    public ShapeFactory(String type){
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Shape getInstance(){
        if("circle".equals(type)){
            return new Circle();
            //增加正方形这里修改一处，但不是类扩展，不符合开闭原则:对修改关闭，对扩展开放
        }else if("square".equals(type)){
            return new Square();
        }
        return null;
    }
}
