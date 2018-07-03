public class TreadmillTest {
    public static void main(String[] args) {
        Treadmill a = new Treadmill();
        a.setBrand("品牌");
        System.out.println(a.getBrand());
        a.setColor("blue");
        System.out.println(a.getColor());
        a.setFloorSpace(10);
        System.out.println(a.getFloorSpace());
        a.setMaterial("尼龙");
        System.out.println(a.getMaterial());
        a.setPower(1500);
        System.out.println(a.getPower());
        a.setProductCode("56499-54");
        System.out.println(a.getProductCode());
        a.setPublishTime(2018);
        System.out.println(a.getPublishTime());
    }
}
