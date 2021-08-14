package GraphSearch;

import java.util.ArrayList;
import java.util.List;

//https://blog.csdn.net/qq_41701956/article/details/99588446

public class GraphObject
{
    // 图的顶点数量
    int nodeNum;

    // 图的边数量
    int edgeNum;

    // 邻接链表 存储和对应点有连接关系的所有的边
    List[] adjacent;

    // 构造函数: 构造一个含有v个顶点的图
    GraphObject(int v)
    {
        //
        adjacent = new ArrayList[v];
        for(int i = 0; i < v; i++)
        {
            adjacent[i] = new ArrayList<Integer>();
        }
        this.nodeNum = v;
        this.edgeNum = 0;
    }

    // 返回顶点的数量
    public int getNodeNum()
    {
        return nodeNum;
    }

    // 返回边的数量
    public int getEdgeNum()
    {
        return edgeNum;
    }





}
