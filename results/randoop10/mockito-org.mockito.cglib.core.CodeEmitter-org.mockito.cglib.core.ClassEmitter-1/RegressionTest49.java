import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest49 {

    public static boolean debug = false;

    @Test
    public void test24501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24501");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        label0.info = classEmitter3;
        java.lang.Object obj10 = label0.info;
        java.lang.Object obj11 = label0.info;
        java.lang.Class<?> wildcardClass12 = label0.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1621908970" + "'", str1, "L1621908970");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/Label" + "'", str14, "org/mockito/asm/Label");
    }

    @Test
    public void test24502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24502");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitInsn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24503");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int4 = type3.getDimensions();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type10, type13 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type20, type23 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type6, type7, type9, type17, type19, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray29);
        int int31 = type3.getDimensions();
        java.lang.String str32 = type3.getInternalName();
        int int33 = type3.getSort();
        java.lang.String str34 = type3.getInternalName();
        int int35 = type3.getDimensions();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        java.lang.String str38 = type37.getClassName();
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("F", "(VLhi!;)Lhi!;");
        org.mockito.asm.Type type42 = signature41.getReturnType();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo46 = classEmitter45.getClassInfo();
        boolean boolean47 = signature41.equals((java.lang.Object) classInfo46);
        org.mockito.asm.Type[] typeArray48 = signature41.getArgumentTypes();
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("L751103458", type3, typeArray48);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.Class<?> wildcardClass52 = type51.getClass();
        java.lang.String str53 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass52);
        java.lang.String str54 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass52);
        boolean boolean55 = type3.equals((java.lang.Object) str54);
        java.lang.String str56 = type3.getDescriptor();
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(VLhi!;)Lhi!;" + "'", str16, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(VLhi!;)Lhi!;" + "'", str26, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(VLhi!;)Lhi!;" + "'", str32, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(VLhi!;)Lhi!;" + "'", str34, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(VLhi!;)Lhi!;" + "'", str38, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str49, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org/mockito/asm/Type" + "'", str53, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org/mockito/asm/Type" + "'", str54, "org/mockito/asm/Type");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str56, "L(VLhi!;)Lhi!;;");
    }

    @Test
    public void test24504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24504");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int3 = type2.getDimensions();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type9, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type5, type6, type8, type16, type18, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int33 = type32.getDimensions();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (short) 0, type42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type42 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local((int) (short) 0, type52);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type49, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type35, type36, type38, type46, type48, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray58);
        boolean boolean60 = signature29.equals((java.lang.Object) "hi!");
        org.mockito.asm.Type[] typeArray61 = signature29.getArgumentTypes();
        java.lang.String str62 = signature29.toString();
        java.lang.String str63 = signature29.getName();
        java.lang.String str64 = signature29.getName();
        org.mockito.asm.Type type65 = signature29.getReturnType();
        java.lang.String str66 = signature29.getName();
        java.lang.String str67 = signature29.getDescriptor();
        org.mockito.asm.Type[] typeArray68 = signature29.getArgumentTypes();
        java.lang.String str69 = signature29.getName();
        java.lang.String str70 = signature29.getName();
        org.mockito.asm.Type type71 = signature29.getReturnType();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(VLhi!;)Lhi!;" + "'", str15, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(VLhi!;)Lhi!;" + "'", str25, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(VLhi!;)Lhi!;" + "'", str45, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(VLhi!;)Lhi!;" + "'", str55, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str62, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str67, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(type71);
    }

    @Test
    public void test24505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24505");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("(VLhi!;)L(VLhi!;)Lhi!;;");
        org.mockito.asm.Type type4 = type3.getElementType();
        java.lang.String str5 = type3.toString();
        boolean boolean7 = type3.equals((java.lang.Object) 133);
        java.lang.String str8 = type3.toString();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("F", "(VLhi!;)Lhi!;");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = signature11.equals((java.lang.Object) classInfo16);
        org.mockito.asm.Type[] typeArray18 = signature11.getArgumentTypes();
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("L652957166", type3, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int23 = type22.getDimensions();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) (short) 0, type32);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type29, type32 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (short) 0, type42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type42 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type25, type26, type28, type36, type38, type47 };
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray48);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int53 = type52.getDimensions();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type59 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local((int) (short) 0, type62);
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type59, type62 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray64);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type69 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local73 = new org.mockito.cglib.core.Local((int) (short) 0, type72);
        org.mockito.asm.Type[] typeArray74 = new org.mockito.asm.Type[] { type69, type72 };
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray74);
        org.mockito.asm.Type type77 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type55, type56, type58, type66, type68, type77 };
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("hi!", type52, typeArray78);
        boolean boolean80 = signature49.equals((java.lang.Object) "hi!");
        java.lang.String str81 = signature49.toString();
        org.mockito.asm.Type type82 = signature49.getReturnType();
        java.lang.String str83 = signature49.getDescriptor();
        org.mockito.asm.Type type84 = signature49.getReturnType();
        org.mockito.asm.Type[] typeArray85 = signature49.getArgumentTypes();
        org.mockito.cglib.core.Signature signature86 = new org.mockito.cglib.core.Signature("L796850722", type3, typeArray85);
        java.lang.Class<?> wildcardClass87 = typeArray85.getClass();
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L(VLhi!;" + "'", str5, "L(VLhi!;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L(VLhi!;" + "'", str8, "L(VLhi!;");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(VLhi!;)Lhi!;" + "'", str35, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(VLhi!;)Lhi!;" + "'", str45, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "(VLhi!;)Lhi!;" + "'", str65, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(VLhi!;)Lhi!;" + "'", str75, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str81, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str83, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test24506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24506");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(96, 171);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24507");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.String str10 = label9.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getReturnType("(VLhi!;)L(VLhi!;)Lhi!;;");
        label9.info = "(VLhi!;)L(VLhi!;)Lhi!;;";
        java.lang.String str14 = label9.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int18 = type17.getDimensions();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type27);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type24, type27 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) (short) 0, type37);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type34, type37 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type20, type21, type23, type31, type33, type42 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray43);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int48 = type47.getDimensions();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local((int) (short) 0, type57);
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type54, type57 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type64 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local68 = new org.mockito.cglib.core.Local((int) (short) 0, type67);
        org.mockito.asm.Type[] typeArray69 = new org.mockito.asm.Type[] { type64, type67 };
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray69);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray73 = new org.mockito.asm.Type[] { type50, type51, type53, type61, type63, type72 };
        org.mockito.cglib.core.Signature signature74 = new org.mockito.cglib.core.Signature("hi!", type47, typeArray73);
        boolean boolean75 = signature44.equals((java.lang.Object) "hi!");
        java.lang.String str76 = signature44.getDescriptor();
        org.mockito.asm.Type type80 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local81 = new org.mockito.cglib.core.Local((int) (short) 0, type80);
        org.mockito.cglib.core.Local local82 = new org.mockito.cglib.core.Local((int) (short) 1, type80);
        int int83 = local82.getIndex();
        int int84 = local82.getIndex();
        boolean boolean85 = signature44.equals((java.lang.Object) int84);
        java.lang.String str86 = signature44.getDescriptor();
        org.mockito.asm.Type type87 = signature44.getReturnType();
        label9.info = type87;
        java.lang.Object obj89 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitJumpInsn(166, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1070417020" + "'", str10, "L1070417020");
        org.junit.Assert.assertNotNull(type12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1070417020" + "'", str14, "L1070417020");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(VLhi!;)Lhi!;" + "'", str30, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(VLhi!;)Lhi!;" + "'", str40, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(VLhi!;)Lhi!;" + "'", str60, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "(VLhi!;)Lhi!;" + "'", str70, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str76, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str86, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type87);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertEquals(obj89.toString(), "Lhi!;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj89), "Lhi!;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj89), "Lhi!;");
    }

    @Test
    public void test24508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24508");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classAdapter23);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter26);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor38 = classEmitter30.visitField(32, "L227928624", "L541604411", "L95219397", (java.lang.Object) "L1329035552");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo21);
    }

    @Test
    public void test24509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24509");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        java.lang.String str3 = label2.toString();
        java.lang.Object obj4 = label2.info;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        label2.info = classEmitter5;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter25.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter34.getClassInfo();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classAdapter37);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classAdapter37);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter43.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.asm.ClassVisitor classVisitor46 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter(classVisitor46);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter52.getClassInfo();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassInfo classInfo55 = classEmitter51.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.asm.ClassAdapter classAdapter63 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter22.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L847643546" + "'", str3, "L847643546");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo55);
    }

    @Test
    public void test24510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24510");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter25.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        java.lang.String[] strArray40 = new java.lang.String[] { "L1194201856", "L2040643860", "L1730412772", "(VLhi!;)V", "L1411019867" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor41 = classEmitter11.visitMethod((int) 'a', "L257473087", "L;", "L1119651497", strArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5d7701fa");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test24511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24511");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.MethodVisitor methodVisitor5 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        boolean boolean10 = type0.equals((java.lang.Object) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitLdcInsn((java.lang.Object) type14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "D" + "'", str2, "D");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type14);
    }

    @Test
    public void test24512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24512");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter3.visitInnerClass("", "L1030812425", "L782445861", 131);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24513");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int12 = type11.getDimensions();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type18, type21 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) (short) 0, type31);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type28, type31 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type14, type15, type17, type25, type27, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray37);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int42 = type41.getDimensions();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local((int) (short) 0, type51);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type48, type51 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray53);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local((int) (short) 0, type61);
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type58, type61 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type44, type45, type47, type55, type57, type66 };
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("hi!", type41, typeArray67);
        boolean boolean69 = signature38.equals((java.lang.Object) "hi!");
        java.lang.String str70 = signature38.toString();
        java.lang.String str71 = signature38.getDescriptor();
        java.lang.String str72 = signature38.getDescriptor();
        java.lang.String str73 = signature38.getName();
        org.mockito.asm.Type[] typeArray74 = signature38.getArgumentTypes();
        org.mockito.asm.Type[] typeArray75 = signature38.getArgumentTypes();
        java.lang.String str76 = signature38.getDescriptor();
        org.mockito.asm.Type type77 = signature38.getReturnType();
        org.mockito.asm.Label label78 = new org.mockito.asm.Label();
        java.lang.String str79 = label78.toString();
        label78.info = "Li!(Lhi!;";
        java.lang.Object obj82 = null;
        label78.info = obj82;
        boolean boolean84 = signature38.equals((java.lang.Object) label78);
        java.lang.String str85 = label78.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber(126, label78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(VLhi!;)Lhi!;" + "'", str24, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(VLhi!;)Lhi!;" + "'", str34, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(VLhi!;)Lhi!;" + "'", str54, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(VLhi!;)Lhi!;" + "'", str64, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str70, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str71, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str72, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str76, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type77);
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "L1290255045" + "'", str79, "L1290255045");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "L1290255045" + "'", str85, "L1290255045");
    }

    @Test
    public void test24514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24514");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Lorg/mockito/cglib/core/Local;");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (short) 0, type5);
        int int8 = type5.getOpcode(116);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSort();
        org.mockito.asm.Type[] typeArray13 = org.mockito.asm.Type.getArgumentTypes("(VLhi!;)L(VLhi!;)Lhi!;;");
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray13);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType("V");
        int int20 = type19.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int24 = type23.getDimensions();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) (short) 0, type33);
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type30, type33 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((int) (short) 0, type43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type40, type43 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray45);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type26, type27, type29, type37, type39, type48 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type23, typeArray49);
        java.lang.String str51 = signature50.getDescriptor();
        java.lang.String str52 = signature50.toString();
        java.lang.String str53 = signature50.getName();
        org.mockito.asm.Type[] typeArray54 = signature50.getArgumentTypes();
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("LL744398445;", type19, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("L1534515414", type2, typeArray54);
        java.lang.String str57 = signature56.getDescriptor();
        java.lang.String str58 = signature56.toString();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 120 + "'", int8 == 120);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(VLhi!;)I" + "'", str14, "(VLhi!;)I");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(VLhi!;)Lhi!;" + "'", str15, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(VLhi!;)Lorg/mockito/cglib/core/Local;" + "'", str16, "(VLhi!;)Lorg/mockito/cglib/core/Local;");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(VLhi!;)Lhi!;" + "'", str36, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(VLhi!;)Lhi!;" + "'", str46, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str51, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str52, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lorg/mockito/cglib/core/Local;" + "'", str57, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lorg/mockito/cglib/core/Local;");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "L1534515414(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lorg/mockito/cglib/core/Local;" + "'", str58, "L1534515414(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lorg/mockito/cglib/core/Local;");
    }

    @Test
    public void test24515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24515");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter14.visitMultiANewArrayInsn("L1109063194", 146);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24516");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor22 = classEmitter11.visitField((int) (short) 1, "L1331426311", "", "L544877803", (java.lang.Object) "LLhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo13);
    }

    @Test
    public void test24517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24517");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.String str14 = label13.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType("hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        java.lang.String str17 = type16.toString();
        label13.info = str17;
        java.lang.String str19 = label13.toString();
        java.lang.String str20 = label13.toString();
        java.lang.String str21 = label13.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classAdapter30);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        label13.info = classEmitter23;
        org.mockito.asm.Label[] labelArray34 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitTableSwitchInsn(131, 24, label13, labelArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L883570263" + "'", str14, "L883570263");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Li!(Lhi!;" + "'", str17, "Li!(Lhi!;");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L883570263" + "'", str19, "L883570263");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L883570263" + "'", str20, "L883570263");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L883570263" + "'", str21, "L883570263");
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNotNull(labelArray34);
    }

    @Test
    public void test24518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24518");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int3 = type2.getDimensions();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type9, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type5, type6, type8, type16, type18, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int33 = type32.getDimensions();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (short) 0, type42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type42 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local((int) (short) 0, type52);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type49, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type35, type36, type38, type46, type48, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray58);
        boolean boolean60 = signature29.equals((java.lang.Object) "hi!");
        org.mockito.asm.Type[] typeArray61 = signature29.getArgumentTypes();
        java.lang.String str62 = signature29.toString();
        java.lang.String str63 = signature29.getName();
        java.lang.String str64 = signature29.toString();
        java.lang.String str65 = signature29.getName();
        java.lang.String str66 = signature29.getName();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(VLhi!;)Lhi!;" + "'", str15, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(VLhi!;)Lhi!;" + "'", str25, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(VLhi!;)Lhi!;" + "'", str45, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(VLhi!;)Lhi!;" + "'", str55, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str62, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str64, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
    }

    @Test
    public void test24519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24519");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType("hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        java.lang.String str4 = type3.toString();
        label0.info = str4;
        java.lang.Object obj6 = label0.info;
        java.lang.Object obj7 = label0.info;
        java.lang.String str8 = label0.toString();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        label0.info = classEmitter10;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter24);
        label0.info = classEmitter25;
        java.lang.String str27 = label0.toString();
        java.lang.String str28 = label0.toString();
        java.lang.String str29 = label0.toString();
        java.lang.Object obj30 = label0.info;
        java.lang.String str31 = label0.toString();
        java.lang.Object obj32 = label0.info;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1041130394" + "'", str1, "L1041130394");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Li!(Lhi!;" + "'", str4, "Li!(Lhi!;");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "Li!(Lhi!;" + "'", obj6, "Li!(Lhi!;");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "Li!(Lhi!;" + "'", obj7, "Li!(Lhi!;");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1041130394" + "'", str8, "L1041130394");
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo19);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L1041130394" + "'", str27, "L1041130394");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1041130394" + "'", str28, "L1041130394");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1041130394" + "'", str29, "L1041130394");
        org.junit.Assert.assertNotNull(obj30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1041130394" + "'", str31, "L1041130394");
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test24520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24520");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(VLhi!;)Lhi!;", (org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor16 = localVariablesSorter13.visitAnnotation("L2060207759", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24521");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(11, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24522");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getReturnType("(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        int int23 = type22.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter25.getClassInfo();
        boolean boolean28 = type22.equals((java.lang.Object) classEmitter25);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter32.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray39 = org.mockito.asm.Type.getArgumentTypes("(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray39);
        label36.info = typeArray39;
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        label36.info = classEmitter42;
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.asm.ClassVisitor classVisitor47 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter(classVisitor47);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassInfo classInfo52 = classEmitter48.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter53.getClassInfo();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = classEmitter53.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F" + "'", str40, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F");
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo54);
    }

    @Test
    public void test24523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24523");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = localVariablesSorter5.visitAnnotation("L772834472", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24524");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int3 = type2.getDimensions();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type9, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type5, type6, type8, type16, type18, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int33 = type32.getDimensions();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (short) 0, type42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type42 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local((int) (short) 0, type52);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type49, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type35, type36, type38, type46, type48, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray58);
        boolean boolean60 = signature29.equals((java.lang.Object) "hi!");
        java.lang.String str61 = signature29.toString();
        org.mockito.asm.Type type62 = signature29.getReturnType();
        java.lang.String str63 = signature29.getDescriptor();
        java.lang.String str64 = signature29.getDescriptor();
        org.mockito.asm.Type[] typeArray65 = signature29.getArgumentTypes();
        org.mockito.asm.Type type66 = signature29.getReturnType();
        org.mockito.asm.Type type67 = type66.getElementType();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(VLhi!;)Lhi!;" + "'", str15, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(VLhi!;)Lhi!;" + "'", str25, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(VLhi!;)Lhi!;" + "'", str45, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(VLhi!;)Lhi!;" + "'", str55, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str61, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str63, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str64, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type67);
    }

    @Test
    public void test24525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24525");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) type3);
        boolean boolean6 = type3.equals((java.lang.Object) 1.0f);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(158, type3);
        int int8 = type3.getSort();
        java.lang.String str9 = type3.getClassName();
        java.lang.String str10 = type3.getClassName();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "double" + "'", str9, "double");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "double" + "'", str10, "double");
    }

    @Test
    public void test24526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24526");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L850613983", "");
    }

    @Test
    public void test24527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24527");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getReturnType("(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        int int23 = type22.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter25.getClassInfo();
        boolean boolean28 = type22.equals((java.lang.Object) classEmitter25);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter32.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray39 = org.mockito.asm.Type.getArgumentTypes("(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray39);
        label36.info = typeArray39;
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        label36.info = classEmitter42;
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.asm.ClassVisitor classVisitor47 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter(classVisitor47);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassInfo classInfo52 = classEmitter48.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter53.getClassInfo();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter30.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassInfo classInfo59 = classEmitter57.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo63 = classEmitter62.getClassInfo();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.asm.ClassAdapter classAdapter69 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classAdapter69);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classAdapter69);
        org.mockito.asm.ClassAdapter classAdapter72 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter69);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classAdapter69);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F" + "'", str40, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F");
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo67);
    }

    @Test
    public void test24528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24528");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(Lhi!;ILhi!;DLhi!;L(VLhi!;)F");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int6 = type5.getDimensions();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type12, type15 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type22, type25 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type8, type9, type11, type19, type21, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray31);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int36 = type35.getDimensions();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local((int) (short) 0, type45);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type42, type45 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type52 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local((int) (short) 0, type55);
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type52, type55 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray57);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type38, type39, type41, type49, type51, type60 };
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray61);
        boolean boolean63 = signature32.equals((java.lang.Object) "hi!");
        java.lang.String str64 = signature32.getDescriptor();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local69 = new org.mockito.cglib.core.Local((int) (short) 0, type68);
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local((int) (short) 1, type68);
        int int71 = local70.getIndex();
        int int72 = local70.getIndex();
        boolean boolean73 = signature32.equals((java.lang.Object) int72);
        java.lang.String str74 = signature32.getDescriptor();
        java.lang.String str75 = signature32.toString();
        org.mockito.asm.Type type76 = signature32.getReturnType();
        java.lang.String str77 = signature32.getName();
        org.mockito.asm.Type type79 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int80 = type79.getDimensions();
        java.lang.String str81 = type79.toString();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type84 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type87 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local88 = new org.mockito.cglib.core.Local((int) (short) 0, type87);
        org.mockito.asm.Type[] typeArray89 = new org.mockito.asm.Type[] { type84, type87 };
        java.lang.String str90 = org.mockito.asm.Type.getMethodDescriptor(type83, typeArray89);
        java.lang.String str91 = org.mockito.asm.Type.getMethodDescriptor(type79, typeArray89);
        java.lang.String str92 = type79.getInternalName();
        boolean boolean94 = type79.equals((java.lang.Object) (byte) 10);
        int int95 = type79.getSort();
        boolean boolean96 = signature32.equals((java.lang.Object) type79);
        boolean boolean97 = type2.equals((java.lang.Object) boolean96);
        org.mockito.cglib.core.Local local98 = new org.mockito.cglib.core.Local(44, type2);
        org.mockito.asm.Type type99 = local98.getType();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(VLhi!;)Lhi!;" + "'", str18, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(VLhi!;)Lhi!;" + "'", str28, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(VLhi!;)Lhi!;" + "'", str48, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(VLhi!;)Lhi!;" + "'", str58, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str64, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str74, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str75, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str81, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(type87);
        org.junit.Assert.assertNotNull(typeArray89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "(VLhi!;)Lhi!;" + "'", str90, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str91, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "(VLhi!;)Lhi!;" + "'", str92, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 10 + "'", int95 == 10);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(type99);
    }

    @Test
    public void test24529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24529");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        java.lang.Object obj8 = label6.info;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter9.getClassInfo();
        label6.info = classEmitter9;
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter29.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter34.getClassInfo();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classAdapter41);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classAdapter41);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.asm.ClassVisitor classVisitor49 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter(classVisitor49);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo60 = classEmitter59.getClassInfo();
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassInfo classInfo64 = classEmitter62.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter67.getClassInfo();
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo72 = classEmitter71.getClassInfo();
        classEmitter70.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        org.mockito.asm.ClassAdapter classAdapter74 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter71);
        classEmitter67.setTarget((org.mockito.asm.ClassVisitor) classAdapter74);
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classAdapter74);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.asm.ClassAdapter classAdapter78 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.asm.ClassVisitor classVisitor79 = null;
        classEmitter62.setTarget(classVisitor79);
        org.mockito.asm.ClassAdapter classAdapter81 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter62);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classAdapter81);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter81);
        java.lang.String[] strArray88 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor89 = classAdapter81.visitMethod(0, "", "L492400486(Lhi!;ILhi!;DLhi!;L(VLhi!;)LF;", "L1000888746hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;", strArray88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@159e8372");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L666371530" + "'", str7, "L666371530");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNotNull(strArray88);
    }

    @Test
    public void test24530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24530");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        java.lang.String str3 = type2.getInternalName();
        java.lang.String str4 = type2.getClassName();
        java.lang.String str5 = type2.getInternalName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (byte) 1, type2);
        org.mockito.asm.Type type7 = local6.getType();
        int int8 = type7.getSize();
        int int9 = type7.getDimensions();
        java.lang.String str10 = type7.getClassName();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(VLhi!;)Lhi!;" + "'", str3, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(VLhi!;)Lhi!;" + "'", str4, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(VLhi!;)Lhi!;" + "'", str5, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(VLhi!;)Lhi!;" + "'", str10, "(VLhi!;)Lhi!;");
    }

    @Test
    public void test24531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24531");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.String str2 = label0.toString();
        java.lang.Object obj3 = label0.info;
        java.lang.Object obj4 = label0.info;
        java.lang.Object obj5 = label0.info;
        java.lang.Object obj6 = label0.info;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        label0.info = classEmitter7;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType("hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = org.mockito.asm.Type.getArgumentTypes("(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray16);
        int int19 = type12.getSize();
        int int20 = type12.getSort();
        java.lang.String str21 = type12.getDescriptor();
        org.mockito.asm.Type type22 = type12.getElementType();
        java.lang.String str23 = type12.getClassName();
        label0.info = str23;
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.String str26 = label25.toString();
        label25.info = "Li!(Lhi!;";
        java.lang.Object obj29 = label25.info;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType("(VLhi!;)L(VLhi!;)Lhi!;;");
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(96, type33);
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) '#', type33);
        label25.info = type33;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getType("hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        int int39 = type38.getSort();
        int int40 = type38.getSort();
        java.lang.String str41 = type38.getClassName();
        label25.info = str41;
        label0.info = label25;
        java.lang.Object obj44 = label0.info;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1717135002" + "'", str1, "L1717135002");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L1717135002" + "'", str2, "L1717135002");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Li!(Lhi!;" + "'", str13, "Li!(Lhi!;");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F" + "'", str17, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Li!(Lhi!;" + "'", str18, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Li!(Lhi!;");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Li!(Lhi!;" + "'", str21, "Li!(Lhi!;");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "i!(Lhi!" + "'", str23, "i!(Lhi!");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1261050892" + "'", str26, "L1261050892");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "Li!(Lhi!;" + "'", obj29, "Li!(Lhi!;");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "i!(Lhi!" + "'", str41, "i!(Lhi!");
        org.junit.Assert.assertNotNull(obj44);
// flaky:         org.junit.Assert.assertEquals(obj44.toString(), "L1261050892");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "L1261050892");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "L1261050892");
    }

    @Test
    public void test24532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24532");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter13.visitMultiANewArrayInsn("L858081553", 30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24533");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int8 = type7.getDimensions();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type17 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type27);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type24, type27 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type10, type11, type13, type21, type23, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", type7, typeArray33);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int38 = type37.getDimensions();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((int) (short) 0, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type44, type47 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local((int) (short) 0, type57);
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type54, type57 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray59);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type40, type41, type43, type51, type53, type62 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("hi!", type37, typeArray63);
        boolean boolean65 = signature34.equals((java.lang.Object) "hi!");
        org.mockito.asm.Type[] typeArray66 = signature34.getArgumentTypes();
        java.lang.String str67 = signature34.toString();
        org.mockito.asm.Type[] typeArray68 = signature34.getArgumentTypes();
        java.lang.String str69 = signature34.getDescriptor();
        org.mockito.asm.Type type70 = signature34.getReturnType();
        java.lang.String str71 = signature34.getDescriptor();
        java.lang.String str72 = signature34.getName();
        java.lang.String str73 = signature34.toString();
        org.mockito.asm.Type[] typeArray74 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter75 = classEmitter3.begin_method(13, signature34, typeArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2f301230");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(VLhi!;)Lhi!;" + "'", str20, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(VLhi!;)Lhi!;" + "'", str30, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(VLhi!;)Lhi!;" + "'", str50, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(VLhi!;)Lhi!;" + "'", str60, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str67, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str69, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str71, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str73, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
    }

    @Test
    public void test24534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24534");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitIincInsn(173, 171);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24535");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter13.visitTypeInsn(0, "L1206206000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24536");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L506355818", "L2102278992");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "D");
        java.lang.String str6 = signature5.toString();
        org.mockito.asm.Type type7 = signature5.getReturnType();
        java.lang.Object obj8 = null;
        boolean boolean9 = signature5.equals(obj8);
        java.lang.String str10 = signature5.getDescriptor();
        org.mockito.asm.Type type11 = signature5.getReturnType();
        boolean boolean12 = signature2.equals((java.lang.Object) type11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;D" + "'", str6, "Lorg/mockito/asm/Type;D");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "D" + "'", str10, "D");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24537");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("(Lhi!;ILhi!;DLhi!;L(VLhi!;)F");
        java.lang.String str3 = type2.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(0, type2);
        java.lang.String str5 = type2.getInternalName();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lhi!" + "'", str3, "Lhi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lhi!" + "'", str5, "Lhi!");
    }

    @Test
    public void test24538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24538");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitInsn(175);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24539");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        java.lang.String str3 = label2.toString();
        java.lang.Object obj4 = label2.info;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        label2.info = classEmitter5;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter25.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter34.getClassInfo();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classAdapter37);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classAdapter37);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter43.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.asm.ClassVisitor classVisitor46 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter(classVisitor46);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter52.getClassInfo();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassInfo classInfo55 = classEmitter51.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.asm.ClassAdapter classAdapter63 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo64 = classEmitter22.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter22.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L714231376" + "'", str3, "L714231376");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo64);
    }

    @Test
    public void test24540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24540");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(5, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter11);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter15 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter16 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor19 = localVariablesSorter12.visitAnnotation("L1736438575", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24541");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int3 = type2.getDimensions();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type9, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type5, type6, type8, type16, type18, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int33 = type32.getDimensions();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (short) 0, type42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type42 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local((int) (short) 0, type52);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type49, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type35, type36, type38, type46, type48, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray58);
        boolean boolean60 = signature29.equals((java.lang.Object) "hi!");
        org.mockito.asm.Type[] typeArray61 = signature29.getArgumentTypes();
        java.lang.String str62 = signature29.toString();
        java.lang.String str63 = signature29.getName();
        java.lang.String str64 = signature29.getName();
        org.mockito.asm.Type type65 = signature29.getReturnType();
        java.lang.String str66 = signature29.getName();
        org.mockito.asm.Type type67 = signature29.getReturnType();
        java.lang.String str68 = signature29.getName();
        org.mockito.asm.Label label69 = new org.mockito.asm.Label();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getReturnType("(VLhi!;)L(VLhi!;)Lhi!;;");
        label69.info = "(VLhi!;)L(VLhi!;)Lhi!;;";
        boolean boolean73 = signature29.equals((java.lang.Object) "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.mockito.asm.Type type74 = signature29.getReturnType();
        org.mockito.asm.Type type75 = signature29.getReturnType();
        java.lang.String str76 = type75.toString();
        int int77 = type75.getDimensions();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(VLhi!;)Lhi!;" + "'", str15, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(VLhi!;)Lhi!;" + "'", str25, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(VLhi!;)Lhi!;" + "'", str45, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(VLhi!;)Lhi!;" + "'", str55, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str62, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Lhi!;" + "'", str76, "Lhi!;");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    }

    @Test
    public void test24542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24542");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("L63690056", 160);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24543");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24544");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        java.lang.Object obj14 = label10.info;
        java.lang.String str15 = label10.toString();
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.String str18 = label17.toString();
        java.lang.Object obj19 = label17.info;
        java.lang.String str20 = label17.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("L1958259120");
        java.lang.String str23 = type22.getClassName();
        label17.info = type22;
        java.lang.String str25 = label17.toString();
        java.lang.Object obj26 = label17.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTryCatchBlock(label10, label16, label17, "L869309643");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1999854170" + "'", str11, "L1999854170");
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1999854170" + "'", str13, "L1999854170");
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1999854170" + "'", str15, "L1999854170");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L343818495" + "'", str18, "L343818495");
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L343818495" + "'", str20, "L343818495");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1958259120" + "'", str23, "L1958259120");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L343818495" + "'", str25, "L343818495");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "LL1958259120;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "LL1958259120;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "LL1958259120;");
    }

    @Test
    public void test24545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24545");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter13.visitMethodInsn(33, "L999907892", "L951480290", "L1511969420");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24546");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter(classVisitor20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter29);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("L657009113", "L1180005622", "L1913804720");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test24547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24547");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "(VLhi!;)Lhi!;", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter14.visitVarInsn(130, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24548");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24549");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        label0.info = classEmitter3;
        java.lang.Object obj10 = label0.info;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        label0.info = classEmitter12;
        java.lang.Object obj18 = label0.info;
        java.lang.String str19 = label0.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        label0.info = type20;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = type20.getInternalName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1121313888" + "'", str1, "L1121313888");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNotNull(obj18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1121313888" + "'", str19, "L1121313888");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "S" + "'", str21, "S");
    }

    @Test
    public void test24550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24550");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "L1519918813");
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("D", "D");
        org.mockito.asm.Type type8 = signature7.getReturnType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int12 = type11.getDimensions();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type18, type21 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) (short) 0, type31);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type28, type31 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type14, type15, type17, type25, type27, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray37);
        int int39 = type11.getDimensions();
        java.lang.Class<?> wildcardClass40 = type11.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.String str42 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass40);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.String str46 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass40);
        java.lang.String str47 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType("hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        java.lang.String str51 = type50.toString();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray54 = org.mockito.asm.Type.getArgumentTypes("(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray54);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray54);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray54);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray54);
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local(9, type8);
        org.mockito.cglib.core.Local local60 = new org.mockito.cglib.core.Local(137, type8);
        boolean boolean61 = signature2.equals((java.lang.Object) type8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray62 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(VLhi!;)Lhi!;" + "'", str24, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(VLhi!;)Lhi!;" + "'", str34, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str42, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org/mockito/asm/Type" + "'", str43, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str46, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str47, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Li!(Lhi!;" + "'", str51, "Li!(Lhi!;");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F" + "'", str55, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Li!(Lhi!;" + "'", str56, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Li!(Lhi!;");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lorg/mockito/asm/Type;" + "'", str57, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)D" + "'", str58, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)D");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test24551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24551");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L652957166", "L1427207590");
        boolean boolean4 = signature2.equals((java.lang.Object) "L1208979529");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test24552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24552");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
    }

    @Test
    public void test24553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24553");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classAdapter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter32.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("L1966883143");
        org.mockito.asm.ClassVisitor classVisitor43 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter(classVisitor43);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter46);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo50 = classEmitter49.getClassInfo();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassInfo classInfo52 = classEmitter48.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassInfo classInfo59 = classEmitter55.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        boolean boolean61 = type42.equals((java.lang.Object) classEmitter55);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.asm.Label label63 = new org.mockito.asm.Label();
        java.lang.String str64 = label63.toString();
        label63.info = "Li!(Lhi!;";
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo69 = classEmitter68.getClassInfo();
        classEmitter67.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.asm.ClassAdapter classAdapter71 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.asm.ClassAdapter classAdapter72 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter68);
        label63.info = classEmitter68;
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.asm.ClassVisitor classVisitor76 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter(classVisitor76);
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter79.setTarget((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.asm.ClassVisitor classVisitor82 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter(classVisitor82);
        classEmitter79.setTarget((org.mockito.asm.ClassVisitor) classEmitter83);
        org.mockito.asm.ClassAdapter classAdapter85 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter79);
        classEmitter78.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassEmitter classEmitter87 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter87);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter90 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter89);
        org.mockito.cglib.core.ClassEmitter classEmitter91 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter90);
        org.mockito.asm.ClassAdapter classAdapter92 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter90);
        classEmitter88.setTarget((org.mockito.asm.ClassVisitor) classEmitter90);
        org.mockito.cglib.core.ClassInfo classInfo94 = classEmitter88.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter95 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter88);
        classEmitter78.setTarget((org.mockito.asm.ClassVisitor) classEmitter95);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "L589259884" + "'", str64, "L589259884");
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo94);
    }

    @Test
    public void test24554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24554");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        java.lang.Class<?> wildcardClass15 = classEmitter1.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test24555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24555");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = localVariablesSorter6.visitParameterAnnotation(29, "L1380997825", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24556");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitLdcInsn((java.lang.Object) "L1191271233");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24557");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int3 = type2.getDimensions();
        java.lang.String str4 = type2.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type10 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray12);
        java.lang.String str15 = type2.getInternalName();
        boolean boolean17 = type2.equals((java.lang.Object) (byte) 10);
        int int18 = type2.getSort();
        java.lang.String str19 = type2.getDescriptor();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(0, type2);
        java.lang.String str21 = type2.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType("(Lhi!;ILhi!;DLhi!;L(VLhi!;)F");
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) '#', type24);
        java.lang.String str26 = type24.getClassName();
        int int27 = type24.getSort();
        boolean boolean28 = type2.equals((java.lang.Object) type24);
        org.mockito.asm.Type type29 = type2.getElementType();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str4, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(VLhi!;)Lhi!;" + "'", str13, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str14, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(VLhi!;)Lhi!;" + "'", str15, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str19, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(VLhi!;)Lhi!;" + "'", str21, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Lhi!" + "'", str26, "Lhi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type29);
    }

    @Test
    public void test24558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24558");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter(classVisitor22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        java.lang.String[] strArray39 = new java.lang.String[] { "L104693828", "L1684939763", "L878258405", "L2089859988", "L1391560060" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter27.visit(167, 134, "L385297808", "L1981040684", "L317675113", strArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(strArray39);
    }

    @Test
    public void test24559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24559");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter7.getClassInfo();
        label4.info = classEmitter7;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter27.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classAdapter39);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classAdapter39);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean45 = type0.equals((java.lang.Object) classEmitter24);
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.ClassAdapter classAdapter48 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter47);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor54 = classAdapter48.visitField(28, "java/lang/String", "L1266286750", "L1607531354", (java.lang.Object) "L803874484");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S" + "'", str1, "S");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1922334277" + "'", str5, "L1922334277");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test24560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24560");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int5 = type4.getDimensions();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type11, type14 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type21, type24 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type7, type8, type10, type18, type20, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray30);
        java.lang.String str32 = signature31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.toString();
        int int35 = type33.getSort();
        boolean boolean36 = signature31.equals((java.lang.Object) type33);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType("hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean41 = type39.equals((java.lang.Object) type40);
        int int43 = type40.getOpcode((int) (byte) 10);
        int int45 = type40.getOpcode(130);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int48 = type47.getDimensions();
        java.lang.String str49 = type47.toString();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type52 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local((int) (short) 0, type55);
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type52, type55 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray57);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray57);
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("L1233151295", type40, typeArray57);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("V", type33, typeArray57);
        org.mockito.asm.Type type62 = signature61.getReturnType();
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local(124, type62);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(VLhi!;)Lhi!;" + "'", str17, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(VLhi!;)Lhi!;" + "'", str27, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str32, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "F" + "'", str34, "F");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 13 + "'", int43 == 13);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 133 + "'", int45 == 133);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str49, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(VLhi!;)Lhi!;" + "'", str58, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str59, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type62);
    }

    @Test
    public void test24561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24561");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        label12.info = typeArray15;
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        label12.info = classEmitter18;
        java.lang.String str20 = label12.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitJumpInsn(108, label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F" + "'", str16, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1033525457" + "'", str20, "L1033525457");
    }

    @Test
    public void test24562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24562");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter(classVisitor22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("(Lhi!;ILhi!;DLhi!;L(VLhi!;)C");
        int int35 = type33.getOpcode(28);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int39 = type38.getDimensions();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type45 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local((int) (short) 0, type48);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type45, type48 };
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type55 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local((int) (short) 0, type58);
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type55, type58 };
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray60);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type41, type42, type44, type52, type54, type63 };
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", type38, typeArray64);
        java.lang.String str66 = signature65.getDescriptor();
        org.mockito.asm.Type type67 = signature65.getReturnType();
        org.mockito.asm.Type[] typeArray68 = signature65.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter25.begin_class(4, 36, "L236237581", type33, typeArray68, "L1463159568");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(VLhi!;)Lhi!;" + "'", str51, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(VLhi!;)Lhi!;" + "'", str61, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str66, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(typeArray68);
    }

    @Test
    public void test24563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24563");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 1, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)LL1503181220;", (org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(43, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Li!;", (org.mockito.asm.MethodVisitor) localVariablesSorter13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor17 = localVariablesSorter14.visitAnnotation("L69533088", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24564");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int3 = type2.getDimensions();
        java.lang.String str4 = type2.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type10 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray12);
        java.lang.String str15 = type2.getInternalName();
        boolean boolean17 = type2.equals((java.lang.Object) (byte) 10);
        int int18 = type2.getSort();
        java.lang.String str19 = type2.getDescriptor();
        java.lang.String str20 = type2.getInternalName();
        java.lang.String str21 = type2.toString();
        org.mockito.asm.Type type22 = type2.getElementType();
        java.lang.String str23 = type2.getClassName();
        int int25 = type2.getOpcode(21);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int29 = type28.getDimensions();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((int) (short) 0, type38);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type35, type38 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type45 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local((int) (short) 0, type48);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type45, type48 };
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type31, type32, type34, type42, type44, type53 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray54);
        int int56 = type28.getDimensions();
        java.lang.Class<?> wildcardClass57 = type28.getClass();
        java.lang.String str58 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass57);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.getType("hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        java.lang.String str62 = type61.toString();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray65 = org.mockito.asm.Type.getArgumentTypes("(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray65);
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray65);
        boolean boolean68 = type59.equals((java.lang.Object) type61);
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("F", "(VLhi!;)Lhi!;");
        org.mockito.asm.Type type72 = signature71.getReturnType();
        org.mockito.asm.Type[] typeArray73 = signature71.getArgumentTypes();
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray73);
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("L1534237807", type2, typeArray73);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str4, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(VLhi!;)Lhi!;" + "'", str13, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str14, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(VLhi!;)Lhi!;" + "'", str15, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str19, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(VLhi!;)Lhi!;" + "'", str20, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str21, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(VLhi!;)Lhi!;" + "'", str23, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 25 + "'", int25 == 25);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(VLhi!;)Lhi!;" + "'", str41, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(VLhi!;)Lhi!;" + "'", str51, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "org/mockito/asm/Type" + "'", str58, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Li!(Lhi!;" + "'", str62, "Li!(Lhi!;");
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F" + "'", str66, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Li!(Lhi!;" + "'", str67, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Li!(Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "(VLhi!;)Li!(Lhi!;" + "'", str74, "(VLhi!;)Li!(Lhi!;");
    }

    @Test
    public void test24565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24565");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("L1966883143");
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        boolean boolean23 = type4.equals((java.lang.Object) classEmitter17);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.String str26 = label25.toString();
        label25.info = "Li!(Lhi!;";
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        label25.info = classEmitter30;
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        java.lang.String[] strArray42 = new java.lang.String[] { "L1147442417" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor43 = classEmitter17.visitMethod(137, "L1413881757", "L143468578", "", strArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3ee0574f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1545434464" + "'", str26, "L1545434464");
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test24566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24566");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 0, type3);
        int int5 = local4.getIndex();
        java.lang.Class<?> wildcardClass6 = local4.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType("(Lhi!;ILhi!;DLhi!;L(VLhi!;)F");
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "D");
        boolean boolean20 = signature18.equals((java.lang.Object) (byte) 10);
        org.mockito.asm.Type type21 = signature18.getReturnType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getReturnType("D");
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int28 = type27.getDimensions();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) (short) 0, type37);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type34, type37 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((int) (short) 0, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type44, type47 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray49);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type30, type31, type33, type41, type43, type52 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray53);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int58 = type57.getDimensions();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type64 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local68 = new org.mockito.cglib.core.Local((int) (short) 0, type67);
        org.mockito.asm.Type[] typeArray69 = new org.mockito.asm.Type[] { type64, type67 };
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type74 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local78 = new org.mockito.cglib.core.Local((int) (short) 0, type77);
        org.mockito.asm.Type[] typeArray79 = new org.mockito.asm.Type[] { type74, type77 };
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type73, typeArray79);
        org.mockito.asm.Type type82 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray83 = new org.mockito.asm.Type[] { type60, type61, type63, type71, type73, type82 };
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("hi!", type57, typeArray83);
        boolean boolean85 = signature54.equals((java.lang.Object) "hi!");
        org.mockito.asm.Type[] typeArray86 = signature54.getArgumentTypes();
        java.lang.String str87 = signature54.toString();
        org.mockito.asm.Type[] typeArray88 = signature54.getArgumentTypes();
        org.mockito.cglib.core.Signature signature89 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", type24, typeArray88);
        org.mockito.cglib.core.Signature signature90 = new org.mockito.cglib.core.Signature("Lhi!;", type21, typeArray88);
        org.mockito.cglib.core.Signature signature91 = new org.mockito.cglib.core.Signature("L890666663", type14, typeArray88);
        org.mockito.asm.Type[] typeArray92 = signature91.getArgumentTypes();
        org.mockito.cglib.core.Signature signature93 = new org.mockito.cglib.core.Signature("L1548534035", type11, typeArray92);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/cglib/core/Local;" + "'", str8, "Lorg/mockito/cglib/core/Local;");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/mockito/cglib/core/Local" + "'", str9, "org/mockito/cglib/core/Local");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(VLhi!;)Lhi!;" + "'", str40, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(VLhi!;)Lhi!;" + "'", str50, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "(VLhi!;)Lhi!;" + "'", str70, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "(VLhi!;)Lhi!;" + "'", str80, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(typeArray86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str87, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(typeArray88);
        org.junit.Assert.assertNotNull(typeArray92);
    }

    @Test
    public void test24567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24567");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int3 = type2.getDimensions();
        java.lang.String str4 = type2.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type10 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray12);
        java.lang.String str15 = type2.getInternalName();
        boolean boolean17 = type2.equals((java.lang.Object) (byte) 10);
        int int18 = type2.getSort();
        java.lang.String str19 = type2.getDescriptor();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(0, type2);
        int int21 = type2.getSort();
        int int23 = type2.getOpcode((int) (byte) 10);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str27 = type26.toString();
        int int28 = type26.getSort();
        int int29 = type26.getDimensions();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int33 = type32.getDimensions();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (short) 0, type42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type42 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local((int) (short) 0, type52);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type49, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type35, type36, type38, type46, type48, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray58);
        org.mockito.cglib.core.Local local61 = new org.mockito.cglib.core.Local(130, type26);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("F", "(VLhi!;)Lhi!;");
        org.mockito.asm.Type type65 = signature64.getReturnType();
        java.lang.String str66 = type65.getInternalName();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int69 = type68.getDimensions();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.INT_TYPE;
        int int71 = type70.getSize();
        int int72 = type70.getSort();
        org.mockito.asm.Type[] typeArray74 = org.mockito.asm.Type.getArgumentTypes("(VLhi!;)L(VLhi!;)Lhi!;;");
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type70, typeArray74);
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray74);
        boolean boolean77 = type65.equals((java.lang.Object) typeArray74);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray74);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray74);
        java.lang.Class<?> wildcardClass80 = typeArray74.getClass();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str4, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(VLhi!;)Lhi!;" + "'", str13, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str14, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(VLhi!;)Lhi!;" + "'", str15, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str19, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 14 + "'", int23 == 14);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Lhi!;" + "'", str27, "Lhi!;");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(VLhi!;)Lhi!;" + "'", str45, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(VLhi!;)Lhi!;" + "'", str55, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)Lhi!;" + "'", str60, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)Lhi!;");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 5 + "'", int72 == 5);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(VLhi!;)I" + "'", str75, "(VLhi!;)I");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str76, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "(VLhi!;)Lhi!;" + "'", str78, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str79, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test24568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24568");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(VLhi!;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor16 = localVariablesSorter10.visitParameterAnnotation(120, "LL744398445;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24569");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.String str17 = label16.toString();
        java.lang.String str18 = label16.toString();
        java.lang.Object obj19 = label16.info;
        java.lang.Object obj20 = label16.info;
        java.lang.Object obj21 = label16.info;
        java.lang.Object obj22 = label16.info;
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter23.getClassInfo();
        label16.info = classEmitter23;
        java.lang.String str27 = label16.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType("hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) type30);
        java.lang.String str32 = type29.toString();
        int int34 = type29.getOpcode(17);
        label16.info = int34;
        java.lang.String str36 = label16.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter37.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter42.getClassInfo();
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classAdapter49);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classAdapter49);
        label16.info = classAdapter49;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor53 = classEmitter7.visitField(106, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Li!(Lhi!;", "L1474769325", "L493413938", (java.lang.Object) classAdapter49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L324469593" + "'", str17, "L324469593");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L324469593" + "'", str18, "L324469593");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(classInfo25);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L324469593" + "'", str27, "L324469593");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Li!(Lhi!;" + "'", str32, "Li!(Lhi!;");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 21 + "'", int34 == 21);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L324469593" + "'", str36, "L324469593");
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo47);
    }

    @Test
    public void test24570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24570");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter15 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter16 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter15);
        org.mockito.asm.Label label18 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter15.visitLineNumber(154, label18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24571");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1573065381", "L117364895");
        java.lang.String str3 = signature2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1573065381L117364895" + "'", str3, "L1573065381L117364895");
    }

    @Test
    public void test24572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24572");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter6.visitAnnotation("L2114283036", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24573");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(154, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)LL1503181220;", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 0, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)LL1503181220;", (org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter15 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter16 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter17 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter16);
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.String str22 = label21.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getReturnType("(VLhi!;)L(VLhi!;)Lhi!;;");
        label21.info = "(VLhi!;)L(VLhi!;)Lhi!;;";
        java.lang.String str26 = label21.toString();
        java.lang.Object obj27 = null;
        label21.info = obj27;
        java.lang.String str29 = label21.toString();
        java.lang.String str30 = label21.toString();
        java.lang.String str31 = label21.toString();
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getReturnType("(VLhi!;)L(VLhi!;)Lhi!;;");
        label32.info = "(VLhi!;)L(VLhi!;)Lhi!;;";
        java.lang.String str36 = label32.toString();
        java.lang.Object obj37 = label32.info;
        java.lang.Object obj38 = label32.info;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (short) 0, type42);
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((int) (short) 1, type42);
        int int45 = local44.getIndex();
        int int46 = local44.getIndex();
        int int47 = local44.getIndex();
        org.mockito.asm.Type type48 = local44.getType();
        int int49 = local44.getIndex();
        label32.info = int49;
        java.lang.String str51 = label32.toString();
        java.lang.Object obj52 = label32.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter17.visitLocalVariable("L867772134", "LL255286014;", "L717705079", label21, label32, 140);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 140");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1612021023" + "'", str22, "L1612021023");
        org.junit.Assert.assertNotNull(type24);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1612021023" + "'", str26, "L1612021023");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1612021023" + "'", str29, "L1612021023");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1612021023" + "'", str30, "L1612021023");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1612021023" + "'", str31, "L1612021023");
        org.junit.Assert.assertNotNull(type34);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1484700889" + "'", str36, "L1484700889");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", obj37, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", obj38, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "L1484700889" + "'", str51, "L1484700889");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1 + "'", obj52, 1);
    }

    @Test
    public void test24574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24574");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "(VLhi!;)Lhi!;", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.String str17 = label16.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("(VLhi!;)L(VLhi!;)Lhi!;;");
        label16.info = "(VLhi!;)L(VLhi!;)Lhi!;;";
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int24 = type23.getDimensions();
        java.lang.String str25 = type23.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) (short) 0, type31);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type28, type31 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray33);
        java.lang.String str36 = type23.getInternalName();
        boolean boolean38 = type23.equals((java.lang.Object) (byte) 10);
        int int39 = type23.getSort();
        java.lang.String str40 = type23.getDescriptor();
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(0, type23);
        java.lang.String str42 = type23.getClassName();
        label16.info = str42;
        java.lang.Object obj44 = label16.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter13.visitLineNumber(0, label16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1516911053" + "'", str17, "L1516911053");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str25, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(VLhi!;)Lhi!;" + "'", str34, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str35, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(VLhi!;)Lhi!;" + "'", str36, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str40, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(VLhi!;)Lhi!;" + "'", str42, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "(VLhi!;)Lhi!;" + "'", obj44, "(VLhi!;)Lhi!;");
    }

    @Test
    public void test24575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24575");
        org.mockito.asm.MethodVisitor methodVisitor8 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(5, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter13);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter15 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter14);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter16 = new org.mockito.cglib.core.LocalVariablesSorter(108, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lorg/mockito/cglib/core/Local;", (org.mockito.asm.MethodVisitor) localVariablesSorter15);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter17 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter15);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter18 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter15);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter19 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter15);
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.String str22 = label21.toString();
        java.lang.Object obj23 = label21.info;
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter(classVisitor27);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        label21.info = classEmitter24;
        java.lang.String str31 = label21.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter15.visitLineNumber(17, label21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1480135965" + "'", str22, "L1480135965");
        org.junit.Assert.assertNull(obj23);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1480135965" + "'", str31, "L1480135965");
    }

    @Test
    public void test24576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24576");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int3 = type2.getDimensions();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type9, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type5, type6, type8, type16, type18, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int33 = type32.getDimensions();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (short) 0, type42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type42 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local((int) (short) 0, type52);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type49, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type35, type36, type38, type46, type48, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray58);
        int int60 = type32.getDimensions();
        int int62 = type32.getOpcode((int) (byte) 100);
        boolean boolean63 = signature29.equals((java.lang.Object) (byte) 100);
        java.lang.String str64 = signature29.getDescriptor();
        org.mockito.asm.Type type65 = signature29.getReturnType();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getObjectType("L1503181220");
        java.lang.String str68 = type67.getDescriptor();
        java.lang.String str69 = type67.toString();
        int int71 = type67.getOpcode(27);
        boolean boolean72 = signature29.equals((java.lang.Object) 27);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(VLhi!;)Lhi!;" + "'", str15, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(VLhi!;)Lhi!;" + "'", str25, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(VLhi!;)Lhi!;" + "'", str45, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(VLhi!;)Lhi!;" + "'", str55, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 104 + "'", int62 == 104);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str64, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "LL1503181220;" + "'", str68, "LL1503181220;");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "LL1503181220;" + "'", str69, "LL1503181220;");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 31 + "'", int71 == 31);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test24577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24577");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitIincInsn(39, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24578");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int3 = type2.getDimensions();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type9, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type5, type6, type8, type16, type18, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int33 = type32.getDimensions();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (short) 0, type42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type42 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local((int) (short) 0, type52);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type49, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type35, type36, type38, type46, type48, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray58);
        boolean boolean60 = signature29.equals((java.lang.Object) "hi!");
        java.lang.String str61 = signature29.getDescriptor();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local66 = new org.mockito.cglib.core.Local((int) (short) 0, type65);
        org.mockito.cglib.core.Local local67 = new org.mockito.cglib.core.Local((int) (short) 1, type65);
        int int68 = local67.getIndex();
        int int69 = local67.getIndex();
        boolean boolean70 = signature29.equals((java.lang.Object) int69);
        java.lang.String str71 = signature29.getName();
        java.lang.String str72 = signature29.getName();
        org.mockito.asm.Type type73 = signature29.getReturnType();
        org.mockito.asm.Type type74 = signature29.getReturnType();
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo77 = classEmitter76.getClassInfo();
        classEmitter75.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo81 = classEmitter80.getClassInfo();
        classEmitter79.setTarget((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.asm.ClassAdapter classAdapter83 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter80);
        classEmitter76.setTarget((org.mockito.asm.ClassVisitor) classAdapter83);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter83);
        org.mockito.cglib.core.ClassEmitter classEmitter86 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter87 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter86);
        classEmitter85.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        org.mockito.asm.ClassAdapter classAdapter89 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter85);
        boolean boolean90 = signature29.equals((java.lang.Object) classEmitter85);
        org.mockito.asm.Type[] typeArray91 = signature29.getArgumentTypes();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(VLhi!;)Lhi!;" + "'", str15, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(VLhi!;)Lhi!;" + "'", str25, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(VLhi!;)Lhi!;" + "'", str45, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(VLhi!;)Lhi!;" + "'", str55, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str61, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNull(classInfo77);
        org.junit.Assert.assertNull(classInfo81);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(typeArray91);
    }

    @Test
    public void test24579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24579");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(VLhi!;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitVarInsn(10, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24580");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int3 = type2.getDimensions();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type9, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type5, type6, type8, type16, type18, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray28);
        java.lang.String str30 = signature29.getDescriptor();
        java.lang.String str31 = signature29.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter32.getClassInfo();
        boolean boolean35 = signature29.equals((java.lang.Object) classEmitter32);
        org.mockito.asm.MethodVisitor methodVisitor38 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter39 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor38);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter40 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter39);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter41 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter40);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter42 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter41);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter43 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter41);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter44 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter41);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter45 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter41);
        boolean boolean46 = signature29.equals((java.lang.Object) localVariablesSorter45);
        org.mockito.asm.Label label48 = new org.mockito.asm.Label();
        java.lang.String str49 = label48.toString();
        java.lang.Object obj50 = label48.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter45.visitJumpInsn(12, label48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(VLhi!;)Lhi!;" + "'", str15, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(VLhi!;)Lhi!;" + "'", str25, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str30, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str31, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L45926706" + "'", str49, "L45926706");
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test24581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24581");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int4 = type3.getDimensions();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type10, type13 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type20, type23 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type6, type7, type9, type17, type19, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray29);
        int int31 = type3.getDimensions();
        java.lang.Class<?> wildcardClass32 = type3.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        java.lang.String str37 = type36.getInternalName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getObjectType("L744398445");
        int int41 = type40.getDimensions();
        int int43 = type40.getOpcode(96);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType("V");
        int int47 = type46.getSort();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int51 = type50.getDimensions();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local61 = new org.mockito.cglib.core.Local((int) (short) 0, type60);
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type57, type60 };
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray62);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type67 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local71 = new org.mockito.cglib.core.Local((int) (short) 0, type70);
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] { type67, type70 };
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type66, typeArray72);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray76 = new org.mockito.asm.Type[] { type53, type54, type56, type64, type66, type75 };
        org.mockito.cglib.core.Signature signature77 = new org.mockito.cglib.core.Signature("hi!", type50, typeArray76);
        java.lang.String str78 = signature77.getDescriptor();
        java.lang.String str79 = signature77.toString();
        java.lang.String str80 = signature77.getName();
        org.mockito.asm.Type[] typeArray81 = signature77.getArgumentTypes();
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("LL744398445;", type46, typeArray81);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("LL596645342;", type40, typeArray81);
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("L1302909583", type36, typeArray81);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(VLhi!;)Lhi!;" + "'", str16, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(VLhi!;)Lhi!;" + "'", str26, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org/mockito/asm/Type" + "'", str33, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org/mockito/asm/Type" + "'", str35, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "org/mockito/asm/Type" + "'", str37, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(VLhi!;)Lhi!;" + "'", str63, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "(VLhi!;)Lhi!;" + "'", str73, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str78, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str79, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(typeArray81);
    }

    @Test
    public void test24582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24582");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitMethodInsn(137, "L1705954438", "L1774264911", "L967325312");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24583");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.String str14 = label13.toString();
        java.lang.Object obj15 = label13.info;
        java.lang.String str16 = label13.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int19 = type18.getDimensions();
        java.lang.String str20 = type18.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type23, type26 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray28);
        java.lang.String str31 = type18.getInternalName();
        boolean boolean33 = type18.equals((java.lang.Object) (byte) 10);
        int int34 = type18.getSort();
        int int35 = type18.getSort();
        int int36 = type18.getSort();
        int int38 = type18.getOpcode(155);
        label13.info = int38;
        java.lang.String str40 = label13.toString();
        java.lang.String str41 = label13.toString();
        org.mockito.asm.Label label42 = new org.mockito.asm.Label();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getReturnType("(VLhi!;)L(VLhi!;)Lhi!;;");
        label42.info = "(VLhi!;)L(VLhi!;)Lhi!;;";
        java.lang.String str46 = label42.toString();
        java.lang.Object obj47 = label42.info;
        java.lang.Object obj48 = label42.info;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int53 = type52.getDimensions();
        java.lang.String str54 = type52.toString();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local61 = new org.mockito.cglib.core.Local((int) (short) 0, type60);
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type57, type60 };
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray62);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray62);
        java.lang.String str65 = type52.getInternalName();
        boolean boolean67 = type52.equals((java.lang.Object) (byte) 10);
        int int68 = type52.getSort();
        int int69 = type52.getSort();
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local(156, type52);
        org.mockito.cglib.core.Local local71 = new org.mockito.cglib.core.Local((int) (short) 1, type52);
        label42.info = local71;
        java.lang.String str73 = label42.toString();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local78 = new org.mockito.cglib.core.Local((int) (short) 0, type77);
        org.mockito.cglib.core.Local local79 = new org.mockito.cglib.core.Local((int) (short) 1, type77);
        int int80 = local79.getIndex();
        org.mockito.asm.Type type81 = local79.getType();
        org.mockito.asm.Type type82 = local79.getType();
        int int83 = type82.getDimensions();
        label42.info = int83;
        java.lang.Object obj85 = label42.info;
        java.lang.Object obj86 = label42.info;
        java.lang.Object obj87 = null;
        label42.info = obj87;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLocalVariable("L1261050892", "L1024983108", "L2131213433", label13, label42, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 124");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1160647590" + "'", str14, "L1160647590");
        org.junit.Assert.assertNull(obj15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1160647590" + "'", str16, "L1160647590");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str20, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(VLhi!;)Lhi!;" + "'", str29, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str30, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(VLhi!;)Lhi!;" + "'", str31, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 159 + "'", int38 == 159);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "L1160647590" + "'", str40, "L1160647590");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "L1160647590" + "'", str41, "L1160647590");
        org.junit.Assert.assertNotNull(type44);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "L496351795" + "'", str46, "L496351795");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", obj47, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", obj48, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str54, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(VLhi!;)Lhi!;" + "'", str63, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str64, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "(VLhi!;)Lhi!;" + "'", str65, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "L496351795" + "'", str73, "L496351795");
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + 1 + "'", obj85, 1);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + 1 + "'", obj86, 1);
    }

    @Test
    public void test24584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24584");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        int int4 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int8 = type7.getDimensions();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type17 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type27);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type24, type27 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type10, type11, type13, type21, type23, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", type7, typeArray33);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int38 = type37.getDimensions();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((int) (short) 0, type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type44, type47 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local((int) (short) 0, type57);
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type54, type57 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray59);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type40, type41, type43, type51, type53, type62 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("hi!", type37, typeArray63);
        boolean boolean65 = signature34.equals((java.lang.Object) "hi!");
        java.lang.String str66 = signature34.toString();
        java.lang.String str67 = signature34.getDescriptor();
        java.lang.String str68 = signature34.getDescriptor();
        java.lang.String str69 = signature34.getName();
        org.mockito.asm.Type[] typeArray70 = signature34.getArgumentTypes();
        org.mockito.asm.Type[] typeArray71 = signature34.getArgumentTypes();
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("L1503181220", type1, typeArray71);
        org.mockito.asm.Type[] typeArray73 = signature72.getArgumentTypes();
        java.lang.String str74 = signature72.toString();
        java.lang.String str75 = signature72.getName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(VLhi!;)Lhi!;" + "'", str20, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(VLhi!;)Lhi!;" + "'", str30, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(VLhi!;)Lhi!;" + "'", str50, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(VLhi!;)Lhi!;" + "'", str60, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str66, "hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str67, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;" + "'", str68, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "L1503181220(Lhi!;ILhi!;DLhi!;L(VLhi!;)I" + "'", str74, "L1503181220(Lhi!;ILhi!;DLhi!;L(VLhi!;)I");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "L1503181220" + "'", str75, "L1503181220");
    }

    @Test
    public void test24585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24585");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        java.lang.String str3 = label2.toString();
        java.lang.Object obj4 = label2.info;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        label2.info = classEmitter5;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter25.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter34.getClassInfo();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classAdapter37);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classAdapter37);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter43 = classEmitter22.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7e9f4bdd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1844517769" + "'", str3, "L1844517769");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo35);
    }

    @Test
    public void test24586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24586");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        java.lang.Object obj12 = label10.info;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter13.getClassInfo();
        label10.info = classEmitter13;
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassVisitor classVisitor32 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter(classVisitor32);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("L27434184", "L1297182786");
        java.lang.String str50 = signature49.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor51 = classEmitter9.visitField(96, "", "L697007610L1188086752", "L2140926193", (java.lang.Object) signature49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L2265870" + "'", str11, "L2265870");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "L27434184L1297182786" + "'", str50, "L27434184L1297182786");
    }

    @Test
    public void test24587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24587");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("F", "(VLhi!;)Lhi!;");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        int int5 = type4.getDimensions();
        java.lang.String str6 = type4.getInternalName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "F" + "'", str3, "F");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test24588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24588");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(VLhi!;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(VLhi!;)L(VLhi!;)Lhi!;;");
        label10.info = "(VLhi!;)L(VLhi!;)Lhi!;;";
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int18 = type17.getDimensions();
        java.lang.String str19 = type17.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type22, type25 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray27);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray27);
        java.lang.String str30 = type17.getInternalName();
        boolean boolean32 = type17.equals((java.lang.Object) (byte) 10);
        int int33 = type17.getSort();
        java.lang.String str34 = type17.getDescriptor();
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(0, type17);
        java.lang.String str36 = type17.getClassName();
        label10.info = str36;
        java.lang.String str38 = label10.toString();
        org.mockito.asm.Type[] typeArray40 = org.mockito.asm.Type.getArgumentTypes("hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        label10.info = typeArray40;
        java.lang.String str42 = label10.toString();
        int[] intArray48 = new int[] { 18, 135, 9, 45, (-1) };
        org.mockito.asm.Label[] labelArray49 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLookupSwitchInsn(label10, intArray48, labelArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1380918069" + "'", str11, "L1380918069");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str19, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(VLhi!;)Lhi!;" + "'", str28, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str29, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(VLhi!;)Lhi!;" + "'", str30, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str34, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(VLhi!;)Lhi!;" + "'", str36, "(VLhi!;)Lhi!;");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L1380918069" + "'", str38, "L1380918069");
        org.junit.Assert.assertNotNull(typeArray40);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L1380918069" + "'", str42, "L1380918069");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[18, 135, 9, 45, -1]");
        org.junit.Assert.assertNotNull(labelArray49);
    }

    @Test
    public void test24589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24589");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitAttribute(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24590");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.asm.Label label15 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter13.visitJumpInsn(163, label15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24591");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(154, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)LL1503181220;", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 0, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)LL1503181220;", (org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter12.visitFieldInsn(46, "L1743297573", "L924112741", "L829996493");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24592");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int4 = type3.getDimensions();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type10, type13 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type20, type23 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type6, type7, type9, type17, type19, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray29);
        int int31 = type3.getDimensions();
        java.lang.Class<?> wildcardClass32 = type3.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        java.lang.String str37 = type36.getInternalName();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int42 = type41.getDimensions();
        java.lang.String str43 = type41.toString();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local((int) (short) 0, type49);
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type46, type49 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray51);
        java.lang.String str54 = type41.getInternalName();
        boolean boolean56 = type41.equals((java.lang.Object) (byte) 10);
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((-1), type41);
        org.mockito.asm.Type type58 = local57.getType();
        int int60 = type58.getOpcode(15);
        int int62 = type58.getOpcode(153);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("(VLhi!;)Lhi!;");
        int int65 = type64.getDimensions();
        java.lang.String str66 = type64.toString();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type69 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local73 = new org.mockito.cglib.core.Local((int) (short) 0, type72);
        org.mockito.asm.Type[] typeArray74 = new org.mockito.asm.Type[] { type69, type72 };
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray74);
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type64, typeArray74);
        java.lang.String str77 = type64.getInternalName();
        boolean boolean79 = type64.equals((java.lang.Object) (byte) 10);
        int int80 = type64.getSort();
        int int81 = type64.getSort();
        int int82 = type64.getSize();
        org.mockito.asm.Type type84 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type85 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type88 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Local local89 = new org.mockito.cglib.core.Local((int) (short) 0, type88);
        org.mockito.asm.Type[] typeArray90 = new org.mockito.asm.Type[] { type85, type88 };
        java.lang.String str91 = org.mockito.asm.Type.getMethodDescriptor(type84, typeArray90);
        java.lang.String str92 = org.mockito.asm.Type.getMethodDescriptor(type64, typeArray90);
        org.mockito.cglib.core.Signature signature93 = new org.mockito.cglib.core.Signature("L1958259120", type58, typeArray90);
        boolean boolean95 = signature93.equals((java.lang.Object) 0.0d);
        org.mockito.asm.Type[] typeArray96 = signature93.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature97 = new org.mockito.cglib.core.Signature("J(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;", type36, typeArray96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'J(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(VLhi!;)Lhi!;" + "'", str16, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(VLhi!;)Lhi!;" + "'", str26, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org/mockito/asm/Type" + "'", str33, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org/mockito/asm/Type" + "'", str35, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "org/mockito/asm/Type" + "'", str37, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str43, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(VLhi!;)Lhi!;" + "'", str52, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str53, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(VLhi!;)Lhi!;" + "'", str54, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 19 + "'", int60 == 19);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 157 + "'", int62 == 157);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "L(VLhi!;)Lhi!;;" + "'", str66, "L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(VLhi!;)Lhi!;" + "'", str75, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str76, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "(VLhi!;)Lhi!;" + "'", str77, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10 + "'", int81 == 10);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(type85);
        org.junit.Assert.assertNotNull(type88);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "(VLhi!;)Lhi!;" + "'", str91, "(VLhi!;)Lhi!;");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "(VLhi!;)L(VLhi!;)Lhi!;;" + "'", str92, "(VLhi!;)L(VLhi!;)Lhi!;;");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(typeArray96);
    }

    @Test
    public void test24593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24593");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L453269470");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test24594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24594");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "L1465096978" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter4.visitMethod(49, "L780896428L2045432028", "L699871361", "L369584253", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1e01f6b1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test24595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24595");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(5, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter11);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter12.visitIincInsn((int) (byte) 1, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24596");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType("hi!(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;");
        java.lang.String str4 = type3.toString();
        label0.info = str4;
        java.lang.Object obj6 = label0.info;
        org.mockito.asm.MethodVisitor methodVisitor9 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        label0.info = localVariablesSorter14;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter16 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter14);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter17 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter16);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter18 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter17);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter17.visitMaxs(0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1015647762" + "'", str1, "L1015647762");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Li!(Lhi!;" + "'", str4, "Li!(Lhi!;");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "Li!(Lhi!;" + "'", obj6, "Li!(Lhi!;");
    }

    @Test
    public void test24597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24597");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lhi!", "(Lhi!;ILhi!;DLhi!;L(VLhi!;)F");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("L1110211023");
        int int5 = type4.getSort();
        int int6 = type4.getSize();
        boolean boolean7 = signature2.equals((java.lang.Object) type4);
        java.lang.String str8 = signature2.getName();
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lhi!" + "'", str8, "Lhi!");
    }

    @Test
    public void test24598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24598");
        org.mockito.asm.MethodVisitor methodVisitor8 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(5, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)L(VLhi!;)Lhi!;;", (org.mockito.asm.MethodVisitor) localVariablesSorter13);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter15 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter14);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter16 = new org.mockito.cglib.core.LocalVariablesSorter(108, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lorg/mockito/cglib/core/Local;", (org.mockito.asm.MethodVisitor) localVariablesSorter15);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter17 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter16);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter18 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter16);
        org.mockito.asm.Attribute attribute19 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter18.visitAttribute(attribute19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24599");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitLdcInsn((java.lang.Object) "L467926752(Lhi!;ILhi!;DLhi!;L(VLhi!;)L(VLhi!;)Lhi!;;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24600");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitMethodInsn(132, "L128785974", "L1121276702", "L1557355901");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24601");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(VLhi!;)Lhi!;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(154, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)LL1503181220;", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 0, "(Lhi!;ILhi!;DLhi!;L(VLhi!;)Lhi!;;)LL1503181220;", (org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter15 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter15.visitTypeInsn(27, "L1738748988hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
