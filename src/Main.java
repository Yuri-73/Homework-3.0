public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " годам, то он достиг совершеннолетия и может управлять транспортным средством");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " годам, управлять транспортным средством рано");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int AirTemperature = 6;

        if (AirTemperature <= 5) {
            System.out.println("На улице " + AirTemperature + " град. - нужно одеть шапку");
        }
        if (AirTemperature > 5) {
            System.out.println("На улице " + AirTemperature + " град. - можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int machineSpeed = 50;

        if (machineSpeed >= 60) {
            System.out.println("Если скорость " + machineSpeed + " км/ч, то придётся заплатить штраф");
        }
        if (machineSpeed < 60) {
            System.out.println("Если скорость " + machineSpeed + " км/ч, можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 19;

        if (age >= 2 && age <= 6)
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад");
        else
           if (age >= 7 && age <= 18)
              System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
           else
              if (age > 18 && age < 24)
                 System.out.println("Если возраст человека равен " + age + " ,то его место в институте");
              else
                 if (age >= 24)
                    System.out.println("Если возраст человека равен " + age + " ,то ему пора ходить на работу");
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 10;
        boolean adult = false;

        if (age < 5)
            System.out.println("Если возраст ребёнка " + age + " года,кататься на аттракционе нельзя");
        else
            if ((age >= 5 && age < 14) && adult)
               System.out.println("Если возраст ребёнка " + age + " лет, можно кататься, но в сопровождении взрослого");
            else
               if ((age >= 5 && age < 14) && !adult)
                  System.out.println("Кататься на аттракционе в возрасте " + age + " лет без сопровождения взрослого нельзя");
               else
                  if (age >= 14)
                     System.out.println("Если возраст ребёнка " + age + " лет,то можно кататься на аттракционе без сопровождения взрослого");
    }
    public static void task6() {
        System.out.println("Задача 6");
        int passengers = 105;
        int numberOfSeatsTotal = 120;
        int numberOfSeats = 60;
        boolean adult1 = (passengers == numberOfSeatsTotal); //Места заполнены полностью
        boolean adult2 = (passengers >= numberOfSeats && passengers < numberOfSeatsTotal); //Есть только стоячие места
        boolean adult3 = passengers < numberOfSeats; //Есть сидячие и стоячие места

        if (adult3)
            System.out.println("Если пассажиров в вагоне " + passengers + " ,то есть сидячие места в количестве " +(numberOfSeats - passengers)+ " единиц");
        else
           if (adult2)
              System.out.println("Если пассажиров в вагоне " + passengers + " ,то есть стоячие места в количестве " +(numberOfSeatsTotal - passengers)+ " единиц");
           else
               if(adult1)
                  System.out.println("Если пассажиров в вагоне " + passengers + " ,то никаких мест нет");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 5;
        int two = 23;
        int three = 84;
        boolean adult1 = (one > two && one > three);
        boolean adult2 = (two > one && two > three);
        boolean adult3 = (three > one && three > two);

        if (adult1)
           System.out.println("Число one = " + one + " самое большее");
        else
           if (adult2)
              System.out.println("Число two = " + two + " самое большее");
           else
              if(adult3)
                 System.out.println("Число three = " + three + " самое большее");
    }
}

