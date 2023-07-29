package construct.adapter.objAdapter;

/**
 * @author all
 * @since 2023/7/19 16:17
 */

public class Computer {

    public String readSD(SDCard sdCard) {
        return sdCard == null ? "sd card is down." : sdCard.read();
    }
}
