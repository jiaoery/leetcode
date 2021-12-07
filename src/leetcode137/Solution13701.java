package leetcode137;

public class Solution13701 {
    public static void main(String[] args) {
        MinStack minStack= new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("min:"+minStack.getMin());
        System.out.println("pop");
        minStack.pop();
        System.out.println("top:"+minStack.top());
        System.out.println("min:"+minStack.getMin());

    }
}
