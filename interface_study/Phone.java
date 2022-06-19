package interface_study;

/**
 * 能够通过 USB 接口连接电脑的手机
 */
public class Phone implements UsbInterface{

    @Override
    public void link() {
        System.out.println("已通过USB连接到手机");
    }

    @Override
    public void over() {
        System.out.println("手机的USB连接已断开");
    }
}
