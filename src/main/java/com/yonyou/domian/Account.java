package com.yonyou.domian;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-11-29 15:43
 * @description：
 * @modified By：
 * @version: $
 */
public class Account {

    private Integer id;
    private String food;
    private Double price;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", food='" + food + '\'' +
                ", price=" + price +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
