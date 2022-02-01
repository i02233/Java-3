package HomeWork1;

import HomeWork1.fruits.Apple;
import HomeWork1.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"qwe", "asd", "zxc", "123"};
        //Integer[] arr = {5, 8, 32, 989, 8541, 551};

        System.out.println(Arrays.toString(arr));
        swapElements(arr, 0, 3);
        System.out.println(Arrays.toString(arr));

        ArrayList<String> list = arrayToList(arr);
        System.out.println(list.getClass() + " : " + list);


        Orange orange = new Orange();
        Apple apple = new Apple();
        BoxWithFruits<Orange> orangeBox1 = new  BoxWithFruits();
        BoxWithFruits<Orange> orangeBox2 = new  BoxWithFruits();
        BoxWithFruits<Apple> appleBox = new  BoxWithFruits();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.transfer(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <T> ArrayList<T> arrayToList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
