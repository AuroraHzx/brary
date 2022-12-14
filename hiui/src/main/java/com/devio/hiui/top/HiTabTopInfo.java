package com.devio.hiui.top;

import android.graphics.Bitmap;
import android.graphics.Color;

import androidx.fragment.app.Fragment;

import com.devio.hiui.tab.bottom.HiTabBottomInfo;

public class HiTabTopInfo<Color> {
    public enum TabType {
        BITMAP, TEXT
    }

    public Class<? extends Fragment> fragment;
    public String name;
    public Bitmap defaultBitmap;
    public Bitmap selectedBitmap;

    public Color defaultColor;
    public Color tintColor;
    public HiTabTopInfo.TabType tabType;

    public HiTabTopInfo(String name, Bitmap defaultBitmap, Bitmap selectedBitmap) {
        this.name = name;
        this.defaultBitmap = defaultBitmap;
        this.selectedBitmap = selectedBitmap;
        this.tabType = HiTabTopInfo.TabType.BITMAP;
    }

    public HiTabTopInfo(String name, Color defaultColor, Color tintColor) {
        this.name = name;
        this.defaultColor = defaultColor;
        this.tintColor = tintColor;
        this.tabType = HiTabTopInfo.TabType.TEXT;
    }
}
