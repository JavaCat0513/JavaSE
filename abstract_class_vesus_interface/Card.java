package abstract_class_vesus_interface;

/**
 * 卡片抽象类
 * 实现 Pocket 接口，即可以把卡片装入口袋
 */
public abstract class Card implements Pocket{
    /**
     * 一些卡片共有的基础属性
     */
    private String id;
    private String name;
    private double size;

    /**
     * 获得某种权限
     */
    public abstract void getAuthority();
}
