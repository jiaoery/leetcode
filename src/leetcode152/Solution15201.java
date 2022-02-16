package leetcode152;

public class Solution15201 {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node cur  = head;
        while (cur!=null){
            Node next = cur.next;
            //child结点的最后一个结点
            Node last =null;
            if(cur.child!=null){//有child结点
                cur.next = cur.child;
                cur.next.prev = cur;
                Node child =  flatten(cur.child);
                last = getLast(child);
                if(next!=null){
                    last.next = next;
                    next.prev = last;
                }
                cur.child = null;
                cur = next;
            }else {//没有child 结点
                cur = cur.next;
            }
        }
        return head;
    }

    public Node getLast(Node node){
        while (node.next!=null){
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);

        node1.next = node2;
        node2.prev = node1;

        node2.next = node3;
        node3.prev = node2;

        node3.next = node4;
        node4.prev = node3;
        node3.child = node7;

        node4.next = node5;
        node5.prev = node4;

        node5.next = node6;
        node6.prev = node5;

        node7.next = node8;
        node8.prev = node7;

        node8.next = node9;
        node9.prev = node8;
        node8.child = node11;

        node9.next = node10;
        node10.prev = node9;

        node11.next = node12;
        node12.prev = node11;

        Solution15201 solution = new Solution15201();

        Node res = solution.flatten(node1);
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }

    }
}
