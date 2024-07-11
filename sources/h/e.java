package h;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import d0.b;
import h.a;
import i.c;
import java.util.ArrayList;
import n.i;

public final class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5068a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5069b;

    public static class a implements a.C0073a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f5070a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f5071b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f5072c = new ArrayList<>();
        public final i<Menu, Menu> d = new i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f5071b = context;
            this.f5070a = callback;
        }

        public final boolean a(a aVar, MenuItem menuItem) {
            return this.f5070a.onActionItemClicked(e(aVar), new c(this.f5071b, (b) menuItem));
        }

        public final boolean b(a aVar, f fVar) {
            e e10 = e(aVar);
            i<Menu, Menu> iVar = this.d;
            Menu orDefault = iVar.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new i.e(this.f5071b, fVar);
                iVar.put(fVar, orDefault);
            }
            return this.f5070a.onPrepareActionMode(e10, orDefault);
        }

        public final void c(a aVar) {
            this.f5070a.onDestroyActionMode(e(aVar));
        }

        public final boolean d(a aVar, f fVar) {
            e e10 = e(aVar);
            i<Menu, Menu> iVar = this.d;
            Menu orDefault = iVar.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new i.e(this.f5071b, fVar);
                iVar.put(fVar, orDefault);
            }
            return this.f5070a.onCreateActionMode(e10, orDefault);
        }

        public final e e(a aVar) {
            ArrayList<e> arrayList = this.f5072c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = arrayList.get(i10);
                if (eVar != null && eVar.f5069b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f5071b, aVar);
            arrayList.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, a aVar) {
        this.f5068a = context;
        this.f5069b = aVar;
    }

    public final void finish() {
        this.f5069b.c();
    }

    public final View getCustomView() {
        return this.f5069b.d();
    }

    public final Menu getMenu() {
        return new i.e(this.f5068a, this.f5069b.e());
    }

    public final MenuInflater getMenuInflater() {
        return this.f5069b.f();
    }

    public final CharSequence getSubtitle() {
        return this.f5069b.g();
    }

    public final Object getTag() {
        return this.f5069b.f5057o;
    }

    public final CharSequence getTitle() {
        return this.f5069b.h();
    }

    public final boolean getTitleOptionalHint() {
        return this.f5069b.f5058p;
    }

    public final void invalidate() {
        this.f5069b.i();
    }

    public final boolean isTitleOptional() {
        return this.f5069b.j();
    }

    public final void setCustomView(View view) {
        this.f5069b.k(view);
    }

    public final void setSubtitle(int i10) {
        this.f5069b.l(i10);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f5069b.m(charSequence);
    }

    public final void setTag(Object obj) {
        this.f5069b.f5057o = obj;
    }

    public final void setTitle(int i10) {
        this.f5069b.n(i10);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f5069b.o(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f5069b.p(z);
    }
}
