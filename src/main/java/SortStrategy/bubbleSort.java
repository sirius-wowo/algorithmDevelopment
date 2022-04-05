package SortStrategy;

public class bubbleSort
{
    public static void main(String[] args)
    {
        bubbleSort bs = new bubbleSort();
        System.out.println("***** 排序开始 *****");

        Integer[] intArray = {6, 5, 9, 7, 2, 8};
        // 排序前数据展示
        System.out.print("排序前的数组为:");
        bs.showData(intArray);

        // 排序
        // bs.bubbleSortMethod(intArray);
        bs.bubbleSortMethodOpt(intArray);


        // 排序后数据展示
        System.out.print("排序后的数组为:");
        bs.showData(intArray);

    }

    public void showData(Integer[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public void bubbleSortMethod(Integer[] arr)
    {
        int i, j, tmp;
        for(i = arr.length - 1; i > 0; i--)
        {
            for(j = 0; j < i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public void bubbleSortMethodOpt(Integer[] arr)
    {
        int i, j, tmp;
        boolean isExchange = false;
        for(i = arr.length - 1; i > 0; i--)
        {
            for(j = 0; j < i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    isExchange = true;
                }
                if(!isExchange){break;}
            }
        }

    }
}
