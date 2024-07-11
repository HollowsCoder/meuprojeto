package s2;

import com.bumptech.glide.load.data.e;
import h0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n3.a;
import q2.h;
import s2.j;

public final class u<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final c<List<Throwable>> f8687a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends k<Data, ResourceType, Transcode>> f8688b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8689c;

    public u(Class cls, Class cls2, Class cls3, List list, a.c cVar) {
        this.f8687a = cVar;
        if (!list.isEmpty()) {
            this.f8688b = list;
            this.f8689c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final w a(int i10, int i11, h hVar, e eVar, j.c cVar) {
        w wVar;
        c<List<Throwable>> cVar2 = this.f8687a;
        List<Throwable> b10 = cVar2.b();
        s6.a.n(b10);
        List list = b10;
        try {
            List<? extends k<Data, ResourceType, Transcode>> list2 = this.f8688b;
            int size = list2.size();
            wVar = null;
            for (int i12 = 0; i12 < size; i12++) {
                wVar = ((k) list2.get(i12)).a(i10, i11, hVar, eVar, cVar);
                if (wVar != null) {
                    break;
                }
            }
        } catch (r e10) {
            list.add(e10);
        } catch (Throwable th) {
            cVar2.a(list);
            throw th;
        }
        if (wVar != null) {
            cVar2.a(list);
            return wVar;
        }
        throw new r(this.f8689c, new ArrayList(list));
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f8688b.toArray()) + '}';
    }
}
