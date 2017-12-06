package com.example.zmenu;

import java.util.List;

/**
 * Created by Administrator on 2017/12/1 0001.
 */

public class PUtils {

    public List<Integer> imagelist;
    public List<Integer> colorlist;
    public int marginRight, marginBottom;
    public boolean isVisible;
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

    public void setMargin(int marginRight, int marginBottom) {
        instance.marginRight = marginRight;
        instance.marginBottom = marginBottom;
    }

    public void setVisible(boolean isVisible) {
        getInstance().isVisible = isVisible;
    }

    public boolean getVisible() {
        return getInstance().isVisible;
    }
    public static List<Integer> getImages() {
        return getInstance().imagelist;
    }

    public static List<Integer> getColors() {
        return getInstance().colorlist;
    }

    public int getMarginRight() {
        return getInstance().marginRight;
    }

    public int getMarginBottom(){
        return getInstance().marginBottom;
    }
}
