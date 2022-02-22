import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] { "F", "C", "(FCFFB)S", "", "C" };
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
        java.lang.String str25 = signature24.getDescriptor();
        org.mockito.asm.Type[] typeArray26 = signature24.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter0, strArray9, typeArray26);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "byte", "hi!", "(FCFFB)S", "I", "", "(SCFFF)B" };
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
        org.mockito.asm.Type[] typeArray40 = signature39.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter18, strArray27, typeArray40);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray3 = new java.lang.String[] { "F" };
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
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(3, type18);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type37, type39, type40, type42, type44 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type36, typeArray45);
        org.mockito.asm.Type[] typeArray47 = signature46.getArgumentTypes();
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        java.lang.String str51 = type49.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        int int58 = type55.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type18, type33, type49, type52, type55 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter0, strArray3, typeArray59);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "C", "" };
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter21, strArray27, typeArray59);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] { "(FF)B", "L1984525940", "L1118372422", "(FCFFB)F", "org/mockito/cglib/core/ClassEmitter", "L456847068" };
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        int int14 = type13.getSort();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 0L;
        java.lang.Object obj18 = new java.lang.Object();
        label15.info = obj18;
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
        label15.info = typeArray32;
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type13, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter0, strArray11, typeArray32);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        java.lang.String[] strArray63 = new java.lang.String[] { "B", "L1984525940" };
        org.mockito.asm.Type type65 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str69 = type68.getDescriptor();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str72 = type71.getDescriptor();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str74 = type73.getDescriptor();
        org.mockito.asm.Type type75 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray76 = new org.mockito.asm.Type[] { type68, type70, type71, type73, type75 };
        org.mockito.cglib.core.Signature signature77 = new org.mockito.cglib.core.Signature("", type67, typeArray76);
        org.mockito.cglib.core.Signature signature78 = new org.mockito.cglib.core.Signature("", type65, typeArray76);
        java.lang.String str79 = type65.toString();
        int int80 = type65.getSize();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str82 = type81.toString();
        org.mockito.asm.Type type84 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type85 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str86 = type85.getDescriptor();
        org.mockito.asm.Type type87 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type88 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str89 = type88.getDescriptor();
        org.mockito.asm.Type type90 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str91 = type90.getDescriptor();
        org.mockito.asm.Type type92 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray93 = new org.mockito.asm.Type[] { type85, type87, type88, type90, type92 };
        org.mockito.cglib.core.Signature signature94 = new org.mockito.cglib.core.Signature("", type84, typeArray93);
        org.mockito.asm.Type[] typeArray95 = signature94.getArgumentTypes();
        java.lang.String str96 = org.mockito.asm.Type.getMethodDescriptor(type81, typeArray95);
        java.lang.String str97 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter17, strArray63, typeArray95);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        java.lang.String[] strArray9 = new java.lang.String[] { "(FCFFB)S", "(SCFFF)B", "short" };
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
        java.lang.String str25 = signature24.getDescriptor();
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str29 = signature28.getName();
        boolean boolean31 = signature28.equals((java.lang.Object) (short) -1);
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
        java.lang.String str47 = signature46.getDescriptor();
        boolean boolean48 = signature28.equals((java.lang.Object) str47);
        java.lang.String str49 = signature28.getDescriptor();
        boolean boolean50 = signature24.equals((java.lang.Object) str49);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str57 = type56.getDescriptor();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str60 = type59.getDescriptor();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str62 = type61.getDescriptor();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type56, type58, type59, type61, type63 };
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type55, typeArray64);
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("", type53, typeArray64);
        org.mockito.cglib.core.Local local67 = new org.mockito.cglib.core.Local(3, type53);
        int int68 = local67.getIndex();
        org.mockito.asm.Type type69 = local67.getType();
        boolean boolean70 = signature24.equals((java.lang.Object) local67);
        org.mockito.asm.Type[] typeArray71 = signature24.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter3, strArray9, typeArray71);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        java.lang.String[] strArray28 = new java.lang.String[] { "S(FCFFB)B" };
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
        java.lang.String str44 = signature43.getDescriptor();
        org.mockito.asm.Type[] typeArray45 = signature43.getArgumentTypes();
        java.lang.String str46 = signature43.getDescriptor();
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("S", "(FCFFB)B");
        org.mockito.asm.Type[] typeArray50 = signature49.getArgumentTypes();
        boolean boolean51 = signature43.equals((java.lang.Object) signature49);
        java.lang.String str52 = signature49.getDescriptor();
        org.mockito.asm.Type[] typeArray53 = signature49.getArgumentTypes();
        java.lang.String str54 = signature49.toString();
        org.mockito.asm.Type[] typeArray55 = signature49.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter22, strArray28, typeArray55);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        java.lang.String[] strArray11 = new java.lang.String[] { "L1564900518", "L1480450190(SCLorg/mockito/cglib/core/ClassEmitter;VCLS;)F" };
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("L456847068");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("L1588554992");
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
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        java.lang.String str30 = signature28.getDescriptor();
        boolean boolean32 = signature28.equals((java.lang.Object) (byte) 10);
        org.mockito.asm.Type[] typeArray33 = signature28.getArgumentTypes();
        org.mockito.asm.Type type34 = signature28.getReturnType();
        org.mockito.asm.Type[] typeArray35 = signature28.getArgumentTypes();
        org.mockito.asm.Type[] typeArray36 = signature28.getArgumentTypes();
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray36);
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
        java.lang.String str51 = signature49.getDescriptor();
        org.mockito.asm.Type[] typeArray52 = signature49.getArgumentTypes();
        org.mockito.asm.Type[] typeArray53 = signature49.getArgumentTypes();
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("L1137833528", type16, typeArray53);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter8, strArray11, typeArray53);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray12 = new java.lang.String[] { "L1742778472", "int", "L435791199", "L2068534716", "L276237886", "LL521240652;" };
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type19, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type16, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type14, typeArray25);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        org.mockito.asm.Type[] typeArray29 = signature27.getArgumentTypes();
        org.mockito.asm.Type[] typeArray30 = signature27.getArgumentTypes();
        java.lang.String str31 = signature27.toString();
        org.mockito.asm.Type[] typeArray32 = signature27.getArgumentTypes();
        java.lang.String str33 = signature27.getDescriptor();
        java.lang.String str34 = signature27.getName();
        org.mockito.asm.Type[] typeArray35 = signature27.getArgumentTypes();
        java.lang.String str36 = signature27.getDescriptor();
        java.lang.String str37 = signature27.getName();
        org.mockito.asm.Type type38 = signature27.getReturnType();
        org.mockito.asm.Type[] typeArray39 = signature27.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter5, strArray12, typeArray39);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "CF");
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        boolean boolean15 = signature2.equals((java.lang.Object) classEmitter11);
        java.lang.String[] strArray21 = new java.lang.String[] { "L1753821432(FCFFB)Lorg/mockito/cglib/core/ClassEmitter;", "LL1209657961;", "L1889216243L1945883025", "L655423809", "L2119059187" };
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        int int26 = type23.getOpcode((int) '#');
        int int27 = type23.getSize();
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
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("", type23, typeArray40);
        org.mockito.asm.Type[] typeArray44 = signature43.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter11, strArray21, typeArray44);
    }
}

