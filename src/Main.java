public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age1 = 22;
        int age2 = 17;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + " годам, то он достиг совершенолетия и может управлять транспортным средством");
        }
        if (age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + " годам, управлять транспортным средством рано");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int AirTemperature1 = 4;
        int AirTemperature2 = 6;
        if (AirTemperature1 <= 5) {
            System.out.println("На улице " + AirTemperature1 + " град. - нужно одеть шапку");
        }
        if (AirTemperature2 > 5) {
            System.out.println("На улице " + AirTemperature2 + " град. - можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int machineSpeed1 = 80;
        int machineSpeed2 = 55;
        if (machineSpeed1 >= 60) {
            System.out.println("Если скорость " + machineSpeed1 + " км/ч, то придётся заплатить штраф");
        }
        if (machineSpeed2 < 60) {
            System.out.println("Если скорость " + machineSpeed2 + " км/ч, можно ездить спокойно");
        }
    }
}


