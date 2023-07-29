package construct.adapter.classAdapter;

/**
 * @author all
 * @since 2023/7/19 16:19
 */

public class TFCardImpl implements TFCard {
    /**
     * 读数据
     *
     * @return String
     */
    @Override
    public String read() {
        return "TF card content.";
    }

    /**
     * 写数据
     *
     * @param value value
     */
    @Override
    public void write(String value) {
        System.out.println("TF card write: " + value);
    }
}
