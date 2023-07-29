/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.bridge;

/**
 * @author all
 * @since 2023/7/20 17:03
 */

public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    /**
     * 播放
     *
     * @param fileName 文件名
     */
    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
