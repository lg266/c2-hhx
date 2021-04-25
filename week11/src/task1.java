import java.util.Stack;

/**
 * @ClassName task1
 * @Description 在lc上刷到过了，就直接扒下来了
 * @Author bunny
 * @Date 2021/4/25 10:31
 * @Version 1.0
 **/

class ListNode {
   int val;
    ListNode next;
   ListNode() {}
    ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class task1 {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack=new Stack<ListNode>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        if(stack.empty())return null;
        ListNode node=stack.pop();
        ListNode newhead=node;
        while(!stack.empty()){
            node.next=stack.pop();
            node=node.next;
        }
        node.next=null;
        return newhead;
    }
}