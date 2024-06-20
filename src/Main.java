public class Main {
    public static void main(String[] args) {
        // Task 1
        int age = 17;

        if (age >= 18)
        {System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");}
        else
        {System.out.println("Если возраст человека равен "+ age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Task 2
        byte temperature = 5; //// Не выведет ни одного из значений
        // если температура воздуха выше 5 градусов
        if (temperature > 5) {System.out.println("На улице " + temperature + " градусов, можно идти без шапки");}
        // если температура ниже 5 градусов
        if (temperature <= 5) {System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");}

        // Task 3
        byte speed = 60;
        // скорость превышена, если она больше 60 км/ч
        if (speed > 60) {System.out.println("Если скорость " + speed + ", то придется заплатить штраф");}
        // превышения скорости нет, если она меньше 60 км/ч
        if (speed <= 60) {System.out.println("На улице " + speed + " градусов, то можно ехать спокойно");}

        // Task 4
        age = 1;
        if (age < 2) {System.out.println("Если возраст человека равен " + age + " то ему нужно быть с матерью :)");}
        if (age >= 2 && age <= 6) {System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");}
        if (age >= 7 && age <= 17) {System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу.");}
        if (age >= 18 && age <= 24) {System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет.");}
        if (age >= 25) {System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу.");}
        // Task 5
        age = 3;
        if (age >= 14)
        {System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься без сопровождения взрослых.");}
        else {
            if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься в сопровождении взрослых.");}
            else
            {System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься.");}
        }
        // Task 6
        byte sit = 102;
        byte sitting = 60;
        byte sittingBusy = 30;
        byte standing = (byte) (sit - sitting);
        byte standingBusy = 15;
        if (sittingBusy + standingBusy >= sit)
        {System.out.println("Вагон полон");}
        else
        {System.out.println("В вагоне свободно " + (sitting - sittingBusy) + " сидячих и " + (standing - standingBusy) + " стоячих мест");}

        // Task 7
        int one = 1000;
        int two = 5500;
        int three = 3765;

        if (one > two && one > three)
        {System.out.println(one + " больше");}
        else
        {if (two > three)
        {System.out.println(two + " больше");}
        else
        {System.out.println(three + " больше");}
        }
    }
}