package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

public final class e extends BaseAdapter {

    /* renamed from: o  reason: collision with root package name */
    public final f f307o;

    /* renamed from: p  reason: collision with root package name */
    public int f308p = -1;

    /* renamed from: q  reason: collision with root package name */
    public boolean f309q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f310r;

    /* renamed from: s  reason: collision with root package name */
    public final LayoutInflater f311s;

    /* renamed from: t  reason: collision with root package name */
    public final int f312t;

    public e(f fVar, LayoutInflater layoutInflater, boolean z, int i10) {
        this.f310r = z;
        this.f311s = layoutInflater;
        this.f307o = fVar;
        this.f312t = i10;
        b();
    }

    public final void b() {
        f fVar = this.f307o;
        h hVar = fVar.f332v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.f322j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == hVar) {
                    this.f308p = i10;
                    return;
                }
            }
        }
        this.f308p = -1;
    }

    /* renamed from: c */
    public final h getItem(int i10) {
        ArrayList<h> arrayList;
        boolean z = this.f310r;
        f fVar = this.f307o;
        if (z) {
            fVar.i();
            arrayList = fVar.f322j;
        } else {
            arrayList = fVar.l();
        }
        int i11 = this.f308p;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayList.get(i10);
    }

    public final int getCount() {
        ArrayList<h> arrayList;
        boolean z = this.f310r;
        f fVar = this.f307o;
        if (z) {
            fVar.i();
            arrayList = fVar.f322j;
        } else {
            arrayList = fVar.l();
        }
        int i10 = this.f308p;
        int size = arrayList.size();
        if (i10 < 0) {
            return size;
        }
        return size - 1;
    }

    public final long getItemId(int i10) {
        return (long) i10;
    }

    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z = false;
        if (view == null) {
            view = this.f311s.inflate(this.f312t, viewGroup, false);
        }
        int i12 = getItem(i10).f338b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f338b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f307o.m() && i12 != i11) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        k.a aVar = (k.a) view;
        if (this.f309q) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10));
        return view;
    }

    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
