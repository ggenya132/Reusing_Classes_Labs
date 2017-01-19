import java.util.ArrayList;
import  java.util.Arrays;

/**
 * Created by eugenevendensky on 1/18/17.
 */
public class CustomList extends ArrayList {

    public int[] rotateOnce(int[] arr) {

        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i ++){
        int last = arr[arr.length - i -1];
        newArr[i] = last;

        }
        System.out.println(Arrays.toString(newArr));

        return  arr;
    }

}
