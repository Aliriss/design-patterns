/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.bridge;

/**
 * @author all
 * @since 2023/7/20 17:04
 */

public class Client {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new Mac(new AviFile());
        operatingSystem.play("haha.avi");
        operatingSystem = new Windows(new RmvbFile());
        operatingSystem.play("zhanlang.rmvb");
    }
}
