package com.othershe.combinebitmap.region;

import android.graphics.Region;

public class BaseRegionManager implements  IRegionManager {
    @Override
    public Region[] calculateRegion(int size, int subSize, int gap, int count) {
        return new Region[0];
    }
}
