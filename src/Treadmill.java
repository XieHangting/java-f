public class Treadmill {
    // 品牌
    private String brand;
    // 上市时间
    private int publishTime;
    // 材料
    private String material;
    // 占地面积
    private int floorSpace;
    // 颜色
    private String color;
    // 产品编号
    private String productCode;
    // 功率
    private int power;
    // 是否商场同款
    private boolean isMall;

    public Treadmill(String brand,int publishTime,String material,int floorSpace,String color,String productCode,int power,boolean isMall){
        this.brand = brand;
        this.publishTime = publishTime;
        this.material = material;
        this.floorSpace = floorSpace;
        this.color = color;
        this.productCode = productCode;
        this.isMall = isMall;
        this.power  = power;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFloorSpace(int floorSpace) {
        this.floorSpace = floorSpace;
    }

    public int getFloorSpace() {
        return floorSpace;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }


    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setPublishTime(int publishTime) {
        this.publishTime = publishTime;
    }

    public int getPublishTime() {
        return publishTime;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setMall(boolean mall) {
        isMall = mall;
    }

    public boolean isMall() {
        return isMall;
    }
}
