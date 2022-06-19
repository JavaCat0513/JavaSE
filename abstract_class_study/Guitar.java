package abstract_class_study;

/**
 * 继承了抽象类的子类需要实现抽象类中的所有抽象方法，即赋予其方法体
 */
public class Guitar extends Instrument{

    @Override
    public void play() {
        System.out.println("吉他演奏中");
    }
}
