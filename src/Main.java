import java.util.Arrays;

public class Main {

    public static void main(String[] args){
int[] myArray = {2,5,6,8,12,45};
        System.out.println(Arrays.toString(myArray));
reverse(myArray);
        System.out.println(Arrays.toString(myArray));


    }

    public static void reverse(int[] array){
int[] reverseArray = new int[array.length];
        for(int i = 0; i < array.length; i++){

reverseArray[i] = array[array.length - i - 1];

}
        for(int i = 0; i < array.length; i++){

            array[i] = reverseArray[i];

        }



//        for(int i = 0; i < array.length/2; i++){
//
//array[i] = array[array.length - i - 1];
//
//}

    }
}
