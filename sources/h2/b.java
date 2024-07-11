package h2;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.gson.Gson;
import y8.a;
import z8.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Gson f5218a = new Gson();

    public static void a(View view, int i10, a aVar) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), i10);
        loadAnimation.setDuration(1000);
        loadAnimation.setRepeatCount(-1);
        loadAnimation.setRepeatMode(2);
        view.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new a(aVar));
    }

    public static final String b(Object obj) {
        g.f(obj, "<this>");
        String json = f5218a.toJson(obj);
        g.e(json, "gson.toJson(this)");
        return json;
    }
}
