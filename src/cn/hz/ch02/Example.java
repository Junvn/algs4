package cn.hz.ch02;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Classname Example
 * @Description 排序算法类的模板
 * @Date 19-6-23 上午10:55
 * @Created by janvn
 */
public class Example {

    public static void sort(Comparable[] a){
        // 具体算法实现
        // todo
// 算法2.1 选择排序
//        int N = a.length;
//        for (int i=0;i<N;i++){
//            int min=i;
//            for(int j=i+1;j<N;j++){
//                if(less(a[j],a[min]))
//                    min = j;
//            exch(a,i,min);
//            }
//        }
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a){
        // 在单行中打印数组
        for(int i=0;i<a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a){
        // 测试数组元素是否有序
        for (int i=0; i<a.length; i++)
            if (less(a[i],a[i-1]))
                return false;
            return true;
    }

    public static void main(String[] args) {
        // 从标准输入读取字符串，将它们排序并输出
        String[] a= In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }

}


// 测试运行方式：
// 1.先编译
// ../algs4/src/cn/hz/ch02$ javac Example.java

// 2.运行
// ../algs4/src$ java cn.hz.ch02.Example < ../files/algs4-data/tiny.txt
// A E E L M O P R S T X

// ../algs4/src$ java cn.hz.ch02.Example < ../files/algs4-data/words3.txt
// all bed bug dad dim dug egg fee few for gig hut ilk jam jay jot joy men nob now owl rap sky sob tag tar tap tip wad was wee yes yet bad zoo













