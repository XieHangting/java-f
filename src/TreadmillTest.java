public class TreadmillTest {
    public static void main(String[] args) {
       Treadmill a = new Treadmill("1号",2018,"尼龙",23,"blue","2018-1",2000);
       Treadmill b = new Treadmill("2号",2017,"不锈钢",20,"red","2017-1",2050);
       Treadmill c = new Treadmill("3号",2018,"某某",24,"yellow","2018-2",2200);

        System.out.println(a.getBrand()+" | "+a.getPublishTime()+" | "+a.getMaterial()+" | "+a.getFloorSpace()+" | "+a.getColor()+ " | "+a.getProductCode()+" | "+a.getPower());
        System.out.println(b.getBrand()+" | "+b.getPublishTime()+" | "+b.getMaterial()+" | "+b.getFloorSpace()+" | "+b.getColor()+ " | "+b.getProductCode()+" | "+b.getPower());
        System.out.println(c.getBrand()+" | "+c.getPublishTime()+" | "+c.getMaterial()+" | "+c.getFloorSpace()+" | "+c.getColor()+ " | "+c.getProductCode()+" | "+c.getPower());
    }
}
