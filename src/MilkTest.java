public class MilkTest {
    public static void main(String[] args) {
        String type = "pure";

        Milk a = new Milk("蒙牛",type,250,2018,24);
        Milk b = new Milk("伊利",type,250,2018,24);
        Milk c = new Milk("蒙牛",type,250,2018,24);

        System.out.println(a.getBrand()+" | "+a.getType()+" | "+a.getVolume()+" | "+a.getDataInProduced()+" | "+a.getShelfLife());
        System.out.println(a.getBrand()+" | "+b.getType()+" | "+b.getVolume()+" | "+b.getDataInProduced()+" | "+b.getShelfLife());
        System.out.println(a.getBrand()+" | "+c.getType()+" | "+c.getVolume()+" | "+c.getDataInProduced()+" | "+c.getShelfLife());
    }
}
