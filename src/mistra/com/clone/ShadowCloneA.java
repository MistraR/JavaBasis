package mistra.com.clone;

/**
 * @Author: WangRui
 * @Date: 2018-09-17
 * Time: 上午10:33
 * Description: 深度clone
 */
public class ShadowCloneA   {

    private int i;

    public ShadowCloneA(int ii) {
        i = ii;
    }

    public void doublevalue() {
        i *= 2;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }


}
