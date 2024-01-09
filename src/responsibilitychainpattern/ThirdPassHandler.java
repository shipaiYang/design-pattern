package responsibilitychainpattern;

public class ThirdPassHandler extends BasePassHandler {
    @Override
    public int play() {
        return 90;
    }

    @Override
    public int handler() {
        System.out.println("最后一关!");
        return this.play();
    }
}
