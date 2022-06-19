package interface_study;

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
