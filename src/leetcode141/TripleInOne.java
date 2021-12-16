package leetcode141;

/**
 * ClassName: TripleInOne<br/>
 * Description: TODO Description. <br/>
 * date: 2021/12/13 15:41<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class TripleInOne {
    private Integer[] values;

    private Integer[] indexes;
    public TripleInOne(int stackSize) {
        values =  new Integer[3*stackSize];
        indexes = new Integer[3];
    }

    public void push(int stackNum, int value) {
        int index = indexes[stackNum] !=null?indexes[stackNum]+3 :stackNum;
        if(index < values.length){
            values[index] = value;
            indexes[stackNum] = index;
        }
    }

    public int pop(int stackNum) {
        if(indexes[stackNum]!=null){
            int index = indexes[stackNum];
            int num = values[index];
            values[index] = null;
            indexes[stackNum] = indexes[stackNum]<3?null:indexes[stackNum]-3;
            return num;
        }
        return -1;
    }

    public int peek(int stackNum) {
        return isEmpty(stackNum) ? -1 : values[indexes[stackNum]];
    }

    public boolean isEmpty(int stackNum) {
        return indexes[stackNum]==null;
    }
}
