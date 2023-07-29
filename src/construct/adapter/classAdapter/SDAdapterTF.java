package construct.adapter.classAdapter;

/**
 * @author all
 * @since 2023/7/19 16:23
 */

public class SDAdapterTF extends TFCardImpl implements SDCard{
    /**
     * 读数据
     *
     * @return String
     */
    @Override
    public String read() {
        return super.read();
    }

    /**
     * 写数据
     *
     * @param value value
     */
    @Override
    public void write(String value) {
        super.write(value);
    }
}
