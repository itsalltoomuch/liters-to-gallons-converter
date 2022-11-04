### This is a simple Java console app that convert liters to gallons

## Briefly introduction: 
Reference: https://www.calculatorful.com/liters-to-gallons 

The liter is a unit of volume in the metric system equal to 1 cubic decimeter, 1,000 cubic centimeters, or 0.001 cubic meter. It is commonly used in most countries in the world where the metric system is adopted to measure the volume of liquid products such as water, milk, wine, petrol (gasoline), and oil.

A gallon is a measurement unit of volume used in the US customary system and the British imperial system equal to 4 quarts, 8 pints, 3.79 - 4.55 liters. It is commonly used to measure the volume of liquid products, especially fuels for vehicles in the USA


### How to convert liters to gallons

There are approximately 0.2642 gallons in a liter. Therefore, when converting from liters to gallons we take the value in liters and multiply it with 0.2642. For example, 4 liters to gallons:
```
4 * 0.2642 = 1.0567 (gal)
```

## A simple Java program to generate a conversion table
```
public class LiterToGallonConverter {
    public static void main(String[] args) {
        double liters, gallons;

        // 1 liter equals 3.7854 gallons
        System.out.println("LITERS\t\t\t\tGALLONS");
        for (liters = 1; liters <= 5; liters++) {
            gallons = liters * 0.2642;
            System.out.println(String.format("%.2f", liters) + "\t\t\t\t" + String.format("%.4f", gallons));
        }
    }
}
```
- System.out.println() is a statement which prints the argument passed to it. The println() method display results on the monitor
- String.format(...) method returns the formatted string by given locale, format and arguments
- The Java for loop is used to iterate a part of the program several times. In this case, the code in the for block is run 5 times

The result of above function is as follow:
|LITERS             | GALLONS           |
| --- | --- |
|1.00|0.2642|
|2.00|0.5283|
|3.00|0.7925|
|4.00|1.0567|
|5.00|1.3209|