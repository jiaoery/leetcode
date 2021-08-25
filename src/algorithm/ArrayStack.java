package algorithm;

/**
 * 用数组实现
 */
public class ArrayStack {
    private String[] items;
    private int count;
    private int n;

    public ArrayStack(int n){
        items = new String[n];
        this.count = 0;
        this.n = n;
    }

    public boolean push(String item){
        if(count==n){
            return false;
        }
        items[count]= item;
        count++;
        return true;
    }

    public String pop(){
        if(count == 0){
            return null;
        }
        count--;
        return items[count];
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(4);
        System.out.println("result is "+stack.push("jiaojiao"));
        System.out.println("result is " +stack.push("beibei"));
        System.out.println("result is " +stack.push("niuniu"));
        System.out.println("result is "+stack.push("heihei"));
        System.out.println("result is "+ stack.push("jiaery"));
        System.out.println("result is "+stack.push("stack"));


        System.out.println("pop is "+stack.pop());
        System.out.println("pop is "+stack.pop());
        System.out.println("pop is "+stack.pop());
    }

}
