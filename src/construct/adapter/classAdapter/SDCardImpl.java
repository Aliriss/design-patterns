package construct.adapter.classAdapter;

/**
 * @author all
 * @since 2023/7/19 16:22
 */

public class SDCardImpl implements SDCard{
    /**
     * 读数据
     *
     * @return String
     */
    @Override
    public String read() {
        return "SD card content.";
    }

    /**
     * 写数据
     *
     * @param value value
     */
    @Override
    public void write(String value) {
        System.out.println("SD card write: " + value);
    }
}
