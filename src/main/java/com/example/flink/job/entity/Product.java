package com.example.flink.job.entity;

/**
 * @Date 2020/6/11 17:41
 * @Author 86131
 * @Description
 */
public class Product {
    private String num;
    private String name;
    private String caption;
    private String boxRule;
    private String code;
    private String effect;
    private String type;
    private String price;
    private String lowPrice;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getBoxRule() {
        return boxRule;
    }

    public void setBoxRule(String boxRule) {
        this.boxRule = boxRule;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(String lowPrice) {
        this.lowPrice = lowPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", caption='" + caption + '\'' +
                ", boxRule='" + boxRule + '\'' +
                ", code='" + code + '\'' +
                ", effect='" + effect + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", lowPrice='" + lowPrice + '\'' +
                '}';
    }
}
