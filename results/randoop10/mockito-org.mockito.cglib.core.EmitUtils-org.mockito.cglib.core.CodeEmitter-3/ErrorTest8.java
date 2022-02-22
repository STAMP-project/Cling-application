import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4001");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4002");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L384894847L1713255303", "L2058098915LL991702334;", "L940243296");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4003");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L373083987");
        java.lang.String str2 = type1.toString();
        int int4 = type1.getOpcode(4);
        int int6 = type1.getOpcode(132);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type18, type19, type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type15, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type13, typeArray24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        boolean boolean29 = type13.equals((java.lang.Object) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        boolean boolean42 = type1.equals((java.lang.Object) classEmitter7);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str53 = type52.getDescriptor();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type47, type49, type50, type52, type54 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type46, typeArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("", type44, typeArray55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo59 = classEmitter58.getClassInfo();
        boolean boolean60 = type44.equals((java.lang.Object) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter62 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo66 = classEmitter65.getClassInfo();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter64.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter70 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.asm.ClassAdapter classAdapter72 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.asm.ClassAdapter classAdapter75 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter77 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.asm.ClassAdapter classAdapter79 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassInfo classInfo81 = classEmitter76.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter82 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classAdapter82);
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter82);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int86 = classEmitter7.getAccess();
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4004");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        java.lang.String str15 = type1.toString();
        int int16 = type1.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type1.getDimensions();
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4005");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type12, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type9, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type7, typeArray18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        boolean boolean23 = type7.equals((java.lang.Object) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type33, type35, type36, type38, type40 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", type32, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("", type30, typeArray41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        boolean boolean46 = type30.equals((java.lang.Object) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter48 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter50.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter52);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter52);
        org.mockito.asm.ClassAdapter classAdapter55 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("Lg/mockito/cglib/core/ClassEmitter;", "g.mockito.asm.Label", "L975948501(SCFFF)F");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4006");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter46.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = classEmitter46.visitAnnotation("L375011162", true);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4007");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = classEmitter21.getAccess();
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4008");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter29.getClassInfo();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classEmitter15.visitAnnotation("L681954215", true);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4009");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type26, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type24, typeArray35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        boolean boolean40 = type24.equals((java.lang.Object) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter46);
        org.mockito.asm.ClassAdapter classAdapter48 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter46);
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter46.visitOuterClass("L1341030816", "L903486813", "L885088934");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label2.info = 0L;
        java.lang.Object obj5 = new java.lang.Object();
        label2.info = obj5;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type10, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type8, typeArray19);
        label2.info = typeArray19;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type26, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type24, typeArray35);
        java.lang.String str38 = type24.toString();
        int int39 = type24.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type44, type46, type47, type49, type51 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("", type43, typeArray52);
        org.mockito.asm.Type[] typeArray54 = signature53.getArgumentTypes();
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray54);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray54);
        label2.info = str56;
        java.lang.Object obj58 = label2.info;
        java.lang.Object obj59 = label2.info;
        boolean boolean60 = type0.equals((java.lang.Object) label2);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo63 = classEmitter62.getClassInfo();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        boolean boolean65 = type0.equals((java.lang.Object) classEmitter62);
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str72 = type71.getDescriptor();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str75 = type74.getDescriptor();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str77 = type76.getDescriptor();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray79 = new org.mockito.asm.Type[] { type71, type73, type74, type76, type78 };
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("", type70, typeArray79);
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("", type68, typeArray79);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo83 = classEmitter82.getClassInfo();
        boolean boolean84 = type68.equals((java.lang.Object) classEmitter82);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter86 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter85);
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter85);
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter82);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo90 = classEmitter89.getClassInfo();
        classEmitter88.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        org.mockito.asm.ClassAdapter classAdapter92 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter89);
        org.mockito.cglib.core.ClassInfo classInfo93 = classEmitter89.getClassInfo();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter62.visitEnd();
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4011");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.visitSource("L1235118066", "L264427422");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4012");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L387759177", "L2005272679", "");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4013");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "C");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type9, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type6, typeArray15);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("char", type4, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type4.getInternalName();
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4014");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "(FCFFB)B");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4015");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter4.getStaticHook();
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4016");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter34.getClassInfo();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        java.lang.Class<?> wildcardClass37 = classEmitter33.getClass();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type46, type48, type49, type51, type53 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("", type45, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type43, typeArray54);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo58 = classEmitter57.getClassInfo();
        boolean boolean59 = type43.equals((java.lang.Object) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter61 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter60);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo65 = classEmitter64.getClassInfo();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter64);
        boolean boolean69 = type41.equals((java.lang.Object) classEmitter64);
        org.mockito.asm.ClassAdapter classAdapter70 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = classEmitter22.visitAnnotation("float", false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4017");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 0L;
        java.lang.Object obj3 = new java.lang.Object();
        label0.info = obj3;
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters8 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("L22988295", "(FCFFB)B", "L1733337266");
        label0.info = arrayDelimiters8;
        java.lang.String str10 = label0.toString();
        java.lang.String str11 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter18.getClassInfo();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type28, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type25, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type23, typeArray34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter37.getClassInfo();
        boolean boolean39 = type23.equals((java.lang.Object) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str62 = type61.getDescriptor();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str64 = type63.getDescriptor();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type58, type60, type61, type63, type65 };
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("", type57, typeArray66);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("", type55, typeArray66);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo70 = classEmitter69.getClassInfo();
        boolean boolean71 = type55.equals((java.lang.Object) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter73 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter72);
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassInfo classInfo76 = classEmitter75.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter78 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter80);
        classEmitter75.setTarget((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.cglib.core.ClassInfo classInfo83 = classEmitter80.getClassInfo();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter80);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo87 = classEmitter14.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        label0.info = classEmitter12;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.end_class();
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4018");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type26, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type24, typeArray35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        boolean boolean40 = type24.equals((java.lang.Object) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter46);
        org.mockito.asm.ClassAdapter classAdapter48 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitOuterClass("L1222670720", "L994906203", "L655451480");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4019");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classEmitter15.visitAnnotation("L2106779359", false);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4020");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.visitInnerClass("L1841608680", "L885088934", "Lckito/cglib/core/ClassEmitter;", 139);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4021");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = classEmitter24.getSuperType();
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4022");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter6.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type16, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type13, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type11, typeArray22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter25.getClassInfo();
        boolean boolean27 = type11.equals((java.lang.Object) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type46, type48, type49, type51, type53 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("", type45, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type43, typeArray54);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo58 = classEmitter57.getClassInfo();
        boolean boolean59 = type43.equals((java.lang.Object) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter61 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter60);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassInfo classInfo64 = classEmitter63.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassInfo classInfo71 = classEmitter68.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo75 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter77 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter78 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter77);
        org.mockito.asm.ClassAdapter classAdapter79 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter79.visitOuterClass("L1463784446", "L1615273883", "(FLL256357634;)Lmockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4023");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter10.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = classEmitter3.getSuperType();
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4024");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class<?> wildcardClass4 = classEmitter0.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        boolean boolean13 = type7.equals((java.lang.Object) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type18, typeArray29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        boolean boolean34 = type18.equals((java.lang.Object) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter32.getClassInfo();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.asm.ClassAdapter classAdapter43 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter42);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classAdapter43);
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter43);
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter43);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter46);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter47.end_class();
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4025");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter32.end_class();
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4026");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 10L);
        int int3 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        boolean boolean33 = type0.equals((java.lang.Object) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classEmitter26.visitAnnotation("LI;", true);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4027");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class<?> wildcardClass4 = classEmitter0.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type12, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type10, typeArray21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        boolean boolean26 = type10.equals((java.lang.Object) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter31.getClassInfo();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean36 = type8.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter37.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter31.visitSource("L2147397460", "L711198664");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4028");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str49 = type48.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type45, type47, type48, type50, type52 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", type44, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("", type42, typeArray53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo57 = classEmitter56.getClassInfo();
        boolean boolean58 = type42.equals((java.lang.Object) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter59);
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo65 = classEmitter64.getClassInfo();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.asm.ClassAdapter classAdapter67 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter63);
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo71 = classEmitter70.getClassInfo();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.asm.ClassAdapter classAdapter74 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter74);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter74);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter77.visitSource("L469324394", "L1290288171");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4029");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("(SCFFF)B");
        int int26 = type25.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type33, type34, type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type30, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type28, typeArray39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter42.getClassInfo();
        boolean boolean44 = type28.equals((java.lang.Object) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter45);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter48.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter50 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter48);
        boolean boolean51 = type25.equals((java.lang.Object) classAdapter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter50);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassInfo classInfo55 = classEmitter54.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter54.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter54.visitInnerClass("L438299733", "L1996841545", "L716443809", 5);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4030");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitSource("L1647978068", "L54301378");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4031");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L516169587", "LL1733337266;", "L143918736");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4032");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label2.info = 0L;
        java.lang.Object obj5 = new java.lang.Object();
        label2.info = obj5;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type10, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type8, typeArray19);
        label2.info = typeArray19;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type26, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type24, typeArray35);
        java.lang.String str38 = type24.toString();
        int int39 = type24.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type44, type46, type47, type49, type51 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("", type43, typeArray52);
        org.mockito.asm.Type[] typeArray54 = signature53.getArgumentTypes();
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray54);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray54);
        label2.info = str56;
        java.lang.Object obj58 = label2.info;
        java.lang.Object obj59 = label2.info;
        boolean boolean60 = type0.equals((java.lang.Object) label2);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo63 = classEmitter62.getClassInfo();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        boolean boolean65 = type0.equals((java.lang.Object) classEmitter62);
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type67 = classEmitter62.getClassType();
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4033");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classEmitter32.visitAnnotation("L(FCFFB)S;", false);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4034");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("L1746114040", "L1025583721");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4035");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter29.getClassInfo();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter36.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter43 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classAdapter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type53 = classEmitter36.getSuperType();
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4036");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter0.getStaticHook();
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4037");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter46.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter46.visitEnd();
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4038");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitInnerClass("L1244354306", "L1996841545", "L1815116235", 54);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4039");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type10, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type8, typeArray19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        boolean boolean24 = type8.equals((java.lang.Object) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter29.getClassInfo();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter32.visitSource("L1187111778", "L738901579");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4040");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter5.getStaticHook();
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4041");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4042");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type28, type30, type31, type33, type35 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type27, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type25, typeArray36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        boolean boolean41 = type25.equals((java.lang.Object) classEmitter39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter43 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter42);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter39.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str55 = type54.getDescriptor();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str57 = type56.getDescriptor();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type51, type53, type54, type56, type58 };
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("", type50, typeArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("", type48, typeArray59);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo63 = classEmitter62.getClassInfo();
        boolean boolean64 = type48.equals((java.lang.Object) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassInfo classInfo69 = classEmitter68.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter70 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classAdapter70);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classAdapter70);
        org.mockito.asm.ClassAdapter classAdapter73 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter70.visitOuterClass("L1647978068", "", "L1526240319");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4043");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", "C");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int7 = type5.getOpcode(156);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type5.getDimensions();
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4044");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.end_class();
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4045");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitEnd();
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4046");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitInnerClass("L886620262", "L22988295", "L723118494", 122);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4047");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classAdapter5.visitAnnotation("L1746521168", false);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4048");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = classEmitter22.getAccess();
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4049");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitSource("L220488910", "L1281328698org/mockito/asm/Type");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4050");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter22.getClassInfo();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type33, type35, type36, type38, type40 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", type32, typeArray41);
        org.mockito.asm.Type[] typeArray43 = signature42.getArgumentTypes();
        java.lang.String str44 = signature42.getDescriptor();
        boolean boolean45 = type29.equals((java.lang.Object) signature42);
        java.lang.String str46 = type29.toString();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("I");
        int int49 = type48.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.declare_field(165, "L1715444316", type29, (java.lang.Object) type48);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4051");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter35.getClassInfo();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        java.lang.Class<?> wildcardClass38 = classEmitter34.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.String str40 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(100, type41);
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local(112, type41);
        org.mockito.asm.Type type44 = type41.getElementType();
        java.lang.String str45 = type44.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.declare_field(43, "hi!", type44, (java.lang.Object) "L1577354629");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4052");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("(FCFFB)B");
        int int14 = type12.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        java.lang.String str17 = type15.getDescriptor();
        java.lang.String str18 = type15.getClassName();
        java.lang.String str19 = type15.toString();
        java.lang.String str20 = type15.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.declare_field((int) '#', "L628796669", type12, (java.lang.Object) str20);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4053");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("L1811412032", "L2060227859", "L2095563894", 122);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4054");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type8, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type6, typeArray17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        boolean boolean22 = type6.equals((java.lang.Object) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = classEmitter29.getSuperType();
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4055");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4056");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter33.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitInnerClass("", "(FCFFB)LLS;;", "L751999465", (int) '4');
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4057");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 153);
        int int3 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        boolean boolean35 = type0.equals((java.lang.Object) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter33.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter33.visitEnd();
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4058");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter16 = classEmitter14.getStaticHook();
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4059");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter22.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter27.visitSource("L1485492876", "L291586533");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4060");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitOuterClass("L808781503", "L1970072742", "LS;");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4061");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitOuterClass("L1039466253", "L1509111953", "L1508318732L1481842818");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4062");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type8, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type6, typeArray17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        boolean boolean22 = type6.equals((java.lang.Object) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = classEmitter1.getSuperType();
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4063");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 0L;
        java.lang.Object obj3 = new java.lang.Object();
        label0.info = obj3;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type8, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type6, typeArray17);
        label0.info = typeArray17;
        java.lang.String str21 = label0.toString();
        java.lang.Object obj22 = label0.info;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(10, type24);
        int int26 = local25.getIndex();
        org.mockito.asm.Type type27 = local25.getType();
        java.lang.String str28 = type27.getClassName();
        label0.info = str28;
        java.lang.Object obj30 = label0.info;
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        label0.info = classEmitter32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int38 = classEmitter32.getAccess();
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4064");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type[] typeArray16 = signature14.getArgumentTypes();
        java.lang.String str17 = signature14.getDescriptor();
        java.lang.String str18 = signature14.getName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        java.lang.String str32 = signature30.getDescriptor();
        org.mockito.asm.Type type33 = signature30.getReturnType();
        boolean boolean34 = signature14.equals((java.lang.Object) type33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        boolean boolean40 = type33.equals((java.lang.Object) classEmitter38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classEmitter38.visitAnnotation("L753038850", false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4065");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitOuterClass("L168619699", "L771404750", "L1505788170");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4066");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = classEmitter13.getClassType();
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4067");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str49 = type48.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type45, type47, type48, type50, type52 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", type44, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("", type42, typeArray53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo57 = classEmitter56.getClassInfo();
        boolean boolean58 = type42.equals((java.lang.Object) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter59);
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo65 = classEmitter64.getClassInfo();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.asm.ClassAdapter classAdapter67 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter63);
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo71 = classEmitter70.getClassInfo();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.asm.ClassAdapter classAdapter74 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter74);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter74);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter74);
        org.mockito.asm.ClassAdapter classAdapter78 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter77.visitEnd();
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4068");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 0L;
        java.lang.Object obj3 = new java.lang.Object();
        label0.info = obj3;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type8, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type6, typeArray17);
        label0.info = typeArray17;
        java.lang.String str21 = label0.toString();
        java.lang.Object obj22 = label0.info;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(10, type24);
        int int26 = local25.getIndex();
        org.mockito.asm.Type type27 = local25.getType();
        java.lang.String str28 = type27.getClassName();
        label0.info = str28;
        java.lang.Object obj30 = label0.info;
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        label0.info = classEmitter32;
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter32.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = classEmitter32.getAccess();
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4069");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType("Lorg/mockito/cglib/core/Signature;");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        int int19 = type18.getSort();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        label20.info = 0L;
        java.lang.Object obj23 = new java.lang.Object();
        label20.info = obj23;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        label20.info = typeArray37;
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type18, typeArray37);
        org.mockito.asm.Type[] typeArray42 = signature41.getArgumentTypes();
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray42);
        int int44 = type16.getSize();
        java.lang.String str45 = type16.getInternalName();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str55 = type54.getDescriptor();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str57 = type56.getDescriptor();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type51, type53, type54, type56, type58 };
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("", type50, typeArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("", type48, typeArray59);
        java.lang.String str62 = signature61.getDescriptor();
        org.mockito.asm.Type[] typeArray63 = signature61.getArgumentTypes();
        java.lang.String str64 = signature61.getDescriptor();
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("S", "(FCFFB)B");
        org.mockito.asm.Type[] typeArray68 = signature67.getArgumentTypes();
        boolean boolean69 = signature61.equals((java.lang.Object) signature67);
        java.lang.Class<?> wildcardClass70 = signature67.getClass();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass70);
        int int73 = type71.getOpcode(0);
        java.lang.String str74 = type71.getInternalName();
        org.mockito.cglib.core.Local local75 = new org.mockito.cglib.core.Local(118, type71);
        org.mockito.asm.Type type77 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type78 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str79 = type78.getDescriptor();
        org.mockito.asm.Type type80 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type81 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str82 = type81.getDescriptor();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str84 = type83.getDescriptor();
        org.mockito.asm.Type type85 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray86 = new org.mockito.asm.Type[] { type78, type80, type81, type83, type85 };
        org.mockito.cglib.core.Signature signature87 = new org.mockito.cglib.core.Signature("", type77, typeArray86);
        org.mockito.asm.Type[] typeArray88 = signature87.getArgumentTypes();
        java.lang.String str89 = signature87.getDescriptor();
        org.mockito.asm.Type[] typeArray90 = signature87.getArgumentTypes();
        java.lang.String str91 = signature87.getName();
        org.mockito.asm.Type[] typeArray92 = signature87.getArgumentTypes();
        java.lang.String str93 = org.mockito.asm.Type.getMethodDescriptor(type71, typeArray92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.begin_class(14, (int) (short) 100, "L373083987", type16, typeArray92, "L1281328698");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4070");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = classEmitter22.getClassType();
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4071");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter29.getClassInfo();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter34.visitEnd();
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4072");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type9, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type6, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type4, typeArray15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        boolean boolean20 = type4.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("", "L1751370418", "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4073");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        java.lang.String str7 = type5.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type11, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type9, typeArray20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter40.getClassInfo();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str54 = type53.getDescriptor();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str57 = type56.getDescriptor();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type53, type55, type56, type58, type60 };
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("", type52, typeArray61);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("", type50, typeArray61);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo65 = classEmitter64.getClassInfo();
        boolean boolean66 = type50.equals((java.lang.Object) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter68 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter67);
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassInfo classInfo70 = classEmitter64.getClassInfo();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        boolean boolean72 = signature22.equals((java.lang.Object) classEmitter64);
        org.mockito.asm.ClassAdapter classAdapter73 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(54, "L1759493043", type5, (java.lang.Object) classEmitter64);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4074");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("L994109699", "L1065593843", "Lorg/mockito/cglib/core/ClassEmitter;", 0);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4075");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter26.visitSource("L1774500380", "LL913109010;");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4076");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter33.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter39);
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int44 = classEmitter43.getAccess();
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4077");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 0L;
        java.lang.Object obj6 = new java.lang.Object();
        label3.info = obj6;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type11, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type9, typeArray20);
        label3.info = typeArray20;
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type1, typeArray20);
        int int25 = type1.getSort();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        boolean boolean43 = type27.equals((java.lang.Object) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter48.getClassInfo();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        boolean boolean51 = type1.equals((java.lang.Object) classEmitter48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter48.visitEnd();
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4078");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter6.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type16, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type13, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type11, typeArray22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter25.getClassInfo();
        boolean boolean27 = type11.equals((java.lang.Object) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type46, type48, type49, type51, type53 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("", type45, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type43, typeArray54);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo58 = classEmitter57.getClassInfo();
        boolean boolean59 = type43.equals((java.lang.Object) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter61 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter60);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassInfo classInfo64 = classEmitter63.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassInfo classInfo71 = classEmitter68.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo75 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter77 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = classEmitter0.visitAnnotation("org.mockito.cglib.core.LocalVariablesSorter", false);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4079");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.end_class();
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4080");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("(SCFFF)B");
        int int26 = type25.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type33, type34, type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type30, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type28, typeArray39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter42.getClassInfo();
        boolean boolean44 = type28.equals((java.lang.Object) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter45);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter48.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter50 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter48);
        boolean boolean51 = type25.equals((java.lang.Object) classAdapter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter50);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.asm.ClassAdapter classAdapter55 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str61 = type60.getDescriptor();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str64 = type63.getDescriptor();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str66 = type65.getDescriptor();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type60, type62, type63, type65, type67 };
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("", type59, typeArray68);
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("", type57, typeArray68);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo72 = classEmitter71.getClassInfo();
        boolean boolean73 = type57.equals((java.lang.Object) classEmitter71);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter75 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter74);
        classEmitter71.setTarget((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter71);
        org.mockito.cglib.core.ClassInfo classInfo78 = classEmitter77.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter79 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter81 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter83);
        org.mockito.asm.ClassAdapter classAdapter85 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter84);
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classAdapter85);
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classAdapter85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter54.visitEnd();
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4081");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = classEmitter1.getAccess();
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4082");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L97879738", "(SCFFF)Lorg/mockito/cglib/core/ClassEmitter;");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type9, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type6, typeArray15);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        java.lang.String str18 = signature16.getDescriptor();
        org.mockito.asm.Type type19 = signature16.getReturnType();
        int int21 = type19.getOpcode(6);
        int int23 = type19.getOpcode(154);
        java.lang.String str24 = type19.getClassName();
        java.lang.String str25 = type19.toString();
        java.lang.String str26 = type19.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(43, type19);
        org.mockito.asm.Type type28 = local27.getType();
        boolean boolean29 = signature2.equals((java.lang.Object) type28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type28.getElementType();
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4083");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter23.visitInnerClass("L267200837", "org.mockito.asm.Type", "L1644759323(SCFFF)S", 0);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4084");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 0L;
        java.lang.Object obj10 = new java.lang.Object();
        label7.info = obj10;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type18, type19, type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type15, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type13, typeArray24);
        label7.info = typeArray24;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type32, type34, type35, type37, type39 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type31, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", type29, typeArray40);
        java.lang.String str43 = type29.toString();
        int int44 = type29.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str46 = type45.toString();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str53 = type52.getDescriptor();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str55 = type54.getDescriptor();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type49, type51, type52, type54, type56 };
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("", type48, typeArray57);
        org.mockito.asm.Type[] typeArray59 = signature58.getArgumentTypes();
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray59);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray59);
        label7.info = str61;
        java.lang.String str63 = label7.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo66 = classEmitter65.getClassInfo();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.asm.ClassAdapter classAdapter68 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter64);
        label7.info = classAdapter68;
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L530208967", "L1076410074", "L840012360", 132);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4085");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("org/mockito/cglib/core/ClassEmitter", true);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4086");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        int int15 = type14.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type20, type22, type23, type25, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type19, typeArray28);
        org.mockito.asm.Type[] typeArray30 = signature29.getArgumentTypes();
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray30);
        int int34 = type14.getOpcode(4);
        java.lang.String str35 = type14.getDescriptor();
        int int36 = type14.getSort();
        int int37 = type14.getSort();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter43.getClassInfo();
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter47 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        boolean boolean52 = type14.equals((java.lang.Object) classEmitter49);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter54.visitEnd();
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4087");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        org.mockito.asm.Type[] typeArray16 = signature14.getArgumentTypes();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type18, typeArray29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        boolean boolean34 = type18.equals((java.lang.Object) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter38.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter38);
        boolean boolean50 = signature14.equals((java.lang.Object) classAdapter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter51.visitInnerClass("Lg/mockito/asm/Type;", "L1838318578", "L706785226", 161);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4088");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter29.getClassInfo();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter36.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classEmitter29.visitAnnotation("L2116915777", false);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4089");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = classEmitter30.getAccess();
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4090");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type5, type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", type1, typeArray10);
        int int13 = type1.getOpcode((int) (short) -1);
        int int14 = type1.getSort();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter19.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter24);
        boolean boolean27 = type1.equals((java.lang.Object) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = classEmitter26.visitAnnotation("L625571328", false);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4091");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter24.visitSource("L622820132", "L674629626");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4092");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = classEmitter31.getClassType();
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4093");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type38, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type35, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type33, typeArray44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        boolean boolean49 = type33.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter53.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter56 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassInfo classInfo61 = classEmitter58.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitInnerClass("L945911247", "(FCFFB)LL975948501;", "L722031589", 154);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4094");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type6, type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type2, typeArray11);
        int int14 = type2.getOpcode((int) (short) -1);
        int int15 = type2.getSort();
        boolean boolean17 = type2.equals((java.lang.Object) 1.0d);
        int int18 = type2.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type25, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type22, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type20, typeArray31);
        java.lang.String str34 = type20.toString();
        int int35 = type20.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type40, type42, type43, type45, type47 };
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type39, typeArray48);
        org.mockito.asm.Type[] typeArray50 = signature49.getArgumentTypes();
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray50);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray50);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("S", type2, typeArray50);
        java.lang.String str54 = type2.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo57 = classEmitter56.getClassInfo();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        java.lang.Class<?> wildcardClass59 = classEmitter55.getClass();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass59);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass59);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter64 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter66);
        boolean boolean68 = type62.equals((java.lang.Object) classEmitter67);
        int int70 = type62.getOpcode((int) (byte) 10);
        boolean boolean71 = type2.equals((java.lang.Object) int70);
        int int72 = type2.getSize();
        int int73 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str74 = type2.getInternalName();
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4095");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type[] typeArray16 = signature14.getArgumentTypes();
        java.lang.String str17 = signature14.getDescriptor();
        java.lang.String str18 = signature14.getName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        java.lang.String str32 = signature30.getDescriptor();
        org.mockito.asm.Type type33 = signature30.getReturnType();
        boolean boolean34 = signature14.equals((java.lang.Object) type33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        boolean boolean40 = type33.equals((java.lang.Object) classEmitter38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter38.visitEnd();
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4096");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        label0.info = str3;
        java.lang.String str5 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        label0.info = classEmitter8;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        label21.info = 0L;
        java.lang.Object obj24 = new java.lang.Object();
        label21.info = obj24;
        java.lang.Object obj26 = label21.info;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        label21.info = typeArray37;
        java.lang.Object obj40 = label21.info;
        java.lang.Object obj41 = label21.info;
        java.lang.String str42 = label21.toString();
        java.lang.Object obj43 = label21.info;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor44 = classEmitter8.visitField(0, "L1152515340", "(SCFFF)L(SCFFF)B;", "L837343644", obj43);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4097");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = classEmitter22.getSuperType();
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4098");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getClassType();
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4099");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = classEmitter4.getAccess();
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4100");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("", "L1063860564", "L1811412032");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4101");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter23.visitEnd();
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4102");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(FF)B");
        org.mockito.asm.Type type2 = type1.getElementType();
        java.lang.String str3 = type2.getDescriptor();
        java.lang.String str4 = type2.getDescriptor();
        java.lang.String str5 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type2.getElementType();
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4103");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitInnerClass("", "L1981660116", "L372741002", 108);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4104");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L661165943", "L357180587", "L1288227267", 35);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4105");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("L129381457", "L1728165382", "L804057461");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4106");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classEmitter32.visitAnnotation("L396783314", true);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4107");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter33.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int36 = classEmitter33.getAccess();
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4108");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter33.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter39);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter39);
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter39.visitSource("(SCFFF)B", "g.mockito.asm.Label");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4109");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type12, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type10, typeArray21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        boolean boolean26 = type10.equals((java.lang.Object) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter24.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter34);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classAdapter35);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type38 = classEmitter6.getSuperType();
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4110");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter22.getClassInfo();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type33, type34, type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type30, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type28, typeArray39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter42.getClassInfo();
        boolean boolean44 = type28.equals((java.lang.Object) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter45);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter50.getClassInfo();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo57 = classEmitter56.getClassInfo();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter60);
        org.mockito.asm.ClassAdapter classAdapter62 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter61.visitSource("L972648349", "(FCFFB)Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4111");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classAdapter9.visitAnnotation("L681954215", false);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4112");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(7, type1);
        java.lang.String str4 = type1.toString();
        java.lang.String str5 = type1.getClassName();
        java.lang.String str6 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4113");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter33.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter39);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter42 = classEmitter41.getStaticHook();
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4114");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type18, typeArray29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        boolean boolean34 = type18.equals((java.lang.Object) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter38.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassInfo classInfo55 = classEmitter50.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter56 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classAdapter56);
        java.lang.Class<?> wildcardClass58 = classEmitter38.getClass();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor60 = classEmitter10.visitField(159, "L885843407", "Lg/mockito/cglib/core/ClassEmitter;", "L288397027", (java.lang.Object) wildcardClass58);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4115");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter5.visitAnnotation("L373093226", true);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4116");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitOuterClass("L816154000", "L771404750", "L577580733");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4117");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitSource("L1538635289", "L1179086462");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4118");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classAdapter7.visitAnnotation("L809299631", false);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4119");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = classEmitter23.visitAnnotation("void", false);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4120");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter8.getClassType();
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4121");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("V", "L1625180428(FCFFB)C");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type9, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type6, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type4, typeArray15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        boolean boolean20 = type4.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        boolean boolean43 = type27.equals((java.lang.Object) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classAdapter49);
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean52 = signature2.equals((java.lang.Object) classAdapter51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter51.visitInnerClass("(FCFFB)LL118870434;", "LL1085730510;", "(FCFFB)F", 120);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4122");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classAdapter8.visitAnnotation("L585414700", false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4123");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.end_class();
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4124");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type38, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type35, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type33, typeArray44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        boolean boolean49 = type33.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter47.getClassInfo();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter57 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.asm.ClassAdapter classAdapter58 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter57);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter58.visitOuterClass("L1250153919", "L535395533", "L628796669");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4125");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitSource("L1322577968", "L972648349");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4126");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class<?> wildcardClass4 = classEmitter0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str8 = type7.toString();
        java.lang.String str9 = type7.getInternalName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getReturnType("C");
        int int12 = type11.getSort();
        boolean boolean13 = type7.equals((java.lang.Object) type11);
        java.lang.String str14 = type11.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type18, typeArray29);
        java.lang.String str32 = type18.toString();
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(158, type18);
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(0, type18);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter35.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter41);
        boolean boolean43 = type18.equals((java.lang.Object) classAdapter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter41);
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter41);
        boolean boolean46 = type11.equals((java.lang.Object) classAdapter45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter47.visitEnd();
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4127");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.Class<?> wildcardClass9 = classEmitter5.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type20, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type17, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type15, typeArray26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter29.getClassInfo();
        boolean boolean31 = type15.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        boolean boolean41 = type13.equals((java.lang.Object) classEmitter36);
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.visitEnd();
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4128");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitInnerClass("(SCFFF)Lorg/mockito/cglib/core/Signature;", "L1559936595", "L1746521168", 148);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4129");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = classEmitter26.getClassType();
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4130");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classEmitter0.visitAnnotation("L220488910", false);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4131");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter25.getClassInfo();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type34, type36, type37, type39, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("", type33, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("", type31, typeArray42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo46 = classEmitter45.getClassInfo();
        boolean boolean47 = type31.equals((java.lang.Object) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter45.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str58 = type57.getDescriptor();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str61 = type60.getDescriptor();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str63 = type62.getDescriptor();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type57, type59, type60, type62, type64 };
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("", type56, typeArray65);
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("", type54, typeArray65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo69 = classEmitter68.getClassInfo();
        boolean boolean70 = type54.equals((java.lang.Object) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter72 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter71);
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassInfo classInfo75 = classEmitter74.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter76 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter74);
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classAdapter76);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classAdapter76);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitInnerClass("g/mockito/cglib/core/Signature", "L120634767", "L723118494", (int) (short) 1);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4132");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray15);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("(FF)B");
        org.mockito.asm.Type type21 = type20.getElementType();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type28, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type25, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type23, typeArray34);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        org.mockito.asm.Type[] typeArray38 = signature36.getArgumentTypes();
        org.mockito.asm.Type[] typeArray39 = signature36.getArgumentTypes();
        boolean boolean40 = type21.equals((java.lang.Object) signature36);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str49 = type48.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type43, type45, type46, type48, type50 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("", type42, typeArray51);
        org.mockito.asm.Type[] typeArray53 = signature52.getArgumentTypes();
        java.lang.String str54 = signature52.getDescriptor();
        org.mockito.asm.Type[] typeArray55 = signature52.getArgumentTypes();
        org.mockito.asm.Type[] typeArray56 = signature52.getArgumentTypes();
        org.mockito.asm.Type[] typeArray57 = signature52.getArgumentTypes();
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("LL256357634;", type21, typeArray57);
        boolean boolean59 = type0.equals((java.lang.Object) typeArray57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int60 = type0.getDimensions();
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4133");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L239736648", "L1746114040", "LL1038671545;", 167);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4134");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter4.visitAnnotation("L680867512", true);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4135");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitOuterClass("(FCFFB)LC;", "L1435554273", "");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4136");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type11, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type9, typeArray20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        boolean boolean25 = type9.equals((java.lang.Object) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter29.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type44, type46, type47, type49, type51 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("", type43, typeArray52);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", type41, typeArray52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter55.getClassInfo();
        boolean boolean57 = type41.equals((java.lang.Object) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter59 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassInfo classInfo62 = classEmitter61.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter64 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassInfo classInfo69 = classEmitter66.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter74 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter77 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.asm.ClassAdapter classAdapter78 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter77);
        org.mockito.asm.ClassAdapter classAdapter79 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter78);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter79);
        org.mockito.asm.ClassAdapter classAdapter81 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter80);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.asm.Type type86 = org.mockito.asm.Type.getType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type87 = type86.getElementType();
        int int88 = type86.getDimensions();
        int int89 = type86.getDimensions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(124, "L726877741", type86, (java.lang.Object) "L2047114708");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4137");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = classEmitter18.getClassType();
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4138");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter29.getClassInfo();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.visitInnerClass("L530460290", "L1834720", "L1945580544", 0);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4139");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1189511248", "L1666370368");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4140");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.end_class();
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4141");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class<?> wildcardClass4 = classEmitter0.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type12, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type10, typeArray21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        boolean boolean26 = type10.equals((java.lang.Object) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter31.getClassInfo();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean36 = type8.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter37.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter45.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter45.visitEnd();
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4142");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classAdapter53);
        org.mockito.asm.ClassAdapter classAdapter55 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter46.visitInnerClass("(FCFFB)LL1733337266;", "L1878536413", "", (int) (short) -1);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4143");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type11, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type9, typeArray20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        boolean boolean25 = type9.equals((java.lang.Object) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter29.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type44, type46, type47, type49, type51 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("", type43, typeArray52);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", type41, typeArray52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter55.getClassInfo();
        boolean boolean57 = type41.equals((java.lang.Object) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter59 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassInfo classInfo62 = classEmitter61.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter64 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassInfo classInfo69 = classEmitter66.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter74 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter75.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter76.visitInnerClass("ckito/cglib/core/ClassEmitter", "L1474832217", "L1384729257", 47);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4144");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(FCFFB)B");
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = type1.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type11, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type9, typeArray20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        boolean boolean25 = type9.equals((java.lang.Object) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter23.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter31);
        boolean boolean33 = type1.equals((java.lang.Object) classEmitter32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter32.visitInnerClass("L1796301050", "L438318110", "L655451480", 39);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4145");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = classEmitter29.getSuperType();
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4146");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitSource("L1722699052", "L1690109222");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4147");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        int int11 = type10.getSort();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = 0L;
        java.lang.Object obj15 = new java.lang.Object();
        label12.info = obj15;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type18, typeArray29);
        label12.info = typeArray29;
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type10, typeArray29);
        int int34 = type10.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type39, type41, type42, type44, type46 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type38, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type36, typeArray47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter50.getClassInfo();
        boolean boolean52 = type36.equals((java.lang.Object) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter54 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo58 = classEmitter57.getClassInfo();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        boolean boolean60 = type10.equals((java.lang.Object) classEmitter57);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str67 = type66.getDescriptor();
        int int69 = type66.getOpcode((int) '#');
        java.lang.String str70 = type66.getDescriptor();
        int int71 = type66.getSort();
        org.mockito.cglib.core.Local local72 = new org.mockito.cglib.core.Local(1, type66);
        java.lang.String str73 = type66.getDescriptor();
        org.mockito.asm.Type type75 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str77 = type76.getDescriptor();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str80 = type79.getDescriptor();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str82 = type81.getDescriptor();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray84 = new org.mockito.asm.Type[] { type76, type78, type79, type81, type83 };
        org.mockito.cglib.core.Signature signature85 = new org.mockito.cglib.core.Signature("", type75, typeArray84);
        org.mockito.asm.Type[] typeArray86 = signature85.getArgumentTypes();
        java.lang.String str87 = signature85.getDescriptor();
        org.mockito.asm.Type[] typeArray88 = signature85.getArgumentTypes();
        java.lang.String str89 = signature85.getName();
        java.lang.String str90 = signature85.getDescriptor();
        java.lang.String str91 = signature85.getDescriptor();
        org.mockito.asm.Type[] typeArray92 = signature85.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.begin_class(96, 171, "L(FCFFB)Lorg/mockito/cglib/core/Signature;;", type66, typeArray92, "L1590909956L1733337266");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4148");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter30);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter32.visitEnd();
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4149");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter6.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type16, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type13, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type11, typeArray22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter25.getClassInfo();
        boolean boolean27 = type11.equals((java.lang.Object) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type46, type48, type49, type51, type53 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("", type45, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type43, typeArray54);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo58 = classEmitter57.getClassInfo();
        boolean boolean59 = type43.equals((java.lang.Object) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter61 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter60);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassInfo classInfo64 = classEmitter63.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassInfo classInfo71 = classEmitter68.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo75 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter77 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter78 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter78.visitSource("L808781503", "L1155053991");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4150");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = classEmitter28.visitAnnotation("L1905581314", true);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4151");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter3.getClassType();
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4152");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter7.getStaticHook();
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4153");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classAdapter4.visitAnnotation("L814100905", false);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4154");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter21.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitEnd();
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4155");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter4.getClassType();
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4156");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("(SCFFF)B");
        int int26 = type25.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type33, type34, type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type30, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type28, typeArray39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter42.getClassInfo();
        boolean boolean44 = type28.equals((java.lang.Object) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter45);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter48.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter50 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter48);
        boolean boolean51 = type25.equals((java.lang.Object) classAdapter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter50);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.asm.ClassAdapter classAdapter55 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str61 = type60.getDescriptor();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str64 = type63.getDescriptor();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str66 = type65.getDescriptor();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type60, type62, type63, type65, type67 };
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("", type59, typeArray68);
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("", type57, typeArray68);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo72 = classEmitter71.getClassInfo();
        boolean boolean73 = type57.equals((java.lang.Object) classEmitter71);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter75 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter74);
        classEmitter71.setTarget((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter71);
        org.mockito.cglib.core.ClassInfo classInfo78 = classEmitter77.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter79 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter81 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter83);
        org.mockito.asm.ClassAdapter classAdapter85 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter84);
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classAdapter85);
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classAdapter85);
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter88.visitOuterClass("L1332551421", "L88883001", "L1812903317");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4157");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type26, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type24, typeArray35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        boolean boolean40 = type24.equals((java.lang.Object) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter46);
        org.mockito.asm.ClassAdapter classAdapter48 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter46);
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter46.visitSource("L362009107", "L293714235");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4158");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter30.visitOuterClass("L71179075", "C", "L753038850(FCFFB)J");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4159");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 0L;
        java.lang.Object obj3 = new java.lang.Object();
        label0.info = obj3;
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters8 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("L22988295", "(FCFFB)B", "L1733337266");
        label0.info = arrayDelimiters8;
        java.lang.String str10 = label0.toString();
        java.lang.String str11 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter18.getClassInfo();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type28, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type25, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type23, typeArray34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter37.getClassInfo();
        boolean boolean39 = type23.equals((java.lang.Object) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str62 = type61.getDescriptor();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str64 = type63.getDescriptor();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type58, type60, type61, type63, type65 };
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("", type57, typeArray66);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("", type55, typeArray66);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo70 = classEmitter69.getClassInfo();
        boolean boolean71 = type55.equals((java.lang.Object) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter73 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter72);
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassInfo classInfo76 = classEmitter75.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter78 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter80);
        classEmitter75.setTarget((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.cglib.core.ClassInfo classInfo83 = classEmitter80.getClassInfo();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter80);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo87 = classEmitter14.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        label0.info = classEmitter12;
        org.mockito.asm.ClassAdapter classAdapter90 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter91 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitInnerClass("L1641933961", "L46243228", "L804057461", (int) (short) 10);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4160");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitEnd();
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4161");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("L894003596");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((-1), type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter25.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        boolean boolean32 = type2.equals((java.lang.Object) classEmitter25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter25.visitEnd();
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4162");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type11, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type9, typeArray20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        boolean boolean25 = type9.equals((java.lang.Object) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter29.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type44, type46, type47, type49, type51 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("", type43, typeArray52);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", type41, typeArray52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter55.getClassInfo();
        boolean boolean57 = type41.equals((java.lang.Object) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter59 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassInfo classInfo62 = classEmitter61.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter64 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassInfo classInfo69 = classEmitter66.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("Lorg.mockito.asm.Type;", "(SCLorg/mockito/cglib/core/ClassEmitter;VCLS;)F", "L1474832217");
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4163");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("S", "(FCFFB)B");
        org.mockito.asm.Type[] typeArray35 = signature34.getArgumentTypes();
        java.lang.String str36 = signature34.toString();
        java.lang.String str37 = signature34.toString();
        java.lang.String str38 = signature34.getName();
        org.mockito.asm.Type type39 = signature34.getReturnType();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        java.lang.Class<?> wildcardClass44 = classEmitter40.getClass();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str54 = type53.getDescriptor();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str57 = type56.getDescriptor();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type53, type55, type56, type58, type60 };
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("", type52, typeArray61);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("", type50, typeArray61);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo65 = classEmitter64.getClassInfo();
        boolean boolean66 = type50.equals((java.lang.Object) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter68 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter67);
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo72 = classEmitter71.getClassInfo();
        classEmitter70.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter71);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter71);
        boolean boolean76 = type48.equals((java.lang.Object) classEmitter71);
        java.lang.String str77 = type48.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter28.declare_field(159, "L616110067", type39, (java.lang.Object) type48);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4164");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitEnd();
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4165");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter34.getClassInfo();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        java.lang.Class<?> wildcardClass37 = classEmitter33.getClass();
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        int int42 = type40.getOpcode(0);
        java.lang.String str43 = type40.getInternalName();
        java.lang.String str44 = type40.getClassName();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str53 = type52.getDescriptor();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type47, type49, type50, type52, type54 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type46, typeArray55);
        org.mockito.asm.Type[] typeArray57 = signature56.getArgumentTypes();
        java.lang.String str58 = signature56.getDescriptor();
        org.mockito.asm.Type[] typeArray59 = signature56.getArgumentTypes();
        java.lang.String str60 = signature56.getName();
        java.lang.String str61 = signature56.getDescriptor();
        java.lang.String str62 = signature56.getDescriptor();
        org.mockito.asm.Type[] typeArray63 = signature56.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter26.begin_class(116, 165, "L665088572", type40, typeArray63, "L1815183985");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4166");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = classEmitter22.getSuperType();
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4167");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4168");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter31.visitEnd();
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4169");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter21.getClassInfo();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitEnd();
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4170");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.visitInnerClass("L1484766046", "L614990037", "L193227378", 101);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4171");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L431115766", "L1384729257");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4172");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter33.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter39);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter39);
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter39.visitInnerClass("", "L1950176987", "L530460290", 47);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4173");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        boolean boolean43 = type27.equals((java.lang.Object) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter41.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter50.getClassInfo();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter49.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter54 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo59 = classEmitter58.getClassInfo();
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassInfo classInfo61 = classEmitter57.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter62 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classAdapter62);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classAdapter62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter62.visitOuterClass("L188908942", "L(FCFFB)C;", "");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4174");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitSource("L726877741", "(FCFFB)Lorg/mockito/cglib/core/LocalVariablesSorter;");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4175");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter6.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type16, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type13, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type11, typeArray22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter25.getClassInfo();
        boolean boolean27 = type11.equals((java.lang.Object) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type46, type48, type49, type51, type53 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("", type45, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type43, typeArray54);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo58 = classEmitter57.getClassInfo();
        boolean boolean59 = type43.equals((java.lang.Object) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter61 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter60);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassInfo classInfo64 = classEmitter63.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassInfo classInfo71 = classEmitter68.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo75 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter77 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter78 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter77);
        org.mockito.asm.ClassAdapter classAdapter79 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter78.visitInnerClass("L1152781857", "L485966752", "L2087457269", 159);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4176");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitSource("", "L1281328698L24805710");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4177");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter25.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("(SCFFF)B");
        int int30 = type29.getSort();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type35, type37, type38, type40, type42 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("", type34, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type32, typeArray43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        boolean boolean48 = type32.equals((java.lang.Object) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter50 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter52.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter54 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter52);
        boolean boolean55 = type29.equals((java.lang.Object) classAdapter54);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter54);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.asm.ClassAdapter classAdapter59 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter59.visitOuterClass("L1602883146", "", "(FCFFB)S");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4178");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L373083987");
        java.lang.String str2 = type1.toString();
        int int4 = type1.getOpcode(4);
        int int6 = type1.getOpcode(132);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type18, type19, type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type15, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type13, typeArray24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        boolean boolean29 = type13.equals((java.lang.Object) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        boolean boolean42 = type1.equals((java.lang.Object) classEmitter7);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str53 = type52.getDescriptor();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type47, type49, type50, type52, type54 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type46, typeArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("", type44, typeArray55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo59 = classEmitter58.getClassInfo();
        boolean boolean60 = type44.equals((java.lang.Object) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter62 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo66 = classEmitter65.getClassInfo();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter64.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter70 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.asm.ClassAdapter classAdapter72 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.asm.ClassAdapter classAdapter75 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter77 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.asm.ClassAdapter classAdapter79 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassInfo classInfo81 = classEmitter76.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter82 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classAdapter82);
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter82);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type86 = classEmitter7.getSuperType();
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4179");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type40, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", type37, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type35, typeArray46);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo50 = classEmitter49.getClassInfo();
        boolean boolean51 = type35.equals((java.lang.Object) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo58 = classEmitter57.getClassInfo();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo64 = classEmitter63.getClassInfo();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.asm.ClassAdapter classAdapter67 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter67);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = classEmitter21.visitAnnotation("L1559936595", false);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4180");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L712744422", "L1173526464");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4181");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.end_class();
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4182");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type10, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type8, typeArray19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        boolean boolean24 = type8.equals((java.lang.Object) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter29.getClassInfo();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = classEmitter1.getAccess();
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4183");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitEnd();
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4184");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitInnerClass("L505264565", "L96878127", "L886620262", 157);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4185");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter29.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.visitEnd();
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4186");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.getDescriptor();
        boolean boolean16 = type0.equals((java.lang.Object) signature13);
        java.lang.String str17 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type0.getInternalName();
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4187");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter5.getSuperType();
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4188");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(10, type11);
        org.mockito.asm.Type type13 = local12.getType();
        int int14 = local12.getIndex();
        org.mockito.asm.Type type15 = local12.getType();
        java.lang.String str16 = type15.getDescriptor();
        java.lang.String str17 = type15.toString();
        java.lang.String str18 = type15.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type25, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type22, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type20, typeArray31);
        java.lang.String str34 = signature33.getDescriptor();
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str38 = signature37.getName();
        boolean boolean40 = signature37.equals((java.lang.Object) (short) -1);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str49 = type48.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type45, type47, type48, type50, type52 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", type44, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("", type42, typeArray53);
        java.lang.String str56 = signature55.getDescriptor();
        boolean boolean57 = signature37.equals((java.lang.Object) str56);
        java.lang.String str58 = signature37.getDescriptor();
        boolean boolean59 = signature33.equals((java.lang.Object) str58);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str66 = type65.getDescriptor();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str69 = type68.getDescriptor();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str71 = type70.getDescriptor();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray73 = new org.mockito.asm.Type[] { type65, type67, type68, type70, type72 };
        org.mockito.cglib.core.Signature signature74 = new org.mockito.cglib.core.Signature("", type64, typeArray73);
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("", type62, typeArray73);
        org.mockito.cglib.core.Local local76 = new org.mockito.cglib.core.Local(3, type62);
        int int77 = local76.getIndex();
        org.mockito.asm.Type type78 = local76.getType();
        boolean boolean79 = signature33.equals((java.lang.Object) local76);
        org.mockito.asm.Type[] typeArray80 = signature33.getArgumentTypes();
        org.mockito.asm.Type type81 = signature33.getReturnType();
        org.mockito.asm.Type type82 = signature33.getReturnType();
        java.lang.String str83 = signature33.toString();
        org.mockito.asm.Type[] typeArray84 = signature33.getArgumentTypes();
        org.mockito.asm.Type[] typeArray85 = signature33.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.begin_class(11, 0, "hi!(FCFFB)Lorg/mockito/cglib/core/ClassEmitter;", type15, typeArray85, "L643584433");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4189");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 0L;
        java.lang.Object obj3 = new java.lang.Object();
        label0.info = obj3;
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters8 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("L22988295", "(FCFFB)B", "L1733337266");
        label0.info = arrayDelimiters8;
        java.lang.String str10 = label0.toString();
        java.lang.Object obj11 = label0.info;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type26, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type23, typeArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type21, typeArray32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter35.getClassInfo();
        boolean boolean37 = type21.equals((java.lang.Object) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter35.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter45);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classAdapter46);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter48.getClassInfo();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str55 = type54.getDescriptor();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str58 = type57.getDescriptor();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str60 = type59.getDescriptor();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type54, type56, type57, type59, type61 };
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("", type53, typeArray62);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("", type51, typeArray62);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo66 = classEmitter65.getClassInfo();
        boolean boolean67 = type51.equals((java.lang.Object) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter69 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassInfo classInfo72 = classEmitter65.getClassInfo();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter75 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.asm.ClassAdapter classAdapter76 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter75);
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classAdapter76);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classAdapter76);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classAdapter76);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter81 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.asm.ClassAdapter classAdapter82 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter81);
        org.mockito.asm.ClassAdapter classAdapter83 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter82);
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter83);
        org.mockito.asm.ClassAdapter classAdapter85 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter83);
        org.mockito.cglib.core.ClassEmitter classEmitter86 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter85);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classAdapter85);
        org.mockito.cglib.core.ClassInfo classInfo88 = classEmitter13.getClassInfo();
        label0.info = classEmitter13;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter13.visitEnd();
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4190");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = classEmitter26.visitAnnotation("L1321148562", true);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4191");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter29.getClassInfo();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter36.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.ClassAdapter classAdapter43 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str54 = type53.getDescriptor();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type50, type52, type53, type55, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("", type49, typeArray58);
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("", type47, typeArray58);
        java.lang.String str61 = signature60.getDescriptor();
        org.mockito.asm.Type type62 = signature60.getReturnType();
        int int63 = type62.getSort();
        int int64 = type62.getSize();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str72 = type71.getDescriptor();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str75 = type74.getDescriptor();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str77 = type76.getDescriptor();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray79 = new org.mockito.asm.Type[] { type71, type73, type74, type76, type78 };
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("", type70, typeArray79);
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("", type68, typeArray79);
        java.lang.String str82 = type68.toString();
        org.mockito.cglib.core.Local local83 = new org.mockito.cglib.core.Local(158, type68);
        org.mockito.asm.Type type84 = local83.getType();
        org.mockito.cglib.core.Local local85 = new org.mockito.cglib.core.Local((-1), type84);
        java.lang.String str86 = type84.toString();
        java.lang.String str87 = type84.toString();
        java.lang.Class<?> wildcardClass88 = type84.getClass();
        java.lang.String str89 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.declare_field(110, "LL1625180428;", type62, (java.lang.Object) str89);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4192");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 0L;
        java.lang.Object obj3 = new java.lang.Object();
        label0.info = obj3;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type8, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type6, typeArray17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        boolean boolean22 = type6.equals((java.lang.Object) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter34.getClassInfo();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        label0.info = classEmitter20;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type44, type46, type47, type49, type51 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("", type43, typeArray52);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", type41, typeArray52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter55.getClassInfo();
        boolean boolean57 = type41.equals((java.lang.Object) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter59 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter62 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter68 = classEmitter20.getStaticHook();
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4193");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter28.visitEnd();
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4194");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter33 = classEmitter32.getStaticHook();
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4195");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type[] typeArray16 = signature14.getArgumentTypes();
        java.lang.String str17 = signature14.getDescriptor();
        java.lang.String str18 = signature14.getName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        java.lang.String str32 = signature30.getDescriptor();
        org.mockito.asm.Type type33 = signature30.getReturnType();
        boolean boolean34 = signature14.equals((java.lang.Object) type33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        boolean boolean40 = type33.equals((java.lang.Object) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter38.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter38.visitOuterClass("L1529460696", "", "L2011835260");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4196");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter23.visitOuterClass("L71179075", "L2058098915LL991702334;", "L1763352676");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4197");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 0L;
        java.lang.Object obj14 = new java.lang.Object();
        label11.info = obj14;
        java.lang.Object obj16 = label11.info;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type21, type22, type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type18, typeArray27);
        label11.info = typeArray27;
        java.lang.String str30 = label11.toString();
        java.lang.String str31 = label11.toString();
        java.lang.String str32 = label11.toString();
        java.lang.String str33 = label11.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter35.getClassInfo();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        java.lang.Class<?> wildcardClass38 = classEmitter34.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        java.lang.String str40 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type43 = type42.getElementType();
        label11.info = type43;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str54 = type53.getDescriptor();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type50, type52, type53, type55, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("", type49, typeArray58);
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("", type47, typeArray58);
        java.lang.String str61 = signature60.getDescriptor();
        org.mockito.asm.Type[] typeArray62 = signature60.getArgumentTypes();
        java.lang.String str63 = signature60.getDescriptor();
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("S", "(FCFFB)B");
        org.mockito.asm.Type[] typeArray67 = signature66.getArgumentTypes();
        boolean boolean68 = signature60.equals((java.lang.Object) signature66);
        java.lang.Class<?> wildcardClass69 = signature66.getClass();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass69);
        java.lang.String str71 = type70.toString();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str74 = type73.getDescriptor();
        int int76 = type73.getOpcode((int) '#');
        int int77 = type73.getSize();
        org.mockito.asm.Type type79 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type81 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type82 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str83 = type82.getDescriptor();
        org.mockito.asm.Type type84 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type85 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str86 = type85.getDescriptor();
        org.mockito.asm.Type type87 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str88 = type87.getDescriptor();
        org.mockito.asm.Type type89 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray90 = new org.mockito.asm.Type[] { type82, type84, type85, type87, type89 };
        org.mockito.cglib.core.Signature signature91 = new org.mockito.cglib.core.Signature("", type81, typeArray90);
        org.mockito.cglib.core.Signature signature92 = new org.mockito.cglib.core.Signature("", type79, typeArray90);
        org.mockito.cglib.core.Signature signature93 = new org.mockito.cglib.core.Signature("", type73, typeArray90);
        java.lang.String str94 = signature93.toString();
        org.mockito.asm.Type[] typeArray95 = signature93.getArgumentTypes();
        org.mockito.cglib.core.Signature signature96 = new org.mockito.cglib.core.Signature("L25293607", type70, typeArray95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.begin_class(159, 97, "L745743353", type43, typeArray95, "L1625180428(FCFFB)L(FF)B;");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4198");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = classEmitter4.getAccess();
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4199");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter28.visitSource("(FCFFB)L(FCFFB)V;", "L1312164209");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4200");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("CF");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        org.mockito.asm.Type[] typeArray18 = signature16.getArgumentTypes();
        org.mockito.asm.Type[] typeArray19 = signature16.getArgumentTypes();
        org.mockito.asm.Type[] typeArray20 = signature16.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type1.getDimensions();
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4201");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter27.visitInnerClass("S", "L638844583", "L1522936647", (int) 'a');
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4202");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter26.visitOuterClass("L1859536420", "L903486813", "L1674576029");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4203");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        boolean boolean43 = type27.equals((java.lang.Object) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter41.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = classEmitter17.visitAnnotation("L1538635289", true);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4204");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter25.getClassInfo();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type34, type36, type37, type39, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("", type33, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("", type31, typeArray42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo46 = classEmitter45.getClassInfo();
        boolean boolean47 = type31.equals((java.lang.Object) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter45.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str58 = type57.getDescriptor();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str61 = type60.getDescriptor();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str63 = type62.getDescriptor();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type57, type59, type60, type62, type64 };
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("", type56, typeArray65);
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("", type54, typeArray65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo69 = classEmitter68.getClassInfo();
        boolean boolean70 = type54.equals((java.lang.Object) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter72 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter71);
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassInfo classInfo75 = classEmitter74.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter76 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter74);
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classAdapter76);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classAdapter76);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter76);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter76);
        org.mockito.asm.ClassAdapter classAdapter81 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter81.visitSource("L1831525941", "L1674576029");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4205");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitInnerClass("L1722699052", "L1114865407", "L1179086462", 122);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4206");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        label0.info = str3;
        java.lang.String str5 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        label0.info = classEmitter8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = classEmitter8.getClassType();
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4207");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter25.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter25.visitSource("L1878536413", "");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4208");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter28.visitInnerClass("L15551440", "L1953570282", "L1384870924", 128);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4209");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4210");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter21.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.end_class();
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4211");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("(SCFFF)B");
        int int26 = type25.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type33, type34, type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type30, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type28, typeArray39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter42.getClassInfo();
        boolean boolean44 = type28.equals((java.lang.Object) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter45);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter48.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter50 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter48);
        boolean boolean51 = type25.equals((java.lang.Object) classAdapter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter50);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter54.visitEnd();
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4212");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 0L;
        java.lang.Object obj3 = new java.lang.Object();
        label0.info = obj3;
        java.lang.Object obj5 = label0.info;
        java.lang.String str6 = label0.toString();
        java.lang.String str7 = label0.toString();
        java.lang.String str8 = label0.toString();
        java.lang.Object obj9 = label0.info;
        java.lang.Object obj10 = label0.info;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type17, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type14, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type12, typeArray23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        boolean boolean28 = type12.equals((java.lang.Object) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter33.getClassInfo();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter32.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        label0.info = classEmitter32;
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter41);
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter44);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classAdapter44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter32.end_class();
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4213");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter28.visitInnerClass("L256357634", "L38006646", "L150467656", 156);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4214");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L362616238", "L120989026");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        boolean boolean28 = signature2.equals((java.lang.Object) classAdapter27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = classAdapter27.visitAnnotation("LL939898633;", true);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4215");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type10, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type8, typeArray19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        boolean boolean24 = type8.equals((java.lang.Object) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter43.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter43.getClassInfo();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter51);
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter52);
        org.mockito.asm.ClassAdapter classAdapter54 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter53);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classAdapter53);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter53);
        org.mockito.asm.ClassAdapter classAdapter59 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter59.visitOuterClass("L2022010091", "LF;", "float(FCFFB)S");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4216");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(FF)B");
        org.mockito.asm.Type type3 = type2.getElementType();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        org.mockito.asm.Type[] typeArray20 = signature18.getArgumentTypes();
        org.mockito.asm.Type[] typeArray21 = signature18.getArgumentTypes();
        boolean boolean22 = type3.equals((java.lang.Object) signature18);
        java.lang.String str23 = type3.getClassName();
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 1, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type3.getElementType();
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4217");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type10, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type8, typeArray19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        boolean boolean24 = type8.equals((java.lang.Object) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter43.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter43.getClassInfo();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter51);
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter52);
        org.mockito.asm.ClassAdapter classAdapter54 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter53);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classAdapter53);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter53);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getObjectType("F");
        int int64 = type63.getSort();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str68 = type67.getDescriptor();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str71 = type70.getDescriptor();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str73 = type72.getDescriptor();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray75 = new org.mockito.asm.Type[] { type67, type69, type70, type72, type74 };
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("", type66, typeArray75);
        org.mockito.asm.Type[] typeArray77 = signature76.getArgumentTypes();
        java.lang.String str78 = signature76.getDescriptor();
        org.mockito.asm.Type[] typeArray79 = signature76.getArgumentTypes();
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("C", "S");
        org.mockito.asm.Type type83 = signature82.getReturnType();
        java.lang.String str84 = signature82.getName();
        boolean boolean85 = signature76.equals((java.lang.Object) signature82);
        org.mockito.asm.Type[] typeArray86 = signature76.getArgumentTypes();
        org.mockito.asm.Type[] typeArray87 = signature76.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(147, 32, "L344271292", type63, typeArray87, "L201784834");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4218");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int31 = classEmitter28.getAccess();
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4219");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        int int15 = type14.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type20, type22, type23, type25, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type19, typeArray28);
        org.mockito.asm.Type[] typeArray30 = signature29.getArgumentTypes();
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray30);
        int int34 = type14.getOpcode(4);
        java.lang.String str35 = type14.getDescriptor();
        int int36 = type14.getSort();
        int int37 = type14.getSort();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter43.getClassInfo();
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter47 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        boolean boolean52 = type14.equals((java.lang.Object) classEmitter49);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter55 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.asm.ClassAdapter classAdapter59 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter49.visitOuterClass("(FCFFB)Lfloat(FCFFB)S;", "", "L77544733");
    }
}

