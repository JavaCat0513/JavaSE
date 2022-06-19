package interface_study;

/**
 * Understanding of Abstract_class and Interface
 * 以实际生活中的例子 —— 电脑为例
 * 抽象类更专注于电脑这一类商品所共有的特征（属性）和功能（方法）
 * 接口则更专注于电脑（类）与其他可接入设备（类）之间的协作问题
 */
public class InterfaceTest {
    /**
     * 模拟手机和相机通过 USB 接口连接到电脑进行文件传输的工作
     */
    public static void main(String[] args) {

        Computer computer = new Computer();
        Phone phone = new Phone();
        Camera camera = new Camera();

        computer.transFile(phone);

        System.out.println("-------------------------------");

        computer.transFile(camera);
    }
}
