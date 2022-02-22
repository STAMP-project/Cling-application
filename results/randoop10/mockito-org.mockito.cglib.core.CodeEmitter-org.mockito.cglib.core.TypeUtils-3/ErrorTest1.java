import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(100, type6);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type6);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("short", type11, typeArray13);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("short", type17, typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray19);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray19);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray19);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type24.getInternalName();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L1033252246", "L1789282035");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(9, type22);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type22);
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.Object obj29 = label28.info;
        java.lang.Object obj30 = label28.info;
        java.lang.String str31 = label28.toString();
        label28.info = ' ';
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type34);
        java.lang.String str36 = type34.getClassName();
        label28.info = type34;
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type34);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("L1619152913");
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getReturnType("Double");
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.parseTypes("Short");
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray45);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray48 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray48);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        int int55 = type53.getOpcode((int) ' ');
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray57);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("int", type53, typeArray58);
        org.mockito.asm.Type[] typeArray60 = signature59.getArgumentTypes();
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray50, typeArray60);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray49, typeArray50);
        org.mockito.cglib.core.Signature signature63 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray62);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str65 = type64.getDescriptor();
        boolean boolean66 = org.mockito.cglib.core.TypeUtils.isPrimitive(type64);
        boolean boolean67 = org.mockito.cglib.core.TypeUtils.isArray(type64);
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type64);
        int int70 = type64.getOpcode(1);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray62, type64);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray45, typeArray71);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray74 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray73);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter7.getStaticHook();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        org.mockito.asm.Type type5 = signature4.getReturnType();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(100, type8);
        int int10 = type8.getSize();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type20 = type19.getElementType();
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type19);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("L897927500", type5, typeArray22);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type5.getInternalName();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("L1295514633", "<init>", "L546515263", 114);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("L34839026");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor11 = classAdapter4.visitField((int) (short) 100, "L1171022941", "(Ljava/lang/L;)Ljava/lang/Short;", "LL179248870;", (java.lang.Object) "L34839026");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L1120060479", "L1232248458", "Ljava/lang/org/mockito/cglib/core/ClassEmitter;", 132);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("()I", false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("<init>()V");
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(100, type6);
        int int8 = type6.getSize();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type18 = type17.getElementType();
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type17);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("L897927500", type4, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getPackageName(type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray31);
        org.mockito.asm.Type type33 = signature32.getReturnType();
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type33);
        int int35 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type34);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isArray(type34);
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type34);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray38);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("void");
        int int3 = type1.getOpcode((int) ' ');
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int6 = type1.getOpcode((int) 'a');
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getPackageName(type9);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getReturnType("Short");
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getBoxedType(type22);
        int int24 = type23.getSize();
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type23);
        boolean boolean26 = type1.equals((java.lang.Object) typeArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type1.getInternalName();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("(Ljava/lang/(L;)Ljava/lang/Void;", "L1461338839org$2Fmockito$2Fasm$2FType", "L325703187", 35);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter0.getSuperType();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L477062747", "L1775857136");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isPrimitive(type11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type11);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type15);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type24);
        java.lang.String str28 = type24.getClassName();
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getBoxedType(type24);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getReturnType("()V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.declare_field(134, "L1166177411", type29, (java.lang.Object) type31);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visitEnd();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitSource("L1232248458", "L527043349");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) '4', type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        int int5 = type1.getSize();
        java.lang.String str6 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        int int9 = type7.getOpcode((int) ' ');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("int", type7, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray4);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(100, type18);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type18);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String str23 = signature22.toString();
        org.mockito.asm.Type type24 = signature22.getReturnType();
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getPackageName(type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getBoxedType(type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.getPackageName(type37);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.cglib.core.Signature signature41 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.getTypes(classArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("hi!", type37, typeArray44);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray44, typeArray47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getReturnType("Short");
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.getBoxedType(type50);
        int int52 = type51.getSize();
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray47, type51);
        int int54 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray53);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray34, typeArray53);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.Local", type24, typeArray55);
        int int58 = type24.getOpcode(11);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.getPackageName(type24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int60 = type24.getDimensions();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitOuterClass("", "L81357650", "(Ljava/lang/L1619152913;L(L;D)Lt;;)LL382355325;");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) '4', type7);
        org.mockito.asm.Type type10 = local9.getType();
        org.mockito.asm.Type type11 = local9.getType();
        org.mockito.asm.Type[] typeArray13 = org.mockito.asm.Type.getArgumentTypes("(L;)S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(159, (int) 'a', "L247835741", type11, typeArray13, "L1768459599");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        java.lang.String str22 = signature21.toString();
        org.mockito.asm.Type type23 = signature21.getReturnType();
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getPackageName(type23);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type25.getDimensions();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter3.getSuperType();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getSuperType();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L1900320204", "LL40020120;", "L154778021", 135);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        int int9 = type7.getOpcode((int) ' ');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("int", type7, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray4);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(100, type18);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type18);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray26);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type18, typeArray27);
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type18);
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isPrimitive(type18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = type18.getElementType();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L1212512215", "t");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        java.lang.Class<?> wildcardClass4 = typeArray3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        org.mockito.asm.Type type10 = signature9.getReturnType();
        java.lang.Class<?> wildcardClass11 = signature9.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        java.lang.Class<?> wildcardClass18 = typeArray17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        java.lang.Class<?> wildcardClass28 = typeArray27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray34 = new java.lang.Class[] { wildcardClass4, wildcardClass11, wildcardClass18, wildcardClass28 };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray39);
        java.lang.String str41 = type36.getClassName();
        int int42 = type36.getSort();
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type36);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean46 = type44.equals((java.lang.Object) 154);
        int int47 = type44.getSize();
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray49);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray43, typeArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray53 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray52);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("(V)Ljava/lang/Lorg/mockito/asm/Type;", true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("I", "L1202418377");
        java.lang.String str13 = signature12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isPrimitive(type14);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type14);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        boolean boolean21 = type14.equals((java.lang.Object) strArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        boolean boolean23 = signature12.equals((java.lang.Object) strArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(155, 0, "L1356244694", "(Ljava/lang/L1990914316;)V", "L2060061700", strArray20);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(9, type22);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type22);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type31);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type35);
        org.mockito.asm.Type type37 = type35.getElementType();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean42 = org.mockito.cglib.core.TypeUtils.isPrimitive(type41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type41);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray45);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        java.lang.Class<?> wildcardClass12 = typeArray11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        org.mockito.asm.Type type18 = signature17.getReturnType();
        java.lang.Class<?> wildcardClass19 = signature17.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        java.lang.Class<?> wildcardClass26 = typeArray25.getClass();
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass26);
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        java.lang.String str31 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        java.lang.Class<?> wildcardClass36 = typeArray35.getClass();
        java.lang.String str37 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        java.lang.String str39 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass36);
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        java.lang.Class[] classArray42 = new java.lang.Class[] { wildcardClass12, wildcardClass19, wildcardClass26, wildcardClass36 };
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.getTypes(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(3, 19, "L1654273308", "L907962504", "(L;Ljava/lang;)V", strArray44);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("short", "(L;D)D");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1377657107", "L1946121980");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter7.getSuperType();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(42, 0, "L1267768484", "(Ljava/lang/L1111712985;)L<init>()V;", "L1951817954", strArray13);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getType("hi!()Ljava/lang/Short;");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("short", type16, typeArray18);
        int int20 = type16.getSort();
        java.lang.String str21 = type16.toString();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        java.lang.Class[] classArray27 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray26);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray30);
        int int32 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray30);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type13, typeArray30);
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(153, 136, "L1427456798", "int(L;)I", "", strArray34);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isPrimitive(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type15);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type19);
        int int21 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(140, 12, "L1890775947", "(Ljava/lang/L;)Lt;", "L40020120", strArray22);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean14 = type11.equals((java.lang.Object) type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray20);
        int int22 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray20);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(135, 102, "L1907616643", "L139788365", "L428148456", strArray23);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isArray(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getReturnType("LZ;");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitInnerClass("L;(Ljava/lang/L;LV;)L;", "L$3B$28Ljava$2Flang$2FL$3BLV$3B$29L$3B", "([Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;[Lorg/mockito/asm/Type;[Lorg/mockito/asm/Type;S)LL;;", (int) (short) 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter4.getClassType();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter3.getStaticHook();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitInnerClass("L2078249401", "L1133150969", "short()L;", 129);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.String str4 = signature3.getDescriptor();
        org.mockito.asm.Type[] typeArray5 = signature3.getArgumentTypes();
        org.mockito.asm.Type type6 = signature3.getReturnType();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(0, type6);
        java.lang.String str8 = type6.toString();
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type10.getInternalName();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("()D", "L866187222");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter4.visitAnnotation("L1951817954", false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        int int3 = type1.getOpcode((int) ' ');
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("int", type1, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter0.getAccess();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("short");
        java.lang.String str2 = signature1.getName();
        java.lang.String str3 = signature1.getDescriptor();
        org.mockito.asm.Type type4 = signature1.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        int int13 = type11.getOpcode((int) ' ');
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("int", type11, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getBoxedType(type20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type20);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray27);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(156, 10, "", "L1325724854org.mockito.cglib.core.Signature", "L321272979", strArray30);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitEnd();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L1979917520", "L1693084006", "Ljava/lang/L179248870;", 141);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("L791401390", "L1956791564");
        boolean boolean13 = signature11.equals((java.lang.Object) "L1843692054");
        java.lang.String str14 = signature11.getDescriptor();
        java.lang.String str15 = signature11.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor16 = classEmitter4.visitField(112, "L1903321558", "Int", "(L;)I", (java.lang.Object) signature11);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L1952628019", "L632150955", "L627419700", 47);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L725236413", "L40020120");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type8);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class((int) (short) 1, 128, "int", type8, typeArray20, "(VL;)I");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str6 = type1.getClassName();
        java.lang.String str7 = type1.toString();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(10, type1);
        int int9 = type1.getSize();
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type10.getInternalName();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.String str4 = signature3.getDescriptor();
        org.mockito.asm.Type[] typeArray5 = signature3.getArgumentTypes();
        org.mockito.asm.Type type6 = signature3.getReturnType();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(0, type6);
        java.lang.String str8 = type6.toString();
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type6.getInternalName();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visit((int) (short) 1, (int) (short) 1, "(L", "L266151688", "(Ljava/lang/L1990914316;)V", strArray13);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter4.visitAnnotation("L2028315100", true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = classEmitter6.getClassType();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        boolean boolean7 = type4.equals((java.lang.Object) label5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type4.getInternalName();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        int int14 = type12.getOpcode((int) ' ');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("int", type12, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getBoxedType(type21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type21);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        java.lang.Class[] classArray27 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(24, 59, "L1677923165", "L907962504", "$28VL$3B$29I", strArray32);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter0.getAccess();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("(L;)Z", "[Lorg.mockito.asm");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("L195506085", "L1719020299", "L1395878545");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = classEmitter6.getAccess();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L1830955879", "L23070008");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("", "L1621762024", "");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classAdapter7.visitAnnotation("L27971915", false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("L791401390", "L741702553", "L1457561325", 108);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("L1478993506", "(L;)B");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type6);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String str15 = signature14.getDescriptor();
        java.lang.String str16 = signature14.toString();
        org.mockito.asm.Type[] typeArray17 = signature14.getArgumentTypes();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 154);
        java.lang.String str21 = type18.getDescriptor();
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type18);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        int int7 = type4.getSort();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) -1, type4);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("L129800516");
        boolean boolean12 = type4.equals((java.lang.Object) "L129800516");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type4.getDimensions();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        int int6 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isPrimitive(type23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        java.lang.String str27 = type23.getClassName();
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type28.getElementType();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) '4', type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type5.getElementType();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("L1264057188");
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(12, 12, "L1034014722", "Ljava/lang/org/mockito/cglib/core/ClassEmitter;", "$28Ljava$2Flang$2FL115210646$3B$29V", strArray16);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        java.lang.String str7 = label0.toString();
        java.lang.Object obj8 = label0.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        boolean boolean16 = type9.equals((java.lang.Object) strArray15);
        label0.info = boolean16;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        java.lang.String str22 = signature21.getDescriptor();
        org.mockito.asm.Type[] typeArray23 = signature21.getArgumentTypes();
        org.mockito.asm.Type type24 = signature21.getReturnType();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type24);
        java.lang.String str26 = type24.toString();
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getPackageName(type24);
        label0.info = str27;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType("Lorg/mockito/cglib/core/Signature;");
        java.lang.String str31 = type30.toString();
        java.lang.String str32 = type30.getInternalName();
        org.mockito.asm.Type type33 = type30.getElementType();
        label0.info = type33;
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        label0.info = classAdapter40;
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean51 = org.mockito.cglib.core.TypeUtils.isPrimitive(type50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray49, type50);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray49, type54);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean60 = org.mockito.cglib.core.TypeUtils.isPrimitive(type59);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray58, type59);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray55, typeArray61);
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray64 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray63);
        org.mockito.cglib.core.Signature signature65 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray63);
        java.lang.Class[] classArray66 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.getTypes(classArray66);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray63, typeArray67);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray62, typeArray63);
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray71 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray70);
        org.mockito.cglib.core.Signature signature72 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray70);
        java.lang.Class[] classArray73 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.getTypes(classArray73);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray70, typeArray74);
        org.mockito.asm.Type[] typeArray76 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray77 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray76);
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray77);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.add(typeArray75, typeArray78);
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.add(typeArray63, typeArray79);
        org.mockito.cglib.core.Signature signature81 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray63);
        java.lang.String[] strArray82 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter40.visit(132, (int) (byte) 100, "L437104541", "L1870684096", "L7060162", strArray82);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        java.lang.String str5 = signature4.getDescriptor();
        org.mockito.asm.Type[] typeArray6 = signature4.getArgumentTypes();
        org.mockito.asm.Type type7 = signature4.getReturnType();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type7);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(157, type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type7.getElementType();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        int int3 = type1.getSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.getTypes(classArray7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray8);
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type1.getInternalName();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getClassType();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = classEmitter1.getAccess();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter8.getSuperType();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitOuterClass("L1927422628", "L1950776766", "L2079919549");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Short");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(100, type6);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type6);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("short", type11, typeArray13);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("short", type17, typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray19);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray19);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray19);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type24.getDimensions();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitOuterClass("L<init>()V", "L264125109", "L1177940594");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("L690312719");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("short", type9, typeArray11);
        int int13 = type9.getSort();
        java.lang.String str14 = type9.toString();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray19);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(72, 59, "org/mockito/asm/Type", type6, typeArray23, "L1813600832");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitOuterClass("L270967228", "L88758928", "L894549001");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(100, type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type1, type3 };
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.asm.Type.getArgumentTypes("(L;)L;");
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        int int11 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        int int20 = type18.getOpcode((int) ' ');
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("int", type18, typeArray23);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray15);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(100, type29);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type29);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type29);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isPrimitive(type34);
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isArray(type34);
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(9, type34);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type34);
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        java.lang.Object obj41 = label40.info;
        java.lang.Object obj42 = label40.info;
        java.lang.String str43 = label40.toString();
        label40.info = ' ';
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type46);
        java.lang.String str48 = type46.getClassName();
        label40.info = type46;
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type46);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray50);
        org.mockito.cglib.core.Signature signature52 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray53 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter7.visitAnnotation("L1325724854", false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isPrimitive(type11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type11);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(112, 40, "L1764471189", "L1133589996", "LL1092810277;", strArray17);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        int int5 = type0.getSort();
        int int7 = type0.getOpcode(37);
        int int9 = type0.getOpcode(154);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type0);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        org.mockito.asm.Type type16 = signature15.getReturnType();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(96, type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("short", type21, typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("short", type27, typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray29);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("<init>", type16, typeArray23);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray33);
        java.lang.String str36 = signature35.getDescriptor();
        org.mockito.asm.Type[] typeArray37 = signature35.getArgumentTypes();
        org.mockito.asm.Type[] typeArray38 = signature35.getArgumentTypes();
        int int39 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray38);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = type0.getInternalName();
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L1445097838", "L1946121980", "(D)V", 68);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("L1607015094", "L1654273308", "L1583297645");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter3.getAccess();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        int int3 = type1.getSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.getTypes(classArray7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray8);
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray15);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type1.getInternalName();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str13 = type12.toString();
        java.lang.String str14 = type12.toString();
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("L;", type12, typeArray20);
        java.lang.String str22 = signature21.getName();
        org.mockito.asm.Type type23 = signature21.getReturnType();
        java.lang.String str24 = signature21.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor25 = classEmitter1.visitField(24, "L1683436459", "L2064135164(L;D)S", "([Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;[Lorg/mockito/asm/Type;[Lorg/mockito/asm/Type;)Ljava.lang;", (java.lang.Object) str24);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter5.visitAnnotation("(L", true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        org.mockito.asm.Type type5 = signature4.getReturnType();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(100, type8);
        int int10 = type8.getSize();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type20 = type19.getElementType();
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type19);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("L897927500", type5, typeArray22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.cglib.core.Signature signature26 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.Class[] classArray27 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray28);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray32);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        int int37 = type5.getOpcode(128);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = type5.getDimensions();
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        java.lang.Class<?> wildcardClass13 = typeArray12.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type15);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("short()L;");
        boolean boolean21 = type15.equals((java.lang.Object) type20);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str25 = type24.toString();
        java.lang.String str26 = type24.toString();
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("L;", type24, typeArray32);
        org.mockito.asm.Type[] typeArray34 = signature33.getArgumentTypes();
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray34);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray38);
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray38);
        org.mockito.asm.Type type41 = signature40.getReturnType();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(96, type41);
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local(37, type41);
        boolean boolean44 = signature35.equals((java.lang.Object) 37);
        org.mockito.asm.Type[] typeArray45 = signature35.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.begin_class(51, 156, "L1427456798", type20, typeArray45, "L494006198");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter2.getClassType();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter6.getClassType();
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1521129122", "L$28$29B");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("L15441231", false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("L1241135525");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        int int13 = type11.getOpcode((int) ' ');
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("int", type11, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getBoxedType(type20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type20);
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class((int) (byte) 0, 11, "L205357731", type9, typeArray22, "L464907821");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter3.getAccess();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter4.getSuperType();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("<init>(L;D)V", "(Ljava/lang/L;)LL261521586;", "L1429816495");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("L;");
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.begin_class(3, 23, "int(L;)I", type8, typeArray14, "L488246265");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Short");
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSize();
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Short");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(100, type5);
        int int7 = type5.getSize();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type17 = type16.getElementType();
        int int18 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type16);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        boolean boolean21 = type3.equals((java.lang.Object) typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type3.getElementType();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visitOuterClass("L2092251054", "<init>(V)V", "L511727368");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = type3.getClassName();
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type3);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        boolean boolean8 = type3.equals((java.lang.Object) "hi!()Ljava/lang/Short;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type3.getDimensions();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) '4', type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        int int5 = type1.getSize();
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(9, type22);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type22);
        int int28 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray20);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("L179248870");
        org.mockito.asm.Type type31 = type30.getElementType();
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type30);
        int int34 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray33);
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter1.getStaticHook();
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter1.getStaticHook();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray11);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type8);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.fromInternalName("L115210646");
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getBoxedType(type22);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getPackageName(type22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field((int) (byte) 0, "L417177808", type19, (java.lang.Object) type22);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("L469849135", false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("L1325724854");
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type16);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        boolean boolean27 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(1, 100, "L205357731", type8, typeArray28, "L308541138");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("L1990914316", "LL;");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) '4', type2);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        org.mockito.asm.Type type7 = local6.getType();
        org.mockito.asm.Type type8 = local6.getType();
        int int10 = type8.getOpcode(42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type8.getInternalName();
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = type1.toString();
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type16);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type27);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean33 = org.mockito.cglib.core.TypeUtils.isPrimitive(type32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type36);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type41 = type36.getElementType();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1813600832");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 0, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type3.getInternalName();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("Java$2Elang", "L301926154", "L1226068386", 0);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L969830988", "L426110865", "L1124134144", 140);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L1330470207", "L2012537812");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1799275916");
        org.mockito.asm.Type[] typeArray16 = signature15.getArgumentTypes();
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(63, 56, "L1376116987", "(L;Lint;L;D)Ljava/lang/Short;", "L301926154", strArray18);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((-1), 134, "(Ljava/lang/L;)Ljava/lang/Short;", "L1653992221", "L244564478", strArray19);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter6.getClassType();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("L481128081", "L677830104", "(VL;L()B;)V", 24);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.toString();
        java.lang.String str5 = signature2.getName();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        org.mockito.asm.Type type7 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type7.getElementType();
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("()L()B;", "L600964006", "org.mockito.cglib.core.ClassEmitter", 40);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L873578516", "L1924587111", "L1204822520", 0);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type0);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type0);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        java.lang.String str5 = type0.getClassName();
        java.lang.String str6 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L180288185", "L494006198", "");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L730723213", "L180288185");
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("V");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type13);
        java.lang.String str15 = type13.getClassName();
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type17);
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getPackageName(type18);
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type18);
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(144, 116, "()Lvoid;", "L2029575687", "L2035081690", strArray22);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("$28L$3BLint$3B$29V", "L914693455");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter5.getAccess();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("<init>$28$29V", "L184610672", "L478461731", 116);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(11, type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        int int6 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type7);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        int int15 = type13.getOpcode((int) ' ');
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("int", type13, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getBoxedType(type22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type22);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray20);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray20);
        boolean boolean27 = type1.equals((java.lang.Object) typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = type1.getDimensions();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class(68, 28, "L192747691", type10, typeArray11, "Java.lang.Short");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L306758391", "L1191311861", "L481128081", 56);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        int int21 = type17.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getPackageName(type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray31);
        org.mockito.asm.Type type33 = signature32.getReturnType();
        java.lang.String str34 = signature32.getName();
        java.lang.String str35 = signature32.getDescriptor();
        org.mockito.asm.Type[] typeArray36 = signature32.getArgumentTypes();
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray36);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getBoxedType(type17);
        java.lang.String str39 = type17.toString();
        int int40 = type17.getSort();
        boolean boolean41 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int42 = type17.getDimensions();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("", "L636494061", "L154778021", 10);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!()Ljava/lang/Short;");
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(130, type8);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type8);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("(L;Lint;L;D)Ljava/lang/Short;");
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("L$3B");
        boolean boolean16 = type13.equals((java.lang.Object) type15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (short) 100, "L478453409", type8, (java.lang.Object) type13);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = classEmitter6.getSuperType();
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("Ljava$2Flang$2FVoid$3B");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        org.mockito.asm.Type type18 = signature17.getReturnType();
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type18);
        boolean boolean20 = type14.equals((java.lang.Object) type19);
        java.lang.String str21 = type19.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        boolean boolean25 = type19.equals((java.lang.Object) type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.declare_field(56, "L699088911", type12, (java.lang.Object) type26);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("L222577257");
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("L1328785442");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("short", type15, typeArray17);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("short", type21, typeArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        boolean boolean29 = org.mockito.cglib.core.TypeUtils.isArray(type26);
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        boolean boolean33 = type26.equals((java.lang.Object) strArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray34);
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray34);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getBoxedType(type40);
        java.lang.String str42 = org.mockito.cglib.core.TypeUtils.getPackageName(type41);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray43);
        org.mockito.cglib.core.Signature signature45 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray43);
        java.lang.Class[] classArray46 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray43, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("hi!", type41, typeArray48);
        org.mockito.asm.Type type50 = signature49.getReturnType();
        org.mockito.asm.Label label51 = new org.mockito.asm.Label();
        java.lang.Object obj52 = label51.info;
        java.lang.String str53 = label51.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str55 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type54);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type54);
        label51.info = type54;
        boolean boolean58 = signature49.equals((java.lang.Object) label51);
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray60 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray59);
        org.mockito.cglib.core.Signature signature61 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray59);
        java.lang.Class[] classArray62 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.getTypes(classArray62);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray59, typeArray63);
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray66 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray65);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray66);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray64, typeArray67);
        boolean boolean69 = signature49.equals((java.lang.Object) typeArray67);
        org.mockito.asm.Type type72 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str73 = type72.toString();
        java.lang.String str74 = type72.toString();
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray77 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray76);
        org.mockito.asm.Type type79 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.add(typeArray76, type79);
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("L;", type72, typeArray80);
        java.lang.String str82 = signature81.getName();
        java.lang.String str83 = signature81.toString();
        java.lang.String str84 = signature81.toString();
        org.mockito.asm.Type type85 = signature81.getReturnType();
        org.mockito.asm.Type type86 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type85);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray67, type85);
        org.mockito.asm.Type[] typeArray88 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.begin_class(32, 13, "L1190120604", type9, typeArray87, "Lorg/mockito/asm/Label;");
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("(L;D)L;", "L1528860935");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter6.visitAnnotation("V", false);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("(L;VL;)Ljava/lang;", "L772577100");
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitOuterClass("Lhi!()Ljava/lang/Short;;", "L1646324001", "<init>(L;)V");
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("<init>()V");
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(1, type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray22);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type14, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor26 = classAdapter5.visitField(104, "L(Ljava/lang/L;", "L915517561(L;)V", "L790389219(L;)LL<init>()V;", (java.lang.Object) "");
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = classEmitter0.getAccess();
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("L644610379");
        int int16 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visit(36, 45, "L590581533", "L32418376", "L380461644(Ljava/lang/L1587696640;L(L;)Z;)Ljava/lang/Short;", strArray17);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type16);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type27);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean33 = org.mockito.cglib.core.TypeUtils.isPrimitive(type32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type36);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray41 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        java.lang.String str7 = label0.toString();
        java.lang.Object obj8 = label0.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        boolean boolean16 = type9.equals((java.lang.Object) strArray15);
        label0.info = boolean16;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        java.lang.String str22 = signature21.getDescriptor();
        org.mockito.asm.Type[] typeArray23 = signature21.getArgumentTypes();
        org.mockito.asm.Type type24 = signature21.getReturnType();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type24);
        java.lang.String str26 = type24.toString();
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getPackageName(type24);
        label0.info = str27;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType("Lorg/mockito/cglib/core/Signature;");
        java.lang.String str31 = type30.toString();
        java.lang.String str32 = type30.getInternalName();
        org.mockito.asm.Type type33 = type30.getElementType();
        label0.info = type33;
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        label0.info = classAdapter40;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean49 = type47.equals((java.lang.Object) 154);
        int int50 = type47.getSize();
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray52);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray53);
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray56 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray55);
        org.mockito.cglib.core.Signature signature57 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray55);
        java.lang.Class[] classArray58 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.getTypes(classArray58);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray55, typeArray59);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray53, typeArray59);
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray63 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray62);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray63);
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray66 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray65);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        int int70 = type68.getOpcode((int) ' ');
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray72);
        org.mockito.cglib.core.Signature signature74 = new org.mockito.cglib.core.Signature("int", type68, typeArray73);
        org.mockito.asm.Type[] typeArray75 = signature74.getArgumentTypes();
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.add(typeArray65, typeArray75);
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.add(typeArray64, typeArray65);
        org.mockito.asm.Type type79 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local80 = new org.mockito.cglib.core.Local(100, type79);
        org.mockito.asm.Type type81 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type79);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.add(typeArray77, type79);
        org.mockito.asm.Type type84 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str85 = type84.getDescriptor();
        boolean boolean86 = org.mockito.cglib.core.TypeUtils.isPrimitive(type84);
        boolean boolean87 = org.mockito.cglib.core.TypeUtils.isArray(type84);
        org.mockito.cglib.core.Local local88 = new org.mockito.cglib.core.Local(9, type84);
        org.mockito.asm.Type[] typeArray89 = org.mockito.cglib.core.TypeUtils.add(typeArray82, type84);
        int int90 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray82);
        org.mockito.asm.Type type92 = org.mockito.cglib.core.TypeUtils.parseType("L179248870");
        org.mockito.asm.Type type93 = type92.getElementType();
        java.lang.String str94 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type92);
        org.mockito.asm.Type[] typeArray95 = org.mockito.cglib.core.TypeUtils.add(typeArray82, type92);
        org.mockito.asm.Type[] typeArray96 = org.mockito.cglib.core.TypeUtils.add(typeArray53, typeArray95);
        java.lang.String[] strArray97 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter40.visit(124, 7, "([Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;[Lorg/mockito/asm/Type;[Lorg/mockito/asm/Type;)LL344807196;", "L247835741", "(Ljava/lang/L;)LL261521586;", strArray97);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type0);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitSource("$28VL$3B$29I", "L774406697");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        java.lang.Class<?> wildcardClass19 = typeArray18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        java.lang.Class<?> wildcardClass25 = typeArray24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        java.lang.Class[] classArray27 = new java.lang.Class[] { wildcardClass19, wildcardClass25 };
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(100, type32);
        int int34 = type32.getSize();
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type32);
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(72, 116, "", "va", "L624131802", strArray36);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        int int5 = type0.getSort();
        int int7 = type0.getOpcode(37);
        int int9 = type0.getOpcode(154);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type0);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        org.mockito.asm.Type type16 = signature15.getReturnType();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(96, type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("short", type21, typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("short", type27, typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray29);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("<init>", type16, typeArray23);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray33);
        java.lang.String str36 = signature35.getDescriptor();
        org.mockito.asm.Type[] typeArray37 = signature35.getArgumentTypes();
        org.mockito.asm.Type[] typeArray38 = signature35.getArgumentTypes();
        int int39 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray38);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int42 = type0.getDimensions();
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L146112330", "L2093985707", "L1589298560(Ljava/lang/L;)L;", 106);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getSuperType();
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("L1068003207", false);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isArray(type0);
        int int2 = type0.getSort();
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter1.getStaticHook();
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor("$28L$3B$29Z");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("(L;)S");
        boolean boolean10 = signature7.equals((java.lang.Object) "(L;)S");
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray13);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.fromInternalName("()B");
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type21);
        boolean boolean24 = signature7.equals((java.lang.Object) type21);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        int int33 = type31.getOpcode((int) ' ');
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("int", type31, typeArray36);
        org.mockito.asm.Type[] typeArray38 = signature37.getArgumentTypes();
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray28);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local(100, type42);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type42);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type42);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray45);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getReturnType("LZ;");
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type48);
        boolean boolean50 = type21.equals((java.lang.Object) type48);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.parseTypes("L2061722705");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(57, 6, "L306758391", type21, typeArray52, "L1590759235");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L731111613", "L1680449531");
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter1.visitAnnotation("L2103731639", false);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type3.getInternalName();
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L914693455", "L679461494", "");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = classEmitter7.getAccess();
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        int int9 = type7.getOpcode((int) ' ');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("int", type7, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.getName();
        org.mockito.asm.Type[] typeArray16 = signature13.getArgumentTypes();
        boolean boolean17 = type4.equals((java.lang.Object) typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type4.getElementType();
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
        java.lang.String str6 = signature2.toString();
        java.lang.String str7 = signature2.getName();
        java.lang.String str8 = signature2.toString();
        java.lang.String str9 = signature2.getDescriptor();
        org.mockito.asm.Type type10 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type10.getDimensions();
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("L671759686");
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(102, 106, "L797917630", "L806937477", "L2012479442", strArray11);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L247330687", "L1191730876");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L240208266", "char", "L2127467946");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int4 = type1.getSize();
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("LV;", type1, typeArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        org.mockito.asm.Type type10 = signature9.getReturnType();
        org.mockito.asm.Type type11 = signature9.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type11.getDimensions();
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        java.lang.String str21 = type17.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type17.getInternalName();
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter1.visitAnnotation("L240208266", false);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter4.getStaticHook();
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("L1587696640");
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("<init>()V");
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type15);
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type15);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(46, 60, "L1026592095", "()LL715803435;", "L15717559", strArray19);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Short");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) '#', type2);
        java.lang.String str4 = type2.getClassName();
        java.lang.String str5 = type2.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type2.getElementType();
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L886492086", "L1927422628", "L$243B");
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        java.lang.String str7 = label0.toString();
        java.lang.Object obj8 = label0.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        boolean boolean16 = type9.equals((java.lang.Object) strArray15);
        label0.info = boolean16;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        java.lang.String str22 = signature21.getDescriptor();
        org.mockito.asm.Type[] typeArray23 = signature21.getArgumentTypes();
        org.mockito.asm.Type type24 = signature21.getReturnType();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type24);
        java.lang.String str26 = type24.toString();
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getPackageName(type24);
        label0.info = str27;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType("Lorg/mockito/cglib/core/Signature;");
        java.lang.String str31 = type30.toString();
        java.lang.String str32 = type30.getInternalName();
        org.mockito.asm.Type type33 = type30.getElementType();
        label0.info = type33;
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        label0.info = classAdapter40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter40.visitSource("byte(D)S", "L821524016");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitOuterClass("L1577128708", "L2042016235", "L1553345421");
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter7.getStaticHook();
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter3.visitAnnotation("L1913791289Ljava.lang", false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitEnd();
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classAdapter6.visitAnnotation("L656515792", false);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) '4', type2);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.parseTypes("V");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        java.lang.String str12 = type10.getClassName();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        int int22 = type20.getOpcode((int) ' ');
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("int", type20, typeArray25);
        org.mockito.asm.Type[] typeArray27 = signature26.getArgumentTypes();
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getBoxedType(type29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type29);
        int int32 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray27);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray27);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        java.lang.Class[] classArray37 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray33, typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L154119407", type6, typeArray41);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getBoxedType(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int44 = type43.getDimensions();
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("(D)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter3.getStaticHook();
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter1.getSuperType();
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitSource("()Ljava/lang/L800577766;", "(Ljava/lang/L;)L;");
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        int int7 = type4.getSort();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(10, type4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 154);
        int int12 = type9.getSize();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray21);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        int int32 = type30.getOpcode((int) ' ');
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("int", type30, typeArray35);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray27);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(100, type41);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type41);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type41);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        boolean boolean48 = org.mockito.cglib.core.TypeUtils.isPrimitive(type46);
        boolean boolean49 = org.mockito.cglib.core.TypeUtils.isArray(type46);
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(9, type46);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray44, type46);
        int int52 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray44);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("L179248870");
        org.mockito.asm.Type type55 = type54.getElementType();
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type54);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray44, type54);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray57);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str60 = type4.getInternalName();
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type6);
        int int12 = type6.getSort();
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type6);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type6);
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type6.getInternalName();
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("LL$3B$3B");
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(12, 140, "L901999536", "java.lang.([Lorg.mockito.asm.Type", "L441524422", strArray11);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Short");
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("L2017536669");
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        int int10 = type8.getOpcode((int) ' ');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("int", type8, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray5);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("L129800516", type2, typeArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type2.getElementType();
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L311458540", "L1996604621", "L1461338839org$2Fmockito$2Fasm$2FType", 7);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L1559594505", "L1133589996", "java/lang/L179248870");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitInnerClass("LL1226068386;", "L519587025", "L632150955", 124);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getSuperType();
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("L1104316972", "([Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;[Lorg/mockito/asm/Type;[Lorg/mockito/asm/Type;)Ljava.lang;", "L1109657447", 120);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L997948398", "L512232699", "L1293618447", 36);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        int int7 = type4.getSort();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) -1, type4);
        org.mockito.asm.Type type9 = local8.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type9.getInternalName();
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter7.visitAnnotation("L842881867", false);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter1.getClassType();
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("L270967228", "L1907616643");
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("L2021451540");
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getPackageName(type12);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("short", type17, typeArray19);
        int int21 = type17.getSort();
        java.lang.String str22 = type17.toString();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray27);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.begin_class(43, 128, "", type12, typeArray31, "L192747691");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = type3.getClassName();
        java.lang.String str5 = type3.getClassName();
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type3.getElementType();
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        java.lang.Object obj5 = label0.info;
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("short", type8, typeArray10);
        java.lang.String str12 = signature11.getName();
        label0.info = str12;
        java.lang.String str14 = label0.toString();
        java.lang.Object obj15 = label0.info;
        java.lang.String str16 = label0.toString();
        java.lang.Object obj17 = label0.info;
        java.lang.String str18 = label0.toString();
        java.lang.String str19 = label0.toString();
        java.lang.String str20 = label0.toString();
        java.lang.Object obj21 = label0.info;
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(100, type25);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type23, type25 };
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray30);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(100, type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type34, type36 };
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.asm.Type.getArgumentTypes("(L;)L;");
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray42);
        int int44 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        int int53 = type51.getOpcode((int) ' ');
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("int", type51, typeArray56);
        org.mockito.asm.Type[] typeArray58 = signature57.getArgumentTypes();
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray48, typeArray58);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray47, typeArray48);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local(100, type62);
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type62);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray60, type62);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str68 = type67.getDescriptor();
        boolean boolean69 = org.mockito.cglib.core.TypeUtils.isPrimitive(type67);
        boolean boolean70 = org.mockito.cglib.core.TypeUtils.isArray(type67);
        org.mockito.cglib.core.Local local71 = new org.mockito.cglib.core.Local(9, type67);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray65, type67);
        org.mockito.asm.Label label73 = new org.mockito.asm.Label();
        java.lang.Object obj74 = label73.info;
        java.lang.Object obj75 = label73.info;
        java.lang.String str76 = label73.toString();
        label73.info = ' ';
        org.mockito.asm.Type type79 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str80 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type79);
        java.lang.String str81 = type79.getClassName();
        label73.info = type79;
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.add(typeArray72, type79);
        org.mockito.asm.Type[] typeArray84 = org.mockito.cglib.core.TypeUtils.add(typeArray43, typeArray83);
        org.mockito.asm.Type type86 = org.mockito.cglib.core.TypeUtils.parseType("L63122622");
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray83, type86);
        org.mockito.asm.Type[] typeArray88 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray83);
        label0.info = typeArray83;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray90 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray83);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getPackageName(type11);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getReturnType("Short");
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getBoxedType(type24);
        int int26 = type25.getSize();
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type25);
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(129, 13, "L631316554", "LL1734454234;", "VoidL1111712985", strArray28);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 1, type6);
        java.lang.String str9 = type6.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type6.getInternalName();
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter1.getClassType();
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type3.getDimensions();
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter1.visitAnnotation("", true);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitInnerClass("L23070008(V)D", "L250027111", "L1913791289Ljava.lang", 6);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("L1044543108", true);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        int int7 = type4.getSort();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("L205843408", type4, typeArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        int int21 = type19.getOpcode((int) ' ');
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("int", type19, typeArray24);
        org.mockito.asm.Type[] typeArray26 = signature25.getArgumentTypes();
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray16);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(100, type30);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type30);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type30);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray35 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getSuperType();
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L1123496771", "L519463351", "", 120);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1389083894", "LInt;", "java");
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("L1956791564");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.mockito.asm.Type type9 = type8.getElementType();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(112, type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type13);
        int int16 = type13.getSize();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("LV;", type13, typeArray17);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        org.mockito.asm.Type type23 = signature21.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.declare_field(126, "()Ljava/lang/Void;", type9, (java.lang.Object) signature21);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        org.mockito.asm.Type[] typeArray16 = signature15.getArgumentTypes();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType("Short");
        int int19 = type18.getSize();
        java.lang.String str20 = type18.getClassName();
        java.lang.String str21 = type18.toString();
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type18);
        int int23 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray16);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        java.lang.Class<?> wildcardClass28 = typeArray27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.cglib.core.Signature signature33 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
        org.mockito.asm.Type type34 = signature33.getReturnType();
        java.lang.Class<?> wildcardClass35 = signature33.getClass();
        java.lang.String str36 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass35);
        java.lang.String str37 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray40);
        java.lang.Class<?> wildcardClass42 = typeArray41.getClass();
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass42);
        java.lang.String str44 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass42);
        java.lang.String str45 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        java.lang.String str47 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray50);
        java.lang.Class<?> wildcardClass52 = typeArray51.getClass();
        java.lang.String str53 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass52);
        java.lang.String str54 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass52);
        java.lang.String str55 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass52);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass52);
        java.lang.String str57 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass52);
        java.lang.Class[] classArray58 = new java.lang.Class[] { wildcardClass28, wildcardClass35, wildcardClass42, wildcardClass52 };
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.getTypes(classArray58);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray63 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.getTypes(classArray63);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("short", type62, typeArray64);
        int int66 = type62.getSort();
        java.lang.String str67 = type62.toString();
        java.lang.String str68 = type62.toString();
        java.lang.String str69 = org.mockito.cglib.core.TypeUtils.getClassName(type62);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray59, type62);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.INT_TYPE;
        int int74 = type72.getOpcode((int) ' ');
        java.lang.String[] strArray76 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray76);
        org.mockito.cglib.core.Signature signature78 = new org.mockito.cglib.core.Signature("int", type72, typeArray77);
        org.mockito.asm.Type[] typeArray79 = signature78.getArgumentTypes();
        org.mockito.asm.Type type81 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type82 = org.mockito.cglib.core.TypeUtils.getBoxedType(type81);
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.add(typeArray79, type81);
        java.lang.String[] strArray85 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray86 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray85);
        java.lang.Class[] classArray87 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray88 = org.mockito.cglib.core.TypeUtils.getTypes(classArray87);
        org.mockito.asm.Type[] typeArray89 = org.mockito.cglib.core.TypeUtils.add(typeArray86, typeArray88);
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.add(typeArray79, typeArray88);
        org.mockito.asm.Type[] typeArray91 = org.mockito.cglib.core.TypeUtils.add(typeArray70, typeArray79);
        org.mockito.asm.Type[] typeArray92 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray91);
        java.lang.String[] strArray93 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(1, 51, "L2035081690", "Lorg/mockito/asm/Label;", "<init>(Ljava/lang/L1587696640;L(L;)Z;)V", strArray93);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type16);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        java.lang.String str21 = signature20.getName();
        java.lang.String str22 = signature20.getDescriptor();
        java.lang.String str23 = signature20.toString();
        org.mockito.asm.Type type24 = signature20.getReturnType();
        java.lang.String str25 = type24.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type24.getInternalName();
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        java.lang.String str7 = label0.toString();
        java.lang.Object obj8 = label0.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        boolean boolean16 = type9.equals((java.lang.Object) strArray15);
        label0.info = boolean16;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        java.lang.String str22 = signature21.getDescriptor();
        org.mockito.asm.Type[] typeArray23 = signature21.getArgumentTypes();
        org.mockito.asm.Type type24 = signature21.getReturnType();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type24);
        java.lang.String str26 = type24.toString();
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getPackageName(type24);
        label0.info = str27;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType("Lorg/mockito/cglib/core/Signature;");
        java.lang.String str31 = type30.toString();
        java.lang.String str32 = type30.getInternalName();
        org.mockito.asm.Type type33 = type30.getElementType();
        label0.info = type33;
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        label0.info = classAdapter40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classAdapter40.visitAnnotation("L546515263", true);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitInnerClass("L948325362", "(Ljava/lang/L;LL;;)L;", "L2021451540(DV)V", 114);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.String str9 = label6.toString();
        java.lang.Object obj10 = label6.info;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type14);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type18);
        org.mockito.asm.Type type20 = type18.getElementType();
        label6.info = type20;
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        int int34 = type32.getOpcode((int) ' ');
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("int", type32, typeArray37);
        org.mockito.asm.Type[] typeArray39 = signature38.getArgumentTypes();
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type41);
        int int44 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray39);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray39);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        boolean boolean48 = org.mockito.cglib.core.TypeUtils.isPrimitive(type46);
        boolean boolean49 = org.mockito.cglib.core.TypeUtils.isArray(type46);
        java.lang.String str50 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type46);
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray52 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray51);
        boolean boolean53 = type46.equals((java.lang.Object) strArray52);
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type46);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type46);
        boolean boolean56 = type20.equals((java.lang.Object) type46);
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        java.lang.String str58 = org.mockito.cglib.core.TypeUtils.getPackageName(type20);
        int int60 = type20.getOpcode(40);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.parseTypes("L671759686");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(43, 68, "L919910059", type20, typeArray62, "L105818412");
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        java.lang.String str6 = label4.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type7);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        label4.info = type7;
        label0.info = type7;
        java.lang.Object obj12 = label0.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.String str15 = label13.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        label13.info = type16;
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        label0.info = type20;
        int int23 = type20.getOpcode(10);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getPackageName(type20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type20.getInternalName();
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("hi!()Ljava/lang/Short;");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("short", type17, typeArray19);
        int int21 = type17.getSort();
        java.lang.String str22 = type17.toString();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray27);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray31);
        int int33 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray31);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type14, typeArray31);
        java.lang.String[] strArray35 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(24, 96, "L1283452710", "$242428Ljava$24242Flang$24242FL$24243BLL$24243B$24243B$242429L$24243B", "Java.lang", strArray35);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(9, type22);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type22);
        int int28 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter6.getStaticHook();
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1589298560", "(Ljava/lang/L;)L;");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.String str8 = signature7.getDescriptor();
        org.mockito.asm.Type[] typeArray9 = signature7.getArgumentTypes();
        org.mockito.asm.Type type10 = signature7.getReturnType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type11);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        int int19 = type17.getOpcode((int) ' ');
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("int", type17, typeArray22);
        org.mockito.asm.Type[] typeArray24 = signature23.getArgumentTypes();
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getBoxedType(type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type26);
        int int29 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray24);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray24);
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray30);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitInnerClass("VoidZ", "L1044543108", "L836896655", 160);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visitInnerClass("L391281396", "L1900320204", "(Ljava/lang/V;LV;)Ljava/lang/Short;", 141);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        int int7 = type4.getSort();
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isArray(type4);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type4);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getPackageName(type4);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(120, type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type4.getDimensions();
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isArray(type0);
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L1523460067", "L1943638160", "L509125298", 102);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type3.getInternalName();
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        org.mockito.asm.Type type5 = signature4.getReturnType();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type5);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(37, type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type8.getElementType();
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("Ljava/lang/Short;", "java.lang(L;)LV;");
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        java.lang.String str7 = label0.toString();
        java.lang.Object obj8 = label0.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        boolean boolean16 = type9.equals((java.lang.Object) strArray15);
        label0.info = boolean16;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        java.lang.String str22 = signature21.getDescriptor();
        org.mockito.asm.Type[] typeArray23 = signature21.getArgumentTypes();
        org.mockito.asm.Type type24 = signature21.getReturnType();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type24);
        java.lang.String str26 = type24.toString();
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getPackageName(type24);
        label0.info = str27;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType("Lorg/mockito/cglib/core/Signature;");
        java.lang.String str31 = type30.toString();
        java.lang.String str32 = type30.getInternalName();
        org.mockito.asm.Type type33 = type30.getElementType();
        label0.info = type33;
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        label0.info = classAdapter40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter40.visitSource("L373376193", "L182804611");
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type5.getDimensions();
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("(Ljava/lang/L;Ljava/lang/hi!;)LL;;", true);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        java.lang.Class<?> wildcardClass14 = typeArray13.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        java.lang.Class<?> wildcardClass21 = signature19.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        java.lang.Class<?> wildcardClass28 = typeArray27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        java.lang.Class<?> wildcardClass38 = typeArray37.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        java.lang.String str40 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        java.lang.String str41 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass14, wildcardClass21, wildcardClass28, wildcardClass38 };
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.getTypes(classArray44);
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(14, 0, "([Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;[Lorg/mockito/asm/Type;[Lorg/mockito/asm/Type;)Ljava.lang;", "L1510935797(L;)Ljava/lang/Double;", "()LL2061722705;", strArray46);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(100, type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        boolean boolean11 = type0.equals((java.lang.Object) signature10);
        int int12 = type0.getSort();
        int int13 = type0.getSort();
        java.lang.String str14 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type0.getInternalName();
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1384125117", "L400966109");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(L;)LV;", "L105818412", "L1461668329", 126);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        int int19 = type17.getOpcode((int) ' ');
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("int", type17, typeArray22);
        org.mockito.asm.Type[] typeArray24 = signature23.getArgumentTypes();
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray14);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(100, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type28);
        int int32 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray26);
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(76, 48, "Int", "L1890775947", "", strArray33);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitEnd();
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type13 = type12.getElementType();
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("V");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        java.lang.String str19 = type17.getClassName();
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("short", type13, typeArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(126, 24, "L1619152913L915517561", "", "B", strArray22);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter4.getClassType();
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter1.visitAnnotation("L1576241014", true);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L1212512215", "L1439239914", "L441524422", (int) ' ');
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("L1582115020");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        int int18 = type16.getOpcode((int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type16, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        int int28 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        java.lang.Class[] classArray33 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.getTypes(classArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray35);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang");
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type38);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type38);
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(7, 129, "L141427502", "(DVL;D)V", "L1463485995", strArray42);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        java.lang.Class<?> wildcardClass19 = typeArray18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        java.lang.Class<?> wildcardClass25 = typeArray24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        java.lang.Class[] classArray27 = new java.lang.Class[] { wildcardClass19, wildcardClass25 };
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) '#', 45, "L105818412", "LL1956791564;", "(Ljava/lang/Short;)LL690497409;", strArray30);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("(L;)Ljava/lang;", "L583548120", "L1085761414");
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter5.getClassType();
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("(Ljava/lang/L1587696640;)LV;", "L2088524853", "(Ljava/lang/L97952760;)V");
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        java.lang.String str2 = type0.getClassName();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str6 = type5.toString();
        java.lang.String str7 = type5.toString();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("L;", type5, typeArray13);
        java.lang.String str15 = signature14.getName();
        java.lang.String str16 = signature14.toString();
        java.lang.String str17 = signature14.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getBoxedType(type19);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.getPackageName(type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray27);
        org.mockito.asm.Type type29 = signature28.getReturnType();
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.Object obj31 = label30.info;
        java.lang.String str32 = label30.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type33);
        label30.info = type33;
        boolean boolean37 = signature28.equals((java.lang.Object) label30);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray38);
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray38);
        java.lang.Class[] classArray41 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.getTypes(classArray41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray45 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray44);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray43, typeArray46);
        boolean boolean48 = signature28.equals((java.lang.Object) typeArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean53 = org.mockito.cglib.core.TypeUtils.isPrimitive(type52);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray51, type52);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray51, type56);
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean62 = org.mockito.cglib.core.TypeUtils.isPrimitive(type61);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.add(typeArray60, type61);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray57, typeArray63);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str66 = type65.getDescriptor();
        boolean boolean67 = org.mockito.cglib.core.TypeUtils.isPrimitive(type65);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray63, type65);
        java.lang.String str69 = org.mockito.cglib.core.TypeUtils.getClassName(type65);
        int int71 = type65.getOpcode(11);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type65);
        boolean boolean73 = signature14.equals((java.lang.Object) typeArray46);
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type75 = type0.getElementType();
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(14, 101, "L1308140228int", "", "", strArray13);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L88758928([Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;[Lorg/mockito/asm/Type;[Lorg/mockito/asm/Type;S)L(L;", true);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter3.getStaticHook();
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter4.getSuperType();
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("L546515263");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("L2061722705");
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isArray(type14);
        int int16 = type14.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.declare_field(45, "L726354382", type12, (java.lang.Object) int16);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.end_class();
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitInnerClass("t", "hi!()Ljava/lang/Short;", "L1156082285", 18);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter1.visitAnnotation("L1914936582", false);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 154);
        int int5 = type2.getSize();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray0, typeArray8);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        int int26 = type24.getOpcode((int) ' ');
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("int", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getBoxedType(type33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type33);
        int int36 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray31);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray31);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        java.lang.Class[] classArray41 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.getTypes(classArray41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray40, typeArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray37, typeArray43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang");
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.getClassName(type46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray37, type46);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray37);
        org.mockito.cglib.core.Signature signature50 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray49);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.getType("L344807196");
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray49, type52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("(DLjava/lang/L179248870;)LShort;", "Ljava$2Flang$2F$28L$3B", "L1281001695");
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.end_class();
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter4.getAccess();
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isPrimitive(type13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type16);
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((-1), (int) (short) -1, "L1257879225", "L819845527", "L1191730876", strArray22);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1461338839");
        org.mockito.asm.Type[] typeArray2 = signature1.getArgumentTypes();
        int int3 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type9 = type8.getElementType();
        java.lang.String str10 = type8.getClassName();
        boolean boolean11 = type4.equals((java.lang.Object) str10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type4);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("<init>()V");
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        java.lang.String str19 = type17.getInternalName();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(133, type17);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.cglib.core.Signature signature26 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.Class[] classArray27 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray28);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type23, typeArray29);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray29);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter2.getClassType();
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        java.lang.String str22 = signature21.toString();
        org.mockito.asm.Type type23 = signature21.getReturnType();
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type24.getDimensions();
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        int int14 = type12.getOpcode((int) ' ');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("int", type12, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getBoxedType(type21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type21);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        java.lang.Class[] classArray27 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit((int) (short) 100, 46, "L1442474460", "(Ljava/lang/L2092251054;)V", "L1288037373", strArray33);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.mockito.asm.Type[] typeArray5 = signature4.getArgumentTypes();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType("Short");
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        java.lang.String str10 = type7.toString();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray5, type7);
        int int12 = type7.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type7.getElementType();
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classAdapter9.visitAnnotation("()L(L;)S;", false);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.parseType("L1340227649");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor9 = classAdapter2.visitField(134, "<init>(Ljava/lang/(;)V", "(V)Lt;", "L1607015094", (java.lang.Object) "L1340227649");
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L375237970", "L1546645648");
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java/lang/Short");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("L1913235182", "L1293550562", "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("java/lang/L179248870", "L266151688");
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter5.visitAnnotation("L1051708960", false);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Short");
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("L2014521690");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean12 = type9.equals((java.lang.Object) type11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        int int14 = type9.getDimensions();
        int int16 = type9.getOpcode((int) (byte) 10);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        int int18 = type9.getDimensions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) ' ', "L1415996597", type7, (java.lang.Object) type9);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter7.visitAnnotation("(L;Lint;)V", false);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classAdapter6.visitAnnotation("", false);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter1.getSuperType();
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitInnerClass("L265575629", "L1325164241", "L1112924525", 123);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        java.lang.String str7 = label0.toString();
        java.lang.Object obj8 = label0.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        int int11 = type9.getSort();
        label0.info = type9;
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(100, type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.asm.Type.getArgumentTypes("(L;)L;");
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray22);
        label0.info = typeArray23;
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("L919398882", true);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(9, type22);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type22);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        boolean boolean29 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type22.getInternalName();
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        java.lang.Class<?> wildcardClass21 = typeArray20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        java.lang.Class<?> wildcardClass27 = typeArray26.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass21, wildcardClass27 };
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(39, (int) (byte) 0, "L328063162", "L1729557986", "L1493297660", strArray32);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classAdapter6.visitAnnotation("<init>$2428S$2429V", true);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(100, type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type5, type7 };
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        boolean boolean12 = type1.equals((java.lang.Object) signature11);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.parseTypes("L;(Ljava/lang/L;LV;)L;");
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("L1202418377", type1, typeArray14);
        int int16 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type1.getDimensions();
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type2);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        int int14 = type12.getOpcode((int) ' ');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("int", type12, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray9);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isPrimitive(type23);
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isArray(type23);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        int int29 = type23.getOpcode(1);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        boolean boolean31 = type2.equals((java.lang.Object) type23);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        int int35 = type33.getOpcode((int) ' ');
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("int", type33, typeArray38);
        org.mockito.asm.Type[] typeArray40 = signature39.getArgumentTypes();
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getBoxedType(type42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type42);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        java.lang.Class[] classArray48 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.getTypes(classArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray47, typeArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray40, typeArray49);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("L915517561", type23, typeArray40);
        boolean boolean53 = org.mockito.cglib.core.TypeUtils.isPrimitive(type23);
        java.lang.Class[] classArray54 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("L658648001", type23, typeArray61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int63 = type23.getDimensions();
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitEnd();
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("L1149515289", "L1337782628", "L2124137407");
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        java.lang.Class<?> wildcardClass4 = typeArray3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        org.mockito.asm.Type type10 = signature9.getReturnType();
        java.lang.Class<?> wildcardClass11 = signature9.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        java.lang.Class<?> wildcardClass18 = typeArray17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        java.lang.Class<?> wildcardClass28 = typeArray27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray34 = new java.lang.Class[] { wildcardClass4, wildcardClass11, wildcardClass18, wildcardClass28 };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray39);
        java.lang.String str41 = type36.getClassName();
        int int42 = type36.getSort();
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type36);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean46 = type44.equals((java.lang.Object) 154);
        int int47 = type44.getSize();
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray49);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray43, typeArray50);
        org.mockito.cglib.core.Signature signature53 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray52);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        boolean boolean7 = signature2.equals((java.lang.Object) "java.lang");
        java.lang.String str8 = signature2.getName();
        org.mockito.asm.Type type9 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type9.getDimensions();
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type3.getDimensions();
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter3.getStaticHook();
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor16 = classEmitter4.visitField(10, "Java/lang/([Lorg/mockito/asm/Type", "(L;S)Ljava/lang/L179248870;", "()Lt;", (java.lang.Object) typeArray14);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter2.visitField(163, "", "(L;D)L;", "L1888571632", (java.lang.Object) (-1L));
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter7.visitAnnotation("L752373026", true);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isArray(type0);
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type0);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(56, 7, "L528385559", "L1529198767", "L1945797634", strArray11);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getSuperType();
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(100, type8);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("Void");
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type11);
        java.lang.String str13 = type11.getDescriptor();
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("(L;)Z");
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(27, "L789953960", type8, (java.lang.Object) signature17);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type15);
        int int18 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray13);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean24 = type21.equals((java.lang.Object) type23);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        int int26 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type23);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) '4', type2);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(156, type6);
        org.mockito.asm.Type type8 = local7.getType();
        int int9 = local7.getIndex();
        org.mockito.asm.Type type10 = local7.getType();
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        int int13 = type10.getOpcode(5);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type10.getInternalName();
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(28, 18, "L205357731", "L1748075661", "L1339579025", strArray16);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type6);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type16);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        java.lang.String str21 = signature20.getName();
        java.lang.String str22 = signature20.getDescriptor();
        java.lang.String str23 = signature20.toString();
        org.mockito.asm.Type[] typeArray24 = signature20.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test862");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("", "L1304940463");
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test863");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test864");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L12722974", "L1113563324", "L2021451540(DV)V");
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test865");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        org.mockito.asm.Type type16 = signature15.getReturnType();
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        boolean boolean18 = type12.equals((java.lang.Object) type17);
        java.lang.String str19 = type17.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getBoxedType(type21);
        boolean boolean23 = type17.equals((java.lang.Object) type21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type24);
        int int27 = type24.getSize();
        java.lang.String str28 = type24.getDescriptor();
        boolean boolean29 = type21.equals((java.lang.Object) str28);
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type21);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor32 = classEmitter6.visitField(0, "L1461338839org$242Fmockito$242Fasm$242FType", "LL46545857;", "", (java.lang.Object) str31);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test866");
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        org.mockito.asm.Type type5 = signature4.getReturnType();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type5);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(37, type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type5.getElementType();
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test867");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type15);
        int int18 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray13);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getType("()B");
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test868");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.getTypes(classArray7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray9);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type12.getElementType();
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test869");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter5.visitAnnotation("L1392117660", true);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test870");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("java$2Elang$2EL179248870", false);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test871");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L1996604621", "L1232248458");
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test872");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1990914316");
        java.lang.String str2 = signature1.getName();
        org.mockito.asm.Type type3 = signature1.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type3.getInternalName();
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test873");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        java.lang.String str5 = type4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type4.getElementType();
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test874");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitSource("Java$2Elang", "LV;");
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test875");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("(L;D)Lt;");
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray4);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        int int11 = type9.getOpcode((int) ' ');
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("int", type9, typeArray14);
        org.mockito.asm.Type[] typeArray16 = signature15.getArgumentTypes();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray6);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(100, type20);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type20);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        boolean boolean27 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isArray(type25);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(9, type25);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        java.lang.Object obj32 = label31.info;
        java.lang.Object obj33 = label31.info;
        java.lang.String str34 = label31.toString();
        label31.info = ' ';
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type37);
        java.lang.String str39 = type37.getClassName();
        label31.info = type37;
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type37);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray41);
        int int43 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test876");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.mockito.asm.Type[] typeArray5 = signature4.getArgumentTypes();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType("Short");
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        java.lang.String str10 = type7.toString();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray5, type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type7.getInternalName();
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test877");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.Object obj2 = label1.info;
        java.lang.String str3 = label1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        label1.info = type4;
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(158, type4);
        int int10 = local9.getIndex();
        org.mockito.asm.Type type11 = local9.getType();
        int int12 = local9.getIndex();
        org.mockito.asm.Type type13 = local9.getType();
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isPrimitive(type13);
        java.lang.String str15 = type13.getClassName();
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type16.getInternalName();
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test878");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.getTypes(classArray3);
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("short", type2, typeArray4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isPrimitive(type6);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type6);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        java.lang.String str11 = type6.getClassName();
        java.lang.String str12 = type6.toString();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type6);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type14.getElementType();
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test879");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test880");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("L2078249401");
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(2, type15);
        org.mockito.asm.Type type18 = local17.getType();
        int int19 = local17.getIndex();
        org.mockito.asm.Type type20 = local17.getType();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class[] classArray24 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        java.lang.String str31 = signature30.toString();
        java.lang.String str32 = signature30.toString();
        org.mockito.asm.Type[] typeArray33 = signature30.getArgumentTypes();
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.fromInternalName("Ljava/lang/Short;");
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getBoxedType(type35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(160, 19, "(Ljava/lang/Z;)LL;;", type20, typeArray37, "(Ljava/lang/L2061722705;)V");
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test881");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L2109823692", "L1899493710");
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test882");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) '4', type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type1.getElementType();
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test883");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) '4', type2);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type2);
        int int6 = type2.getSize();
        java.lang.String str7 = type2.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(13, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type2.getElementType();
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test884");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L1946209614", "$28Ljava$2Flang$2FL$3BLL$3B$3B$29L$3B", "L2024126109", (-1));
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test885");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter1.getSuperType();
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test886");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type16);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getBoxedType(type24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray26);
        int int28 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test887");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test888");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitSource("Short", "Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test889");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitEnd();
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test890");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter5.getStaticHook();
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test891");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test892");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter1.getClassType();
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test893");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test894");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("LL112571900;", "short", "L2071127275");
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test895");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter9.visitAnnotation("(Ljava/lang/(Ljava/lang/L97952760;;)V", false);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test896");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test897");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitEnd();
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test898");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        int int18 = type16.getOpcode((int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type16, typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(65, 26, "L1774861680L690312719", "double", "L1057849056", strArray23);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test899");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        int int6 = type3.getSort();
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type3.getElementType();
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test900");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 1, type6);
        java.lang.String str9 = type6.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type6.getDimensions();
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test901");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter6.visitAnnotation("L164090058", true);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test902");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.Object obj2 = label1.info;
        java.lang.String str3 = label1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        label1.info = type4;
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(158, type4);
        int int10 = type4.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type4.getInternalName();
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test903");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter8.getStaticHook();
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test904");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("<init>()V");
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        java.lang.String str14 = type12.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("(L;Lint;L;D)Ljava/lang/Short;");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type18);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type18);
        int int21 = type18.getSize();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("LV;", type18, typeArray22);
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class((int) (byte) 0, 0, "(Ljava/lang/L;LV;L;L()D;)Lorg/mockito/cglib/core/Signature;", type12, typeArray22, "L2093985707");
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test905");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter1.getClassType();
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test906");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter6.visitField(120, "L1108954307", "([Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/ClassEmitter;Lorg/mockito/asm/Type;[Lorg/mockito/asm/Type;LL725236413;)L(L;", "L1294005217", (java.lang.Object) "L572686019");
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test907");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type6);
        java.lang.String str12 = type6.toString();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.mockito.asm.Type type19 = signature18.getReturnType();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(96, type19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(100, type22);
        int int24 = type22.getSize();
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type34 = type33.getElementType();
        int int35 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type33);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type33);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("L897927500", type19, typeArray36);
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.cglib.core.Signature signature41 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.getTypes(classArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray44, typeArray47);
        org.mockito.cglib.core.Signature signature49 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray47);
        org.mockito.asm.Type[] typeArray50 = signature49.getArgumentTypes();
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("$5BLorg$2Fmockito$2Fasm$2FType$3B", type19, typeArray50);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type53 = type6.getElementType();
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test908");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("(L;D)Lt;");
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("<init>(S)V");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("java.lang.Void", type2, typeArray4);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        org.mockito.asm.Type type10 = signature9.getReturnType();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(96, type10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        int int15 = type13.getOpcode((int) ' ');
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("int", type13, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = signature19.getName();
        org.mockito.asm.Type[] typeArray22 = signature19.getArgumentTypes();
        boolean boolean23 = type10.equals((java.lang.Object) typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type10);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray25);
        java.lang.String str28 = signature27.toString();
        org.mockito.asm.Type[] typeArray29 = signature27.getArgumentTypes();
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test909");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getClassType();
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test910");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("L13599281", "L1269115306");
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test911");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("org/mockito/asm/Type", "java.lang.Byte");
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test912");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("$245BLorg$242Fmockito$242Fasm$242FType$243B", false);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test913");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("L2021451540");
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        int int27 = type25.getOpcode((int) ' ');
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("int", type25, typeArray30);
        org.mockito.asm.Type[] typeArray32 = signature31.getArgumentTypes();
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray22);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(100, type36);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type36);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        boolean boolean43 = org.mockito.cglib.core.TypeUtils.isPrimitive(type41);
        boolean boolean44 = org.mockito.cglib.core.TypeUtils.isArray(type41);
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(9, type41);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type41);
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type41);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean52 = org.mockito.cglib.core.TypeUtils.isPrimitive(type51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type51);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type55);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray58);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean61 = org.mockito.cglib.core.TypeUtils.isPrimitive(type60);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray59, type60);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.add(typeArray56, typeArray62);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("L806937477", type41, typeArray63);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor66 = classEmitter4.visitField(6, "L1424602353", "([Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;[Lorg/mockito/asm/Type;[Lorg/mockito/asm/Type;)[Lorg/mockito/asm/Type;", "(Ljava/lang/Short;)V", (java.lang.Object) str65);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test914");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1965546123", "L115210646");
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test915");
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        org.mockito.asm.Type type5 = signature4.getReturnType();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getPackageName(type5);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        java.lang.Class<?> wildcardClass13 = typeArray12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.mockito.asm.Type type19 = signature18.getReturnType();
        java.lang.Class<?> wildcardClass20 = signature18.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        java.lang.Class<?> wildcardClass27 = typeArray26.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray35 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        java.lang.Class<?> wildcardClass37 = typeArray36.getClass();
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass37);
        java.lang.String str39 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass37);
        java.lang.String str40 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        java.lang.String str42 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass37);
        java.lang.Class[] classArray43 = new java.lang.Class[] { wildcardClass13, wildcardClass20, wildcardClass27, wildcardClass37 };
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.getTypes(classArray43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.getTypes(classArray43);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.getTypes(classArray43);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray43);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("L600964006", type5, typeArray47);
        org.mockito.asm.Type type49 = signature48.getReturnType();
        org.mockito.asm.Type type50 = signature48.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int51 = type50.getDimensions();
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test916");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitInnerClass("L1104879004", "L1154338856", "LL671759686;", 136);
    }
}

