package UnionSet;
import java.util.*;

public class UnionSet
{
    // 类成员
    ArrayList<Integer> dataArray = null;

    // 并查集元素初始化
    public UnionSet(int n)
    {
        dataArray = new ArrayList<>(n+1);
        for(int i = 0; i<=n; i++) {
            dataArray.add(i, i);
        }
    }

    // 并查集查找
    int findAncestor(int k)
    {
        int thisAncestor = dataArray.get(k);
        if(k != thisAncestor)
        {
            dataArray.set(k, findAncestor(thisAncestor));
        }
        return thisAncestor;
    }

    // 合并
    void unionAncestor(int elementA, int elementB)
    {
        int ancestorA = findAncestor(elementA);
        int ancestorB = findAncestor(elementB);
        if(ancestorA < ancestorB)
        {
            dataArray.set(elementB, ancestorA);
        }else
        {
            dataArray.set(elementA, ancestorB);
        }

    }

    //测试
    public static void main(String[] args)
    {

        UnionSet us = new UnionSet(4);

        us.unionAncestor(1,3);
        us.unionAncestor(4,3);

        System.out.println(us.dataArray);

//        ArrayList a3 = new ArrayList();
//        a3.add(4);
//        a3.add(3);

        System.out.println(123);
    }
}
