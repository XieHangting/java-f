
public class Milk {
    /* 品牌 */
    private String brand;
    // 类型
    private String type;
    // 容量
    private int volume;
    // 生产日期
    private int dataInProduced;
    // 保质期
    private int shelfLife;

    public Milk(String brand,String type,int volume,int dataInProduced,int shelfLife){
        this.brand = brand;
        this.type = type;
        this.volume = volume;
        this.dataInProduced = dataInProduced;
        this.shelfLife = shelfLife;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setDataInProduced(int dataInProduced) {
        this.dataInProduced = dataInProduced;
    }

    public int getDataInProduced() {
        return dataInProduced;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
