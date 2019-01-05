package chen;

/**
 * @author 陈简君
 * @date 2019/1/5 16:55
 */
class SelectSort {

    static void selectSort(int[] numbers){
        int size = numbers.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            int k = i;
            for (int j = size - 1; j > i; j--) {
                if (numbers[j] < numbers[k]){
                    k = j;
                }
            }
            temp = numbers[k];
            numbers[k] = numbers[i];
            numbers[i] = temp;
        }
    }
}
