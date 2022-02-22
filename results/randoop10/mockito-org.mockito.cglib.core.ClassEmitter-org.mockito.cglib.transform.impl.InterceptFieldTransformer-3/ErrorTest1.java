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
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int8 = type7.getDimensions();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSort();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.String str17 = type15.getClassName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(96, type15);
        int int19 = type15.getSort();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type9, type12, type15, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Z", type1, typeArray22);
        java.lang.String str24 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type1.getInternalName();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int5 = type3.getOpcode(1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        java.lang.String str19 = type17.getClassName();
        int int20 = type17.getSort();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type10, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type7, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("S", type3, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray21);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        java.lang.String str35 = type33.getClassName();
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(96, type33);
        int int37 = type33.getSort();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type30, type31, type33, type38 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("boolean", type29, typeArray40);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type29 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray42);
        int int44 = type26.getSort();
        int int45 = type26.getSize();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((-1), type47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str55 = type54.getClassName();
        java.lang.String str56 = type54.getClassName();
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(96, type54);
        int int58 = type54.getSort();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str60 = type59.getClassName();
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type51, type52, type54, type59 };
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("boolean", type50, typeArray61);
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type50 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray63);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray63);
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("L1708628491", type1, typeArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str67 = type1.getInternalName();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray15 = new java.lang.String[] { "S", "L1775723000", "L1089169895", "L1637494320" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(158, 2, "(DDZZ)S", "Lorg/mockito/cglib/core/Signature;", "L180886489", strArray15);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L119242426", "L612235624", "org.mockito.cglib.core.Signature");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        int int6 = type4.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        java.lang.String str20 = type18.getClassName();
        int int21 = type18.getSort();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("S", type4, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray22);
        java.lang.String str26 = type0.getDescriptor();
        int int28 = type0.getOpcode((int) (byte) 1);
        java.lang.String str29 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type0.getInternalName();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(5, type1);
        java.lang.String str6 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter4.getClassType();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSort();
        label0.info = type3;
        java.lang.String str7 = type3.toString();
        java.lang.String str8 = type3.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        int int11 = type9.getOpcode(1);
        java.lang.Class<?> wildcardClass12 = type9.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type15 = type14.getElementType();
        java.lang.String str16 = type14.getClassName();
        int int17 = type14.getDimensions();
        int int18 = type14.getDimensions();
        boolean boolean19 = type3.equals((java.lang.Object) int18);
        int int20 = type3.getSort();
        java.lang.String str21 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type3.getDimensions();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.toString();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(9, type1);
        int int6 = type1.getOpcode(0);
        java.lang.String str7 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        java.lang.String str10 = type8.getClassName();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(96, type8);
        int int12 = type8.getSort();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type5, type6, type8, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("boolean", type4, typeArray15);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        java.lang.String str23 = type21.getClassName();
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) 'a', type21);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((-1), type32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((-1), type35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.getClassName();
        java.lang.String str41 = type39.getClassName();
        int int42 = type39.getSort();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type32, type35, type37, type39 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("", type29, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type27, typeArray43);
        java.lang.String str46 = signature45.toString();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str49 = type48.getClassName();
        java.lang.String str50 = type48.getClassName();
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((int) 'a', type48);
        boolean boolean52 = signature45.equals((java.lang.Object) 'a');
        org.mockito.asm.Type[] typeArray53 = signature45.getArgumentTypes();
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray53);
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local(12, type21);
        java.lang.String str56 = type21.toString();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int59 = type58.getSort();
        int int61 = type58.getOpcode((int) (short) 100);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str68 = type67.getClassName();
        java.lang.String str69 = type67.getClassName();
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local(96, type67);
        int int71 = type67.getSort();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str73 = type72.getClassName();
        org.mockito.asm.Type[] typeArray74 = new org.mockito.asm.Type[] { type64, type65, type67, type72 };
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("boolean", type63, typeArray74);
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray74);
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray74);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray74);
        org.mockito.asm.Type[] typeArray80 = org.mockito.asm.Type.getArgumentTypes("(DCF)C");
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("L396320025", type1, typeArray80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str82 = type1.getInternalName();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1463072090", "", "L2070649041");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        java.lang.String str6 = type4.getClassName();
        int int7 = type4.getSort();
        java.lang.String str8 = type4.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        int int12 = type10.getOpcode(1);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        java.lang.String str26 = type24.getClassName();
        int int27 = type24.getSort();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type14, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("S", type10, typeArray28);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("I", type4, typeArray28);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        java.lang.String str33 = type0.getDescriptor();
        int int34 = type0.getSort();
        int int36 = type0.getOpcode(18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int37 = type0.getDimensions();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.asm.Type type7 = local4.getType();
        int int8 = local4.getIndex();
        org.mockito.asm.Type type9 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type9.getElementType();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str5 = type1.toString();
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        java.lang.String str8 = type1.toString();
        int int10 = type1.getOpcode(162);
        int int11 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type1.getDimensions();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSize();
        int int4 = type0.getSize();
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        int int3 = type2.getSize();
        int int4 = type2.getSort();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(153, type2);
        int int7 = type2.getOpcode(104);
        java.lang.String str8 = type2.getDescriptor();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(49, type2);
        int int10 = type2.getSort();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("L1092103913");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        int int17 = type15.getOpcode(1);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((-1), type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        int int32 = type29.getSort();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type19, typeArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("S", type15, typeArray33);
        org.mockito.asm.Type[] typeArray36 = signature35.getArgumentTypes();
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("L875239153", type13, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = type2.getInternalName();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        boolean boolean5 = type1.equals((java.lang.Object) 1.0f);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str7 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type1.getDimensions();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(DCF)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        int int2 = type1.getSort();
        int int4 = type1.getOpcode((int) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType("D");
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        java.lang.String str12 = type10.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSort();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type16, type17, type18 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("F", type15, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("I", type10, typeArray21);
        int int24 = type10.getSort();
        boolean boolean26 = type10.equals((java.lang.Object) 97);
        java.lang.String str27 = type10.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        java.lang.String str37 = type35.getClassName();
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(96, type35);
        int int39 = type35.getSort();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type32, type33, type35, type40 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("boolean", type31, typeArray42);
        org.mockito.asm.Type[] typeArray44 = signature43.getArgumentTypes();
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray44);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("L1484920123", type7, typeArray44);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = type1.getInternalName();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L580207397", "L793134035L396320025", "L17466049", 136);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.getClassName();
        int int8 = type1.getOpcode(126);
        java.lang.String str9 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type1.getDimensions();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        java.lang.String str10 = type8.getClassName();
        int int11 = type8.getSort();
        java.lang.Class<?> wildcardClass12 = type8.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(158, "L1473734069", type17, (java.lang.Object) "L1059692176");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        boolean boolean5 = type1.equals((java.lang.Object) 1.0f);
        java.lang.String str6 = type1.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        java.lang.String str10 = type8.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        int int17 = type16.getSize();
        int int18 = type16.getSort();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type15, type16 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("F", type13, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("I", type8, typeArray19);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("L271690198", type1, typeArray19);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        java.lang.String str24 = type23.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type23.getInternalName();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L1122543531", "java/lang/Integer", "L301578019", 40);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("L217349127", "L985062205");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getClassName();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("I(DCF)Z");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        org.mockito.asm.Type type23 = local22.getType();
        int int25 = type23.getOpcode(14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type23.getInternalName();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        boolean boolean24 = type2.equals((java.lang.Object) "L1040688836");
        int int26 = type2.getOpcode(129);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type2.getDimensions();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type1, typeArray18);
        java.lang.String str21 = type1.getClassName();
        int int22 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type1.getElementType();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        int int9 = type7.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        java.lang.String str23 = type21.getClassName();
        int int24 = type21.getSort();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type14, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("S", type7, typeArray25);
        boolean boolean28 = type5.equals((java.lang.Object) type7);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((-1), type36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((-1), type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        java.lang.String str45 = type43.getClassName();
        int int46 = type43.getSort();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type36, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type33, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type31, typeArray47);
        java.lang.String str50 = signature49.toString();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        boolean boolean52 = signature49.equals((java.lang.Object) type51);
        org.mockito.asm.Type[] typeArray53 = signature49.getArgumentTypes();
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray53);
        int int56 = type5.getOpcode((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type57 = type5.getElementType();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        boolean boolean4 = type1.equals((java.lang.Object) '#');
        int int5 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/Signature");
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 1, type3);
        boolean boolean5 = type0.equals((java.lang.Object) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSort();
        label0.info = type3;
        java.lang.String str7 = type3.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type3.getInternalName();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        int int24 = type2.getOpcode(2);
        java.lang.String str25 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type2.getElementType();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        int int5 = type2.getSort();
        java.lang.String str6 = type2.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        int int10 = type8.getOpcode(1);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((-1), type15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((-1), type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        java.lang.String str24 = type22.getClassName();
        int int25 = type22.getSort();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type12, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("S", type8, typeArray26);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("I", type2, typeArray26);
        java.lang.String str30 = type2.getClassName();
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(130, type2);
        java.lang.String str32 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int33 = type2.getDimensions();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        int int6 = type1.getOpcode(104);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("L1708628491", "boolean");
        java.lang.String str10 = signature9.getName();
        java.lang.String str11 = signature9.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((-1), type19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        java.lang.String str28 = type26.getClassName();
        int int29 = type26.getSort();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type19, type22, type24, type26 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type16, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type14, typeArray30);
        java.lang.String str33 = signature32.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        java.lang.String str37 = type35.getClassName();
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) 'a', type35);
        boolean boolean39 = signature32.equals((java.lang.Object) 'a');
        boolean boolean40 = signature9.equals((java.lang.Object) signature32);
        java.lang.String str41 = signature9.getName();
        boolean boolean42 = type1.equals((java.lang.Object) str41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type43 = type1.getElementType();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L777774563", "L1137100583", "L1342726989", 190);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        int int8 = type6.getOpcode(1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        java.lang.String str22 = type20.getClassName();
        int int23 = type20.getSort();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("S", type6, typeArray24);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray24);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        int int31 = type29.getOpcode(1);
        java.lang.Class<?> wildcardClass32 = type29.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type35 = type34.getElementType();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.getClassName();
        java.lang.String str43 = type41.getClassName();
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(96, type41);
        int int45 = type41.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type38, type39, type41, type46 };
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("boolean", type37, typeArray48);
        org.mockito.asm.Type[] typeArray50 = signature49.getArgumentTypes();
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("C", type34, typeArray50);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray50);
        java.lang.String str53 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int54 = type1.getDimensions();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        java.lang.String[] strArray17 = new java.lang.String[] { "L888558028", "L1125084315", "L932860259", "L1124549353", "L405704883", "L26755881" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(128, 19, "L1326844943", "(DDZZ)Z", "L1413779145", strArray17);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.toString();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(9, type1);
        org.mockito.asm.Type type5 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type5.getDimensions();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(DDZZ)D");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type2.getElementType();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L409450089", "L1703712191");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        int int5 = type2.getSize();
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        java.lang.String str14 = type12.getClassName();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(96, type12);
        int int16 = type12.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type9, type10, type12, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("boolean", type8, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type2, typeArray19);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray19);
        int int24 = type0.getOpcode(154);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type0.getDimensions();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        java.lang.String str8 = type6.getClassName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(96, type6);
        java.lang.String str10 = type6.toString();
        int int11 = type6.getSort();
        int int13 = type6.getOpcode(9);
        label0.info = type6;
        int int15 = type6.getSort();
        int int16 = type6.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type6.getInternalName();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        java.lang.String str14 = type1.toString();
        int int16 = type1.getOpcode(0);
        int int18 = type1.getOpcode(44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type1.getInternalName();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        java.lang.String str3 = label0.toString();
        java.lang.Object obj4 = label0.info;
        java.lang.Object obj5 = label0.info;
        label0.info = 128;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        java.lang.String str11 = type9.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        int int18 = type17.getSize();
        int int19 = type17.getSort();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type15, type16, type17 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("F", type14, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("I", type9, typeArray20);
        label0.info = type9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type9.getDimensions();
    }
}

