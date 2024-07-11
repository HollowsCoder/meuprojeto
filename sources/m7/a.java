package m7;

public final class a implements c {

    /* renamed from: o  reason: collision with root package name */
    public final c[] f7204o;

    /* renamed from: p  reason: collision with root package name */
    public final b f7205p = new b();

    public a(c... cVarArr) {
        this.f7204o = cVarArr;
    }

    public final StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (c cVar : this.f7204o) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = cVar.h(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? this.f7205p.h(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
