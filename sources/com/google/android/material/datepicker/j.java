package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.TimeZone;

public final class j extends RecyclerView.s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f3435a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f3436b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f3437c;

    public j(g gVar, v vVar, MaterialButton materialButton) {
        this.f3437c = gVar;
        this.f3435a = vVar;
        this.f3436b = materialButton;
    }

    public final void a(int i10, RecyclerView recyclerView) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f3436b.getText());
        }
    }

    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        g gVar = this.f3437c;
        if (i10 < 0) {
            i12 = ((LinearLayoutManager) gVar.f3426p0.getLayoutManager()).N0();
        } else {
            i12 = ((LinearLayoutManager) gVar.f3426p0.getLayoutManager()).O0();
        }
        v vVar = this.f3435a;
        Calendar b10 = b0.b(vVar.f3466e.f3384o.f3452o);
        b10.add(2, i12);
        gVar.f3422l0 = new s(b10);
        Calendar b11 = b0.b(vVar.f3466e.f3384o.f3452o);
        b11.add(2, i12);
        b11.set(5, 1);
        Calendar b12 = b0.b(b11);
        b12.get(2);
        b12.get(1);
        b12.getMaximum(7);
        b12.getActualMaximum(5);
        b12.getTimeInMillis();
        long timeInMillis = b12.getTimeInMillis();
        this.f3436b.setText(DateUtils.formatDateTime(vVar.d, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36));
    }
}
