/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.bridge;

/**
 * 抽象操作系统类，抽象化角色
 * @author all
 * @since 2023/7/20 16:55
 */

public abstract class OperatingSystem {
    protected VideoFile videoFile;
    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    /**
     * 播放
     * @param fileName 文件名
     */
    public abstract void play(String fileName);

}
