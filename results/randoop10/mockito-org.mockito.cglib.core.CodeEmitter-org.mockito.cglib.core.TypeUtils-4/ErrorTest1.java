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
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        int int9 = type7.getOpcode((int) ' ');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("int", type7, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type16);
        int int19 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray14);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray14);
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("short", type25, typeArray27);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray32 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("short", type31, typeArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        boolean boolean39 = org.mockito.cglib.core.TypeUtils.isArray(type36);
        java.lang.String str40 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        boolean boolean43 = type36.equals((java.lang.Object) strArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray42);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray33, typeArray44);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray44);
        org.mockito.cglib.core.Signature signature47 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray46);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter52);
        boolean boolean54 = signature47.equals((java.lang.Object) classEmitter53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = classEmitter53.visitAnnotation("L468850997", true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
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
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        java.lang.Class<?> wildcardClass15 = typeArray14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.lang.String str21 = type20.toString();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(118, type20);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        java.lang.Class<?> wildcardClass27 = typeArray26.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.declare_field(123, "L1135218984", type20, (java.lang.Object) type33);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("D");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        int int8 = type5.getDimensions();
        boolean boolean9 = signature1.equals((java.lang.Object) int8);
        org.mockito.asm.Type type10 = signature1.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type10.getInternalName();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1681371721", "(L;Lint;L;D)D");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.String str9 = label6.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.String str12 = label10.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type13);
        label10.info = type13;
        label6.info = type13;
        java.lang.Object obj18 = label6.info;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.String str21 = label19.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type22);
        label19.info = type22;
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type22);
        label6.info = type26;
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray5, type26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        java.lang.String str35 = type18.getInternalName();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.String str12 = signature11.toString();
        org.mockito.asm.Type[] typeArray13 = signature11.getArgumentTypes();
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(51, 129, "L1509703323", "L557952694", "L1046230809", strArray14);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.parseType("L254817653");
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        java.lang.String str6 = label4.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type7);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        label4.info = type7;
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isPrimitive(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type15);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type19);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isPrimitive(type24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isPrimitive(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type28);
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        int int41 = type39.getOpcode((int) ' ');
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("int", type39, typeArray44);
        org.mockito.asm.Type[] typeArray46 = signature45.getArgumentTypes();
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray36);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(100, type50);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type50);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray48, type50);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        boolean boolean57 = org.mockito.cglib.core.TypeUtils.isPrimitive(type55);
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isArray(type55);
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local(9, type55);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray53, type55);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray62);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean65 = org.mockito.cglib.core.TypeUtils.isPrimitive(type64);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray63, type64);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray63, type68);
        org.mockito.asm.Type type70 = type68.getElementType();
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray72);
        org.mockito.asm.Type type74 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean75 = org.mockito.cglib.core.TypeUtils.isPrimitive(type74);
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.add(typeArray73, type74);
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type70, typeArray76);
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.add(typeArray60, typeArray76);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray76);
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("L461775541", type7, typeArray76);
        org.mockito.asm.Type[] typeArray81 = signature80.getArgumentTypes();
        org.mockito.asm.Type[] typeArray82 = signature80.getArgumentTypes();
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("VoidL57490732", type2, typeArray82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray84 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray82);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("short", type13, typeArray15);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("short", type19, typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type24);
        boolean boolean27 = org.mockito.cglib.core.TypeUtils.isArray(type24);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        boolean boolean31 = type24.equals((java.lang.Object) strArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray32);
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visit(3, 64, "ort", "L723999223", "L694958196", strArray34);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        int int23 = type21.getOpcode((int) ' ');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("int", type21, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray18);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(100, type32);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type32);
        int int36 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray30);
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit((int) '#', 61, "L1021231359", "", "org.mockito.cglib.core.LocalVariablesSorter", strArray37);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.getTypes(classArray5);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray0, typeArray2);
        int int9 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray0);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("L2102838683");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("(L;)Z");
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray0, typeArray11);
        int int17 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray0);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        int int27 = type25.getOpcode((int) ' ');
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("int", type25, typeArray30);
        org.mockito.asm.Type[] typeArray32 = signature31.getArgumentTypes();
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getBoxedType(type34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type34);
        int int37 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray32);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray32);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray32);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray0, typeArray39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.getClassName(type42);
        boolean boolean44 = org.mockito.cglib.core.TypeUtils.isArray(type42);
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray47 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
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
        java.lang.Object obj18 = label0.info;
        java.lang.String str19 = label0.toString();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(96, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(100, type28);
        int int30 = type28.getSize();
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        java.lang.Class[] classArray34 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray33, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type40 = type39.getElementType();
        int int41 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type39);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1946184762", type25, typeArray42);
        java.lang.String str44 = signature43.getName();
        org.mockito.asm.Type type45 = signature43.getReturnType();
        int int46 = type45.getSort();
        label0.info = type45;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = type45.getInternalName();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type23.getElementType();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L2077037554");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type3.getInternalName();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.getTypes(classArray3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray0, typeArray4);
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type8);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type8);
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
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isPrimitive(type29);
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type29);
        int int35 = type29.getOpcode(1);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type29);
        boolean boolean37 = type8.equals((java.lang.Object) type29);
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(100, type29);
        org.mockito.asm.Type type39 = local38.getType();
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray5, type39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray41 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray40);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        java.lang.String str11 = signature10.getDescriptor();
        java.lang.String str12 = signature10.toString();
        java.lang.String str13 = signature10.getName();
        org.mockito.asm.Type type14 = signature10.getReturnType();
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type17);
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getPackageName(type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type18, typeArray25);
        org.mockito.asm.Type type27 = signature26.getReturnType();
        java.lang.String str28 = signature26.getName();
        org.mockito.asm.Type[] typeArray29 = signature26.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(117, 167, "<init>(Ljava/lang/L2102838683;L(L;)Z;)V", type14, typeArray29, "L523421000");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        int int5 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
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
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray19);
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(135, 108, "(Ljava/lang/L96243402;)LLLorg/mockito/cglib/core/Signature;", "", "L1597927696", strArray24);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
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
        java.lang.String str12 = type11.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type11.getDimensions();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("Z");
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("java.lang", type1, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type1.getElementType();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type0);
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
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
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean15 = type12.equals((java.lang.Object) type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray21);
        int int23 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray21);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visit(76, 0, "(DVL;D)V", "L1232290675", "L1240796012", strArray26);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type16);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(123, 68, "L1289931863", "L708934237", "L1956267534", strArray18);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("L466701499");
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        java.lang.String str9 = type7.toString();
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
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray49 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("short", type48, typeArray50);
        int int52 = type48.getSort();
        java.lang.String str53 = type48.toString();
        java.lang.String str54 = type48.toString();
        java.lang.String str55 = org.mockito.cglib.core.TypeUtils.getClassName(type48);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type48);
        int int57 = type48.getSize();
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.getBoxedType(type48);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type48);
        org.mockito.cglib.core.Signature signature61 = org.mockito.cglib.core.TypeUtils.parseConstructor("L551359349");
        java.lang.String str62 = signature61.getName();
        org.mockito.asm.Type[] typeArray63 = signature61.getArgumentTypes();
        org.mockito.asm.Type[] typeArray64 = signature61.getArgumentTypes();
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(17, 33, "L1671044050", type7, typeArray64, "L1314252216");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        java.lang.String str5 = type0.getClassName();
        int int6 = type0.getSize();
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type7.getElementType();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Short");
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("short", type7, typeArray9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("short", type13, typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray15);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("L2102838683");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("(L;)Z");
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        java.lang.Class<?> wildcardClass29 = typeArray28.getClass();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        int int32 = type31.getSize();
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type31);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        int int36 = type1.getOpcode((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type37 = type1.getElementType();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
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
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visit(112, 141, "L1936382936", "L180252898", "(Ljava/lang/L1363557895;)V", strArray21);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        int int6 = type4.getOpcode((int) ' ');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("int", type4, typeArray9);
        org.mockito.asm.Type[] typeArray11 = signature10.getArgumentTypes();
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type13);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("L$3B", type2, typeArray11);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        org.mockito.asm.Type type19 = signature18.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type19.getDimensions();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
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
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        java.lang.String str19 = signature18.getDescriptor();
        java.lang.String str20 = signature18.getDescriptor();
        java.lang.String str21 = signature18.getName();
        org.mockito.asm.Type[] typeArray22 = signature18.getArgumentTypes();
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visit((int) (short) 0, 127, "(Ljava.lang", "java/lang/java", "(Ljava/lang/L2116695960;)L<init>()V;", strArray23);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        org.mockito.asm.Type[] typeArray26 = signature25.getArgumentTypes();
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str29 = type28.toString();
        int int31 = type28.getOpcode(8);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        java.lang.String str33 = type32.getDescriptor();
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isPrimitive(type32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type32);
        int int36 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray26);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray26);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str40 = type39.toString();
        int int42 = type39.getOpcode(8);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type39);
        java.lang.String str44 = type43.getDescriptor();
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.getPackageName(type43);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type43);
        java.lang.String[] strArray47 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(16, (int) (short) 0, "L537273248", "L106426492", "Ljava.lang.L2102838683", strArray47);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        java.lang.Object obj14 = label11.info;
        java.lang.Object obj15 = label11.info;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray20);
        label11.info = typeArray16;
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(32, 31, "L437886720", "$28Ljava$2Flang$2FL2116695960$3BLjava$2Elang$2EVoid$3B$29LL781805844$3B", "java/lang/Void", strArray23);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
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
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type24.getInternalName();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
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
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(100, type19);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type19);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type24);
        boolean boolean27 = org.mockito.cglib.core.TypeUtils.isArray(type24);
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(9, type24);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type24);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isPrimitive(type33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type33);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type37);
        org.mockito.asm.Type type39 = type37.getElementType();
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean44 = org.mockito.cglib.core.TypeUtils.isPrimitive(type43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray42, type43);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray45);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = type1.getInternalName();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getPackageName(type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray19);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = signature20.getName();
        org.mockito.asm.Type[] typeArray23 = signature20.getArgumentTypes();
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("L721380844");
        int int26 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray25);
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(106, 5, "L364154550", "L523415619", "L151469734", strArray28);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
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
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("L1946184762", type5, typeArray22);
        org.mockito.asm.Type type24 = signature23.getReturnType();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray25);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray29);
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type24.getDimensions();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("D");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type8);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        int int18 = type16.getOpcode((int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type16, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray13);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(100, type27);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type27);
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getReturnType("LZ;");
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(109, 9, "L1679194985", type9, typeArray34, "L2088851114");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
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
        org.mockito.cglib.core.Signature signature32 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
        org.mockito.asm.Type type33 = signature32.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor34 = classEmitter1.visitField(60, "<init>(Ljava/lang/Ljava$2Elang;;)V", "(Ljava/lang/L557952694;)L;", "L1810005683", (java.lang.Object) signature32);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        int int7 = type4.getSort();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(10, type4);
        int int9 = local8.getIndex();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = local8.getType();
        java.lang.String str12 = type11.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type11.getDimensions();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        java.lang.String str2 = type1.toString();
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("<init>()V");
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(100, type11);
        int int13 = type11.getSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type23 = type22.getElementType();
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type22);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("L1946184762", type9, typeArray25);
        java.lang.String str27 = type9.getDescriptor();
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.Object obj30 = label29.info;
        java.lang.Object obj31 = label29.info;
        java.lang.String str32 = label29.toString();
        java.lang.Object obj33 = label29.info;
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isPrimitive(type37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type37);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type41);
        org.mockito.asm.Type type43 = type41.getElementType();
        label29.info = type43;
        java.lang.String str45 = label29.toString();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(100, type47);
        org.mockito.asm.Type type49 = local48.getType();
        java.lang.String str50 = type49.getClassName();
        java.lang.String str51 = type49.getClassName();
        label29.info = type49;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) '4', type55);
        int int58 = local57.getIndex();
        org.mockito.asm.Type type59 = local57.getType();
        org.mockito.cglib.core.Local local60 = new org.mockito.cglib.core.Local(156, type59);
        int int61 = type59.getSize();
        label29.info = type59;
        java.lang.String str63 = label29.toString();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type65);
        java.lang.String str67 = type65.getClassName();
        java.lang.String str68 = type65.getDescriptor();
        int int69 = type65.getSort();
        org.mockito.asm.Type type70 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type65);
        int int71 = type65.getSize();
        int int73 = type65.getOpcode(132);
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type65);
        label29.info = type65;
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray78 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray77);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray78);
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray78);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray78);
        org.mockito.cglib.core.Signature signature82 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray81);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("L1110459790", type65, typeArray81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(133, "L95758299", type9, (java.lang.Object) signature83);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.fromInternalName("(L;D)Lt;");
        int int7 = type6.getSize();
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        int int16 = type14.getOpcode((int) ' ');
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("int", type14, typeArray19);
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray11);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(100, type25);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type30);
        boolean boolean33 = org.mockito.cglib.core.TypeUtils.isArray(type30);
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(9, type30);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type30);
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        java.lang.Object obj37 = label36.info;
        java.lang.Object obj38 = label36.info;
        java.lang.String str39 = label36.toString();
        label36.info = ' ';
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        java.lang.String str44 = type42.getClassName();
        label36.info = type42;
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type42);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray46);
        int int48 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray46);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int50 = type3.getDimensions();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        int int5 = type2.getOpcode(8);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(18, type2);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str12 = type11.toString();
        java.lang.String str13 = type11.toString();
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("L;", type11, typeArray19);
        java.lang.String str21 = signature20.getName();
        java.lang.String str22 = signature20.toString();
        java.lang.String str23 = signature20.toString();
        org.mockito.asm.Type type24 = signature20.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getPackageName(type28);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.cglib.core.Signature signature32 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray30);
        java.lang.Class[] classArray33 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.getTypes(classArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray35);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("L1900741919", type25, typeArray35);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("L1090833438", type7, typeArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type42 = type7.getElementType();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("L320459311");
        java.lang.String str2 = signature1.getDescriptor();
        org.mockito.asm.Type type3 = signature1.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) '4', type4);
        int int7 = local6.getIndex();
        org.mockito.asm.Type type8 = local6.getType();
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("V");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        java.lang.String str14 = type12.getClassName();
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        int int24 = type22.getOpcode((int) ' ');
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("int", type22, typeArray27);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        int int34 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray29);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray29);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        java.lang.Class[] classArray39 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.getTypes(classArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("L1486804391", type8, typeArray43);
        java.lang.Class<?> wildcardClass45 = signature44.getClass();
        boolean boolean46 = type0.equals((java.lang.Object) signature44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type47 = type0.getElementType();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("$5BLorg$2Fmockito$2Fasm$2FType$3B");
        org.mockito.asm.Type type2 = signature1.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type2.getElementType();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("void");
        int int3 = type1.getOpcode((int) ' ');
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str5 = type4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type4.getElementType();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
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
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isPrimitive(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.getPackageName(type14);
        boolean boolean16 = type11.equals((java.lang.Object) str15);
        int int17 = type11.getSort();
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type18.getElementType();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int6 = type5.getSize();
        int int7 = type5.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type5.getInternalName();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int4 = type1.getSize();
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("LV;", type1, typeArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type41 = type17.getElementType();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        int int3 = type1.getOpcode((int) ' ');
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("int", type1, typeArray6);
        org.mockito.asm.Type[] typeArray8 = signature7.getArgumentTypes();
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type10);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        java.lang.String str15 = type14.toString();
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getPackageName(type14);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isPrimitive(type14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type14.getDimensions();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getPackageName(type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray19);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = signature20.getName();
        org.mockito.asm.Type[] typeArray23 = signature20.getArgumentTypes();
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("L721380844");
        int int26 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray25);
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(20, 47, "L1691839748", "L1247872657", "L722420590", strArray28);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type6.getDimensions();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
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
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        int int45 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type36);
        java.lang.String str46 = type36.getDescriptor();
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int48 = type36.getDimensions();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        int int3 = type0.getSize();
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getPackageName(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = type14.getInternalName();
        int int17 = type14.getSize();
        java.lang.String str18 = type14.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        org.mockito.asm.Type[] typeArray24 = signature22.getArgumentTypes();
        org.mockito.asm.Type type25 = signature22.getReturnType();
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isPrimitive(type27);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray32 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("short", type31, typeArray33);
        org.mockito.asm.Type type35 = signature34.getReturnType();
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean45 = type42.equals((java.lang.Object) type44);
        int int46 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type42);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type42);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
        org.mockito.cglib.core.Signature signature51 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray49);
        java.lang.String str52 = signature51.getDescriptor();
        java.lang.String str53 = signature51.getDescriptor();
        java.lang.String str54 = signature51.getName();
        org.mockito.asm.Type[] typeArray55 = signature51.getArgumentTypes();
        java.lang.String[] strArray56 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray56);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray56);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray58);
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("L2080344193", type25, typeArray58);
        java.lang.Class<?> wildcardClass61 = typeArray58.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.declare_field(0, "L975315353", type14, (java.lang.Object) typeArray58);
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
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) '4', type14);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        int int18 = type14.getSize();
        java.lang.String str19 = type14.getDescriptor();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(13, type14);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        int int24 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray21);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray21);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(59, 24, "L888552161", "L1855134660", "Lorg$2Fmockito$2Fcglib$2Fcore$2FLocal$3B", strArray26);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(140, 27, "L2110788773", "L188928953", "L720997062(Ljava/lang/L;)D", strArray15);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("short", type13, typeArray15);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("short", type19, typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type24);
        boolean boolean27 = org.mockito.cglib.core.TypeUtils.isArray(type24);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        boolean boolean31 = type24.equals((java.lang.Object) strArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray32);
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(0, 72, "L1415337463", "L652545413", "L331157033", strArray34);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isArray(type0);
        int int2 = type0.getSort();
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.getTypes(classArray5);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray6);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray7);
        org.mockito.asm.Type type13 = signature12.getReturnType();
        org.mockito.asm.Type[] typeArray14 = signature12.getArgumentTypes();
        org.mockito.asm.Type type15 = signature12.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type15.getElementType();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("()L;");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(100, type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray10);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) '4', type16);
        int int19 = local18.getIndex();
        org.mockito.asm.Type type20 = local18.getType();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(156, type20);
        org.mockito.asm.Type type22 = local21.getType();
        int int23 = local21.getIndex();
        org.mockito.asm.Type type24 = local21.getType();
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type24);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = type24.getElementType();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str9 = type8.toString();
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type8);
        java.lang.String str12 = type8.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type8);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("L506872831");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("short", type18, typeArray20);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("short", type24, typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isPrimitive(type29);
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type29);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray35 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray34);
        boolean boolean36 = type29.equals((java.lang.Object) strArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray37);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.begin_class(62, 0, "L371213796", type8, typeArray41, "L18932132");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type3 = type2.getElementType();
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        int int6 = type2.getOpcode((int) (byte) -1);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("L$24243B", type2, typeArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        java.lang.Class<?> wildcardClass18 = typeArray17.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
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
        java.lang.String str12 = type6.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type6.getInternalName();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
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
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType("(L;)S");
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray22);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        org.mockito.asm.Type type29 = signature28.getReturnType();
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type29);
        int int31 = type29.getSize();
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type29);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type29);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.fromInternalName("Lorg/mockito/cglib/core/Local;");
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("V");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type19);
        java.lang.String str21 = type19.getClassName();
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getPackageName(type24);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type24);
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(52, 129, "L2081950233", "LLjava/lang/L2102838683;", "L1853782804", strArray29);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
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
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.declare_field(116, "L348580578", type13, (java.lang.Object) "L248451467");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type4.getDimensions();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
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
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type0);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        int int5 = type3.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type3.getElementType();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter6.getClassInfo();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("Java.lang");
        java.lang.String str16 = type15.getInternalName();
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("L551359349", "()LShort;");
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (byte) -1, type27);
        org.mockito.asm.Type type29 = local28.getType();
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("L35440913org.mockito.cglib.core.Signature");
        int int33 = type32.getSize();
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type32);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.begin_class(69, 130, "L2130003165", type15, typeArray30, "L1216695994");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
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
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("L1473478551", type1, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type16);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        boolean boolean21 = type1.equals((java.lang.Object) type19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type19.getElementType();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        java.lang.Class<?> wildcardClass16 = typeArray15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        java.lang.Class<?> wildcardClass23 = signature21.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        java.lang.Class<?> wildcardClass30 = typeArray29.getClass();
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass30);
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass30);
        java.lang.String str33 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        java.lang.Class<?> wildcardClass40 = typeArray39.getClass();
        java.lang.String str41 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass40);
        java.lang.String str42 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray46 = new java.lang.Class[] { wildcardClass16, wildcardClass23, wildcardClass30, wildcardClass40 };
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(47, 65, "L1181770463", "L252749314", "L1338028323", strArray49);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type0);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(11, type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        int int6 = type1.getSize();
        java.lang.String str7 = type1.getClassName();
        int int9 = type1.getOpcode(96);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type1.getInternalName();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        int int3 = type1.getOpcode((int) ' ');
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("int", type1, typeArray6);
        org.mockito.asm.Type[] typeArray8 = signature7.getArgumentTypes();
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type10);
        int int13 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray8);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        java.lang.String str15 = signature14.toString();
        org.mockito.asm.Type[] typeArray16 = signature14.getArgumentTypes();
        org.mockito.asm.Type[] typeArray18 = org.mockito.asm.Type.getArgumentTypes("(V)S");
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(0, 31, "L2010779272", "L2102759867", "L1723648389", strArray19);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        int int5 = type1.getSort();
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type8.getDimensions();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
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
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type6.getInternalName();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type15);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type20 = type19.getElementType();
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("V");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type24);
        java.lang.String str26 = type24.getClassName();
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type24);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("short", type20, typeArray27);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("L518669310", type16, typeArray27);
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(111, 34, "(Ljava/lang/L;)Lva;", "L1432273466", "L161507173", strArray31);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        java.lang.Object obj4 = label0.info;
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.getTypes(classArray5);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.getTypes(classArray5);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.getTypes(classArray5);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray5);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.getTypes(classArray5);
        label0.info = typeArray10;
        java.lang.String str12 = label0.toString();
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.String str15 = label0.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
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
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray21);
        label0.info = type16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = type16.getInternalName();
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
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(10, type4);
        java.lang.String str9 = type4.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type4.getElementType();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = signature3.getReturnType();
        java.lang.String str5 = type4.getClassName();
        java.lang.String str6 = type4.getClassName();
        java.lang.String str7 = type4.getDescriptor();
        java.lang.String str8 = type4.getClassName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(140, type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type4.getElementType();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.cglib.core.Signature signature5 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.mockito.asm.Type type6 = signature5.getReturnType();
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        boolean boolean8 = type2.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("Lorg/mockito/cglib/core/Signature;");
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type20);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray27);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray29);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type12, typeArray29);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("L184506312", type7, typeArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type34 = type7.getElementType();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1001430016");
        org.mockito.asm.Type type2 = signature1.getReturnType();
        int int4 = type2.getOpcode(7);
        java.lang.String str5 = type2.getDescriptor();
        int int6 = type2.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type2.getInternalName();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("V");
        int int13 = type12.getDimensions();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(1, type12);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = local14.getType();
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("short", type21, typeArray23);
        int int25 = type21.getSort();
        java.lang.String str26 = type21.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(0, type21);
        int int29 = type21.getOpcode((int) (byte) -1);
        java.lang.Class[] classArray30 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        java.lang.Class<?> wildcardClass39 = typeArray38.getClass();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray43 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray43);
        java.lang.Class<?> wildcardClass45 = typeArray44.getClass();
        java.lang.String str46 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass45);
        java.lang.Class[] classArray47 = new java.lang.Class[] { wildcardClass39, wildcardClass45 };
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray34, typeArray48);
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray34);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray50);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray51);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type21);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray56 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray56);
        java.lang.Class<?> wildcardClass58 = typeArray57.getClass();
        java.lang.String str59 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass58);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass58);
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray62 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray61);
        org.mockito.cglib.core.Signature signature63 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray61);
        org.mockito.asm.Type type64 = signature63.getReturnType();
        java.lang.Class<?> wildcardClass65 = signature63.getClass();
        java.lang.String str66 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass65);
        java.lang.String str67 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass65);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray70 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray69);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray70);
        java.lang.Class<?> wildcardClass72 = typeArray71.getClass();
        java.lang.String str73 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass72);
        java.lang.String str74 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass72);
        java.lang.String str75 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass72);
        org.mockito.asm.Type type76 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass72);
        java.lang.String str77 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass72);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray80 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray79);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray80);
        java.lang.Class<?> wildcardClass82 = typeArray81.getClass();
        java.lang.String str83 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass82);
        java.lang.String str84 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass82);
        java.lang.String str85 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass82);
        org.mockito.asm.Type type86 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass82);
        java.lang.String str87 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass82);
        java.lang.Class[] classArray88 = new java.lang.Class[] { wildcardClass58, wildcardClass65, wildcardClass72, wildcardClass82 };
        org.mockito.asm.Type[] typeArray89 = org.mockito.cglib.core.TypeUtils.getTypes(classArray88);
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.getTypes(classArray88);
        java.lang.String[] strArray91 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray90);
        org.mockito.cglib.core.Signature signature92 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray90);
        java.lang.String str93 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class(0, 121, "L4127562", type17, typeArray90, "");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType("Short");
        int int17 = type16.getSize();
        java.lang.String str18 = type16.getClassName();
        java.lang.String str19 = type16.toString();
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type16);
        int int21 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray14);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        java.lang.Class<?> wildcardClass26 = typeArray25.getClass();
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        org.mockito.asm.Type type32 = signature31.getReturnType();
        java.lang.Class<?> wildcardClass33 = signature31.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        java.lang.Class<?> wildcardClass40 = typeArray39.getClass();
        java.lang.String str41 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass40);
        java.lang.String str42 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray48 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray48);
        java.lang.Class<?> wildcardClass50 = typeArray49.getClass();
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        java.lang.String str52 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass50);
        java.lang.String str53 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass50);
        java.lang.String str55 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass50);
        java.lang.Class[] classArray56 = new java.lang.Class[] { wildcardClass26, wildcardClass33, wildcardClass40, wildcardClass50 };
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.getTypes(classArray56);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray61 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.getTypes(classArray61);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("short", type60, typeArray62);
        int int64 = type60.getSort();
        java.lang.String str65 = type60.toString();
        java.lang.String str66 = type60.toString();
        java.lang.String str67 = org.mockito.cglib.core.TypeUtils.getClassName(type60);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray57, type60);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.INT_TYPE;
        int int72 = type70.getOpcode((int) ' ');
        java.lang.String[] strArray74 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray74);
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("int", type70, typeArray75);
        org.mockito.asm.Type[] typeArray77 = signature76.getArgumentTypes();
        org.mockito.asm.Type type79 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type80 = org.mockito.cglib.core.TypeUtils.getBoxedType(type79);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray77, type79);
        java.lang.String[] strArray83 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray84 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray83);
        java.lang.Class[] classArray85 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray86 = org.mockito.cglib.core.TypeUtils.getTypes(classArray85);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray84, typeArray86);
        org.mockito.asm.Type[] typeArray88 = org.mockito.cglib.core.TypeUtils.add(typeArray77, typeArray86);
        org.mockito.asm.Type[] typeArray89 = org.mockito.cglib.core.TypeUtils.add(typeArray68, typeArray77);
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray89);
        java.lang.String[] strArray91 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(28, 18, "L541188456", "L2098115531(V)Ljava/lang;", "L523415619", strArray91);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
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
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getType("hi!()Ljava/lang/Short;");
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("short", type22, typeArray24);
        int int26 = type22.getSort();
        java.lang.String str27 = type22.toString();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        java.lang.Class[] classArray33 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.getTypes(classArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray32);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray36);
        int int38 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray36);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type19, typeArray36);
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visit(129, 67, "L2115033494", "L625662706", "L811220123", strArray40);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("I", "L1473478551");
        java.lang.String str17 = signature16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type18);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type18);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        boolean boolean25 = type18.equals((java.lang.Object) strArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        boolean boolean27 = signature16.equals((java.lang.Object) strArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(121, 41, "L1487498822", "L1542861193", "L562458183", strArray24);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        int int19 = type17.getOpcode((int) ' ');
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("int", type17, typeArray22);
        org.mockito.asm.Type[] typeArray24 = signature23.getArgumentTypes();
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getBoxedType(type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type26);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("L$3B", type15, typeArray24);
        org.mockito.asm.Type[] typeArray30 = signature29.getArgumentTypes();
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(0, 65, "", "L440301636", "L99600149", strArray31);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
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
        java.lang.String str12 = signature10.getName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        java.lang.String str15 = type13.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(100, type19);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type17, type19 };
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        boolean boolean24 = type13.equals((java.lang.Object) signature23);
        org.mockito.asm.Type type25 = signature23.getReturnType();
        org.mockito.asm.Type type26 = signature23.getReturnType();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("void", "Z");
        java.lang.String str30 = signature29.getName();
        boolean boolean31 = signature23.equals((java.lang.Object) signature29);
        boolean boolean32 = signature10.equals((java.lang.Object) signature29);
        org.mockito.asm.Type type33 = signature29.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type33.getDimensions();
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
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("short", type16, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("short", type22, typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        boolean boolean29 = org.mockito.cglib.core.TypeUtils.isPrimitive(type27);
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isArray(type27);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type27);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        boolean boolean34 = type27.equals((java.lang.Object) strArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray35);
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(113, 100, "(Ljava/lang/Ljava/lang/L2090846321;;)V", "L1269032767", "L2086770054", strArray37);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        int int3 = type1.getOpcode((int) ' ');
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("int", type1, typeArray6);
        org.mockito.asm.Type[] typeArray8 = signature7.getArgumentTypes();
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type10);
        int int13 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray8);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        java.lang.String str15 = signature14.toString();
        org.mockito.asm.Type[] typeArray16 = signature14.getArgumentTypes();
        org.mockito.asm.Type[] typeArray18 = org.mockito.asm.Type.getArgumentTypes("(V)S");
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.asm.Type.getArgumentTypes("(Ljava/lang/Short;)V");
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("L2134776200");
        org.mockito.asm.Type type24 = type23.getElementType();
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getPackageName(type23);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("L1220127970");
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        int int22 = type20.getOpcode((int) ' ');
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("int", type20, typeArray25);
        org.mockito.asm.Type[] typeArray27 = signature26.getArgumentTypes();
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray17);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        boolean boolean33 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isArray(type31);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        int int37 = type31.getOpcode(1);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str40 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray42);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        int int47 = type45.getOpcode((int) ' ');
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("int", type45, typeArray50);
        org.mockito.asm.Type[] typeArray52 = signature51.getArgumentTypes();
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray52, type54);
        int int57 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray52);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray42, typeArray52);
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray60);
        java.lang.Class[] classArray62 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.getTypes(classArray62);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray61, typeArray63);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray58, typeArray64);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang");
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.getClassName(type67);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray58, type67);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type67);
        org.mockito.asm.Type type71 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type67);
        int int72 = type71.getSort();
        boolean boolean73 = org.mockito.cglib.core.TypeUtils.isPrimitive(type71);
        boolean boolean74 = org.mockito.cglib.core.TypeUtils.isPrimitive(type71);
        java.lang.String str75 = org.mockito.cglib.core.TypeUtils.getPackageName(type71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.declare_field(153, "()Ljava/lang/L1367759031;", type12, (java.lang.Object) str75);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
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
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("L1946184762", type5, typeArray22);
        org.mockito.asm.Type type24 = signature23.getReturnType();
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        java.lang.String str26 = type24.getClassName();
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type24.getElementType();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getDescriptor();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("L1474710566", "IL1473478551");
        java.lang.String str8 = signature7.getDescriptor();
        org.mockito.asm.Type type9 = signature7.getReturnType();
        java.lang.String str10 = signature7.getName();
        org.mockito.asm.Type type11 = signature7.getReturnType();
        boolean boolean12 = type0.equals((java.lang.Object) signature7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type0.getDimensions();
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
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
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1486804391", type6, typeArray41);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getBoxedType(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type44 = type43.getElementType();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type4);
        org.mockito.asm.Type type6 = local5.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type6.getElementType();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
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
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        int int25 = type23.getOpcode((int) ' ');
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("int", type23, typeArray28);
        org.mockito.asm.Type[] typeArray30 = signature29.getArgumentTypes();
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type32);
        int int35 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray30);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray30);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        boolean boolean39 = org.mockito.cglib.core.TypeUtils.isPrimitive(type37);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isArray(type37);
        java.lang.String str41 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type37);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray43 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray42);
        boolean boolean44 = type37.equals((java.lang.Object) strArray43);
        boolean boolean45 = org.mockito.cglib.core.TypeUtils.isPrimitive(type37);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type37);
        java.lang.String[] strArray47 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visit(42, 19, "L2116046634", "org.mockito.asm.Type", "L1022388462", strArray47);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        org.mockito.asm.Type type10 = signature9.getReturnType();
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        boolean boolean12 = type6.equals((java.lang.Object) type11);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getPackageName(type13);
        java.lang.String str15 = type13.getInternalName();
        int int16 = type13.getSort();
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type13);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type21);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(171, "L1458257003", type17, (java.lang.Object) typeArray28);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        java.lang.String str14 = label10.toString();
        java.lang.Object obj15 = label10.info;
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("short", type18, typeArray20);
        java.lang.String str22 = signature21.getName();
        label10.info = str22;
        java.lang.String str24 = label10.toString();
        java.lang.Object obj25 = label10.info;
        java.lang.String str26 = label10.toString();
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.Object obj28 = label27.info;
        java.lang.Object obj29 = label27.info;
        java.lang.String str30 = label27.toString();
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        java.lang.Object obj32 = label31.info;
        java.lang.String str33 = label31.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type34);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type34);
        label31.info = type34;
        label27.info = type34;
        java.lang.Object obj39 = label27.info;
        java.lang.String str40 = label27.toString();
        java.lang.String str41 = label27.toString();
        label10.info = label27;
        java.lang.String str43 = label10.toString();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        int int47 = type45.getOpcode((int) ' ');
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("int", type45, typeArray50);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray50, typeArray53);
        java.lang.String[] strArray56 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        label10.info = strArray56;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(46, 121, "L921399813", "LLjava/lang/Short;", "L760220130", strArray56);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type5.getDimensions();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean12 = type9.equals((java.lang.Object) type11);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        int int20 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray18);
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((int) (short) 1, 32, "L1622626020", "(L;Lint;L;D)LL1601923521;", "L538763422", strArray23);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = signature3.getReturnType();
        java.lang.Class<?> wildcardClass5 = signature3.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) 154);
        int int15 = type12.getSize();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray18);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("va/lang", type9, typeArray10);
        org.mockito.asm.Type type29 = type9.getElementType();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter34);
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        boolean boolean37 = type9.equals((java.lang.Object) classAdapter36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter36.visitInnerClass("L733660289", "LL1060284130$3B", "L1457145984", 35);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("L2110823585");
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type1.getDimensions();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1734697730");
        org.mockito.asm.Type type2 = signature1.getReturnType();
        java.lang.String str3 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type2.getInternalName();
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("L813341690");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor16 = classAdapter9.visitField(105, "L394468530", "()LL39792547;", "L1979379433", (java.lang.Object) "L813341690");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
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
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        boolean boolean23 = org.mockito.cglib.core.TypeUtils.isArray(type20);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        boolean boolean27 = type20.equals((java.lang.Object) strArray26);
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type20);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.Object obj15 = label13.info;
        java.lang.String str16 = label13.toString();
        java.lang.String str17 = label13.toString();
        java.lang.String str18 = label13.toString();
        java.lang.Object obj19 = label13.info;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str22 = type21.getDescriptor();
        label13.info = str22;
        java.lang.Object obj24 = label13.info;
        java.lang.String str25 = label13.toString();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        label13.info = strArray32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(135, 36, "L1423368060", "L2128646358", "java.lang.(Ljava.lang", strArray32);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type11);
        java.lang.String str13 = type11.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        boolean boolean22 = type11.equals((java.lang.Object) signature21);
        boolean boolean23 = org.mockito.cglib.core.TypeUtils.isPrimitive(type11);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("Z");
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("java.lang", type11, typeArray25);
        java.lang.Class[] classArray33 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.getTypes(classArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray33);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.getTypes(classArray33);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray33);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray40);
        java.lang.Class<?> wildcardClass42 = typeArray41.getClass();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        java.lang.Class<?> wildcardClass48 = typeArray47.getClass();
        java.lang.String str49 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass48);
        java.lang.Class[] classArray50 = new java.lang.Class[] { wildcardClass42, wildcardClass48 };
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.getTypes(classArray50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray37, typeArray51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray37);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int56 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type55);
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.getClassName(type55);
        java.lang.String str58 = type55.getClassName();
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.getClassName(type55);
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray61);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean64 = org.mockito.cglib.core.TypeUtils.isPrimitive(type63);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray62, type63);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray62, type67);
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray70);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean73 = org.mockito.cglib.core.TypeUtils.isPrimitive(type72);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray71, type72);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray68, typeArray74);
        org.mockito.asm.Type type76 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str77 = type76.getDescriptor();
        boolean boolean78 = org.mockito.cglib.core.TypeUtils.isPrimitive(type76);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.add(typeArray74, type76);
        org.mockito.asm.Type[] typeArray80 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray81 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray80);
        org.mockito.cglib.core.Signature signature82 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray80);
        org.mockito.asm.Type type84 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type85 = org.mockito.cglib.core.TypeUtils.getBoxedType(type84);
        org.mockito.asm.Type[] typeArray86 = org.mockito.cglib.core.TypeUtils.add(typeArray80, type84);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray74, typeArray86);
        org.mockito.cglib.core.Signature signature88 = new org.mockito.cglib.core.Signature("", type55, typeArray86);
        org.mockito.asm.Type[] typeArray89 = org.mockito.cglib.core.TypeUtils.add(typeArray37, typeArray86);
        java.lang.String[] strArray90 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(134, 145, "L1644169268", "L118753332", "L2141643866", strArray90);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Short");
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
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
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray16);
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        int int24 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray22);
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
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        boolean boolean49 = org.mockito.cglib.core.TypeUtils.isPrimitive(type47);
        boolean boolean50 = org.mockito.cglib.core.TypeUtils.isArray(type47);
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(9, type47);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type47);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean57 = org.mockito.cglib.core.TypeUtils.isPrimitive(type56);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray55, type56);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray55, type60);
        org.mockito.asm.Type type62 = type60.getElementType();
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray64);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean67 = org.mockito.cglib.core.TypeUtils.isPrimitive(type66);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray65, type66);
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type62, typeArray68);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray52, typeArray68);
        org.mockito.cglib.core.Signature signature71 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray52);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray73 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray52);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        int int11 = type9.getOpcode((int) ' ');
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("int", type9, typeArray14);
        org.mockito.asm.Type[] typeArray16 = signature15.getArgumentTypes();
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getBoxedType(type18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        java.lang.Class[] classArray24 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray25);
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(141, 120, "L126251442", "Ljava/lang/Lvoid$3B;", "L1072224216", strArray30);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.parseTypes("V");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        java.lang.String str16 = type14.getClassName();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getBoxedType(type18);
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getPackageName(type19);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type19);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(8, 145, "L1647596783", "L1343913693", "([Lorg/mockito/asm/Type;[Lorg/mockito/asm/Type;)LL39792547;", strArray24);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str11 = type10.toString();
        java.lang.String str12 = type10.toString();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("L;", type10, typeArray18);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        java.lang.String str22 = type10.getInternalName();
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("L648214016");
        boolean boolean25 = type10.equals((java.lang.Object) type24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("V");
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type29);
        java.lang.String str31 = type29.getClassName();
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type29);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        int int41 = type39.getOpcode((int) ' ');
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("int", type39, typeArray44);
        org.mockito.asm.Type[] typeArray46 = signature45.getArgumentTypes();
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.getBoxedType(type48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type48);
        int int51 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray46);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray46);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray54);
        java.lang.Class[] classArray56 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.getTypes(classArray56);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray55, typeArray57);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray52, typeArray58);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray59);
        org.mockito.cglib.core.Signature signature61 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray59);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        int int65 = type63.getOpcode((int) ' ');
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray67);
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("int", type63, typeArray68);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray72 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray71);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.add(typeArray68, typeArray71);
        org.mockito.asm.Type type75 = org.mockito.cglib.core.TypeUtils.parseType("L()L<init>()V;;");
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.add(typeArray73, type75);
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.add(typeArray59, typeArray73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(0, 145, "L533063972", type10, typeArray59, "L884866675");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        int int6 = type3.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 154);
        int int10 = type7.getSize();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type14);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type18);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        boolean boolean29 = org.mockito.cglib.core.TypeUtils.isPrimitive(type27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type27);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.getClassName(type27);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        int int40 = type38.getOpcode((int) ' ');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("int", type38, typeArray43);
        org.mockito.asm.Type[] typeArray45 = signature44.getArgumentTypes();
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray34, typeArray35);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(100, type49);
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type49);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray47, type49);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str55 = type54.getDescriptor();
        boolean boolean56 = org.mockito.cglib.core.TypeUtils.isPrimitive(type54);
        boolean boolean57 = org.mockito.cglib.core.TypeUtils.isArray(type54);
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local(9, type54);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray52, type54);
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray61);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean64 = org.mockito.cglib.core.TypeUtils.isPrimitive(type63);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray62, type63);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray62, type67);
        org.mockito.asm.Type type69 = type67.getElementType();
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray71);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean74 = org.mockito.cglib.core.TypeUtils.isPrimitive(type73);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray72, type73);
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray75);
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.add(typeArray59, typeArray75);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray75);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray75);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray81 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray75);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("void");
        int int3 = type1.getOpcode((int) ' ');
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
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
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray23);
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter9.visit(111, 162, "", "org/mockito/asm/Type(L<init>()V;)D", "L528986148", strArray25);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(100, type2);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        java.lang.String str5 = type2.toString();
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(5, type2);
        int int8 = local7.getIndex();
        org.mockito.asm.Type type9 = local7.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type9.getDimensions();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        int int9 = type7.getOpcode((int) ' ');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("int", type7, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type16);
        int int19 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray14);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray14);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        java.lang.String str22 = signature21.getName();
        org.mockito.asm.Type type23 = signature21.getReturnType();
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("L2102838683");
        org.mockito.cglib.core.Signature signature26 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("<init>()V");
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type30);
        java.lang.String str32 = type30.getClassName();
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type30);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("L1054685742", type23, typeArray25);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) (byte) -1, type37);
        org.mockito.asm.Type type39 = local38.getType();
        org.mockito.asm.Type type40 = local38.getType();
        org.mockito.asm.Type type41 = local38.getType();
        org.mockito.asm.Type type42 = local38.getType();
        boolean boolean43 = type23.equals((java.lang.Object) type42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int44 = type23.getDimensions();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        int int3 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray0);
        int int4 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type9);
        java.lang.String str12 = type9.getClassName();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("short", type16, typeArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        boolean boolean23 = org.mockito.cglib.core.TypeUtils.isArray(type20);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str25 = type20.getClassName();
        java.lang.String str26 = type20.toString();
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type20);
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        boolean boolean29 = type9.equals((java.lang.Object) type20);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        java.lang.String str5 = type0.getClassName();
        int int6 = type0.getSize();
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        int int9 = type7.getOpcode(105);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type7.getElementType();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type9);
        int int12 = type9.getOpcode(153);
        java.lang.String str13 = type9.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type9);
        java.lang.String str15 = type9.getClassName();
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("void");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class[] classArray24 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray25);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("L551359349()LShort;");
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getBoxedType(type30);
        int int32 = type31.getSort();
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class(34, (int) '4', "L403389031", type9, typeArray25, "L437886720");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getPackageName(type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(125, 122, "L1391805252", "(Ljava/lang/L955366737;)V", "L765018961", strArray24);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L1703183236");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type5);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type5);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type9);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray16);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray18);
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray18);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
    }
}

