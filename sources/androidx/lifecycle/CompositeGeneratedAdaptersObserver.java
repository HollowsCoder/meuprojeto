package androidx.lifecycle;

import androidx.lifecycle.h;

class CompositeGeneratedAdaptersObserver implements l {

    /* renamed from: o  reason: collision with root package name */
    public final f[] f1341o;

    public CompositeGeneratedAdaptersObserver(f[] fVarArr) {
        this.f1341o = fVarArr;
    }

    public final void f(n nVar, h.b bVar) {
        new r
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r4v1 ? I:androidx.lifecycle.r) =  call: androidx.lifecycle.r.<init>():void type: CONSTRUCTOR in method: androidx.lifecycle.CompositeGeneratedAdaptersObserver.f(androidx.lifecycle.n, androidx.lifecycle.h$b):void, dex: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v1 ?
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	... 29 more
            */
        /*
            this = this;
            androidx.lifecycle.r r4 = new androidx.lifecycle.r
            r4.<init>()
            androidx.lifecycle.f[] r4 = r3.f1341o
            int r5 = r4.length
            r0 = 0
            r1 = r0
        L_0x000a:
            if (r1 >= r5) goto L_0x0014
            r2 = r4[r1]
            r2.a()
            int r1 = r1 + 1
            goto L_0x000a
        L_0x0014:
            int r5 = r4.length
        L_0x0015:
            if (r0 >= r5) goto L_0x001f
            r1 = r4[r0]
            r1.a()
            int r0 = r0 + 1
            goto L_0x0015
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CompositeGeneratedAdaptersObserver.f(androidx.lifecycle.n, androidx.lifecycle.h$b):void");
    }
}
