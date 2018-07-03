public class MilkTest {
    public static void main(String[] args) {
        Milk a = new Milk();
        a.setBrand("蒙牛");
        System.out.println(a.getBrand());
        a.setDataInProduced(2018);
        System.out.println(a.getDataInProduced());
        a.setShelfLife(24);
        System.out.println(a.getShelfLife());
        a.setType("pure");
        System.out.println(a.getType());
        a.setVolume(250);
        System.out.println(a.getVolume());
    }
}
