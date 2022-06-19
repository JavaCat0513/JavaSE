package interface_study;

/**
 * 能够通过 USB 接口连接电脑的相机
 */
public class Camera implements UsbInterface{

    @Override
    public void link() {
        System.out.println("已通过USB连接到相机");
    }

    @Override
    public void over() {
        System.out.println("相机的USB连接已断开");
    }
}
