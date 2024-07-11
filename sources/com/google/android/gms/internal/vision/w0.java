package com.google.android.gms.internal.vision;

import androidx.activity.result.c;
import androidx.appcompat.widget.x0;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import n.e;
import q0.d;
import s6.a;

public abstract class w0 implements Serializable, Iterable<Byte> {

    /* renamed from: p  reason: collision with root package name */
    public static final z0 f3182p = new z0(u1.f3171b);

    /* renamed from: q  reason: collision with root package name */
    public static final y0 f3183q;

    /* renamed from: o  reason: collision with root package name */
    public int f3184o = 0;

    static {
        d dVar;
        if (q0.a()) {
            new e
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: CONSTRUCTOR  (r0v4 ? I:n.e) =  call: n.e.<init>():void type: CONSTRUCTOR in method: com.google.android.gms.internal.vision.w0.<clinit>():void, dex: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v4 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                com.google.android.gms.internal.vision.z0 r0 = new com.google.android.gms.internal.vision.z0
                byte[] r1 = com.google.android.gms.internal.vision.u1.f3171b
                r0.<init>(r1)
                f3182p = r0
                boolean r0 = com.google.android.gms.internal.vision.q0.a()
                if (r0 == 0) goto L_0x0015
                n.e r0 = new n.e
                r0.<init>()
                goto L_0x001b
            L_0x0015:
                q0.d r0 = new q0.d
                r1 = 0
                r0.<init>((java.lang.Object) r1)
            L_0x001b:
                f3183q = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.w0.<clinit>():void");
        }

        public static z0 k(byte[] bArr, int i10, int i11) {
            t(i10, i10 + i11, bArr.length);
            return new z0(f3183q.j(bArr, i10, i11));
        }

        public static int t(int i10, int i11, int i12) {
            int i13 = i11 - i10;
            if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
                return i13;
            }
            if (i10 < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i10);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i11 < i10) {
                throw new IndexOutOfBoundsException(x0.c(66, "Beginning index larger than ending index: ", i10, ", ", i11));
            } else {
                throw new IndexOutOfBoundsException(x0.c(37, "End index: ", i11, " >= ", i12));
            }
        }

        public abstract byte e(int i10);

        public abstract boolean equals(Object obj);

        public abstract int h(int i10, int i11);

        public final int hashCode() {
            int i10 = this.f3184o;
            if (i10 == 0) {
                int p10 = p();
                i10 = h(p10, p10);
                if (i10 == 0) {
                    i10 = 1;
                }
                this.f3184o = i10;
            }
            return i10;
        }

        public abstract z0 i();

        public final /* synthetic */ Iterator iterator() {
            return new v0(this);
        }

        public abstract String m(Charset charset);

        public abstract void n(c cVar);

        public abstract int p();

        public abstract byte q(int i10);

        public final String toString() {
            Locale locale = Locale.ROOT;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            objArr[1] = Integer.valueOf(p());
            objArr[2] = p() <= 50 ? a.Y(this) : String.valueOf(a.Y(i())).concat("...");
            return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
        }

        public abstract boolean u();
    }
