package mistra.com.clone;

/**
 * @Author: WangRui
 * @Date: 2018-09-17
 * Time: 上午10:35
 * Description:
 */
public class ShadowCloneB implements Cloneable {

    public int aInt;
    public DeepCloneA unCA = new DeepCloneA(111);

    @Override
    public Object clone() {
        ShadowCloneB o = null;
        try {
            o = (ShadowCloneB) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
