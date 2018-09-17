package mistra.com.clone;

/**
 * @Author: WangRui
 * @Date: 2018-09-17
 * Time: 上午10:35
 * Description:
 */
public class DeepCloneB implements Cloneable {

    public int aInt;
    public DeepCloneA unCA = new DeepCloneA(111);

    @Override
    public Object clone() {
        DeepCloneB o = null;
        try {
            o = (DeepCloneB) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        o.unCA = (DeepCloneA) unCA.clone();
        return o;
    }
}
