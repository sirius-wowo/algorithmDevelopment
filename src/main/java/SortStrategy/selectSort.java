package SortStrategy;

public class selectSort {
    public static void main(String[] args)
    {
        selectSort ss = new selectSort();
        System.out.println("***** 排序开始 *****");

        Integer[] intArray = {9, 7, 5, 3, 4, 6};
        System.out.print("排序前的数组展示:");
        ss.showData(intArray);

        ss.selectSortMethod(intArray);

        System.out.print("排序后的数组展示:");
        ss.showData(intArray);
    }

    // 数组展示
    public void showData(Integer[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    // 选择排序(从小到大排序)
    public void selectSortMethod(Integer[] arr)
    {
        // sPos 表示临时存储最小元素的位置
        int i, j, tmp, sPos;
        for(i = 0; i < arr.length - 1; i++)
        {
            sPos = i;
            for(j = i + 1; j < arr.length; j++)
            {
                if(arr[sPos] > arr[j])
                {
                    sPos = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[sPos];
            arr[sPos] = tmp;
            System.out.print("第" + i + "轮的排序结果为:");
            for(int k = 0; k < arr.length; k++)
            {
                System.out.print(" " + arr[k]);
            }
            System.out.println();
        }
    }

}
