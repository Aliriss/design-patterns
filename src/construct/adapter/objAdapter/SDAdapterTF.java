package construct.adapter.objAdapter;



/**
 * @author all
 * @since 2023/7/19 16:23
 */

public class SDAdapterTF implements SDCard {

    private final TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    /**
     * 读数据
     *
     * @return String
     */
    @Override
    public String read() {
        return tfCard.read();
    }

    /**
     * 写数据
     *
     * @param value value
     */
    @Override
    public void write(String value) {
        tfCard.write(value);
    }
}
