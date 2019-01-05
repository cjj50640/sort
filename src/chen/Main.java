package chen;

import org.junit.Test;

import java.util.Date;

import static chen.BubbleSort.bubbleSort;
import static chen.QuickSort.quickSort;
import static chen.SelectSort.selectSort;

/**
 * @author 陈简君
 * @date 2019/1/5 15:06
 */
public class Main {

    private static final int length = 20000;

    @Test
    public void testBubbleSort(){
        int[] numbers = initArray();
        System.out.print("排序前：");
        print(numbers);
        bubbleSort(numbers);
        System.out.print("冒泡排序后：");
        print(numbers);
    }

    @Test
    public void testQuickSort(){
        int[] numbers = initArray();
        System.out.print("排序前：");
        print(numbers);
        quickSort(numbers);
        System.out.print("快速排序后：");
        print(numbers);
    }

    @Test
    public void testSelectSort(){
        int[] numbers = initArray();
        System.out.print("排序前：");
        print(numbers);
        selectSort(numbers);
        System.out.print("选择排序后：");
        print(numbers);
    }

    private static int[] initArray(){
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) Math.round(Math.random() * 1000);
        }
        return numbers;
    }

    private static void print(int[] numbers){
        for (int numbs: numbers){
            System.out.print(numbs + " ");
        }
        System.out.println();
    }
}
