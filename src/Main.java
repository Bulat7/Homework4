public class Main {
    public static void main(String[] args) {
        byte age = 3;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать.");
        }

        byte weather = 6;
        if (weather < 5) {
            System.out.println("На улице " + weather + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + weather + " градусов, можно идти без шапки.");
        }

        byte speed = 59;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        byte currentAge = 25;
        if (currentAge >= 2 && currentAge <= 6) {
            System.out.println("Если возраст человека равен " + currentAge + ", то ему нужно ходить в детский сад.");
        } else if (currentAge >= 7 && currentAge <= 17) {
            System.out.println("Если возраст человека равен " + currentAge + ", то ему нужно ходить в школу.");
        } else if (currentAge >= 18 && currentAge <= 24) {
            System.out.println("Если возраст человека равен " + currentAge + ", то ему нужно ходить в университет.");
        } else if (currentAge >= 25) {
            System.out.println("Если возраст человека равен " + currentAge + ", то ему нужно ходить на работу.");
        }

        byte childAge = 15;
        if (childAge < 5) {
            System.out.println("Ребенку нельзя кататься на аттракционе.");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Ребенок может кататься на атракционе только в сопровождении взрослого.");
        }
        if (childAge > 14) {
            System.out.println("Подросток уже достаточно взрослый чтобы кататься в одиночку.");
        }

        byte passengerNumber = 2;
        if (passengerNumber >= 1 && passengerNumber <= 60) {
            System.out.println("Пассажиру номер " + passengerNumber + " хватит места в вагоне, есть возможность сесть.");
        } else if (passengerNumber > 60 && passengerNumber <= 102) {
            System.out.println("Пассажиру номер " + passengerNumber + " хватит места в вагоне, но возможности сесть уже нет.");
        } else {
            System.out.println("Мест в вагоне больше нет.");
        }

        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число " + one + ".");
        }
        if (two >= one && two >= three) {
            System.out.println("Наибольшее число " + two + ".");
        }
        if (three >= one && three >= two) {
            System.out.println("Наибольшее число " + three + ".");
        }


    }


}