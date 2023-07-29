package construct.adapter.objAdapter;

/**
 * @author all
 * @since 2023/7/19 16:21
 */

public interface SDCard {
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
