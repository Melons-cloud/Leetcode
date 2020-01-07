package leetcode;

public class TestArray {

    public static void main(String[] args) {

        int[] arr1=new int[3];

        int length1=arr1.length;
        System.out.println("arr1's length:"+length1);

        //访问元素
        int element0 = arr1[0];
        System.out.println("element0:"+element0);
        //赋值
        arr1[0]=99;

        System.out.println("element0:"+arr1[0]);
    }
}
