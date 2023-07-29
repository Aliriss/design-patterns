package construct.adapter.classAdapter;

/**
 * @author all
 * @since 2023/7/19 16:18
 */

public interface TFCard {
    /**
     * 读数据
     * @return String
     */
    String read();

    /**
     * 写数据
     * @param value value
     */
    void write(String value);
}
