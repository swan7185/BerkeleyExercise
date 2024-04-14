import H0B.Dessert;
import H0B.MapExercise;
import H0B.TaskTwoListExercises;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TaskTwoListExercises taskTwoListExercises = new TaskTwoListExercises();
        //Task1
        System.out.println(taskTwoListExercises.sum(Arrays.asList(2,55,8,14,33,7,7,0)));
        //Task2
        System.out.println(taskTwoListExercises.evens(Arrays.asList(8,23,56,14,9,0,44)));
        //task3
        System.out.println(taskTwoListExercises.common(Arrays.asList(19,44,12,14,33,7,17,0), Arrays.asList(17,23,56,14,9,0,44)));
        //task4
        System.out.println(taskTwoListExercises.countOccurrenceOfChar(Arrays.asList("wang","sheng","nan","wen"),'n'));

        MapExercise mapExercise = new MapExercise();
        //task1
        System.out.println(mapExercise.letterToNum());
        //task2
        System.out.println(mapExercise.squares(Arrays.asList(3,8,12,9,0,6,16)));
        //task3
        System.out.println(mapExercise.countWords(Arrays.asList("wang","sheng","nan","ma","hao","jie")));

        Dessert dessert1 = new Dessert(1,2);
        dessert1.printDessert();
        Dessert dessert2 = new Dessert(4,7);
        dessert2.printDessert();
    }
}