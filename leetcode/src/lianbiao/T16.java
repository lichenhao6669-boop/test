package lianbiao;

//反转链表
//https://leetcode.cn/problems/reverse-linked-list/
//链表

/**给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
示例 1：

输入：head = [1,2,3,4,5]
输出：[5,4,3,2,1]
示例 2：


输入：head = [1,2]
输出：[2,1]
示例 3：

输入：head = []
输出：[]*/
public class T16 {
    public ListNode reverseList(ListNode head) {

          return reverseList2(head);
    }
    public static ListNode reverseList2(ListNode head) {
       if (head==null||head.next==null){
           return head;
       }
       ListNode newHead = reverseList2(head.next);
       head.next.next=head;
       head.next=null;
       return newHead;
    }
}
