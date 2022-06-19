package abstract_class_study;

/**
 * 抽象类中可以包含抽象（未具体实现）方法
 * 需要用 abstract 关键字修饰
 */
public abstract class Instrument {

    private String name;
    private String type;

    public abstract void play();
}
