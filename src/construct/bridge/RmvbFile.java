/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.bridge;

/**
 * @author all
 * @since 2023/7/20 16:54
 */

public class RmvbFile implements VideoFile {

    /**
     * 解码
     *
     * @param fileName 文件名
     */
    @Override
    public void decode(String fileName) {
        System.out.println("decode rmvb file: " + fileName);
    }
}
