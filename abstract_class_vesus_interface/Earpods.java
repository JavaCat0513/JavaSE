package abstract_class_vesus_interface;

public class Earpods extends Earphone{

    @Override
    public void link() {
        System.out.println("插入手机即完成连接");
    }

    @Override
    public void play() {
        System.out.println("可通过操作设备控制声源播放");
    }

    @Override
    public void intoPocket() {
        System.out.println("Earpods被缠好装进了口袋");
    }

    @Override
    public void outPocket() {
        System.out.println("Earpods被艰难地拿出了口袋");
    }
}
