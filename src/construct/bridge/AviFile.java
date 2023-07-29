/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.bridge;

/**
 * @author all
 * @since 2023/7/20 16:52
 */

public class AviFile implements VideoFile {

    /**
     * 解码
     *
     * @param fileName 文件名
     */
    @Override
    public void decode(String fileName) {
        System.out.println("decode avi file: " + fileName);
    }
}
