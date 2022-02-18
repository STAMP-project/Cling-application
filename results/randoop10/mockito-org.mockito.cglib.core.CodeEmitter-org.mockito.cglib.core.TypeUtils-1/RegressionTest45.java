import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest45 {

    public static boolean debug = false;

    @Test
    public void test22501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22501");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter15 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter14);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter16 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter17 = new org.mockito.cglib.core.LocalVariablesSorter(155, "L1040075597", (org.mockito.asm.MethodVisitor) localVariablesSorter15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22502");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L135787045", "<init>(Ljava/lang/Hi!;)V");
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type7 };
        org.mockito.asm.Type type9 = null;
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type11);
        int int14 = type11.getOpcode(108);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("F");
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("C", type11, typeArray16);
        org.mockito.asm.Type type18 = signature17.getReturnType();
        org.mockito.asm.MethodVisitor methodVisitor21 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor21);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter23 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter22);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter24 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter25 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        boolean boolean26 = type18.equals((java.lang.Object) localVariablesSorter25);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter27 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter25);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter28 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter27);
        boolean boolean29 = signature2.equals((java.lang.Object) localVariablesSorter27);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter30 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter27);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter31 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter27);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter31.visitFieldInsn((int) (short) 10, "L349175454", "L612827666", "java/lang/Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 110 + "'", int14 == 110);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test22503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22503");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("L1742696907");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test22504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22504");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("short");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int4 = type1.getOpcode(10);
        int int5 = type1.getSize();
        int int7 = type1.getOpcode(153);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        int int10 = type1.getSort();
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isPrimitive(type11);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("L170622043");
        boolean boolean17 = type15.equals((java.lang.Object) "L665983182");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("short");
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type25, type27 };
        org.mockito.asm.Type type29 = null;
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type29);
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type34);
        java.lang.String str36 = type34.getInternalName();
        int int38 = type34.getOpcode(104);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type34);
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray39);
        int int42 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray39);
        int int43 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray39);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("L805411308", type15, typeArray39);
        boolean boolean45 = type11.equals((java.lang.Object) typeArray39);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14 + "'", int4 == 14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 157 + "'", int7 == 157);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 108 + "'", int38 == 108);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(L;L;)Lshort;" + "'", str41, "(L;L;)Lshort;");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test22505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22505");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = signature13.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type19, type21 };
        org.mockito.asm.Type type23 = null;
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray22);
        java.lang.Class<?> wildcardClass28 = type17.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray30 = new java.lang.Class[] { wildcardClass14, wildcardClass28 };
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Label label41 = new org.mockito.asm.Label();
        java.lang.String str42 = label41.toString();
        label41.info = 1L;
        java.lang.Object obj45 = label41.info;
        java.lang.Object obj46 = label41.info;
        java.lang.String str47 = label41.toString();
        java.lang.String[] strArray49 = new java.lang.String[] { "L614449524" };
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray49);
        org.mockito.asm.Type type51 = null;
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type51);
        org.mockito.cglib.core.Signature signature54 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1483364670");
        org.mockito.asm.Type[] typeArray55 = signature54.getArgumentTypes();
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray50, typeArray55);
        label41.info = typeArray55;
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray40, typeArray55);
        java.lang.String[] strArray59 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray40);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray59);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor61 = classEmitter0.visitMethod(105, "L2076793445", "L2123515392", "(S)V", strArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6a6a9bfe");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str15, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(L;L;)L;" + "'", str27, "(L;L;)L;");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str29, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L1650315208" + "'", str42, "L1650315208");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 1L + "'", obj45, 1L);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 1L + "'", obj46, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "L1650315208" + "'", str47, "L1650315208");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(signature54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(typeArray60);
    }

    @Test
    public void test22506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22506");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("short");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("[Lorg/mockito/asm/Type;");
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("L104571218", type8, typeArray11);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type3, typeArray11);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getBoxedType(type19);
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isArray(type21);
        java.lang.String str23 = type21.getDescriptor();
        java.lang.String str24 = type21.toString();
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getBoxedType(type21);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("shortL;");
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L2059103137", type21, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("L1410472451", type3, typeArray27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        boolean boolean32 = type30.equals((java.lang.Object) "L1861846555");
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.getPackageName(type30);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L;" + "'", str23, "L;");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L;" + "'", str24, "L;");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test22507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22507");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = "L;";
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        label0.info = type5;
        java.lang.Object obj8 = label0.info;
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("L1410472451");
        label0.info = type10;
        java.lang.String str12 = label0.toString();
        java.lang.Object obj13 = label0.info;
        org.mockito.asm.MethodVisitor methodVisitor18 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter19 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor18);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter20 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter19);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter21 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter23 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(LL69280469;)V", (org.mockito.asm.MethodVisitor) localVariablesSorter22);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter24 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        label0.info = localVariablesSorter23;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter26 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter27 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter28 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter29 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter23.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L2101123369" + "'", str1, "L2101123369");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "L;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "L;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "L;");
        org.junit.Assert.assertNotNull(type10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L2101123369" + "'", str12, "L2101123369");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "LL1410472451;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "LL1410472451;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "LL1410472451;");
    }

    @Test
    public void test22508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22508");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.asm.Type type8 = null;
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type10);
        int int13 = type10.getOpcode(108);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("F");
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("C", type10, typeArray15);
        org.mockito.asm.Type type17 = signature16.getReturnType();
        org.mockito.asm.MethodVisitor methodVisitor20 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter21 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter21);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter23 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter22);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter24 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter22);
        boolean boolean25 = type17.equals((java.lang.Object) localVariablesSorter24);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter26 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter24);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter27 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter26);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter28 = new org.mockito.cglib.core.LocalVariablesSorter(40, "(Ljava/lang/L1483364670;)Lshort;", (org.mockito.asm.MethodVisitor) localVariablesSorter26);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter26.visitVarInsn(7, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 110 + "'", int13 == 110);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test22509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22509");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMultiANewArrayInsn("L80157018", 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22510");
        org.mockito.asm.MethodVisitor methodVisitor10 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter15 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(LL69280469;)V", (org.mockito.asm.MethodVisitor) localVariablesSorter14);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter16 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter15);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter17 = new org.mockito.cglib.core.LocalVariablesSorter(9, "(L;L;L;L;L;L;)LC;", (org.mockito.asm.MethodVisitor) localVariablesSorter16);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter18 = new org.mockito.cglib.core.LocalVariablesSorter(101, "(LL217518997;)L;", (org.mockito.asm.MethodVisitor) localVariablesSorter17);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter19 = new org.mockito.cglib.core.LocalVariablesSorter(44, "(L;L;L;L;L;L;)LShortL;", (org.mockito.asm.MethodVisitor) localVariablesSorter18);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter19.visitTypeInsn(48, "L1188830806");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22511");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("(Ljava/lang/(L;)Linit>(Ljava/lang/(L;");
        java.lang.String str2 = signature1.getDescriptor();
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(Ljava/lang/(Ljava/lang/(L;;)V" + "'", str2, "(Ljava/lang/(Ljava/lang/(L;;)V");
    }

    @Test
    public void test22512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22512");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("$28Ljava$2Flang$2FL1822362857$3B$29V");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22513");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Ljava/lang/(L;");
        org.mockito.asm.Type type2 = signature1.getReturnType();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        boolean boolean47 = type2.equals((java.lang.Object) classEmitter23);
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test22514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22514");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "L24797399");
        java.lang.String str3 = signature2.getName();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = signature6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.asm.Type type18 = null;
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray17);
        java.lang.Class<?> wildcardClass23 = type12.getClass();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass27 = signature26.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        java.lang.Class[] classArray30 = new java.lang.Class[] { wildcardClass7, wildcardClass23, wildcardClass27 };
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type36, type38, type40, type42, type44, type46 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type34, typeArray47);
        boolean boolean50 = signature48.equals((java.lang.Object) (byte) 0);
        boolean boolean52 = signature48.equals((java.lang.Object) 100);
        java.lang.String str53 = signature48.getDescriptor();
        java.lang.String str54 = signature48.getName();
        org.mockito.asm.Type type55 = signature48.getReturnType();
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type55);
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type58, type60 };
        org.mockito.asm.Type type62 = null;
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type62);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type64);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type67, type69 };
        org.mockito.asm.Type type71 = null;
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray70, type71);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.add(typeArray65, typeArray70);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.getObjectType("<init>(Ljava/lang/Lorg/mockito/asm/Type;;)V");
        java.lang.String str76 = org.mockito.cglib.core.TypeUtils.getClassName(type75);
        org.mockito.asm.Type type77 = type75.getElementType();
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.add(typeArray73, type75);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray78);
        org.mockito.asm.Type type81 = org.mockito.asm.Type.getObjectType("<init>(Ljava/lang/Lorg/mockito/asm/Type;;)V");
        java.lang.String str82 = org.mockito.cglib.core.TypeUtils.getClassName(type81);
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.add(typeArray79, type81);
        boolean boolean84 = signature2.equals((java.lang.Object) typeArray83);
        java.lang.Class<?> wildcardClass85 = typeArray83.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str8, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str9, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str10, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(L;L;)L;" + "'", str22, "(L;L;)L;");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str28, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str29, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(L;L;L;L;L;L;)L;" + "'", str53, "(L;L;L;L;L;L;)L;");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V" + "'", str76, "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V");
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V" + "'", str82, "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V");
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test22515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22515");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L298070624", "L307181268");
    }

    @Test
    public void test22516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22516");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("L1129468522");
        org.mockito.asm.Type type2 = type1.getElementType();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test22517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22517");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(5, "(L;L;)Lorg/mockito/asm/Type;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(Ljava/lang/L614449524;)LC;", (org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.String str19 = label18.toString();
        label18.info = "L;";
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type25 };
        org.mockito.asm.Type type27 = null;
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type29);
        int int31 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type29);
        java.lang.Class<?> wildcardClass32 = type29.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass32);
        label18.info = str33;
        java.lang.String str35 = label18.toString();
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getBoxedType(type38);
        java.lang.String str41 = type40.toString();
        int int42 = type40.getSize();
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local(10, type40);
        org.mockito.asm.Type type44 = local43.getType();
        label18.info = local43;
        java.lang.Object obj46 = label18.info;
        java.lang.String str47 = label18.toString();
        org.mockito.cglib.core.Signature signature49 = org.mockito.cglib.core.TypeUtils.parseConstructor("Ljava/lang/(L;");
        org.mockito.asm.Type type50 = signature49.getReturnType();
        label18.info = type50;
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str54 = type53.getClassName();
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        boolean boolean56 = org.mockito.cglib.core.TypeUtils.isArray(type55);
        int int57 = type55.getSort();
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isArray(type55);
        label18.info = type55;
        org.mockito.asm.Label label60 = new org.mockito.asm.Label();
        java.lang.String str61 = label60.toString();
        label60.info = "L;";
        java.lang.String str64 = label60.toString();
        java.lang.String str65 = label60.toString();
        java.lang.String str66 = label60.toString();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getObjectType("short");
        boolean boolean69 = org.mockito.cglib.core.TypeUtils.isPrimitive(type68);
        int int71 = type68.getOpcode(10);
        int int72 = type68.getSize();
        int int74 = type68.getOpcode(153);
        java.lang.String str75 = org.mockito.cglib.core.TypeUtils.getPackageName(type68);
        label60.info = type68;
        org.mockito.asm.Type type79 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type81 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray82 = new org.mockito.asm.Type[] { type79, type81 };
        org.mockito.asm.Type type83 = null;
        org.mockito.asm.Type[] typeArray84 = org.mockito.cglib.core.TypeUtils.add(typeArray82, type83);
        org.mockito.asm.Type type85 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray86 = org.mockito.cglib.core.TypeUtils.add(typeArray82, type85);
        int int88 = type85.getOpcode(108);
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.parseTypes("F");
        org.mockito.cglib.core.Signature signature91 = new org.mockito.cglib.core.Signature("C", type85, typeArray90);
        java.lang.String[] strArray92 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray90);
        label60.info = strArray92;
        java.lang.String str94 = label60.toString();
        java.lang.Object obj95 = label60.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter13.visitLocalVariable("L340812711", "(L;L;)Lfloat;", "Lorg.mockito.cglib.core", label18, label60, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 101");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L821342818" + "'", str19, "L821342818");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str33, "Lorg/mockito/asm/Type;");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L821342818" + "'", str35, "L821342818");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "L;" + "'", str41, "L;");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(obj46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "L821342818" + "'", str47, "L821342818");
        org.junit.Assert.assertNotNull(signature49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "L390964200" + "'", str61, "L390964200");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "L390964200" + "'", str64, "L390964200");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "L390964200" + "'", str65, "L390964200");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "L390964200" + "'", str66, "L390964200");
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 14 + "'", int71 == 14);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 157 + "'", int74 == 157);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(typeArray84);
        org.junit.Assert.assertNotNull(type85);
        org.junit.Assert.assertNotNull(typeArray86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 110 + "'", int88 == 110);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(strArray92);
// flaky:         org.junit.Assert.assertEquals("'" + str94 + "' != '" + "L390964200" + "'", str94, "L390964200");
        org.junit.Assert.assertNotNull(obj95);
    }

    @Test
    public void test22518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22518");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.parseTypes("short");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getReturnType("[Lorg/mockito/asm/Type;");
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("L104571218", type9, typeArray12);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type4, typeArray12);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getBoxedType(type20);
        boolean boolean23 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        java.lang.String str24 = type22.getDescriptor();
        java.lang.String str25 = type22.toString();
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type22);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.parseTypes("shortL;");
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("L2059103137", type22, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("L1410472451", type4, typeArray28);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type36, type38, type40, type42, type44, type46 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type34, typeArray47);
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type53, type55, type57, type59, type61, type63 };
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type51, typeArray64);
        boolean boolean66 = org.mockito.cglib.core.TypeUtils.isPrimitive(type51);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type51);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray47, type67);
        java.lang.String[] strArray69 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray68);
        org.mockito.cglib.core.Signature signature70 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray68);
        org.mockito.asm.Type[] typeArray71 = signature70.getArgumentTypes();
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("L729176593", type4, typeArray71);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.parseTypes("L1818164453");
        org.mockito.asm.Type type76 = org.mockito.asm.Type.getObjectType("short");
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type76);
        int int78 = type76.getDimensions();
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.add(typeArray74, type76);
        java.lang.String[] strArray80 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray74);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray80);
        java.lang.String[] strArray82 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray81);
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.add(typeArray71, typeArray81);
        org.mockito.cglib.core.Signature signature84 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray81);
        java.lang.String str85 = signature84.toString();
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L;" + "'", str24, "L;");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L;" + "'", str25, "L;");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(signature70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertNotNull(signature84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "<init>(Ljava/lang/L1818164453;)V" + "'", str85, "<init>(Ljava/lang/L1818164453;)V");
    }

    @Test
    public void test22519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22519");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22520");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.asm.Type type11 = null;
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type4, typeArray14);
        org.mockito.asm.MethodVisitor methodVisitor18 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter19 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor18);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter20 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter19);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter21 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter21);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter23 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter22);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter24 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        boolean boolean25 = type4.equals((java.lang.Object) localVariablesSorter24);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter26 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter24);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter27 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter26);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter28 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter26);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter29 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter26);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter30 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 10, "(LL217518997;)L;", (org.mockito.asm.MethodVisitor) localVariablesSorter29);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter31 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter30);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter32 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter30);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter33 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter32);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter32.visitVarInsn((int) (byte) 100, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test22521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22521");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(5, "(L;L;)Lorg/mockito/asm/Type;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitInsn(142);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22522");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22523");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("L1673662630");
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("short");
        int int5 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray4);
        int int6 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray4);
        int int7 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray4);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("L1623759892shortL;", type2, typeArray4);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test22524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22524");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L1818164453");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.asm.Type type7 = null;
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.asm.Type type14 = null;
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray13);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type21, type23 };
        org.mockito.asm.Type type25 = null;
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.getClassName(type30);
        java.lang.String str32 = type30.getInternalName();
        int int34 = type30.getOpcode(104);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type30);
        java.lang.String str36 = type30.getClassName();
        int int37 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type30);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type30);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray40);
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray40);
        java.lang.Class<?> wildcardClass43 = typeArray40.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 108 + "'", int34 == 108);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test22525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22525");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1564619092");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22526");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = "L;";
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type7 };
        org.mockito.asm.Type type9 = null;
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type11);
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        java.lang.Class<?> wildcardClass14 = type11.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        label0.info = str15;
        java.lang.Object obj17 = label0.info;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.String str19 = label18.toString();
        label0.info = str19;
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = signature23.getClass();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass26);
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass24, wildcardClass26 };
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        label0.info = typeArray31;
        java.lang.Object obj33 = label0.info;
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type38, type40, type42, type44, type46, type48 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("", type36, typeArray49);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type55, type57, type59, type61, type63, type65 };
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("", type53, typeArray66);
        boolean boolean68 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type53);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray49, type69);
        java.lang.String[] strArray71 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray70);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray71);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray71);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray71);
        label0.info = strArray71;
        java.lang.Object obj76 = label0.info;
        java.lang.String str77 = label0.toString();
        java.lang.String str78 = label0.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L930872300" + "'", str1, "L930872300");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str15, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "Lorg/mockito/asm/Type;" + "'", obj17, "Lorg/mockito/asm/Type;");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1070249942" + "'", str19, "L1070249942");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org/mockito/asm/Type" + "'", str27, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str28, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(obj76);
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "L930872300" + "'", str77, "L930872300");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "L930872300" + "'", str78, "L930872300");
    }

    @Test
    public void test22527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22527");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("L1094742106");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int4 = type2.getOpcode(6);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test22528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22528");
        org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("(LL27696833;)LL296646621;");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test22529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22529");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type2);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type7 };
        org.mockito.asm.Type type9 = null;
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type2, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("<init>(L;L;F)V");
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        int int19 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray17);
        int int20 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray17);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(signature21);
    }

    @Test
    public void test22530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22530");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("L217518997");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = signature6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.asm.Type type18 = null;
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray17);
        java.lang.Class<?> wildcardClass23 = type12.getClass();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass27 = signature26.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        java.lang.Class[] classArray30 = new java.lang.Class[] { wildcardClass7, wildcardClass23, wildcardClass27 };
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray32);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) (short) 100, type40);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type43, type45 };
        org.mockito.asm.Type type47 = null;
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type40, typeArray46);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.parseTypes("L1818164453");
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray46, typeArray51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray46);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) (short) 100, type56);
        org.mockito.asm.Type type58 = local57.getType();
        java.lang.String str59 = type58.getClassName();
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type58);
        java.lang.String[] strArray61 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray60);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray61);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str66 = type65.getClassName();
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        java.lang.String str68 = type65.toString();
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        org.mockito.asm.Type type70 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type69);
        org.mockito.cglib.core.Local local71 = new org.mockito.cglib.core.Local(21, type69);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray62, type69);
        int int73 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray62);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str8, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str9, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str10, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(L;L;)L;" + "'", str22, "(L;L;)L;");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str28, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str29, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;" + "'", str36, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "L;" + "'", str68, "L;");
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 4 + "'", int73 == 4);
    }

    @Test
    public void test22531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22531");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22532");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(184);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22533");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type3 };
        org.mockito.asm.Type type5 = null;
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type5);
        java.lang.Class<?> wildcardClass7 = typeArray6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str8, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str9, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str10, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str11, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str12, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str14, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str15, "[Lorg/mockito/asm/Type;");
    }

    @Test
    public void test22534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22534");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L64466569");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("L614449524(LL614449524;)S");
        boolean boolean6 = signature2.equals((java.lang.Object) type5);
        java.lang.String str7 = signature2.getDescriptor();
        java.lang.String str8 = signature2.getName();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(Ljava/lang/L64466569;)V" + "'", str3, "(Ljava/lang/L64466569;)V");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(Ljava/lang/L64466569;)V" + "'", str7, "(Ljava/lang/L64466569;)V");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<init>" + "'", str8, "<init>");
    }

    @Test
    public void test22535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22535");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.asm.Type type11 = null;
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type4, typeArray14);
        org.mockito.asm.MethodVisitor methodVisitor18 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter19 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor18);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter20 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter19);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter21 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter21);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter23 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter22);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter24 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        boolean boolean25 = type4.equals((java.lang.Object) localVariablesSorter24);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter26 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter24);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter27 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter26);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter28 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(L;L;)S", (org.mockito.asm.MethodVisitor) localVariablesSorter27);
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.String str30 = label29.toString();
        label29.info = "L;";
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type34, type36 };
        org.mockito.asm.Type type38 = null;
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray37, type38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray37, type40);
        int int42 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type40);
        java.lang.Class<?> wildcardClass43 = type40.getClass();
        java.lang.String str44 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass43);
        label29.info = str44;
        java.lang.String str46 = label29.toString();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str49 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type48);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type48);
        label29.info = type48;
        java.lang.Object obj52 = label29.info;
        java.lang.Object obj53 = label29.info;
        java.lang.String str54 = label29.toString();
        int[] intArray60 = new int[] { 64, 'a', 101, 97, 159 };
        org.mockito.asm.Label[] labelArray61 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter27.visitLookupSwitchInsn(label29, intArray60, labelArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1698492051" + "'", str30, "L1698492051");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6 + "'", int42 == 6);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str44, "Lorg/mockito/asm/Type;");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "L1698492051" + "'", str46, "L1698492051");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "C" + "'", str49, "C");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "LC;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "LC;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "LC;");
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "LC;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "LC;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "LC;");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "L1698492051" + "'", str54, "L1698492051");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[64, 97, 101, 97, 159]");
        org.junit.Assert.assertNotNull(labelArray61);
    }

    @Test
    public void test22536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22536");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(5, "(L;L;)Lorg/mockito/asm/Type;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(Ljava/lang/L614449524;)LC;", (org.mockito.asm.MethodVisitor) localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitFieldInsn(18, "L1655265672", "java.lang.L602401257L1822362857", "LL750891708;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22537");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        int int5 = type3.getSize();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (byte) 1, type3);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(108, type3);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(142, type3);
        org.mockito.asm.Type type10 = local9.getType();
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "F" + "'", str4, "F");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "float" + "'", str8, "float");
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test22538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22538");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = 1L;
        java.lang.Object obj4 = label0.info;
        java.lang.Object obj5 = label0.info;
        java.lang.String str6 = label0.toString();
        label0.info = "L2097555035";
        java.lang.Object obj9 = label0.info;
        org.mockito.asm.MethodVisitor methodVisitor16 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter17 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor16);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter18 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter17);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter19 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter18);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter20 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter18);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter21 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(LL69280469;)V", (org.mockito.asm.MethodVisitor) localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter(104, "(L;L;)Lshort;", (org.mockito.asm.MethodVisitor) localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter23 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter22);
        label0.info = localVariablesSorter23;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter25 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter26 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter25);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter27 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter25);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter28 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter27);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter28.visitTypeInsn(181, "$2428L$243BL$243BL$243BL$243BL$243BL$243B$2429I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L738531599" + "'", str1, "L738531599");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1L + "'", obj4, 1L);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1L + "'", obj5, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L738531599" + "'", str6, "L738531599");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "L2097555035" + "'", obj9, "L2097555035");
    }

    @Test
    public void test22539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22539");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(179);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22540");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(5, "(L;L;)Lorg/mockito/asm/Type;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitVarInsn(159, 173);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22541");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Lorg/mockito/asm/Type;");
        java.lang.String str2 = type1.toString();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLorg/mockito/asm/Type;" + "'", str2, "LLorg/mockito/asm/Type;");
    }

    @Test
    public void test22542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22542");
        org.mockito.asm.MethodVisitor methodVisitor8 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(LL69280469;)V", (org.mockito.asm.MethodVisitor) localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter15 = new org.mockito.cglib.core.LocalVariablesSorter(9, "(L;L;L;L;L;L;)LC;", (org.mockito.asm.MethodVisitor) localVariablesSorter14);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter16 = new org.mockito.cglib.core.LocalVariablesSorter(154, "(Ljava/lang/L1818164453;)Ljava/lang/Hi!;", (org.mockito.asm.MethodVisitor) localVariablesSorter14);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter17 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter16);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter18 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter16);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter19 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter18);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter19.visitFieldInsn(112, "", "L132538390", "L1323892721");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22543");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("short");
        int int3 = type2.getDimensions();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(100, type2);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        int int7 = local4.getIndex();
        int int8 = local4.getIndex();
        org.mockito.asm.Type type9 = local4.getType();
        org.mockito.asm.Type type10 = local4.getType();
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.getPackageName(type10);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test22544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22544");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
    }

    @Test
    public void test22545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22545");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.asm.Type type11 = null;
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type4, typeArray14);
        org.mockito.asm.MethodVisitor methodVisitor18 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter19 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor18);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter20 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter19);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter21 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter21);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter23 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter22);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter24 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        boolean boolean25 = type4.equals((java.lang.Object) localVariablesSorter24);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter26 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter24);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter27 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter26);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter28 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", (org.mockito.asm.MethodVisitor) localVariablesSorter26);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter28.visitMultiANewArrayInsn("L1399480592", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test22546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22546");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = 1L;
        java.lang.Object obj4 = label0.info;
        java.lang.Object obj5 = label0.info;
        java.lang.String str6 = label0.toString();
        label0.info = "L2097555035";
        java.lang.Object obj9 = label0.info;
        org.mockito.asm.MethodVisitor methodVisitor16 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter17 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor16);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter18 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter17);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter19 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter18);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter20 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter18);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter21 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(LL69280469;)V", (org.mockito.asm.MethodVisitor) localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter(104, "(L;L;)Lshort;", (org.mockito.asm.MethodVisitor) localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter23 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter22);
        label0.info = localVariablesSorter23;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter25 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter26 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter25);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter27 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter25);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter25.visitInsn((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1988124336" + "'", str1, "L1988124336");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1L + "'", obj4, 1L);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1L + "'", obj5, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1988124336" + "'", str6, "L1988124336");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "L2097555035" + "'", obj9, "L2097555035");
    }

    @Test
    public void test22547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22547");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter22.getClassInfo();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isArray(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type30);
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isArray(type30);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) (short) 100, type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type42, type44 };
        org.mockito.asm.Type type46 = null;
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type39, typeArray45);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str51 = type50.getInternalName();
        java.lang.String str52 = type50.toString();
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type50);
        java.lang.String str54 = type50.getDescriptor();
        java.lang.String str55 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.Hi!");
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("", type50, typeArray58);
        org.mockito.asm.Type[] typeArray60 = signature59.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter22.begin_class(166, 150, "L1255465734", type30, typeArray60, "L256508968");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<init>" + "'", str2, "<init>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "F" + "'", str31, "F");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "L;" + "'", str52, "L;");
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "L;" + "'", str54, "L;");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(typeArray60);
    }

    @Test
    public void test22548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22548");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitAttribute(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22549");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type3 };
        org.mockito.asm.Type type5 = null;
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.asm.Type type12 = null;
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray11);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type21, type23 };
        org.mockito.asm.Type type25 = null;
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type27);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray24);
        int int30 = type19.getSort();
        int int31 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        java.lang.String str32 = type19.getInternalName();
        java.lang.String str33 = type19.getInternalName();
        java.lang.String str34 = type19.getDescriptor();
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(14, type19);
        org.mockito.asm.Type type36 = local35.getType();
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type36);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.fromInternalName("short");
        int int41 = type40.getDimensions();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(100, type40);
        boolean boolean43 = org.mockito.cglib.core.TypeUtils.isPrimitive(type40);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type40);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type46, type48 };
        org.mockito.asm.Type type50 = null;
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray49, type50);
        java.lang.String[] strArray52 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("F");
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isArray(type54);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type54);
        int int57 = type56.getSize();
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray49, type56);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray49);
        java.lang.String str60 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type40);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(L;L;)L;" + "'", str29, "(L;L;)L;");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L;" + "'", str34, "L;");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(L;L;)Lshort;" + "'", str59, "(L;L;)Lshort;");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "short" + "'", str60, "short");
    }

    @Test
    public void test22550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22550");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type4, type6, type8, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type2, typeArray15);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type21, type23, type25, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type19, typeArray32);
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type19);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type35);
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
    }

    @Test
    public void test22551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22551");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter16.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.Signature signature59 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str60 = signature59.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        boolean boolean78 = signature59.equals((java.lang.Object) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo85 = classEmitter84.getClassInfo();
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNotNull(signature59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<init>" + "'", str60, "<init>");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(classInfo85);
    }

    @Test
    public void test22552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22552");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.asm.Type type11 = null;
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type4, typeArray14);
        org.mockito.asm.MethodVisitor methodVisitor18 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter19 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor18);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter20 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter19);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter21 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter21);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter23 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter22);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter24 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        boolean boolean25 = type4.equals((java.lang.Object) localVariablesSorter24);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter26 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter24);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter27 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter26);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter28 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter26);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter29 = new org.mockito.cglib.core.LocalVariablesSorter(22, "(L;L;Ljava/lang/C;)L;", (org.mockito.asm.MethodVisitor) localVariablesSorter28);
        org.mockito.asm.Attribute attribute30 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter29.visitAttribute(attribute30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test22553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22553");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L1867112518");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test22554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22554");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L135787045", "<init>(Ljava/lang/Hi!;)V");
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type7 };
        org.mockito.asm.Type type9 = null;
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type11);
        int int14 = type11.getOpcode(108);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("F");
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("C", type11, typeArray16);
        org.mockito.asm.Type type18 = signature17.getReturnType();
        org.mockito.asm.MethodVisitor methodVisitor21 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor21);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter23 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter22);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter24 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter25 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        boolean boolean26 = type18.equals((java.lang.Object) localVariablesSorter25);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter27 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter25);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter28 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter27);
        boolean boolean29 = signature2.equals((java.lang.Object) localVariablesSorter27);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter30 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter27);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter31 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter27);
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        java.lang.String str33 = label32.toString();
        label32.info = 1L;
        label32.info = (byte) 0;
        java.lang.Object obj38 = label32.info;
        java.lang.String str39 = label32.toString();
        java.lang.Object obj40 = label32.info;
        label32.info = "L1878534181";
        int[] intArray47 = new int[] { 8, 34, 64, 104 };
        org.mockito.asm.Label label48 = new org.mockito.asm.Label();
        java.lang.String str49 = label48.toString();
        label48.info = "L;";
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        label48.info = type53;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getReturnType("[Lorg/mockito/asm/Type;");
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local(126, type58);
        org.mockito.asm.Type type60 = local59.getType();
        org.mockito.asm.Type type61 = type60.getElementType();
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.getBoxedType(type60);
        label48.info = type62;
        org.mockito.asm.Label[] labelArray64 = new org.mockito.asm.Label[] { label48 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter27.visitLookupSwitchInsn(label32, intArray47, labelArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 110 + "'", int14 == 110);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L483794146" + "'", str33, "L483794146");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 0 + "'", obj38, (byte) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "L483794146" + "'", str39, "L483794146");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[8, 34, 64, 104]");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L1242146292" + "'", str49, "L1242146292");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(labelArray64);
    }

    @Test
    public void test22555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22555");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.parseType("L1081692398");
        java.lang.Object obj3 = null;
        boolean boolean4 = type2.equals(obj3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        int int8 = type6.getOpcode(100);
        java.lang.String[] strArray10 = new java.lang.String[] { "L69280469" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type6, typeArray11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.asm.Type type19 = null;
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type22, type24 };
        org.mockito.asm.Type type26 = null;
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray25);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray25);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("L1417924353", type2, typeArray25);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "long" + "'", str13, "long");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(L;L;)J" + "'", str31, "(L;L;)J");
        org.junit.Assert.assertNotNull(type33);
    }

    @Test
    public void test22556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22556");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("L217518997");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type3);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type7 = local5.getType();
        org.mockito.asm.Type type8 = type7.getElementType();
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        java.lang.String str11 = type10.getClassName();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L217518997" + "'", str11, "L217518997");
    }

    @Test
    public void test22557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22557");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.asm.Type type8 = null;
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray7);
        int int13 = type2.getSort();
        int int14 = type2.getSort();
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        java.lang.String str16 = type2.getDescriptor();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(112, type2);
        java.lang.Class<?> wildcardClass18 = type2.getClass();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(L;L;)L;" + "'", str12, "(L;L;)L;");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L;" + "'", str16, "L;");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test22558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22558");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(LL69280469;)V", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter15 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter13.visitIntInsn(177, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22559");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("F");
        java.lang.Object obj3 = null;
        boolean boolean4 = type2.equals(obj3);
        java.lang.Class<?> wildcardClass5 = type2.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        java.lang.String str12 = type11.getInternalName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(108, type11);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/mockito/asm/Type" + "'", str9, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org/mockito/asm/Type" + "'", str12, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.mockito.asm.Type" + "'", str13, "org.mockito.asm.Type");
    }

    @Test
    public void test22560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22560");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("short");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int4 = type1.getOpcode(10);
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.asm.Type type20 = null;
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray19);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("C", type12, typeArray19);
        java.lang.String str26 = type12.toString();
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        int int31 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type29);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((int) (short) 100, type35);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type38, type40 };
        org.mockito.asm.Type type42 = null;
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("", type35, typeArray41);
        boolean boolean45 = org.mockito.cglib.core.TypeUtils.isPrimitive(type35);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type1, type10, type27, type29, type35 };
        org.mockito.cglib.core.Signature signature47 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray46);
        org.mockito.asm.Type type48 = signature47.getReturnType();
        boolean boolean49 = org.mockito.cglib.core.TypeUtils.isPrimitive(type48);
        int int51 = type48.getOpcode((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type52 = type48.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14 + "'", int4 == 14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(L;L;)L;" + "'", str24, "(L;L;)L;");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "S" + "'", str26, "S");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(signature47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 105 + "'", int51 == 105);
    }

    @Test
    public void test22561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22561");
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("L135787045", "<init>(Ljava/lang/Hi!;)V");
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.asm.Type type11 = null;
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type13);
        int int16 = type13.getOpcode(108);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.parseTypes("F");
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("C", type13, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.MethodVisitor methodVisitor23 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter24 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor23);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter25 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter24);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter26 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter25);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter27 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter25);
        boolean boolean28 = type20.equals((java.lang.Object) localVariablesSorter27);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter29 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter27);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter30 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter29);
        boolean boolean31 = signature4.equals((java.lang.Object) localVariablesSorter29);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter32 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter29);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter33 = new org.mockito.cglib.core.LocalVariablesSorter(5, "(L;L;L;L;L;L;)LShortL;", (org.mockito.asm.MethodVisitor) localVariablesSorter29);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor37 = localVariablesSorter33.visitParameterAnnotation(112, "L837549498", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 110 + "'", int16 == 110);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test22562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22562");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L1781555696");
        java.lang.Class<?> wildcardClass2 = typeArray1.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test22563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22563");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        org.mockito.asm.Type type4 = local3.getType();
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("L1878534181");
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.Class<?> wildcardClass13 = type6.getClass();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(signature11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(Ljava/lang/L1878534181;)Lorg/mockito/asm/Type;" + "'", str12, "(Ljava/lang/L1878534181;)Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test22564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22564");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.Signature signature15 = null;
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.fromInternalName("L427581499L1437398650");
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor("L94526530");
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("L1931831262", type18, typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter23 = classEmitter13.begin_method(41, signature15, typeArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@16b5d7f5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(signature20);
        org.junit.Assert.assertNotNull(typeArray21);
    }

    @Test
    public void test22565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22565");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str15 = signature14.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean33 = signature14.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter46.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.asm.Attribute attribute53 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter52.visitAttribute(attribute53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<init>" + "'", str15, "<init>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo51);
    }

    @Test
    public void test22566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22566");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = 1L;
        java.lang.Object obj4 = label0.info;
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass8 = signature7.getClass();
        label0.info = wildcardClass8;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        label10.info = "L;";
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.asm.Type type19 = null;
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type21);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type21);
        java.lang.Class<?> wildcardClass24 = type21.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        label10.info = str25;
        java.lang.String str27 = label10.toString();
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type30);
        java.lang.String str33 = type32.toString();
        int int34 = type32.getSize();
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(10, type32);
        org.mockito.asm.Type type36 = local35.getType();
        label10.info = local35;
        java.lang.Object obj38 = label10.info;
        label0.info = label10;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass41 = type40.getClass();
        java.lang.String str42 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass41);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type46, type48 };
        org.mockito.asm.Type type50 = null;
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray49, type50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type53, type55 };
        org.mockito.asm.Type type57 = null;
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type59);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray49, typeArray56);
        java.lang.String[] strArray62 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray56);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray62);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray63);
        java.lang.Class<?> wildcardClass65 = type44.getClass();
        label0.info = type44;
        java.lang.Object obj67 = label0.info;
        label0.info = "org$2Fmockito$2Fcglib$2Fcore$2FClassEmitter";
        java.lang.Object obj70 = label0.info;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L132528709" + "'", str1, "L132528709");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1L + "'", obj4, 1L);
        org.junit.Assert.assertNotNull(wildcardClass8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1845593450" + "'", str11, "L1845593450");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str25, "Lorg/mockito/asm/Type;");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L1845593450" + "'", str27, "L1845593450");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L;" + "'", str33, "L;");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org/mockito/asm/Type" + "'", str42, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org/mockito/asm/Type" + "'", str43, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(L;L;)Lorg/mockito/asm/Type;" + "'", str64, "(L;L;)Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + "org$2Fmockito$2Fcglib$2Fcore$2FClassEmitter" + "'", obj70, "org$2Fmockito$2Fcglib$2Fcore$2FClassEmitter");
    }

    @Test
    public void test22567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22567");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(11, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)F", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIincInsn(180, 163);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22568");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(5, "(L;L;)Lorg/mockito/asm/Type;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "(Ljava/lang/L614449524;)LC;", (org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter13.visitVarInsn(155, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22569");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.Signature signature34 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str35 = signature34.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        boolean boolean53 = signature34.equals((java.lang.Object) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassInfo classInfo57 = classEmitter55.getClassInfo();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassInfo classInfo71 = classEmitter66.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter75 = classEmitter74.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1be49995");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<init>" + "'", str2, "<init>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNotNull(signature34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<init>" + "'", str35, "<init>");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo67);
        org.junit.Assert.assertNull(classInfo71);
    }

    @Test
    public void test22570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22570");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type3 };
        org.mockito.asm.Type type5 = null;
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.cglib.core.Signature signature8 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 100, type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.asm.Type type19 = null;
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type12, typeArray18);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("L1818164453");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray18);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        org.mockito.cglib.core.Signature signature33 = org.mockito.cglib.core.TypeUtils.parseConstructor("LC$3B");
        org.mockito.asm.Type type34 = signature33.getReturnType();
        boolean boolean35 = signature31.equals((java.lang.Object) signature33);
        java.lang.String str36 = signature31.getName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(signature8);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(signature31);
        org.junit.Assert.assertNotNull(signature33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<init>" + "'", str36, "<init>");
    }

    @Test
    public void test22571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22571");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("(Ljava/lang/C;)L;");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        int int5 = type2.getOpcode(138);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("<init>");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type14, type16, type18, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type12, typeArray25);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type31, type33, type35, type37, type39, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("", type29, typeArray42);
        boolean boolean44 = org.mockito.cglib.core.TypeUtils.isPrimitive(type29);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type29);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type45);
        java.lang.String[] strArray47 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray47);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str53 = org.mockito.cglib.core.TypeUtils.getClassName(type52);
        boolean boolean55 = type52.equals((java.lang.Object) "hi!");
        int int56 = type52.getSize();
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type58, type60 };
        org.mockito.asm.Type type62 = null;
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type62);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type64);
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", type52, typeArray61);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray49, type52);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray49);
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("L703315117", type2, typeArray49);
        org.mockito.asm.Type type70 = signature69.getReturnType();
        java.lang.String str71 = signature69.getDescriptor();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 142 + "'", int5 == 142);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<init>" + "'", str8, "<init>");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "(L;L;L;L;L;L;)L<init>;" + "'", str68, "(L;L;L;L;L;L;)L<init>;");
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(L;L;L;L;L;L;)LLjava/lang/C;" + "'", str71, "(L;L;L;L;L;L;)LLjava/lang/C;");
    }

    @Test
    public void test22572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22572");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = "L;";
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        label0.info = type5;
        java.lang.Object obj8 = label0.info;
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("L1410472451");
        label0.info = type10;
        java.lang.String str12 = type10.toString();
        java.lang.Class<?> wildcardClass13 = type10.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L482214014" + "'", str1, "L482214014");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "L;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "L;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "L;");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LL1410472451;" + "'", str12, "LL1410472451;");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/Type" + "'", str14, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/Type" + "'", str15, "org/mockito/asm/Type");
    }

    @Test
    public void test22573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22573");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = 1L;
        label0.info = (byte) 0;
        java.lang.Object obj6 = label0.info;
        java.lang.Object obj7 = label0.info;
        org.mockito.asm.MethodVisitor methodVisitor12 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor12);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter13);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter15 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter14);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter16 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter14);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter17 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(LL69280469;)V", (org.mockito.asm.MethodVisitor) localVariablesSorter16);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter18 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter17);
        label0.info = localVariablesSorter18;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter20 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter18);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter21 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter21);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter22.visitFieldInsn(146, "$28Lorg$2Fmockito$2Fcglib$2Fcore$2FSignature$3BLorg$2Fmockito$2Fasm$2FType$3B$29LL217518997$3B", "L56962576", "L880558724");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1120225852" + "'", str1, "L1120225852");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
    }

    @Test
    public void test22574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22574");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = "L;";
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        label0.info = type5;
        java.lang.Object obj8 = label0.info;
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("L1410472451");
        label0.info = type10;
        java.lang.String str12 = label0.toString();
        java.lang.Object obj13 = label0.info;
        org.mockito.asm.MethodVisitor methodVisitor18 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter19 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor18);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter20 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter19);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter21 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter23 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(LL69280469;)V", (org.mockito.asm.MethodVisitor) localVariablesSorter22);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter24 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        label0.info = localVariablesSorter23;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter26 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter27 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter23);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter28 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter27);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter29 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter27);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter30 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter27);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter30.visitTypeInsn(35, "L1036083123");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1817015146" + "'", str1, "L1817015146");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "L;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "L;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "L;");
        org.junit.Assert.assertNotNull(type10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1817015146" + "'", str12, "L1817015146");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "LL1410472451;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "LL1410472451;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "LL1410472451;");
    }

    @Test
    public void test22575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22575");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("short");
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type8 };
        org.mockito.asm.Type type10 = null;
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "L69280469" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) (short) 100, type19);
        org.mockito.asm.Type type21 = local20.getType();
        boolean boolean22 = signature16.equals((java.lang.Object) local20);
        org.mockito.asm.Type type23 = local20.getType();
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.getClassName(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type32 };
        org.mockito.asm.Type type34 = null;
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type34);
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type27, typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray37);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("L1481268286", type2, typeArray39);
        java.lang.String str41 = signature40.getName();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lshort;" + "'", str3, "Lshort;");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(signature16);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "L1481268286" + "'", str41, "L1481268286");
    }

    @Test
    public void test22576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22576");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("java$2Flang$2FHi!");
        int int2 = type1.getDimensions();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test22577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22577");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = "L;";
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        label0.info = type5;
        java.lang.Object obj8 = label0.info;
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str11 = type10.getClassName();
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isPrimitive(type10);
        label0.info = type10;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("L614449524");
        label0.info = type15;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1447684749" + "'", str1, "L1447684749");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "L;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "L;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "L;");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type15);
    }

    @Test
    public void test22578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22578");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("[Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        org.mockito.asm.Type type4 = type2.getElementType();
        int int5 = type2.getSize();
        java.lang.String str6 = type2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lorg/mockito/asm/Type; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test22579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22579");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("L217518997");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.asm.Type type12 = null;
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray11);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("C", type4, typeArray11);
        java.lang.String str18 = type4.toString();
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type21, type23 };
        org.mockito.asm.Type type25 = null;
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type28, type30 };
        org.mockito.asm.Type type32 = null;
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray31);
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray31);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("L1113412744", type2, typeArray31);
        java.lang.String str40 = signature39.toString();
        org.mockito.asm.Type[] typeArray41 = signature39.getArgumentTypes();
        java.lang.String str42 = signature39.toString();
        java.lang.String str43 = signature39.toString();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(L;L;)L;" + "'", str16, "(L;L;)L;");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "S" + "'", str18, "S");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(L;L;)S" + "'", str38, "(L;L;)S");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "L1113412744(L;L;)LL217518997;" + "'", str40, "L1113412744(L;L;)LL217518997;");
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L1113412744(L;L;)LL217518997;" + "'", str42, "L1113412744(L;L;)LL217518997;");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L1113412744(L;L;)LL217518997;" + "'", str43, "L1113412744(L;L;)LL217518997;");
    }

    @Test
    public void test22580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22580");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        java.lang.String str5 = type4.toString();
        int int6 = type4.getSize();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(10, type4);
        org.mockito.asm.Type type8 = local7.getType();
        int int9 = local7.getIndex();
        org.mockito.asm.Type type10 = local7.getType();
        org.mockito.asm.Type type11 = local7.getType();
        int int12 = local7.getIndex();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L;" + "'", str5, "L;");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test22581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22581");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("short");
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type2);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type8, type10, type12, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type6, typeArray19);
        boolean boolean22 = signature20.equals((java.lang.Object) (byte) 0);
        boolean boolean24 = signature20.equals((java.lang.Object) 100);
        java.lang.String str25 = signature20.getDescriptor();
        java.lang.String str26 = signature20.getDescriptor();
        boolean boolean28 = signature20.equals((java.lang.Object) 10);
        org.mockito.asm.Type type29 = signature20.getReturnType();
        org.mockito.asm.Type[] typeArray30 = signature20.getArgumentTypes();
        org.mockito.asm.Type[] typeArray31 = signature20.getArgumentTypes();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("LC;", type2, typeArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.parseTypes("L855749987");
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray34);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type41, type43, type45, type47, type49, type51 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("", type39, typeArray52);
        java.lang.String str54 = type39.toString();
        java.lang.String str55 = type39.getClassName();
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type39);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "short" + "'", str3, "short");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(L;L;L;L;L;L;)L;" + "'", str25, "(L;L;L;L;L;L;)L;");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(L;L;L;L;L;L;)L;" + "'", str26, "(L;L;L;L;L;L;)L;");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(signature35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "L;" + "'", str54, "L;");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(typeArray56);
    }

    @Test
    public void test22582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22582");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1960523387");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test22583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22583");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.asm.Type type7 = null;
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.asm.Type type14 = null;
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray13);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        label0.info = typeArray13;
        java.lang.String str21 = label0.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("L1127284051");
        label0.info = "L1127284051";
        java.lang.Object obj25 = null;
        label0.info = obj25;
        java.lang.Object obj27 = label0.info;
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type32, type34, type36, type38, type40, type42 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("", type30, typeArray43);
        boolean boolean45 = org.mockito.cglib.core.TypeUtils.isPrimitive(type30);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type30);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType("F");
        java.lang.Object obj49 = null;
        boolean boolean50 = type48.equals(obj49);
        java.lang.Class<?> wildcardClass51 = type48.getClass();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        boolean boolean53 = type46.equals((java.lang.Object) wildcardClass51);
        java.lang.String str54 = type46.getInternalName();
        label0.info = str54;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L82436383" + "'", str1, "L82436383");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L82436383" + "'", str21, "L82436383");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test22584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22584");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("L556047129");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test22585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22585");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L899601354");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray3);
    }

    @Test
    public void test22586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22586");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("L874553920");
        int int3 = type1.getOpcode((int) '4');
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 56 + "'", int3 == 56);
    }

    @Test
    public void test22587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22587");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str3, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test22588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22588");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 41);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test22589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22589");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter15.getClassInfo();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("[Lorg/mockito/asm/Type;");
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(126, type29);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type type32 = local30.getType();
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.parseTypes("C");
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type37, type39 };
        org.mockito.asm.Type type41 = null;
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("java.lang.Hi!", type32, typeArray35);
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        org.mockito.cglib.core.Signature signature48 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray47);
        org.mockito.asm.Label label49 = new org.mockito.asm.Label();
        java.lang.String str50 = label49.toString();
        label49.info = 1L;
        java.lang.Object obj53 = label49.info;
        org.mockito.asm.Label label54 = new org.mockito.asm.Label();
        java.lang.String str55 = label54.toString();
        label54.info = 1L;
        java.lang.Object obj58 = label54.info;
        java.lang.Object obj59 = label54.info;
        label49.info = obj59;
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str63 = type62.getClassName();
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.getBoxedType(type62);
        java.lang.String str65 = type64.toString();
        java.lang.String str66 = type64.getInternalName();
        label49.info = type64;
        java.lang.String str68 = type64.getInternalName();
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray47, type64);
        java.lang.String[] strArray70 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray69);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter15.visit(150, 97, "$2428L$243BL$243BL$243BL$243BL$243BL$243B$2429I", "L957871312", "java.lang.D", strArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(signature48);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "L347922413" + "'", str50, "L347922413");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 1L + "'", obj53, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "L1541098613" + "'", str55, "L1541098613");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 1L + "'", obj58, 1L);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 1L + "'", obj59, 1L);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "L;" + "'", str65, "L;");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(strArray70);
    }

    @Test
    public void test22590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22590");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("L1526788919");
        int int2 = type1.getSize();
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str5 = type1.getInternalName();
        org.mockito.asm.Type type6 = type1.getElementType();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1526788919" + "'", str5, "L1526788919");
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test22591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22591");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int5 = type1.getOpcode(5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("[Lorg/mockito/asm/Type;");
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(126, type8);
        org.mockito.asm.Type type10 = local9.getType();
        int int11 = type10.getDimensions();
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = type1.equals((java.lang.Object) type10);
        java.lang.String str14 = type10.getClassName();
        org.mockito.asm.MethodVisitor methodVisitor19 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter20 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor19);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter21 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 1, "(L;L;)S", (org.mockito.asm.MethodVisitor) localVariablesSorter21);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter23 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter21);
        boolean boolean24 = type10.equals((java.lang.Object) localVariablesSorter21);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter25 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter21);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter21.visitInsn(171);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str12, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.mockito.asm.Type[]" + "'", str14, "org.mockito.asm.Type[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}
