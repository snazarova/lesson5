public class Main {
    public static void main(String[] args) {

// задание1 task1
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю вас с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("К сожалению, вам нужно немного подождать до совершеннолетия");
        }

// task2
        int ageOfChild = 8;
        if (ageOfChild >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        int ageOfMan = 19;
        if (ageOfMan >= 18) {
            System.out.println("Человек закончил школу, может поступать в универстиет");
        }
        int ageOfPeople = 25;
        if (ageOfPeople >= 24) {
            System.out.println("Человек окончил университет и пора искать первую работу");
        }

        // task3
        int allPlace = 102;
        int seatPlace = 60;
        int standPlace = allPlace - seatPlace;
        int seatUsed = 46;
        int standUsed = 30;

        if (seatUsed < seatPlace ) {
            System.out.println(" вагоне еще " + (seatPlace - seatUsed ) + "сидячихмест");
        }
        if (seatUsed == seatPlace) {
            System.out.println("В Вагоне нет сидячих мест");
        }
        if (seatUsed == standPlace) {
            System.out.println("В вагоне стоячих мест нет");
        }
        if (standUsed < standPlace) {
            System.out.println("В Вагоне есть" + (standPlace - standUsed) + " стоячих мест");
        }


        // задание2 task1
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!");
        } else {
            System.out.println("К сожалению до совершеннолетия вам нужно немного подождать");
        }

        // task2
        int ageChild = 7;
        if (ageChild >= 7 && ageChild < 18) {
            System.out.println("Ребенок учится в школе");
        } else if (ageChild >= 18 && ageChild < 24){
            System.out.println("Человек учится в универститете");
        } else if ( ageChild >= 24) {
                System.out.println("Человеку пора искать работу");
            }
        else {System.out.println("Человек еще не закончил школу");}

        // task3
        int allPlace1 = 102;
        int seatPlace1 = 60;
        int standPlace1 = allPlace - seatPlace;
        int seatUsed1 = 40;
        int standUsed1 = 41;
        if (seatUsed1 < seatPlace1) {
            System.out.println("В Вагоне " + (seatPlace1 - seatUsed1) + " свободных сидячих мест");
        } else {
            System.out.println("В вагоне нет сидячих мест");
            if (seatUsed1 < standPlace1) {
                System.out.println("В вагоне" + (standPlace1 - standUsed1) + " свободных стоячих мест");
            } else {
                System.out.println("В вагоне нет свободных стоячих мест");
            }

            // задание 3 task1
            int peopleAge = 5;
            if (peopleAge >= 2 && peopleAge <= 6) {
                System.out.println("Если возраст человека " + peopleAge + " то ему нужно ходить в садик");
            } else if (peopleAge >= 7 && peopleAge <= 18) {
                System.out.println("Если возраст человека " + peopleAge + " то ему нужно ходить в школу");
            } else if (peopleAge > 18 && peopleAge <= 24) {
                System.out.println("Если возраст человека " + peopleAge + " то ему нужно ходить в универ");
            } else if (peopleAge > 24) {
                System.out.println("Если возраст человека " + peopleAge + " то ему нужно ходить на работу");
            }


            // task2
            int childrenAge = 4;
            if (childrenAge < 5) {
                System.out.println("ребенок не может кататься на атракционе");
            } else if (childrenAge < 14) {
                System.out.println("Ребенок может кататься только в сопровождении взрослого");
            } else {
                System.out.println("Ребенок может каться без взрослого");
            }

            // task3
            int one = 10;
            int two = 8;
            int three = 3;
            if (one > two) {
                if (one >= three) {
                    System.out.println(" Максимальное число " + one);
                } else {
                    System.out.println("большее число " + three);
                }
            } else if (two > one) {
                if (two >= three) {
                    System.out.println(" максимальное число " + two);
                } else {
                    System.out.println("Максимальное число " + three);
                }
            } else {
                if (one > three) {
                    System.out.println("Максимальное число " + one);
                } else if (three > one) {
                    System.out.println("Максимальное число " + three);
                } else {
                    System.out.println("Все 3 числа равны");
                }
            }
        }
    }


             }











