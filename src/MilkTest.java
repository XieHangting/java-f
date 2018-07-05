public class MilkTest {
    public static void main(String[] args) {
        String type = "pure";
        Milk[] milks = new Milk[3];

        Milk a = new Milk("蒙牛",type,250,2018,24);
        Milk b = new Milk("伊利",type,222,2018,24);
        Milk c = new Milk("蒙牛",type,255,2017,24);

        milks[0] = a;
        milks[1] = b;
        milks[2] = c;

        System.out.println("有牛奶"+milks.length+"瓶，他们是");

        for (Milk milk : milks) {
            System.out.println(milk.getBrand()+" | "+milk.getType()+" | "+milk.getVolume()+" | "+milk.getDataInProduced()+" | "+milk.getShelfLife());
        }


    }
}
