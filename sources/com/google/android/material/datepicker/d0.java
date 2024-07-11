package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.R;
import java.util.Calendar;
import java.util.Locale;

public final class d0 extends RecyclerView.f<a> {
    public final g<?> d;

    public static class a extends RecyclerView.c0 {
        public final TextView u;

        public a(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    public d0(g<?> gVar) {
        this.d = gVar;
    }

    public final int a() {
        return this.d.f3421k0.f3388s;
    }

    public final void d(RecyclerView.c0 c0Var, int i10) {
        b bVar;
        g<?> gVar = this.d;
        int i11 = gVar.f3421k0.f3384o.f3454q + i10;
        TextView textView = ((a) c0Var).u;
        String string = textView.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        textView.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i11)}));
        textView.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i11)}));
        c cVar = gVar.f3424n0;
        Calendar c10 = b0.c();
        if (c10.get(1) == i11) {
            bVar = cVar.f3408f;
        } else {
            bVar = cVar.d;
        }
        for (Long longValue : gVar.f3420j0.I()) {
            c10.setTimeInMillis(longValue.longValue());
            if (c10.get(1) == i11) {
                bVar = cVar.f3407e;
            }
        }
        bVar.b(textView);
        textView.setOnClickListener(new c0(this, i11));
    }

    public final RecyclerView.c0 e(RecyclerView recyclerView) {
        return new a((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, recyclerView, false));
    }
}
