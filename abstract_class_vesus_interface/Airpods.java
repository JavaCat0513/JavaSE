package abstract_class_vesus_interface;

public class Airpods extends Earphone{

    @Override
    public void link() {
        System.out.println("当耳机放入耳朵时自动连接");
    }

    @Override
    public void play() {
        System.out.println("可利用siri控制音源播放");
    }

    @Override
    public void intoPocket() {
        System.out.println("Airpods被装进了口袋");
    }

    @Override
    public void outPocket() {
        System.out.println("Airpods被拿出了口袋");
    }
}
