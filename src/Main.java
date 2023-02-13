public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age1 = 22;
        int age2 = 17;
        if(age1 >= 18) {
           System.out.println("Если возраст человека равен " + age1 + " годам, то он достиг совершенолетия и может управлять транспортным средством");
        }
        if(age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + " годам, управлять транспортным средством рано");
        }
    }
}


