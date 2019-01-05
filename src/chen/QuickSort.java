package chen;

/**
 * @author 陈简君
 * @date 2019/1/5 15:15
 */
class QuickSort {

    static void quickSort(int[] numbers){
        sort(numbers, 0, numbers.length - 1);
    }

    private static void sort(int[] numbers, int low, int high){
        if (low < high){
            int middle = getMiddle(numbers, low, high);
            sort(numbers, low, middle - 1);
            sort(numbers, middle + 1, high);
        }
    }

    /**
     * 查找出中轴（默认是最低位low）的在numbers数组排序后所在位置
     *
     * @param numbers 带查找数组
     * @param low   开始位置
     * @param high  结束位置
     * @return  中轴所在位置
     */
    private static int getMiddle(int[] numbers, int low, int high){

        int key = numbers[low];//基准元素，排序中会空出来一个位置
        while(low<high){
            while(low<high && numbers[high]>=key){//从high开始找比基准小的，与low换位置
                high--;
            }
            numbers[low]=numbers[high];
            while(low<high && numbers[low]<=key){//从low开始找比基准大,放到之前high空出来的位置上
                low++;
            }
            numbers[high]=numbers[low];
        }
        numbers[low]=key;//此时low=high 是基准元素的位置，也是空出来的那个位置
        return low;
    }

}
