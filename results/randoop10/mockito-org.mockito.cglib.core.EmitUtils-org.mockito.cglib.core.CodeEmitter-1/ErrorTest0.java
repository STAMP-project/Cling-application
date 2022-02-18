import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type2, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type2.getInternalName();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str17 = signature16.toString();
        org.mockito.asm.Type[] typeArray18 = signature16.getArgumentTypes();
        org.mockito.asm.Type type19 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type19.getElementType();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type type35 = local33.getType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(154, type39);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type29, type30, type35, type36, type37, type39 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray41);
        boolean boolean44 = type24.equals((java.lang.Object) type25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = type25.getInternalName();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        int int4 = type2.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("int", type7, typeArray25);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(154, type30);
        org.mockito.asm.Type type32 = local31.getType();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local(154, type52);
        boolean boolean54 = signature50.equals((java.lang.Object) type52);
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local(155, type52);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local((int) 'a', type58);
        java.lang.String str60 = type58.getClassName();
        int int62 = type58.getOpcode(1);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str65 = type64.toString();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local((int) 'a', type69);
        org.mockito.asm.Type type71 = local70.getType();
        org.mockito.asm.Type type72 = local70.getType();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local77 = new org.mockito.cglib.core.Local(154, type76);
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type66, type67, type72, type73, type74, type76 };
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("hi!", type64, typeArray78);
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type58, typeArray78);
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray78);
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray78);
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray78);
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int85 = type2.getDimensions();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type24.getDimensions();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.getClassName();
        int int5 = type1.getOpcode(1);
        int int7 = type1.getOpcode(112);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type type35 = local33.getType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(154, type39);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type29, type30, type35, type36, type37, type39 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray41);
        boolean boolean44 = type24.equals((java.lang.Object) type25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int45 = type24.getDimensions();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(156, type3);
        java.lang.String str27 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type3.getElementType();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        int int17 = type1.getSort();
        java.lang.String str18 = type1.getDescriptor();
        java.lang.String str19 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type1.getDimensions();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        java.lang.String str21 = signature20.toString();
        org.mockito.asm.Type[] typeArray22 = signature20.getArgumentTypes();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("B", type2, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type2.getInternalName();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(156, type3);
        int int27 = local26.getIndex();
        org.mockito.asm.Type type28 = local26.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type28.getInternalName();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) 'a', type25);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type type28 = local26.getType();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(154, type32);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type22, type23, type28, type29, type30, type32 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray34);
        java.lang.String str36 = signature35.toString();
        org.mockito.asm.Type[] typeArray37 = signature35.getArgumentTypes();
        org.mockito.asm.Type[] typeArray38 = signature35.getArgumentTypes();
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray38);
        int int40 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int41 = type2.getDimensions();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("(SDIISI)S", "", "B");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("(SDIISI)S", false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(156, type3);
        int int27 = local26.getIndex();
        org.mockito.asm.Type type28 = local26.getType();
        org.mockito.asm.Type type29 = local26.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type29.getInternalName();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type22.getInternalName();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("short", "int", "org.mockito.asm.Type", 153);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        int int3 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type2.getInternalName();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 10, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        java.lang.String str4 = type2.toString();
        java.lang.String str5 = type2.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(112, type2);
        int int7 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type2.getInternalName();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type23 = local22.getType();
        int int24 = type23.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type23.getInternalName();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type1.getDimensions();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        int int30 = type27.getOpcode(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type27.getElementType();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type17 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type17.getInternalName();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type24.getInternalName();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        int int23 = type22.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type22.getInternalName();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("Lorg/mockito/asm/Type;(SDIISI)J", true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type0.getOpcode(126);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) 'a', type25);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type type28 = local26.getType();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(154, type32);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type22, type23, type28, type29, type30, type32 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray34);
        java.lang.String str36 = signature35.toString();
        org.mockito.asm.Type[] typeArray37 = signature35.getArgumentTypes();
        org.mockito.asm.Type[] typeArray38 = signature35.getArgumentTypes();
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray38);
        java.lang.String str40 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = type2.getInternalName();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        java.lang.String str4 = type2.toString();
        java.lang.String str5 = type2.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(112, type2);
        org.mockito.asm.Type type7 = local6.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type7.getInternalName();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L190120263", "org.mockito.cglib.core.Signature", "L1273107961");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type2, typeArray20);
        java.lang.String str23 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type2.getElementType();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type23 = local22.getType();
        int int24 = type23.getSort();
        int int25 = type23.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type23.getElementType();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type2.getElementType();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type22.getElementType();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type18.getDimensions();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("L1908869776", false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        org.mockito.asm.Type type29 = local28.getType();
        org.mockito.asm.Type type30 = local28.getType();
        org.mockito.asm.Type type31 = local28.getType();
        int int32 = type31.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int33 = type31.getDimensions();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type23 = local22.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type23.getInternalName();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        boolean boolean24 = signature20.equals((java.lang.Object) type22);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(155, type22);
        label1.info = 155;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) 'a', type28);
        java.lang.String str30 = type28.getClassName();
        int int32 = type28.getOpcode(1);
        label1.info = type28;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type34 = type28.getElementType();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        java.lang.String str24 = signature16.toString();
        org.mockito.asm.Type type25 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type25.getInternalName();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) 'a', type12);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.asm.Type type15 = local13.getType();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type9, type10, type15, type16, type17, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type7, typeArray21);
        int int23 = type7.getSize();
        java.lang.String str24 = type7.toString();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(8, type7);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (byte) -1, type28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) 'a', type36);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(154, type43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type33, type34, type39, type40, type41, type43 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray45);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(154, type48);
        boolean boolean50 = signature46.equals((java.lang.Object) type48);
        org.mockito.asm.Type type51 = signature46.getReturnType();
        java.lang.String str52 = signature46.getName();
        java.lang.String str53 = signature46.toString();
        java.lang.String str54 = signature46.toString();
        org.mockito.asm.Type[] typeArray55 = signature46.getArgumentTypes();
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type28, typeArray55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(7, 4, "L562496996", type7, typeArray55, "L1784976952");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        int int21 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type2.getInternalName();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int3 = type1.getOpcode(126);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("short", "L2089145944", "L135068834", 104);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        org.mockito.asm.Type type26 = signature24.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = type26.getElementType();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type2.getDimensions();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type4 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        org.mockito.asm.Type type21 = local20.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type21.getDimensions();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type4 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = type1.getSort();
        int int5 = type1.getOpcode(112);
        int int6 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(156, type3);
        int int27 = local26.getIndex();
        org.mockito.asm.Type type28 = local26.getType();
        org.mockito.asm.Type type29 = local26.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type29.getDimensions();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type2, typeArray20);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        int int25 = type23.getOpcode(128);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type23.getElementType();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = type1.getSort();
        int int5 = type1.getOpcode(112);
        int int6 = type1.getSort();
        int int7 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type0.getInternalName();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int3 = type1.getOpcode(126);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type1);
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        boolean boolean25 = signature21.equals((java.lang.Object) type23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(155, type23);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        java.lang.String str31 = type29.getClassName();
        int int33 = type29.getOpcode(1);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type29, typeArray49);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray49);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray49);
        org.mockito.asm.Label label54 = new org.mockito.asm.Label();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) 'a', type56);
        java.lang.String str58 = type56.getClassName();
        int int60 = type56.getOpcode(1);
        label54.info = 1;
        java.lang.Object obj62 = label54.info;
        boolean boolean63 = type3.equals(obj62);
        java.lang.String str64 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str65 = type3.getInternalName();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        org.mockito.asm.Type type4 = local3.getType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) 'a', type12);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.asm.Type type15 = local13.getType();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type9, type10, type15, type16, type17, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type7, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(154, type24);
        boolean boolean26 = signature22.equals((java.lang.Object) type24);
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(155, type24);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((int) 'a', type30);
        java.lang.String str32 = type30.getClassName();
        int int34 = type30.getOpcode(1);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local((int) 'a', type41);
        org.mockito.asm.Type type43 = local42.getType();
        org.mockito.asm.Type type44 = local42.getType();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(154, type48);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type38, type39, type44, type45, type46, type48 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray50);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type30, typeArray50);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray50);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray50);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local((int) 'a', type57);
        java.lang.String str59 = type57.getClassName();
        int int61 = type57.getOpcode(1);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str64 = type63.toString();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local69 = new org.mockito.cglib.core.Local((int) 'a', type68);
        org.mockito.asm.Type type70 = local69.getType();
        org.mockito.asm.Type type71 = local69.getType();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type73 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local76 = new org.mockito.cglib.core.Local(154, type75);
        org.mockito.asm.Type[] typeArray77 = new org.mockito.asm.Type[] { type65, type66, type71, type72, type73, type75 };
        org.mockito.cglib.core.Signature signature78 = new org.mockito.cglib.core.Signature("hi!", type63, typeArray77);
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("L1908869776", type57, typeArray77);
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("L631593947", type4, typeArray77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str81 = type4.getInternalName();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str17 = signature16.toString();
        org.mockito.asm.Type[] typeArray18 = signature16.getArgumentTypes();
        org.mockito.asm.Type type19 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type19.getInternalName();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        org.mockito.asm.Type type4 = local3.getType();
        int int5 = type4.getSize();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(116, type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type4.getDimensions();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        boolean boolean25 = signature21.equals((java.lang.Object) type23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(155, type23);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        java.lang.String str31 = type29.getClassName();
        int int33 = type29.getOpcode(1);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type29, typeArray49);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray49);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray49);
        org.mockito.asm.Label label54 = new org.mockito.asm.Label();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) 'a', type56);
        java.lang.String str58 = type56.getClassName();
        int int60 = type56.getOpcode(1);
        label54.info = 1;
        java.lang.Object obj62 = label54.info;
        boolean boolean63 = type3.equals(obj62);
        java.lang.String str64 = type3.getDescriptor();
        int int66 = type3.getOpcode(154);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str67 = type3.getInternalName();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type type35 = local33.getType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(154, type39);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type29, type30, type35, type36, type37, type39 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray41);
        boolean boolean44 = type24.equals((java.lang.Object) type25);
        java.lang.String str45 = type25.getDescriptor();
        int int46 = type25.getSort();
        java.lang.String str47 = type25.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type48 = type25.getElementType();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        java.lang.String str4 = type2.toString();
        java.lang.String str5 = type2.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(112, type2);
        int int7 = type2.getSize();
        java.lang.String str8 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type2.getDimensions();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type24.getElementType();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        org.mockito.asm.Type type29 = local28.getType();
        org.mockito.asm.Type type30 = local28.getType();
        org.mockito.asm.Type type31 = local28.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type31.getDimensions();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        int int27 = type25.getSort();
        java.lang.String str28 = type25.toString();
        boolean boolean29 = type23.equals((java.lang.Object) type25);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) 'a', type36);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(154, type43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type33, type34, type39, type40, type41, type43 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray45);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(154, type48);
        boolean boolean50 = signature46.equals((java.lang.Object) type48);
        org.mockito.asm.Type type51 = signature46.getReturnType();
        org.mockito.asm.Type[] typeArray52 = signature46.getArgumentTypes();
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray52);
        java.lang.String str54 = type23.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type55 = type23.getElementType();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) -1, type3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        java.lang.String str22 = signature21.toString();
        org.mockito.asm.Type[] typeArray23 = signature21.getArgumentTypes();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("B", type3, typeArray23);
        java.lang.String str25 = type3.getClassName();
        org.mockito.asm.Type[] typeArray27 = org.mockito.asm.Type.getArgumentTypes("(SDIISI)Lorg/mockito/asm/Type;");
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Local;", type3, typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type3.getElementType();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        java.lang.String str4 = type2.toString();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        java.lang.String str6 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type2.getElementType();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        int int23 = type19.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type19.getElementType();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org/mockito/asm/Type(SDIISI)I");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        org.mockito.asm.Type[] typeArray26 = signature24.getArgumentTypes();
        org.mockito.asm.Type type27 = signature24.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = type27.getDimensions();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        org.mockito.asm.Type type23 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type23.getInternalName();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        org.mockito.asm.Type type3 = local2.getType();
        int int4 = type3.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type3.getDimensions();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) 'a', type25);
        java.lang.String str27 = type25.getClassName();
        int int29 = type25.getOpcode(1);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) 'a', type36);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(154, type43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type33, type34, type39, type40, type41, type43 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray45);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type25, typeArray45);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = type19.getInternalName();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) 'a', type8);
        org.mockito.asm.Type type10 = local9.getType();
        org.mockito.asm.Type type11 = local9.getType();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(154, type15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type5, type6, type11, type12, type13, type15 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray17);
        int int19 = type3.getSize();
        java.lang.String str20 = type3.toString();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(8, type3);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (byte) 1, type3);
        int int24 = type3.getOpcode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type3.getDimensions();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(SDIISI)I");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) 'a', type5);
        java.lang.String str7 = type5.getClassName();
        int int9 = type5.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("L1908869776", type5, typeArray25);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("short", type2, typeArray28);
        java.lang.String str30 = type2.getDescriptor();
        java.lang.String str31 = type2.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass33 = type32.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        java.lang.String str35 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        java.lang.String str37 = type36.getInternalName();
        int int39 = type36.getOpcode(112);
        boolean boolean40 = type2.equals((java.lang.Object) type36);
        org.mockito.asm.Type type41 = type2.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type42 = type41.getElementType();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        org.mockito.asm.Type[] typeArray23 = signature16.getArgumentTypes();
        java.lang.String str24 = signature16.getName();
        java.lang.String str25 = signature16.getName();
        org.mockito.asm.Type type26 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = type26.getElementType();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        int int21 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type2.getDimensions();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = type1.getSort();
        int int5 = type1.getOpcode(112);
        int int6 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type type35 = local33.getType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(154, type39);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type29, type30, type35, type36, type37, type39 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray41);
        boolean boolean44 = type24.equals((java.lang.Object) type25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int45 = type25.getDimensions();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        org.mockito.asm.Type type29 = local28.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type29.getElementType();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters6 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("int", "int", "S");
        label0.info = arrayDelimiters6;
        java.lang.String str8 = label0.toString();
        java.lang.String str9 = label0.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) -1, type11);
        int int13 = type11.getSort();
        int int15 = type11.getOpcode(112);
        int int16 = type11.getSize();
        label0.info = type11;
        java.lang.String str18 = type11.getDescriptor();
        boolean boolean20 = type11.equals((java.lang.Object) 157);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type11.getInternalName();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("L33429473", true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.getStaticHook();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = classEmitter0.getAccess();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(52);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) 10, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        int int17 = type1.getSort();
        int int18 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type1.getDimensions();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("int(SDIISI)I");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        java.lang.String str21 = type18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type18.getDimensions();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        org.mockito.asm.Type type4 = local3.getType();
        org.mockito.asm.Type type5 = local3.getType();
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(96, type5);
        int int8 = type5.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type5.getInternalName();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        int int26 = type25.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type25.getInternalName();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) 'a', type31);
        org.mockito.asm.Type type33 = local32.getType();
        org.mockito.asm.Type type34 = local32.getType();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(154, type38);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type28, type29, type34, type35, type36, type38 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("hi!", type26, typeArray40);
        java.lang.String str42 = signature41.toString();
        org.mockito.asm.Type[] typeArray43 = signature41.getArgumentTypes();
        org.mockito.asm.Type[] typeArray44 = signature41.getArgumentTypes();
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray44);
        boolean boolean47 = type2.equals((java.lang.Object) "(I)I");
        int int49 = type2.getOpcode((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type50 = type2.getElementType();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(154, type3);
        java.lang.String str5 = type3.toString();
        java.lang.String str6 = type3.getClassName();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(112, type3);
        java.lang.String str8 = type3.getDescriptor();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(97, type3);
        org.mockito.asm.Type type10 = local9.getType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("hi!(SDIISI)S");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) 'a', type21);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type type24 = local22.getType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(154, type28);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type18, type19, type24, type25, type26, type28 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray30);
        int int32 = type16.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) 'a', type39);
        org.mockito.asm.Type type41 = local40.getType();
        org.mockito.asm.Type type42 = local40.getType();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local(154, type46);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type36, type37, type42, type43, type44, type46 };
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("hi!", type34, typeArray48);
        java.lang.String str50 = signature49.toString();
        org.mockito.asm.Type[] typeArray51 = signature49.getArgumentTypes();
        org.mockito.asm.Type[] typeArray52 = signature49.getArgumentTypes();
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("L1908869776", type16, typeArray52);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", type13, typeArray52);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int56 = type10.getDimensions();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        org.mockito.asm.Type type26 = signature24.getReturnType();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = local34.getType();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(154, type40);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type30, type31, type36, type37, type38, type40 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray42);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local(154, type45);
        boolean boolean47 = signature43.equals((java.lang.Object) type45);
        org.mockito.asm.Type type48 = signature43.getReturnType();
        org.mockito.asm.Type[] typeArray49 = signature43.getArgumentTypes();
        boolean boolean50 = type26.equals((java.lang.Object) typeArray49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = type26.getInternalName();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        boolean boolean24 = signature20.equals((java.lang.Object) type22);
        org.mockito.asm.Type type25 = signature20.getReturnType();
        int int27 = type25.getOpcode((int) 'a');
        boolean boolean28 = type3.equals((java.lang.Object) int27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type3.getInternalName();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        java.lang.String str24 = signature16.toString();
        org.mockito.asm.Type type25 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type25.getDimensions();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        int int4 = type2.getOpcode(126);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type2);
        java.lang.String str6 = type2.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (byte) -1, type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) 'a', type17);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.asm.Type type20 = local18.getType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(154, type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type14, type15, type20, type21, type22, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        java.lang.String str28 = signature27.toString();
        org.mockito.asm.Type[] typeArray29 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("B", type9, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("S", type2, typeArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type2.getInternalName();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type3.getInternalName();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        java.lang.String str18 = signature17.getName();
        boolean boolean19 = type0.equals((java.lang.Object) signature17);
        int int21 = type0.getOpcode(14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type0.getElementType();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        int int4 = type2.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        java.lang.String str9 = type7.getClassName();
        int int11 = type7.getOpcode(1);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) 'a', type18);
        org.mockito.asm.Type type20 = local19.getType();
        org.mockito.asm.Type type21 = local19.getType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type15, type16, type21, type22, type23, type25 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("L1908869776", type7, typeArray27);
        org.mockito.asm.Type[] typeArray30 = signature29.getArgumentTypes();
        org.mockito.asm.Type[] typeArray31 = signature29.getArgumentTypes();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/LocalVariablesSorter", type2, typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type2.getInternalName();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type32 = local30.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type26, type27, type32, type33, type34, type36 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray38);
        int int40 = type24.getSize();
        java.lang.String str41 = type24.toString();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(8, type24);
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (byte) 1, type24);
        boolean boolean44 = type2.equals((java.lang.Object) type24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = type2.getInternalName();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        int int21 = type2.getSize();
        java.lang.String str22 = type2.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("org/mockito/asm/Type");
        int int26 = type24.getOpcode(0);
        int int28 = type24.getOpcode(52);
        boolean boolean29 = type2.equals((java.lang.Object) int28);
        int int31 = type2.getOpcode((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type2.getInternalName();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(154, type3);
        java.lang.String str5 = type3.toString();
        java.lang.String str6 = type3.getClassName();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(112, type3);
        java.lang.String str8 = type3.getDescriptor();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(97, type3);
        org.mockito.asm.Type type10 = local9.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type10.getInternalName();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.getClassName();
        int int5 = type1.getOpcode(1);
        int int7 = type1.getOpcode(112);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        boolean boolean27 = signature24.equals((java.lang.Object) 6);
        org.mockito.asm.Type[] typeArray28 = signature24.getArgumentTypes();
        org.mockito.asm.Type type29 = signature24.getReturnType();
        int int31 = type29.getOpcode(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type29.getInternalName();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        int int3 = type1.getSize();
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        org.mockito.asm.Type type29 = local28.getType();
        int int30 = local28.getIndex();
        int int31 = local28.getIndex();
        org.mockito.asm.Type type32 = local28.getType();
        org.mockito.asm.Type type33 = local28.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type33.getDimensions();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        java.lang.String str19 = type0.toString();
        java.lang.String str20 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type0.getElementType();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        int int17 = type1.getSort();
        java.lang.String str18 = type1.getDescriptor();
        java.lang.String str19 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type1.getElementType();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type4 = local2.getType();
        int int5 = local2.getIndex();
        int int6 = local2.getIndex();
        int int7 = local2.getIndex();
        org.mockito.asm.Type type8 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type8.getDimensions();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        java.lang.String str19 = type0.getClassName();
        int int21 = type0.getOpcode((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type0.getInternalName();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        java.lang.String str25 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type2.getDimensions();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type32 = local30.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type26, type27, type32, type33, type34, type36 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray38);
        int int40 = type24.getSize();
        java.lang.String str41 = type24.toString();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(8, type24);
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (byte) 1, type24);
        boolean boolean44 = type2.equals((java.lang.Object) type24);
        int int46 = type24.getOpcode((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = type24.getInternalName();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        org.mockito.asm.Type type4 = local3.getType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        boolean boolean25 = signature21.equals((java.lang.Object) type23);
        org.mockito.asm.Type type26 = signature21.getReturnType();
        int int28 = type26.getOpcode((int) 'a');
        boolean boolean29 = type4.equals((java.lang.Object) int28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) 'a', type36);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(154, type43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type33, type34, type39, type40, type41, type43 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray45);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(154, type48);
        boolean boolean50 = signature46.equals((java.lang.Object) type48);
        org.mockito.asm.Type type51 = signature46.getReturnType();
        org.mockito.asm.Type[] typeArray52 = signature46.getArgumentTypes();
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type4, typeArray52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int54 = type4.getDimensions();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        java.lang.String str25 = signature24.getName();
        java.lang.String str26 = signature24.getDescriptor();
        org.mockito.asm.Type type27 = signature24.getReturnType();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        java.lang.String str34 = type32.getClassName();
        int int36 = type32.getOpcode(1);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((int) 'a', type43);
        org.mockito.asm.Type type45 = local44.getType();
        org.mockito.asm.Type type46 = local44.getType();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(154, type50);
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type40, type41, type46, type47, type48, type50 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("hi!", type38, typeArray52);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type32, typeArray52);
        org.mockito.asm.Type type55 = signature54.getReturnType();
        org.mockito.asm.Type type56 = signature54.getReturnType();
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(97, type56);
        org.mockito.asm.Type type58 = local57.getType();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local((int) 'a', type61);
        java.lang.String str63 = type61.getClassName();
        int int65 = type61.getOpcode(1);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str68 = type67.toString();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local73 = new org.mockito.cglib.core.Local((int) 'a', type72);
        org.mockito.asm.Type type74 = local73.getType();
        org.mockito.asm.Type type75 = local73.getType();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local80 = new org.mockito.cglib.core.Local(154, type79);
        org.mockito.asm.Type[] typeArray81 = new org.mockito.asm.Type[] { type69, type70, type75, type76, type77, type79 };
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("hi!", type67, typeArray81);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("L1908869776", type61, typeArray81);
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("J", type58, typeArray81);
        java.lang.String str85 = signature84.getName();
        boolean boolean86 = type27.equals((java.lang.Object) signature84);
        java.lang.String str87 = type27.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type88 = type27.getElementType();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type2.getInternalName();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type2, typeArray20);
        java.lang.String str23 = type2.getClassName();
        boolean boolean25 = type2.equals((java.lang.Object) 156);
        int int26 = type2.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type2.getDimensions();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = signature17.getReturnType();
        java.lang.String str23 = signature17.getName();
        java.lang.String str24 = signature17.getName();
        org.mockito.asm.Type type25 = signature17.getReturnType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = local34.getType();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(154, type40);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type30, type31, type36, type37, type38, type40 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray42);
        boolean boolean45 = type25.equals((java.lang.Object) type26);
        java.lang.String str46 = type26.getDescriptor();
        int int47 = type26.getSort();
        java.lang.String str48 = type26.getClassName();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local((int) 'a', type51);
        java.lang.String str53 = type51.getClassName();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str56 = type55.toString();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local61 = new org.mockito.cglib.core.Local((int) 'a', type60);
        org.mockito.asm.Type type62 = local61.getType();
        org.mockito.asm.Type type63 = local61.getType();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local68 = new org.mockito.cglib.core.Local(154, type67);
        org.mockito.asm.Type[] typeArray69 = new org.mockito.asm.Type[] { type57, type58, type63, type64, type65, type67 };
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("hi!", type55, typeArray69);
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("int", type51, typeArray69);
        org.mockito.asm.Type type72 = signature71.getReturnType();
        org.mockito.asm.Type[] typeArray73 = signature71.getArgumentTypes();
        org.mockito.asm.Type type75 = org.mockito.asm.Type.getType("B");
        boolean boolean76 = signature71.equals((java.lang.Object) type75);
        org.mockito.asm.Type[] typeArray77 = signature71.getArgumentTypes();
        org.mockito.cglib.core.Signature signature78 = new org.mockito.cglib.core.Signature("L248748310", type26, typeArray77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int79 = type26.getDimensions();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lhi!(SDIISI)S;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1786034541", "int(SDIISI)I");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type3.getDimensions();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("hi!(SDIISI)S");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        int int22 = type6.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type32 = local30.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type26, type27, type32, type33, type34, type36 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray38);
        java.lang.String str40 = signature39.toString();
        org.mockito.asm.Type[] typeArray41 = signature39.getArgumentTypes();
        org.mockito.asm.Type[] typeArray42 = signature39.getArgumentTypes();
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1908869776", type6, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", type3, typeArray42);
        int int46 = type3.getOpcode(155);
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local(100, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = type3.getInternalName();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Type[] typeArray2 = org.mockito.asm.Type.getArgumentTypes("LSDIISI)L(SDIISI)I;");
        label0.info = "LSDIISI)L(SDIISI)I;";
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        java.lang.String str9 = type7.getClassName();
        int int11 = type7.getOpcode(1);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) 'a', type18);
        org.mockito.asm.Type type20 = local19.getType();
        org.mockito.asm.Type type21 = local19.getType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type15, type16, type21, type22, type23, type25 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type7, typeArray27);
        org.mockito.asm.Type type30 = signature29.getReturnType();
        org.mockito.asm.Type type31 = signature29.getReturnType();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(97, type31);
        org.mockito.asm.Type type33 = local32.getType();
        int int34 = local32.getIndex();
        int int35 = local32.getIndex();
        org.mockito.asm.Type type36 = local32.getType();
        label0.info = type36;
        java.lang.String str38 = type36.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type39 = type36.getElementType();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) 'a', type12);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.asm.Type type15 = local13.getType();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type9, type10, type15, type16, type17, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type7, typeArray21);
        java.lang.String str23 = signature22.toString();
        org.mockito.asm.Type[] typeArray24 = signature22.getArgumentTypes();
        org.mockito.asm.Type[] typeArray25 = signature22.getArgumentTypes();
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray25);
        java.lang.String str27 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = type1.getInternalName();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type23 = local22.getType();
        int int24 = type23.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type23.getDimensions();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        org.mockito.asm.Type type29 = local28.getType();
        org.mockito.asm.Type type30 = local28.getType();
        org.mockito.asm.Type type31 = local28.getType();
        int int32 = type31.getSort();
        java.lang.String str33 = type31.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type31.getDimensions();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = signature17.getReturnType();
        java.lang.String str23 = signature17.getName();
        java.lang.String str24 = signature17.getName();
        org.mockito.asm.Type type25 = signature17.getReturnType();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(108, type25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type25.getDimensions();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        boolean boolean25 = signature21.equals((java.lang.Object) type23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(155, type23);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        java.lang.String str31 = type29.getClassName();
        int int33 = type29.getOpcode(1);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type29, typeArray49);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray49);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray49);
        org.mockito.asm.Label label54 = new org.mockito.asm.Label();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) 'a', type56);
        java.lang.String str58 = type56.getClassName();
        int int60 = type56.getOpcode(1);
        label54.info = 1;
        java.lang.Object obj62 = label54.info;
        boolean boolean63 = type3.equals(obj62);
        int int64 = type3.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str65 = type3.getInternalName();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        java.lang.String str25 = signature16.getName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = local34.getType();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(154, type40);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type30, type31, type36, type37, type38, type40 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray42);
        java.lang.String str45 = type26.getClassName();
        boolean boolean46 = signature16.equals((java.lang.Object) type26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type47 = type26.getElementType();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        java.lang.String str4 = type2.toString();
        java.lang.String str5 = type2.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(112, type2);
        java.lang.String str7 = type2.getDescriptor();
        java.lang.String str8 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type2.getInternalName();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type type35 = local33.getType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(154, type39);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type29, type30, type35, type36, type37, type39 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray41);
        java.lang.String str43 = signature42.toString();
        org.mockito.asm.Type[] typeArray44 = signature42.getArgumentTypes();
        org.mockito.asm.Type[] typeArray45 = signature42.getArgumentTypes();
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray45);
        boolean boolean48 = type3.equals((java.lang.Object) "(I)I");
        int int49 = type3.getSize();
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(9, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type51 = type3.getElementType();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1273107961", "int(SDIISI)I");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        int int30 = type27.getOpcode(97);
        int int32 = type27.getOpcode(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type27.getElementType();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        org.mockito.asm.Type type4 = local3.getType();
        org.mockito.asm.Type type5 = local3.getType();
        java.lang.String str6 = type5.getClassName();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(0, type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type5.getDimensions();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type7 = local5.getType();
        java.lang.String str8 = type7.getDescriptor();
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = type1.equals((java.lang.Object) type7);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(126, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type1.getInternalName();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        java.lang.String str3 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/core/Signature;");
        int int5 = type4.getDimensions();
        int int7 = type4.getOpcode(124);
        boolean boolean8 = type1.equals((java.lang.Object) type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type1.getInternalName();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        int int17 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type1.getInternalName();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type7 = local5.getType();
        java.lang.String str8 = type7.getDescriptor();
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = type1.equals((java.lang.Object) type7);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(126, type1);
        org.mockito.asm.Type type12 = local11.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type12.getElementType();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        int int30 = type27.getOpcode(97);
        int int31 = type27.getSort();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((int) 'a', type38);
        org.mockito.asm.Type type40 = local39.getType();
        org.mockito.asm.Type type41 = local39.getType();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local(154, type45);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type35, type36, type41, type42, type43, type45 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", type33, typeArray47);
        java.lang.Class<?> wildcardClass49 = signature48.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass49);
        java.lang.String str52 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass49);
        boolean boolean53 = type27.equals((java.lang.Object) str52);
        int int54 = type27.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int55 = type27.getDimensions();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        java.lang.String str25 = type2.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = local34.getType();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(154, type40);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type30, type31, type36, type37, type38, type40 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray42);
        int int44 = type28.getSize();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str47 = type46.toString();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local((int) 'a', type51);
        org.mockito.asm.Type type53 = local52.getType();
        org.mockito.asm.Type type54 = local52.getType();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local(154, type58);
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type48, type49, type54, type55, type56, type58 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", type46, typeArray60);
        java.lang.String str62 = signature61.toString();
        org.mockito.asm.Type[] typeArray63 = signature61.getArgumentTypes();
        org.mockito.asm.Type[] typeArray64 = signature61.getArgumentTypes();
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("L1908869776", type28, typeArray64);
        boolean boolean66 = type2.equals((java.lang.Object) "L1908869776");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int67 = type2.getDimensions();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        int int4 = type2.getOpcode(126);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type2);
        java.lang.String str6 = type2.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (byte) -1, type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) 'a', type17);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.asm.Type type20 = local18.getType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(154, type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type14, type15, type20, type21, type22, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        java.lang.String str28 = signature27.toString();
        org.mockito.asm.Type[] typeArray29 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("B", type9, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("S", type2, typeArray29);
        int int32 = type2.getSize();
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters33 = org.mockito.cglib.core.EmitUtils.DEFAULT_DELIMITERS;
        java.lang.Class<?> wildcardClass34 = arrayDelimiters33.getClass();
        boolean boolean35 = type2.equals((java.lang.Object) arrayDelimiters33);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) 'a', type42);
        org.mockito.asm.Type type44 = local43.getType();
        org.mockito.asm.Type type45 = local43.getType();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(154, type49);
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type39, type40, type45, type46, type47, type49 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", type37, typeArray51);
        java.lang.String str53 = signature52.getName();
        org.mockito.asm.Type[] typeArray54 = signature52.getArgumentTypes();
        boolean boolean55 = type2.equals((java.lang.Object) signature52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str56 = type2.getInternalName();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        java.lang.String str25 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type2.getElementType();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        java.lang.String str25 = type24.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type24.getElementType();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) 'a', type12);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.asm.Type type15 = local13.getType();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type9, type10, type15, type16, type17, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type7, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("int", type3, typeArray21);
        org.mockito.asm.Type type24 = signature23.getReturnType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(154, type26);
        org.mockito.asm.Type type28 = local27.getType();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) 'a', type36);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(154, type43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type33, type34, type39, type40, type41, type43 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray45);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(154, type48);
        boolean boolean50 = signature46.equals((java.lang.Object) type48);
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(155, type48);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((int) 'a', type54);
        java.lang.String str56 = type54.getClassName();
        int int58 = type54.getOpcode(1);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str61 = type60.toString();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local66 = new org.mockito.cglib.core.Local((int) 'a', type65);
        org.mockito.asm.Type type67 = local66.getType();
        org.mockito.asm.Type type68 = local66.getType();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local73 = new org.mockito.cglib.core.Local(154, type72);
        org.mockito.asm.Type[] typeArray74 = new org.mockito.asm.Type[] { type62, type63, type68, type69, type70, type72 };
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("hi!", type60, typeArray74);
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type54, typeArray74);
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray74);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray74);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray74);
        org.mockito.cglib.core.Local local80 = new org.mockito.cglib.core.Local((int) '4', type24);
        org.mockito.asm.Type type81 = local80.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int82 = type81.getDimensions();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type32 = local30.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type26, type27, type32, type33, type34, type36 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray38);
        int int40 = type24.getSize();
        java.lang.String str41 = type24.toString();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(8, type24);
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (byte) 1, type24);
        boolean boolean44 = type2.equals((java.lang.Object) type24);
        int int46 = type24.getOpcode(153);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = type24.getDimensions();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org/mockito/asm/Type(SDIISI)I");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!(SDIISI)S");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        org.mockito.asm.Type type26 = signature24.getReturnType();
        java.lang.String str27 = signature24.getName();
        org.mockito.asm.Type type28 = signature24.getReturnType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = local34.getType();
        java.lang.String str37 = type36.getDescriptor();
        java.lang.String str38 = type36.getDescriptor();
        boolean boolean39 = type30.equals((java.lang.Object) type36);
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(126, type30);
        org.mockito.asm.Type type41 = local40.getType();
        boolean boolean42 = signature24.equals((java.lang.Object) type41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str43 = type41.getInternalName();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) 'a', type25);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type type28 = local26.getType();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(154, type32);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type22, type23, type28, type29, type30, type32 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray34);
        java.lang.String str36 = signature35.toString();
        org.mockito.asm.Type[] typeArray37 = signature35.getArgumentTypes();
        org.mockito.asm.Type[] typeArray38 = signature35.getArgumentTypes();
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray38);
        java.lang.String str40 = type2.toString();
        java.lang.String str41 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int42 = type2.getDimensions();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        java.lang.String str6 = type4.getClassName();
        int int8 = type4.getOpcode(1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) 'a', type15);
        org.mockito.asm.Type type17 = local16.getType();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type12, type13, type18, type19, type20, type22 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type4, typeArray24);
        org.mockito.asm.Type type27 = signature26.getReturnType();
        org.mockito.asm.Type type28 = signature26.getReturnType();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(97, type28);
        org.mockito.asm.Type type30 = local29.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        java.lang.String str35 = type33.getClassName();
        int int37 = type33.getOpcode(1);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str40 = type39.toString();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((int) 'a', type44);
        org.mockito.asm.Type type46 = local45.getType();
        org.mockito.asm.Type type47 = local45.getType();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local(154, type51);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type41, type42, type47, type48, type49, type51 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("hi!", type39, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("L1908869776", type33, typeArray53);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("J", type30, typeArray53);
        int int57 = type30.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str58 = type30.getInternalName();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        boolean boolean24 = signature20.equals((java.lang.Object) type22);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(155, type22);
        label1.info = 155;
        java.lang.String str27 = label1.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type type35 = local33.getType();
        java.lang.String str36 = type35.getDescriptor();
        java.lang.String str37 = type35.getDescriptor();
        boolean boolean38 = type29.equals((java.lang.Object) type35);
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(126, type29);
        java.lang.String str40 = type29.getDescriptor();
        label1.info = type29;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int42 = type29.getDimensions();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getClassName();
        int int5 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type4 = local2.getType();
        org.mockito.asm.Type type5 = local2.getType();
        org.mockito.asm.Type type6 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        boolean boolean24 = signature20.equals((java.lang.Object) type22);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(155, type22);
        label1.info = 155;
        java.lang.Object obj27 = label1.info;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(154, type30);
        java.lang.String str32 = type30.toString();
        java.lang.String str33 = type30.getClassName();
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(112, type30);
        org.mockito.asm.Type type35 = local34.getType();
        label1.info = type35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type37 = type35.getElementType();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str17 = signature16.toString();
        org.mockito.asm.Type[] typeArray18 = signature16.getArgumentTypes();
        org.mockito.asm.Type type19 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type19.getDimensions();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        java.lang.String str4 = type2.toString();
        java.lang.String str5 = type2.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(112, type2);
        java.lang.String str7 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type2.getElementType();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) 'a', type31);
        org.mockito.asm.Type type33 = local32.getType();
        org.mockito.asm.Type type34 = local32.getType();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(154, type38);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type28, type29, type34, type35, type36, type38 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("hi!", type26, typeArray40);
        java.lang.String str42 = signature41.toString();
        org.mockito.asm.Type[] typeArray43 = signature41.getArgumentTypes();
        org.mockito.asm.Type[] typeArray44 = signature41.getArgumentTypes();
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray44);
        boolean boolean47 = type2.equals((java.lang.Object) "(I)I");
        int int49 = type2.getOpcode((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int50 = type2.getDimensions();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(52);
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = signature17.getReturnType();
        java.lang.String str23 = signature17.getName();
        org.mockito.asm.Type[] typeArray24 = signature17.getArgumentTypes();
        org.mockito.asm.Type type25 = signature17.getReturnType();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (byte) -1, type28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) 'a', type36);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(154, type43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type33, type34, type39, type40, type41, type43 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray45);
        java.lang.String str47 = signature46.toString();
        org.mockito.asm.Type[] typeArray48 = signature46.getArgumentTypes();
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("B", type28, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.Signature", type25, typeArray48);
        java.lang.String str51 = signature50.toString();
        org.mockito.asm.Type type52 = signature50.getReturnType();
        java.lang.String str53 = type52.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type54 = type52.getElementType();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        java.lang.String str18 = signature17.getName();
        boolean boolean19 = type0.equals((java.lang.Object) signature17);
        java.lang.String str20 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type0.getDimensions();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type4 = local2.getType();
        int int5 = local2.getIndex();
        int int6 = local2.getIndex();
        int int7 = local2.getIndex();
        org.mockito.asm.Type type8 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type8.getElementType();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        int int17 = type1.getSort();
        java.lang.String str18 = type1.getDescriptor();
        java.lang.String str19 = type1.getDescriptor();
        java.lang.String str20 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type1.getInternalName();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        int int7 = type1.getOpcode(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getSuperType();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        org.mockito.asm.Type type26 = signature24.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type26.getInternalName();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type17 = signature16.getReturnType();
        org.mockito.asm.Type type18 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type18.getInternalName();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("hi!(SDIISI)S");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        int int22 = type6.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type32 = local30.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type26, type27, type32, type33, type34, type36 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray38);
        java.lang.String str40 = signature39.toString();
        org.mockito.asm.Type[] typeArray41 = signature39.getArgumentTypes();
        org.mockito.asm.Type[] typeArray42 = signature39.getArgumentTypes();
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1908869776", type6, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", type3, typeArray42);
        int int46 = type3.getOpcode(155);
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local(100, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int48 = type3.getDimensions();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        int int3 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        boolean boolean24 = signature20.equals((java.lang.Object) type22);
        org.mockito.asm.Type type25 = signature20.getReturnType();
        int int27 = type25.getOpcode((int) 'a');
        boolean boolean28 = type3.equals((java.lang.Object) int27);
        int int29 = type3.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type3.getElementType();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        org.mockito.asm.Type type29 = local28.getType();
        int int30 = local28.getIndex();
        org.mockito.asm.Type type31 = local28.getType();
        int int32 = type31.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type31.getElementType();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        boolean boolean25 = signature21.equals((java.lang.Object) type23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(155, type23);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        java.lang.String str31 = type29.getClassName();
        int int33 = type29.getOpcode(1);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type29, typeArray49);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray49);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type54 = type3.getElementType();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Z");
        java.lang.String str3 = type2.getClassName();
        int int4 = type2.getSort();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(108, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type2.getElementType();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(154, type3);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        boolean boolean27 = signature23.equals((java.lang.Object) type25);
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(155, type25);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) 'a', type31);
        java.lang.String str33 = type31.getClassName();
        int int35 = type31.getOpcode(1);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) 'a', type42);
        org.mockito.asm.Type type44 = local43.getType();
        org.mockito.asm.Type type45 = local43.getType();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(154, type49);
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type39, type40, type45, type46, type47, type49 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", type37, typeArray51);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type31, typeArray51);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray51);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray51);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local((int) 'a', type58);
        java.lang.String str60 = type58.getClassName();
        int int62 = type58.getOpcode(1);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str65 = type64.toString();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local((int) 'a', type69);
        org.mockito.asm.Type type71 = local70.getType();
        org.mockito.asm.Type type72 = local70.getType();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local77 = new org.mockito.cglib.core.Local(154, type76);
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type66, type67, type72, type73, type74, type76 };
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("hi!", type64, typeArray78);
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("L1908869776", type58, typeArray78);
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("L631593947", type5, typeArray78);
        org.mockito.cglib.core.Local local82 = new org.mockito.cglib.core.Local(112, type5);
        java.lang.String str83 = type5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int84 = type5.getDimensions();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) 'a', type26);
        java.lang.String str28 = type26.getClassName();
        int int30 = type26.getOpcode(1);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) 'a', type37);
        org.mockito.asm.Type type39 = local38.getType();
        org.mockito.asm.Type type40 = local38.getType();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(154, type44);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type34, type35, type40, type41, type42, type44 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type26, typeArray46);
        org.mockito.asm.Type type49 = signature48.getReturnType();
        org.mockito.asm.Type type50 = signature48.getReturnType();
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(97, type50);
        org.mockito.asm.Type type52 = local51.getType();
        boolean boolean53 = type19.equals((java.lang.Object) type52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type54 = type19.getElementType();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) 'a', type5);
        org.mockito.asm.Type type7 = local6.getType();
        org.mockito.asm.Type type8 = local6.getType();
        java.lang.String str9 = type8.getDescriptor();
        java.lang.String str10 = type8.getDescriptor();
        boolean boolean11 = type2.equals((java.lang.Object) type8);
        int int12 = type8.getSort();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type8);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.asm.Type type15 = local13.getType();
        org.mockito.asm.Type type16 = local13.getType();
        boolean boolean17 = type0.equals((java.lang.Object) type16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type0.getInternalName();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSort();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = signature17.getReturnType();
        java.lang.String str23 = signature17.getName();
        java.lang.String str24 = signature17.getName();
        java.lang.String str25 = signature17.getDescriptor();
        java.lang.String str26 = signature17.getName();
        org.mockito.asm.Type type27 = signature17.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(157, type27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type27.getElementType();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type4 = local2.getType();
        java.lang.String str5 = type4.getDescriptor();
        java.lang.String str6 = type4.getDescriptor();
        int int7 = type4.getSort();
        int int8 = type4.getSort();
        int int9 = type4.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type4.getInternalName();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type7 = local5.getType();
        java.lang.String str8 = type7.getDescriptor();
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = type1.equals((java.lang.Object) type7);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(126, type1);
        boolean boolean13 = type1.equals((java.lang.Object) "L1836861769");
        java.lang.String str14 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type1.getInternalName();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        org.mockito.asm.Type type29 = local28.getType();
        int int30 = local28.getIndex();
        int int31 = local28.getIndex();
        org.mockito.asm.Type type32 = local28.getType();
        org.mockito.asm.Type type33 = local28.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type34 = type33.getElementType();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        java.lang.String str25 = type2.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = local34.getType();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(154, type40);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type30, type31, type36, type37, type38, type40 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray42);
        int int44 = type28.getSize();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str47 = type46.toString();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local((int) 'a', type51);
        org.mockito.asm.Type type53 = local52.getType();
        org.mockito.asm.Type type54 = local52.getType();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local(154, type58);
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type48, type49, type54, type55, type56, type58 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", type46, typeArray60);
        java.lang.String str62 = signature61.toString();
        org.mockito.asm.Type[] typeArray63 = signature61.getArgumentTypes();
        org.mockito.asm.Type[] typeArray64 = signature61.getArgumentTypes();
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("L1908869776", type28, typeArray64);
        boolean boolean66 = type2.equals((java.lang.Object) "L1908869776");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type67 = type2.getElementType();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        org.mockito.asm.Type type4 = local3.getType();
        org.mockito.asm.Type type5 = local3.getType();
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(96, type5);
        int int8 = type5.getSort();
        int int9 = type5.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type5.getDimensions();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        java.lang.String str21 = signature16.getDescriptor();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(154, type26);
        java.lang.String str28 = type26.toString();
        java.lang.String str29 = type26.getClassName();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(112, type26);
        int int31 = type26.getSize();
        java.lang.String str32 = type26.getClassName();
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(126, type26);
        java.lang.String str34 = type26.getClassName();
        java.lang.String str35 = type26.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) 'a', type42);
        org.mockito.asm.Type type44 = local43.getType();
        org.mockito.asm.Type type45 = local43.getType();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(154, type49);
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type39, type40, type45, type46, type47, type49 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", type37, typeArray51);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local(154, type54);
        boolean boolean56 = signature52.equals((java.lang.Object) type54);
        org.mockito.asm.Type type57 = signature52.getReturnType();
        java.lang.String str58 = signature52.getName();
        java.lang.String str59 = signature52.getName();
        java.lang.String str60 = signature52.toString();
        java.lang.String str61 = signature52.toString();
        java.lang.String str62 = signature52.getName();
        java.lang.String str63 = signature52.getName();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local67 = new org.mockito.cglib.core.Local((int) 'a', type66);
        java.lang.String str68 = type66.getClassName();
        int int70 = type66.getOpcode(1);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str73 = type72.toString();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local78 = new org.mockito.cglib.core.Local((int) 'a', type77);
        org.mockito.asm.Type type79 = local78.getType();
        org.mockito.asm.Type type80 = local78.getType();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type82 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type84 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local85 = new org.mockito.cglib.core.Local(154, type84);
        org.mockito.asm.Type[] typeArray86 = new org.mockito.asm.Type[] { type74, type75, type80, type81, type82, type84 };
        org.mockito.cglib.core.Signature signature87 = new org.mockito.cglib.core.Signature("hi!", type72, typeArray86);
        org.mockito.cglib.core.Signature signature88 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type66, typeArray86);
        boolean boolean89 = signature52.equals((java.lang.Object) type66);
        org.mockito.asm.Type[] typeArray90 = signature52.getArgumentTypes();
        boolean boolean91 = type26.equals((java.lang.Object) typeArray90);
        java.lang.String str92 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int93 = type22.getDimensions();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        int int4 = type2.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("int", type7, typeArray25);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(154, type30);
        org.mockito.asm.Type type32 = local31.getType();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local(154, type52);
        boolean boolean54 = signature50.equals((java.lang.Object) type52);
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local(155, type52);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local((int) 'a', type58);
        java.lang.String str60 = type58.getClassName();
        int int62 = type58.getOpcode(1);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str65 = type64.toString();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local((int) 'a', type69);
        org.mockito.asm.Type type71 = local70.getType();
        org.mockito.asm.Type type72 = local70.getType();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local77 = new org.mockito.cglib.core.Local(154, type76);
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type66, type67, type72, type73, type74, type76 };
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("hi!", type64, typeArray78);
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type58, typeArray78);
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray78);
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray78);
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray78);
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray78);
        java.lang.String str85 = signature84.getDescriptor();
        java.lang.String str86 = signature84.getName();
        org.mockito.asm.Type type87 = signature84.getReturnType();
        int int88 = type87.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type89 = type87.getElementType();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        java.lang.String str21 = signature16.getDescriptor();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        org.mockito.asm.Type type23 = signature16.getReturnType();
        java.lang.String str24 = type23.getClassName();
        int int25 = type23.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type23.getElementType();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getClassType();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!(SDIISI)S");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("org/mockito/asm/Type");
        int int8 = type6.getOpcode(0);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) ' ', type6);
        java.lang.String str10 = type6.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        int int15 = type13.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) 'a', type18);
        java.lang.String str20 = type18.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) 'a', type27);
        org.mockito.asm.Type type29 = local28.getType();
        org.mockito.asm.Type type30 = local28.getType();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(154, type34);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type24, type25, type30, type31, type32, type34 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("int", type18, typeArray36);
        org.mockito.asm.Type type39 = signature38.getReturnType();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(154, type41);
        org.mockito.asm.Type type43 = local42.getType();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str47 = type46.toString();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local((int) 'a', type51);
        org.mockito.asm.Type type53 = local52.getType();
        org.mockito.asm.Type type54 = local52.getType();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local(154, type58);
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type48, type49, type54, type55, type56, type58 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", type46, typeArray60);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local64 = new org.mockito.cglib.core.Local(154, type63);
        boolean boolean65 = signature61.equals((java.lang.Object) type63);
        org.mockito.cglib.core.Local local66 = new org.mockito.cglib.core.Local(155, type63);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local((int) 'a', type69);
        java.lang.String str71 = type69.getClassName();
        int int73 = type69.getOpcode(1);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str76 = type75.toString();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type78 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type80 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local81 = new org.mockito.cglib.core.Local((int) 'a', type80);
        org.mockito.asm.Type type82 = local81.getType();
        org.mockito.asm.Type type83 = local81.getType();
        org.mockito.asm.Type type84 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type85 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type87 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local88 = new org.mockito.cglib.core.Local(154, type87);
        org.mockito.asm.Type[] typeArray89 = new org.mockito.asm.Type[] { type77, type78, type83, type84, type85, type87 };
        org.mockito.cglib.core.Signature signature90 = new org.mockito.cglib.core.Signature("hi!", type75, typeArray89);
        org.mockito.cglib.core.Signature signature91 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type69, typeArray89);
        java.lang.String str92 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray89);
        java.lang.String str93 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray89);
        java.lang.String str94 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray89);
        org.mockito.cglib.core.Signature signature95 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type13, typeArray89);
        org.mockito.cglib.core.Signature signature96 = new org.mockito.cglib.core.Signature("float", type6, typeArray89);
        boolean boolean97 = type1.equals((java.lang.Object) typeArray89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type98 = type1.getElementType();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        java.lang.String str7 = type6.getDescriptor();
        java.lang.String str8 = type6.getDescriptor();
        boolean boolean9 = type0.equals((java.lang.Object) type6);
        java.lang.String str10 = type0.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getReturnType("Z");
        int int14 = type12.getOpcode(116);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) 'a', type21);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type type24 = local22.getType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(154, type28);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type18, type19, type24, type25, type26, type28 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(154, type33);
        boolean boolean35 = signature31.equals((java.lang.Object) type33);
        org.mockito.asm.Type type36 = signature31.getReturnType();
        java.lang.String str37 = signature31.getName();
        java.lang.String str38 = signature31.getName();
        java.lang.String str39 = signature31.getDescriptor();
        org.mockito.asm.Type[] typeArray40 = signature31.getArgumentTypes();
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray40);
        java.lang.String str42 = type12.toString();
        int int43 = type12.getSort();
        boolean boolean44 = type0.equals((java.lang.Object) type12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type45 = type0.getElementType();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        int int4 = type2.getSort();
        java.lang.String str5 = type2.getClassName();
        int int6 = type2.getSize();
        int int7 = type2.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("L646121781");
        boolean boolean11 = type9.equals((java.lang.Object) 100.0f);
        boolean boolean12 = type2.equals((java.lang.Object) type9);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(3, type2);
        java.lang.String str14 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type2.getInternalName();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        int int17 = type1.getSort();
        java.lang.String str18 = type1.getDescriptor();
        boolean boolean20 = type1.equals((java.lang.Object) 156);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type1.getElementType();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        java.lang.String str4 = type2.toString();
        java.lang.String str5 = type2.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(112, type2);
        int int7 = type2.getSize();
        int int8 = type2.getSort();
        int int9 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type2.getInternalName();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(SDIISI)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type19.getInternalName();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str17 = signature16.toString();
        org.mockito.asm.Type[] typeArray18 = signature16.getArgumentTypes();
        org.mockito.asm.Type type19 = signature16.getReturnType();
        java.lang.String str20 = signature16.getName();
        org.mockito.asm.Type type21 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type21.getDimensions();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        int int4 = type2.getOpcode(126);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type2);
        java.lang.String str6 = type2.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (byte) -1, type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) 'a', type17);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.asm.Type type20 = local18.getType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(154, type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type14, type15, type20, type21, type22, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        java.lang.String str28 = signature27.toString();
        org.mockito.asm.Type[] typeArray29 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("B", type9, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("S", type2, typeArray29);
        int int32 = type2.getSize();
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters33 = org.mockito.cglib.core.EmitUtils.DEFAULT_DELIMITERS;
        java.lang.Class<?> wildcardClass34 = arrayDelimiters33.getClass();
        boolean boolean35 = type2.equals((java.lang.Object) arrayDelimiters33);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) 'a', type42);
        org.mockito.asm.Type type44 = local43.getType();
        org.mockito.asm.Type type45 = local43.getType();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(154, type49);
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type39, type40, type45, type46, type47, type49 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", type37, typeArray51);
        java.lang.String str53 = signature52.getName();
        org.mockito.asm.Type[] typeArray54 = signature52.getArgumentTypes();
        boolean boolean55 = type2.equals((java.lang.Object) signature52);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str58 = type57.toString();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local((int) 'a', type62);
        org.mockito.asm.Type type64 = local63.getType();
        org.mockito.asm.Type type65 = local63.getType();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local(154, type69);
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type59, type60, type65, type66, type67, type69 };
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("hi!", type57, typeArray71);
        org.mockito.asm.Type type74 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local75 = new org.mockito.cglib.core.Local(154, type74);
        boolean boolean76 = signature72.equals((java.lang.Object) type74);
        org.mockito.asm.Type type77 = signature72.getReturnType();
        org.mockito.asm.Type type78 = signature72.getReturnType();
        java.lang.String str79 = type78.getClassName();
        boolean boolean80 = type2.equals((java.lang.Object) str79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type81 = type2.getElementType();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        java.lang.String str21 = signature16.getDescriptor();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        org.mockito.asm.Type type23 = signature16.getReturnType();
        java.lang.String str24 = type23.getClassName();
        java.lang.String str25 = type23.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type23.getDimensions();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        int int3 = type1.getOpcode(112);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        org.mockito.asm.Type type26 = signature24.getReturnType();
        java.lang.String str27 = type26.getDescriptor();
        int int29 = type26.getOpcode(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type26.getDimensions();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type2, typeArray20);
        java.lang.String str23 = type2.getClassName();
        boolean boolean25 = type2.equals((java.lang.Object) 156);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type2.getInternalName();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(154, type3);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        boolean boolean27 = signature23.equals((java.lang.Object) type25);
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(155, type25);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) 'a', type31);
        java.lang.String str33 = type31.getClassName();
        int int35 = type31.getOpcode(1);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) 'a', type42);
        org.mockito.asm.Type type44 = local43.getType();
        org.mockito.asm.Type type45 = local43.getType();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(154, type49);
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type39, type40, type45, type46, type47, type49 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", type37, typeArray51);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type31, typeArray51);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray51);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray51);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local((int) 'a', type58);
        java.lang.String str60 = type58.getClassName();
        int int62 = type58.getOpcode(1);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str65 = type64.toString();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local((int) 'a', type69);
        org.mockito.asm.Type type71 = local70.getType();
        org.mockito.asm.Type type72 = local70.getType();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local77 = new org.mockito.cglib.core.Local(154, type76);
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type66, type67, type72, type73, type74, type76 };
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("hi!", type64, typeArray78);
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("L1908869776", type58, typeArray78);
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("L631593947", type5, typeArray78);
        org.mockito.cglib.core.Local local82 = new org.mockito.cglib.core.Local(112, type5);
        org.mockito.asm.Type type83 = local82.getType();
        java.lang.String str84 = type83.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str85 = type83.getInternalName();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        org.mockito.asm.Type[] typeArray26 = signature24.getArgumentTypes();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/core/Signature;");
        int int30 = type29.getDimensions();
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(7, type29);
        boolean boolean32 = signature24.equals((java.lang.Object) 7);
        org.mockito.asm.Type type33 = signature24.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type33.getDimensions();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        org.mockito.asm.Type[] typeArray23 = signature16.getArgumentTypes();
        java.lang.String str24 = signature16.getName();
        java.lang.String str25 = signature16.getName();
        java.lang.String str26 = signature16.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = local34.getType();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(154, type40);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type30, type31, type36, type37, type38, type40 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray42);
        int int44 = type28.getSize();
        java.lang.String str45 = type28.toString();
        java.lang.String str46 = type28.getDescriptor();
        boolean boolean47 = signature16.equals((java.lang.Object) type28);
        int int49 = type28.getOpcode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type50 = type28.getElementType();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        java.lang.String str24 = signature16.toString();
        java.lang.String str25 = signature16.toString();
        java.lang.String str26 = signature16.getName();
        java.lang.String str27 = signature16.getName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((int) 'a', type30);
        java.lang.String str32 = type30.getClassName();
        int int34 = type30.getOpcode(1);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local((int) 'a', type41);
        org.mockito.asm.Type type43 = local42.getType();
        org.mockito.asm.Type type44 = local42.getType();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(154, type48);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type38, type39, type44, type45, type46, type48 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray50);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type30, typeArray50);
        boolean boolean53 = signature16.equals((java.lang.Object) type30);
        org.mockito.asm.Type type54 = signature16.getReturnType();
        org.mockito.asm.Type type55 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int56 = type55.getDimensions();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        int int4 = type2.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("int", type7, typeArray25);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(154, type30);
        org.mockito.asm.Type type32 = local31.getType();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local(154, type52);
        boolean boolean54 = signature50.equals((java.lang.Object) type52);
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local(155, type52);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local((int) 'a', type58);
        java.lang.String str60 = type58.getClassName();
        int int62 = type58.getOpcode(1);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str65 = type64.toString();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local((int) 'a', type69);
        org.mockito.asm.Type type71 = local70.getType();
        org.mockito.asm.Type type72 = local70.getType();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local77 = new org.mockito.cglib.core.Local(154, type76);
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type66, type67, type72, type73, type74, type76 };
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("hi!", type64, typeArray78);
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type58, typeArray78);
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray78);
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray78);
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray78);
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray78);
        int int85 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type86 = type2.getElementType();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        java.lang.String str24 = signature16.toString();
        java.lang.String str25 = signature16.toString();
        org.mockito.asm.Type type26 = signature16.getReturnType();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        java.lang.String str31 = type29.getClassName();
        int int33 = type29.getOpcode(1);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type29, typeArray49);
        org.mockito.asm.Type type52 = signature51.getReturnType();
        boolean boolean54 = signature51.equals((java.lang.Object) 6);
        org.mockito.asm.Type[] typeArray55 = signature51.getArgumentTypes();
        org.mockito.asm.Type type56 = signature51.getReturnType();
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("L562496996", "(SDIISI)Lorg/mockito/cglib/core/Signature;");
        org.mockito.asm.Type[] typeArray60 = signature59.getArgumentTypes();
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray60);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str63 = type26.getInternalName();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/core/Signature;");
        int int5 = type4.getDimensions();
        int int7 = type4.getOpcode(124);
        boolean boolean8 = type1.equals((java.lang.Object) type4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(154, type28);
        boolean boolean30 = signature26.equals((java.lang.Object) type28);
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(155, type28);
        org.mockito.asm.Type type32 = local31.getType();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(154, type34);
        int int36 = type34.getSort();
        java.lang.String str37 = type34.toString();
        boolean boolean38 = type32.equals((java.lang.Object) type34);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local((int) 'a', type45);
        org.mockito.asm.Type type47 = local46.getType();
        org.mockito.asm.Type type48 = local46.getType();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local(154, type52);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type42, type43, type48, type49, type50, type52 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("hi!", type40, typeArray54);
        java.lang.String str56 = signature55.toString();
        org.mockito.asm.Type[] typeArray57 = signature55.getArgumentTypes();
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray57);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str60 = type1.getInternalName();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(156, type3);
        int int27 = type3.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = type3.getInternalName();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        int int4 = type2.getOpcode(126);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type2);
        java.lang.String str6 = type2.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (byte) -1, type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) 'a', type17);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.asm.Type type20 = local18.getType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(154, type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type14, type15, type20, type21, type22, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        java.lang.String str28 = signature27.toString();
        org.mockito.asm.Type[] typeArray29 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("B", type9, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("S", type2, typeArray29);
        int int32 = type2.getSize();
        java.lang.String str33 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type2.getDimensions();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) 'a', type31);
        org.mockito.asm.Type type33 = local32.getType();
        org.mockito.asm.Type type34 = local32.getType();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(154, type38);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type28, type29, type34, type35, type36, type38 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("hi!", type26, typeArray40);
        java.lang.String str42 = signature41.toString();
        org.mockito.asm.Type[] typeArray43 = signature41.getArgumentTypes();
        org.mockito.asm.Type[] typeArray44 = signature41.getArgumentTypes();
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray44);
        int int47 = type2.getOpcode(156);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int48 = type2.getDimensions();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(154, type5);
        java.lang.String str7 = type5.toString();
        java.lang.String str8 = type5.getClassName();
        java.lang.String str9 = type5.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        java.lang.String str27 = signature26.toString();
        org.mockito.asm.Type[] typeArray28 = signature26.getArgumentTypes();
        org.mockito.asm.Type[] typeArray29 = signature26.getArgumentTypes();
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray29);
        label0.info = typeArray29;
        java.lang.Object obj32 = label0.info;
        java.lang.String str33 = label0.toString();
        java.lang.String str34 = label0.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        java.lang.String str38 = type36.toString();
        java.lang.String str39 = type36.getClassName();
        java.lang.String str40 = type36.getClassName();
        java.lang.String str41 = type36.getDescriptor();
        label0.info = type36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int43 = type36.getDimensions();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        java.lang.String str24 = signature16.toString();
        java.lang.String str25 = signature16.toString();
        java.lang.String str26 = signature16.getName();
        java.lang.String str27 = signature16.getName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((int) 'a', type30);
        java.lang.String str32 = type30.getClassName();
        int int34 = type30.getOpcode(1);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local((int) 'a', type41);
        org.mockito.asm.Type type43 = local42.getType();
        org.mockito.asm.Type type44 = local42.getType();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(154, type48);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type38, type39, type44, type45, type46, type48 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray50);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type30, typeArray50);
        boolean boolean53 = signature16.equals((java.lang.Object) type30);
        org.mockito.asm.Type type54 = signature16.getReturnType();
        java.lang.String str55 = type54.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int56 = type54.getDimensions();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        boolean boolean25 = signature21.equals((java.lang.Object) type23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(155, type23);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        java.lang.String str31 = type29.getClassName();
        int int33 = type29.getOpcode(1);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type29, typeArray49);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray49);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray49);
        org.mockito.asm.Label label54 = new org.mockito.asm.Label();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) 'a', type56);
        java.lang.String str58 = type56.getClassName();
        int int60 = type56.getOpcode(1);
        label54.info = 1;
        java.lang.Object obj62 = label54.info;
        boolean boolean63 = type3.equals(obj62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str64 = type3.getInternalName();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type6);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(98, type6);
        int int10 = local9.getIndex();
        org.mockito.asm.Type type11 = local9.getType();
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) 'a', type20);
        org.mockito.asm.Type type22 = local21.getType();
        org.mockito.asm.Type type23 = local21.getType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(154, type27);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type17, type18, type23, type24, type25, type27 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray29);
        int int31 = type15.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((int) 'a', type38);
        org.mockito.asm.Type type40 = local39.getType();
        org.mockito.asm.Type type41 = local39.getType();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local(154, type45);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type35, type36, type41, type42, type43, type45 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", type33, typeArray47);
        java.lang.String str49 = signature48.toString();
        org.mockito.asm.Type[] typeArray50 = signature48.getArgumentTypes();
        org.mockito.asm.Type[] typeArray51 = signature48.getArgumentTypes();
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("L1908869776", type15, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int54 = type11.getDimensions();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        int int25 = type2.getSort();
        java.lang.String str26 = type2.toString();
        int int28 = type2.getOpcode((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type2.getInternalName();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        java.lang.String str6 = type4.getClassName();
        int int8 = type4.getOpcode(1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) 'a', type15);
        org.mockito.asm.Type type17 = local16.getType();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type12, type13, type18, type19, type20, type22 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type4, typeArray24);
        org.mockito.asm.Type type27 = signature26.getReturnType();
        org.mockito.asm.Type type28 = signature26.getReturnType();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(97, type28);
        org.mockito.asm.Type type30 = local29.getType();
        int int31 = local29.getIndex();
        int int32 = local29.getIndex();
        org.mockito.asm.Type type33 = local29.getType();
        org.mockito.asm.Type type34 = local29.getType();
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(1, type34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type36 = type34.getElementType();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Type[] typeArray2 = org.mockito.asm.Type.getArgumentTypes("LSDIISI)L(SDIISI)I;");
        label0.info = "LSDIISI)L(SDIISI)I;";
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        java.lang.String str9 = type7.getClassName();
        int int11 = type7.getOpcode(1);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) 'a', type18);
        org.mockito.asm.Type type20 = local19.getType();
        org.mockito.asm.Type type21 = local19.getType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type15, type16, type21, type22, type23, type25 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type7, typeArray27);
        org.mockito.asm.Type type30 = signature29.getReturnType();
        org.mockito.asm.Type type31 = signature29.getReturnType();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(97, type31);
        org.mockito.asm.Type type33 = local32.getType();
        int int34 = local32.getIndex();
        int int35 = local32.getIndex();
        org.mockito.asm.Type type36 = local32.getType();
        label0.info = type36;
        int int38 = type36.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = type36.getInternalName();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        boolean boolean24 = signature20.equals((java.lang.Object) type22);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(155, type22);
        label1.info = 155;
        java.lang.Object obj27 = label1.info;
        java.lang.String str28 = label1.toString();
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters29 = org.mockito.cglib.core.EmitUtils.DEFAULT_DELIMITERS;
        java.lang.Class<?> wildcardClass30 = arrayDelimiters29.getClass();
        label1.info = arrayDelimiters29;
        java.lang.String str32 = label1.toString();
        java.lang.String str33 = label1.toString();
        java.lang.Object obj34 = label1.info;
        java.lang.String str35 = label1.toString();
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(SDIISI)J");
        java.lang.String str39 = signature38.toString();
        org.mockito.asm.Type type40 = signature38.getReturnType();
        label1.info = type40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type42 = type40.getElementType();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) 'a', type25);
        java.lang.String str27 = type25.getClassName();
        int int29 = type25.getOpcode(1);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) 'a', type36);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(154, type43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type33, type34, type39, type40, type41, type43 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray45);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type25, typeArray45);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int49 = type19.getDimensions();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        int int17 = type1.getSort();
        java.lang.String str18 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type1.getInternalName();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        int int3 = type1.getOpcode(112);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("S(SDIISI)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(154, type5);
        java.lang.String str7 = type5.toString();
        java.lang.String str8 = type5.getClassName();
        java.lang.String str9 = type5.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        java.lang.String str27 = signature26.toString();
        org.mockito.asm.Type[] typeArray28 = signature26.getArgumentTypes();
        org.mockito.asm.Type[] typeArray29 = signature26.getArgumentTypes();
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray29);
        label0.info = typeArray29;
        java.lang.Object obj32 = label0.info;
        java.lang.String str33 = label0.toString();
        java.lang.String str34 = label0.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        java.lang.String str38 = type36.toString();
        java.lang.String str39 = type36.getClassName();
        java.lang.String str40 = type36.getClassName();
        java.lang.String str41 = type36.getDescriptor();
        label0.info = type36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type43 = type36.getElementType();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(154, type3);
        java.lang.String str5 = type3.toString();
        java.lang.String str6 = type3.getClassName();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(112, type3);
        int int8 = type3.getSize();
        java.lang.String str9 = type3.getClassName();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(126, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type3.getElementType();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        java.lang.String str7 = type6.getDescriptor();
        java.lang.String str8 = type6.getDescriptor();
        boolean boolean9 = type0.equals((java.lang.Object) type6);
        java.lang.String str10 = type0.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getReturnType("Z");
        int int14 = type12.getOpcode(116);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) 'a', type21);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type type24 = local22.getType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(154, type28);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type18, type19, type24, type25, type26, type28 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(154, type33);
        boolean boolean35 = signature31.equals((java.lang.Object) type33);
        org.mockito.asm.Type type36 = signature31.getReturnType();
        java.lang.String str37 = signature31.getName();
        java.lang.String str38 = signature31.getName();
        java.lang.String str39 = signature31.getDescriptor();
        org.mockito.asm.Type[] typeArray40 = signature31.getArgumentTypes();
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray40);
        java.lang.String str42 = type12.toString();
        int int43 = type12.getSort();
        boolean boolean44 = type0.equals((java.lang.Object) type12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int45 = type0.getDimensions();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        java.lang.String str24 = signature16.toString();
        java.lang.String str25 = signature16.toString();
        java.lang.String str26 = signature16.getName();
        java.lang.String str27 = signature16.getName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((int) 'a', type30);
        java.lang.String str32 = type30.getClassName();
        int int34 = type30.getOpcode(1);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local((int) 'a', type41);
        org.mockito.asm.Type type43 = local42.getType();
        org.mockito.asm.Type type44 = local42.getType();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(154, type48);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type38, type39, type44, type45, type46, type48 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray50);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type30, typeArray50);
        boolean boolean53 = signature16.equals((java.lang.Object) type30);
        org.mockito.asm.Type[] typeArray54 = signature16.getArgumentTypes();
        org.mockito.asm.Type type55 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int56 = type55.getDimensions();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type23 = local22.getType();
        int int24 = type23.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type23.getElementType();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!(SDIISI)S");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        java.lang.String str21 = signature20.getName();
        boolean boolean22 = type3.equals((java.lang.Object) signature20);
        org.mockito.asm.Type type23 = signature20.getReturnType();
        org.mockito.asm.Type[] typeArray24 = signature20.getArgumentTypes();
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type1.getInternalName();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        java.lang.String str25 = signature24.getName();
        java.lang.String str26 = signature24.getDescriptor();
        org.mockito.asm.Type type27 = signature24.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = type27.getInternalName();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        org.mockito.asm.Type type3 = local2.getType();
        int int4 = type3.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type3.getElementType();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        java.lang.String str18 = signature17.getName();
        boolean boolean19 = type0.equals((java.lang.Object) signature17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) 'a', type22);
        java.lang.String str24 = type22.getClassName();
        int int26 = type22.getOpcode(1);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = local34.getType();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(154, type40);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type30, type31, type36, type37, type38, type40 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("L1908869776", type22, typeArray42);
        org.mockito.asm.Type[] typeArray45 = signature44.getArgumentTypes();
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = type0.getInternalName();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(SDIISI)I;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        int int25 = type2.getSort();
        java.lang.String str26 = type2.toString();
        int int28 = type2.getOpcode((int) (short) -1);
        java.lang.String str29 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type2.getElementType();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        java.lang.String str21 = signature16.getDescriptor();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = type22.getDimensions();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(156, type3);
        int int27 = local26.getIndex();
        org.mockito.asm.Type type28 = local26.getType();
        org.mockito.asm.Type type29 = local26.getType();
        int int30 = type29.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type29.getElementType();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 10, type1);
        org.mockito.asm.Type type4 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        org.mockito.asm.Type type29 = local28.getType();
        java.lang.String str30 = type29.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int31 = type29.getDimensions();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("S");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type2.getSort();
        java.lang.String str4 = type2.toString();
        boolean boolean5 = type1.equals((java.lang.Object) type2);
        int int7 = type1.getOpcode(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        int int21 = type2.getSize();
        java.lang.String str22 = type2.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("org/mockito/asm/Type");
        int int26 = type24.getOpcode(0);
        int int28 = type24.getOpcode(52);
        boolean boolean29 = type2.equals((java.lang.Object) int28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type2.getInternalName();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = local2.getIndex();
        org.mockito.asm.Type type4 = local2.getType();
        int int6 = type4.getOpcode(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type4.getElementType();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type23 = local22.getType();
        java.lang.String str24 = type23.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type23.getElementType();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(SDIISI)I");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) 'a', type5);
        java.lang.String str7 = type5.getClassName();
        int int9 = type5.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("L1908869776", type5, typeArray25);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("short", type2, typeArray28);
        java.lang.String str30 = type2.getDescriptor();
        java.lang.String str31 = type2.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass33 = type32.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        java.lang.String str35 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        java.lang.String str37 = type36.getInternalName();
        int int39 = type36.getOpcode(112);
        boolean boolean40 = type2.equals((java.lang.Object) type36);
        org.mockito.asm.Type type41 = type2.getElementType();
        java.lang.String str42 = type41.toString();
        java.lang.String str43 = type41.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = type41.getInternalName();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        org.mockito.asm.Type type3 = local2.getType();
        java.lang.String str4 = type3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type3.getDimensions();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/Type;(SDIISI)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        org.mockito.asm.Type type29 = local28.getType();
        int int30 = local28.getIndex();
        org.mockito.asm.Type type31 = local28.getType();
        org.mockito.asm.Type type32 = local28.getType();
        org.mockito.asm.Type type33 = local28.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type34 = type33.getElementType();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        int int23 = type19.getSort();
        int int24 = type19.getSize();
        java.lang.String str25 = type19.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type19.getInternalName();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int3 = type1.getOpcode(126);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type1);
        java.lang.String str5 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lhi!(SDIISI)S;");
        int int3 = type1.getOpcode(120);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L111742003", "L536564727", "LL1422561624;");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type2);
        java.lang.String str5 = type2.toString();
        int int6 = type2.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        java.lang.String str12 = type10.getClassName();
        int int14 = type10.getOpcode(1);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) 'a', type21);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type type24 = local22.getType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(154, type28);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type18, type19, type24, type25, type26, type28 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type10, typeArray30);
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(156, type10);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type type35 = local33.getType();
        org.mockito.asm.Type[] typeArray37 = org.mockito.asm.Type.getArgumentTypes("(SDIISI)LSDIISI)L(SDIISI)I;");
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray37);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = type2.getInternalName();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        org.mockito.asm.Type type23 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type23.getDimensions();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("B");
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label3.info = label4;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        boolean boolean27 = signature23.equals((java.lang.Object) type25);
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(155, type25);
        label4.info = 155;
        java.lang.Object obj30 = label4.info;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(154, type33);
        java.lang.String str35 = type33.toString();
        java.lang.String str36 = type33.getClassName();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(112, type33);
        org.mockito.asm.Type type38 = local37.getType();
        label4.info = type38;
        java.lang.String str40 = label4.toString();
        boolean boolean41 = type2.equals((java.lang.Object) label4);
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(0, type2);
        int int43 = type2.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = type2.getInternalName();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = signature17.getReturnType();
        java.lang.String str23 = signature17.getName();
        org.mockito.asm.Type[] typeArray24 = signature17.getArgumentTypes();
        org.mockito.asm.Type type25 = signature17.getReturnType();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (byte) -1, type28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) 'a', type36);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(154, type43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type33, type34, type39, type40, type41, type43 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray45);
        java.lang.String str47 = signature46.toString();
        org.mockito.asm.Type[] typeArray48 = signature46.getArgumentTypes();
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("B", type28, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.Signature", type25, typeArray48);
        java.lang.String str51 = signature50.toString();
        org.mockito.asm.Type type52 = signature50.getReturnType();
        java.lang.String str53 = signature50.getDescriptor();
        org.mockito.asm.Type type54 = signature50.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int55 = type54.getDimensions();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(52);
        int int4 = type0.getSort();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) 100, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        java.lang.String str23 = type22.getDescriptor();
        int int25 = type22.getOpcode((int) (short) 100);
        int int26 = type22.getSort();
        java.lang.String str27 = type22.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = type22.getInternalName();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.toString();
        java.lang.String str5 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSort();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        int int5 = type2.getOpcode((int) ' ');
        int int6 = type2.getSort();
        java.lang.String str7 = type2.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(120, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type2.getDimensions();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) 'a', type12);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.asm.Type type15 = local13.getType();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type9, type10, type15, type16, type17, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type7, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("int", type3, typeArray21);
        org.mockito.asm.Type type24 = signature23.getReturnType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(154, type26);
        org.mockito.asm.Type type28 = local27.getType();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) 'a', type36);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(154, type43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type33, type34, type39, type40, type41, type43 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray45);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(154, type48);
        boolean boolean50 = signature46.equals((java.lang.Object) type48);
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(155, type48);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((int) 'a', type54);
        java.lang.String str56 = type54.getClassName();
        int int58 = type54.getOpcode(1);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str61 = type60.toString();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local66 = new org.mockito.cglib.core.Local((int) 'a', type65);
        org.mockito.asm.Type type67 = local66.getType();
        org.mockito.asm.Type type68 = local66.getType();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local73 = new org.mockito.cglib.core.Local(154, type72);
        org.mockito.asm.Type[] typeArray74 = new org.mockito.asm.Type[] { type62, type63, type68, type69, type70, type72 };
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("hi!", type60, typeArray74);
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type54, typeArray74);
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray74);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray74);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray74);
        org.mockito.cglib.core.Local local80 = new org.mockito.cglib.core.Local((int) '4', type24);
        int int81 = local80.getIndex();
        org.mockito.asm.Type type82 = local80.getType();
        org.mockito.asm.Type type83 = local80.getType();
        org.mockito.asm.Type type84 = local80.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type85 = type84.getElementType();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        int int27 = type25.getSort();
        java.lang.String str28 = type25.toString();
        boolean boolean29 = type23.equals((java.lang.Object) type25);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) 'a', type36);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(154, type43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type33, type34, type39, type40, type41, type43 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray45);
        java.lang.String str47 = signature46.toString();
        org.mockito.asm.Type[] typeArray48 = signature46.getArgumentTypes();
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = type25.getInternalName();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        boolean boolean25 = signature21.equals((java.lang.Object) type23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(155, type23);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        java.lang.String str31 = type29.getClassName();
        int int33 = type29.getOpcode(1);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type29, typeArray49);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray49);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray49);
        org.mockito.asm.Label label54 = new org.mockito.asm.Label();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) 'a', type56);
        java.lang.String str58 = type56.getClassName();
        int int60 = type56.getOpcode(1);
        label54.info = 1;
        java.lang.Object obj62 = label54.info;
        boolean boolean63 = type3.equals(obj62);
        int int64 = type3.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type65 = type3.getElementType();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        int int30 = type27.getOpcode(97);
        int int31 = type27.getSort();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((int) 'a', type38);
        org.mockito.asm.Type type40 = local39.getType();
        org.mockito.asm.Type type41 = local39.getType();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local(154, type45);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type35, type36, type41, type42, type43, type45 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", type33, typeArray47);
        java.lang.Class<?> wildcardClass49 = signature48.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass49);
        java.lang.String str52 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass49);
        boolean boolean53 = type27.equals((java.lang.Object) str52);
        int int54 = type27.getSize();
        java.lang.String str55 = type27.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type56 = type27.getElementType();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type32 = local30.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type26, type27, type32, type33, type34, type36 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray38);
        int int40 = type24.getSize();
        java.lang.String str41 = type24.toString();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(8, type24);
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (byte) 1, type24);
        boolean boolean44 = type2.equals((java.lang.Object) type24);
        int int46 = type24.getOpcode(153);
        java.lang.String str47 = type24.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type48 = type24.getElementType();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        org.mockito.asm.Type type26 = signature24.getReturnType();
        java.lang.String str27 = type26.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = type26.getDimensions();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        int int3 = type1.getSort();
        int int5 = type1.getOpcode(108);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/core/LocalVariablesSorter;");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("float(SDIISI)Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        boolean boolean27 = signature23.equals((java.lang.Object) type25);
        org.mockito.asm.Type type28 = signature23.getReturnType();
        java.lang.String str29 = signature23.getName();
        java.lang.String str30 = signature23.getName();
        java.lang.String str31 = signature23.toString();
        java.lang.String str32 = signature23.toString();
        java.lang.String str33 = signature23.getName();
        java.lang.String str34 = signature23.getName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) 'a', type37);
        java.lang.String str39 = type37.getClassName();
        int int41 = type37.getOpcode(1);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local((int) 'a', type48);
        org.mockito.asm.Type type50 = local49.getType();
        org.mockito.asm.Type type51 = local49.getType();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local(154, type55);
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type45, type46, type51, type52, type53, type55 };
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("hi!", type43, typeArray57);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type37, typeArray57);
        boolean boolean60 = signature23.equals((java.lang.Object) type37);
        org.mockito.asm.Type[] typeArray61 = signature23.getArgumentTypes();
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray61);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("short", type4, typeArray61);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int65 = type1.getDimensions();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        java.lang.String str24 = signature16.toString();
        java.lang.String str25 = signature16.toString();
        java.lang.String str26 = signature16.toString();
        java.lang.String str27 = signature16.getDescriptor();
        org.mockito.asm.Type type28 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type28.getElementType();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type2);
        java.lang.String str5 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type2.getDimensions();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        int int4 = type1.getOpcode((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        java.lang.String str6 = type4.getClassName();
        int int8 = type4.getOpcode(1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) 'a', type15);
        org.mockito.asm.Type type17 = local16.getType();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type12, type13, type18, type19, type20, type22 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type4, typeArray24);
        org.mockito.asm.Type type27 = signature26.getReturnType();
        org.mockito.asm.Type type28 = signature26.getReturnType();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(97, type28);
        org.mockito.asm.Type type30 = local29.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        java.lang.String str35 = type33.getClassName();
        int int37 = type33.getOpcode(1);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str40 = type39.toString();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((int) 'a', type44);
        org.mockito.asm.Type type46 = local45.getType();
        org.mockito.asm.Type type47 = local45.getType();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local(154, type51);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type41, type42, type47, type48, type49, type51 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("hi!", type39, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("L1908869776", type33, typeArray53);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("J", type30, typeArray53);
        org.mockito.asm.Type[] typeArray57 = signature56.getArgumentTypes();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local((int) 'a', type61);
        java.lang.String str63 = type61.getClassName();
        int int65 = type61.getOpcode(1);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str68 = type67.toString();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local73 = new org.mockito.cglib.core.Local((int) 'a', type72);
        org.mockito.asm.Type type74 = local73.getType();
        org.mockito.asm.Type type75 = local73.getType();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local80 = new org.mockito.cglib.core.Local(154, type79);
        org.mockito.asm.Type[] typeArray81 = new org.mockito.asm.Type[] { type69, type70, type75, type76, type77, type79 };
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("hi!", type67, typeArray81);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type61, typeArray81);
        org.mockito.asm.Type type84 = signature83.getReturnType();
        org.mockito.asm.Type type85 = signature83.getReturnType();
        org.mockito.cglib.core.Local local86 = new org.mockito.cglib.core.Local(97, type85);
        org.mockito.asm.Type type87 = local86.getType();
        int int88 = local86.getIndex();
        org.mockito.asm.Type type89 = local86.getType();
        boolean boolean90 = signature56.equals((java.lang.Object) local86);
        int int91 = local86.getIndex();
        org.mockito.asm.Type type92 = local86.getType();
        java.lang.String str93 = type92.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str94 = type92.getInternalName();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(52);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("L1273107961", "int(SDIISI)I");
        org.mockito.asm.Type type8 = signature7.getReturnType();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (short) 10, type8);
        java.lang.String str10 = type8.getClassName();
        boolean boolean11 = type0.equals((java.lang.Object) str10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type0.getInternalName();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type7 = local5.getType();
        java.lang.String str8 = type7.getDescriptor();
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = type1.equals((java.lang.Object) type7);
        java.lang.String str11 = type1.getDescriptor();
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int13 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type1.getDimensions();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str17 = signature16.getName();
        java.lang.String str18 = signature16.getName();
        org.mockito.asm.Type type19 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type19.getElementType();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        java.lang.String str24 = signature16.toString();
        java.lang.String str25 = signature16.toString();
        java.lang.String str26 = signature16.toString();
        java.lang.String str27 = signature16.getDescriptor();
        org.mockito.asm.Type type28 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type28.getInternalName();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) 'a', type8);
        org.mockito.asm.Type type10 = local9.getType();
        org.mockito.asm.Type type11 = local9.getType();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(154, type15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type5, type6, type11, type12, type13, type15 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray17);
        int int19 = type3.getSize();
        java.lang.String str20 = type3.toString();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(8, type3);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (byte) 1, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type3.getInternalName();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1836043685", "(SDIISI)I");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) 'a', type26);
        java.lang.String str28 = type26.getClassName();
        int int30 = type26.getOpcode(1);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) 'a', type37);
        org.mockito.asm.Type type39 = local38.getType();
        org.mockito.asm.Type type40 = local38.getType();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(154, type44);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type34, type35, type40, type41, type42, type44 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type26, typeArray46);
        org.mockito.asm.Type type49 = signature48.getReturnType();
        org.mockito.asm.Type type50 = signature48.getReturnType();
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(97, type50);
        org.mockito.asm.Type type52 = local51.getType();
        boolean boolean53 = type19.equals((java.lang.Object) type52);
        java.lang.String str54 = type19.toString();
        org.mockito.asm.Label label55 = new org.mockito.asm.Label();
        org.mockito.asm.Label label56 = new org.mockito.asm.Label();
        label55.info = label56;
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters61 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("int", "int", "S");
        label55.info = arrayDelimiters61;
        boolean boolean63 = type19.equals((java.lang.Object) arrayDelimiters61);
        int int64 = type19.getSize();
        int int65 = type19.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type66 = type19.getElementType();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!(SDIISI)S");
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        boolean boolean27 = signature23.equals((java.lang.Object) type25);
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(155, type25);
        int int29 = type25.getSort();
        boolean boolean30 = type1.equals((java.lang.Object) int29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int31 = type1.getDimensions();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        java.lang.String str4 = type2.toString();
        java.lang.String str5 = type2.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(112, type2);
        int int7 = type2.getSize();
        java.lang.String str8 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type2.getInternalName();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.toString();
        int int6 = type1.getOpcode((int) (byte) 100);
        java.lang.String str7 = type1.toString();
        int int8 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type1.getElementType();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int4 = type2.getOpcode(2);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(108, type2);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1713000095", type6, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type6.getElementType();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(154, type3);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        boolean boolean27 = signature23.equals((java.lang.Object) type25);
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(155, type25);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) 'a', type31);
        java.lang.String str33 = type31.getClassName();
        int int35 = type31.getOpcode(1);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) 'a', type42);
        org.mockito.asm.Type type44 = local43.getType();
        org.mockito.asm.Type type45 = local43.getType();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(154, type49);
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type39, type40, type45, type46, type47, type49 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", type37, typeArray51);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type31, typeArray51);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray51);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray51);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local((int) 'a', type58);
        java.lang.String str60 = type58.getClassName();
        int int62 = type58.getOpcode(1);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str65 = type64.toString();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local((int) 'a', type69);
        org.mockito.asm.Type type71 = local70.getType();
        org.mockito.asm.Type type72 = local70.getType();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local77 = new org.mockito.cglib.core.Local(154, type76);
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type66, type67, type72, type73, type74, type76 };
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("hi!", type64, typeArray78);
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("L1908869776", type58, typeArray78);
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("L631593947", type5, typeArray78);
        org.mockito.cglib.core.Local local82 = new org.mockito.cglib.core.Local(112, type5);
        java.lang.String str83 = type5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type84 = type5.getElementType();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 10, type1);
        int int4 = type1.getSize();
        int int6 = type1.getOpcode((int) (byte) -1);
        boolean boolean8 = type1.equals((java.lang.Object) "L1862717103");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type1.getInternalName();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type6);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(98, type6);
        int int10 = local9.getIndex();
        org.mockito.asm.Type type11 = local9.getType();
        org.mockito.asm.Type type12 = local9.getType();
        java.lang.String str13 = type12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type12.getInternalName();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSort();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        org.mockito.asm.Type type4 = local3.getType();
        org.mockito.asm.Type type5 = local3.getType();
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(96, type5);
        java.lang.String str8 = type5.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type5.getDimensions();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 10, type2);
        int int5 = type2.getSize();
        int int7 = type2.getOpcode((int) (byte) -1);
        boolean boolean9 = type2.equals((java.lang.Object) "L1862717103");
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type2);
        java.lang.String str11 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type2.getInternalName();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        int int3 = type1.getSort();
        java.lang.String str4 = type1.toString();
        int int5 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        boolean boolean25 = signature21.equals((java.lang.Object) type23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(155, type23);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        java.lang.String str31 = type29.getClassName();
        int int33 = type29.getOpcode(1);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type29, typeArray49);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray49);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray49);
        org.mockito.asm.Label label54 = new org.mockito.asm.Label();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) 'a', type56);
        java.lang.String str58 = type56.getClassName();
        int int60 = type56.getOpcode(1);
        label54.info = 1;
        java.lang.Object obj62 = label54.info;
        boolean boolean63 = type3.equals(obj62);
        java.lang.String str64 = type3.getDescriptor();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local67 = new org.mockito.cglib.core.Local((int) (byte) -1, type66);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local71 = new org.mockito.cglib.core.Local((int) 'a', type70);
        java.lang.String str72 = type70.getClassName();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str75 = type74.toString();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local80 = new org.mockito.cglib.core.Local((int) 'a', type79);
        org.mockito.asm.Type type81 = local80.getType();
        org.mockito.asm.Type type82 = local80.getType();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type84 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type86 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local87 = new org.mockito.cglib.core.Local(154, type86);
        org.mockito.asm.Type[] typeArray88 = new org.mockito.asm.Type[] { type76, type77, type82, type83, type84, type86 };
        org.mockito.cglib.core.Signature signature89 = new org.mockito.cglib.core.Signature("hi!", type74, typeArray88);
        org.mockito.cglib.core.Signature signature90 = new org.mockito.cglib.core.Signature("int", type70, typeArray88);
        java.lang.String str91 = org.mockito.asm.Type.getMethodDescriptor(type66, typeArray88);
        java.lang.String str92 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray88);
        int int93 = type3.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int94 = type3.getDimensions();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        java.lang.String str4 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type3.getDimensions();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L1817688892");
        int int2 = type1.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(96, type9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) 'a', type18);
        org.mockito.asm.Type type20 = local19.getType();
        org.mockito.asm.Type type21 = local19.getType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type15, type16, type21, type22, type23, type25 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray27);
        java.lang.String str29 = signature28.toString();
        org.mockito.asm.Type[] typeArray30 = signature28.getArgumentTypes();
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("L1836861769", type9, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray30);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((int) 'a', type35);
        java.lang.String str37 = type35.getClassName();
        int int39 = type35.getOpcode(1);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local((int) 'a', type46);
        org.mockito.asm.Type type48 = local47.getType();
        org.mockito.asm.Type type49 = local47.getType();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local54 = new org.mockito.cglib.core.Local(154, type53);
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type43, type44, type49, type50, type51, type53 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("hi!", type41, typeArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type35, typeArray55);
        org.mockito.asm.Type type58 = signature57.getReturnType();
        org.mockito.asm.Type type59 = signature57.getReturnType();
        org.mockito.asm.Type type60 = signature57.getReturnType();
        boolean boolean61 = type1.equals((java.lang.Object) type60);
        int int63 = type60.getOpcode((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int64 = type60.getDimensions();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(154, type5);
        java.lang.String str7 = type5.toString();
        java.lang.String str8 = type5.getClassName();
        java.lang.String str9 = type5.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        java.lang.String str27 = signature26.toString();
        org.mockito.asm.Type[] typeArray28 = signature26.getArgumentTypes();
        org.mockito.asm.Type[] typeArray29 = signature26.getArgumentTypes();
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray29);
        label0.info = typeArray29;
        java.lang.Object obj32 = label0.info;
        java.lang.String str33 = label0.toString();
        java.lang.String str34 = label0.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        java.lang.String str38 = type36.toString();
        java.lang.String str39 = type36.getClassName();
        java.lang.String str40 = type36.getClassName();
        java.lang.String str41 = type36.getDescriptor();
        label0.info = type36;
        int int43 = type36.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type44 = type36.getElementType();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        int int30 = type27.getOpcode(108);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = type27.getInternalName();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type32 = local30.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type26, type27, type32, type33, type34, type36 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray38);
        int int40 = type24.getSize();
        java.lang.String str41 = type24.toString();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(8, type24);
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (byte) 1, type24);
        boolean boolean44 = type2.equals((java.lang.Object) type24);
        int int46 = type24.getOpcode((-1));
        int int47 = type24.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = type24.getInternalName();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        int int4 = type2.getOpcode(126);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type2);
        java.lang.String str6 = type2.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (byte) -1, type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) 'a', type17);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.asm.Type type20 = local18.getType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(154, type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type14, type15, type20, type21, type22, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        java.lang.String str28 = signature27.toString();
        org.mockito.asm.Type[] typeArray29 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("B", type9, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("S", type2, typeArray29);
        int int32 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type2.getInternalName();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        int int30 = type27.getOpcode(97);
        int int31 = type27.getSort();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((int) 'a', type38);
        org.mockito.asm.Type type40 = local39.getType();
        org.mockito.asm.Type type41 = local39.getType();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local(154, type45);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type35, type36, type41, type42, type43, type45 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", type33, typeArray47);
        java.lang.Class<?> wildcardClass49 = signature48.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass49);
        java.lang.String str52 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass49);
        boolean boolean53 = type27.equals((java.lang.Object) str52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type54 = type27.getElementType();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        int int4 = type2.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(8, type2);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (byte) 1, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type2.getElementType();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type7 = local5.getType();
        java.lang.String str8 = type7.getDescriptor();
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = type1.equals((java.lang.Object) type7);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(126, type1);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        int int14 = type13.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type13.getDimensions();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type7 = local5.getType();
        java.lang.String str8 = type7.getDescriptor();
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = type1.equals((java.lang.Object) type7);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(126, type1);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type13.getElementType();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) 'a', type26);
        java.lang.String str28 = type26.getClassName();
        int int30 = type26.getOpcode(1);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) 'a', type37);
        org.mockito.asm.Type type39 = local38.getType();
        org.mockito.asm.Type type40 = local38.getType();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(154, type44);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type34, type35, type40, type41, type42, type44 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type26, typeArray46);
        org.mockito.asm.Type type49 = signature48.getReturnType();
        org.mockito.asm.Type type50 = signature48.getReturnType();
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(97, type50);
        org.mockito.asm.Type type52 = local51.getType();
        boolean boolean53 = type19.equals((java.lang.Object) type52);
        int int54 = type52.getSort();
        int int55 = type52.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str56 = type52.getInternalName();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("B");
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label3.info = label4;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        boolean boolean27 = signature23.equals((java.lang.Object) type25);
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(155, type25);
        label4.info = 155;
        java.lang.Object obj30 = label4.info;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(154, type33);
        java.lang.String str35 = type33.toString();
        java.lang.String str36 = type33.getClassName();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(112, type33);
        org.mockito.asm.Type type38 = local37.getType();
        label4.info = type38;
        java.lang.String str40 = label4.toString();
        boolean boolean41 = type2.equals((java.lang.Object) label4);
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(0, type2);
        java.lang.String str43 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type44 = type2.getElementType();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        int int30 = type27.getOpcode(97);
        java.lang.String str31 = type27.getDescriptor();
        int int32 = type27.getSize();
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("L236832491", "(I)I");
        boolean boolean36 = type27.equals((java.lang.Object) signature35);
        int int37 = type27.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int38 = type27.getDimensions();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Z");
        java.lang.String str3 = type2.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(128, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type2.getElementType();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(SDIISI)L(SDIISI)I;");
        int int3 = type1.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type4 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type4 = local2.getType();
        org.mockito.asm.Type type5 = local2.getType();
        org.mockito.asm.Type type6 = local2.getType();
        org.mockito.asm.Type type7 = local2.getType();
        org.mockito.asm.Type type8 = local2.getType();
        int int9 = type8.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type8.getInternalName();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters6 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("int", "int", "S");
        label0.info = arrayDelimiters6;
        java.lang.String str8 = label0.toString();
        java.lang.String str9 = label0.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) -1, type11);
        int int13 = type11.getSort();
        int int15 = type11.getOpcode(112);
        int int16 = type11.getSize();
        label0.info = type11;
        java.lang.String str18 = type11.getDescriptor();
        java.lang.String str19 = type11.toString();
        int int21 = type11.getOpcode(108);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getReturnType("S");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        int int25 = type24.getSort();
        java.lang.String str26 = type24.toString();
        boolean boolean27 = type23.equals((java.lang.Object) type24);
        boolean boolean28 = type11.equals((java.lang.Object) boolean27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type11.getInternalName();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        int int27 = type25.getSort();
        java.lang.String str28 = type25.toString();
        boolean boolean29 = type23.equals((java.lang.Object) type25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type25.getDimensions();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(160, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type2.getDimensions();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        int int17 = type1.getSort();
        int int19 = type1.getOpcode(129);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type1.getDimensions();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getClassType();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        int int4 = type0.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        java.lang.String str25 = signature16.getName();
        org.mockito.asm.Type[] typeArray26 = signature16.getArgumentTypes();
        java.lang.String str27 = signature16.toString();
        org.mockito.asm.Type type28 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type28.getInternalName();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.toString();
        int int6 = type1.getOpcode((int) (byte) 100);
        java.lang.String str7 = type1.toString();
        int int9 = type1.getOpcode(117);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type1.getElementType();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        org.mockito.asm.Type type4 = local3.getType();
        int int5 = type4.getSize();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(116, type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type4.getInternalName();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type[] typeArray24 = signature16.getArgumentTypes();
        org.mockito.asm.Type[] typeArray25 = signature16.getArgumentTypes();
        java.lang.String str26 = signature16.toString();
        org.mockito.asm.Type type27 = signature16.getReturnType();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("I", "hi!(SDIISI)S");
        boolean boolean31 = type27.equals((java.lang.Object) "hi!(SDIISI)S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type27.getInternalName();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type32 = local30.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type26, type27, type32, type33, type34, type36 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray38);
        java.lang.String str40 = signature39.toString();
        org.mockito.asm.Type[] typeArray41 = signature39.getArgumentTypes();
        org.mockito.asm.Type type42 = signature39.getReturnType();
        java.lang.String str43 = signature39.getName();
        org.mockito.asm.Type[] typeArray44 = signature39.getArgumentTypes();
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type46 = type22.getElementType();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        org.mockito.asm.Type type3 = local2.getType();
        int int4 = type3.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type3.getInternalName();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        org.mockito.asm.Type type26 = signature24.getReturnType();
        java.lang.String str27 = type26.getDescriptor();
        int int29 = type26.getOpcode(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type26.getElementType();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        org.mockito.asm.Type type26 = signature24.getReturnType();
        java.lang.String str27 = signature24.getName();
        org.mockito.asm.Type type28 = signature24.getReturnType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = local34.getType();
        java.lang.String str37 = type36.getDescriptor();
        java.lang.String str38 = type36.getDescriptor();
        boolean boolean39 = type30.equals((java.lang.Object) type36);
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(126, type30);
        org.mockito.asm.Type type41 = local40.getType();
        boolean boolean42 = signature24.equals((java.lang.Object) type41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int43 = type41.getDimensions();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        label0.info = 1;
        java.lang.Object obj8 = label0.info;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        java.lang.String str11 = label0.toString();
        java.lang.String str12 = label0.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label13.info = label14;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) 'a', type22);
        org.mockito.asm.Type type24 = local23.getType();
        org.mockito.asm.Type type25 = local23.getType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(154, type29);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type19, type20, type25, type26, type27, type29 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray31);
        java.lang.Class<?> wildcardClass33 = signature32.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        java.lang.String str36 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        java.lang.String str37 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        label13.info = type39;
        label13.info = false;
        org.mockito.asm.Label label43 = new org.mockito.asm.Label();
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        label43.info = label44;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str49 = type48.toString();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local54 = new org.mockito.cglib.core.Local((int) 'a', type53);
        org.mockito.asm.Type type55 = local54.getType();
        org.mockito.asm.Type type56 = local54.getType();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local61 = new org.mockito.cglib.core.Local(154, type60);
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type50, type51, type56, type57, type58, type60 };
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("hi!", type48, typeArray62);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local66 = new org.mockito.cglib.core.Local(154, type65);
        boolean boolean67 = signature63.equals((java.lang.Object) type65);
        org.mockito.cglib.core.Local local68 = new org.mockito.cglib.core.Local(155, type65);
        label44.info = 155;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local72 = new org.mockito.cglib.core.Local((int) 'a', type71);
        java.lang.String str73 = type71.getClassName();
        int int75 = type71.getOpcode(1);
        label44.info = type71;
        label13.info = type71;
        label0.info = type71;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int79 = type71.getDimensions();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type4 = local2.getType();
        int int5 = local2.getIndex();
        org.mockito.asm.Type type6 = local2.getType();
        int int7 = type6.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type6.getInternalName();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        boolean boolean25 = signature21.equals((java.lang.Object) type23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(155, type23);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        java.lang.String str31 = type29.getClassName();
        int int33 = type29.getOpcode(1);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type29, typeArray49);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray49);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray49);
        org.mockito.asm.Label label54 = new org.mockito.asm.Label();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) 'a', type56);
        java.lang.String str58 = type56.getClassName();
        int int60 = type56.getOpcode(1);
        label54.info = 1;
        java.lang.Object obj62 = label54.info;
        boolean boolean63 = type3.equals(obj62);
        java.lang.String str64 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int65 = type3.getDimensions();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        java.lang.String str4 = type2.toString();
        java.lang.String str5 = type2.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(112, type2);
        int int7 = type2.getSize();
        int int8 = type2.getSort();
        int int9 = type2.getSize();
        java.lang.String str10 = type2.getDescriptor();
        java.lang.String str11 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type2.getInternalName();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        java.lang.String str25 = signature24.getName();
        java.lang.String str26 = signature24.getDescriptor();
        org.mockito.asm.Type type27 = signature24.getReturnType();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        java.lang.String str34 = type32.getClassName();
        int int36 = type32.getOpcode(1);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((int) 'a', type43);
        org.mockito.asm.Type type45 = local44.getType();
        org.mockito.asm.Type type46 = local44.getType();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(154, type50);
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type40, type41, type46, type47, type48, type50 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("hi!", type38, typeArray52);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type32, typeArray52);
        org.mockito.asm.Type type55 = signature54.getReturnType();
        org.mockito.asm.Type type56 = signature54.getReturnType();
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(97, type56);
        org.mockito.asm.Type type58 = local57.getType();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local((int) 'a', type61);
        java.lang.String str63 = type61.getClassName();
        int int65 = type61.getOpcode(1);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str68 = type67.toString();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local73 = new org.mockito.cglib.core.Local((int) 'a', type72);
        org.mockito.asm.Type type74 = local73.getType();
        org.mockito.asm.Type type75 = local73.getType();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local80 = new org.mockito.cglib.core.Local(154, type79);
        org.mockito.asm.Type[] typeArray81 = new org.mockito.asm.Type[] { type69, type70, type75, type76, type77, type79 };
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("hi!", type67, typeArray81);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("L1908869776", type61, typeArray81);
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("J", type58, typeArray81);
        java.lang.String str85 = signature84.getName();
        boolean boolean86 = type27.equals((java.lang.Object) signature84);
        java.lang.String str87 = signature84.getName();
        org.mockito.asm.Type type88 = signature84.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int89 = type88.getDimensions();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        int int17 = type1.getSize();
        java.lang.String str18 = type1.toString();
        int int19 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type1.getElementType();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        java.lang.String str21 = signature16.getDescriptor();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        org.mockito.asm.Type type23 = signature16.getReturnType();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type24.getDimensions();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(154, type3);
        java.lang.String str5 = type3.toString();
        java.lang.String str6 = type3.getClassName();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(112, type3);
        int int8 = type3.getSize();
        java.lang.String str9 = type3.getClassName();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(126, type3);
        java.lang.String str11 = type3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type3.getDimensions();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = type1.getSort();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) 'a', type5);
        java.lang.String str7 = type5.getClassName();
        int int9 = type5.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type5, typeArray25);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        org.mockito.asm.Type type29 = signature27.getReturnType();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(97, type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) 'a', type34);
        java.lang.String str36 = type34.getClassName();
        int int38 = type34.getOpcode(1);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local((int) 'a', type45);
        org.mockito.asm.Type type47 = local46.getType();
        org.mockito.asm.Type type48 = local46.getType();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local(154, type52);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type42, type43, type48, type49, type50, type52 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("hi!", type40, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("L1908869776", type34, typeArray54);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("J", type31, typeArray54);
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local((int) (short) 1, type31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = type31.getInternalName();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(156, type3);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type type28 = local26.getType();
        org.mockito.asm.Type[] typeArray30 = org.mockito.asm.Type.getArgumentTypes("(SDIISI)LSDIISI)L(SDIISI)I;");
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray30);
        int int32 = type28.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type28.getInternalName();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int2 = type0.getOpcode(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) 'a', type9);
        org.mockito.asm.Type type11 = local10.getType();
        org.mockito.asm.Type type12 = local10.getType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(154, type16);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type6, type7, type12, type13, type14, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray18);
        java.lang.Class<?> wildcardClass20 = signature19.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        label0.info = type26;
        label0.info = false;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        label30.info = label31;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) 'a', type40);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = local41.getType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(154, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type37, type38, type43, type44, type45, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local(154, type52);
        boolean boolean54 = signature50.equals((java.lang.Object) type52);
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local(155, type52);
        label31.info = 155;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local((int) 'a', type58);
        java.lang.String str60 = type58.getClassName();
        int int62 = type58.getOpcode(1);
        label31.info = type58;
        label0.info = type58;
        int int66 = type58.getOpcode(97);
        int int67 = type58.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type68 = type58.getElementType();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType("Lorg/mockito/asm/Type;");
        boolean boolean8 = type1.equals((java.lang.Object) type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type1.getElementType();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1908869776", "S");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        java.lang.String str6 = type4.getDescriptor();
        java.lang.String str7 = type4.toString();
        java.lang.String str8 = type4.getDescriptor();
        int int10 = type4.getOpcode(39);
        java.lang.String str11 = type4.getDescriptor();
        boolean boolean12 = signature2.equals((java.lang.Object) type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type4.getElementType();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str17 = signature16.getName();
        org.mockito.asm.Type[] typeArray18 = signature16.getArgumentTypes();
        java.lang.String str19 = signature16.getName();
        org.mockito.asm.Type type20 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type20.getInternalName();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int2 = type1.getSort();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType("(SDIISI)L(SDIISI)I;");
        int int8 = type6.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) -1, type11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) 'a', type19);
        org.mockito.asm.Type type21 = local20.getType();
        org.mockito.asm.Type type22 = local20.getType();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(154, type26);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type16, type17, type22, type23, type24, type26 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type14, typeArray28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(154, type31);
        boolean boolean33 = signature29.equals((java.lang.Object) type31);
        org.mockito.asm.Type type34 = signature29.getReturnType();
        java.lang.String str35 = signature29.getName();
        java.lang.String str36 = signature29.toString();
        java.lang.String str37 = signature29.toString();
        org.mockito.asm.Type[] typeArray38 = signature29.getArgumentTypes();
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type11, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray38);
        boolean boolean41 = type1.equals((java.lang.Object) typeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type42 = type1.getElementType();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(SDIISI)J");
        java.lang.String str4 = signature3.toString();
        java.lang.String str5 = signature3.getName();
        org.mockito.asm.Type[] typeArray6 = signature3.getArgumentTypes();
        org.mockito.asm.Type type7 = signature3.getReturnType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        boolean boolean9 = signature3.equals((java.lang.Object) type8);
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(10, type8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type8.getInternalName();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type type35 = local33.getType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(154, type39);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type29, type30, type35, type36, type37, type39 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray41);
        boolean boolean44 = type24.equals((java.lang.Object) type25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type45 = type24.getElementType();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.toString();
        int int4 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) 'a', type8);
        org.mockito.asm.Type type10 = local9.getType();
        org.mockito.asm.Type type11 = local9.getType();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(154, type15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type5, type6, type11, type12, type13, type15 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        boolean boolean22 = signature18.equals((java.lang.Object) type20);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(155, type20);
        int int24 = type20.getSort();
        int int25 = type20.getSize();
        java.lang.String str26 = type20.getDescriptor();
        org.mockito.asm.Type[] typeArray28 = org.mockito.asm.Type.getArgumentTypes("LSDIISI)LSDIISI)LL1817688892;");
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("L964523952", type20, typeArray28);
        boolean boolean31 = type20.equals((java.lang.Object) "L490729871");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type20.getInternalName();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) 'a', type31);
        org.mockito.asm.Type type33 = local32.getType();
        org.mockito.asm.Type type34 = local32.getType();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(154, type38);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type28, type29, type34, type35, type36, type38 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("hi!", type26, typeArray40);
        java.lang.String str42 = signature41.toString();
        org.mockito.asm.Type[] typeArray43 = signature41.getArgumentTypes();
        org.mockito.asm.Type[] typeArray44 = signature41.getArgumentTypes();
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int46 = type2.getDimensions();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        java.lang.String str4 = type2.toString();
        java.lang.String str5 = type2.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(112, type2);
        int int7 = type2.getSize();
        int int8 = type2.getSort();
        int int9 = type2.getSize();
        java.lang.String str10 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type2.getElementType();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = type1.getSort();
        int int5 = type1.getOpcode(112);
        int int6 = type1.getSort();
        java.lang.String str7 = type1.getClassName();
        int int8 = type1.getSort();
        int int10 = type1.getOpcode((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type1.getDimensions();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        int int4 = type3.getSort();
        java.lang.String str5 = type3.toString();
        boolean boolean6 = type2.equals((java.lang.Object) type3);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 10, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type3.getElementType();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        java.lang.String str7 = type6.getDescriptor();
        java.lang.String str8 = type6.getDescriptor();
        boolean boolean9 = type0.equals((java.lang.Object) type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type0.getInternalName();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSort();
        int int4 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type17 = signature16.getReturnType();
        org.mockito.asm.Type type18 = signature16.getReturnType();
        java.lang.String str19 = signature16.getDescriptor();
        java.lang.String str20 = signature16.getDescriptor();
        org.mockito.asm.Type type21 = signature16.getReturnType();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        java.lang.String str23 = type22.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type22.getDimensions();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        boolean boolean24 = signature20.equals((java.lang.Object) type22);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(155, type22);
        label1.info = 155;
        java.lang.Object obj27 = label1.info;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(154, type30);
        java.lang.String str32 = type30.toString();
        java.lang.String str33 = type30.getClassName();
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(112, type30);
        org.mockito.asm.Type type35 = local34.getType();
        label1.info = type35;
        java.lang.String str37 = label1.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(154, type39);
        int int42 = type39.getOpcode((int) ' ');
        int int43 = type39.getSort();
        java.lang.String str44 = type39.getDescriptor();
        java.lang.String str45 = type39.getClassName();
        label1.info = type39;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = type39.getDimensions();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) 'a', type26);
        java.lang.String str28 = type26.getClassName();
        int int30 = type26.getOpcode(1);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) 'a', type37);
        org.mockito.asm.Type type39 = local38.getType();
        org.mockito.asm.Type type40 = local38.getType();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(154, type44);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type34, type35, type40, type41, type42, type44 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type26, typeArray46);
        org.mockito.asm.Type type49 = signature48.getReturnType();
        org.mockito.asm.Type type50 = signature48.getReturnType();
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(97, type50);
        org.mockito.asm.Type type52 = local51.getType();
        boolean boolean53 = type19.equals((java.lang.Object) type52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int54 = type19.getDimensions();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) 'a', type5);
        java.lang.String str7 = type5.getClassName();
        int int9 = type5.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type5, typeArray25);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        org.mockito.asm.Type type29 = signature27.getReturnType();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(97, type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) 'a', type34);
        java.lang.String str36 = type34.getClassName();
        int int38 = type34.getOpcode(1);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local((int) 'a', type45);
        org.mockito.asm.Type type47 = local46.getType();
        org.mockito.asm.Type type48 = local46.getType();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local(154, type52);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type42, type43, type48, type49, type50, type52 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("hi!", type40, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("L1908869776", type34, typeArray54);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("J", type31, typeArray54);
        org.mockito.asm.Type[] typeArray58 = signature57.getArgumentTypes();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local((int) 'a', type62);
        java.lang.String str64 = type62.getClassName();
        int int66 = type62.getOpcode(1);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str69 = type68.toString();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type73 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local74 = new org.mockito.cglib.core.Local((int) 'a', type73);
        org.mockito.asm.Type type75 = local74.getType();
        org.mockito.asm.Type type76 = local74.getType();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type78 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type80 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local81 = new org.mockito.cglib.core.Local(154, type80);
        org.mockito.asm.Type[] typeArray82 = new org.mockito.asm.Type[] { type70, type71, type76, type77, type78, type80 };
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("hi!", type68, typeArray82);
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type62, typeArray82);
        org.mockito.asm.Type type85 = signature84.getReturnType();
        org.mockito.asm.Type type86 = signature84.getReturnType();
        org.mockito.cglib.core.Local local87 = new org.mockito.cglib.core.Local(97, type86);
        org.mockito.asm.Type type88 = local87.getType();
        int int89 = local87.getIndex();
        org.mockito.asm.Type type90 = local87.getType();
        boolean boolean91 = signature57.equals((java.lang.Object) local87);
        int int92 = local87.getIndex();
        org.mockito.asm.Type type93 = local87.getType();
        java.lang.String str94 = type93.toString();
        org.mockito.cglib.core.Local local95 = new org.mockito.cglib.core.Local(104, type93);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str96 = type93.getInternalName();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.toString();
        int int3 = type0.getOpcode((int) (short) -1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        java.lang.String str21 = signature20.getName();
        org.mockito.asm.Type[] typeArray22 = signature20.getArgumentTypes();
        org.mockito.asm.Type[] typeArray23 = signature20.getArgumentTypes();
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray23);
        java.lang.String str25 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type0.getDimensions();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) 'a', type8);
        org.mockito.asm.Type type10 = local9.getType();
        org.mockito.asm.Type type11 = local9.getType();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(154, type15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type5, type6, type11, type12, type13, type15 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        boolean boolean22 = signature18.equals((java.lang.Object) type20);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(155, type20);
        int int24 = type20.getSort();
        int int25 = type20.getSize();
        java.lang.String str26 = type20.getDescriptor();
        org.mockito.asm.Type[] typeArray28 = org.mockito.asm.Type.getArgumentTypes("LSDIISI)LSDIISI)LL1817688892;");
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("L964523952", type20, typeArray28);
        boolean boolean31 = type20.equals((java.lang.Object) "L490729871");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type20.getDimensions();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(SDIISI)I");
        org.mockito.asm.Type type2 = type1.getElementType();
        java.lang.String str3 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type2.getElementType();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        java.lang.String str6 = type4.getClassName();
        int int8 = type4.getOpcode(1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) 'a', type15);
        org.mockito.asm.Type type17 = local16.getType();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type12, type13, type18, type19, type20, type22 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type4, typeArray24);
        org.mockito.asm.Type type27 = signature26.getReturnType();
        org.mockito.asm.Type type28 = signature26.getReturnType();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(97, type28);
        org.mockito.asm.Type type30 = local29.getType();
        org.mockito.asm.Type type31 = local29.getType();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(120, type31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type31.getElementType();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.getClassName();
        int int5 = type1.getOpcode(1);
        int int7 = type1.getOpcode(112);
        int int8 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        java.lang.Object obj3 = label0.info;
        label0.info = "short";
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.Type[] typeArray9 = org.mockito.asm.Type.getArgumentTypes("LSDIISI)L(SDIISI)I;");
        label7.info = "LSDIISI)L(SDIISI)I;";
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        java.lang.String str16 = type14.getClassName();
        int int18 = type14.getOpcode(1);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) 'a', type25);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type type28 = local26.getType();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(154, type32);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type22, type23, type28, type29, type30, type32 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type14, typeArray34);
        org.mockito.asm.Type type37 = signature36.getReturnType();
        org.mockito.asm.Type type38 = signature36.getReturnType();
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(97, type38);
        org.mockito.asm.Type type40 = local39.getType();
        int int41 = local39.getIndex();
        int int42 = local39.getIndex();
        org.mockito.asm.Type type43 = local39.getType();
        label7.info = type43;
        java.lang.String str45 = type43.getClassName();
        java.lang.String str46 = type43.toString();
        label0.info = type43;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = type43.getInternalName();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("(SDIISI)I");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        java.lang.String str8 = type6.getClassName();
        int int10 = type6.getOpcode(1);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) 'a', type17);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.asm.Type type20 = local18.getType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(154, type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type14, type15, type20, type21, type22, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L1908869776", type6, typeArray26);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("short", type3, typeArray29);
        java.lang.String str31 = type3.getDescriptor();
        java.lang.String str32 = type3.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass34 = type33.getClass();
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass34);
        java.lang.String str36 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        java.lang.String str38 = type37.getInternalName();
        int int40 = type37.getOpcode(112);
        boolean boolean41 = type3.equals((java.lang.Object) type37);
        org.mockito.asm.Type type42 = type3.getElementType();
        org.mockito.asm.Type type43 = type3.getElementType();
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", "");
        boolean boolean47 = type43.equals((java.lang.Object) signature46);
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(124, type43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = type43.getInternalName();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters6 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("int", "int", "S");
        label0.info = arrayDelimiters6;
        java.lang.String str8 = label0.toString();
        java.lang.String str9 = label0.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) -1, type11);
        int int13 = type11.getSort();
        int int15 = type11.getOpcode(112);
        int int16 = type11.getSize();
        label0.info = type11;
        java.lang.String str18 = label0.toString();
        java.lang.Object obj19 = label0.info;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) 'a', type25);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type type28 = local26.getType();
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(96, type28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) 'a', type37);
        org.mockito.asm.Type type39 = local38.getType();
        org.mockito.asm.Type type40 = local38.getType();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(154, type44);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type34, type35, type40, type41, type42, type44 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray46);
        java.lang.String str48 = signature47.toString();
        org.mockito.asm.Type[] typeArray49 = signature47.getArgumentTypes();
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("L1836861769", type28, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray49);
        label0.info = type21;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) 'a', type56);
        java.lang.String str58 = type56.getClassName();
        int int60 = type56.getOpcode(1);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str63 = type62.toString();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local68 = new org.mockito.cglib.core.Local((int) 'a', type67);
        org.mockito.asm.Type type69 = local68.getType();
        org.mockito.asm.Type type70 = local68.getType();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local75 = new org.mockito.cglib.core.Local(154, type74);
        org.mockito.asm.Type[] typeArray76 = new org.mockito.asm.Type[] { type64, type65, type70, type71, type72, type74 };
        org.mockito.cglib.core.Signature signature77 = new org.mockito.cglib.core.Signature("hi!", type62, typeArray76);
        org.mockito.cglib.core.Signature signature78 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type56, typeArray76);
        org.mockito.asm.Type type79 = signature78.getReturnType();
        org.mockito.asm.Type type80 = signature78.getReturnType();
        org.mockito.cglib.core.Local local81 = new org.mockito.cglib.core.Local(97, type80);
        org.mockito.asm.Type type82 = local81.getType();
        int int83 = local81.getIndex();
        org.mockito.asm.Type type84 = local81.getType();
        int int85 = type84.getSize();
        label0.info = type84;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int87 = type84.getDimensions();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = signature17.getReturnType();
        java.lang.String str23 = signature17.getName();
        java.lang.String str24 = signature17.getName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) 'a', type31);
        org.mockito.asm.Type type33 = local32.getType();
        org.mockito.asm.Type type34 = local32.getType();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(154, type38);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type28, type29, type34, type35, type36, type38 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("hi!", type26, typeArray40);
        int int42 = type26.getSize();
        boolean boolean43 = signature17.equals((java.lang.Object) int42);
        org.mockito.asm.Type[] typeArray44 = signature17.getArgumentTypes();
        java.lang.String str45 = signature17.getName();
        org.mockito.asm.Type type46 = signature17.getReturnType();
        int int47 = type46.getSize();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getObjectType("L1908869776(SDIISI)I");
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local54 = new org.mockito.cglib.core.Local((int) 'a', type53);
        java.lang.String str55 = type53.getClassName();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str58 = type57.toString();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local((int) 'a', type62);
        org.mockito.asm.Type type64 = local63.getType();
        org.mockito.asm.Type type65 = local63.getType();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local(154, type69);
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type59, type60, type65, type66, type67, type69 };
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("hi!", type57, typeArray71);
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("int", type53, typeArray71);
        org.mockito.asm.Type type74 = signature73.getReturnType();
        org.mockito.asm.Type[] typeArray75 = signature73.getArgumentTypes();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.getType("B");
        boolean boolean78 = signature73.equals((java.lang.Object) type77);
        java.lang.String str79 = signature73.getName();
        java.lang.String str80 = signature73.toString();
        org.mockito.asm.Type[] typeArray81 = signature73.getArgumentTypes();
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("L1806640489", type50, typeArray81);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("L1080382994", type46, typeArray81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type84 = type46.getElementType();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        int int3 = type1.getSort();
        java.lang.String str4 = type1.toString();
        int int5 = type1.getSize();
        java.lang.String str6 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = signature17.getReturnType();
        java.lang.String str23 = signature17.getName();
        java.lang.String str24 = signature17.getName();
        java.lang.String str25 = signature17.getDescriptor();
        java.lang.String str26 = signature17.getName();
        org.mockito.asm.Type type27 = signature17.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(133, type27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type27.getInternalName();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        int int4 = type1.getOpcode((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) 'a', type26);
        java.lang.String str28 = type26.getClassName();
        int int30 = type26.getOpcode(1);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) 'a', type37);
        org.mockito.asm.Type type39 = local38.getType();
        org.mockito.asm.Type type40 = local38.getType();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(154, type44);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type34, type35, type40, type41, type42, type44 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type26, typeArray46);
        org.mockito.asm.Type type49 = signature48.getReturnType();
        org.mockito.asm.Type type50 = signature48.getReturnType();
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(97, type50);
        org.mockito.asm.Type type52 = local51.getType();
        boolean boolean53 = type19.equals((java.lang.Object) type52);
        int int54 = type52.getSort();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local((int) 'a', type57);
        java.lang.String str59 = type57.getClassName();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str62 = type61.toString();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local67 = new org.mockito.cglib.core.Local((int) 'a', type66);
        org.mockito.asm.Type type68 = local67.getType();
        org.mockito.asm.Type type69 = local67.getType();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type73 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local74 = new org.mockito.cglib.core.Local(154, type73);
        org.mockito.asm.Type[] typeArray75 = new org.mockito.asm.Type[] { type63, type64, type69, type70, type71, type73 };
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("hi!", type61, typeArray75);
        org.mockito.cglib.core.Signature signature77 = new org.mockito.cglib.core.Signature("int", type57, typeArray75);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str79 = type52.getInternalName();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = signature17.getReturnType();
        org.mockito.asm.Type type23 = signature17.getReturnType();
        java.lang.String str24 = type23.getDescriptor();
        int int25 = type23.getSort();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(155, type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type23.getDimensions();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        java.lang.String str6 = type4.getClassName();
        int int8 = type4.getOpcode(1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) 'a', type15);
        org.mockito.asm.Type type17 = local16.getType();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type12, type13, type18, type19, type20, type22 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type4, typeArray24);
        org.mockito.asm.Type type27 = signature26.getReturnType();
        org.mockito.asm.Type type28 = signature26.getReturnType();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(97, type28);
        org.mockito.asm.Type type30 = local29.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        java.lang.String str35 = type33.getClassName();
        int int37 = type33.getOpcode(1);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str40 = type39.toString();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((int) 'a', type44);
        org.mockito.asm.Type type46 = local45.getType();
        org.mockito.asm.Type type47 = local45.getType();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local(154, type51);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type41, type42, type47, type48, type49, type51 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("hi!", type39, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("L1908869776", type33, typeArray53);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("J", type30, typeArray53);
        java.lang.String str57 = type30.toString();
        java.lang.String str58 = type30.getDescriptor();
        java.lang.String str59 = type30.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type60 = type30.getElementType();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) 'a', type8);
        org.mockito.asm.Type type10 = local9.getType();
        org.mockito.asm.Type type11 = local9.getType();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(154, type15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type5, type6, type11, type12, type13, type15 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray17);
        int int19 = type3.getSize();
        java.lang.String str20 = type3.toString();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(8, type3);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (byte) 1, type3);
        org.mockito.asm.Type type23 = local22.getType();
        int int24 = type23.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type23.getDimensions();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        int int3 = type1.getOpcode(116);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        boolean boolean24 = signature20.equals((java.lang.Object) type22);
        org.mockito.asm.Type type25 = signature20.getReturnType();
        java.lang.String str26 = signature20.getName();
        java.lang.String str27 = signature20.getName();
        java.lang.String str28 = signature20.getDescriptor();
        org.mockito.asm.Type[] typeArray29 = signature20.getArgumentTypes();
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray29);
        java.lang.String str31 = type1.toString();
        int int32 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type1.getInternalName();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Type[] typeArray2 = org.mockito.asm.Type.getArgumentTypes("LSDIISI)L(SDIISI)I;");
        label0.info = "LSDIISI)L(SDIISI)I;";
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        java.lang.String str9 = type7.getClassName();
        int int11 = type7.getOpcode(1);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) 'a', type18);
        org.mockito.asm.Type type20 = local19.getType();
        org.mockito.asm.Type type21 = local19.getType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type15, type16, type21, type22, type23, type25 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type7, typeArray27);
        org.mockito.asm.Type type30 = signature29.getReturnType();
        org.mockito.asm.Type type31 = signature29.getReturnType();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(97, type31);
        org.mockito.asm.Type type33 = local32.getType();
        int int34 = local32.getIndex();
        int int35 = local32.getIndex();
        org.mockito.asm.Type type36 = local32.getType();
        label0.info = type36;
        int int38 = type36.getSort();
        int int39 = type36.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = type36.getInternalName();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        int int30 = type27.getOpcode(97);
        int int31 = type27.getSort();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) 'a', type39);
        org.mockito.asm.Type type41 = local40.getType();
        org.mockito.asm.Type type42 = local40.getType();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local(154, type46);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type36, type37, type42, type43, type44, type46 };
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("hi!", type34, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray48);
        java.lang.String str51 = type32.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((int) 'a', type54);
        java.lang.String str56 = type54.getClassName();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str59 = type58.toString();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local64 = new org.mockito.cglib.core.Local((int) 'a', type63);
        org.mockito.asm.Type type65 = local64.getType();
        org.mockito.asm.Type type66 = local64.getType();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local71 = new org.mockito.cglib.core.Local(154, type70);
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] { type60, type61, type66, type67, type68, type70 };
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("hi!", type58, typeArray72);
        org.mockito.cglib.core.Signature signature74 = new org.mockito.cglib.core.Signature("int", type54, typeArray72);
        org.mockito.asm.Type type75 = signature74.getReturnType();
        org.mockito.asm.Type[] typeArray76 = signature74.getArgumentTypes();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.getType("B");
        boolean boolean79 = signature74.equals((java.lang.Object) type78);
        org.mockito.asm.Type[] typeArray80 = signature74.getArgumentTypes();
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray80);
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int83 = type27.getDimensions();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!(SDIISI)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type2);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("L1908869776", "Lorg/mockito/asm/Type;");
        java.lang.String str9 = signature8.getDescriptor();
        org.mockito.asm.Type type10 = signature8.getReturnType();
        org.mockito.asm.Type type11 = signature8.getReturnType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("hi!(SDIISI)S");
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) 'a', type22);
        org.mockito.asm.Type type24 = local23.getType();
        org.mockito.asm.Type type25 = local23.getType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(154, type29);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type19, type20, type25, type26, type27, type29 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray31);
        java.lang.String str33 = signature32.getName();
        boolean boolean34 = type15.equals((java.lang.Object) signature32);
        org.mockito.asm.Type type35 = signature32.getReturnType();
        org.mockito.asm.Type[] typeArray36 = signature32.getArgumentTypes();
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("Z", type11, typeArray36);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = type2.getInternalName();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        java.lang.String str23 = type19.toString();
        java.lang.String str24 = type19.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type19.getElementType();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(108);
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        java.lang.String str3 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org/mockito/asm/Type(SDIISI)I");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) 'a', type9);
        org.mockito.asm.Type type11 = local10.getType();
        org.mockito.asm.Type type12 = local10.getType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(154, type16);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type6, type7, type12, type13, type14, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray18);
        java.lang.String str20 = signature19.toString();
        org.mockito.asm.Type[] typeArray21 = signature19.getArgumentTypes();
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type1.getInternalName();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type2, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = type2.getDimensions();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        java.lang.Class<?> wildcardClass18 = signature17.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = type19.getElementType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) 'a', type27);
        org.mockito.asm.Type type29 = local28.getType();
        org.mockito.asm.Type type30 = local28.getType();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(154, type34);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type24, type25, type30, type31, type32, type34 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(154, type39);
        boolean boolean41 = signature37.equals((java.lang.Object) type39);
        org.mockito.asm.Type type42 = signature37.getReturnType();
        java.lang.String str43 = signature37.getName();
        java.lang.String str44 = signature37.getName();
        java.lang.String str45 = signature37.getDescriptor();
        org.mockito.asm.Type[] typeArray46 = signature37.getArgumentTypes();
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("L1836861769", type20, typeArray46);
        java.lang.String str48 = signature47.getName();
        org.mockito.asm.Type type49 = signature47.getReturnType();
        java.lang.String str50 = signature47.toString();
        java.lang.String str51 = signature47.toString();
        org.mockito.asm.Type[] typeArray52 = signature47.getArgumentTypes();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.SHORT_TYPE;
        int int54 = type53.getSort();
        java.lang.String str55 = type53.getDescriptor();
        boolean boolean56 = signature47.equals((java.lang.Object) type53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str57 = type53.getInternalName();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getDescriptor();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type2.getDimensions();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        java.lang.String str10 = type9.getDescriptor();
        java.lang.String str11 = type9.getDescriptor();
        boolean boolean12 = type3.equals((java.lang.Object) type9);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(126, type3);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(120, type3);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(168, type3);
        int int16 = local15.getIndex();
        org.mockito.asm.Type type17 = local15.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type17.getElementType();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) 'a', type5);
        java.lang.String str7 = type5.getClassName();
        int int9 = type5.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type5, typeArray25);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        org.mockito.asm.Type type29 = signature27.getReturnType();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(97, type29);
        org.mockito.asm.Type type31 = local30.getType();
        int int32 = local30.getIndex();
        org.mockito.asm.Type type33 = local30.getType();
        org.mockito.asm.Type type34 = local30.getType();
        org.mockito.asm.Type type35 = local30.getType();
        org.mockito.asm.Type type36 = local30.getType();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 0, type36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType("Z");
        java.lang.String str40 = type39.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/core/Signature;");
        int int43 = type42.getDimensions();
        int int45 = type42.getOpcode(124);
        boolean boolean46 = type39.equals((java.lang.Object) type42);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str50 = type49.toString();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((int) 'a', type54);
        org.mockito.asm.Type type56 = local55.getType();
        org.mockito.asm.Type type57 = local55.getType();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(154, type61);
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type51, type52, type57, type58, type59, type61 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("hi!", type49, typeArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local67 = new org.mockito.cglib.core.Local(154, type66);
        boolean boolean68 = signature64.equals((java.lang.Object) type66);
        org.mockito.cglib.core.Local local69 = new org.mockito.cglib.core.Local(155, type66);
        org.mockito.asm.Type type70 = local69.getType();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local73 = new org.mockito.cglib.core.Local(154, type72);
        int int74 = type72.getSort();
        java.lang.String str75 = type72.toString();
        boolean boolean76 = type70.equals((java.lang.Object) type72);
        org.mockito.asm.Type type78 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str79 = type78.toString();
        org.mockito.asm.Type type80 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type81 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type83 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local84 = new org.mockito.cglib.core.Local((int) 'a', type83);
        org.mockito.asm.Type type85 = local84.getType();
        org.mockito.asm.Type type86 = local84.getType();
        org.mockito.asm.Type type87 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type88 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type90 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local91 = new org.mockito.cglib.core.Local(154, type90);
        org.mockito.asm.Type[] typeArray92 = new org.mockito.asm.Type[] { type80, type81, type86, type87, type88, type90 };
        org.mockito.cglib.core.Signature signature93 = new org.mockito.cglib.core.Signature("hi!", type78, typeArray92);
        java.lang.String str94 = signature93.toString();
        org.mockito.asm.Type[] typeArray95 = signature93.getArgumentTypes();
        java.lang.String str96 = org.mockito.asm.Type.getMethodDescriptor(type72, typeArray95);
        java.lang.String str97 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray95);
        org.mockito.cglib.core.Signature signature98 = new org.mockito.cglib.core.Signature("L1748152536", type36, typeArray95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str99 = type36.getInternalName();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 10, type1);
        int int4 = type1.getSize();
        int int6 = type1.getOpcode((int) (byte) -1);
        boolean boolean8 = type1.equals((java.lang.Object) "L1862717103");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type1.getElementType();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        java.lang.String str6 = type4.getClassName();
        int int8 = type4.getOpcode(1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) 'a', type15);
        org.mockito.asm.Type type17 = local16.getType();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type12, type13, type18, type19, type20, type22 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type4, typeArray24);
        org.mockito.asm.Type type27 = signature26.getReturnType();
        org.mockito.asm.Type type28 = signature26.getReturnType();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(97, type28);
        int int31 = type28.getOpcode(97);
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(0, type28);
        int int33 = local32.getIndex();
        org.mockito.asm.Type type34 = local32.getType();
        org.mockito.asm.Type type35 = local32.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = type35.getInternalName();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(SDIISI)I");
        org.mockito.asm.Type type2 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type2.getDimensions();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) 'a', type5);
        java.lang.String str7 = type5.getClassName();
        int int9 = type5.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type5, typeArray25);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        org.mockito.asm.Type type29 = signature27.getReturnType();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(97, type29);
        org.mockito.asm.Type type31 = local30.getType();
        int int32 = local30.getIndex();
        org.mockito.asm.Type type33 = local30.getType();
        org.mockito.asm.Type type34 = local30.getType();
        org.mockito.asm.Type type35 = local30.getType();
        org.mockito.asm.Type type36 = local30.getType();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 0, type36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType("Z");
        java.lang.String str40 = type39.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/core/Signature;");
        int int43 = type42.getDimensions();
        int int45 = type42.getOpcode(124);
        boolean boolean46 = type39.equals((java.lang.Object) type42);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str50 = type49.toString();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((int) 'a', type54);
        org.mockito.asm.Type type56 = local55.getType();
        org.mockito.asm.Type type57 = local55.getType();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(154, type61);
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type51, type52, type57, type58, type59, type61 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("hi!", type49, typeArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local67 = new org.mockito.cglib.core.Local(154, type66);
        boolean boolean68 = signature64.equals((java.lang.Object) type66);
        org.mockito.cglib.core.Local local69 = new org.mockito.cglib.core.Local(155, type66);
        org.mockito.asm.Type type70 = local69.getType();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local73 = new org.mockito.cglib.core.Local(154, type72);
        int int74 = type72.getSort();
        java.lang.String str75 = type72.toString();
        boolean boolean76 = type70.equals((java.lang.Object) type72);
        org.mockito.asm.Type type78 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str79 = type78.toString();
        org.mockito.asm.Type type80 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type81 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type83 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local84 = new org.mockito.cglib.core.Local((int) 'a', type83);
        org.mockito.asm.Type type85 = local84.getType();
        org.mockito.asm.Type type86 = local84.getType();
        org.mockito.asm.Type type87 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type88 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type90 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local91 = new org.mockito.cglib.core.Local(154, type90);
        org.mockito.asm.Type[] typeArray92 = new org.mockito.asm.Type[] { type80, type81, type86, type87, type88, type90 };
        org.mockito.cglib.core.Signature signature93 = new org.mockito.cglib.core.Signature("hi!", type78, typeArray92);
        java.lang.String str94 = signature93.toString();
        org.mockito.asm.Type[] typeArray95 = signature93.getArgumentTypes();
        java.lang.String str96 = org.mockito.asm.Type.getMethodDescriptor(type72, typeArray95);
        java.lang.String str97 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray95);
        org.mockito.cglib.core.Signature signature98 = new org.mockito.cglib.core.Signature("L1748152536", type36, typeArray95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type99 = type36.getElementType();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type2, typeArray20);
        java.lang.String str23 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type2.getInternalName();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        java.lang.String str12 = type10.getClassName();
        int int14 = type10.getOpcode(1);
        boolean boolean15 = type8.equals((java.lang.Object) type10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type10.getInternalName();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("B");
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label3.info = label4;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        boolean boolean27 = signature23.equals((java.lang.Object) type25);
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(155, type25);
        label4.info = 155;
        java.lang.Object obj30 = label4.info;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(154, type33);
        java.lang.String str35 = type33.toString();
        java.lang.String str36 = type33.getClassName();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(112, type33);
        org.mockito.asm.Type type38 = local37.getType();
        label4.info = type38;
        java.lang.String str40 = label4.toString();
        boolean boolean41 = type2.equals((java.lang.Object) label4);
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(0, type2);
        int int43 = type2.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type44 = type2.getElementType();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getClassType();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("I");
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label2.info = label3;
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters8 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("int", "int", "S");
        label2.info = arrayDelimiters8;
        java.lang.String str10 = label2.toString();
        java.lang.String str11 = label2.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (byte) -1, type13);
        int int15 = type13.getSort();
        int int17 = type13.getOpcode(112);
        int int18 = type13.getSize();
        label2.info = type13;
        java.lang.String str20 = type13.getDescriptor();
        java.lang.String str21 = type13.toString();
        int int23 = type13.getOpcode(108);
        boolean boolean24 = type1.equals((java.lang.Object) type13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type13.getElementType();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        org.mockito.asm.Type type29 = local28.getType();
        org.mockito.asm.Type type30 = local28.getType();
        java.lang.String str31 = type30.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type30.getInternalName();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getDescriptor();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        java.lang.String str6 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type2.getInternalName();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray22);
        int int25 = type2.getSort();
        java.lang.String str26 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = type2.getElementType();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(SDIISI)J");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("hi!(SDIISI)S");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        int int22 = type6.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type32 = local30.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type26, type27, type32, type33, type34, type36 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray38);
        java.lang.String str40 = signature39.toString();
        org.mockito.asm.Type[] typeArray41 = signature39.getArgumentTypes();
        org.mockito.asm.Type[] typeArray42 = signature39.getArgumentTypes();
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1908869776", type6, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", type3, typeArray42);
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(56, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int46 = type3.getDimensions();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        int int30 = type27.getOpcode(108);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type27.getElementType();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.toString();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type6);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(98, type6);
        int int10 = local9.getIndex();
        org.mockito.asm.Type type11 = local9.getType();
        int int12 = type11.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type11.getInternalName();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type32 = local30.getType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(154, type36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type26, type27, type32, type33, type34, type36 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray38);
        int int40 = type24.getSize();
        java.lang.String str41 = type24.toString();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(8, type24);
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (byte) 1, type24);
        boolean boolean44 = type2.equals((java.lang.Object) type24);
        int int46 = type24.getOpcode((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = type24.getDimensions();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        java.lang.String str25 = signature24.getName();
        java.lang.String str26 = signature24.getDescriptor();
        org.mockito.asm.Type type27 = signature24.getReturnType();
        org.mockito.asm.Type type28 = signature24.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type28.getDimensions();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray22);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        org.mockito.asm.Type type26 = signature24.getReturnType();
        org.mockito.asm.Type type27 = signature24.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = type27.getInternalName();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("B");
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label3.info = label4;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) 'a', type13);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(154, type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type10, type11, type16, type17, type18, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        boolean boolean27 = signature23.equals((java.lang.Object) type25);
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(155, type25);
        label4.info = 155;
        java.lang.Object obj30 = label4.info;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(154, type33);
        java.lang.String str35 = type33.toString();
        java.lang.String str36 = type33.getClassName();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(112, type33);
        org.mockito.asm.Type type38 = local37.getType();
        label4.info = type38;
        java.lang.String str40 = label4.toString();
        boolean boolean41 = type2.equals((java.lang.Object) label4);
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(0, type2);
        java.lang.String str43 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = type2.getInternalName();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type3 = local2.getType();
        int int4 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        boolean boolean25 = signature21.equals((java.lang.Object) type23);
        org.mockito.asm.Type type26 = signature21.getReturnType();
        org.mockito.asm.Type type27 = signature21.getReturnType();
        java.lang.String str28 = type27.getDescriptor();
        int int29 = type27.getSize();
        boolean boolean30 = type3.equals((java.lang.Object) type27);
        java.lang.String str31 = type3.getClassName();
        java.lang.String str32 = type3.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int33 = type3.getDimensions();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(SDIISI)J");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        java.lang.String str7 = signature2.getName();
        org.mockito.asm.Type type8 = signature2.getReturnType();
        org.mockito.asm.Type type9 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type9.getDimensions();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = signature17.getReturnType();
        java.lang.String str23 = signature17.getName();
        java.lang.String str24 = signature17.getName();
        org.mockito.asm.Type type25 = signature17.getReturnType();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(108, type25);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type type28 = local26.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type28.getInternalName();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) 'a', type8);
        org.mockito.asm.Type type10 = local9.getType();
        org.mockito.asm.Type type11 = local9.getType();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(154, type15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type5, type6, type11, type12, type13, type15 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray17);
        int int19 = type3.getSize();
        java.lang.String str20 = type3.toString();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(8, type3);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (byte) 1, type3);
        org.mockito.asm.Type type23 = local22.getType();
        int int24 = type23.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type23.getElementType();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(160, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type2.getInternalName();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        int int4 = type2.getOpcode(126);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type2);
        java.lang.String str6 = type2.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (byte) -1, type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) 'a', type17);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.asm.Type type20 = local18.getType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(154, type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type14, type15, type20, type21, type22, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        java.lang.String str28 = signature27.toString();
        org.mockito.asm.Type[] typeArray29 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("B", type9, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("S", type2, typeArray29);
        org.mockito.asm.Type type32 = signature31.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int33 = type32.getDimensions();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        int int4 = type3.getSort();
        java.lang.String str5 = type3.toString();
        boolean boolean6 = type2.equals((java.lang.Object) type3);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 10, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type3.getDimensions();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) 'a', type5);
        java.lang.String str7 = type5.getClassName();
        int int9 = type5.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) 'a', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(154, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type13, type14, type19, type20, type21, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type5, typeArray25);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        org.mockito.asm.Type type29 = signature27.getReturnType();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(97, type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) 'a', type34);
        java.lang.String str36 = type34.getClassName();
        int int38 = type34.getOpcode(1);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local((int) 'a', type45);
        org.mockito.asm.Type type47 = local46.getType();
        org.mockito.asm.Type type48 = local46.getType();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local(154, type52);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type42, type43, type48, type49, type50, type52 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("hi!", type40, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("L1908869776", type34, typeArray54);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("J", type31, typeArray54);
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local((int) (short) 1, type31);
        java.lang.String str59 = type31.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int60 = type31.getDimensions();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "(SDIISI)LB;");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        java.lang.String str21 = signature20.getName();
        org.mockito.asm.Type[] typeArray22 = signature20.getArgumentTypes();
        java.lang.String str23 = signature20.getName();
        java.lang.String str24 = signature20.toString();
        boolean boolean25 = signature2.equals((java.lang.Object) signature20);
        org.mockito.asm.Type type26 = signature20.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type26.getDimensions();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str17 = signature16.toString();
        java.lang.String str18 = signature16.getDescriptor();
        java.lang.String str19 = signature16.getName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) 'a', type23);
        java.lang.String str25 = type23.getClassName();
        int int27 = type23.getOpcode(1);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) 'a', type34);
        org.mockito.asm.Type type36 = local35.getType();
        org.mockito.asm.Type type37 = local35.getType();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(154, type41);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type31, type32, type37, type38, type39, type41 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type23, typeArray43);
        org.mockito.asm.Type type46 = signature45.getReturnType();
        org.mockito.asm.Type type47 = signature45.getReturnType();
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(97, type47);
        org.mockito.asm.Type type49 = local48.getType();
        int int50 = local48.getIndex();
        int int51 = local48.getIndex();
        org.mockito.asm.Type type52 = local48.getType();
        int int53 = local48.getIndex();
        org.mockito.asm.Type type54 = local48.getType();
        boolean boolean55 = signature16.equals((java.lang.Object) local48);
        org.mockito.asm.Type type56 = local48.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str57 = type56.getInternalName();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        int int4 = type1.getOpcode((int) ' ');
        int int5 = type1.getSort();
        java.lang.String str6 = type1.getDescriptor();
        java.lang.String str7 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("L1908869776", type3, typeArray23);
        int int26 = type3.getSort();
        java.lang.String str27 = type3.toString();
        java.lang.String str28 = type3.toString();
        java.lang.String str29 = type3.getClassName();
        java.lang.String str30 = type3.toString();
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(9, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type3.getInternalName();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.toString();
        int int6 = type1.getOpcode((int) (byte) 100);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("hi!(SDIISI)S");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) 'a', type17);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.asm.Type type20 = local18.getType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(154, type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type14, type15, type20, type21, type22, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        int int28 = type12.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((int) 'a', type35);
        org.mockito.asm.Type type37 = local36.getType();
        org.mockito.asm.Type type38 = local36.getType();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local(154, type42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type32, type33, type38, type39, type40, type42 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("hi!", type30, typeArray44);
        java.lang.String str46 = signature45.toString();
        org.mockito.asm.Type[] typeArray47 = signature45.getArgumentTypes();
        org.mockito.asm.Type[] typeArray48 = signature45.getArgumentTypes();
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("L1908869776", type12, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", type9, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray48);
        java.lang.String str52 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type53 = type1.getElementType();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        boolean boolean24 = signature20.equals((java.lang.Object) type22);
        org.mockito.asm.Type type25 = signature20.getReturnType();
        int int27 = type25.getOpcode((int) 'a');
        boolean boolean28 = type3.equals((java.lang.Object) int27);
        int int29 = type3.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type3.getDimensions();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type21 = signature16.getReturnType();
        java.lang.String str22 = signature16.getName();
        java.lang.String str23 = signature16.getName();
        org.mockito.asm.Type type24 = signature16.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type type35 = local33.getType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(154, type39);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type29, type30, type35, type36, type37, type39 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray41);
        boolean boolean44 = type24.equals((java.lang.Object) type25);
        java.lang.String str45 = type25.getDescriptor();
        java.lang.String str46 = type25.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = type25.getDimensions();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = signature17.getReturnType();
        org.mockito.asm.Type type23 = signature17.getReturnType();
        int int24 = type23.getSize();
        org.mockito.asm.Type[] typeArray26 = org.mockito.asm.Type.getArgumentTypes("(SDIISI)Lorg/mockito/asm/Type;");
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("L88066830", type23, typeArray26);
        int int28 = type23.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type23.getElementType();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(154, type3);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) 'a', type12);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.asm.Type type15 = local13.getType();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type9, type10, type15, type16, type17, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type7, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(154, type24);
        boolean boolean26 = signature22.equals((java.lang.Object) type24);
        org.mockito.asm.Type type27 = signature22.getReturnType();
        int int29 = type27.getOpcode((int) 'a');
        boolean boolean30 = type5.equals((java.lang.Object) int29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) 'a', type37);
        org.mockito.asm.Type type39 = local38.getType();
        org.mockito.asm.Type type40 = local38.getType();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(154, type44);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type34, type35, type40, type41, type42, type44 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray46);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(154, type49);
        boolean boolean51 = signature47.equals((java.lang.Object) type49);
        org.mockito.asm.Type type52 = signature47.getReturnType();
        org.mockito.asm.Type[] typeArray53 = signature47.getArgumentTypes();
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type5, typeArray53);
        java.lang.String str55 = type5.toString();
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local(100, type5);
        org.mockito.asm.Type type57 = local56.getType();
        java.lang.String str58 = type57.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = type57.getInternalName();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(SDIISI)J");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        boolean boolean8 = signature2.equals((java.lang.Object) type7);
        java.lang.String str9 = signature2.getName();
        org.mockito.asm.Type type10 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type10.getDimensions();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) 'a', type22);
        org.mockito.asm.Type type24 = local23.getType();
        org.mockito.asm.Type type25 = local23.getType();
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(96, type25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) 'a', type34);
        org.mockito.asm.Type type36 = local35.getType();
        org.mockito.asm.Type type37 = local35.getType();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(154, type41);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type31, type32, type37, type38, type39, type41 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray43);
        java.lang.String str45 = signature44.toString();
        org.mockito.asm.Type[] typeArray46 = signature44.getArgumentTypes();
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("L1836861769", type25, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", type18, typeArray46);
        boolean boolean49 = type1.equals((java.lang.Object) signature48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int50 = type1.getDimensions();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(154, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type7, type8, type13, type14, type15, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        boolean boolean24 = signature20.equals((java.lang.Object) type22);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(155, type22);
        label1.info = 155;
        java.lang.String str27 = label1.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type type35 = local33.getType();
        java.lang.String str36 = type35.getDescriptor();
        java.lang.String str37 = type35.getDescriptor();
        boolean boolean38 = type29.equals((java.lang.Object) type35);
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(126, type29);
        java.lang.String str40 = type29.getDescriptor();
        label1.info = type29;
        int int42 = type29.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type43 = type29.getElementType();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(155, type19);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        int int27 = type25.getSort();
        java.lang.String str28 = type25.toString();
        boolean boolean29 = type23.equals((java.lang.Object) type25);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) 'a', type36);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(154, type43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type33, type34, type39, type40, type41, type43 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray45);
        java.lang.String str47 = signature46.toString();
        org.mockito.asm.Type[] typeArray48 = signature46.getArgumentTypes();
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type50 = type25.getElementType();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        boolean boolean20 = signature16.equals((java.lang.Object) type18);
        java.lang.String str21 = signature16.getDescriptor();
        org.mockito.asm.Type type22 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type22.getElementType();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        java.lang.String str6 = type4.getClassName();
        int int8 = type4.getOpcode(1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) 'a', type15);
        org.mockito.asm.Type type17 = local16.getType();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(154, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type12, type13, type18, type19, type20, type22 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type4, typeArray24);
        org.mockito.asm.Type type27 = signature26.getReturnType();
        org.mockito.asm.Type type28 = signature26.getReturnType();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(97, type28);
        int int31 = type28.getOpcode(97);
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(0, type28);
        int int33 = local32.getIndex();
        org.mockito.asm.Type type34 = local32.getType();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) 'a', type39);
        org.mockito.asm.Type type41 = local40.getType();
        org.mockito.asm.Type type42 = local40.getType();
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(96, type42);
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(98, type42);
        int int46 = local45.getIndex();
        org.mockito.asm.Type type47 = local45.getType();
        org.mockito.asm.Type type48 = local45.getType();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str51 = type50.toString();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local((int) 'a', type55);
        org.mockito.asm.Type type57 = local56.getType();
        org.mockito.asm.Type type58 = local56.getType();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local(154, type62);
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type52, type53, type58, type59, type60, type62 };
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", type50, typeArray64);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local68 = new org.mockito.cglib.core.Local(154, type67);
        boolean boolean69 = signature65.equals((java.lang.Object) type67);
        org.mockito.asm.Type type70 = signature65.getReturnType();
        java.lang.String str71 = signature65.getName();
        org.mockito.asm.Type[] typeArray72 = signature65.getArgumentTypes();
        java.lang.String str73 = signature65.getName();
        java.lang.String str74 = signature65.getName();
        org.mockito.asm.Type type75 = signature65.getReturnType();
        org.mockito.asm.Type[] typeArray76 = signature65.getArgumentTypes();
        org.mockito.cglib.core.Signature signature77 = new org.mockito.cglib.core.Signature("L634783769", type48, typeArray76);
        org.mockito.asm.Type[] typeArray78 = signature77.getArgumentTypes();
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray78);
        java.lang.String str80 = type34.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int81 = type34.getDimensions();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(108);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(156, type3);
        int int27 = type3.getSort();
        java.lang.String str28 = type3.getDescriptor();
        java.lang.String str29 = type3.toString();
        java.lang.String str30 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int31 = type3.getDimensions();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) 'a', type25);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type type28 = local26.getType();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(154, type32);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type22, type23, type28, type29, type30, type32 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray34);
        java.lang.String str36 = signature35.toString();
        org.mockito.asm.Type[] typeArray37 = signature35.getArgumentTypes();
        org.mockito.asm.Type[] typeArray38 = signature35.getArgumentTypes();
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("L1908869776", type2, typeArray38);
        int int40 = type2.getSize();
        int int41 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = type2.getInternalName();
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        int int18 = type2.getSize();
        java.lang.String str19 = type2.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(8, type2);
        int int21 = type2.getSize();
        java.lang.String str22 = type2.toString();
        java.lang.String str23 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type2.getElementType();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("LSDIISI)L(SDIISI)I;");
        label1.info = "LSDIISI)L(SDIISI)I;";
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) 'a', type8);
        java.lang.String str10 = type8.getClassName();
        int int12 = type8.getOpcode(1);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) 'a', type19);
        org.mockito.asm.Type type21 = local20.getType();
        org.mockito.asm.Type type22 = local20.getType();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(154, type26);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type16, type17, type22, type23, type24, type26 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type14, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type8, typeArray28);
        org.mockito.asm.Type type31 = signature30.getReturnType();
        org.mockito.asm.Type type32 = signature30.getReturnType();
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(97, type32);
        org.mockito.asm.Type type34 = local33.getType();
        int int35 = local33.getIndex();
        int int36 = local33.getIndex();
        org.mockito.asm.Type type37 = local33.getType();
        label1.info = type37;
        java.lang.String str39 = type37.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str43 = type42.toString();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((int) 'a', type47);
        org.mockito.asm.Type type49 = local48.getType();
        org.mockito.asm.Type type50 = local48.getType();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local(154, type54);
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type44, type45, type50, type51, type52, type54 };
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("hi!", type42, typeArray56);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray56);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("L1478128251", type37, typeArray56);
        java.lang.String str60 = type37.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type61 = type37.getElementType();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        org.mockito.asm.Type type4 = local3.getType();
        java.lang.String str5 = type4.getClassName();
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters9 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("(SDIISI)LL1817688892;", "Lhi!(SDIISI)S;", "L248748310");
        boolean boolean10 = type4.equals((java.lang.Object) "(SDIISI)LL1817688892;");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) 'a', type17);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.asm.Type type20 = local18.getType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(154, type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type14, type15, type20, type21, type22, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        java.lang.String str28 = signature27.getName();
        org.mockito.asm.Type[] typeArray29 = signature27.getArgumentTypes();
        java.lang.String str30 = signature27.getName();
        java.lang.String str31 = signature27.toString();
        org.mockito.asm.Type[] typeArray32 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("L248748310", type4, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type4.getDimensions();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type7 = local5.getType();
        java.lang.String str8 = type7.getDescriptor();
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = type1.equals((java.lang.Object) type7);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(126, type1);
        boolean boolean13 = type1.equals((java.lang.Object) "L1836861769");
        java.lang.String str14 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type1.getInternalName();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(154, type4);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(154, type26);
        boolean boolean28 = signature24.equals((java.lang.Object) type26);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(155, type26);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        java.lang.String str34 = type32.getClassName();
        int int36 = type32.getOpcode(1);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((int) 'a', type43);
        org.mockito.asm.Type type45 = local44.getType();
        org.mockito.asm.Type type46 = local44.getType();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(154, type50);
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type40, type41, type46, type47, type48, type50 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("hi!", type38, typeArray52);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type32, typeArray52);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray52);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray52);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local60 = new org.mockito.cglib.core.Local((int) 'a', type59);
        java.lang.String str61 = type59.getClassName();
        int int63 = type59.getOpcode(1);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str66 = type65.toString();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local71 = new org.mockito.cglib.core.Local((int) 'a', type70);
        org.mockito.asm.Type type72 = local71.getType();
        org.mockito.asm.Type type73 = local71.getType();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local78 = new org.mockito.cglib.core.Local(154, type77);
        org.mockito.asm.Type[] typeArray79 = new org.mockito.asm.Type[] { type67, type68, type73, type74, type75, type77 };
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("hi!", type65, typeArray79);
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("L1908869776", type59, typeArray79);
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("L631593947", type6, typeArray79);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("L850527522", type1, typeArray79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str84 = type1.getInternalName();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type4);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type7 = local5.getType();
        java.lang.String str8 = type7.getDescriptor();
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = type1.equals((java.lang.Object) type7);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(126, type1);
        int int12 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type1.getInternalName();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type4, type5, type10, type11, type12, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        boolean boolean21 = signature17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = signature17.getReturnType();
        java.lang.String str23 = signature17.getName();
        java.lang.String str24 = signature17.getName();
        org.mockito.asm.Type type25 = signature17.getReturnType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) 'a', type33);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = local34.getType();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(154, type40);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type30, type31, type36, type37, type38, type40 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray42);
        boolean boolean45 = type25.equals((java.lang.Object) type26);
        java.lang.String str46 = type26.getDescriptor();
        int int47 = type26.getSort();
        java.lang.String str48 = type26.getClassName();
        int int49 = type26.getSize();
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(154, type26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = type26.getInternalName();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) 'a', type12);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.asm.Type type15 = local13.getType();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(154, type19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type9, type10, type15, type16, type17, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type7, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(154, type24);
        boolean boolean26 = signature22.equals((java.lang.Object) type24);
        org.mockito.asm.Type type27 = signature22.getReturnType();
        java.lang.String str28 = signature22.getName();
        java.lang.String str29 = signature22.getName();
        java.lang.String str30 = signature22.getDescriptor();
        org.mockito.asm.Type[] typeArray31 = signature22.getArgumentTypes();
        java.lang.Class<?> wildcardClass32 = typeArray31.getClass();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type34 = type33.getElementType();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass36 = type35.getClass();
        java.lang.String str37 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass36);
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        java.lang.String str42 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str46 = type45.toString();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((int) 'a', type50);
        org.mockito.asm.Type type52 = local51.getType();
        org.mockito.asm.Type type53 = local51.getType();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local(154, type57);
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type47, type48, type53, type54, type55, type57 };
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("hi!", type45, typeArray59);
        java.lang.String str61 = signature60.toString();
        org.mockito.asm.Type[] typeArray62 = signature60.getArgumentTypes();
        org.mockito.asm.Type type63 = signature60.getReturnType();
        java.lang.String str64 = signature60.getName();
        org.mockito.asm.Type type65 = signature60.getReturnType();
        org.mockito.asm.Type[] typeArray66 = signature60.getArgumentTypes();
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(0, 120, "L1424907308", type34, typeArray66, "L515031329");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(154, type3);
        java.lang.String str5 = type3.toString();
        java.lang.String str6 = type3.getClassName();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(112, type3);
        java.lang.String str8 = type3.getDescriptor();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(97, type3);
        org.mockito.asm.Type type10 = local9.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type10.getDimensions();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        java.lang.String str5 = type3.getClassName();
        int int7 = type3.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(154, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type11, type12, type17, type18, type19, type21 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(97, type27);
        int int30 = type27.getOpcode(97);
        java.lang.String str31 = type27.getDescriptor();
        int int32 = type27.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int33 = type27.getDimensions();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) 'a', type9);
        org.mockito.asm.Type type11 = local10.getType();
        org.mockito.asm.Type type12 = local10.getType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(154, type16);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type6, type7, type12, type13, type14, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray18);
        int int20 = type4.getSize();
        java.lang.String str21 = type4.toString();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(8, type4);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (byte) 1, type4);
        org.mockito.asm.Type type24 = local23.getType();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(126, type24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type24.getElementType();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSort();
        int int4 = type1.getSize();
        java.lang.String str5 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = type1.getSort();
        int int4 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) 'a', type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(154, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type3, type4, type9, type10, type11, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str17 = signature16.toString();
        org.mockito.asm.Type[] typeArray18 = signature16.getArgumentTypes();
        org.mockito.asm.Type type19 = signature16.getReturnType();
        org.mockito.asm.Type[] typeArray20 = signature16.getArgumentTypes();
        org.mockito.asm.Type type21 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type21.getElementType();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org/mockito/asm/Type(SDIISI)I");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        label0.info = 1;
        java.lang.Object obj8 = label0.info;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        java.lang.String str11 = label0.toString();
        java.lang.String str12 = label0.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type14);
        int int16 = type14.getSort();
        int int18 = type14.getOpcode(108);
        label0.info = type14;
        int int20 = type14.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type14.getDimensions();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) -1, type4);
        int int6 = type4.getSort();
        java.lang.String str7 = type4.getClassName();
        int int8 = type4.getSize();
        int int9 = type4.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("L646121781");
        boolean boolean13 = type11.equals((java.lang.Object) 100.0f);
        boolean boolean14 = type4.equals((java.lang.Object) type11);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(3, type4);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/core/Signature;");
        int int19 = type18.getDimensions();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(7, type18);
        java.lang.String str21 = type18.getDescriptor();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("long", "(SDIISI)LB;");
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("g/mockito/cglib/core/Signature", type4, typeArray25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("(SDIISI)LL1817688892;");
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType("(SDIISI)LSDIISI)LB;");
        boolean boolean32 = type29.equals((java.lang.Object) type31);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((int) 'a', type35);
        java.lang.String str37 = type35.getClassName();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str40 = type39.toString();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((int) 'a', type44);
        org.mockito.asm.Type type46 = local45.getType();
        org.mockito.asm.Type type47 = local45.getType();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local(154, type51);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type41, type42, type47, type48, type49, type51 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("hi!", type39, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("int", type35, typeArray53);
        org.mockito.asm.Type type56 = signature55.getReturnType();
        org.mockito.asm.Type[] typeArray57 = signature55.getArgumentTypes();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getType("B");
        boolean boolean60 = signature55.equals((java.lang.Object) type59);
        org.mockito.asm.Type[] typeArray61 = signature55.getArgumentTypes();
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray61);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("L1361004376", type4, typeArray61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int64 = type4.getDimensions();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Type[] typeArray2 = org.mockito.asm.Type.getArgumentTypes("LSDIISI)L(SDIISI)I;");
        label0.info = "LSDIISI)L(SDIISI)I;";
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        java.lang.String str9 = type7.getClassName();
        int int11 = type7.getOpcode(1);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) 'a', type18);
        org.mockito.asm.Type type20 = local19.getType();
        org.mockito.asm.Type type21 = local19.getType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(154, type25);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type15, type16, type21, type22, type23, type25 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type7, typeArray27);
        org.mockito.asm.Type type30 = signature29.getReturnType();
        org.mockito.asm.Type type31 = signature29.getReturnType();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(97, type31);
        org.mockito.asm.Type type33 = local32.getType();
        int int34 = local32.getIndex();
        int int35 = local32.getIndex();
        org.mockito.asm.Type type36 = local32.getType();
        label0.info = type36;
        java.lang.String str38 = type36.getClassName();
        java.lang.String str39 = type36.toString();
        int int40 = type36.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        boolean boolean43 = type36.equals((java.lang.Object) type41);
        java.lang.String str44 = type41.toString();
        java.lang.String str45 = type41.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int46 = type41.getDimensions();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(154, type18);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type8, type9, type14, type15, type16, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type2, typeArray20);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        org.mockito.asm.Type[] typeArray24 = signature22.getArgumentTypes();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType("B");
        boolean boolean27 = signature22.equals((java.lang.Object) type26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = type26.getInternalName();
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(52);
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) 'a', type2);
        java.lang.String str4 = type2.getClassName();
        int int6 = type2.getOpcode(1);
        label0.info = 1;
        java.lang.Object obj8 = label0.info;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        java.lang.Object obj11 = label0.info;
        java.lang.String str12 = label0.toString();
        java.lang.Object obj13 = label0.info;
        java.lang.String str14 = label0.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("(SDIISI)I");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) 'a', type21);
        java.lang.String str23 = type21.getClassName();
        int int25 = type21.getOpcode(1);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) 'a', type32);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type type35 = local33.getType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(154, type39);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type29, type30, type35, type36, type37, type39 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1908869776", type21, typeArray41);
        org.mockito.asm.Type[] typeArray44 = signature43.getArgumentTypes();
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("short", type18, typeArray44);
        java.lang.String str46 = type18.getDescriptor();
        java.lang.String str47 = type18.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass49 = type48.getClass();
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass49);
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        java.lang.String str53 = type52.getInternalName();
        int int55 = type52.getOpcode(112);
        boolean boolean56 = type18.equals((java.lang.Object) type52);
        org.mockito.asm.Type type57 = type18.getElementType();
        org.mockito.asm.Type type58 = type18.getElementType();
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", "");
        boolean boolean62 = type58.equals((java.lang.Object) signature61);
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local(97, type58);
        label0.info = type58;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type65 = type58.getElementType();
    }
}

