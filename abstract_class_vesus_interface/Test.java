package abstract_class_vesus_interface;

/**
 * 测试类
 * 模拟一个人出门把东西装进口袋的过程
 * 主要看实现 goOutside 方法时的区别，来进一步认识 抽象类 和 接口 的区别
 *
 * 个人理解：
 *   1. 当你出门时要把物品装入口袋（传参）时，物品往往是多种类型的，其中可能存在多件物品属于同一类，
 *      如果此时将物品分类装入口袋，一方面需要知道各个物品的种类归属，另一方面要进行分类工作，体现
 *      在下面的代码中即为：首先要知道 Airpods 和 Earpods 属于 Earphone 类，SchoolCard 和
 *      CommunityCard 属于 Card 类，之后分别对其用 goOutside(Earphone earphone) 方法和
 *      goOutside(Card card) 方法实现装入
 *   2. 但如果不考虑物品的种类，而只考虑物品是否可以装入口袋（是否实现了 Pocket 接口），则只需要
 *      使用 goOutside(Pocket pocket) 方法即可完成物品的装入，省略了上述的工作，进一步对代码
 *      进行了简化
 *   3. 因此，我的理解是，抽象类更加侧重于对该类所特有的属性和方法进行描述，用于与其他类进行区分，
 *      而接口则更侧重于类与类之间的协作关系，这种关系在更高层面上将实现了某个接口的类划分到一起，
 *      类似于继承关系中父类与子类之间的关系，但是是从另一种维度去进行划分的
 */
public class Test {
    public static void main(String[] args) {

        /* 假设有两个耳机，Airpods和Earpods，两个卡片，校园卡和小区门禁卡 */
        Airpods airpods = new Airpods();
        Earpods earpods = new Earpods();
        SchoolCard schoolCard = new SchoolCard();
        CommunityCard communityCard = new CommunityCard();

        Pocket[] pockets = {airpods, earpods, schoolCard, communityCard};

        /* 只带一个物品出门 */
        System.out.println("only Airpods:");
        goOutside(airpods);

        System.out.println("---------------------------------");

        /* 所有物品都带出门 */
        System.out.println("take all:");
        goOutside(pockets);


    }

    /**
     * goOutside 方法
     * 用于模拟出门时把要带的物品装入口袋以及回家时把口袋里的东西取出的过程
     */
    public static void goOutside(Pocket pocket) {
        pocket.intoPocket();
        System.out.println("出门...做事...回家");
        pocket.outPocket();
    }

    public static void goOutside(Pocket[] pockets) {
        for (int i = 0; i < pockets.length; i++) {
            pockets[i].intoPocket();
        }
        System.out.println("出门...做事...回家");
        for (int i = 0; i < pockets.length; i++) {
            pockets[i].outPocket();
        }
    }

    public static void goOutside(Card card) {
        card.intoPocket();
        System.out.println("出门...做事...回家");
        card.outPocket();
    }

    public static void goOutside(Earphone earphone) {
        earphone.intoPocket();
        System.out.println("出门...做事...回家");
        earphone.outPocket();
    }

    public static void goOutside(Object object) {
        /* object.intoPocket(); */
        System.out.println("出门...做事...回家");
        /* object.outPocket();  */
    }
}
