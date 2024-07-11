package androidx.media;

import e1.a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1431a = aVar.j(audioAttributesImplBase.f1431a, 1);
        audioAttributesImplBase.f1432b = aVar.j(audioAttributesImplBase.f1432b, 2);
        audioAttributesImplBase.f1433c = aVar.j(audioAttributesImplBase.f1433c, 3);
        audioAttributesImplBase.d = aVar.j(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.s(audioAttributesImplBase.f1431a, 1);
        aVar.s(audioAttributesImplBase.f1432b, 2);
        aVar.s(audioAttributesImplBase.f1433c, 3);
        aVar.s(audioAttributesImplBase.d, 4);
    }
}
