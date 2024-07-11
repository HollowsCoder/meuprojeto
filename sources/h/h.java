package h;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class h implements Window.Callback {

    /* renamed from: o  reason: collision with root package name */
    public final Window.Callback f5108o;

    public h(Window.Callback callback) {
        if (callback != null) {
            this.f5108o = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f5108o.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f5108o.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f5108o.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f5108o.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f5108o.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f5108o.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f5108o.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f5108o.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f5108o.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f5108o.onCreatePanelMenu(i10, menu);
    }

    public View onCreatePanelView(int i10) {
        return this.f5108o.onCreatePanelView(i10);
    }

    public final void onDetachedFromWindow() {
        this.f5108o.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f5108o.onMenuItemSelected(i10, menuItem);
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return this.f5108o.onMenuOpened(i10, menu);
    }

    public void onPanelClosed(int i10, Menu menu) {
        this.f5108o.onPanelClosed(i10, menu);
    }

    public final void onPointerCaptureChanged(boolean z) {
        this.f5108o.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f5108o.onPreparePanel(i10, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        this.f5108o.onProvideKeyboardShortcuts(list, menu, i10);
    }

    public final boolean onSearchRequested() {
        return this.f5108o.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f5108o.onSearchRequested(searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f5108o.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f5108o.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f5108o.onWindowStartingActionMode(callback, i10);
    }
}
