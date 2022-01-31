package org.yuyuan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        Civic myCar = new Civic();

        String color = myCar.getColor();

        System.out.println(color);

        CivicConvoy civicConvoy = new CivicConvoy();
        System.out.println(civicConvoy.count());

        List<Marker> markers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Marker newMarker = new Marker();

            double d = Math.random();
            if (d < 0.6) {
                newMarker.color = "red";
            } else if (d < 0.7) {
                newMarker.color = "blue";
            } else if (d < 0.8) {
                newMarker.color = "green";
            } else if (d < 0.9) {
                newMarker.color = "yellow";
            } else {
                newMarker.color = "brown";
            }

            markers.add(newMarker);
        }

        Map<String, Integer> colorMap = new HashMap<>();
        colorMap.put("red", 0);
        colorMap.put("blue", 0);
        colorMap.put("green", 0);
        colorMap.put("yellow", 0);
        colorMap.put("brown", 0);
        for (Marker marker : markers) {
            colorMap.putIfAbsent(marker.color, 0);
            colorMap.put(marker.color, colorMap.get(marker.color) + 1);
            System.out.println(marker.color);
        }
        for (Map.Entry<String, Integer> entry : colorMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
