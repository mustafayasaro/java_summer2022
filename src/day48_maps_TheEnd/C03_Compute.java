package day48_maps_TheEnd;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {

    public static void main(String[] args) {

        Map<String, Integer> harfMapi = new HashMap<>();

        harfMapi.put("A", 5);
        harfMapi.put("B", 1);
        harfMapi.put("C", 2);
        harfMapi.put("D", 4);
        harfMapi.put("E", 4);

        System.out.println(harfMapi);
        //{A=5, B=1, C=2, D=4, E=4}

        harfMapi.compute("A", (k, v) -> v * 2 + 3); // k,v sembolik a,b olabilir
        // bizim map key ve value'dan olusuyor sen value'yu 2 ile carp 3 ekle

        System.out.println(harfMapi);
        // {A=13, B=1, C=2, D=4, E=4}

        harfMapi.compute("D", (a, b) -> b * b);
        System.out.println(harfMapi);
        // {A=13, B=1, C=2, D=16, E=4}

        harfMapi.computeIfAbsent("C", (v) -> 30);
        System.out.println(harfMapi);
        // {A=13, B=1, C=2, D=16, E=4}   C var oldugu icin degismedi


        harfMapi.computeIfAbsent("F", (v) -> 30);
        System.out.println(harfMapi);
        // {A=13, B=1, C=2, D=16, E=4, F=30} F olmadigi icin ekledi ve atadi

        harfMapi.computeIfPresent("E", (k, v) -> v + 5);
        System.out.println(harfMapi);
        // {A=13, B=1, C=2, D=16, E=9, F=30}
        // E'nin degerini 5 artirdi


        harfMapi.computeIfPresent("G", (k, v) -> v + 5);
        System.out.println(harfMapi);
        // G olmadigi icin hicbir degisiklik olmadi

    }
}
