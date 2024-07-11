package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f1429a;

    /* renamed from: b  reason: collision with root package name */
    public int f1430b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f1429a.equals(((AudioAttributesImplApi21) obj).f1429a);
    }

    public final int hashCode() {
        return this.f1429a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1429a;
    }
}
