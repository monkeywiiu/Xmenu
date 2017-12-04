package com.example.zmenu;

import java.util.List;

/**
 * Created by Administrator on 2017/12/1 0001.
 */

public class PUtils {

    public List<Integer> imagelist;
    public List<Integer> colorlist;
    public int margin;
    private static PUtils instance = new PUtils();

    public static PUtils getInstance() {
        if (instance != null) {
            synchronized (PUtils.class) {
                if (instance != null) {
                    return instance;
                }
            }
        }

        return null;
    }

    public  void setImagesAndColors(List<Integer> imagelist , List<Integer> colorlist) {
        instance.imagelist = imagelist;
        instance.colorlist = colorlist;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public static List<Integer> getImages() {
        return getInstance().imagelist;
    }

    public static List<Integer> getColors() {
        return getInstance().colorlist;
    }

    public int getMargin() {
        return margin;
    }
}
