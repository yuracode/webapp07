package model;

import java.io.Serializable;

public class PizzaResult implements Serializable {

    private double radius;
    private int people;
    private double totalArea;
    private double areaPerPerson;

    // 引数なしコンストラクタ（JavaBeans必須）
    public PizzaResult() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public double getAreaPerPerson() {
        return areaPerPerson;
    }

    public void setAreaPerPerson(double areaPerPerson) {
        this.areaPerPerson = areaPerPerson;
    }
}