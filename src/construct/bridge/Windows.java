/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.bridge;

/**
 * 扩展抽象化角色
 * @author all
 * @since 2023/7/20 17:02
 */

public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile) {
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
