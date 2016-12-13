import java.lang.Math;
import java.lang.StringBuffer;

public class TArray {
    String task = "Дан целочисленный массив размера N=20. Вывести вначале все содержащиеся в данном массиве "
            + "четные числа в порядке возрастания их индексов, а затем - все нечетные числа в порядке убывания их индексов";
    int [] array = new int [20];
    String first_sentence;
    String second_sentence;
    String third_sentence;
    String reverce = new StringBuffer(task).reverse().toString();

    void Show_task(){
        first_sentence = task.substring(0,72);
        second_sentence = task.substring(72,139);
        third_sentence = task.substring(139,196);
        System.out.println(first_sentence);
        System.out.println(second_sentence);
        System.out.println(third_sentence);
        System.out.println("The length of string: " + task.length());
        System.out.println("The word position is " + task.indexOf("четные"));
        System.out.println(reverce);

    }
    void Initialization(){
        System.out.println("\nArray:");
        for(int i = 0; i<20; i++){
            array[i] = (int)(Math.random() * 100);
        }
    }
    void Show_array(){
        for(int i=0;i<20;i++){
            System.out.print(array[i] + " ");
        }
    }
    void Solution(){
        System.out.print("\nЧетные ");
        for(int i = 0; i < 20; i++){
            if(array[i]% 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.print("\nНечетные ");
        for(int i = 19; i >= 0; i--){
            if(array[i] % 2 !=0){
                System.out.print(array[i] + " ");
            }
        }
    }


}