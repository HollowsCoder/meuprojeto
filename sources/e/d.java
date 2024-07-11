package e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.l1;
import androidx.fragment.app.q;
import com.karumi.dexter.R;
import java.lang.ref.WeakReference;
import x.a;
import x.f;
import x.p;

public class d extends q implements e {
    public g D;

    public d() {
        this.f157s.f1884b.b("androidx:appcompat", new b(this));
        t(new c(this));
    }

    private void u() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        z().c(view, layoutParams);
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(z().d(context));
    }

    public final void closeOptionsMenu() {
        ((g) z()).J();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((g) z()).J();
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
    }

    public final <T extends View> T findViewById(int i10) {
        return z().e(i10);
    }

    public final MenuInflater getMenuInflater() {
        return z().g();
    }

    public final Resources getResources() {
        int i10 = l1.f650a;
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        z().i();
    }

    public final void k() {
    }

    public final void o() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z().j();
    }

    public final void onContentChanged() {
    }

    public final void onDestroy() {
        super.onDestroy();
        z().l();
    }

    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z;
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        g gVar = (g) z();
        gVar.J();
        r rVar = gVar.f4352v;
        if (menuItem.getItemId() != 16908332 || rVar == null || (rVar.f4418e.o() & 4) == 0) {
            return false;
        }
        Intent a10 = f.a(this);
        if (a10 == null) {
            return false;
        }
        if (shouldUpRecreateTask(a10)) {
            p pVar = new p(this);
            Intent a11 = f.a(this);
            if (a11 == null) {
                a11 = f.a(this);
            }
            if (a11 != null) {
                ComponentName component = a11.getComponent();
                if (component == null) {
                    component = a11.resolveActivity(pVar.f9432p.getPackageManager());
                }
                pVar.e(component);
                pVar.f9431o.add(a11);
            }
            pVar.h();
            try {
                int i11 = a.f9376c;
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            navigateUpTo(a10);
            return true;
        }
    }

    public final boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public final void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((g) z()).E();
    }

    public final void onPostResume() {
        super.onPostResume();
        z().m();
    }

    public void onStart() {
        super.onStart();
        z().n();
    }

    public void onStop() {
        super.onStop();
        z().o();
    }

    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        z().v(charSequence);
    }

    public final void openOptionsMenu() {
        ((g) z()).J();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void setContentView(int i10) {
        u();
        z().r(i10);
    }

    public void setContentView(View view) {
        u();
        z().s(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        z().t(view, layoutParams);
    }

    public final void setTheme(int i10) {
        super.setTheme(i10);
        z().u(i10);
    }

    public final void y() {
        z().i();
    }

    public final f z() {
        if (this.D == null) {
            n.d<WeakReference<f>> dVar = f.f4329o;
            this.D = new g(this, (Window) null, this, this);
        }
        return this.D;
    }
}
