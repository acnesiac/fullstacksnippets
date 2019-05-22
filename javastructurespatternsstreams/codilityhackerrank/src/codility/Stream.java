package codility;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> modelsAfter2000 = getModelsAfter2000(Arrays.asList(new Car()));
        System.out.println(modelsAfter2000);
    }


    public static List<Integer> getModelsAfter2000(List<Car> cars) {
        return cars.stream().filter(car -> car.getYear() < 2000)
                .sorted(Comparator.comparing(Car::getYear))
                .map(Car::getModel).collect(Collectors.toList());
    }

    public static List<Integer> getModels(List<Car> cars){
        return cars.stream().filter(car -> car.getYear() > 2000)
                .sorted(Comparator.comparing(Car::getYear))
                .map(Car::getModel).collect(Collectors.toList());
    }

}

class Car{
    private int year;
    private int model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getModel() {
        return model;
    }
.
    public void setModel(int model) {
        this.model = model;
    }
}
