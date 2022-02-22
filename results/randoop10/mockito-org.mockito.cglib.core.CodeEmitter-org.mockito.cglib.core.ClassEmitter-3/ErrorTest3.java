import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) ' ', type1);
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        int int7 = type1.getOpcode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter5.visitAnnotation("L1738112647", false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        int int6 = type4.getOpcode(162);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type4.getDimensions();
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type7, type9 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(108, type2);
        org.mockito.asm.Type type14 = local13.getType();
        int int16 = type14.getOpcode((int) (short) 10);
        java.lang.String str17 = type14.getDescriptor();
        int int19 = type14.getOpcode(3);
        java.lang.String str20 = type14.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType("Z");
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int34 = type33.getSize();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type31, type33 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray35);
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(108, type26);
        java.lang.Class<?> wildcardClass38 = type26.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        int int40 = type39.getSize();
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type45 = signature44.getReturnType();
        org.mockito.asm.Type[] typeArray47 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray47);
        java.lang.String str49 = type45.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass52 = type51.getClass();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass52);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] {};
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray55);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray55);
        org.mockito.asm.Type[] typeArray59 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("boolean", type53, typeArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("", type45, typeArray59);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray59);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("L303557794", type23, typeArray59);
        org.mockito.asm.Type[] typeArray64 = signature63.getArgumentTypes();
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("L1902973512", type14, typeArray64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type66 = type14.getElementType();
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter7.getSuperType();
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        java.lang.Object obj4 = label0.info;
        java.lang.String str5 = label0.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        java.lang.String str9 = type7.getDescriptor();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(153, type7);
        org.mockito.asm.Type type11 = local10.getType();
        org.mockito.asm.Type type12 = local10.getType();
        org.mockito.asm.Type type13 = local10.getType();
        java.lang.String str14 = type13.toString();
        label0.info = type13;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type13.getElementType();
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter3.getAccess();
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter0.getAccess();
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.toString();
        java.lang.String str7 = signature2.toString();
        java.lang.String str8 = signature2.getName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        int int12 = type11.getDimensions();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        boolean boolean15 = signature2.equals((java.lang.Object) wildcardClass13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str20 = signature19.getDescriptor();
        java.lang.String str21 = signature19.getName();
        org.mockito.asm.Type type22 = signature19.getReturnType();
        org.mockito.asm.Type type23 = signature19.getReturnType();
        org.mockito.asm.Type[] typeArray24 = signature19.getArgumentTypes();
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        boolean boolean32 = type16.equals((java.lang.Object) classEmitter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter28.visitEnd();
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray16 = new java.lang.String[] { "L642981719", "L1560667893" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(30, 156, "L1570070216", "L519559826", "L1757778698", strArray16);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("L1090326295");
        int int21 = type19.getOpcode((-1));
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str26 = signature25.getDescriptor();
        java.lang.String str27 = signature25.getName();
        org.mockito.asm.Type type28 = signature25.getReturnType();
        org.mockito.asm.Type type29 = signature25.getReturnType();
        java.lang.String str30 = type29.toString();
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        boolean boolean35 = signature33.equals((java.lang.Object) "org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type[] typeArray36 = signature33.getArgumentTypes();
        org.mockito.asm.Type[] typeArray37 = signature33.getArgumentTypes();
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("L621408288", type29, typeArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.begin_class(127, 136, "L103609869", type19, typeArray37, "()LL667761749;");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type7, type9 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(108, type2);
        org.mockito.asm.Type type14 = local13.getType();
        int int16 = type14.getOpcode((int) (short) 10);
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(124, type14);
        org.mockito.asm.Type type18 = local17.getType();
        int int19 = type18.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type18.getInternalName();
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = signature2.getDescriptor();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        int int8 = type6.getOpcode(137);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type6.getInternalName();
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        java.lang.String str15 = type14.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type14.getElementType();
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = classEmitter2.getAccess();
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter5.visitAnnotation("", true);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("L1253516316", "L995684065");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        int int5 = type4.getSort();
        int int6 = type4.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type4.getDimensions();
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getDescriptor();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type8 = signature7.getReturnType();
        org.mockito.asm.Type type9 = signature7.getReturnType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getReturnType("Lhi!;");
        boolean boolean12 = signature7.equals((java.lang.Object) type11);
        java.lang.String str13 = signature7.getName();
        org.mockito.asm.Type[] typeArray14 = signature7.getArgumentTypes();
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type0.getDimensions();
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter13.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        int int25 = type23.getOpcode(127);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type29 = signature28.getReturnType();
        org.mockito.asm.Type type30 = signature28.getReturnType();
        java.lang.String str31 = signature28.getDescriptor();
        java.lang.String str32 = signature28.toString();
        java.lang.String str33 = signature28.toString();
        java.lang.String str34 = signature28.getName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass36 = type35.getClass();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass36);
        int int38 = type37.getDimensions();
        java.lang.Class<?> wildcardClass39 = type37.getClass();
        java.lang.String str40 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass39);
        boolean boolean41 = signature28.equals((java.lang.Object) wildcardClass39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type type43 = type42.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter13.declare_field(40, "L2120116101", type23, (java.lang.Object) type42);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter8.getClassType();
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L1547706332", "L1279723392");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(6, (int) '#', "(ZDZ)S", "L644294045", "L505312138", strArray11);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitInnerClass("L2134170196", "L75479442", "L1248370407", 126);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classAdapter10.visitAnnotation("L887568561", true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("LL966073460;", "L1714960064", "L652706129", (int) (short) 100);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lboolean;", "(VZZVZZ)Z");
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        boolean boolean15 = signature2.equals((java.lang.Object) classAdapter14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter14.visitInnerClass("", "L(ZDZ)Z;", "L1332937173", 96);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter2.getSuperType();
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        int int15 = type13.getOpcode((int) (short) 10);
        java.lang.String str16 = type13.getClassName();
        java.lang.String str17 = type13.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type13.getInternalName();
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L102130681L1838984016", "L1284768752");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray19 = new java.lang.String[] { "Lchar;", "L505556491", "L1517064177", "L1467415960", "L1558336663", "L535534703" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit((int) (short) 1, 39, "L1714960064", "L168273532", "L791567059", strArray19);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1974286099", "L1807136932");
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        boolean boolean5 = signature2.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter12 = classEmitter8.getStaticHook();
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter10 = classEmitter5.getStaticHook();
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitOuterClass("org/mockito/asm/TypeL136873967", "L1800557683", "L2143779573");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        java.lang.Class<?> wildcardClass15 = classEmitter14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        int int21 = type20.getSort();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type[] typeArray26 = org.mockito.asm.Type.getArgumentTypes("()Lorg/mockito/asm/Type;");
        boolean boolean27 = type24.equals((java.lang.Object) typeArray26);
        java.lang.String str28 = type24.getClassName();
        int int29 = type24.getSort();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type33 = signature32.getReturnType();
        org.mockito.asm.Type[] typeArray35 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("L814527759", type24, typeArray35);
        org.mockito.asm.Type[] typeArray38 = signature37.getArgumentTypes();
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("(ZDZ)Z");
        int int43 = type42.getDimensions();
        java.lang.String str44 = type42.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int47 = type46.getSize();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int49 = type48.getSize();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int51 = type50.getSize();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSize();
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type46, type48, type50, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("L1617403293", type42, typeArray54);
        org.mockito.asm.Type[] typeArray57 = signature56.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class(101, (int) (byte) 100, "L324288077", type20, typeArray57, "L626896181");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitSource("(ZDZ)Z", "L1041811253");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visitSource("L235173897", "L683728913");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        label0.info = 130;
        java.lang.Class<?> wildcardClass5 = label0.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        int int7 = type6.getSort();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        boolean boolean13 = type6.equals((java.lang.Object) classEmitter10);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visit(25, 5, "L1123304734", "L1490167485", "L2092810633", strArray19);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter19.visitOuterClass("L677953279", "L1771832767", "L1854658794");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitSource("L1604942204", "L1365617678");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        boolean boolean13 = type11.equals((java.lang.Object) label12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        int int16 = type14.getOpcode(5);
        label12.info = 5;
        java.lang.String str18 = label12.toString();
        java.lang.Object obj19 = label12.info;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("(ZDZ)Z");
        int int22 = type21.getDimensions();
        org.mockito.asm.Type type23 = type21.getElementType();
        label12.info = type23;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(112, type23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) (byte) 100, type23);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("L102021677", "()LL1239499811;");
        java.lang.String str30 = signature29.getDescriptor();
        org.mockito.asm.Type[] typeArray31 = signature29.getArgumentTypes();
        org.mockito.asm.Type[] typeArray32 = signature29.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.begin_class(131, 22, "L572314982", type23, typeArray32, "L1760391205");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        int int15 = type13.getOpcode((int) (short) 10);
        java.lang.String str16 = type13.getDescriptor();
        int int18 = type13.getOpcode(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type13.getInternalName();
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        java.lang.String str16 = signature13.getDescriptor();
        java.lang.String str17 = signature13.toString();
        java.lang.String str18 = signature13.toString();
        org.mockito.asm.Type type19 = signature13.getReturnType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter27.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter27);
        boolean boolean31 = type20.equals((java.lang.Object) classAdapter30);
        boolean boolean32 = type19.equals((java.lang.Object) classAdapter30);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classAdapter30);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter35 = classEmitter34.getStaticHook();
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.String[] strArray23 = new java.lang.String[] { "L2068771860", "L574440766", "L204418138", "L1614003266", "L536698396L1902973512", "L1872671139" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visit((int) '4', 14, "L1708930608L320822661", "", "L927860561", strArray23);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L1592155456", "L1136015341", "L185771871");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("Lhi!;");
        boolean boolean7 = signature2.equals((java.lang.Object) type6);
        java.lang.String str8 = signature2.getName();
        java.lang.String str9 = signature2.getName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("org/mockito/asm/MethodAdapter");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray19);
        org.mockito.asm.Type type22 = type17.getElementType();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int34 = type33.getSize();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type35.getSize();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type33, type35 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int41 = type40.getSize();
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type28, type39, type40 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray42);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int48 = type47.getSize();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int50 = type49.getSize();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int52 = type51.getSize();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int54 = type53.getSize();
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type47, type49, type51, type53 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray55);
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(108, type46);
        org.mockito.asm.Type type58 = local57.getType();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int63 = type62.getSize();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int65 = type64.getSize();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int67 = type66.getSize();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int69 = type68.getSize();
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type62, type64, type66, type68 };
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray70);
        org.mockito.cglib.core.Local local72 = new org.mockito.cglib.core.Local(108, type61);
        org.mockito.asm.Type type73 = local72.getType();
        int int74 = type73.getSize();
        org.mockito.asm.Type type75 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int76 = type75.getSize();
        org.mockito.asm.Type[] typeArray77 = new org.mockito.asm.Type[] { type24, type26, type58, type59, type73, type75 };
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray77);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray77);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray77);
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray77);
        boolean boolean82 = signature2.equals((java.lang.Object) type10);
        java.lang.String str83 = signature2.getName();
        org.mockito.asm.Type type84 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str85 = type84.getInternalName();
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "(ZZZZ)Lg/mockito/asm/Type;", "L1558336663", "()LL1239499811;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(150, 160, "L1786953231", "L410292784", "L148477980", strArray10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter5.visitAnnotation("L139364141", true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter16.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = classEmitter10.visitAnnotation("L1658186567", false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L1812412308", "L1526340672", "L929041810");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        int int15 = type13.getOpcode((int) (short) 10);
        java.lang.String str16 = type13.getDescriptor();
        int int18 = type13.getOpcode(3);
        int int19 = type13.getSize();
        int int20 = type13.getSize();
        java.lang.String str21 = type13.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type13.getDimensions();
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classAdapter7.visitAnnotation("L1019173703", false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.toString();
        java.lang.String str7 = signature2.toString();
        org.mockito.asm.Type type8 = signature2.getReturnType();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter16.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter16);
        boolean boolean20 = type9.equals((java.lang.Object) classAdapter19);
        boolean boolean21 = type8.equals((java.lang.Object) classAdapter19);
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = classEmitter23.getClassType();
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitOuterClass("L287947411", "L87695427", "L1405890076");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter9.visitInnerClass("L1567659081", "L677953279", "L1496648274", 126);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        java.lang.String[] strArray17 = new java.lang.String[] { "g.mockito.cglib.core.ClassEmitter", "L1567659081", "L330586200", "L1560667893", "L506568454", "L857741467" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(154, 171, "L166083121", "(ZZZZ)LL1035675070;", "L547946778", strArray17);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter16.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter27.visitSource("L1680720582", "L881141509");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.end_class();
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter7.getClassType();
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int3 = type1.getOpcode(5);
        int int5 = type1.getOpcode(103);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type9 = signature8.getReturnType();
        org.mockito.asm.Type[] typeArray10 = signature8.getArgumentTypes();
        java.lang.String str11 = signature8.getDescriptor();
        org.mockito.asm.Type[] typeArray12 = signature8.getArgumentTypes();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("L1543096639", type1, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type1.getElementType();
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = classEmitter8.getAccess();
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.end_class();
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter8.visitAnnotation("L1937621401", true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visitInnerClass("L887568561", "L(ZDZ)Z;", "L1480682789", 44);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        int int14 = type13.getSize();
        java.lang.String str15 = type13.toString();
        java.lang.String str16 = type13.getClassName();
        int int17 = type13.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type13.getInternalName();
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = classEmitter9.getAccess();
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type7, type9 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(108, type2);
        org.mockito.asm.Type type14 = local13.getType();
        int int16 = type14.getOpcode((int) (short) 10);
        java.lang.String str17 = type14.getDescriptor();
        int int19 = type14.getOpcode(3);
        int int20 = type14.getSize();
        int int21 = type14.getSort();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(100, type14);
        int int23 = type14.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type14.getDimensions();
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitSource("(VZZVZZ)LL1192037587;", "L812321049");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str21 = signature20.getDescriptor();
        java.lang.String str22 = signature20.getName();
        org.mockito.asm.Type type23 = signature20.getReturnType();
        org.mockito.asm.Type type24 = signature20.getReturnType();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(2, type24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor26 = classAdapter12.visitField(35, "L782459770", "L932695130(ZDZ)Lhi!;", "L805954294(ZDZ)Z", (java.lang.Object) 2);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(105, 157, "L2004893044", "L814527759()LLorg/mockito/asm/Type;;", "L1480682789", strArray11);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        int int15 = local12.getIndex();
        org.mockito.asm.Type type16 = local12.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type16.getElementType();
    }
}

