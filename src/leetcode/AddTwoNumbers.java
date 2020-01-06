package leetcode;

import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode l1=new ListNode(1);
        ListNode l2= new ListNode(2);
        addTwoNumbers(l1,l2);

    }

    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){

        ListNode dummy = new ListNode(0);
        int sum=0;
        ListNode cur=dummy;
        ListNode p1=l1,p2=l2;
        while (p1!=null || p2!=null){

            if (p1!=null){

                sum+=p1.val;
                p1=p1.next;
            }
            if (p2!=null){

                sum+=p2.val;
                p2=p2.next;
            }

            cur.next=new ListNode(sum %10);
            sum /=10;
            cur=cur.next;

        }
        System.out.println(sum);

        if (sum==1){

            cur.next=new ListNode(1);
        }

        return dummy.next;

    }




}
