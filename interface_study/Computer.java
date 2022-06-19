package interface_study;

public class Computer {

    /**
     * 和接入电脑的其他设备进行文件传输
     */
    public void transFile(UsbInterface usbInterface) {
        usbInterface.link();
        System.out.println("正在进行文件传输...");
        usbInterface.over();
    }
}
