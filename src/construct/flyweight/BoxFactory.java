/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.flyweight;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author all
 * @since 2023/7/22 12:58
 */

public class BoxFactory {
    private static final BoxFactory INSTANCE = new BoxFactory();
    private final Map<String, Box> boxMap;

    private BoxFactory() {
        boxMap = new LinkedHashMap<>();
        boxMap.put("O", new OBox());
        boxMap.put("I", new IBox());
        boxMap.put("L", new LBox());
    }
    public static BoxFactory getInstance() {
        return INSTANCE;
    }

    /**
     *
     * @param name name
     * @return Box
     */
    public Box getBox(String name) {
        return boxMap.get(name);
    }
}
