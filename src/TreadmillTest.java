import java.util.ArrayList;

public class TreadmillTest {
    public static void main(String[] args) {
       Treadmill a = new Treadmill("1号",2018,"尼龙",23,"blue","2018-1",2000,true);
       Treadmill b = new Treadmill("2号",2017,"不锈钢",20,"red","2017-1",2050,true);
       Treadmill c = new Treadmill("3号",2018,"某某",24,"yellow","2018-2",2200,false);
       Treadmill d = new Treadmill("4号",2016,"某某某",26,"black","2016-1",2222,false);

        ArrayList<Treadmill> treadmills = new ArrayList();

        treadmills.add(a);
        treadmills.add(b);
        treadmills.add(c);
        treadmills.add(d);

        System.out.println("我有跑步机"+treadmills.size()+"架，分别是:");

        for (Treadmill treadmill : treadmills) {
            boolean isMall = treadmill.isMall();
            if (isMall) {
                System.out.println(treadmill.getBrand() + " | " + treadmill.getPublishTime() + " | " + treadmill.getMaterial() + " | " + treadmill.getFloorSpace() + " | " + treadmill.getColor() + " | " + treadmill.getProductCode() + " | " + treadmill.getPower() + " | " + treadmill.isMall());
            }

        }
    }
}
