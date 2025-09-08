public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int age = 21;
        boolean isAge = age >= 18;
        if (isAge) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Task 2");
        int grade = 3;
        boolean isGrade = grade < 5;

        if (isGrade) {
            System.out.println("На улице " + grade + " градуса, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + grade + " градусов, можно идти без шапки.");
        }

        System.out.println("Task 3");
        int speed = 50;
        boolean isSpeed = speed > 60;

        if (isSpeed) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }

        System.out.println("Task 4");
        int ageMan = 17;

        if (ageMan >= 2 && ageMan <= 6) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад.");
        } else {
            if (ageMan >= 7 && ageMan <= 17) {
                System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу.");
            } else {
                if (ageMan >= 18 && ageMan <= 24) {
                    System.out.println("Если возраст человека равен " + ageMan + ", то его место в университете.");
                } else {
                    System.out.println("Если возраст человека равен " + ageMan + ", то ему пора ходить на работу.");
                }
            }
        }

        System.out.println("Task 5");
        int ageChild = 7;

        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он не может кататься на аттракционе.");
        } else {
            if (ageChild >= 5 && ageChild < 14) {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            } else {
                if (ageChild > 14) {
                    System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься без сопровождения взрослого.");
                }
            }
        }

        System.out.println("Task 6");
        int countPlaceAll = 102;
        int countPlaceSeat = 60;
        int countMan = 75;

        if (countMan > countPlaceAll) {
            System.out.println("В вагоне мест больше нет.");
        } else {
            if (countMan > countPlaceSeat) {
                System.out.println("В вагоне остались только стоячие места.");
            } else {
                System.out.println("В вагоне еще есть сидячие места.");
            }
        }

        System.out.println("Task 7");
        int one = 25;
        int two = 14;
        int three = 55;

        if (one < two) {
            if (two < three) {
                System.out.println("Большее число " + three);
            } else {
                System.out.println("Большее число " + two);
            }
        } else {
            if (one < three) {
                System.out.println("Большее число " + three);
            } else {
                System.out.println("Большее число " + one);
            }
        }
    }
}