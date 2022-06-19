package abstract_class_vesus_interface;

/**
 * 耳机抽象类
 * 实现 Pocket 接口，即可以把耳机装入口袋
 */
public abstract class Earphone implements Pocket{
    /**
     * 一些耳机共有的基础属性
     */
    private String name;
    private String brand;
    private double size;

    /**
     * 连接到声源设备
     */
    public abstract void link();

    /**
     * 播放声音
     */
    public abstract void play();
}
