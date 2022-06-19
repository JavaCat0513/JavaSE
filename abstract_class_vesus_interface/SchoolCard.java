package abstract_class_vesus_interface;

public class SchoolCard extends Card{

    @Override
    public void getAuthority() {
        System.out.println("获得进出校园和校内消费的权限");
    }

    @Override
    public void intoPocket() {
        System.out.println("校园门禁卡被装进了口袋");
    }

    @Override
    public void outPocket() {
        System.out.println("校园门禁卡被拿出了口袋");
    }
}
