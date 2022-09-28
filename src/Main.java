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
        if (seatPlace >= 60) {
            System.out.println("Сидячих мест в вагоне нет");
        }
        if (seatPlace < 60) {
            System.out.println("В Вагоне есть сидячие места");
        }
        if (standPlace >= 42) {
            System.out.println("В вагоне стоячих мест нет");
        }
        if (standPlace < 42) {
            System.out.println("В Вагоне есть стоячие места");
        }
        if (allPlace >= 102) {
            System.out.println("В вагоне нет свободных мест");
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
        if (ageChild >= 7) {
            System.out.println("Ребенок учится в школе");
        } else {
            System.out.println("ребенок не учится в школе");
        }
        int ageMan = 18;
        if (ageMan >= 18) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }
        else {System.out.println("Человек еще не закончил школу");}

        int agePeople = 24;
        if (agePeople >= 24) {
            System.out.println("человек окончил универститет, может искать работу");
        }
        else {System.out.println("Человек не окончил универститет");
        }

        // task3
        int placeInVan = 102;
        int seating = 60;
        int standing = placeInVan - seating;
        if (placeInVan >= 102) {
            System.out.println("В вагоне нет мест");
        }
        else {
            System.out.println("В вагоне есть свободные места");
        }
        if (seating >= 60) {
            System.out.println("В вагоне нет сидячих мест");
        }
        else {
            System.out.println("В вагоне есть сидячие места");
        }
         if (standing >= 42) {
             System.out.println("В вагоне нет стоячих мест");
         }
         else {System.out.println("В вагоне есть свободные стоячие места");
        }

         // задание 3 task1
        int childAge = 5;
         if (childAge >= 2 && childAge <= 6) {
             System.out.println("Человек должен ходить в садик");
         }
         int manAge = 12;
         if ( manAge >= 7 && manAge <= 18) {
             System.out.println("Человек должен ходить в школу");
         }
         int peopleAge = 20;
         if (peopleAge >= 18 && peopleAge <= 24) {
             System.out.println("человек учится в универститете");
         }
         int oneAge = 25;
         if (oneAge <= 24) {
             System.out.println("Человек учится в универститете");
         }
         else {
             System.out.println("Человеку пора искать работу");
         }

         // task2
        int childrenAge = 4;
         if (childrenAge > 5) {
             System.out.println("ребенок может кататься на качелях");
         }
         else {
             System.out.println("Ребенок не может кататься на качелях");
         }
         if (childrenAge > 5 && childrenAge < 14) {
             System.out.println("Ребенок может кататься только в сопровождении взрослого");
         }
         if (childrenAge > 14) {
             System.out.println("Ребенок может каться без взрослого");
         }

         // task3
        int one = 10;
         int two = 8;
         int three = 3;
         if (one < 8 && one < 3) {
             System.out.println("меньше двух других чисел " + one);
         }
         else {System.out.println("большее число " + one);
         }



    }
        }




