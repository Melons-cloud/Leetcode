package leetcode;

import java.util.HashMap;

public class TwoSum {


    public static int[] twoSum(int[] nums,int target){

        //数组为空，或者数组的长度小于2
        if (nums==null || nums.length<2){


            return new int[]{-1,-1};

        }

        int[] res=new int[]{-1,-1};

        //创建散列表，用于存储数组的值和索引
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<nums.length;i++){

            if (map.containsKey(target-nums[i])){

                res[0]=map.get(target-nums[i]);
                res[1]=i;
                break;
            }
            map.put(nums[i],i);


        }
        System.out.println(res);
        return res;
    }



    public static void main(String[] args) {


        int[] nums={2,7,11,15};
        twoSum(nums,9);


    }
}
