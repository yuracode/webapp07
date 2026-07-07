package model;

public class PizzaCalculator {

    // インスタンス化不要のユーティリティクラス
    private PizzaCalculator() {
    }

    public static PizzaResult calculate(double radius, int people) {
        double totalArea = Math.PI * radius * radius;
        double areaPerPerson = totalArea / people;

        PizzaResult result = new PizzaResult();
        result.setRadius(radius);
        result.setPeople(people);
        result.setTotalArea(totalArea);
        result.setAreaPerPerson(areaPerPerson);

        return result;
    }
}