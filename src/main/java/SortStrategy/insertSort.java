package SortStrategy;

public class insertSort {

    public static void main(String[] args) {
        System.out.println("***** 插入排序 *****");
        insertSort iis = new insertSort();
        Integer[] intArray = {55, 23, 87, 62, 16};

        System.out.print("排序前的数组展示:");
        iis.showData(intArray);

        iis.insertSortMethod(intArray);

        System.out.print("排序后的数组展示:");
        iis.showData(intArray);
    }

    public void showData(Integer[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public void insertSortMethod(Integer[] arr)
    {
        int i, j, tmp;

        for(i = 1; i < arr.length; i++)
        {
            tmp = arr[i];
            j = i-1;

            while(j >= 0 && arr[j] > tmp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = tmp;

            System.out.print("第" + i + "轮排序结果展示:");
            for(int k = 0; k <= i; k++)
            {
                System.out.print(" " + arr[k]);
            }
            System.out.println();
        }
    }

}
