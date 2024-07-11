package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.karumi.dexter.R;
import java.util.ArrayList;

public final class d implements j, AdapterView.OnItemClickListener {

    /* renamed from: o  reason: collision with root package name */
    public Context f299o;

    /* renamed from: p  reason: collision with root package name */
    public LayoutInflater f300p;

    /* renamed from: q  reason: collision with root package name */
    public f f301q;

    /* renamed from: r  reason: collision with root package name */
    public ExpandedMenuView f302r;

    /* renamed from: s  reason: collision with root package name */
    public j.a f303s;

    /* renamed from: t  reason: collision with root package name */
    public a f304t;

    public class a extends BaseAdapter {

        /* renamed from: o  reason: collision with root package name */
        public int f305o = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.f301q;
            h hVar = fVar.f332v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.f322j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == hVar) {
                        this.f305o = i10;
                        return;
                    }
                }
            }
            this.f305o = -1;
        }

        /* renamed from: c */
        public final h getItem(int i10) {
            d dVar = d.this;
            f fVar = dVar.f301q;
            fVar.i();
            ArrayList<h> arrayList = fVar.f322j;
            dVar.getClass();
            int i11 = i10 + 0;
            int i12 = this.f305o;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayList.get(i11);
        }

        public final int getCount() {
            d dVar = d.this;
            f fVar = dVar.f301q;
            fVar.i();
            int size = fVar.f322j.size();
            dVar.getClass();
            int i10 = size + 0;
            if (this.f305o < 0) {
                return i10;
            }
            return i10 - 1;
        }

        public final long getItemId(int i10) {
            return (long) i10;
        }

        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.f300p.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).c(getItem(i10));
            return view;
        }

        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.f299o = context;
        this.f300p = LayoutInflater.from(context);
    }

    public final void b(f fVar, boolean z) {
        j.a aVar = this.f303s;
        if (aVar != null) {
            aVar.b(fVar, z);
        }
    }

    public final boolean d(h hVar) {
        return false;
    }

    public final void e(Context context, f fVar) {
        if (this.f299o != null) {
            this.f299o = context;
            if (this.f300p == null) {
                this.f300p = LayoutInflater.from(context);
            }
        }
        this.f301q = fVar;
        a aVar = this.f304t;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final void f() {
        a aVar = this.f304t;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final boolean h(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g(mVar);
        Context context = mVar.f314a;
        b.a aVar = new b.a(context);
        AlertController.b bVar = aVar.f257a;
        d dVar = new d(bVar.f238a);
        gVar.f336q = dVar;
        dVar.f303s = gVar;
        mVar.b(dVar, context);
        d dVar2 = gVar.f336q;
        if (dVar2.f304t == null) {
            dVar2.f304t = new a();
        }
        bVar.f248m = dVar2.f304t;
        bVar.f249n = gVar;
        View view = mVar.f326o;
        if (view != null) {
            bVar.f241e = view;
        } else {
            bVar.f240c = mVar.f325n;
            bVar.d = mVar.f324m;
        }
        bVar.l = gVar;
        b a10 = aVar.a();
        gVar.f335p = a10;
        a10.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f335p.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f335p.show();
        j.a aVar2 = this.f303s;
        if (aVar2 == null) {
            return true;
        }
        aVar2.c(mVar);
        return true;
    }

    public final boolean i() {
        return false;
    }

    public final void j(j.a aVar) {
        this.f303s = aVar;
    }

    public final boolean k(h hVar) {
        return false;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j8) {
        this.f301q.q(this.f304t.getItem(i10), this, 0);
    }
}
