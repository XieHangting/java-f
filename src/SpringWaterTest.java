public class SpringWaterTest {
    public static void main(String[] args) {
        SpringWater a = new SpringWater();
        a.setBrand("农夫山泉");
        System.out.println(a.getBrand());
        a.setShelfLife(24);
        System.out.println(a.getShelfLife());
        a.setVolume(500);
        System.out.println(a.getVolume());
        a.setDataInproduced(2018);
        System.out.println(a.getDataInproduced());

    }
}
