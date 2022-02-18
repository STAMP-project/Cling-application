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
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        int int4 = type2.getSort();
        int int6 = type2.getOpcode(112);
        int int7 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
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
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray24);
        java.lang.String str27 = type8.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((int) 'a', type30);
        java.lang.String str32 = type30.getClassName();
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
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("int", type30, typeArray48);
        org.mockito.asm.Type type51 = signature50.getReturnType();
        org.mockito.asm.Type[] typeArray52 = signature50.getArgumentTypes();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType("B");
        boolean boolean55 = signature50.equals((java.lang.Object) type54);
        org.mockito.asm.Type[] typeArray56 = signature50.getArgumentTypes();
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray56);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("L1880995042", type2, typeArray56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int59 = type2.getDimensions();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
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
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) 'a', type26);
        org.mockito.asm.Type type28 = local27.getType();
        org.mockito.asm.Type type29 = local27.getType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(154, type33);
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type23, type24, type29, type30, type31, type33 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(154, type38);
        boolean boolean40 = signature36.equals((java.lang.Object) type38);
        org.mockito.asm.Type type41 = signature36.getReturnType();
        java.lang.String str42 = signature36.getName();
        org.mockito.asm.Type[] typeArray43 = signature36.getArgumentTypes();
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
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local(154, type62);
        boolean boolean64 = signature60.equals((java.lang.Object) type62);
        org.mockito.asm.Type type65 = signature60.getReturnType();
        java.lang.String str66 = signature60.getName();
        java.lang.String str67 = signature60.getName();
        java.lang.String str68 = signature60.toString();
        java.lang.String str69 = signature60.toString();
        java.lang.String str70 = signature60.getName();
        org.mockito.asm.Type[] typeArray71 = signature60.getArgumentTypes();
        boolean boolean72 = signature36.equals((java.lang.Object) signature60);
        java.lang.String str73 = signature36.getName();
        boolean boolean74 = signature16.equals((java.lang.Object) signature36);
        java.lang.String str75 = signature36.getDescriptor();
        org.mockito.asm.Type type76 = signature36.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str77 = type76.getInternalName();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
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
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((int) 'a', type30);
        org.mockito.asm.Type type32 = local31.getType();
        org.mockito.asm.Type type33 = local31.getType();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(154, type37);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type27, type28, type33, type34, type35, type37 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("hi!", type25, typeArray39);
        int int41 = type25.getSize();
        boolean boolean42 = signature16.equals((java.lang.Object) int41);
        org.mockito.asm.Type[] typeArray43 = signature16.getArgumentTypes();
        java.lang.String str44 = signature16.getName();
        org.mockito.asm.Type type45 = signature16.getReturnType();
        java.lang.String str46 = signature16.getDescriptor();
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
        org.mockito.asm.Type type69 = signature64.getReturnType();
        java.lang.String str70 = signature64.getName();
        java.lang.String str71 = signature64.getName();
        org.mockito.asm.Type type72 = signature64.getReturnType();
        org.mockito.cglib.core.Local local73 = new org.mockito.cglib.core.Local(108, type72);
        int int74 = local73.getIndex();
        org.mockito.asm.Type type75 = local73.getType();
        boolean boolean76 = signature16.equals((java.lang.Object) type75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str77 = type75.getInternalName();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(52);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) 10, type1);
        org.mockito.asm.Type type6 = local5.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type3.getInternalName();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        java.lang.String str26 = type24.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = type24.getElementType();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        java.lang.String str25 = signature17.toString();
        java.lang.String str26 = signature17.toString();
        java.lang.String str27 = signature17.getName();
        java.lang.String str28 = signature17.getName();
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
        boolean boolean54 = signature17.equals((java.lang.Object) type31);
        org.mockito.asm.Type type55 = signature17.getReturnType();
        java.lang.String str56 = type55.getClassName();
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(160, type55);
        java.lang.String str58 = type55.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type59 = type55.getElementType();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(SDIISI)J");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("LSDIISI)L(SDIISI)I;");
        label5.info = "LSDIISI)L(SDIISI)I;";
        java.lang.Object obj9 = label5.info;
        boolean boolean10 = type4.equals(obj9);
        java.lang.String str11 = type4.getClassName();
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
        java.lang.String str31 = signature28.toString();
        java.lang.String str32 = signature28.toString();
        org.mockito.asm.Type[] typeArray33 = signature28.getArgumentTypes();
        org.mockito.asm.Type[] typeArray34 = signature28.getArgumentTypes();
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = type4.getInternalName();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
        int int48 = type25.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type49 = type25.getElementType();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(154, type1);
        int int3 = type1.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType("Z");
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/core/Signature;");
        int int9 = type8.getDimensions();
        int int11 = type8.getOpcode(124);
        boolean boolean12 = type5.equals((java.lang.Object) type8);
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
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(154, type32);
        boolean boolean34 = signature30.equals((java.lang.Object) type32);
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(155, type32);
        org.mockito.asm.Type type36 = local35.getType();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(154, type38);
        int int40 = type38.getSort();
        java.lang.String str41 = type38.toString();
        boolean boolean42 = type36.equals((java.lang.Object) type38);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str45 = type44.toString();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local((int) 'a', type49);
        org.mockito.asm.Type type51 = local50.getType();
        org.mockito.asm.Type type52 = local50.getType();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(154, type56);
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type46, type47, type52, type53, type54, type56 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", type44, typeArray58);
        java.lang.String str60 = signature59.toString();
        org.mockito.asm.Type[] typeArray61 = signature59.getArgumentTypes();
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray61);
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray61);
        boolean boolean64 = type1.equals((java.lang.Object) type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type65 = type5.getElementType();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) 'a', type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        java.lang.String str4 = type2.toString();
        java.lang.String str5 = type2.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(112, type2);
        java.lang.String str7 = type2.getDescriptor();
        java.lang.String str8 = type2.getDescriptor();
        int int10 = type2.getOpcode((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type2.getElementType();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
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
        java.lang.String str45 = type12.getInternalName();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
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
        int int30 = type23.getDimensions();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
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
        java.lang.String str33 = type31.getInternalName();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
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
        java.lang.String str25 = signature17.getName();
        java.lang.String str26 = signature17.getName();
        org.mockito.asm.Type type27 = signature17.getReturnType();
        java.lang.String str28 = signature17.getName();
        java.lang.String str29 = signature17.toString();
        org.mockito.asm.Type type30 = signature17.getReturnType();
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(128, type30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type30.getInternalName();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
        java.lang.String str34 = type33.getDescriptor();
        java.lang.String str35 = type33.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type36 = type33.getElementType();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
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
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("(SDIISI)I");
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
        java.lang.String str49 = signature43.getName();
        java.lang.String str50 = signature43.getName();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str53 = type52.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local((int) 'a', type57);
        org.mockito.asm.Type type59 = local58.getType();
        org.mockito.asm.Type type60 = local58.getType();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local65 = new org.mockito.cglib.core.Local(154, type64);
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type54, type55, type60, type61, type62, type64 };
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("hi!", type52, typeArray66);
        int int68 = type52.getSize();
        boolean boolean69 = signature43.equals((java.lang.Object) int68);
        org.mockito.asm.Type[] typeArray70 = signature43.getArgumentTypes();
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray70);
        boolean boolean72 = type19.equals((java.lang.Object) type26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int73 = type19.getDimensions();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("L1273107961", "int(SDIISI)I");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (short) 10, type4);
        org.mockito.asm.Type type6 = local5.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
        org.mockito.asm.Type type81 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str82 = type81.toString();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type84 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type86 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local87 = new org.mockito.cglib.core.Local((int) 'a', type86);
        org.mockito.asm.Type type88 = local87.getType();
        org.mockito.asm.Type type89 = local87.getType();
        org.mockito.asm.Type type90 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type91 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type93 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local94 = new org.mockito.cglib.core.Local(154, type93);
        org.mockito.asm.Type[] typeArray95 = new org.mockito.asm.Type[] { type83, type84, type89, type90, type91, type93 };
        org.mockito.cglib.core.Signature signature96 = new org.mockito.cglib.core.Signature("hi!", type81, typeArray95);
        java.lang.String str97 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int98 = type34.getDimensions();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(SDIISI)J");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        int int4 = type3.getSort();
        java.lang.String str5 = type3.getClassName();
        java.lang.String str6 = type3.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type3.getDimensions();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1444991225", "(SDIISI)I");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("(SDIISI)S");
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        int int12 = type11.getSort();
        java.lang.String str13 = type11.getClassName();
        java.lang.String str14 = type11.getDescriptor();
        java.lang.String str15 = type11.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        int int17 = type16.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) 'a', type20);
        java.lang.String str22 = type20.getClassName();
        int int24 = type20.getOpcode(1);
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
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type20, typeArray40);
        org.mockito.asm.Type type43 = signature42.getReturnType();
        org.mockito.asm.Type[] typeArray44 = signature42.getArgumentTypes();
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("L2145829325", type11, typeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.begin_class(141, 120, "L1413945138", type8, typeArray44, "L1825557922");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("F");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        int int3 = type1.getOpcode(116);
        java.lang.String str4 = type1.getClassName();
        int int6 = type1.getOpcode((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = type25.getInternalName();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int51 = type25.getDimensions();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
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
        java.lang.String str26 = signature16.getName();
        org.mockito.asm.Type[] typeArray27 = signature16.getArgumentTypes();
        org.mockito.asm.Type type28 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type28.getInternalName();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
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
        java.lang.String str43 = type41.getClassName();
        int int45 = type41.getOpcode((int) (short) 10);
        int int46 = type41.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type47 = type41.getElementType();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type6);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(98, type6);
        java.lang.String str10 = type6.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type6.getDimensions();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        int int3 = type1.getOpcode(116);
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
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
        java.lang.String str34 = type28.getInternalName();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type23.getDimensions();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("(SDIISI)LL646121781;", "D", "L498420848");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = type2.getInternalName();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
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
        org.mockito.asm.Type type56 = signature16.getReturnType();
        boolean boolean58 = type56.equals((java.lang.Object) "L1630845078int(SDIISI)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int59 = type56.getDimensions();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = type1.getSort();
        int int5 = type1.getOpcode(112);
        int int6 = type1.getSort();
        int int7 = type1.getSize();
        boolean boolean9 = type1.equals((java.lang.Object) "L85475922");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type1.getInternalName();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
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
        int int29 = type28.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type28.getInternalName();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int2 = type1.getSort();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(130, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
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
        boolean boolean19 = type1.equals((java.lang.Object) 158);
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        label20.info = label21;
        java.lang.String str23 = label21.toString();
        java.lang.Object obj24 = label21.info;
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
        org.mockito.asm.Type type53 = signature51.getReturnType();
        org.mockito.cglib.core.Local local54 = new org.mockito.cglib.core.Local(97, type53);
        org.mockito.asm.Type type55 = local54.getType();
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
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("J", type55, typeArray78);
        org.mockito.asm.Type[] typeArray82 = signature81.getArgumentTypes();
        label21.info = signature81;
        java.lang.Object obj84 = label21.info;
        boolean boolean85 = type1.equals((java.lang.Object) label21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int86 = type1.getDimensions();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        org.mockito.asm.Type type4 = local3.getType();
        org.mockito.asm.Type type5 = local3.getType();
        org.mockito.asm.Type type6 = local3.getType();
        org.mockito.asm.Type type7 = local3.getType();
        org.mockito.asm.Type type8 = local3.getType();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(13, type8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type8.getElementType();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
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
        int int20 = type0.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type0.getDimensions();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = type1.getSort();
        int int5 = type1.getOpcode(112);
        int int6 = type1.getSort();
        java.lang.String str7 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type1.getDimensions();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getSuperType();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        int int3 = type1.getOpcode(116);
        java.lang.String str4 = type1.getClassName();
        int int6 = type1.getOpcode((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
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
        int int26 = type19.getOpcode(153);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type19.getDimensions();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
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
        org.mockito.asm.Type type29 = type28.getElementType();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
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
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("L631593947");
        boolean boolean21 = signature16.equals((java.lang.Object) "L631593947");
        org.mockito.asm.Type type22 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type22.getInternalName();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
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
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(154, type43);
        boolean boolean45 = signature41.equals((java.lang.Object) type43);
        org.mockito.asm.Type type46 = signature41.getReturnType();
        java.lang.String str47 = signature41.getName();
        java.lang.String str48 = signature41.getName();
        org.mockito.asm.Type type49 = signature41.getReturnType();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str53 = type52.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local((int) 'a', type57);
        org.mockito.asm.Type type59 = local58.getType();
        org.mockito.asm.Type type60 = local58.getType();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local65 = new org.mockito.cglib.core.Local(154, type64);
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type54, type55, type60, type61, type62, type64 };
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("hi!", type52, typeArray66);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray66);
        boolean boolean69 = type49.equals((java.lang.Object) type50);
        java.lang.String str70 = type50.getDescriptor();
        boolean boolean71 = signature16.equals((java.lang.Object) type50);
        org.mockito.asm.Type type72 = signature16.getReturnType();
        org.mockito.asm.Type type73 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type74 = type73.getElementType();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        int int4 = type2.getSort();
        int int6 = type2.getOpcode(112);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
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
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray23);
        java.lang.String str26 = type7.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) 'a', type29);
        java.lang.String str31 = type29.getClassName();
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
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("int", type29, typeArray47);
        org.mockito.asm.Type type50 = signature49.getReturnType();
        org.mockito.asm.Type[] typeArray51 = signature49.getArgumentTypes();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType("B");
        boolean boolean54 = signature49.equals((java.lang.Object) type53);
        org.mockito.asm.Type[] typeArray55 = signature49.getArgumentTypes();
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("L1286481487", type2, typeArray55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int58 = type2.getDimensions();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
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
        int int23 = type22.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type22.getElementType();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
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
        org.mockito.asm.Type type40 = signature39.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type41 = type40.getElementType();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
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
        java.lang.String str21 = signature20.getName();
        org.mockito.asm.Type[] typeArray22 = signature20.getArgumentTypes();
        java.lang.String str23 = signature20.toString();
        org.mockito.asm.Type type24 = signature20.getReturnType();
        org.mockito.asm.Type[] typeArray25 = signature20.getArgumentTypes();
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type1.getInternalName();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
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
        int int47 = type26.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type48 = type26.getElementType();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", "(SDIISI)S");
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
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type6, typeArray26);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(156, type6);
        int int30 = local29.getIndex();
        int int31 = local29.getIndex();
        org.mockito.asm.Type type32 = local29.getType();
        boolean boolean33 = signature2.equals((java.lang.Object) type32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type32.getDimensions();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(154, type2);
        java.lang.String str4 = type2.toString();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        java.lang.String str6 = type2.toString();
        int int7 = type2.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type2.getElementType();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
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
        java.lang.String str34 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int35 = type2.getDimensions();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
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
        int int43 = type41.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type44 = type41.getElementType();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int2 = type1.getSort();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(130, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(SDIISI)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label1.info = label2;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(154, type6);
        int int8 = type6.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) 'a', type11);
        java.lang.String str13 = type11.getClassName();
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
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("int", type11, typeArray29);
        org.mockito.asm.Type type32 = signature31.getReturnType();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(154, type34);
        org.mockito.asm.Type type36 = local35.getType();
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
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(154, type56);
        boolean boolean58 = signature54.equals((java.lang.Object) type56);
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local(155, type56);
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
        java.lang.String str85 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray82);
        java.lang.String str86 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray82);
        java.lang.String str87 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray82);
        org.mockito.cglib.core.Signature signature88 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type6, typeArray82);
        java.lang.String str89 = signature88.getDescriptor();
        org.mockito.asm.Type[] typeArray90 = signature88.getArgumentTypes();
        label2.info = signature88;
        java.lang.String str92 = signature88.getName();
        org.mockito.asm.Type type93 = signature88.getReturnType();
        org.mockito.asm.Type type94 = signature88.getReturnType();
        org.mockito.cglib.core.Local local95 = new org.mockito.cglib.core.Local(154, type94);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str96 = type94.getInternalName();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
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
        java.lang.String str43 = type29.getInternalName();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
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
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("L1817688892");
        int int35 = type34.getSize();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) 'a', type39);
        org.mockito.asm.Type type41 = local40.getType();
        org.mockito.asm.Type type42 = local40.getType();
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(96, type42);
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
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("L1836861769", type42, typeArray63);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray63);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray63);
        java.lang.String str67 = type31.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type68 = type31.getElementType();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
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
        java.lang.String str26 = type23.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type23.getDimensions();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
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
        int int20 = type1.getSize();
        boolean boolean22 = type1.equals((java.lang.Object) "L1114758163");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type1.getElementType();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSort();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        org.mockito.asm.Type type3 = local2.getType();
        org.mockito.asm.Type type4 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type4.getElementType();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
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
        org.mockito.asm.Type type81 = type4.getElementType();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
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
        org.mockito.asm.Type type93 = local86.getType();
        org.mockito.asm.Type type94 = local86.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str95 = type94.getInternalName();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int3 = type1.getOpcode(126);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type1);
        java.lang.String str5 = type1.toString();
        boolean boolean7 = type1.equals((java.lang.Object) "L1817688892");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = type2.getInternalName();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
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
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(0, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type2.getElementType();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 10, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
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
        java.lang.String str45 = type24.getInternalName();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(SDIISI)I");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
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
        org.mockito.asm.Type[] typeArray26 = signature25.getArgumentTypes();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        java.lang.String str28 = signature25.getName();
        org.mockito.asm.Type type29 = signature25.getReturnType();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType("Lorg/mockito/asm/Type;");
        java.lang.String str32 = type31.getClassName();
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
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local(154, type51);
        boolean boolean53 = signature49.equals((java.lang.Object) type51);
        org.mockito.asm.Type type54 = signature49.getReturnType();
        java.lang.String str55 = signature49.getName();
        java.lang.String str56 = signature49.getName();
        java.lang.String str57 = signature49.toString();
        java.lang.String str58 = signature49.toString();
        java.lang.String str59 = signature49.getName();
        java.lang.String str60 = signature49.getName();
        org.mockito.asm.Type[] typeArray61 = signature49.getArgumentTypes();
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray61);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("LL135068834;", type29, typeArray61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str64 = type29.getInternalName();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        org.mockito.asm.Type type4 = local3.getType();
        int int5 = type4.getSize();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(116, type4);
        int int7 = local6.getIndex();
        org.mockito.asm.Type type8 = local6.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type8.getDimensions();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
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
        int int45 = type25.getSort();
        int int47 = type25.getOpcode(121);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getObjectType("L1891304736");
        java.lang.String str50 = type49.toString();
        boolean boolean51 = type25.equals((java.lang.Object) str50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type52 = type25.getElementType();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type2.getElementType();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type10 = local8.getType();
        java.lang.String str11 = type10.getDescriptor();
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = type4.equals((java.lang.Object) type10);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(126, type4);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(120, type4);
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(168, type4);
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 100, type4);
        int int18 = type4.getSort();
        int int19 = type4.getSize();
        int int20 = type4.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type4.getInternalName();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        int int3 = type1.getSort();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.getClassName();
        int int7 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
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
        boolean boolean28 = signature25.equals((java.lang.Object) 6);
        org.mockito.asm.Type[] typeArray29 = signature25.getArgumentTypes();
        org.mockito.asm.Type type30 = signature25.getReturnType();
        int int32 = type30.getOpcode(52);
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) (short) -1, type30);
        int int34 = type30.getSort();
        int int35 = type30.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type36 = type30.getElementType();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(154, type3);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type3);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (byte) 100, type3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) 'a', type12);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.asm.Type type15 = local13.getType();
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(96, type15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) 'a', type24);
        org.mockito.asm.Type type26 = local25.getType();
        org.mockito.asm.Type type27 = local25.getType();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(154, type31);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type21, type22, type27, type28, type29, type31 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray33);
        java.lang.String str35 = signature34.toString();
        org.mockito.asm.Type[] typeArray36 = signature34.getArgumentTypes();
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("L1836861769", type15, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray36);
        org.mockito.asm.Type[] typeArray39 = signature38.getArgumentTypes();
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local((int) 'a', type46);
        org.mockito.asm.Type type48 = local47.getType();
        org.mockito.asm.Type type49 = local47.getType();
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(96, type49);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str54 = type53.toString();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local((int) 'a', type58);
        org.mockito.asm.Type type60 = local59.getType();
        org.mockito.asm.Type type61 = local59.getType();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local66 = new org.mockito.cglib.core.Local(154, type65);
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type55, type56, type61, type62, type63, type65 };
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("hi!", type53, typeArray67);
        java.lang.String str69 = signature68.toString();
        org.mockito.asm.Type[] typeArray70 = signature68.getArgumentTypes();
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("L1836861769", type49, typeArray70);
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("hi!", type42, typeArray70);
        java.lang.String str73 = signature72.toString();
        org.mockito.asm.Type[] typeArray74 = signature72.getArgumentTypes();
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str76 = type3.getInternalName();
    }
}

