package com.yonyou.domian;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-12-02 20:27
 * @description：
 * @modified By：
 * @version: $
 */
public class Salgrade {

    private Integer id;
    private String name;
    private Float sal;

    @Override
    public String toString() {
        return "Salgrade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSal() {
        return sal;
    }

    public void setSal(Float sal) {
        this.sal = sal;
    }
}
