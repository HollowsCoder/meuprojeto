package androidx.media;

import android.media.AudioAttributes;
import e1.a;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        Object obj = audioAttributesImplApi21.f1429a;
        if (aVar.h(1)) {
            obj = aVar.k();
        }
        audioAttributesImplApi21.f1429a = (AudioAttributes) obj;
        audioAttributesImplApi21.f1430b = aVar.j(audioAttributesImplApi21.f1430b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f1429a;
        aVar.n(1);
        aVar.t(audioAttributes);
        aVar.s(audioAttributesImplApi21.f1430b, 2);
    }
}
