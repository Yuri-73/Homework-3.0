public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
    public static void task4() {
        System.out.println("Задача 4");
        int age1 = 5;
        int age2 = 10;
        int age3 = 19;
        int age4 = 23;
        int age5 = 24;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " ,то ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 <= 18) {
            System.out.println("Если возраст человека равен " + age2 + " ,то ему нужно ходить в школу");
        }
        if (age3 > 18 && age3 < 24) {
            System.out.println("Если возраст человека равен " + age3 + " ,то его место в институте");
        }
        if (age4 >= 24)
           System.out.println("Если возраст человека равен " + age4 + " ,то ему пора ходить на работу");
        else
           if(age4 >= 2 && age4 <= 6)
              System.out.println("Если возраст человека равен " + age4 + " ,то ему нужно ходить в детский сад");
           else
              if(age4 >= 7 && age4 <= 18)
                 System.out.println("Если возраст человека равен " + age4 + " ,то ему нужно ходить в школу");
              else
                 if(age4 > 18 && age4 < 24)
                    System.out.println("Если возраст человека равен " + age4 + " ,то его место в институте");
        if (age5 >= 24)
            System.out.println("Если возраст человека равен " + age5 + " ,то ему пора ходить на работу");
    }
}


