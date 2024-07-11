package com.appfab.facematchlive;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.b;
import com.karumi.dexter.R;
import java.util.ArrayList;
import java.util.List;
import x1.d;
import x1.f;
import x1.h;
import x1.j;
import x1.l;
import x1.n;
import x1.p;
import x1.r;
import x1.t;

public class DataBinderMapperImpl extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f2217a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        f2217a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_custom_ad, 1);
        sparseIntArray.put(R.layout.activity_image_zoom, 2);
        sparseIntArray.put(R.layout.activity_main, 3);
        sparseIntArray.put(R.layout.activity_selector, 4);
        sparseIntArray.put(R.layout.activity_splash, 5);
        sparseIntArray.put(R.layout.bottom_sheet_limit, 6);
        sparseIntArray.put(R.layout.include_menu_main, 7);
        sparseIntArray.put(R.layout.item_custom_ad, 8);
        sparseIntArray.put(R.layout.item_expander, 9);
        sparseIntArray.put(R.layout.item_faces, 10);
    }

    public final List<b> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public final ViewDataBinding b(View view, int i10) {
        int i11 = f2217a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i11) {
                case 1:
                    if ("layout/activity_custom_ad_0".equals(tag)) {
                        return new x1.b(view);
                    }
                    throw new IllegalArgumentException("The tag for activity_custom_ad is invalid. Received: " + tag);
                case 2:
                    if ("layout/activity_image_zoom_0".equals(tag)) {
                        return new d(view);
                    }
                    throw new IllegalArgumentException("The tag for activity_image_zoom is invalid. Received: " + tag);
                case 3:
                    if ("layout/activity_main_0".equals(tag)) {
                        return new f(view);
                    }
                    throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
                case 4:
                    if ("layout/activity_selector_0".equals(tag)) {
                        return new h(view);
                    }
                    throw new IllegalArgumentException("The tag for activity_selector is invalid. Received: " + tag);
                case 5:
                    if ("layout/activity_splash_0".equals(tag)) {
                        return new j(view);
                    }
                    throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
                case 6:
                    if ("layout/bottom_sheet_limit_0".equals(tag)) {
                        return new l(view);
                    }
                    throw new IllegalArgumentException("The tag for bottom_sheet_limit is invalid. Received: " + tag);
                case 7:
                    if ("layout/include_menu_main_0".equals(tag)) {
                        return new n(view);
                    }
                    throw new IllegalArgumentException("The tag for include_menu_main is invalid. Received: " + tag);
                case 8:
                    if ("layout/item_custom_ad_0".equals(tag)) {
                        return new p(view);
                    }
                    throw new IllegalArgumentException("The tag for item_custom_ad is invalid. Received: " + tag);
                case 9:
                    if ("layout/item_expander_0".equals(tag)) {
                        return new r(view);
                    }
                    throw new IllegalArgumentException("The tag for item_expander is invalid. Received: " + tag);
                case 10:
                    if ("layout/item_faces_0".equals(tag)) {
                        return new t(view);
                    }
                    throw new IllegalArgumentException("The tag for item_faces is invalid. Received: " + tag);
                default:
                    return null;
            }
        } else {
            throw new RuntimeException("view must have a tag");
        }
    }

    public final ViewDataBinding c(View[] viewArr, int i10) {
        if (viewArr.length == 0 || f2217a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
