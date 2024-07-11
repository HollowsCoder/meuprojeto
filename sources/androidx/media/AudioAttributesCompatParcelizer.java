package androidx.media;

import e1.a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f1428a;
        if (aVar.h(1)) {
            obj = aVar.m();
        }
        audioAttributesCompat.f1428a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f1428a;
        aVar.n(1);
        aVar.v(audioAttributesImpl);
    }
}
