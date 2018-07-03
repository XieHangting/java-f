public class SpringWater {
    // 品牌
    private String brand;
    // 容量
    private int volume;
    // 生产日期
    private int dataInproduced;
    // 保质期
    private int shelfLife;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setDataInproduced(int dataInproduced) {
        this.dataInproduced = dataInproduced;
    }

    public int getDataInproduced() {
        return dataInproduced;
    }
}
