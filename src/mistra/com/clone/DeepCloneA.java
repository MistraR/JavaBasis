package mistra.com.clone;

/**
 * @Author: WangRui
 * @Date: 2018-09-17
 * Time: 上午10:33
 * Description: 深度clone
 */
public class DeepCloneA implements Cloneable {

    private int i;

    public DeepCloneA(int ii) {
        i = ii;
    }

    public void doublevalue() {
        i *= 2;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }

    @Override
    public Object clone() {
        DeepCloneA o = null;
        try {
            o = (DeepCloneA) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
