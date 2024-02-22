package patterns.generating.builder.task;

import patterns.generating.builder.task.item.Characteristic;
import patterns.generating.builder.task.item.Item;
import patterns.generating.builder.task.item.impl.Bike;

/**
 Using the builder pattern, correct the characteristic class code
 */
public class Main {
    public static void main(String[] args) {
//        Item bike = new Bike(
//                new Characteristic(
//                        "brand", "color", "ram", "cpu", "os", "weight", "memory",
//                        "memoryType", "battery", "body", "wheel")
//        );

        Item bike = new Bike(Characteristic.builder()
                .wheel("wheel")
                .brand("Stels")
                .color("23")
                .build());

        System.out.println(bike);
    }
}
