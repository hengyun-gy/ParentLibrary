package com.parent.library.utils;

import java.util.List;

/**
 * Created by 梁玉涛 on 2018/1/2.
 */

public class LibListUtil {
    /**
     * @param list
     * @return
     */
    public static boolean isNotEmpty(List list) {
        return list != null && list.size() > 0;
    }
}
