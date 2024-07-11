package m0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import b0.d;
import m0.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: o  reason: collision with root package name */
    public boolean f7017o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7018p = true;

    /* renamed from: q  reason: collision with root package name */
    public Cursor f7019q = null;

    /* renamed from: r  reason: collision with root package name */
    public int f7020r = -1;

    /* renamed from: s  reason: collision with root package name */
    public C0099a f7021s = new C0099a();

    /* renamed from: t  reason: collision with root package name */
    public b f7022t = new b();
    public b u;

    /* renamed from: m0.a$a  reason: collision with other inner class name */
    public class C0099a extends ContentObserver {
        public C0099a() {
            super(new Handler());
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f7018p && (cursor = aVar.f7019q) != null && !cursor.isClosed()) {
                aVar.f7017o = aVar.f7019q.requery();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public final void onChanged() {
            a aVar = a.this;
            aVar.f7017o = true;
            aVar.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f7017o = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f7019q;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0099a aVar = this.f7021s;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f7022t;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f7019q = cursor;
            if (cursor != null) {
                C0099a aVar2 = this.f7021s;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f7022t;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f7020r = cursor.getColumnIndexOrThrow("_id");
                this.f7017o = true;
                notifyDataSetChanged();
            } else {
                this.f7020r = -1;
                this.f7017o = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.f7017o || (cursor = this.f7019q) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f7017o) {
            return null;
        }
        this.f7019q.moveToPosition(i10);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.f7027x.inflate(cVar.w, viewGroup, false);
        }
        b(view, this.f7019q);
        return view;
    }

    public final Filter getFilter() {
        if (this.u == null) {
            this.u = new b(this);
        }
        return this.u;
    }

    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f7017o || (cursor = this.f7019q) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f7019q;
    }

    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f7017o || (cursor = this.f7019q) == null || !cursor.moveToPosition(i10)) {
            return 0;
        }
        return this.f7019q.getLong(this.f7020r);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f7017o) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f7019q.moveToPosition(i10)) {
            if (view == null) {
                view = e(viewGroup);
            }
            b(view, this.f7019q);
            return view;
        } else {
            throw new IllegalStateException(d.c("couldn't move cursor to position ", i10));
        }
    }
}
