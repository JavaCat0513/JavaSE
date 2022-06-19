package abstract_class_study;

/**
 * 抽象类在继承的层面上使用时和一般类基本一致
 */
public class AbstractClassTest {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        playInstrument(guitar);
    }

    public static void playInstrument(Instrument instrument) {
        instrument.play();
    }
}
