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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        boolean boolean4 = type0.equals((java.lang.Object) 169);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type52 = type0.getElementType();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type0.getElementType();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type1.getDimensions();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier1.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.toString();
        int int6 = type4.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray9);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type2.getInternalName();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        boolean boolean4 = type0.equals((java.lang.Object) 169);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int52 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str53 = type0.getInternalName();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int53 = type0.getOpcode(8192);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str54 = type0.getInternalName();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type1.getElementType();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type5, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier12.newValue(type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.toString();
        int int17 = type15.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type15, type18, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type0.getElementType();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type6.getElementType();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type5, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier12.newValue(type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.toString();
        int int17 = type15.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type15, type18, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        int int24 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type0.getElementType();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = type0.getInternalName();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier4.newValue(type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.toString();
        int int9 = type7.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type1.getInternalName();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier1.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.toString();
        int int6 = type4.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray9);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type2.getDimensions();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray11);
        int int14 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type1.getDimensions();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type5, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier12.newValue(type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.toString();
        int int17 = type15.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type15, type18, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        int int24 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type0.getDimensions();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSize();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier4.newValue(type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.toString();
        int int9 = type7.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray12);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier14.newValue(type15);
        int int17 = type15.getSort();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier18 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier18.newValue(type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str22 = type21.toString();
        int int23 = type21.getSort();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type21, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        boolean boolean29 = type5.equals((java.lang.Object) typeArray26);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = type1.getInternalName();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 87);
        int int5 = type0.getOpcode(118);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass9 = type6.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier14.newValue(type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.toString();
        int int19 = type17.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type17, type20, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray22);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier24 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier24.newValue(type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str28 = type27.toString();
        int int29 = type27.getSort();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type27, type30, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray32);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray32);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray32);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray32);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = type0.getDimensions();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] { type2 };
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        java.lang.String str7 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(108);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VVI)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 87);
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int52 = type0.getSort();
        java.lang.String str53 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier54 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value56 = basicVerifier54.newValue(type55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str58 = type57.toString();
        int int59 = type57.getSort();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type57, type60, type61 };
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray62);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier64 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value66 = basicVerifier64.newValue(type65);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str68 = type67.toString();
        int int69 = type67.getSort();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] { type67, type70, type71 };
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray72);
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray72);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray72);
        int int76 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type77 = type0.getElementType();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int53 = type0.getOpcode(8192);
        java.lang.String str54 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type55 = type0.getElementType();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        org.mockito.asm.Type[] typeArray6 = org.mockito.asm.Type.getArgumentTypes("(VVI)B");
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter5 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier6 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier6.newValue(type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.toString();
        int int11 = type9.getSort();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type9, type12, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray14);
        org.mockito.asm.tree.analysis.Value value16 = basicInterpreter5.newValue(type7);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier21 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier21.newValue(type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 180);
        java.lang.String str27 = type24.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type7, type17, type18, type22, type24, type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray29);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier31.newValue(type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str35 = type34.toString();
        int int36 = type34.getSort();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type34, type37, type38 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier41.newValue(type42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str45 = type44.toString();
        int int46 = type44.getSort();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type44, type47, type48 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray49);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray49);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray49);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int54 = type0.getDimensions();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier0.newValue(type13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type13.getDimensions();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VVI)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(VVI)I");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type0.getDimensions();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier0.newValue(type13);
        java.lang.String str16 = type13.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type13.getInternalName();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(I)Z");
        int int4 = type2.getOpcode(83);
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type6 = type2.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type6.getDimensions();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray11);
        int int14 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type1.getInternalName();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int53 = type0.getOpcode(8192);
        java.lang.String str54 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = type0.getInternalName();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        int int7 = type1.getSort();
        int int8 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type1.getElementType();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter10 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier11 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier11.newValue(type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str15 = type14.toString();
        int int16 = type14.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray19);
        org.mockito.asm.tree.analysis.Value value21 = basicInterpreter10.newValue(type12);
        boolean boolean22 = type1.equals((java.lang.Object) basicInterpreter10);
        int int23 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type1.getElementType();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter1 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type5, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray10);
        org.mockito.asm.tree.analysis.Value value12 = basicInterpreter1.newValue(type3);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        int int16 = value15.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException17 = new org.mockito.asm.tree.analysis.AnalyzerException("C", (java.lang.Object) basicInterpreter1, value15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        int int21 = type20.getSort();
        int int22 = type20.getSize();
        int int23 = type20.getDimensions();
        org.mockito.asm.tree.analysis.Value value24 = basicInterpreter1.newValue(type20);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) 180);
        java.lang.String str28 = type25.toString();
        org.mockito.asm.tree.analysis.Value value29 = basicInterpreter1.newValue(type25);
        int int30 = type25.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type25.getElementType();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = type0.getInternalName();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier4.newValue(type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.toString();
        int int9 = type7.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        java.lang.String str15 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type1.getDimensions();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type6.getInternalName();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(108);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        boolean boolean12 = type0.equals((java.lang.Object) wildcardClass6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type0.getDimensions();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        java.lang.String str10 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type1.getDimensions();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        int int32 = type0.getOpcode(129);
        int int33 = type0.getSort();
        org.mockito.asm.Type[] typeArray35 = org.mockito.asm.Type.getArgumentTypes("(I)Z");
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type37 = type0.getElementType();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier3 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier3.newValue(type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str7 = type6.toString();
        int int8 = type6.getSort();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type6, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray11);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.toString();
        int int18 = type16.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type16, type19, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray21);
        int int25 = type1.getSize();
        org.mockito.asm.tree.analysis.Value value26 = basicInterpreter0.newValue(type1);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str28 = type27.toString();
        int int29 = type27.getSort();
        java.lang.String str30 = type27.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter31 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier32 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier32.newValue(type33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str36 = type35.toString();
        int int37 = type35.getSort();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type35, type38, type39 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray40);
        org.mockito.asm.tree.analysis.Value value42 = basicInterpreter31.newValue(type33);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean46 = type44.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier47 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier47.newValue(type48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean52 = type50.equals((java.lang.Object) 180);
        java.lang.String str53 = type50.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type33, type43, type44, type48, type50, type54 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray55);
        int int57 = type27.getSort();
        org.mockito.asm.tree.analysis.Value value58 = basicInterpreter0.newValue(type27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int59 = type27.getDimensions();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type0.getDimensions();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass9 = type6.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier14.newValue(type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.toString();
        int int19 = type17.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type17, type20, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray22);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier24 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier24.newValue(type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str28 = type27.toString();
        int int29 = type27.getSort();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type27, type30, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray32);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray32);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray32);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray32);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = type0.getInternalName();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        int int7 = type1.getSort();
        int int9 = type1.getOpcode(191);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type1.getElementType();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int53 = type0.getOpcode(8192);
        java.lang.String str54 = type0.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException58 = new org.mockito.asm.tree.analysis.AnalyzerException("char");
        java.lang.Throwable[] throwableArray59 = analyzerException58.getSuppressed();
        java.lang.Throwable[] throwableArray60 = analyzerException58.getSuppressed();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException61 = new org.mockito.asm.tree.analysis.AnalyzerException("Lorg/mockito/asm/tree/analysis/BasicValue;", (java.lang.Throwable) analyzerException58);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException62 = new org.mockito.asm.tree.analysis.AnalyzerException("L(I)V;", (java.lang.Throwable) analyzerException58);
        boolean boolean63 = type0.equals((java.lang.Object) analyzerException62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str64 = type0.getInternalName();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        int int3 = type1.getOpcode(177);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        int int10 = type1.getSize();
        int int12 = type1.getOpcode(159);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type1.getInternalName();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        int int7 = type1.getSort();
        int int8 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type1.getInternalName();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier3 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier3.newValue(type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str7 = type6.toString();
        int int8 = type6.getSort();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type6, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray11);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.toString();
        int int18 = type16.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type16, type19, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray21);
        int int25 = type1.getSize();
        org.mockito.asm.tree.analysis.Value value26 = basicInterpreter0.newValue(type1);
        java.lang.String str27 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = type1.getDimensions();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier3 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier3.newValue(type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str7 = type6.toString();
        int int8 = type6.getSort();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type6, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray11);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.toString();
        int int18 = type16.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type16, type19, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray21);
        int int25 = type1.getSize();
        org.mockito.asm.tree.analysis.Value value26 = basicInterpreter0.newValue(type1);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str28 = type27.toString();
        int int29 = type27.getSort();
        java.lang.String str30 = type27.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter31 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier32 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier32.newValue(type33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str36 = type35.toString();
        int int37 = type35.getSort();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type35, type38, type39 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray40);
        org.mockito.asm.tree.analysis.Value value42 = basicInterpreter31.newValue(type33);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean46 = type44.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier47 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier47.newValue(type48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean52 = type50.equals((java.lang.Object) 180);
        java.lang.String str53 = type50.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type33, type43, type44, type48, type50, type54 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray55);
        int int57 = type27.getSort();
        org.mockito.asm.tree.analysis.Value value58 = basicInterpreter0.newValue(type27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = type27.getInternalName();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int53 = type0.getOpcode(8192);
        java.lang.String str54 = type0.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException58 = new org.mockito.asm.tree.analysis.AnalyzerException("char");
        java.lang.Throwable[] throwableArray59 = analyzerException58.getSuppressed();
        java.lang.Throwable[] throwableArray60 = analyzerException58.getSuppressed();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException61 = new org.mockito.asm.tree.analysis.AnalyzerException("Lorg/mockito/asm/tree/analysis/BasicValue;", (java.lang.Throwable) analyzerException58);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException62 = new org.mockito.asm.tree.analysis.AnalyzerException("L(I)V;", (java.lang.Throwable) analyzerException58);
        boolean boolean63 = type0.equals((java.lang.Object) analyzerException62);
        boolean boolean65 = type0.equals((java.lang.Object) 130);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int66 = type0.getDimensions();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(VVI)I");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        int int9 = type0.getSize();
        int int10 = type0.getSize();
        int int11 = type0.getSort();
        boolean boolean13 = type0.equals((java.lang.Object) 6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type0.getDimensions();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 87);
        int int4 = type0.getSize();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (VVI)J: expected 123, but found J: expected C, but found J");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(I)V");
        int int3 = type2.getSize();
        int int4 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        int int8 = type5.getSort();
        java.lang.String str9 = type5.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass14 = type11.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value21 = basicVerifier19.newValue(type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.toString();
        int int24 = type22.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type22, type25, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray27);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value31 = basicVerifier29.newValue(type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str33 = type32.toString();
        int int34 = type32.getSort();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type32, type35, type36 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray37);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray37);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray37);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray37);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray37);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray37);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray37);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type46 = type0.getElementType();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier1.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.toString();
        int int6 = type4.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray9);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type2);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(I)V");
        boolean boolean14 = type2.equals((java.lang.Object) "(I)V");
        java.lang.String str15 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type2.getDimensions();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        java.lang.String str31 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type0.getElementType();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)V");
        boolean boolean3 = type1.equals((java.lang.Object) 88);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type5.getElementType();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(I)Z");
        int int4 = type2.getOpcode(83);
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type6 = type2.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type6.getElementType();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VVI)C");
        boolean boolean3 = type1.equals((java.lang.Object) 142);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        int int3 = type1.getOpcode(177);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        java.lang.String str5 = type0.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("C");
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getInternalName();
        java.lang.String str10 = type7.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str12 = type11.toString();
        int int13 = type11.getSort();
        java.lang.String str14 = type11.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter15 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier16 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier16.newValue(type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str20 = type19.toString();
        int int21 = type19.getSort();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type22, type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray24);
        org.mockito.asm.tree.analysis.Value value26 = basicInterpreter15.newValue(type17);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean30 = type28.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier31.newValue(type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) 180);
        java.lang.String str37 = type34.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type17, type27, type28, type32, type34, type38 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray39);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray39);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int43 = type0.getDimensions();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        java.lang.String str13 = type6.getDescriptor();
        int int15 = type6.getOpcode(118);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type6.getInternalName();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter10 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier11 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier11.newValue(type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str15 = type14.toString();
        int int16 = type14.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray19);
        org.mockito.asm.tree.analysis.Value value21 = basicInterpreter10.newValue(type12);
        boolean boolean22 = type1.equals((java.lang.Object) basicInterpreter10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        java.lang.String str27 = type23.getDescriptor();
        int int28 = type23.getSize();
        java.lang.String str29 = type23.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicInterpreter10.newValue(type23);
        int int31 = type23.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type23.getInternalName();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        java.lang.String str4 = type1.getClassName();
        int int5 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(108);
        java.lang.String str5 = type0.toString();
        java.lang.String str6 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        int int32 = type0.getOpcode(129);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int33 = type0.getDimensions();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray4);
        int int6 = type1.getSort();
        java.lang.String str7 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass9 = type6.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier14.newValue(type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.toString();
        int int19 = type17.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type17, type20, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray22);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier24 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier24.newValue(type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str28 = type27.toString();
        int int29 = type27.getSort();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type27, type30, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray32);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray32);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray32);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray32);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type39 = type0.getElementType();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VVI)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray18);
        int int22 = type1.getOpcode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type1.getElementType();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(108);
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: L(I)V;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        java.lang.String str13 = type6.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type6.getInternalName();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(VVI)I");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        int int9 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type0.getElementType();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray18);
        int int22 = type1.getOpcode((int) 'a');
        java.lang.String str23 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type1.getInternalName();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (JDCJCI)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type1.getInternalName();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        java.lang.String str7 = type1.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray11);
        java.lang.Class<?> wildcardClass13 = type8.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        int int16 = type14.getOpcode(141);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray21 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type1.getInternalName();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: L(I)V;");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        int int8 = type1.getOpcode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type1.getElementType();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int52 = type0.getDimensions();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter9 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        org.mockito.asm.tree.analysis.Value value20 = basicInterpreter9.newValue(type11);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier25.newValue(type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean30 = type28.equals((java.lang.Object) 180);
        java.lang.String str31 = type28.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type11, type21, type22, type26, type28, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray33);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier35 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value37 = basicVerifier35.newValue(type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str39 = type38.toString();
        int int40 = type38.getSort();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type38, type41, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray43);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value47 = basicVerifier45.newValue(type46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str49 = type48.toString();
        int int50 = type48.getSort();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type48, type51, type52 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray53);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray53);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray53);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray53);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray53);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int60 = type1.getDimensions();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray11);
        java.lang.String str14 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type1.getInternalName();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter9 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        org.mockito.asm.tree.analysis.Value value20 = basicInterpreter9.newValue(type11);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier25.newValue(type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean30 = type28.equals((java.lang.Object) 180);
        java.lang.String str31 = type28.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type11, type21, type22, type26, type28, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray33);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier35 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value37 = basicVerifier35.newValue(type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str39 = type38.toString();
        int int40 = type38.getSort();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type38, type41, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray43);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value47 = basicVerifier45.newValue(type46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str49 = type48.toString();
        int int50 = type48.getSort();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type48, type51, type52 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray53);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray53);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray53);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray53);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray53);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray53);
        int int60 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type61 = type1.getElementType();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        int int6 = type0.getOpcode(130);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass4 = type1.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier9.newValue(type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str13 = type12.toString();
        int int14 = type12.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type12, type15, type16 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray17);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value21 = basicVerifier19.newValue(type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.toString();
        int int24 = type22.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type22, type25, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray27);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray27);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray27);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray27);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type0.getElementType();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int52 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type53 = type0.getElementType();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter1 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type5, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray10);
        org.mockito.asm.tree.analysis.Value value12 = basicInterpreter1.newValue(type3);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        int int16 = value15.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException17 = new org.mockito.asm.tree.analysis.AnalyzerException("C", (java.lang.Object) basicInterpreter1, value15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        int int21 = type20.getSort();
        int int22 = type20.getSize();
        int int23 = type20.getDimensions();
        org.mockito.asm.tree.analysis.Value value24 = basicInterpreter1.newValue(type20);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) 180);
        java.lang.String str28 = type25.toString();
        org.mockito.asm.tree.analysis.Value value29 = basicInterpreter1.newValue(type25);
        boolean boolean31 = type25.equals((java.lang.Object) 119);
        int int32 = type25.getSort();
        int int33 = type25.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = type25.getInternalName();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        int int31 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type0.getDimensions();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] { type2 };
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)V");
        boolean boolean3 = type1.equals((java.lang.Object) 88);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = type1.getElementType();
        int int6 = type5.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type5.getInternalName();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int31 = type0.getOpcode(148);
        int int33 = type0.getOpcode(180);
        int int34 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = type0.getInternalName();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        int int10 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type1.getInternalName();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] { type2 };
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        int int6 = type0.getOpcode(80);
        java.lang.String str7 = type0.getClassName();
        java.lang.String str8 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        java.lang.String str52 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int53 = type0.getDimensions();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter10 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier11 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier11.newValue(type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str15 = type14.toString();
        int int16 = type14.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray19);
        org.mockito.asm.tree.analysis.Value value21 = basicInterpreter10.newValue(type12);
        boolean boolean22 = type1.equals((java.lang.Object) basicInterpreter10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str24 = type23.toString();
        int int25 = type23.getSort();
        java.lang.String str26 = type23.getClassName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str29 = type28.toString();
        int int30 = type28.getSort();
        java.lang.String str31 = type28.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter32 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier33 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier33.newValue(type34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str37 = type36.toString();
        int int38 = type36.getSort();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type36, type39, type40 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray41);
        org.mockito.asm.tree.analysis.Value value43 = basicInterpreter32.newValue(type34);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean47 = type45.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier48 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value50 = basicVerifier48.newValue(type49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean53 = type51.equals((java.lang.Object) 180);
        java.lang.String str54 = type51.toString();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type34, type44, type45, type49, type51, type55 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray56);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier58 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier58.newValue(type59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str62 = type61.toString();
        int int63 = type61.getSort();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type61, type64, type65 };
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type59, typeArray66);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier68 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value70 = basicVerifier68.newValue(type69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str72 = type71.toString();
        int int73 = type71.getSort();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray76 = new org.mockito.asm.Type[] { type71, type74, type75 };
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray76);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type59, typeArray76);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray76);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray76);
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray76);
        java.lang.String str82 = type23.toString();
        org.mockito.asm.tree.analysis.Value value83 = basicInterpreter10.newValue(type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int84 = type23.getDimensions();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        int int31 = type0.getSort();
        java.lang.String str32 = type0.toString();
        java.lang.String str33 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = type0.getInternalName();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray18);
        int int22 = type1.getOpcode((int) 'a');
        java.lang.String str23 = type1.getClassName();
        int int24 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type1.getElementType();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(108);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        boolean boolean12 = type0.equals((java.lang.Object) wildcardClass6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type0.getInternalName();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("VVI)Lorg/mockito/asm/Type");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter1 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type5, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray10);
        org.mockito.asm.tree.analysis.Value value12 = basicInterpreter1.newValue(type3);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        int int16 = value15.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException17 = new org.mockito.asm.tree.analysis.AnalyzerException("C", (java.lang.Object) basicInterpreter1, value15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        int int21 = type20.getSort();
        int int22 = type20.getSize();
        int int23 = type20.getDimensions();
        org.mockito.asm.tree.analysis.Value value24 = basicInterpreter1.newValue(type20);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) 180);
        java.lang.String str28 = type25.toString();
        org.mockito.asm.tree.analysis.Value value29 = basicInterpreter1.newValue(type25);
        boolean boolean31 = type25.equals((java.lang.Object) 119);
        java.lang.String str32 = type25.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type25.getElementType();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int31 = type0.getOpcode(148);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        java.lang.String str36 = type33.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter37 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier38 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value40 = basicVerifier38.newValue(type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str42 = type41.toString();
        int int43 = type41.getSort();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type41, type44, type45 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray46);
        org.mockito.asm.tree.analysis.Value value48 = basicInterpreter37.newValue(type39);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean52 = type50.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier53 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier53.newValue(type54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean58 = type56.equals((java.lang.Object) 180);
        java.lang.String str59 = type56.toString();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type39, type49, type50, type54, type56, type60 };
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray61);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier63 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value65 = basicVerifier63.newValue(type64);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str67 = type66.toString();
        int int68 = type66.getSort();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type66, type69, type70 };
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type64, typeArray71);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier73 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value75 = basicVerifier73.newValue(type74);
        org.mockito.asm.Type type76 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str77 = type76.toString();
        int int78 = type76.getSort();
        org.mockito.asm.Type type79 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type80 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray81 = new org.mockito.asm.Type[] { type76, type79, type80 };
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type74, typeArray81);
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type64, typeArray81);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray81);
        java.lang.String str85 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray81);
        java.lang.String str86 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type87 = type0.getElementType();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter1 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type5, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray10);
        org.mockito.asm.tree.analysis.Value value12 = basicInterpreter1.newValue(type3);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        int int16 = value15.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException17 = new org.mockito.asm.tree.analysis.AnalyzerException("C", (java.lang.Object) basicInterpreter1, value15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        int int21 = type20.getSort();
        int int22 = type20.getSize();
        int int23 = type20.getDimensions();
        org.mockito.asm.tree.analysis.Value value24 = basicInterpreter1.newValue(type20);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) 180);
        java.lang.String str28 = type25.toString();
        org.mockito.asm.tree.analysis.Value value29 = basicInterpreter1.newValue(type25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type25.getDimensions();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        java.lang.String str6 = type3.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter7 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier8.newValue(type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str12 = type11.toString();
        int int13 = type11.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type11, type14, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray16);
        org.mockito.asm.tree.analysis.Value value18 = basicInterpreter7.newValue(type9);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier23 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value25 = basicVerifier23.newValue(type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) 180);
        java.lang.String str29 = type26.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type9, type19, type20, type24, type26, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray31);
        int int33 = type3.getSort();
        int int34 = type3.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type[] typeArray39 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray39);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray39);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray39);
        java.lang.String str43 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = type0.getInternalName();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        int int6 = type0.getOpcode(130);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier4.newValue(type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.toString();
        int int9 = type7.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        java.lang.String str15 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type1.getInternalName();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 87);
        int int5 = type0.getOpcode(118);
        int int6 = type0.getSize();
        java.lang.String str7 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int5 = type0.getOpcode(194);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        int int7 = type1.getSort();
        int int8 = type1.getSort();
        int int10 = type1.getOpcode(171);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type1.getDimensions();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        int int32 = type0.getOpcode(129);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type0.getInternalName();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException11 = new org.mockito.asm.tree.analysis.AnalyzerException("V", (java.lang.Object) ' ', value10);
        int int12 = value10.getSize();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter14 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier17.newValue(type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str21 = type20.toString();
        int int22 = type20.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type20, type23, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray25);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value29 = basicVerifier27.newValue(type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str31 = type30.toString();
        int int32 = type30.getSort();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type30, type33, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray35);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray35);
        int int39 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter14.newValue(type15);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter41 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier44 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value46 = basicVerifier44.newValue(type45);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str48 = type47.toString();
        int int49 = type47.getSort();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type47, type50, type51 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray52);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier54 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value56 = basicVerifier54.newValue(type55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str58 = type57.toString();
        int int59 = type57.getSort();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type57, type60, type61 };
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray62);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray62);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray62);
        int int66 = type42.getSize();
        org.mockito.asm.tree.analysis.Value value67 = basicInterpreter41.newValue(type42);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException68 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Object) basicInterpreter14, value67);
        org.mockito.asm.tree.analysis.Value value69 = basicVerifier0.merge(value10, value67);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getType("V");
        org.mockito.asm.tree.analysis.Value value72 = basicVerifier0.newValue(type71);
        java.lang.String str73 = type71.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type74 = type71.getElementType();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.toString();
        int int6 = type0.getOpcode(172);
        int int7 = type0.getSize();
        java.lang.String str8 = type0.getClassName();
        java.lang.String str9 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        org.mockito.asm.Type[] typeArray6 = org.mockito.asm.Type.getArgumentTypes("(VVI)B");
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type5, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier12.newValue(type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.toString();
        int int17 = type15.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type15, type18, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        int int24 = type0.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str26 = type25.toString();
        int int27 = type25.getSort();
        java.lang.String str28 = type25.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter29 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter29.newValue(type31);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean44 = type42.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value47 = basicVerifier45.newValue(type46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean50 = type48.equals((java.lang.Object) 180);
        java.lang.String str51 = type48.toString();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type31, type41, type42, type46, type48, type52 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray53);
        int int55 = type25.getSort();
        int int56 = type25.getSort();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str59 = type58.getClassName();
        org.mockito.asm.Type[] typeArray61 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray61);
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray61);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray61);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass66 = type65.getClass();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        java.lang.String str68 = type67.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier69 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value71 = basicVerifier69.newValue(type70);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str73 = type72.toString();
        int int74 = type72.getSort();
        org.mockito.asm.Type type75 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray77 = new org.mockito.asm.Type[] { type72, type75, type76 };
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type70, typeArray77);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type67, typeArray77);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int81 = type0.getDimensions();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        int int7 = type1.getSort();
        int int9 = type1.getOpcode(191);
        java.lang.String str10 = type1.getDescriptor();
        int int12 = type1.getOpcode(101);
        java.lang.String str13 = type1.toString();
        int int15 = type1.getOpcode(178);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type1.getElementType();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        int int7 = type1.getSort();
        int int9 = type1.getOpcode(191);
        java.lang.String str10 = type1.getDescriptor();
        int int11 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type1.getElementType();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int52 = type0.getSort();
        java.lang.String str53 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier54 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value56 = basicVerifier54.newValue(type55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str58 = type57.toString();
        int int59 = type57.getSort();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type57, type60, type61 };
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray62);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier64 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value66 = basicVerifier64.newValue(type65);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str68 = type67.toString();
        int int69 = type67.getSort();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] { type67, type70, type71 };
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray72);
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray72);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int76 = type0.getDimensions();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)V");
        boolean boolean3 = type1.equals((java.lang.Object) 88);
        java.lang.String str4 = type1.toString();
        boolean boolean6 = type1.equals((java.lang.Object) 0);
        org.mockito.asm.Type type7 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type7.getElementType();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        boolean boolean5 = type0.equals((java.lang.Object) 166);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int5 = type0.getOpcode(194);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int52 = type0.getSort();
        java.lang.String str53 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier54 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value56 = basicVerifier54.newValue(type55);
        int int57 = type55.getSize();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier58 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier58.newValue(type59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str62 = type61.toString();
        int int63 = type61.getSort();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type61, type64, type65 };
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type59, typeArray66);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier68 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value70 = basicVerifier68.newValue(type69);
        int int71 = type69.getSort();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier72 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value74 = basicVerifier72.newValue(type73);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str76 = type75.toString();
        int int77 = type75.getSort();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray80 = new org.mockito.asm.Type[] { type75, type78, type79 };
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type73, typeArray80);
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray80);
        boolean boolean83 = type59.equals((java.lang.Object) typeArray80);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray80);
        boolean boolean85 = type0.equals((java.lang.Object) str84);
        java.lang.String str86 = type0.getDescriptor();
        java.lang.String str87 = type0.getDescriptor();
        java.lang.String str88 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int89 = type0.getDimensions();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(8192);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier0.newValue(type13);
        org.mockito.asm.Type[] typeArray17 = org.mockito.asm.Type.getArgumentTypes("(I)LC;");
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type13.getElementType();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VVI)B");
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        java.lang.String str52 = type0.getClassName();
        int int54 = type0.getOpcode(1024);
        java.lang.String str55 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int56 = type0.getDimensions();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(VVI)I");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        int int9 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type0.getInternalName();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray4);
        int int6 = type1.getSort();
        java.lang.String str7 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        int int7 = type1.getSort();
        java.lang.String str8 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type1.getElementType();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        int int7 = type1.getSort();
        int int9 = type1.getOpcode(191);
        java.lang.String str10 = type1.getDescriptor();
        int int12 = type1.getOpcode(101);
        java.lang.String str13 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type1.getInternalName();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.toString();
        int int6 = type4.getSort();
        int int7 = type4.getSort();
        java.lang.String str8 = type4.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass13 = type10.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier18 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier18.newValue(type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str22 = type21.toString();
        int int23 = type21.getSort();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type21, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier28 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier28.newValue(type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str32 = type31.toString();
        int int33 = type31.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type31, type34, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray36);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray36);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray36);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray36);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray36);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray36);
        java.lang.String str44 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = type1.getInternalName();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter10 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier11 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier11.newValue(type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str15 = type14.toString();
        int int16 = type14.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray19);
        org.mockito.asm.tree.analysis.Value value21 = basicInterpreter10.newValue(type12);
        boolean boolean22 = type1.equals((java.lang.Object) basicInterpreter10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        java.lang.String str27 = type23.getDescriptor();
        int int28 = type23.getSize();
        java.lang.String str29 = type23.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicInterpreter10.newValue(type23);
        int int31 = type23.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type23.getDimensions();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        int int4 = type1.getSize();
        java.lang.String str5 = type1.getClassName();
        java.lang.String str6 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(I)Z");
        int int4 = type2.getOpcode(83);
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type6 = type2.getElementType();
        java.lang.String str7 = type6.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type6.getDimensions();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType("(VVI)Lorg/mockito/asm/Type;");
        java.lang.String str5 = type4.getInternalName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray9);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type0.getDimensions();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        java.lang.String str4 = type1.getClassName();
        int int5 = type1.getSort();
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (VVI)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        int int3 = type1.getOpcode(177);
        int int5 = type1.getOpcode(95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I)Lchar");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int52 = type0.getSort();
        java.lang.String str53 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier54 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value56 = basicVerifier54.newValue(type55);
        int int57 = type55.getSize();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier58 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier58.newValue(type59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str62 = type61.toString();
        int int63 = type61.getSort();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type61, type64, type65 };
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type59, typeArray66);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier68 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value70 = basicVerifier68.newValue(type69);
        int int71 = type69.getSort();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier72 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value74 = basicVerifier72.newValue(type73);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str76 = type75.toString();
        int int77 = type75.getSort();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray80 = new org.mockito.asm.Type[] { type75, type78, type79 };
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type73, typeArray80);
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray80);
        boolean boolean83 = type59.equals((java.lang.Object) typeArray80);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray80);
        boolean boolean85 = type0.equals((java.lang.Object) str84);
        java.lang.String str86 = type0.getDescriptor();
        java.lang.String str87 = type0.getDescriptor();
        java.lang.String str88 = type0.getDescriptor();
        java.lang.String str89 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type90 = type0.getElementType();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSize();
        java.lang.String str5 = type0.getClassName();
        int int7 = type0.getOpcode(23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.toString();
        int int6 = type4.getSort();
        int int7 = type4.getSort();
        java.lang.String str8 = type4.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass13 = type10.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier18 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier18.newValue(type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str22 = type21.toString();
        int int23 = type21.getSort();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type21, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier28 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier28.newValue(type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str32 = type31.toString();
        int int33 = type31.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type31, type34, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray36);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray36);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray36);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray36);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray36);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray36);
        java.lang.String str44 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type45 = type1.getElementType();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        java.lang.String str52 = type0.getClassName();
        int int54 = type0.getOpcode(1024);
        java.lang.String str55 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type56 = type0.getElementType();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass9 = type6.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier14.newValue(type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.toString();
        int int19 = type17.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type17, type20, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray22);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier24 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier24.newValue(type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str28 = type27.toString();
        int int29 = type27.getSort();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type27, type30, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray32);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray32);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray32);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray32);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray32);
        int int39 = type0.getSize();
        int int40 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = type0.getInternalName();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(VVI)Z;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier1.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.toString();
        int int6 = type4.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray9);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type2);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(I)V");
        boolean boolean14 = type2.equals((java.lang.Object) "(I)V");
        int int16 = type2.getOpcode(172);
        java.lang.String str17 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type2.getElementType();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(108);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        boolean boolean12 = type0.equals((java.lang.Object) wildcardClass6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        int int16 = type14.getSort();
        boolean boolean18 = type14.equals((java.lang.Object) (-1.0d));
        int int19 = type14.getSort();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type[] typeArray24 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray24);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray24);
        int int29 = type0.getOpcode(11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type0.getDimensions();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 87);
        int int5 = type0.getOpcode(118);
        int int7 = type0.getOpcode(39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(VVI)Z;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VVI)B");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        int int5 = type0.getOpcode(7);
        int int6 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        int int13 = type6.getSort();
        java.lang.String str14 = type6.getClassName();
        java.lang.String str15 = type6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type6.getDimensions();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type5, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier12.newValue(type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.toString();
        int int17 = type15.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type15, type18, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type0.getDimensions();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        int int31 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type0.getInternalName();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter10 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier11 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier11.newValue(type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str15 = type14.toString();
        int int16 = type14.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray19);
        org.mockito.asm.tree.analysis.Value value21 = basicInterpreter10.newValue(type12);
        boolean boolean22 = type1.equals((java.lang.Object) basicInterpreter10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        java.lang.String str27 = type23.getDescriptor();
        int int28 = type23.getSize();
        java.lang.String str29 = type23.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicInterpreter10.newValue(type23);
        java.lang.String str31 = type23.getDescriptor();
        org.mockito.asm.Type[] typeArray33 = org.mockito.asm.Type.getArgumentTypes("(I)Lorg/mockito/asm/tree/analysis/BasicValue;");
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = type23.getElementType();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        int int31 = type0.getSort();
        java.lang.String str32 = type0.toString();
        java.lang.String str33 = type0.getDescriptor();
        int int35 = type0.getOpcode(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int36 = type0.getDimensions();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        int int10 = type1.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getDescriptor();
        boolean boolean14 = type1.equals((java.lang.Object) type11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type11.getInternalName();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        int int5 = type0.getOpcode(90);
        int int6 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.toString();
        int int6 = type0.getOpcode(172);
        int int7 = type0.getSize();
        java.lang.String str8 = type0.getClassName();
        java.lang.String str9 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type0.getInternalName();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        int int7 = type1.getSort();
        java.lang.String str8 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VVI)V");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("VVI)L(I)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        java.lang.String str52 = type0.getClassName();
        int int53 = type0.getSort();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter54 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier55 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value57 = basicVerifier55.newValue(type56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str59 = type58.toString();
        int int60 = type58.getSort();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type58, type61, type62 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray63);
        org.mockito.asm.tree.analysis.Value value65 = basicInterpreter54.newValue(type56);
        int int66 = value65.getSize();
        int int67 = value65.getSize();
        boolean boolean68 = type0.equals((java.lang.Object) value65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str69 = type0.getInternalName();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        int int5 = type0.getOpcode(90);
        int int6 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier3 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier3.newValue(type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str7 = type6.toString();
        int int8 = type6.getSort();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type6, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray11);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.toString();
        int int18 = type16.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type16, type19, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray21);
        int int25 = type1.getSize();
        org.mockito.asm.tree.analysis.Value value26 = basicInterpreter0.newValue(type1);
        java.lang.String str27 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = type1.getDimensions();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray4);
        int int6 = type1.getSort();
        int int8 = type1.getOpcode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type1.getElementType();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int52 = type0.getSort();
        java.lang.String str53 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier54 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value56 = basicVerifier54.newValue(type55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str58 = type57.toString();
        int int59 = type57.getSort();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type57, type60, type61 };
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray62);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier64 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value66 = basicVerifier64.newValue(type65);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str68 = type67.toString();
        int int69 = type67.getSort();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] { type67, type70, type71 };
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray72);
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray72);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray72);
        int int76 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str77 = type0.getInternalName();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)C");
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        int int31 = type0.getSort();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type[] typeArray36 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type39 = type0.getElementType();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(VVI)I");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        int int9 = type0.getSize();
        int int10 = type0.getSize();
        int int11 = type0.getSort();
        int int13 = type0.getOpcode(158);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type0.getDimensions();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSize();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 87);
        int int4 = type0.getSize();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int53 = type0.getOpcode(8192);
        java.lang.String str54 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int55 = type0.getDimensions();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type2 = type1.getElementType();
        java.lang.String str3 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type2.getInternalName();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        java.lang.String str13 = type6.getDescriptor();
        int int15 = type6.getOpcode(118);
        java.lang.String str16 = type6.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type6.getElementType();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("S");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        java.lang.String str31 = type0.toString();
        int int32 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int33 = type0.getDimensions();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier0.newValue(type13);
        int int16 = type13.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type13.getInternalName();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JDCJCI)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(108);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        boolean boolean12 = type0.equals((java.lang.Object) wildcardClass6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        int int16 = type14.getSort();
        boolean boolean18 = type14.equals((java.lang.Object) (-1.0d));
        int int19 = type14.getSort();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type[] typeArray24 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray24);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray24);
        int int29 = type0.getOpcode(11);
        int int31 = type0.getOpcode(157);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type0.getElementType();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSort();
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        boolean boolean7 = type1.equals((java.lang.Object) 101);
        int int8 = type1.getSort();
        java.lang.String str9 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type1.getInternalName();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (I)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 87);
        int int5 = type0.getOpcode(118);
        int int6 = type0.getSize();
        java.lang.String str7 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(108);
        java.lang.String str5 = type0.toString();
        int int7 = type0.getOpcode(131072);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (VVI)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int31 = type0.getOpcode(148);
        int int33 = type0.getOpcode(180);
        int int34 = type0.getSize();
        int int36 = type0.getOpcode(11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type37 = type0.getElementType();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        java.lang.String str6 = type0.getDescriptor();
        int int8 = type0.getOpcode(80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type0.getDimensions();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        int int31 = type0.getSort();
        java.lang.String str32 = type0.toString();
        java.lang.String str33 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = type0.getInternalName();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier4.newValue(type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.toString();
        int int9 = type7.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type1.getElementType();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getClassName();
        int int8 = type0.getOpcode(154);
        org.mockito.asm.Type[] typeArray10 = org.mockito.asm.Type.getArgumentTypes("(VVI)[Lorg/mockito/asm/Type;");
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(VVI)I");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        int int9 = type0.getSize();
        int int10 = type0.getSize();
        java.lang.String str11 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type0.getInternalName();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier1.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.toString();
        int int6 = type4.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray9);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type2);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(I)V");
        boolean boolean14 = type2.equals((java.lang.Object) "(I)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type2.getElementType();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (JDCJCI)V");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (I)J: expected V, but found .");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        java.lang.String str4 = type1.getClassName();
        int int5 = type1.getSort();
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        int int7 = type1.getSort();
        int int9 = type1.getOpcode(191);
        java.lang.String str10 = type1.getDescriptor();
        int int12 = type1.getOpcode(101);
        java.lang.String str13 = type1.toString();
        int int15 = type1.getOpcode(178);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type1.getDimensions();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray5);
        java.lang.Class<?> wildcardClass7 = type2.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        boolean boolean10 = type0.equals((java.lang.Object) wildcardClass7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass14 = type11.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        boolean boolean19 = type0.equals((java.lang.Object) str18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type0.getElementType();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VVI)B");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VVI)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(VVI)I");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        int int9 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        java.lang.String str13 = type6.getDescriptor();
        int int15 = type6.getOpcode(118);
        java.lang.String str16 = type6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type6.getElementType();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(108);
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        int int7 = type1.getSort();
        int int9 = type1.getOpcode(191);
        java.lang.String str10 = type1.getDescriptor();
        int int12 = type1.getOpcode(101);
        java.lang.String str13 = type1.toString();
        java.lang.String str14 = type1.toString();
        int int15 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type1.getDimensions();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier7 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value9 = basicVerifier7.newValue(type8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str11 = type10.toString();
        int int12 = type10.getSort();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type10, type13, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier17.newValue(type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str21 = type20.toString();
        int int22 = type20.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type20, type23, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray25);
        int int29 = type8.getOpcode((int) 'a');
        java.lang.String str30 = type8.getClassName();
        int int31 = type8.getSort();
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier0.newValue(type8);
        int int34 = type8.getOpcode(195);
        java.lang.String str35 = type8.toString();
        java.lang.String str36 = type8.getDescriptor();
        org.mockito.asm.Type[] typeArray38 = org.mockito.asm.Type.getArgumentTypes("(I)LLorg/mockito/asm/tree/analysis/AnalyzerException;;");
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int40 = type8.getDimensions();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        java.lang.String str52 = type0.getClassName();
        int int54 = type0.getOpcode(1024);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type55 = type0.getElementType();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("(I)V");
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.toString();
        int int9 = type7.getSort();
        java.lang.String str10 = type7.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter11 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier12.newValue(type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.toString();
        int int17 = type15.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type15, type18, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray20);
        org.mockito.asm.tree.analysis.Value value22 = basicInterpreter11.newValue(type13);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value29 = basicVerifier27.newValue(type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) 180);
        java.lang.String str33 = type30.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type13, type23, type24, type28, type30, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray35);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier37 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier37.newValue(type38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str41 = type40.toString();
        int int42 = type40.getSort();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type40, type43, type44 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray45);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier47 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier47.newValue(type48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str51 = type50.toString();
        int int52 = type50.getSort();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type50, type53, type54 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray55);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray55);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray55);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray55);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray55);
        int int62 = type1.getOpcode(521);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int63 = type1.getDimensions();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        int int3 = type1.getOpcode(197);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        int int5 = type0.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass9 = type6.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier14.newValue(type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.toString();
        int int19 = type17.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type17, type20, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray22);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier24 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier24.newValue(type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str28 = type27.toString();
        int int29 = type27.getSort();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type27, type30, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray32);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray32);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray32);
        org.mockito.asm.Type type37 = type10.getElementType();
        org.mockito.asm.Type type38 = type10.getElementType();
        java.lang.String str39 = type10.getInternalName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str41 = type40.toString();
        int int42 = type40.getSort();
        java.lang.String str43 = type40.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter44 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value47 = basicVerifier45.newValue(type46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str49 = type48.toString();
        int int50 = type48.getSort();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type48, type51, type52 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray53);
        org.mockito.asm.tree.analysis.Value value55 = basicInterpreter44.newValue(type46);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean59 = type57.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier60 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value62 = basicVerifier60.newValue(type61);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean65 = type63.equals((java.lang.Object) 180);
        java.lang.String str66 = type63.toString();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type46, type56, type57, type61, type63, type67 };
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray68);
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray68);
        int int71 = type10.getSort();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str74 = type73.getClassName();
        org.mockito.asm.Type[] typeArray76 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type73, typeArray76);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray76);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type80 = type0.getElementType();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)C");
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getClassName();
        int int5 = type1.getOpcode(177);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int30 = type0.getSort();
        int int32 = type0.getOpcode(129);
        int int33 = type0.getSort();
        org.mockito.asm.Type[] typeArray35 = org.mockito.asm.Type.getArgumentTypes("(I)Z");
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int37 = type0.getDimensions();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        int int4 = type1.getSize();
        java.lang.String str5 = type1.getClassName();
        int int6 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter9 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        org.mockito.asm.tree.analysis.Value value20 = basicInterpreter9.newValue(type11);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier25.newValue(type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean30 = type28.equals((java.lang.Object) 180);
        java.lang.String str31 = type28.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type11, type21, type22, type26, type28, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray33);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier35 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value37 = basicVerifier35.newValue(type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str39 = type38.toString();
        int int40 = type38.getSort();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type38, type41, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray43);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value47 = basicVerifier45.newValue(type46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str49 = type48.toString();
        int int50 = type48.getSort();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type48, type51, type52 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray53);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray53);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray53);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray53);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray53);
        java.lang.String str59 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str60 = type0.getInternalName();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L(JDCJCI)LC;;");
        org.mockito.asm.Type type2 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type2.getElementType();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier1.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.toString();
        int int6 = type4.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray9);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type2);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(I)V");
        boolean boolean14 = type2.equals((java.lang.Object) "(I)V");
        java.lang.String str15 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type2.getInternalName();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        int int5 = type0.getOpcode(7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        int int14 = type6.getOpcode(55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type6.getElementType();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 87);
        int int5 = type0.getOpcode(118);
        java.lang.String str6 = type0.getDescriptor();
        int int8 = type0.getOpcode(16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        int int3 = type1.getOpcode(27);
        java.lang.String str4 = type1.getClassName();
        int int6 = type1.getOpcode(102);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        boolean boolean7 = type1.equals((java.lang.Object) 101);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter8 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        java.lang.Class<?> wildcardClass9 = basicInterpreter8.getClass();
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str13 = type12.toString();
        int int14 = type12.getSort();
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.toString();
        int int19 = type17.getSort();
        java.lang.String str20 = type17.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter21 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier22 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier22.newValue(type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str26 = type25.toString();
        int int27 = type25.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type25, type28, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray30);
        org.mockito.asm.tree.analysis.Value value32 = basicInterpreter21.newValue(type23);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier37 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier37.newValue(type38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean42 = type40.equals((java.lang.Object) 180);
        java.lang.String str43 = type40.toString();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type23, type33, type34, type38, type40, type44 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray45);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier47 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier47.newValue(type48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str51 = type50.toString();
        int int52 = type50.getSort();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type50, type53, type54 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray55);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier57 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value59 = basicVerifier57.newValue(type58);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str61 = type60.toString();
        int int62 = type60.getSort();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type60, type63, type64 };
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray65);
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray65);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray65);
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray65);
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray65);
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray65);
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type73 = type1.getElementType();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray5);
        java.lang.Class<?> wildcardClass7 = type2.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        int int10 = type9.getSize();
        org.mockito.asm.Type type11 = type9.getElementType();
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray16);
        java.lang.Class<?> wildcardClass18 = type13.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = type19.getElementType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str22 = type21.toString();
        int int23 = type21.getSort();
        java.lang.String str24 = type21.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter25 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier26 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier26.newValue(type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str30 = type29.toString();
        int int31 = type29.getSort();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type29, type32, type33 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray34);
        org.mockito.asm.tree.analysis.Value value36 = basicInterpreter25.newValue(type27);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier41.newValue(type42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean46 = type44.equals((java.lang.Object) 180);
        java.lang.String str47 = type44.toString();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type27, type37, type38, type42, type44, type48 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray49);
        int int51 = type21.getSort();
        int int52 = type21.getSort();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str55 = type54.getClassName();
        org.mockito.asm.Type[] typeArray57 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray57);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray57);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray57);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray57);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray57);
        int int63 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str64 = type0.getInternalName();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray4);
        int int6 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getClassName();
        int int8 = type0.getOpcode(154);
        org.mockito.asm.Type[] typeArray10 = org.mockito.asm.Type.getArgumentTypes("(VVI)[Lorg/mockito/asm/Type;");
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type0.getInternalName();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        java.lang.String str7 = type1.getClassName();
        java.lang.String str8 = type1.toString();
        int int9 = type1.getSize();
        int int10 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type1.getElementType();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        java.lang.String str52 = type0.getClassName();
        int int53 = type0.getSort();
        java.lang.String str54 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = type0.getInternalName();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        java.lang.String str5 = type0.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("C");
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getInternalName();
        java.lang.String str10 = type7.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str12 = type11.toString();
        int int13 = type11.getSort();
        java.lang.String str14 = type11.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter15 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier16 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier16.newValue(type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str20 = type19.toString();
        int int21 = type19.getSort();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type22, type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray24);
        org.mockito.asm.tree.analysis.Value value26 = basicInterpreter15.newValue(type17);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean30 = type28.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier31.newValue(type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) 180);
        java.lang.String str37 = type34.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type17, type27, type28, type32, type34, type38 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray39);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray39);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray39);
        int int44 = type0.getOpcode(24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = type0.getInternalName();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int52 = type0.getSort();
        java.lang.String str53 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier54 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value56 = basicVerifier54.newValue(type55);
        int int57 = type55.getSize();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier58 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier58.newValue(type59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str62 = type61.toString();
        int int63 = type61.getSort();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type61, type64, type65 };
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type59, typeArray66);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier68 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value70 = basicVerifier68.newValue(type69);
        int int71 = type69.getSort();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier72 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value74 = basicVerifier72.newValue(type73);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str76 = type75.toString();
        int int77 = type75.getSort();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray80 = new org.mockito.asm.Type[] { type75, type78, type79 };
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type73, typeArray80);
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray80);
        boolean boolean83 = type59.equals((java.lang.Object) typeArray80);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray80);
        boolean boolean85 = type0.equals((java.lang.Object) str84);
        int int87 = type0.getOpcode(84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type88 = type0.getElementType();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)LC;");
        org.mockito.asm.Type type2 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type2.getElementType();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray18);
        int int22 = type1.getOpcode((int) 'a');
        java.lang.String str23 = type1.getDescriptor();
        java.lang.String str24 = type1.getClassName();
        int int25 = type1.getSort();
        int int26 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type1.getDimensions();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JDCJCI)C");
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(VVI)J");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray4);
        int int7 = type1.getOpcode(1029);
        org.mockito.asm.Type type8 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type8.getDimensions();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("JDCJCI)Lorg.mockito.asm.Type");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass9 = type6.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass16 = type13.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier21 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier21.newValue(type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str25 = type24.toString();
        int int26 = type24.getSort();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type24, type27, type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray29);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier31.newValue(type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str35 = type34.toString();
        int int36 = type34.getSort();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type34, type37, type38 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray39);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray39);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray39);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray39);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray39);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray39);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray39);
        java.lang.String str47 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type48 = type1.getElementType();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        java.lang.String str13 = type6.getDescriptor();
        java.lang.String str14 = type6.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type6.getDimensions();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        java.lang.String str6 = type3.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter7 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier8.newValue(type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str12 = type11.toString();
        int int13 = type11.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type11, type14, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray16);
        org.mockito.asm.tree.analysis.Value value18 = basicInterpreter7.newValue(type9);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier23 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value25 = basicVerifier23.newValue(type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) 180);
        java.lang.String str29 = type26.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type9, type19, type20, type24, type26, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray31);
        int int33 = type3.getSort();
        int int34 = type3.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type[] typeArray39 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray39);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray39);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type43 = type0.getElementType();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int5 = type0.getOpcode(194);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)V");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type5.getElementType();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        int int3 = type1.getOpcode(197);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(VVI)I");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        int int9 = type0.getSize();
        int int10 = type0.getSize();
        java.lang.String str11 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        int int7 = type1.getSort();
        int int9 = type1.getOpcode(191);
        int int10 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type1.getElementType();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        java.lang.String str13 = type6.getDescriptor();
        java.lang.String str14 = type6.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type6.getInternalName();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)B");
        int int3 = type1.getOpcode(177);
        java.lang.String str4 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.toString();
        int int3 = type0.getOpcode(103);
        int int5 = type0.getOpcode(16392);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode(138);
        int int4 = type0.getOpcode(185);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray4);
        int int6 = type1.getSort();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier7 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        java.lang.String str11 = type8.getDescriptor();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier7.newValue(type8);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) 180);
        java.lang.String str16 = type13.toString();
        java.lang.String str17 = type13.getDescriptor();
        int int18 = type13.getSort();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier7.newValue(type13);
        java.lang.String str20 = type13.getDescriptor();
        boolean boolean21 = type1.equals((java.lang.Object) type13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type1.getDimensions();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        int int6 = type0.getOpcode(160);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        int int3 = type1.getOpcode(27);
        java.lang.String str4 = type1.getClassName();
        int int6 = type1.getOpcode(102);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: (VVI)L(I)Z;: expected class org.mockito.asm.Type, but found I");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass5 = type2.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str24 = type23.toString();
        int int25 = type23.getSort();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type23, type26, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray28);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray28);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray28);
        org.mockito.asm.Type type33 = type6.getElementType();
        org.mockito.asm.Type type34 = type6.getElementType();
        java.lang.String str35 = type6.getInternalName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str37 = type36.toString();
        int int38 = type36.getSort();
        java.lang.String str39 = type36.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter40 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier41.newValue(type42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str45 = type44.toString();
        int int46 = type44.getSort();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type44, type47, type48 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray49);
        org.mockito.asm.tree.analysis.Value value51 = basicInterpreter40.newValue(type42);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean55 = type53.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier56 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value58 = basicVerifier56.newValue(type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean61 = type59.equals((java.lang.Object) 180);
        java.lang.String str62 = type59.toString();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type42, type52, type53, type57, type59, type63 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray64);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray64);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier67 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value69 = basicVerifier67.newValue(type68);
        int int70 = type68.getSort();
        java.lang.String str71 = type68.getDescriptor();
        int int72 = type68.getSize();
        java.lang.String str73 = type68.toString();
        boolean boolean74 = type6.equals((java.lang.Object) type68);
        boolean boolean75 = type1.equals((java.lang.Object) type68);
        org.mockito.asm.Type type77 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: (I)Lorg/mockito/asm/tree/analysis/BasicValue;: expected null, but found I");
        boolean boolean78 = type68.equals((java.lang.Object) "org.mockito.asm.tree.analysis.AnalyzerException: (I)Lorg/mockito/asm/tree/analysis/BasicValue;: expected null, but found I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int79 = type68.getDimensions();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier3 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier3.newValue(type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str7 = type6.toString();
        int int8 = type6.getSort();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type6, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray11);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.toString();
        int int18 = type16.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type16, type19, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray21);
        int int25 = type1.getSize();
        org.mockito.asm.tree.analysis.Value value26 = basicInterpreter0.newValue(type1);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str28 = type27.toString();
        int int29 = type27.getSort();
        java.lang.String str30 = type27.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter31 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier32 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier32.newValue(type33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str36 = type35.toString();
        int int37 = type35.getSort();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type35, type38, type39 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray40);
        org.mockito.asm.tree.analysis.Value value42 = basicInterpreter31.newValue(type33);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean46 = type44.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier47 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier47.newValue(type48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean52 = type50.equals((java.lang.Object) 180);
        java.lang.String str53 = type50.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type33, type43, type44, type48, type50, type54 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray55);
        int int57 = type27.getSort();
        org.mockito.asm.tree.analysis.Value value58 = basicInterpreter0.newValue(type27);
        java.lang.String str59 = type27.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str60 = type27.getInternalName();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier0.newValue(type13);
        int int16 = type13.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        int int21 = type19.getOpcode(90);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException24 = new org.mockito.asm.tree.analysis.AnalyzerException("org/mockito/asm/tree/analysis/BasicValue");
        java.lang.Throwable[] throwableArray25 = analyzerException24.getSuppressed();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException26 = new org.mockito.asm.tree.analysis.AnalyzerException("LVVI)L(I)V;", (java.lang.Throwable) analyzerException24);
        boolean boolean27 = type19.equals((java.lang.Object) analyzerException26);
        boolean boolean28 = type13.equals((java.lang.Object) boolean27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type13.getInternalName();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(VVI)Lrg.mockito.asm.tree.analysis.AnalyzerException: Lorg/mockito/asm/tree/analysis/AnalyzerException;");
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VVI)V");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier30.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray48);
        int int52 = type0.getSort();
        java.lang.String str53 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier54 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value56 = basicVerifier54.newValue(type55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str58 = type57.toString();
        int int59 = type57.getSort();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type57, type60, type61 };
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray62);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier64 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value66 = basicVerifier64.newValue(type65);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str68 = type67.toString();
        int int69 = type67.getSort();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] { type67, type70, type71 };
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray72);
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray72);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str76 = type0.getInternalName();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray11);
        int int14 = type1.getSize();
        int int15 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type1.getDimensions();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        boolean boolean4 = type0.equals((java.lang.Object) 169);
        int int5 = type0.getSort();
        java.lang.String str6 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("(I)Z");
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier0.newValue(type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.toString();
        int int11 = type9.getSort();
        java.lang.String str12 = type9.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter13 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier14.newValue(type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.toString();
        int int19 = type17.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type17, type20, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray22);
        org.mockito.asm.tree.analysis.Value value24 = basicInterpreter13.newValue(type15);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value31 = basicVerifier29.newValue(type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean34 = type32.equals((java.lang.Object) 180);
        java.lang.String str35 = type32.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type15, type25, type26, type30, type32, type36 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray37);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier39 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value41 = basicVerifier39.newValue(type40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str43 = type42.toString();
        int int44 = type42.getSort();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type42, type45, type46 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray47);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier49 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value51 = basicVerifier49.newValue(type50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str53 = type52.toString();
        int int54 = type52.getSort();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type52, type55, type56 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray57);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray57);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray57);
        int int61 = type9.getSort();
        org.mockito.asm.tree.analysis.Value value62 = basicVerifier0.newValue(type9);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getType("L(I)V;");
        java.lang.String str65 = type64.getClassName();
        java.lang.Class<?> wildcardClass66 = type64.getClass();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        org.mockito.asm.tree.analysis.Value value68 = basicVerifier0.newValue(type67);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier69 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str71 = type70.toString();
        int int72 = type70.getSort();
        java.lang.String str73 = type70.getDescriptor();
        org.mockito.asm.tree.analysis.Value value74 = basicVerifier69.newValue(type70);
        boolean boolean76 = type70.equals((java.lang.Object) 101);
        int int77 = type70.getSort();
        java.lang.String str78 = type70.toString();
        org.mockito.asm.tree.analysis.Value value79 = basicVerifier0.newValue(type70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int80 = type70.getDimensions();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)V");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getInternalName();
        java.lang.String str4 = type1.getClassName();
        org.mockito.asm.Type type5 = type1.getElementType();
        java.lang.String str6 = type5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type5.getElementType();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VI)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean6 = type0.equals((java.lang.Object) "S");
        int int7 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VVI)B");
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter1 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type5, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray10);
        org.mockito.asm.tree.analysis.Value value12 = basicInterpreter1.newValue(type3);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        int int16 = value15.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException17 = new org.mockito.asm.tree.analysis.AnalyzerException("C", (java.lang.Object) basicInterpreter1, value15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        int int21 = type20.getSort();
        int int22 = type20.getSize();
        int int23 = type20.getDimensions();
        org.mockito.asm.tree.analysis.Value value24 = basicInterpreter1.newValue(type20);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) 180);
        java.lang.String str28 = type25.toString();
        org.mockito.asm.tree.analysis.Value value29 = basicInterpreter1.newValue(type25);
        boolean boolean31 = type25.equals((java.lang.Object) 119);
        int int32 = type25.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type25.getElementType();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)V");
        boolean boolean3 = type1.equals((java.lang.Object) 88);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = type1.getElementType();
        int int6 = type5.getSize();
        java.lang.String str7 = type5.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type5.getInternalName();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (VVI)C: expected 138, but found J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I)Lorg.mockito.asm.tree.analysis.BasicValue");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(VVI)I");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        int int9 = type0.getSize();
        int int10 = type0.getSize();
        int int11 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        int int10 = type1.getSize();
        int int12 = type1.getOpcode(159);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: (VVI)J");
        org.mockito.asm.Type[] typeArray16 = org.mockito.asm.Type.getArgumentTypes("(VVI)B");
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type1.getInternalName();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I)Lg/mockito/asm/Type");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getDescriptor();
        int int6 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        int int3 = type1.getOpcode(197);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)V");
        org.mockito.asm.Type type2 = type1.getElementType();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.asm.Type type4 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type4.getElementType();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)V");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getInternalName();
        java.lang.String str4 = type1.getClassName();
        org.mockito.asm.Type type5 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type5.getDimensions();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier1.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.toString();
        int int6 = type4.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray9);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type2);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(I)V");
        boolean boolean14 = type2.equals((java.lang.Object) "(I)V");
        int int16 = type2.getOpcode(172);
        int int18 = type2.getOpcode(167);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type2.getElementType();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type6 = type5.getElementType();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier0.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        boolean boolean11 = type8.equals((java.lang.Object) 87);
        int int12 = type8.getSize();
        int int13 = type8.getSort();
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(I)LC;");
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray15);
        org.mockito.asm.tree.analysis.Value value17 = basicVerifier0.newValue(type8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type8.getInternalName();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        java.lang.String str10 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type1.getInternalName();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] { type2 };
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        int int5 = type0.getSort();
        int int6 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        int int5 = type0.getOpcode(90);
        java.lang.String str6 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        int int7 = type1.getSort();
        int int9 = type1.getOpcode(191);
        java.lang.String str10 = type1.getDescriptor();
        int int12 = type1.getOpcode(101);
        java.lang.String str13 = type1.toString();
        java.lang.String str14 = type1.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        int int18 = type17.getDimensions();
        org.mockito.asm.Type type19 = type17.getElementType();
        int int21 = type19.getOpcode(156);
        int int22 = type19.getSort();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier26 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier26.newValue(type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str30 = type29.toString();
        int int31 = type29.getSort();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type29, type32, type33 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray34);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier36 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier36.newValue(type37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str40 = type39.toString();
        int int41 = type39.getSort();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type42, type43 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray44);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray44);
        int int48 = type24.getSize();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter50 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier51 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value53 = basicVerifier51.newValue(type52);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str55 = type54.toString();
        int int56 = type54.getSort();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type54, type57, type58 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray59);
        org.mockito.asm.tree.analysis.Value value61 = basicInterpreter50.newValue(type52);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier62 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value64 = basicVerifier62.newValue(type63);
        int int65 = value64.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException66 = new org.mockito.asm.tree.analysis.AnalyzerException("C", (java.lang.Object) basicInterpreter50, value64);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getObjectType("org/mockito/asm/tree/analysis/AnalyzerException");
        java.lang.Class<?> wildcardClass69 = type68.getClass();
        java.lang.String str70 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass69);
        org.mockito.asm.tree.analysis.Value value72 = basicInterpreter50.newValue(type71);
        int int73 = value72.getSize();
        int int74 = value72.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException75 = new org.mockito.asm.tree.analysis.AnalyzerException("L(VVI)Lorg/mockito/asm/Type;;", (java.lang.Object) type24, value72);
        org.mockito.asm.Type[] typeArray77 = org.mockito.asm.Type.getArgumentTypes("(I)B");
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray77);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray77);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str81 = type1.getInternalName();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier5.newValue(type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.toString();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type6, type16, type17, type21, type23, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int31 = type0.getOpcode(148);
        int int33 = type0.getOpcode(180);
        int int35 = type0.getOpcode(121);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type36 = type0.getElementType();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        int int10 = type1.getSize();
        int int12 = type1.getOpcode(159);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: (VVI)J");
        org.mockito.asm.Type[] typeArray16 = org.mockito.asm.Type.getArgumentTypes("(VVI)B");
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type1.getElementType();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray11);
        int int14 = type1.getSize();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.toString();
        int int18 = type16.getSort();
        java.lang.String str19 = type16.getDescriptor();
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier15.newValue(type16);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean23 = type21.equals((java.lang.Object) 180);
        java.lang.String str24 = type21.toString();
        java.lang.String str25 = type21.getDescriptor();
        int int26 = type21.getSort();
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier15.newValue(type21);
        int int28 = value27.getSize();
        boolean boolean29 = type1.equals((java.lang.Object) value27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type1.getInternalName();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray5);
        java.lang.Class<?> wildcardClass7 = type2.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        boolean boolean10 = type0.equals((java.lang.Object) wildcardClass7);
        java.lang.String str11 = type0.getDescriptor();
        java.lang.String str12 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type0.getInternalName();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        int int6 = type1.getSize();
        java.lang.String str7 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/tree/analysis/AnalyzerException;");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(I)B");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("(I)Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type8 = type7.getElementType();
        boolean boolean9 = type1.equals((java.lang.Object) type8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type8.getElementType();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter10 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier11 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier11.newValue(type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str15 = type14.toString();
        int int16 = type14.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray19);
        org.mockito.asm.tree.analysis.Value value21 = basicInterpreter10.newValue(type12);
        boolean boolean22 = type1.equals((java.lang.Object) basicInterpreter10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        java.lang.String str27 = type23.getDescriptor();
        int int28 = type23.getSize();
        java.lang.String str29 = type23.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicInterpreter10.newValue(type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = type23.getInternalName();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSize();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier4.newValue(type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.toString();
        int int9 = type7.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray12);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier14.newValue(type15);
        int int17 = type15.getSort();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier18 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier18.newValue(type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str22 = type21.toString();
        int int23 = type21.getSort();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type21, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        boolean boolean29 = type5.equals((java.lang.Object) typeArray26);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray26);
        java.lang.String str31 = type1.getClassName();
        java.lang.String str32 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type1.getElementType();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        int int4 = type1.getSort();
        int int5 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) (-1.0d));
        int int6 = type1.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray11);
        java.lang.String str14 = type1.getDescriptor();
        java.lang.String str15 = type1.toString();
        int int17 = type1.getOpcode(198);
        int int18 = type1.getSort();
        java.lang.String str19 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type1.getElementType();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(8192);
        java.lang.String str4 = type0.getDescriptor();
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        boolean boolean7 = type1.equals((java.lang.Object) 101);
        int int8 = type1.getSize();
        int int9 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type1.getInternalName();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        int int5 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(VVI)Lorg.mockito.asm.tree.analysis.BasicValue;");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException4 = new org.mockito.asm.tree.analysis.AnalyzerException("(VVI)Z");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException5 = new org.mockito.asm.tree.analysis.AnalyzerException("(VVI)L(I)V;", (java.lang.Throwable) analyzerException4);
        boolean boolean6 = type1.equals((java.lang.Object) analyzerException5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I)Lorg.mockito.asm.tree.analysis.BasicValue");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        int int3 = type1.getOpcode(177);
        int int5 = type1.getOpcode(95);
        java.lang.String str6 = type1.getClassName();
        java.lang.String str7 = type1.getDescriptor();
        java.lang.String str8 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type1.getInternalName();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter10 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier11 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier11.newValue(type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str15 = type14.toString();
        int int16 = type14.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray19);
        org.mockito.asm.tree.analysis.Value value21 = basicInterpreter10.newValue(type12);
        boolean boolean22 = type1.equals((java.lang.Object) basicInterpreter10);
        int int23 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type1.getDimensions();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        boolean boolean5 = type1.equals((java.lang.Object) 169);
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type1);
        int int7 = type1.getSort();
        int int9 = type1.getOpcode(191);
        java.lang.String str10 = type1.getDescriptor();
        java.lang.String str11 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type1.getElementType();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.getDescriptor();
        java.lang.String str5 = type1.getClassName();
        boolean boolean6 = type0.equals((java.lang.Object) str5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(I)V");
        int int9 = type8.getSize();
        int int10 = type8.getSize();
        int int11 = type8.getSort();
        java.lang.String str12 = type8.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        java.lang.String str16 = type13.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter17 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier18 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier18.newValue(type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str22 = type21.toString();
        int int23 = type21.getSort();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type21, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray26);
        org.mockito.asm.tree.analysis.Value value28 = basicInterpreter17.newValue(type19);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier33 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier33.newValue(type34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean38 = type36.equals((java.lang.Object) 180);
        java.lang.String str39 = type36.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type19, type29, type30, type34, type36, type40 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray41);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier43 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value45 = basicVerifier43.newValue(type44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str47 = type46.toString();
        int int48 = type46.getSort();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type46, type49, type50 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray51);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier53 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier53.newValue(type54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str57 = type56.toString();
        int int58 = type56.getSort();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type56, type59, type60 };
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray61);
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray61);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray61);
        int int65 = type13.getSort();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier66 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str68 = type67.toString();
        int int69 = type67.getSort();
        java.lang.String str70 = type67.getDescriptor();
        org.mockito.asm.tree.analysis.Value value71 = basicVerifier66.newValue(type67);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean74 = type72.equals((java.lang.Object) 180);
        java.lang.String str75 = type72.toString();
        java.lang.String str76 = type72.getDescriptor();
        int int77 = type72.getSort();
        org.mockito.asm.tree.analysis.Value value78 = basicVerifier66.newValue(type72);
        org.mockito.asm.Type type79 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int80 = type79.getSort();
        org.mockito.asm.tree.analysis.Value value81 = basicVerifier66.newValue(type79);
        org.mockito.asm.Type[] typeArray83 = org.mockito.asm.Type.getArgumentTypes("(I)LC;");
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type79, typeArray83);
        java.lang.String str85 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray83);
        java.lang.String str86 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray83);
        java.lang.String str87 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray83);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int88 = type0.getDimensions();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (I)V");
        int int2 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("VVI)L(I)V");
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        boolean boolean13 = type4.equals((java.lang.Object) wildcardClass7);
        int int14 = type4.getSize();
        boolean boolean15 = type1.equals((java.lang.Object) int14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type1.getDimensions();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter10 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier11 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier11.newValue(type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str15 = type14.toString();
        int int16 = type14.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray19);
        org.mockito.asm.tree.analysis.Value value21 = basicInterpreter10.newValue(type12);
        boolean boolean22 = type1.equals((java.lang.Object) basicInterpreter10);
        int int23 = type1.getSort();
        int int24 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type1.getElementType();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(I)V;");
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)V");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getInternalName();
        java.lang.String str4 = type1.getClassName();
        org.mockito.asm.Type type5 = type1.getElementType();
        java.lang.String str6 = type5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type5.getInternalName();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)V");
        boolean boolean3 = type1.equals((java.lang.Object) 88);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = type1.getElementType();
        int int7 = type5.getOpcode(114);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type5.getInternalName();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 180);
        java.lang.String str9 = type6.toString();
        java.lang.String str10 = type6.getDescriptor();
        int int11 = type6.getSort();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier0.newValue(type6);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier0.newValue(type13);
        int int16 = type13.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        int int21 = type19.getOpcode(90);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException24 = new org.mockito.asm.tree.analysis.AnalyzerException("org/mockito/asm/tree/analysis/BasicValue");
        java.lang.Throwable[] throwableArray25 = analyzerException24.getSuppressed();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException26 = new org.mockito.asm.tree.analysis.AnalyzerException("LVVI)L(I)V;", (java.lang.Throwable) analyzerException24);
        boolean boolean27 = type19.equals((java.lang.Object) analyzerException26);
        boolean boolean28 = type13.equals((java.lang.Object) boolean27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type13.getElementType();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (I)C");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: L(I)V;");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(VVI)I");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        int int9 = type0.getSize();
        int int10 = type0.getSize();
        int int11 = type0.getSort();
        boolean boolean13 = type0.equals((java.lang.Object) 6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type0.getInternalName();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VVI)V");
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(108);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        boolean boolean12 = type0.equals((java.lang.Object) wildcardClass6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier13.newValue(type14);
        int int16 = type14.getSort();
        boolean boolean18 = type14.equals((java.lang.Object) (-1.0d));
        int int19 = type14.getSort();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type[] typeArray24 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray24);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray24);
        int int29 = type0.getOpcode(11);
        int int31 = type0.getOpcode(157);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type0.getDimensions();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I)Lorg.mockito.asm.tree.analysis.BasicInterpreter");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: (VVI)L(I)Z;: expected class org.mockito.asm.Type, but found I");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass5 = type2.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str24 = type23.toString();
        int int25 = type23.getSort();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type23, type26, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray28);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray28);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray28);
        org.mockito.asm.Type type33 = type6.getElementType();
        org.mockito.asm.Type type34 = type6.getElementType();
        java.lang.String str35 = type6.getInternalName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str37 = type36.toString();
        int int38 = type36.getSort();
        java.lang.String str39 = type36.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter40 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier41.newValue(type42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str45 = type44.toString();
        int int46 = type44.getSort();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type44, type47, type48 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray49);
        org.mockito.asm.tree.analysis.Value value51 = basicInterpreter40.newValue(type42);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean55 = type53.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier56 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value58 = basicVerifier56.newValue(type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean61 = type59.equals((java.lang.Object) 180);
        java.lang.String str62 = type59.toString();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type42, type52, type53, type57, type59, type63 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray64);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray64);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier67 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value69 = basicVerifier67.newValue(type68);
        int int70 = type68.getSort();
        java.lang.String str71 = type68.getDescriptor();
        int int72 = type68.getSize();
        java.lang.String str73 = type68.toString();
        boolean boolean74 = type6.equals((java.lang.Object) type68);
        boolean boolean75 = type1.equals((java.lang.Object) type68);
        org.mockito.asm.Type type77 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: (I)Lorg/mockito/asm/tree/analysis/BasicValue;: expected null, but found I");
        boolean boolean78 = type68.equals((java.lang.Object) "org.mockito.asm.tree.analysis.AnalyzerException: (I)Lorg/mockito/asm/tree/analysis/BasicValue;: expected null, but found I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type79 = type68.getElementType();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 87);
        int int4 = type0.getSize();
        int int5 = type0.getSort();
        int int6 = type0.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("VVI)Lorg.mockito.asm.tree.analysis.AnalyzerException: (VVI)J");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type0.getInternalName();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.toString();
        int int6 = type0.getOpcode(172);
        java.lang.String str7 = type0.toString();
        int int9 = type0.getOpcode(133);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type0.getElementType();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter9 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        org.mockito.asm.tree.analysis.Value value20 = basicInterpreter9.newValue(type11);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier25.newValue(type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean30 = type28.equals((java.lang.Object) 180);
        java.lang.String str31 = type28.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type11, type21, type22, type26, type28, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray33);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier35 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value37 = basicVerifier35.newValue(type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str39 = type38.toString();
        int int40 = type38.getSort();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type38, type41, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray43);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value47 = basicVerifier45.newValue(type46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str49 = type48.toString();
        int int50 = type48.getSort();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type48, type51, type52 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray53);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray53);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray53);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray53);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray53);
        java.lang.String str59 = type0.toString();
        java.lang.String str60 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str61 = type0.getInternalName();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(I)Z");
        int int4 = type2.getOpcode(83);
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type6 = type2.getElementType();
        java.lang.String str7 = type6.getClassName();
        int int9 = type6.getOpcode(8203);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type6.getInternalName();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        boolean boolean4 = type0.equals((java.lang.Object) "org.mockito.asm.tree.analysis.AnalyzerException: (VVI)J");
        java.lang.String str5 = type0.getDescriptor();
        int int7 = type0.getOpcode((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter10 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier11 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier11.newValue(type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str15 = type14.toString();
        int int16 = type14.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray19);
        org.mockito.asm.tree.analysis.Value value21 = basicInterpreter10.newValue(type12);
        boolean boolean22 = type1.equals((java.lang.Object) basicInterpreter10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 180);
        java.lang.String str26 = type23.toString();
        java.lang.String str27 = type23.getDescriptor();
        int int28 = type23.getSize();
        java.lang.String str29 = type23.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicInterpreter10.newValue(type23);
        java.lang.String str31 = type23.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type23.getElementType();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.getClassName();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter6 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        java.lang.Class<?> wildcardClass7 = basicInterpreter6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        boolean boolean12 = type1.equals((java.lang.Object) wildcardClass7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type1.getDimensions();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 180);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(VVI)I");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        int int9 = type0.getSize();
        java.lang.String str10 = type0.getDescriptor();
        java.lang.String str11 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type0.getInternalName();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        int int6 = type0.getOpcode(160);
        int int7 = type0.getSize();
        int int8 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier0.newValue(type1);
        java.lang.String str6 = type1.toString();
        int int7 = type1.getSize();
        int int8 = type1.getSize();
        java.lang.String str9 = type1.getClassName();
        int int10 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type1.getElementType();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray4);
        java.lang.String str6 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (I)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        int int5 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode(138);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean5 = type3.equals((java.lang.Object) 180);
        java.lang.Class<?> wildcardClass6 = type3.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier12.newValue(type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.toString();
        int int17 = type15.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type15, type18, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray20);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier22 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier22.newValue(type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str26 = type25.toString();
        int int27 = type25.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type25, type28, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray30);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray30);
        int int34 = type10.getSize();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str36 = type35.toString();
        int int37 = type35.getSort();
        java.lang.String str38 = type35.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter39 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.toString();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray48);
        org.mockito.asm.tree.analysis.Value value50 = basicInterpreter39.newValue(type41);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier55 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value57 = basicVerifier55.newValue(type56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean60 = type58.equals((java.lang.Object) 180);
        java.lang.String str61 = type58.toString();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type41, type51, type52, type56, type58, type62 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray63);
        int int65 = type35.getSort();
        int int66 = type35.getSort();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getReturnType("(I)V");
        java.lang.String str69 = type68.getClassName();
        org.mockito.asm.Type[] typeArray71 = org.mockito.asm.Type.getArgumentTypes("(I)V");
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray71);
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray71);
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray71);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass76 = type75.getClass();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass76);
        java.lang.String str78 = type77.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier79 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type80 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value81 = basicVerifier79.newValue(type80);
        org.mockito.asm.Type type82 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str83 = type82.toString();
        int int84 = type82.getSort();
        org.mockito.asm.Type type85 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type86 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray87 = new org.mockito.asm.Type[] { type82, type85, type86 };
        java.lang.String str88 = org.mockito.asm.Type.getMethodDescriptor(type80, typeArray87);
        java.lang.String str89 = org.mockito.asm.Type.getMethodDescriptor(type77, typeArray87);
        java.lang.String str90 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray87);
        java.lang.String str91 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray87);
        java.lang.String str92 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray87);
        java.lang.String str93 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type94 = type0.getElementType();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.toString();
        int int7 = type5.getSort();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter9 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier10.newValue(type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        org.mockito.asm.tree.analysis.Value value20 = basicInterpreter9.newValue(type11);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) 180);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier25.newValue(type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean30 = type28.equals((java.lang.Object) 180);
        java.lang.String str31 = type28.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type11, type21, type22, type26, type28, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray33);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier35 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value37 = basicVerifier35.newValue(type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str39 = type38.toString();
        int int40 = type38.getSort();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type38, type41, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray43);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.tree.analysis.Value value47 = basicVerifier45.newValue(type46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str49 = type48.toString();
        int int50 = type48.getSort();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type48, type51, type52 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray53);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray53);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray53);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray53);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = type0.getInternalName();
    }
}

