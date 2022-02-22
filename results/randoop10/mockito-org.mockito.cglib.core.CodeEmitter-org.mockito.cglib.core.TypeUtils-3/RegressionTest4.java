import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitTypeInsn((-1), "byte");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L;(Ljava/lang/L;LV;)L;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L$3B$28Ljava$2Flang$2FL$3BLV$3B$29L$3B" + "'", str1, "L$3B$28Ljava$2Flang$2FL$3BLV$3B$29L$3B");
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter2.visitField(108, "L2021451540", "<init>", "", (java.lang.Object) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.Object obj10 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(3, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L833378983" + "'", str9, "L833378983");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(157);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.String str12 = label9.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.String str15 = label13.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        label13.info = type16;
        label9.info = type16;
        java.lang.Object obj21 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLineNumber(96, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1338685631" + "'", str12, "L1338685631");
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L414998193" + "'", str15, "L414998193");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "short" + "'", str17, "short");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "S");
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("short", type13, typeArray15);
        int int17 = type13.getSort();
        java.lang.String str18 = type13.toString();
        int int20 = type13.getOpcode(8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor21 = classEmitter2.visitField(106, "Ljava/lang/Short;", "()B", "L746726514", (java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L;" + "'", str18, "L;");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = methodAdapter9.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitIincInsn(13, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(102);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type26);
        boolean boolean28 = type22.equals((java.lang.Object) type27);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.cglib.core.Signature signature33 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
        java.lang.Class[] classArray34 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray31);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class(102, 0, "L851034773", type27, typeArray31, "L897927500");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(signature33);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitMaxs(35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = localVariablesSorter10.visitAnnotation("L1340227649", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Ljava/lang/Void;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ljava/lang/Void;" + "'", str1, "Ljava/lang/Void;");
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter17.visitInnerClass("org/mockito/cglib/core/Signature", "org.mockito.cglib.core.Signature", "L677830104", 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(132);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter7.visitParameterAnnotation((int) (short) 10, "L1384125117", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIntInsn(130, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isPrimitive(type13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        java.lang.String str21 = type17.getClassName();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(0, type17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getComponentType(type17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type V is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "V" + "'", str18, "V");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "void" + "'", str21, "void");
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitMaxs(0, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str12 = signature11.getDescriptor();
        java.lang.String str13 = signature11.toString();
        java.lang.String str14 = signature11.toString();
        org.mockito.asm.Type[] typeArray16 = org.mockito.asm.Type.getArgumentTypes("(L;)Z");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter17 = classEmitter2.begin_method((int) ' ', signature11, typeArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@39f136b4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(typeArray16);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.String str12 = label9.toString();
        label9.info = ' ';
        java.lang.String str15 = label9.toString();
        java.lang.Object obj16 = label9.info;
        java.lang.Object obj17 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLabel(label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L548447417" + "'", str12, "L548447417");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L548447417" + "'", str15, "L548447417");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + ' ' + "'", obj16, ' ');
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + ' ' + "'", obj17, ' ');
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str9 = type8.toString();
        java.lang.String str10 = type8.toString();
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("L;", type8, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        java.lang.String str19 = type18.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor20 = classEmitter1.visitField((int) (short) 0, "L1589298560", "Hi!", "()B", (java.lang.Object) type18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L;" + "'", str9, "L;");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L;" + "'", str10, "L;");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray9);
        java.lang.String str11 = type6.getClassName();
        int int12 = type6.getSort();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "short" + "'", str7, "short");
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(V)S" + "'", str10, "(V)S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "short" + "'", str11, "short");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = null;
        label7.info = obj8;
        java.lang.Object obj10 = label7.info;
        java.lang.Object obj11 = label7.info;
        java.lang.String str12 = label7.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn(13, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1031914338" + "'", str12, "L1031914338");
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean6 = type3.equals((java.lang.Object) type5);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("L63122622", type1, typeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LL;;" + "'", str4, "LL;;");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(signature9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "()B" + "'", str13, "()B");
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(126);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.parseType("int");
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("short", type5, typeArray7);
        int int9 = type5.getSort();
        java.lang.String str10 = type5.toString();
        java.lang.String str11 = type5.toString();
        boolean boolean13 = type5.equals((java.lang.Object) (short) 100);
        int int14 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type5);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type17);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean23 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type22);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type18, typeArray21);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("()LShort;", type2, typeArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()LShort;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L;" + "'", str10, "L;");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L;" + "'", str11, "L;");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(L;)L;" + "'", str29, "(L;)L;");
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitFieldInsn((int) (byte) 0, "L306758391", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("Double");
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("Short");
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("LL;;", type1, typeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Ljava/lang/Short;)D" + "'", str6, "(Ljava/lang/Short;)D");
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        int int18 = type16.getOpcode((int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type16, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        int int28 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor30 = classAdapter9.visitField(112, "<init>(S)V", "(Ljava/lang/L;)L;", "()LShort;", (java.lang.Object) signature29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(signature29);
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("Int");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLdcInsn((java.lang.Object) typeArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray13);
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitInnerClass("L1092810277()LShort;", "L915517561", "L746726514", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L201537933" + "'", str1, "L201537933");
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Label label12 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitLabel(label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter6.visitAnnotation("L1589298560", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        int[] intArray10 = null;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.String str13 = label11.toString();
        java.lang.String str14 = label11.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.Object obj17 = label15.info;
        java.lang.String str18 = label15.toString();
        java.lang.String str19 = label15.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.Object obj22 = label20.info;
        java.lang.String str23 = label20.toString();
        label20.info = ' ';
        java.lang.String str26 = label20.toString();
        org.mockito.asm.Label[] labelArray27 = new org.mockito.asm.Label[] { label11, label15, label20 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLookupSwitchInsn(label9, intArray10, labelArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L97180731" + "'", str13, "L97180731");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L97180731" + "'", str14, "L97180731");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L815164923" + "'", str18, "L815164923");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L815164923" + "'", str19, "L815164923");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1093003613" + "'", str23, "L1093003613");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1093003613" + "'", str26, "L1093003613");
        org.junit.Assert.assertNotNull(labelArray27);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) typeArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(signature9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1774861680");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.Object obj4 = label3.info;
        java.lang.Object obj5 = label3.info;
        java.lang.String str6 = label3.toString();
        java.lang.String str7 = label3.toString();
        java.lang.String str8 = label3.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitJumpInsn(157, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L760555735" + "'", str6, "L760555735");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L760555735" + "'", str7, "L760555735");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L760555735" + "'", str8, "L760555735");
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("D");
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.Object obj17 = label15.info;
        java.lang.Object obj18 = label15.info;
        java.lang.Object obj19 = label15.info;
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        label15.info = typeArray25;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class((int) (byte) 10, 35, "(L;D)Lt;", type14, typeArray25, "L2061722705");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        java.lang.Object obj4 = null;
        label0.info = obj4;
        java.lang.String str6 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L562176061" + "'", str6, "L562176061");
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        org.mockito.asm.Type type1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type5);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.getPackageName(type10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("(L;)D", type1, typeArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "()D" + "'", str19, "()D");
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visit((int) ' ', 129, "java.lang.Void", "(V)S", "L$3B", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("L1340227649");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1340227649" + "'", str1, "L1340227649");
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.visitSource("Double", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        java.lang.String str11 = signature10.toString();
        org.mockito.asm.Type[] typeArray12 = signature10.getArgumentTypes();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("(L;)Z");
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type14);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("short", type20, typeArray22);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray27 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("short", type26, typeArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        boolean boolean33 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isArray(type31);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        boolean boolean38 = type31.equals((java.lang.Object) strArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitFrame(13, 128, (java.lang.Object[]) typeArray16, 158, (java.lang.Object[]) typeArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<init>()V" + "'", str11, "<init>()V");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(L;)Z" + "'", str15, "(L;)Z");
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "V" + "'", str32, "V");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "void" + "'", str35, "void");
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1325724854", "org.mockito.cglib.core.Signature");
        java.lang.String str3 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1325724854org.mockito.cglib.core.Signature" + "'", str3, "L1325724854org.mockito.cglib.core.Signature");
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter12.visitField(56, "Double", "L1034014722", "L141422918", (java.lang.Object) typeArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        java.lang.String str11 = signature10.getDescriptor();
        org.mockito.asm.Type[] typeArray12 = signature10.getArgumentTypes();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("short", type15, typeArray17);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("short", type21, typeArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray17);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) typeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "()V" + "'", str11, "()V");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitSource("L1457561325", "java.lang.L179248870");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter25);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter28);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor34 = classEmitter30.visitAnnotation("hi!()Ljava/lang/Short;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter16.visitAttribute(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L1813600832");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1813600832" + "'", str1, "L1813600832");
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
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
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type11);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Short" + "'", str13, "java.lang.Short");
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter2.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter1.visitMethod(13, "L2078249401", "I", "LZ;", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7c577776");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitIincInsn((int) (byte) -1, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("short", type12, typeArray14);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("short", type18, typeArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isPrimitive(type23);
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isArray(type23);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        boolean boolean30 = type23.equals((java.lang.Object) strArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor35 = classEmitter2.visitMethod(0, "L1956791564", "L915517561", "L1403562481", strArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1bacbde7");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "V" + "'", str24, "V");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "void" + "'", str27, "void");
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = classEmitter2.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(157);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(60);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter11 = classEmitter5.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@90200c4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.Object obj12 = label9.info;
        java.lang.Object obj13 = label9.info;
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        label9.info = typeArray19;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLabel(label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter18.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.String str10 = label8.toString();
        java.lang.String str11 = label8.toString();
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
        label8.info = signature28;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitLdcInsn((java.lang.Object) label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L209771767" + "'", str10, "L209771767");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L209771767" + "'", str11, "L209771767");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(signature28);
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type19);
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor22 = classEmitter2.visitMethod(13, "L1587696640", "L1565509129", "L2064135164", strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@69231017");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        int int16 = type14.getOpcode((int) ' ');
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("int", type14, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getType("V");
        boolean boolean23 = signature20.equals((java.lang.Object) "V");
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.cglib.core.Signature signature26 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.Class[] classArray27 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        boolean boolean32 = signature20.equals((java.lang.Object) strArray30);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor33 = classEmitter2.visitMethod(132, "L1461338839", "L2029575687", "L1384125117", strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@76626974");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(signature26);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1813600832");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter13);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter11.visitInnerClass("java/lang/Short", "(Ljava/lang/L;)V", "java.lang.Void", 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo20);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.String str16 = label15.toString();
        java.lang.Object obj17 = label15.info;
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("short", type20, typeArray22);
        int int24 = type20.getSort();
        java.lang.String str25 = type20.toString();
        label15.info = type20;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.Object obj28 = label27.info;
        java.lang.Object obj29 = label27.info;
        java.lang.String str30 = label27.toString();
        java.lang.Object obj31 = label27.info;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isPrimitive(type35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type35);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type39);
        org.mockito.asm.Type type41 = type39.getElementType();
        label27.info = type41;
        java.lang.String str43 = label27.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLocalVariable("L1799275916", "L130113989", "Java$2Elang", label15, label27, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L774984398" + "'", str16, "L774984398");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L;" + "'", str25, "L;");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1571974247" + "'", str30, "L1571974247");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(type41);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L1571974247" + "'", str43, "L1571974247");
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFieldInsn(128, "L$3B$28Ljava$2Flang$2FL$3BLV$3B$29L$3B", "L1786680090", "L869032533");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        label7.info = ' ';
        java.lang.String str13 = label7.toString();
        java.lang.Object obj14 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn(5, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L981223767" + "'", str10, "L981223767");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L981223767" + "'", str13, "L981223767");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitInsn(12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitVarInsn(16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor23 = classEmitter17.visitField(10, "(Ljava/lang/Short;)D", "$28$29B", "java$2Elang", (java.lang.Object) "()D");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter11.visitOuterClass("", "L774406697", "L$3B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        boolean boolean23 = org.mockito.cglib.core.TypeUtils.isArray(type20);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        boolean boolean27 = type20.equals((java.lang.Object) strArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor29 = classEmitter5.visitMethod(0, "L$3B$28Ljava$2Flang$2FL$3BLV$3B$29L$3B", "L1438273522", "L1956791564", strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@39bd3feb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "V" + "'", str21, "V");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "void" + "'", str24, "void");
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(typeArray28);
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Object obj7 = label5.info;
        java.lang.String str8 = label5.toString();
        label5.info = ' ';
        java.lang.String str11 = label5.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        java.lang.String str15 = label12.toString();
        java.lang.String str16 = label12.toString();
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.String str18 = label17.toString();
        java.lang.Object obj19 = label17.info;
        java.lang.String str20 = label17.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label5, label12, label17, "L1328785442");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1195683057" + "'", str8, "L1195683057");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1195683057" + "'", str11, "L1195683057");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L869456491" + "'", str15, "L869456491");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L869456491" + "'", str16, "L869456491");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L726567046" + "'", str18, "L726567046");
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L726567046" + "'", str20, "L726567046");
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        label7.info = type10;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitLineNumber(1, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1702665939" + "'", str9, "L1702665939");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "short" + "'", str11, "short");
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitIntInsn(157, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor23 = classEmitter17.visitField(11, "L1011045012", "L1852500780", "L1331900336", (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("L205843408");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor16 = classEmitter2.visitAnnotation("<init>(S)V", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = localVariablesSorter6.visitParameterAnnotation(3, "(L;)L;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("L1384125117");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTypeInsn(60, "Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn((int) (byte) 0, "L245395834", "", "L1589298560");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = methodAdapter5.visitParameterAnnotation(1, "LV;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter17.visitAttribute(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        java.lang.Object obj15 = label12.info;
        java.lang.Object obj16 = label12.info;
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        label12.info = typeArray22;
        label12.info = "S";
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLineNumber(12, label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter2.visitMethod(0, "L1913235182", "D", "L1438273522", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7ed55183");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(typeArray9);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs((int) (byte) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitInsn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(16, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((-1.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTypeInsn((int) '#', "L<init>()V;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter17);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter17.visitOuterClass("L1384125117", "L315113280", "L1384125117");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(100, type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        boolean boolean11 = type0.equals((java.lang.Object) signature10);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isPrimitive(type0);
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "int" + "'", str1, "int");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "double" + "'", str8, "double");
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        boolean boolean16 = type10.equals((java.lang.Object) type15);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("Double");
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("Short");
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        int int31 = type29.getOpcode((int) ' ');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("int", type29, typeArray34);
        org.mockito.asm.Type[] typeArray36 = signature35.getArgumentTypes();
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray26);
        org.mockito.cglib.core.Signature signature39 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        boolean boolean42 = org.mockito.cglib.core.TypeUtils.isPrimitive(type40);
        boolean boolean43 = org.mockito.cglib.core.TypeUtils.isArray(type40);
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type40);
        int int46 = type40.getOpcode(1);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray38, type40);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray47);
        org.mockito.cglib.core.Signature signature49 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray47);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.declare_field(154, "(L;Lint;L;D)D", type17, (java.lang.Object) signature49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(Ljava/lang/Short;)D" + "'", str22, "(Ljava/lang/Short;)D");
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(signature39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "V" + "'", str41, "V");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "void" + "'", str44, "void");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6 + "'", int46 == 6);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(signature49);
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type18 = classEmitter1.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFieldInsn((int) (short) 10, "void", "org/mockito/cglib/core/Signature", "org.mockito.cglib.core");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter11.visitIincInsn(124, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L380461644");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitJumpInsn(156, label11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn(9, "void", "java.lang.Void", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitMethodInsn(157, "B", "L1565509129", "java.lang.Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 154);
        int int9 = type6.getSize();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor21 = classAdapter1.visitField(116, "L1619152913", "org.mockito.cglib.core.Signature", "L680990058", (java.lang.Object) typeArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(L;)Z" + "'", str13, "(L;)Z");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(signature16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor22 = classEmitter2.visitField(12, "L897927500", "org.mockito.cglib.core", "L2061722705", obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter2.visitField(32, "double", "", "", (java.lang.Object) "(L;Lint;)V");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIincInsn(100, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter16.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitVarInsn(4, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(116, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitInsn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Z is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs((-1), 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("L1565509129", "L1010211844", "L851034773");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = methodAdapter8.visitParameterAnnotation(129, "L1774861680", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Object obj7 = label5.info;
        java.lang.String str8 = label5.toString();
        java.lang.Object obj9 = label5.info;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isPrimitive(type13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type17);
        org.mockito.asm.Type type19 = type17.getElementType();
        label5.info = type19;
        java.lang.String str21 = label5.toString();
        int[] intArray28 = new int[] { 102, 3, (-1), 7, 'a', 106 };
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.String str30 = label29.toString();
        java.lang.Object obj31 = label29.info;
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray35 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.getTypes(classArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("short", type34, typeArray36);
        int int38 = type34.getSort();
        java.lang.String str39 = type34.toString();
        label29.info = type34;
        org.mockito.asm.Label label41 = new org.mockito.asm.Label();
        java.lang.Object obj42 = label41.info;
        java.lang.String str43 = label41.toString();
        java.lang.String str44 = label41.toString();
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        int int53 = type51.getOpcode((int) ' ');
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("int", type51, typeArray56);
        org.mockito.asm.Type[] typeArray58 = signature57.getArgumentTypes();
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray48, typeArray58);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray47, typeArray48);
        org.mockito.cglib.core.Signature signature61 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray60);
        label41.info = signature61;
        org.mockito.asm.Label label63 = new org.mockito.asm.Label();
        java.lang.Object obj64 = label63.info;
        java.lang.String str65 = label63.toString();
        java.lang.String str66 = label63.toString();
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray68 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray67);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray68);
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray71 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray70);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.INT_TYPE;
        int int75 = type73.getOpcode((int) ' ');
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray77);
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("int", type73, typeArray78);
        org.mockito.asm.Type[] typeArray80 = signature79.getArgumentTypes();
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray70, typeArray80);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.add(typeArray69, typeArray70);
        org.mockito.cglib.core.Signature signature83 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray82);
        label63.info = signature83;
        org.mockito.asm.Label label85 = new org.mockito.asm.Label();
        java.lang.Object obj86 = label85.info;
        java.lang.Object obj87 = label85.info;
        java.lang.String str88 = label85.toString();
        label85.info = ' ';
        java.lang.Object obj91 = label85.info;
        org.mockito.asm.Label label92 = new org.mockito.asm.Label();
        java.lang.Object obj93 = null;
        label92.info = obj93;
        java.lang.Object obj95 = label92.info;
        java.lang.Object obj96 = label92.info;
        org.mockito.asm.Label[] labelArray97 = new org.mockito.asm.Label[] { label29, label41, label63, label85, label92 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLookupSwitchInsn(label5, intArray28, labelArray97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L160160649" + "'", str8, "L160160649");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type19);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L160160649" + "'", str21, "L160160649");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[102, 3, -1, 7, 97, 106]");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1641937164" + "'", str30, "L1641937164");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "L;" + "'", str39, "L;");
        org.junit.Assert.assertNull(obj42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L919773968" + "'", str43, "L919773968");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "L919773968" + "'", str44, "L919773968");
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(signature61);
        org.junit.Assert.assertNull(obj64);
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "L1593116821" + "'", str65, "L1593116821");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "L1593116821" + "'", str66, "L1593116821");
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 32 + "'", int75 == 32);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(signature83);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj87);
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "L158717777" + "'", str88, "L158717777");
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + ' ' + "'", obj91, ' ');
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertNotNull(labelArray97);
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter8.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = methodAdapter8.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = methodAdapter6.visitAnnotation("L1092810277", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classAdapter2.visitMethod((int) '#', "<init>(D)V", "", "L179248870", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '<init>(D)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(typeArray9);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        int int18 = type16.getOpcode((int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type16, typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor24 = classEmitter1.visitMethod(126, "LV;", "L1956791564", "L1231475351", strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@29a1e074");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("L63122622", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter24);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor29 = classEmitter7.visitField((int) (short) 0, "L1328785442", "(L;)Z", "L245395834", (java.lang.Object) classEmitter28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L1325724854org.mockito.cglib.core.Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 43");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.String str11 = label8.toString();
        java.lang.Object obj12 = label8.info;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type20);
        org.mockito.asm.Type type22 = type20.getElementType();
        label8.info = type22;
        java.lang.String str24 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitJumpInsn((int) (short) 10, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L387813627" + "'", str11, "L387813627");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type22);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L387813627" + "'", str24, "L387813627");
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = methodAdapter6.visitAnnotation("IL1202418377", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("(Ljava/lang/L;)V");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(Ljava/lang/L;)V" + "'", str1, "(Ljava/lang/L;)V");
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        classEmitter5.setTarget(classVisitor21);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getReturnType("I");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor29 = classEmitter5.visitField(153, "L1111712985", "L63122622", "(V)S", (java.lang.Object) "I");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNotNull(type28);
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L1438273522");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.String str10 = label9.toString();
        java.lang.Object obj11 = label9.info;
        java.lang.Object obj12 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitJumpInsn(102, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L281763694" + "'", str10, "L281763694");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitMaxs(106, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter9.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter9.visitIntInsn(5, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTypeInsn(0, "(L;)S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(129);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        int[] intArray14 = new int[] { 14, 14, (byte) 0, (byte) 1 };
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getPackageName(type17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray24);
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.Object obj28 = label27.info;
        java.lang.String str29 = label27.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type30);
        label27.info = type30;
        boolean boolean34 = signature25.equals((java.lang.Object) label27);
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        java.lang.Object obj36 = label35.info;
        java.lang.Object obj37 = label35.info;
        java.lang.String str38 = label35.toString();
        java.lang.Object obj39 = label35.info;
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean44 = org.mockito.cglib.core.TypeUtils.isPrimitive(type43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray42, type43);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray42, type47);
        org.mockito.asm.Type type49 = type47.getElementType();
        label35.info = type49;
        java.lang.String str51 = label35.toString();
        org.mockito.asm.Label label52 = new org.mockito.asm.Label();
        java.lang.Object obj53 = label52.info;
        java.lang.Object obj54 = label52.info;
        java.lang.String str55 = label52.toString();
        org.mockito.asm.Label label56 = new org.mockito.asm.Label();
        java.lang.Object obj57 = label56.info;
        java.lang.String str58 = label56.toString();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str60 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type59);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type59);
        label56.info = type59;
        label52.info = type59;
        org.mockito.asm.Label label64 = new org.mockito.asm.Label();
        java.lang.Object obj65 = label64.info;
        java.lang.Object obj66 = label64.info;
        java.lang.String str67 = label64.toString();
        java.lang.Object obj68 = label64.info;
        org.mockito.asm.Label[] labelArray69 = new org.mockito.asm.Label[] { label27, label35, label52, label64 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label6, intArray14, labelArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L225307399" + "'", str7, "L225307399");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[14, 14, 0, 1]");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang" + "'", str18, "java.lang");
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(signature21);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNull(obj28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1263281444" + "'", str29, "L1263281444");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "short" + "'", str31, "short");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L114922157" + "'", str38, "L114922157");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(type49);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "L114922157" + "'", str51, "L114922157");
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "L1716193553" + "'", str55, "L1716193553");
        org.junit.Assert.assertNull(obj57);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "L77390604" + "'", str58, "L77390604");
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "short" + "'", str60, "short");
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj66);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "L785617854" + "'", str67, "L785617854");
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(labelArray69);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.String str14 = label12.toString();
        java.lang.String str15 = label12.toString();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        int int24 = type22.getOpcode((int) ' ');
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("int", type22, typeArray27);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray19);
        org.mockito.cglib.core.Signature signature32 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
        label12.info = signature32;
        int[] intArray36 = new int[] { 100, 60 };
        org.mockito.asm.Label label37 = new org.mockito.asm.Label();
        java.lang.Object obj38 = label37.info;
        java.lang.Object obj39 = label37.info;
        java.lang.String str40 = label37.toString();
        label37.info = ' ';
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        java.lang.String str45 = type43.getClassName();
        label37.info = type43;
        java.lang.String str47 = label37.toString();
        org.mockito.asm.Label label48 = new org.mockito.asm.Label();
        org.mockito.asm.Label label49 = new org.mockito.asm.Label();
        java.lang.Object obj50 = label49.info;
        java.lang.Object obj51 = label49.info;
        java.lang.String str52 = label49.toString();
        org.mockito.asm.Label label53 = new org.mockito.asm.Label();
        java.lang.Object obj54 = label53.info;
        java.lang.String str55 = label53.toString();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type56);
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type56);
        label53.info = type56;
        label49.info = type56;
        org.mockito.asm.Label[] labelArray61 = new org.mockito.asm.Label[] { label37, label48, label49 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLookupSwitchInsn(label12, intArray36, labelArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L2088859143" + "'", str14, "L2088859143");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L2088859143" + "'", str15, "L2088859143");
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(signature32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 60]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "L847129183" + "'", str40, "L847129183");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "int" + "'", str44, "int");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "int" + "'", str45, "int");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "L847129183" + "'", str47, "L847129183");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "L112471585" + "'", str52, "L112471585");
        org.junit.Assert.assertNull(obj54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "L2000634636" + "'", str55, "L2000634636");
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "short" + "'", str57, "short");
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(labelArray61);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.Object obj17 = label15.info;
        java.lang.Object obj18 = label15.info;
        java.lang.Object obj19 = label15.info;
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        label15.info = typeArray25;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLocalVariable("L1182546440", "L457880368", "hi!()Ljava/lang/Short;", label12, label15, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 12");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = signature11.getReturnType();
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        boolean boolean16 = type13.equals((java.lang.Object) label14);
        java.lang.Object obj17 = label14.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLocalVariable("I", "", "L897927500", label8, label14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(signature11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.cglib.core.Signature signature8 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter0.visitMethod(3, "(L;D)V", "(L;D)V", "L1799275916", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(L;D)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(signature8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitInsn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("()LShort;", "L897927500");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter17.visitInnerClass("L1202418377", "(Ljava/lang/L;LV;)L;", "LL$3B$3B", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("IL1202418377");
        java.lang.String str2 = type1.getDescriptor();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitVarInsn((int) (short) -1, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitFieldInsn(96, "", "()Ljava/lang/Short;", "L1034763014");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(124, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter9.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIincInsn((int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn((int) (short) 100, "L1325724854");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter25);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter28);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter30.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter30.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo33);
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
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
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isArray(type12);
        int int15 = type12.getSize();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter9.visitIincInsn(60, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        int int5 = type0.getSort();
        int int6 = type0.getSize();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "short" + "'", str1, "short");
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(V)S" + "'", str4, "(V)S");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = classEmitter11.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(56);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        boolean boolean16 = type9.equals((java.lang.Object) strArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classEmitter1.visitMethod((int) (short) -1, "L1340227649", "L2061722705", "L1111712985", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@58fa10b5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "V" + "'", str10, "V");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "void" + "'", str13, "void");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        int int12 = type10.getOpcode((int) ' ');
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("int", type10, typeArray15);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray7);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        label0.info = signature20;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L1938746051" + "'", str2, "L1938746051");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1938746051" + "'", str3, "L1938746051");
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(signature20);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = null;
        label10.info = obj11;
        java.lang.Object obj13 = label10.info;
        java.lang.Object obj14 = label10.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.Object obj17 = label15.info;
        java.lang.String str18 = label15.toString();
        label15.info = ' ';
        java.lang.String str21 = label15.toString();
        java.lang.String str22 = label15.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("org.mockito.cglib.core.Signature", "L1328785442", "", label10, label15, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 104");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L189409594" + "'", str18, "L189409594");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L189409594" + "'", str21, "L189409594");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L189409594" + "'", str22, "L189409594");
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTypeInsn(1, "L115210646");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitFieldInsn((int) (short) -1, "org.mockito.cglib.core", "L306758391", "L690312719");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(102);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn((int) (short) 0, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(3, "L1325724854", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter0.visitMethod(11, "L2061722705", "L680990058", "L1010211844", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7772fd8a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.Object obj13 = label10.info;
        java.lang.Object obj14 = label10.info;
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        label10.info = typeArray20;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLineNumber((int) '#', label10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitInsn(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 104);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitMaxs(14, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        java.lang.Object obj15 = label12.info;
        java.lang.Object obj16 = null;
        label12.info = obj16;
        java.lang.String str18 = label12.toString();
        org.mockito.asm.Label[] labelArray19 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTableSwitchInsn((int) '4', (-1), label12, labelArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1695099778" + "'", str18, "L1695099778");
        org.junit.Assert.assertNotNull(labelArray19);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("hi!()Ljava/lang/Short;", "L<init>()V;", "(Ljava/lang/L;)L;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter2.visitAnnotation("L205843408", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor15 = localVariablesSorter10.visitParameterAnnotation(1, "L715803435", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classAdapter4.visitMethod(96, "L1565509129", "L40020120", "()Ljava/lang/IL1202418377;", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6818763");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.String str17 = label15.toString();
        java.lang.Object obj18 = label15.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLocalVariable("L690312719", "L1813600832", "Void", label14, label15, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1177233459" + "'", str17, "L1177233459");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("[Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L1913235182");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1913235182" + "'", str1, "L1913235182");
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5c1fe03c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("L327601669");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(0, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(130);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", "hi!");
        boolean boolean15 = signature13.equals((java.lang.Object) "LZ;");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLdcInsn((java.lang.Object) signature13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitMaxs((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitVarInsn(116, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean16 = type13.equals((java.lang.Object) type15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor25 = classEmitter5.visitMethod((-1), "L1328785442", "Java$2Elang", "Lorg/mockito/asm/Type;", strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@79e0ec7c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LL;;" + "'", str14, "LL;;");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(signature19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "()B" + "'", str23, "()B");
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter10 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = methodAdapter9.visitAnnotation("L1619152913", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        label0.info = ' ';
        java.lang.Object obj6 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L77232613" + "'", str3, "L77232613");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + ' ' + "'", obj6, ' ');
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = signature11.getReturnType();
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        boolean boolean16 = type13.equals((java.lang.Object) label14);
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        java.lang.Object obj19 = label17.info;
        java.lang.String str20 = label17.toString();
        java.lang.Object obj21 = label17.info;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type25);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type29);
        org.mockito.asm.Type type31 = type29.getElementType();
        label17.info = type31;
        java.lang.String str33 = label17.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(100, type35);
        org.mockito.asm.Type type37 = local36.getType();
        java.lang.String str38 = type37.getClassName();
        java.lang.String str39 = type37.getClassName();
        label17.info = type37;
        org.mockito.asm.Label label41 = new org.mockito.asm.Label();
        java.lang.Object obj42 = label41.info;
        java.lang.Object obj43 = label41.info;
        java.lang.Object obj44 = label41.info;
        java.lang.Object obj45 = label41.info;
        java.lang.Class[] classArray46 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        label41.info = typeArray51;
        java.lang.String str53 = label41.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitTryCatchBlock(label14, label17, label41, "L715803435");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(signature11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1504857989" + "'", str20, "L1504857989");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type31);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L1504857989" + "'", str33, "L1504857989");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "double" + "'", str38, "double");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "double" + "'", str39, "double");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "L897794687" + "'", str53, "L897794687");
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter8.visitAnnotation("(L;)L;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor19 = classEmitter16.visitAnnotation("L1034014722", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.mockito.asm.Type type13 = signature12.getReturnType();
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type13);
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        boolean boolean17 = type14.equals((java.lang.Object) label15);
        java.lang.Object obj18 = label15.info;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getBoxedType(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getPackageName(type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray28);
        org.mockito.asm.Type type30 = signature29.getReturnType();
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        java.lang.Object obj32 = label31.info;
        java.lang.String str33 = label31.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type34);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type34);
        label31.info = type34;
        boolean boolean38 = signature29.equals((java.lang.Object) label31);
        org.mockito.asm.Label label39 = new org.mockito.asm.Label();
        java.lang.Object obj40 = label39.info;
        java.lang.Object obj41 = label39.info;
        java.lang.String str42 = label39.toString();
        org.mockito.asm.Label label43 = new org.mockito.asm.Label();
        java.lang.Object obj44 = label43.info;
        java.lang.String str45 = label43.toString();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type46);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type46);
        label43.info = type46;
        label39.info = type46;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitTryCatchBlock(label15, label31, label39, "(Ljava/lang/L;LV;)L;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang" + "'", str22, "java.lang");
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNull(obj32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L1112998367" + "'", str33, "L1112998367");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "short" + "'", str35, "short");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L603111470" + "'", str42, "L603111470");
        org.junit.Assert.assertNull(obj44);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "L329052477" + "'", str45, "L329052477");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "short" + "'", str47, "short");
        org.junit.Assert.assertNotNull(type48);
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIntInsn((int) (short) -1, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitAnnotation("(Ljava/lang/L;)L;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(100, type13);
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type11, type13 };
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        java.lang.Object[] objArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame(130, 1, (java.lang.Object[]) typeArray16, 60, objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "double" + "'", str15, "double");
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(signature17);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = localVariablesSorter7.visitParameterAnnotation(42, "L306758391", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitVarInsn(52, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        java.lang.Class<?> wildcardClass12 = typeArray11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        org.mockito.asm.Type type18 = signature17.getReturnType();
        java.lang.Class<?> wildcardClass19 = signature17.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        java.lang.Class<?> wildcardClass26 = typeArray25.getClass();
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass26);
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        java.lang.String str31 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        java.lang.Class<?> wildcardClass36 = typeArray35.getClass();
        java.lang.String str37 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        java.lang.String str39 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass36);
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        java.lang.Class[] classArray42 = new java.lang.Class[] { wildcardClass12, wildcardClass19, wildcardClass26, wildcardClass36 };
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.getTypes(classArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.getTypes(classArray42);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLdcInsn((java.lang.Object) typeArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str13, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(signature17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str20, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str21, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str27, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str28, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str29, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str31, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str37, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str38, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str39, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str41, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.String str11 = label8.toString();
        label8.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitJumpInsn(154, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L490204811" + "'", str11, "L490204811");
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray26);
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor30 = classEmitter17.visitMethod(37, "L$243B", "L677830104", "(V)S", strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@329e0be2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(signature24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(typeArray29);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        int int19 = type17.getOpcode((int) ' ');
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("int", type17, typeArray22);
        org.mockito.asm.Type[] typeArray24 = signature23.getArgumentTypes();
        java.lang.String str25 = signature23.getName();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        int int34 = type32.getOpcode((int) ' ');
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("int", type32, typeArray37);
        org.mockito.asm.Type[] typeArray39 = signature38.getArgumentTypes();
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray29);
        org.mockito.cglib.core.Signature signature42 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        boolean boolean45 = org.mockito.cglib.core.TypeUtils.isPrimitive(type43);
        boolean boolean46 = org.mockito.cglib.core.TypeUtils.isArray(type43);
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        int int49 = type43.getOpcode(1);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type43);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter51 = classEmitter14.begin_method(16, signature23, typeArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@28c47122");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "int" + "'", str25, "int");
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(signature42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "V" + "'", str44, "V");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "void" + "'", str47, "void");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 6 + "'", int49 == 6);
        org.junit.Assert.assertNotNull(typeArray50);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("hi!()Ljava/lang/Short;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter6.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        java.lang.String str10 = signature9.getDescriptor();
        org.mockito.asm.Type[] typeArray11 = signature9.getArgumentTypes();
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("short", type14, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("short", type20, typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray16);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLdcInsn((java.lang.Object) typeArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(signature9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "()V" + "'", str10, "()V");
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitTypeInsn(9, "org/mockito/cglib/core/Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        int int19 = type17.getOpcode((int) ' ');
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("int", type17, typeArray22);
        org.mockito.asm.Type[] typeArray24 = signature23.getArgumentTypes();
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getBoxedType(type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        java.lang.Class[] classArray32 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray33);
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.visit(126, 116, "", "L1813600832", "L195506085", strArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs(12, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.Label label11 = null;
        int[] intArray16 = new int[] { 102, (short) 10, 16, 156 };
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        java.lang.Object obj19 = label17.info;
        java.lang.String str20 = label17.toString();
        java.lang.Object obj21 = label17.info;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type25);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type29);
        org.mockito.asm.Type type31 = type29.getElementType();
        label17.info = type31;
        java.lang.String str33 = label17.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(100, type35);
        org.mockito.asm.Type type37 = local36.getType();
        java.lang.String str38 = type37.getClassName();
        java.lang.String str39 = type37.getClassName();
        label17.info = type37;
        org.mockito.asm.Label label41 = new org.mockito.asm.Label();
        java.lang.Object obj42 = null;
        label41.info = obj42;
        java.lang.Object obj44 = label41.info;
        java.lang.Object obj45 = label41.info;
        org.mockito.asm.Label label46 = new org.mockito.asm.Label();
        java.lang.Object obj47 = label46.info;
        java.lang.Object obj48 = label46.info;
        java.lang.String str49 = label46.toString();
        label46.info = ' ';
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray53 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray52);
        org.mockito.cglib.core.Signature signature54 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray52);
        org.mockito.asm.Type type55 = signature54.getReturnType();
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type55);
        org.mockito.asm.Label label57 = new org.mockito.asm.Label();
        java.lang.Object obj58 = label57.info;
        boolean boolean59 = type56.equals((java.lang.Object) label57);
        org.mockito.asm.Label label60 = new org.mockito.asm.Label();
        java.lang.Object obj61 = label60.info;
        java.lang.Object obj62 = label60.info;
        java.lang.Object obj63 = label60.info;
        java.lang.Object obj64 = label60.info;
        org.mockito.asm.Label label65 = new org.mockito.asm.Label();
        java.lang.Object obj66 = label65.info;
        java.lang.Object obj67 = label65.info;
        java.lang.Object obj68 = label65.info;
        java.lang.Object obj69 = label65.info;
        org.mockito.asm.Label[] labelArray70 = new org.mockito.asm.Label[] { label17, label41, label46, label57, label60, label65 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLookupSwitchInsn(label11, intArray16, labelArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[102, 10, 16, 156]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1409540228" + "'", str20, "L1409540228");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type31);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L1409540228" + "'", str33, "L1409540228");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "double" + "'", str38, "double");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "double" + "'", str39, "double");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L1054417858" + "'", str49, "L1054417858");
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(signature54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(labelArray70);
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isPrimitive(type13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type17);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean23 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray26);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray33);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray33, typeArray37);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray42);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLdcInsn((java.lang.Object) typeArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(signature28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(signature35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray43);
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.Type type13 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.declare_field(124, "()LShort;", type13, (java.lang.Object) "Java/lang/Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.String str9 = label6.toString();
        label6.info = ' ';
        java.lang.String str12 = label6.toString();
        java.lang.Object obj13 = label6.info;
        int[] intArray17 = new int[] { 126, 96, (byte) 100 };
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.String str20 = label18.toString();
        java.lang.Object obj21 = label18.info;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.Object obj24 = label22.info;
        java.lang.String str25 = label22.toString();
        java.lang.Object obj26 = label22.info;
        label18.info = obj26;
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.Object obj29 = label28.info;
        java.lang.Object obj30 = label28.info;
        java.lang.Object obj31 = label28.info;
        java.lang.Object obj32 = null;
        label28.info = obj32;
        org.mockito.asm.Label label34 = new org.mockito.asm.Label();
        java.lang.Object obj35 = label34.info;
        java.lang.Object obj36 = label34.info;
        java.lang.String str37 = label34.toString();
        java.lang.String str38 = label34.toString();
        java.lang.Object obj39 = label34.info;
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray43 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.getTypes(classArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("short", type42, typeArray44);
        java.lang.String str46 = signature45.getName();
        label34.info = str46;
        org.mockito.asm.Label label48 = new org.mockito.asm.Label();
        java.lang.String str49 = label48.toString();
        java.lang.Object obj50 = label48.info;
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray54 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("short", type53, typeArray55);
        int int57 = type53.getSort();
        java.lang.String str58 = type53.toString();
        label48.info = type53;
        org.mockito.asm.Label label60 = new org.mockito.asm.Label();
        java.lang.Object obj61 = label60.info;
        java.lang.Object obj62 = label60.info;
        java.lang.String str63 = label60.toString();
        label60.info = ' ';
        java.lang.String str66 = label60.toString();
        java.lang.Object obj67 = label60.info;
        java.lang.Object obj68 = label60.info;
        java.lang.Object obj69 = label60.info;
        org.mockito.asm.Label[] labelArray70 = new org.mockito.asm.Label[] { label18, label28, label34, label48, label60 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLookupSwitchInsn(label6, intArray17, labelArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L884253361" + "'", str9, "L884253361");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L884253361" + "'", str12, "L884253361");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[126, 96, 100]");
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L252878314" + "'", str20, "L252878314");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L781291770" + "'", str25, "L781291770");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1882314066" + "'", str37, "L1882314066");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L1882314066" + "'", str38, "L1882314066");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "short" + "'", str46, "short");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L1627476175" + "'", str49, "L1627476175");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "L;" + "'", str58, "L;");
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "L2053602504" + "'", str63, "L2053602504");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "L2053602504" + "'", str66, "L2053602504");
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + ' ' + "'", obj67, ' ');
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + ' ' + "'", obj68, ' ');
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + ' ' + "'", obj69, ' ');
        org.junit.Assert.assertNotNull(labelArray70);
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("short", type16, typeArray18);
        int int20 = type16.getSort();
        java.lang.String str21 = type16.toString();
        java.lang.String str22 = type16.toString();
        boolean boolean24 = type16.equals((java.lang.Object) (short) 100);
        int int25 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type16);
        label10.info = type16;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.Object obj28 = null;
        label27.info = obj28;
        java.lang.Object obj30 = label27.info;
        java.lang.Object obj31 = label27.info;
        java.lang.String str32 = label27.toString();
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        java.lang.Object obj34 = label33.info;
        java.lang.Object obj35 = label33.info;
        java.lang.String str36 = label33.toString();
        java.lang.String str37 = label33.toString();
        java.lang.String str38 = label33.toString();
        java.lang.Object obj39 = label33.info;
        java.lang.String str40 = label33.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitTryCatchBlock(label10, label27, label33, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1547774175" + "'", str13, "L1547774175");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L;" + "'", str21, "L;");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L;" + "'", str22, "L;");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L714670490" + "'", str32, "L714670490");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1081484691" + "'", str36, "L1081484691");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1081484691" + "'", str37, "L1081484691");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L1081484691" + "'", str38, "L1081484691");
        org.junit.Assert.assertNull(obj39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "L1081484691" + "'", str40, "L1081484691");
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter25);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter28);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter30.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter30.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo33);
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = null;
        label10.info = obj11;
        java.lang.Object obj13 = label10.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitJumpInsn(11, label10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor27 = classEmitter10.visitMethod(116, "()LShort;", "L869655829", "int(L;)I", strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()LShort;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitSource("byte", "L1768459599");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter10 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        java.lang.String str15 = label12.toString();
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("short", type18, typeArray20);
        int int22 = type18.getSort();
        java.lang.String str23 = type18.toString();
        java.lang.String str24 = type18.toString();
        boolean boolean26 = type18.equals((java.lang.Object) (short) 100);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type18);
        label12.info = type18;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitJumpInsn(42, label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L384729442" + "'", str15, "L384729442");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L;" + "'", str23, "L;");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L;" + "'", str24, "L;");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitInsn(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitMethodInsn(32, "L$243B", "L690312719", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitTypeInsn((int) (byte) 10, "java.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor6);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(155, "L1768459599", (org.mockito.asm.MethodVisitor) localVariablesSorter12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter25);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter28);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        int int40 = type38.getOpcode((int) ' ');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("int", type38, typeArray43);
        org.mockito.asm.Type[] typeArray45 = signature44.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor46 = classEmitter30.visitField(1, "Lint;", "Ljava/lang/Void;", "(Ljava/lang/Short;)D", (java.lang.Object) typeArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray45);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("L()B;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn(153, "L1325724854org.mockito.cglib.core.Signature", "L321013184", "L869032533");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter5.visitParameterAnnotation(128, "()D", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.Object obj13 = label10.info;
        java.lang.Object obj14 = label10.info;
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        label10.info = typeArray20;
        java.lang.String str22 = label10.toString();
        int[] intArray26 = new int[] { 102, 130, 104 };
        org.mockito.asm.Label[] labelArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLookupSwitchInsn(label10, intArray26, labelArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1406923116" + "'", str22, "L1406923116");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[102, 130, 104]");
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("L1621336944");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(129);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        java.lang.Object obj14 = label11.info;
        int[] intArray19 = new int[] { 126, 106, (byte) 100, 156 };
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.Object obj22 = label20.info;
        java.lang.String str23 = label20.toString();
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.Object obj25 = label24.info;
        java.lang.String str26 = label24.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type27);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        label24.info = type27;
        label20.info = type27;
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        java.lang.Object obj33 = label32.info;
        java.lang.Object obj34 = label32.info;
        java.lang.Object obj35 = label32.info;
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        java.lang.String str37 = label36.toString();
        java.lang.Object obj38 = label36.info;
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.getTypes(classArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("short", type41, typeArray43);
        int int45 = type41.getSort();
        java.lang.String str46 = type41.toString();
        label36.info = type41;
        org.mockito.asm.Label label48 = new org.mockito.asm.Label();
        java.lang.String str49 = label48.toString();
        java.lang.Object obj50 = label48.info;
        org.mockito.asm.Label label51 = new org.mockito.asm.Label();
        java.lang.Object obj52 = label51.info;
        java.lang.Object obj53 = label51.info;
        java.lang.String str54 = label51.toString();
        java.lang.Object obj55 = label51.info;
        org.mockito.asm.Label label56 = new org.mockito.asm.Label();
        java.lang.String str57 = label56.toString();
        java.lang.Object obj58 = label56.info;
        java.lang.String str59 = label56.toString();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type61);
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type61);
        org.mockito.cglib.core.Local local64 = new org.mockito.cglib.core.Local(11, type61);
        java.lang.Class<?> wildcardClass65 = local64.getClass();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass65);
        label56.info = type66;
        org.mockito.asm.Label[] labelArray68 = new org.mockito.asm.Label[] { label20, label32, label36, label48, label51, label56 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLookupSwitchInsn(label11, intArray19, labelArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[126, 106, 100, 156]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L34975464" + "'", str23, "L34975464");
        org.junit.Assert.assertNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1287477866" + "'", str26, "L1287477866");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "short" + "'", str28, "short");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L949870336" + "'", str37, "L949870336");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "L;" + "'", str46, "L;");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L342170078" + "'", str49, "L342170078");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "L1000900436" + "'", str54, "L1000900436");
        org.junit.Assert.assertNull(obj55);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "L501277761" + "'", str57, "L501277761");
        org.junit.Assert.assertNull(obj58);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "L501277761" + "'", str59, "L501277761");
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "short" + "'", str62, "short");
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(labelArray68);
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        int int7 = type4.getSort();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("L205843408", type4, typeArray9);
        java.lang.Class<?> wildcardClass11 = signature10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter17);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter17.visitInnerClass("", "L1943638160", "L457880368", 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter25);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter28);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean40 = type37.equals((java.lang.Object) type39);
        org.mockito.asm.MethodVisitor methodVisitor43 = null;
        org.mockito.asm.MethodAdapter methodAdapter44 = new org.mockito.asm.MethodAdapter(methodVisitor43);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter45 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter44);
        boolean boolean46 = type37.equals((java.lang.Object) 8);
        int int48 = type37.getOpcode((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor49 = classEmitter30.visitField(110, "B", "Hi!", "L315113280", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LL;;" + "'", str38, "LL;;");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 104 + "'", int48 == 104);
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter25);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter28);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray40 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.getTypes(classArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("short", type39, typeArray41);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray46 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("short", type45, typeArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        boolean boolean52 = org.mockito.cglib.core.TypeUtils.isPrimitive(type50);
        boolean boolean53 = org.mockito.cglib.core.TypeUtils.isArray(type50);
        java.lang.String str54 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type50);
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray56 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray55);
        boolean boolean57 = type50.equals((java.lang.Object) strArray56);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray56);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray47, typeArray58);
        java.lang.String[] strArray60 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray58);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor61 = classEmitter30.visitMethod(130, "java$2Elang", "L1945359127", "L851034773", strArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7eeef54f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "V" + "'", str51, "V");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "void" + "'", str54, "void");
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(strArray60);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L;(Ljava/lang/L;LV;)L;");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        java.lang.String str14 = label10.toString();
        java.lang.String str15 = label10.toString();
        java.lang.Object obj16 = label10.info;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLocalVariable("L$3B", "L1457561325", "()Ljava/lang/Short;", label10, label17, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L738988815" + "'", str13, "L738988815");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L738988815" + "'", str14, "L738988815");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L738988815" + "'", str15, "L738988815");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor16 = classEmitter12.visitAnnotation("L1325724854org.mockito.cglib.core.Signature", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        java.lang.String str14 = label11.toString();
        java.lang.String str15 = label11.toString();
        java.lang.String str16 = label11.toString();
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        java.lang.Object obj19 = label17.info;
        java.lang.Object obj20 = label17.info;
        java.lang.Object obj21 = label17.info;
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        label17.info = typeArray27;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("", "L1852500780", "L680990058", label11, label17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L991883101" + "'", str14, "L991883101");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L991883101" + "'", str15, "L991883101");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L991883101" + "'", str16, "L991883101");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getBoxedType(type24);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getPackageName(type25);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray27);
        java.lang.Class[] classArray30 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", type25, typeArray32);
        org.mockito.asm.Type type34 = signature33.getReturnType();
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type34);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        int int44 = type42.getOpcode((int) ' ');
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("int", type42, typeArray47);
        org.mockito.asm.Type[] typeArray49 = signature48.getArgumentTypes();
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray39);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local54 = new org.mockito.cglib.core.Local(100, type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type53);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray51, type53);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        boolean boolean60 = org.mockito.cglib.core.TypeUtils.isPrimitive(type58);
        boolean boolean61 = org.mockito.cglib.core.TypeUtils.isArray(type58);
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(9, type58);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type58);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("byte", type35, typeArray56);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("L2029575687", type20, typeArray56);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type20);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray69 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray68);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray69);
        org.mockito.cglib.core.Signature signature71 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray70);
        org.mockito.asm.Type[] typeArray72 = signature71.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.begin_class((-1), 110, "Z", type20, typeArray72, "L380461644");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LL;;" + "'", str21, "LL;;");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang" + "'", str26, "java.lang");
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(signature29);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "V" + "'", str59, "V");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(signature71);
        org.junit.Assert.assertNotNull(typeArray72);
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitIincInsn(11, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str2 = type1.toString();
        int int4 = type1.getOpcode(8);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str6 = type5.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = type5.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L;" + "'", str2, "L;");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L;" + "'", str6, "L;");
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 60);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter10 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.String str12 = label11.toString();
        java.lang.Object obj13 = label11.info;
        java.lang.String str14 = label11.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(11, type16);
        java.lang.Class<?> wildcardClass20 = local19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        label11.info = type21;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLdcInsn((java.lang.Object) type21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L311925353" + "'", str12, "L311925353");
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L311925353" + "'", str14, "L311925353");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "short" + "'", str17, "short");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(type21);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(157);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn((int) (short) 0, "L774406697", "L715803435", "L965538451");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitInsn((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.String str12 = label9.toString();
        java.lang.Object obj13 = label9.info;
        java.lang.String str14 = label9.toString();
        org.mockito.asm.Label label15 = null;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.mockito.asm.Type type19 = signature18.getReturnType();
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type19);
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        boolean boolean23 = type20.equals((java.lang.Object) label21);
        java.lang.Object obj24 = label21.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitTryCatchBlock(label9, label15, label21, "L1438273522");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L707934979" + "'", str12, "L707934979");
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L707934979" + "'", str14, "L707934979");
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitMethodInsn(11, "Short", "(L;Lint;)V", "L746726514");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitIincInsn(16, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type16);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor19 = classAdapter7.visitMethod(16, "LV;", "Ljava/lang/Short;", "L245395834", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2ee37e6b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIincInsn(14, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = classAdapter10.visitAnnotation("(L;)Z", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter2.visitAnnotation("short", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIincInsn((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        java.lang.Class<?> wildcardClass30 = typeArray29.getClass();
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray33);
        org.mockito.asm.Type type36 = signature35.getReturnType();
        java.lang.Class<?> wildcardClass37 = signature35.getClass();
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass37);
        java.lang.String str39 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray42);
        java.lang.Class<?> wildcardClass44 = typeArray43.getClass();
        java.lang.String str45 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass44);
        java.lang.String str46 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass44);
        java.lang.String str47 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        java.lang.String str49 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray52 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray52);
        java.lang.Class<?> wildcardClass54 = typeArray53.getClass();
        java.lang.String str55 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass54);
        java.lang.String str56 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass54);
        java.lang.String str57 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        java.lang.String str59 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass54);
        java.lang.Class[] classArray60 = new java.lang.Class[] { wildcardClass30, wildcardClass37, wildcardClass44, wildcardClass54 };
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.getTypes(classArray60);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.getTypes(classArray60);
        java.lang.String[] strArray63 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray62);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor64 = classAdapter21.visitMethod(158, "L1010211844", "Z", "L1945359127", strArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@37314baf");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str31, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(signature35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str38, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str39, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str45, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str46, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str47, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str49, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str55, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str56, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str57, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str59, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(strArray63);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.String str8 = label6.toString();
        java.lang.String str9 = label6.toString();
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
        org.mockito.cglib.core.Signature signature26 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray25);
        label6.info = signature26;
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.Object obj29 = label28.info;
        java.lang.Object obj30 = label28.info;
        java.lang.String str31 = label28.toString();
        java.lang.String str32 = label28.toString();
        java.lang.String str33 = label28.toString();
        java.lang.Object obj34 = label28.info;
        java.lang.String str35 = label28.toString();
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        java.lang.String str37 = label36.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label6, label28, label36, "L1182546440");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L258569875" + "'", str8, "L258569875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L258569875" + "'", str9, "L258569875");
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(signature26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1938001857" + "'", str31, "L1938001857");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L1938001857" + "'", str32, "L1938001857");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L1938001857" + "'", str33, "L1938001857");
        org.junit.Assert.assertNull(obj34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L1938001857" + "'", str35, "L1938001857");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L136378436" + "'", str37, "L136378436");
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor14 = localVariablesSorter11.visitAnnotation("L1461338839", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("<init>(S)V");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<init>$28S$29V" + "'", str1, "<init>$28S$29V");
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitIntInsn(42, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.String str13 = label11.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        label11.info = type14;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitJumpInsn((int) (short) -1, label11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L337489602" + "'", str13, "L337489602");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "short" + "'", str15, "short");
        org.junit.Assert.assertNotNull(type16);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.String str12 = label10.toString();
        java.lang.String str13 = label10.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLineNumber(60, label10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1833467307" + "'", str12, "L1833467307");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1833467307" + "'", str13, "L1833467307");
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitIincInsn(1, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFieldInsn(0, "L457880368", "(Ljava/lang/L;)Lt;", "(V)S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter10 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter10.visitIincInsn(108, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("L1786680090", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitIntInsn((int) (short) 10, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST(1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.Object obj10 = label8.info;
        java.lang.String str11 = label8.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type13);
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(11, type13);
        java.lang.Class<?> wildcardClass17 = local16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        label8.info = type18;
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str22 = type21.toString();
        label8.info = str22;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn(16, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1736901171" + "'", str9, "L1736901171");
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1736901171" + "'", str11, "L1736901171");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "short" + "'", str14, "short");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L;" + "'", str22, "L;");
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter15.visitAttribute(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.Object obj12 = label9.info;
        java.lang.Object obj13 = label9.info;
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        label9.info = typeArray19;
        label9.info = "S";
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        java.lang.Object obj25 = label23.info;
        java.lang.String str26 = label23.toString();
        label23.info = ' ';
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type29);
        java.lang.String str31 = type29.getClassName();
        label23.info = type29;
        org.mockito.asm.Label[] labelArray33 = new org.mockito.asm.Label[] { label23 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTableSwitchInsn(3, 157, label9, labelArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1577886530" + "'", str26, "L1577886530");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "int" + "'", str30, "int");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "int" + "'", str31, "int");
        org.junit.Assert.assertNotNull(labelArray33);
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitMultiANewArrayInsn("L1589298560", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("<init>()V");
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(1, type10);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitLdcInsn((java.lang.Object) type10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("V");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type18);
        java.lang.String str20 = type18.getClassName();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getBoxedType(type22);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getPackageName(type23);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor27 = classEmitter8.visitField(155, "org$2Emockito$2Ecglib$2Ecore", "LV;", "L1325724854", (java.lang.Object) type23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "V" + "'", str20, "V");
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang" + "'", str24, "java.lang");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.Short" + "'", str25, "java.lang.Short");
        org.junit.Assert.assertNotNull(typeArray26);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitAttribute(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIntInsn(132, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        java.lang.String str17 = label14.toString();
        label14.info = ' ';
        java.lang.String str20 = label14.toString();
        java.lang.Object obj21 = label14.info;
        java.lang.Object obj22 = label14.info;
        java.lang.Object obj23 = label14.info;
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.Object obj25 = label24.info;
        java.lang.String str26 = label24.toString();
        java.lang.Object obj27 = label24.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLocalVariable("L315113280", "B", "java$2Elang", label14, label24, 129);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 129");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L223930355" + "'", str17, "L223930355");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L223930355" + "'", str20, "L223930355");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + ' ' + "'", obj22, ' ');
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + ' ' + "'", obj23, ' ');
        org.junit.Assert.assertNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1116597489" + "'", str26, "L1116597489");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("L680990058");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("()B");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("V");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type21);
        java.lang.String str23 = type21.getClassName();
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type21);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray24);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("short", type28, typeArray30);
        int int32 = type28.getSort();
        java.lang.String str33 = type28.toString();
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray35 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray34);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        java.lang.Class[] classArray39 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.getTypes(classArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray34, typeArray38);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray42);
        boolean boolean45 = type15.equals((java.lang.Object) typeArray44);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray48 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray48);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        int int55 = type53.getOpcode((int) ' ');
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray57);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("int", type53, typeArray58);
        org.mockito.asm.Type[] typeArray60 = signature59.getArgumentTypes();
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray50, typeArray60);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray49, typeArray50);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local65 = new org.mockito.cglib.core.Local(100, type64);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type64);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray62, type64);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str70 = type69.getDescriptor();
        boolean boolean71 = org.mockito.cglib.core.TypeUtils.isPrimitive(type69);
        boolean boolean72 = org.mockito.cglib.core.TypeUtils.isArray(type69);
        org.mockito.cglib.core.Local local73 = new org.mockito.cglib.core.Local(9, type69);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray67, type69);
        java.lang.String[] strArray76 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray76);
        org.mockito.asm.Type type78 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean79 = org.mockito.cglib.core.TypeUtils.isPrimitive(type78);
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.add(typeArray77, type78);
        org.mockito.asm.Type type82 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.add(typeArray77, type82);
        org.mockito.asm.Type type84 = type82.getElementType();
        java.lang.String[] strArray86 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray86);
        org.mockito.asm.Type type88 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean89 = org.mockito.cglib.core.TypeUtils.isPrimitive(type88);
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.add(typeArray87, type88);
        java.lang.String str91 = org.mockito.asm.Type.getMethodDescriptor(type84, typeArray90);
        org.mockito.asm.Type[] typeArray92 = org.mockito.cglib.core.TypeUtils.add(typeArray74, typeArray90);
        org.mockito.cglib.core.Signature signature93 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray90);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter11.visitFrame(100, (int) (short) 10, (java.lang.Object[]) typeArray44, (int) '4', (java.lang.Object[]) typeArray90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "()B" + "'", str16, "()B");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "()B" + "'", str17, "()B");
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "V" + "'", str23, "V");
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L;" + "'", str33, "L;");
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(L;)L;" + "'", str43, "(L;)L;");
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "V" + "'", str70, "V");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertNotNull(type78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertNotNull(type88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "(L;D)Lt;" + "'", str91, "(L;D)Lt;");
        org.junit.Assert.assertNotNull(typeArray92);
        org.junit.Assert.assertNotNull(signature93);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("(L;)D", "", "(L;D)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor24 = classAdapter21.visitAnnotation("java$2Elang", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("va.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        java.lang.Object obj10 = null;
        label6.info = obj10;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitLabel(label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.String str11 = label8.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.String str14 = label12.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type15);
        label12.info = type15;
        label8.info = type15;
        java.lang.Object obj20 = label8.info;
        java.lang.String str21 = label8.toString();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.Object obj24 = label22.info;
        java.lang.String str25 = label22.toString();
        java.lang.String str26 = label22.toString();
        java.lang.String str27 = label22.toString();
        java.lang.Object obj28 = label22.info;
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.Object obj30 = label29.info;
        java.lang.Object obj31 = label29.info;
        java.lang.Object obj32 = label29.info;
        java.lang.Object obj33 = null;
        label29.info = obj33;
        java.lang.String str35 = label29.toString();
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        java.lang.String str37 = label36.toString();
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        java.lang.String str39 = label38.toString();
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        java.lang.Object obj41 = label40.info;
        java.lang.Object obj42 = label40.info;
        java.lang.String str43 = label40.toString();
        label40.info = ' ';
        java.lang.String str46 = label40.toString();
        java.lang.String str47 = label40.toString();
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] { label22, label29, label36, label38, label40 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitTableSwitchInsn((int) (byte) 10, 15, label8, labelArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1676367349" + "'", str11, "L1676367349");
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L539473520" + "'", str14, "L539473520");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "short" + "'", str16, "short");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "S");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1676367349" + "'", str21, "L1676367349");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L1371619129" + "'", str25, "L1371619129");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1371619129" + "'", str26, "L1371619129");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L1371619129" + "'", str27, "L1371619129");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L1233252618" + "'", str35, "L1233252618");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1895584050" + "'", str37, "L1895584050");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "L1836445035" + "'", str39, "L1836445035");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L890584843" + "'", str43, "L890584843");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "L890584843" + "'", str46, "L890584843");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "L890584843" + "'", str47, "L890584843");
        org.junit.Assert.assertNotNull(labelArray48);
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = null;
        label10.info = obj11;
        int[] intArray17 = new int[] { (short) 100, 14, 116, (short) 0 };
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.Object obj20 = label18.info;
        java.lang.String str21 = label18.toString();
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("short", type24, typeArray26);
        int int28 = type24.getSort();
        java.lang.String str29 = type24.toString();
        java.lang.String str30 = type24.toString();
        boolean boolean32 = type24.equals((java.lang.Object) (short) 100);
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type24);
        label18.info = type24;
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        java.lang.Object obj36 = label35.info;
        java.lang.Object obj37 = label35.info;
        java.lang.Object obj38 = label35.info;
        java.lang.Object obj39 = label35.info;
        java.lang.Class[] classArray40 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.getTypes(classArray40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.getTypes(classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.getTypes(classArray40);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.getTypes(classArray40);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.getTypes(classArray40);
        label35.info = typeArray45;
        label35.info = "S";
        org.mockito.asm.Label label49 = new org.mockito.asm.Label();
        java.lang.Object obj50 = label49.info;
        java.lang.Object obj51 = label49.info;
        java.lang.String str52 = label49.toString();
        java.lang.Object obj53 = label49.info;
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type57);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type57);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type61);
        org.mockito.asm.Type type63 = type61.getElementType();
        label49.info = type63;
        org.mockito.asm.Label[] labelArray65 = new org.mockito.asm.Label[] { label18, label35, label49 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter9.visitLookupSwitchInsn(label10, intArray17, labelArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 14, 116, 0]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1570474322" + "'", str21, "L1570474322");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L;" + "'", str29, "L;");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L;" + "'", str30, "L;");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "L986150547" + "'", str52, "L986150547");
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(labelArray65);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(108);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitVarInsn(116, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitInsn(128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        java.lang.String str14 = label11.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.String str17 = label15.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type18);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type18);
        label15.info = type18;
        label11.info = type18;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLabel(label11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1307174795" + "'", str14, "L1307174795");
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1977382988" + "'", str17, "L1977382988");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "short" + "'", str19, "short");
        org.junit.Assert.assertNotNull(type20);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type8);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray15);
        org.mockito.asm.Type type17 = signature16.getReturnType();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.String str20 = label18.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type21);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type21);
        label18.info = type21;
        boolean boolean25 = signature16.equals((java.lang.Object) label18);
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.Object obj27 = label26.info;
        java.lang.Object obj28 = label26.info;
        java.lang.String str29 = label26.toString();
        java.lang.Object obj30 = label26.info;
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isPrimitive(type34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type34);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type38);
        org.mockito.asm.Type type40 = type38.getElementType();
        label26.info = type40;
        org.mockito.asm.Label label42 = new org.mockito.asm.Label();
        java.lang.Object obj43 = label42.info;
        java.lang.Object obj44 = label42.info;
        java.lang.Object obj45 = label42.info;
        java.lang.Object obj46 = label42.info;
        java.lang.Class[] classArray47 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        label42.info = typeArray52;
        label42.info = "S";
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitTryCatchBlock(label18, label26, label42, "<init>(Ljava/lang/L179248870;)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1423532337" + "'", str20, "L1423532337");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "short" + "'", str22, "short");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1717658136" + "'", str29, "L1717658136");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(typeArray52);
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("()B", "L1565509129");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        java.lang.String str10 = signature9.getDescriptor();
        org.mockito.asm.Type[] typeArray11 = signature9.getArgumentTypes();
        org.mockito.asm.Type[] typeArray12 = signature9.getArgumentTypes();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        int int21 = type19.getOpcode((int) ' ');
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("int", type19, typeArray24);
        org.mockito.asm.Type[] typeArray26 = signature25.getArgumentTypes();
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray16);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(100, type30);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type30);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type30);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type35);
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isArray(type35);
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(9, type35);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type35);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean45 = org.mockito.cglib.core.TypeUtils.isPrimitive(type44);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray43, type44);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray43, type48);
        org.mockito.asm.Type type50 = type48.getElementType();
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray52);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isPrimitive(type54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray53, type54);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray56);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray40, typeArray56);
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray60 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray59);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray62);
        java.lang.Class[] classArray64 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.getTypes(classArray64);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray63, typeArray65);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray59, typeArray63);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray58, typeArray59);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray58);
        java.lang.Object[] objArray71 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitFrame(56, 102, (java.lang.Object[]) typeArray58, 1, objArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(signature9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "()V" + "'", str10, "()V");
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "V" + "'", str36, "V");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(L;D)Lt;" + "'", str57, "(L;D)Lt;");
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray69);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitInsn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = localVariablesSorter5.visitParameterAnnotation(10, "org.mockito.cglib.core", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(112);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitMaxs(13, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter10 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter10.visitMultiANewArrayInsn("L1943638160", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLdcInsn((java.lang.Object) classInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitVarInsn(2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMultiANewArrayInsn("short(Ljava/lang/V;LV;)Lva/lang;", 37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitIincInsn((int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitMethodInsn(158, "(L;Lint;)V", "org/mockito/cglib/core/Signature", "()Ljava/lang;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter18.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo19);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter9.visitMethodInsn(8, "", "java.lang.L179248870", "L677830104");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("L2021451540");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L2021451540" + "'", str1, "L2021451540");
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        java.lang.Object obj11 = label7.info;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isPrimitive(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type15);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type19);
        org.mockito.asm.Type type21 = type19.getElementType();
        label7.info = type21;
        java.lang.String str23 = label7.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(100, type25);
        org.mockito.asm.Type type27 = local26.getType();
        java.lang.String str28 = type27.getClassName();
        java.lang.String str29 = type27.getClassName();
        label7.info = type27;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L772641422" + "'", str10, "L772641422");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L772641422" + "'", str23, "L772641422");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "double" + "'", str28, "double");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "double" + "'", str29, "double");
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(37, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L321013184");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(155, "L1340227649", (org.mockito.asm.MethodVisitor) methodAdapter7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitMethodInsn(7, "()V", "L680990058", "L1799275916");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("", 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter11.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitInsn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L1092810277()LShort;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1092810277$28$29LShort$3B" + "'", str1, "L1092810277$28$29LShort$3B");
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("L1111712985", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter16.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitTypeInsn((int) 'a', "L1213742046");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter9.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        java.lang.Object obj12 = label10.info;
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("short", type15, typeArray17);
        int int19 = type15.getSort();
        java.lang.String str20 = type15.toString();
        label10.info = type15;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.Object obj24 = label22.info;
        java.lang.String str25 = label22.toString();
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.Object obj27 = label26.info;
        java.lang.String str28 = label26.toString();
        java.lang.String str29 = label26.toString();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        int int38 = type36.getOpcode((int) ' ');
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("int", type36, typeArray41);
        org.mockito.asm.Type[] typeArray43 = signature42.getArgumentTypes();
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray33, typeArray43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray33);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray45);
        label26.info = signature46;
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] { label22, label26 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn((int) '4', 12, label10, labelArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1920339731" + "'", str11, "L1920339731");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L;" + "'", str20, "L;");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L1651565592" + "'", str25, "L1651565592");
        org.junit.Assert.assertNull(obj27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1579721135" + "'", str28, "L1579721135");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1579721135" + "'", str29, "L1579721135");
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(signature46);
        org.junit.Assert.assertNotNull(labelArray48);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.visitOuterClass("", "(Ljava/lang/L;)Lt;", "java.lang.L179248870");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitIincInsn((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMaxs((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = null;
        label10.info = obj11;
        java.lang.Object obj13 = label10.info;
        java.lang.Object obj14 = label10.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.Object obj17 = label15.info;
        java.lang.String str18 = label15.toString();
        label15.info = ' ';
        java.lang.String str21 = label15.toString();
        java.lang.String str22 = label15.toString();
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        java.lang.Object obj25 = label23.info;
        java.lang.Object obj26 = label23.info;
        java.lang.Object obj27 = label23.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTryCatchBlock(label10, label15, label23, "(L;D)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L890138115" + "'", str18, "L890138115");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L890138115" + "'", str21, "L890138115");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L890138115" + "'", str22, "L890138115");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type[] typeArray15 = signature13.getArgumentTypes();
        org.mockito.asm.Type type16 = signature13.getReturnType();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter(classVisitor22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter23);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.asm.ClassVisitor classVisitor30 = null;
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter(classVisitor30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter31);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter34);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter34);
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter34);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.declare_field(96, "int(L;)I", type16, (java.lang.Object) classAdapter34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNull(classInfo18);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("L484864404", "byte", "L2029575687", 102);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(Ljava/lang/Short;)D", "(Ljava/lang/L;)Lt;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(Ljava/lang/Short;)D' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L1340227649");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMaxs((int) (byte) -1, 133);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean20 = type17.equals((java.lang.Object) type19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class[] classArray24 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray26);
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit(130, 37, "L1331900336", "boolean", "L1384125117", strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LL;;" + "'", str18, "LL;;");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(signature23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "()B" + "'", str27, "()B");
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Short");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("[Lorg/mockito/asm/Type;");
        int int2 = type1.getSize();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(1, 60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1325724854org.mockito.cglib.core.Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter10 = classEmitter7.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5360258a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.String str15 = label14.toString();
        java.lang.Object obj16 = label14.info;
        java.lang.Object obj17 = label14.info;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.String str20 = label18.toString();
        java.lang.String str21 = label18.toString();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        int int30 = type28.getOpcode((int) ' ');
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("int", type28, typeArray33);
        org.mockito.asm.Type[] typeArray35 = signature34.getArgumentTypes();
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray25);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray37);
        label18.info = signature38;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLocalVariable("L851034773", "org$2Emockito$2Ecglib$2Ecore", "<init>(S)V", label14, label18, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 14");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1861642180" + "'", str15, "L1861642180");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L477399975" + "'", str20, "L477399975");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L477399975" + "'", str21, "L477399975");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(signature38);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("L1621336944");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1621336944" + "'", str1, "L1621336944");
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        label10.info = ' ';
        java.lang.String str16 = label10.toString();
        java.lang.String str17 = label10.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.Object obj20 = label18.info;
        java.lang.Object obj21 = label18.info;
        java.lang.Object obj22 = label18.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("L1111712985", "()Ljava/lang/Short;", "", label10, label18, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1438021744" + "'", str13, "L1438021744");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1438021744" + "'", str16, "L1438021744");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1438021744" + "'", str17, "L1438021744");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(42);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        org.mockito.asm.Type type0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type2);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        int int14 = type12.getOpcode((int) ' ');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("int", type12, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray9);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isPrimitive(type23);
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isArray(type23);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        int int29 = type23.getOpcode(1);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        boolean boolean31 = type2.equals((java.lang.Object) type23);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        int int35 = type33.getOpcode((int) ' ');
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("int", type33, typeArray38);
        org.mockito.asm.Type[] typeArray40 = signature39.getArgumentTypes();
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getBoxedType(type42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type42);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        java.lang.Class[] classArray48 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.getTypes(classArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray47, typeArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray40, typeArray49);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("L915517561", type23, typeArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "V" + "'", str3, "V");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "V" + "'", str24, "V");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "void" + "'", str27, "void");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(56, "(L;Lint;)V", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitVarInsn(126, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIincInsn(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter25);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter28);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor34 = classEmitter2.visitAnnotation("(Ljava/lang/L;)Lt;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean22 = type19.equals((java.lang.Object) type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray27);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor31 = classEmitter0.visitMethod(116, "(L;)L;", "L1913235182", "L1786680090", strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(L;)L;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "LL;;" + "'", str20, "LL;;");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "()B" + "'", str29, "()B");
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.Object obj10 = label7.info;
        java.lang.Object obj11 = null;
        label7.info = obj11;
        java.lang.String str13 = label7.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1317895631" + "'", str13, "L1317895631");
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("L2064135164");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitVarInsn(35, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.String str14 = label12.toString();
        java.lang.Object obj15 = label12.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.Object obj18 = label16.info;
        java.lang.String str19 = label16.toString();
        java.lang.Object obj20 = label16.info;
        label12.info = obj20;
        java.lang.String str22 = label12.toString();
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        label12.info = signature27;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.Object obj31 = label30.info;
        java.lang.Object obj32 = label30.info;
        java.lang.Object obj33 = label30.info;
        java.lang.Object obj34 = null;
        label30.info = obj34;
        java.lang.String str36 = label30.toString();
        java.lang.Object obj37 = label30.info;
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        java.lang.String str39 = label38.toString();
        java.lang.Object obj40 = label38.info;
        java.lang.String str41 = label38.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type43);
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local(11, type43);
        java.lang.Class<?> wildcardClass47 = local46.getClass();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass47);
        label38.info = type48;
        org.mockito.asm.Label label50 = new org.mockito.asm.Label();
        java.lang.Object obj51 = null;
        label50.info = obj51;
        java.lang.Object obj53 = label50.info;
        java.lang.Object obj54 = label50.info;
        org.mockito.asm.Label label55 = new org.mockito.asm.Label();
        java.lang.Object obj56 = label55.info;
        java.lang.String str57 = label55.toString();
        java.lang.Object obj58 = label55.info;
        org.mockito.asm.Label label59 = new org.mockito.asm.Label();
        java.lang.Object obj60 = label59.info;
        java.lang.Object obj61 = label59.info;
        java.lang.String str62 = label59.toString();
        java.lang.Object obj63 = label59.info;
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray65);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean68 = org.mockito.cglib.core.TypeUtils.isPrimitive(type67);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray66, type67);
        org.mockito.asm.Type type71 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray66, type71);
        org.mockito.asm.Type type73 = type71.getElementType();
        label59.info = type73;
        java.lang.String str75 = label59.toString();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local78 = new org.mockito.cglib.core.Local(100, type77);
        org.mockito.asm.Type type79 = local78.getType();
        java.lang.String str80 = type79.getClassName();
        java.lang.String str81 = type79.getClassName();
        label59.info = type79;
        org.mockito.asm.Type type85 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str86 = type85.getDescriptor();
        org.mockito.cglib.core.Local local87 = new org.mockito.cglib.core.Local((int) '4', type85);
        int int88 = local87.getIndex();
        org.mockito.asm.Type type89 = local87.getType();
        org.mockito.cglib.core.Local local90 = new org.mockito.cglib.core.Local(156, type89);
        int int91 = type89.getSize();
        label59.info = type89;
        org.mockito.asm.Label label93 = new org.mockito.asm.Label();
        java.lang.String str94 = label93.toString();
        java.lang.Object obj95 = label93.info;
        java.lang.Object obj96 = label93.info;
        org.mockito.asm.Label[] labelArray97 = new org.mockito.asm.Label[] { label30, label38, label50, label55, label59, label93 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter9.visitTableSwitchInsn((int) '4', (int) '4', label12, labelArray97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L554761575" + "'", str14, "L554761575");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L365424847" + "'", str19, "L365424847");
        org.junit.Assert.assertNull(obj20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L554761575" + "'", str22, "L554761575");
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(signature27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1910754504" + "'", str36, "L1910754504");
        org.junit.Assert.assertNull(obj37);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "L956228431" + "'", str39, "L956228431");
        org.junit.Assert.assertNull(obj40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "L956228431" + "'", str41, "L956228431");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "short" + "'", str44, "short");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "L505662194" + "'", str57, "L505662194");
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "L877138033" + "'", str62, "L877138033");
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(type73);
// flaky:         org.junit.Assert.assertEquals("'" + str75 + "' != '" + "L877138033" + "'", str75, "L877138033");
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "double" + "'", str80, "double");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "double" + "'", str81, "double");
        org.junit.Assert.assertNotNull(type85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "V" + "'", str86, "V");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 52 + "'", int88 == 52);
        org.junit.Assert.assertNotNull(type89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str94 + "' != '" + "L1528958908" + "'", str94, "L1528958908");
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertNotNull(labelArray97);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.String str12 = label9.toString();
        java.lang.Object obj13 = label9.info;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type17);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type21);
        org.mockito.asm.Type type23 = type21.getElementType();
        label9.info = type23;
        java.lang.String str25 = label9.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(100, type27);
        org.mockito.asm.Type type29 = local28.getType();
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        label9.info = type29;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) '4', type35);
        int int38 = local37.getIndex();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(156, type39);
        int int41 = type39.getSize();
        label9.info = type39;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLabel(label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L274670372" + "'", str12, "L274670372");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type23);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L274670372" + "'", str25, "L274670372");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "double" + "'", str30, "double");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "double" + "'", str31, "double");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "V" + "'", str36, "V");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs(14, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 153);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitVarInsn(102, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(100, type20);
        org.mockito.asm.Type type22 = local21.getType();
        org.mockito.asm.Type type23 = local21.getType();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray26);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray33);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray33, typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray37);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter10.begin_class(110, 129, "Lorg/mockito/asm/Type;", type23, typeArray37, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(signature28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(signature35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitTypeInsn(15, "org.mockito.cglib.core");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        java.lang.String str15 = label12.toString();
        java.lang.Object obj16 = label12.info;
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type20);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type24);
        org.mockito.asm.Type type26 = type24.getElementType();
        label12.info = type26;
        java.lang.String str28 = label12.toString();
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
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLocalVariable("L$3B", "L1092810277()LShort;", "$28$29B", label12, label29, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L741922343" + "'", str15, "L741922343");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type26);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L741922343" + "'", str28, "L741922343");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L728444372" + "'", str32, "L728444372");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type43);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "L728444372" + "'", str45, "L728444372");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "double" + "'", str50, "double");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "double" + "'", str51, "double");
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter13);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter16);
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor23 = classEmitter0.visitAnnotation("(Ljava/lang/L;)L;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classAdapter29);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        java.lang.String str37 = label36.toString();
        java.lang.Object obj38 = label36.info;
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.getTypes(classArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("short", type41, typeArray43);
        int int45 = type41.getSort();
        java.lang.String str46 = type41.toString();
        label36.info = type41;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((int) '4', type49);
        int int52 = local51.getIndex();
        org.mockito.asm.Type type53 = local51.getType();
        java.lang.Class<?> wildcardClass54 = type53.getClass();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.declare_field(108, "L692754600", type41, (java.lang.Object) type53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo27);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1633140510" + "'", str37, "L1633140510");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "L;" + "'", str46, "L;");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "V" + "'", str50, "V");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter14.visitSource("()V", "L;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.String str9 = label6.toString();
        java.lang.String str10 = label6.toString();
        java.lang.Object obj11 = label6.info;
        int[] intArray16 = new int[] { '4', 37, (byte) -1, 128 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLookupSwitchInsn(label6, intArray16, labelArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1873306771" + "'", str9, "L1873306771");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1873306771" + "'", str10, "L1873306771");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[52, 37, -1, 128]");
        org.junit.Assert.assertNotNull(labelArray17);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitMultiANewArrayInsn("java.lang.Void", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter14.visitAttribute(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) '4', type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        int int5 = type1.getSize();
        java.lang.String str6 = type1.getDescriptor();
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "V" + "'", str2, "V");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "void" + "'", str4, "void");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "V" + "'", str6, "V");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.String str11 = label8.toString();
        java.lang.Object obj12 = label8.info;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type20);
        org.mockito.asm.Type type22 = type20.getElementType();
        label8.info = type22;
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.Object obj25 = label24.info;
        java.lang.Object obj26 = label24.info;
        java.lang.Object obj27 = label24.info;
        java.lang.Object obj28 = label24.info;
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        label24.info = typeArray34;
        java.lang.String str36 = label24.toString();
        org.mockito.asm.Label label37 = new org.mockito.asm.Label();
        java.lang.Object obj38 = label37.info;
        java.lang.Object obj39 = label37.info;
        java.lang.Object obj40 = label37.info;
        java.lang.Object obj41 = null;
        label37.info = obj41;
        java.lang.String str43 = label37.toString();
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        java.lang.Object obj45 = label44.info;
        java.lang.Object obj46 = label44.info;
        java.lang.String str47 = label44.toString();
        java.lang.Object obj48 = label44.info;
        org.mockito.asm.Label label49 = new org.mockito.asm.Label();
        java.lang.Object obj50 = label49.info;
        java.lang.Object obj51 = label49.info;
        java.lang.String str52 = label49.toString();
        label49.info = ' ';
        java.lang.String str55 = label49.toString();
        org.mockito.asm.Label label56 = new org.mockito.asm.Label();
        java.lang.Object obj57 = label56.info;
        java.lang.Object obj58 = label56.info;
        java.lang.Object obj59 = label56.info;
        java.lang.Object obj60 = null;
        label56.info = obj60;
        org.mockito.asm.Label[] labelArray62 = new org.mockito.asm.Label[] { label24, label37, label44, label49, label56 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitTableSwitchInsn(129, (int) (short) 0, label8, labelArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L260723650" + "'", str11, "L260723650");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L180109872" + "'", str36, "L180109872");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L1583976673" + "'", str43, "L1583976673");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "L1242355649" + "'", str47, "L1242355649");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "L398825729" + "'", str52, "L398825729");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "L398825729" + "'", str55, "L398825729");
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(labelArray62);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFieldInsn(128, "L1011045012", "L1913235182", "LL$3B$3B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        java.lang.Object obj14 = label10.info;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type22);
        org.mockito.asm.Type type24 = type22.getElementType();
        label10.info = type24;
        java.lang.String str26 = label10.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(100, type28);
        org.mockito.asm.Type type30 = local29.getType();
        java.lang.String str31 = type30.getClassName();
        java.lang.String str32 = type30.getClassName();
        label10.info = type30;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLineNumber((int) (byte) -1, label10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L2113315785" + "'", str13, "L2113315785");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type24);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L2113315785" + "'", str26, "L2113315785");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "double" + "'", str31, "double");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "double" + "'", str32, "double");
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(133, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("()B");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int4 = type1.getOpcode((int) (byte) 1);
        java.lang.String str5 = type1.getInternalName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "()B" + "'", str5, "()B");
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(129, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean23 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type22);
        int int25 = type22.getSort();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor26 = classEmitter14.visitField(154, "L1325724854org.mockito.cglib.core.Signature", "()B", "L$3B", (java.lang.Object) int25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(102);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIntInsn((int) (short) 10, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter16.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter16.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo18);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitVarInsn(1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor6);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(56, "(L;Lint;)V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter13 = new org.mockito.cglib.core.LocalVariablesSorter(110, "LV;", (org.mockito.asm.MethodVisitor) localVariablesSorter12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn(14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(133);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter12 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter11);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        org.mockito.asm.Type type16 = signature15.getReturnType();
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        boolean boolean20 = type17.equals((java.lang.Object) label18);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter12.visitLabel(label18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(signature15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.String str9 = label6.toString();
        label6.info = ' ';
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        java.lang.String str14 = type12.getClassName();
        label6.info = type12;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(154, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L482512972" + "'", str9, "L482512972");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "int" + "'", str13, "int");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "int" + "'", str14, "int");
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitIincInsn(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter13);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter16);
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        java.lang.Class<?> wildcardClass34 = typeArray33.getClass();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        java.lang.Class<?> wildcardClass40 = typeArray39.getClass();
        java.lang.String str41 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray42 = new java.lang.Class[] { wildcardClass34, wildcardClass40 };
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.getTypes(classArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray43);
        org.mockito.cglib.core.Signature signature45 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray43);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor46 = classEmitter0.visitField(32, "L918576025", "()Ljava/lang/IL1202418377;", "(L;Lint;L;D)Ljava/lang/Short;", (java.lang.Object) typeArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str41, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(signature45);
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter5.visitParameterAnnotation((-1), "(L;D)Lt;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitVarInsn((int) (short) 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = classEmitter10.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        int int2 = type1.getSize();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitTypeInsn(7, "org.mockito.asm.Type[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitFieldInsn(133, "", "", "L1774861680");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = classAdapter10.visitAnnotation("()B", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLabel(label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.String str10 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("L1092810277", "java/lang/Short", "V", label5, label8, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1279087940" + "'", str6, "L1279087940");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L291661786" + "'", str10, "L291661786");
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("V");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray5, type7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("L(L;", type1, typeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'L(L;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "V" + "'", str9, "V");
        org.junit.Assert.assertNotNull(typeArray10);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(155);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLdcInsn((java.lang.Object) classInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("", "L680990058");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        java.lang.String[] strArray22 = new java.lang.String[] { "L2078249401" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor23 = classAdapter16.visitMethod(124, "(L;D)V", "[Lorg/mockito/asm/Type;", "(L;)L;", strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(L;D)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("L141422918");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("<init>()V");
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(1, type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(158, type6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L<init>()V; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitIntInsn(2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter7.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1497bf54");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        java.lang.String str14 = label11.toString();
        java.lang.String str15 = label11.toString();
        java.lang.String str16 = label11.toString();
        java.lang.Object obj17 = label11.info;
        java.lang.String str18 = label11.toString();
        java.lang.Object obj19 = label11.info;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.String str22 = label20.toString();
        java.lang.Object obj23 = label20.info;
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.Object obj25 = label24.info;
        java.lang.Object obj26 = label24.info;
        java.lang.String str27 = label24.toString();
        java.lang.Object obj28 = label24.info;
        label20.info = obj28;
        java.lang.String str30 = label20.toString();
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray34);
        org.mockito.asm.Type[] typeArray36 = signature35.getArgumentTypes();
        label20.info = signature35;
        org.mockito.asm.Label[] labelArray38 = new org.mockito.asm.Label[] { label11, label20 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitTableSwitchInsn(56, (int) (byte) 1, label9, labelArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1950657018" + "'", str14, "L1950657018");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1950657018" + "'", str15, "L1950657018");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1950657018" + "'", str16, "L1950657018");
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1950657018" + "'", str18, "L1950657018");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1456369886" + "'", str22, "L1456369886");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L1207917046" + "'", str27, "L1207917046");
        org.junit.Assert.assertNull(obj28);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1456369886" + "'", str30, "L1456369886");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(signature35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(labelArray38);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.String str12 = label9.toString();
        java.lang.String str13 = label9.toString();
        java.lang.Object obj14 = label9.info;
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("short", type17, typeArray19);
        java.lang.String str21 = signature20.getName();
        label9.info = str21;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        java.lang.Object obj25 = label23.info;
        java.lang.Object obj26 = label23.info;
        java.lang.Object obj27 = label23.info;
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        label23.info = typeArray33;
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        java.lang.Object obj36 = label35.info;
        java.lang.Object obj37 = label35.info;
        java.lang.String str38 = label35.toString();
        org.mockito.asm.Label label39 = new org.mockito.asm.Label();
        java.lang.Object obj40 = label39.info;
        java.lang.String str41 = label39.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type42);
        label39.info = type42;
        label35.info = type42;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitTryCatchBlock(label9, label23, label35, "L1587696640");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L921859352" + "'", str12, "L921859352");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L921859352" + "'", str13, "L921859352");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "short" + "'", str21, "short");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L278304781" + "'", str38, "L278304781");
        org.junit.Assert.assertNull(obj40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "L27161350" + "'", str41, "L27161350");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "short" + "'", str43, "short");
        org.junit.Assert.assertNotNull(type44);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.String str15 = label14.toString();
        java.lang.Object obj16 = label14.info;
        java.lang.String str17 = label14.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(11, type19);
        java.lang.Class<?> wildcardClass23 = local22.getClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        label14.info = type24;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.Object obj27 = label26.info;
        java.lang.Object obj28 = label26.info;
        java.lang.String str29 = label26.toString();
        java.lang.Object obj30 = label26.info;
        java.lang.String str31 = label26.toString();
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        java.lang.String str33 = label32.toString();
        java.lang.Object obj34 = label32.info;
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        java.lang.Object obj36 = label35.info;
        java.lang.Object obj37 = label35.info;
        java.lang.String str38 = label35.toString();
        label35.info = ' ';
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str42 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type41);
        java.lang.String str43 = type41.getClassName();
        label35.info = type41;
        org.mockito.asm.Label label45 = new org.mockito.asm.Label();
        java.lang.Object obj46 = null;
        label45.info = obj46;
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] { label26, label32, label35, label45 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitTableSwitchInsn(42, 42, label14, labelArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L407499929" + "'", str15, "L407499929");
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L407499929" + "'", str17, "L407499929");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "short" + "'", str20, "short");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L662386213" + "'", str29, "L662386213");
        org.junit.Assert.assertNull(obj30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L662386213" + "'", str31, "L662386213");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L1499141144" + "'", str33, "L1499141144");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L1259825918" + "'", str38, "L1259825918");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "int" + "'", str42, "int");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "int" + "'", str43, "int");
        org.junit.Assert.assertNotNull(labelArray48);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.String str13 = label11.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        label11.info = type14;
        label7.info = type14;
        java.lang.Object obj19 = label7.info;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.Object obj22 = label20.info;
        java.lang.Object obj23 = label20.info;
        java.lang.Object obj24 = label20.info;
        java.lang.Object obj25 = label20.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLocalVariable("()L;", "byte(D)S", "()L;", label7, label20, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1317958904" + "'", str10, "L1317958904");
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L2034611231" + "'", str13, "L2034611231");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "short" + "'", str15, "short");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "S");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        int int18 = type16.getOpcode((int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type16, typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor24 = classEmitter1.visitMethod(132, "boolean", "(L;Lint;L;D)D", "va.lang", strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@674c89ac");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        java.lang.Object[] objArray10 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitFrame((int) (byte) 100, 155, objArray10, 132, (java.lang.Object[]) typeArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(L;)Z" + "'", str19, "(L;)Z");
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        java.lang.String str12 = type10.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(100, type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        boolean boolean21 = type10.equals((java.lang.Object) signature20);
        org.mockito.asm.Type type22 = signature20.getReturnType();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 154);
        int int26 = type23.getSize();
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray29);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.cglib.core.Signature signature33 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
        java.lang.Class[] classArray34 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter38 = classEmitter7.begin_method((-1), signature20, typeArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@d603dab");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "int" + "'", str11, "int");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "I" + "'", str12, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "double" + "'", str18, "double");
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(signature20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(L;)Z" + "'", str30, "(L;)Z");
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(signature33);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIntInsn(108, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("()B");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLdcInsn((java.lang.Object) type10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.String str12 = label9.toString();
        java.lang.Object obj13 = label9.info;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type17);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type21);
        org.mockito.asm.Type type23 = type21.getElementType();
        label9.info = type23;
        java.lang.String str25 = label9.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(100, type27);
        org.mockito.asm.Type type29 = local28.getType();
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        label9.info = type29;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) '4', type35);
        int int38 = local37.getIndex();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(156, type39);
        int int41 = type39.getSize();
        label9.info = type39;
        org.mockito.asm.Label label43 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("S", "()L;", "java.lang", label9, label43, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 158");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1515188310" + "'", str12, "L1515188310");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type23);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L1515188310" + "'", str25, "L1515188310");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "double" + "'", str30, "double");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "double" + "'", str31, "double");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "V" + "'", str36, "V");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter2.visitMethod(104, "L141422918", "(Ljava/lang/L;)L;", "L2064135164", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@40d864a9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitMultiANewArrayInsn("", 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLdcInsn(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn(14, "L1011045012");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getPackageName(type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray20);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        java.lang.String str25 = label23.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type26);
        label23.info = type26;
        boolean boolean30 = signature21.equals((java.lang.Object) label23);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.cglib.core.Signature signature33 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
        java.lang.Class[] classArray34 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray35);
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray39);
        boolean boolean41 = signature21.equals((java.lang.Object) typeArray39);
        java.lang.Object[] objArray43 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitFrame(154, 124, (java.lang.Object[]) typeArray39, (int) 'a', objArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang" + "'", str14, "java.lang");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(signature17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L235931895" + "'", str25, "L235931895");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "short" + "'", str27, "short");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(signature33);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitFieldInsn(6, "java.lang.Void", "(L;)I", "(S)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
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
        java.lang.String str14 = signature12.getName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitMultiANewArrayInsn("java/lang/Short", 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitMultiANewArrayInsn("L2064135164", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitOuterClass("(L;D)V", "L1799275916", "L457880368");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = localVariablesSorter5.visitParameterAnnotation(16, "java.lang", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        java.lang.Object obj14 = label11.info;
        java.lang.Object obj15 = label11.info;
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        label11.info = typeArray21;
        label11.info = "S";
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.Object obj26 = label25.info;
        java.lang.String str27 = label25.toString();
        java.lang.String str28 = label25.toString();
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
        org.mockito.asm.Label label53 = new org.mockito.asm.Label();
        java.lang.String str54 = label53.toString();
        java.lang.Object obj55 = label53.info;
        org.mockito.asm.Label[] labelArray56 = new org.mockito.asm.Label[] { label25, label29, label53 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitTableSwitchInsn(35, (int) (short) -1, label11, labelArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNull(obj26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L876850337" + "'", str27, "L876850337");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L876850337" + "'", str28, "L876850337");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L1530642608" + "'", str32, "L1530642608");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type43);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "L1530642608" + "'", str45, "L1530642608");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "double" + "'", str50, "double");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "double" + "'", str51, "double");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "L996871034" + "'", str54, "L996871034");
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(labelArray56);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        java.lang.String str17 = label14.toString();
        label14.info = ' ';
        java.lang.String str20 = label14.toString();
        java.lang.Object obj21 = label14.info;
        java.lang.Object obj22 = label14.info;
        java.lang.Object obj23 = label14.info;
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.Object obj25 = null;
        label24.info = obj25;
        java.lang.Object obj27 = label24.info;
        java.lang.Object obj28 = label24.info;
        java.lang.String str29 = label24.toString();
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.Object obj31 = label30.info;
        java.lang.Object obj32 = label30.info;
        java.lang.String str33 = label30.toString();
        java.lang.String str34 = label30.toString();
        java.lang.String str35 = label30.toString();
        java.lang.Object obj36 = label30.info;
        java.lang.String str37 = label30.toString();
        java.lang.Object obj38 = label30.info;
        org.mockito.asm.Label label39 = new org.mockito.asm.Label();
        java.lang.Object obj40 = label39.info;
        org.mockito.asm.Label[] labelArray41 = new org.mockito.asm.Label[] { label24, label30, label39 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitTableSwitchInsn(133, 3, label14, labelArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L198074194" + "'", str17, "L198074194");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L198074194" + "'", str20, "L198074194");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + ' ' + "'", obj22, ' ');
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + ' ' + "'", obj23, ' ');
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1976317574" + "'", str29, "L1976317574");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L630458775" + "'", str33, "L630458775");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L630458775" + "'", str34, "L630458775");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L630458775" + "'", str35, "L630458775");
        org.junit.Assert.assertNull(obj36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L630458775" + "'", str37, "L630458775");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(labelArray41);
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitMultiANewArrayInsn("L851034773", 102);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(114);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        boolean boolean16 = type9.equals((java.lang.Object) strArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor17 = classEmitter1.visitField(102, "", "L1461338839", "t", (java.lang.Object) type9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "V" + "'", str10, "V");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "void" + "'", str13, "void");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMethodInsn(5, "L897927500", "L245395834", "org.mockito.asm.Type[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classAdapter29);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor36 = classEmitter20.visitAnnotation("L;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo27);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter25);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter28);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray38 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("short", type37, typeArray39);
        java.lang.String str41 = org.mockito.cglib.core.TypeUtils.getClassName(type37);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str45 = type44.toString();
        java.lang.String str46 = type44.toString();
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray48, type51);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("L;", type44, typeArray52);
        java.lang.String str54 = signature53.getName();
        java.lang.String str55 = signature53.getDescriptor();
        org.mockito.asm.Type[] typeArray56 = signature53.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter30.declare_field((int) (byte) 0, "L1011045012", type37, (java.lang.Object) typeArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "L;" + "'", str45, "L;");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "L;" + "'", str46, "L;");
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "L;" + "'", str54, "L;");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(Ljava/lang/L;LV;)L;" + "'", str55, "(Ljava/lang/L;LV;)L;");
        org.junit.Assert.assertNotNull(typeArray56);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter17.visitInnerClass("L897927500", "L$3B", "L181410580", 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor15 = localVariablesSorter9.visitParameterAnnotation(0, "L1786680090", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(106);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = methodAdapter3.visitParameterAnnotation(126, "L1331900336", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMethodInsn((int) (byte) 0, "L1621336944", "L746726514", "L680990058");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Object obj7 = label5.info;
        java.lang.String str8 = label5.toString();
        java.lang.Object obj9 = label5.info;
        java.lang.String str10 = label5.toString();
        java.lang.Object obj11 = label5.info;
        int[] intArray17 = new int[] { 52, 102, 116, 108, 1 };
        org.mockito.asm.Label[] labelArray18 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLookupSwitchInsn(label5, intArray17, labelArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L350509282" + "'", str8, "L350509282");
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L350509282" + "'", str10, "L350509282");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 102, 116, 108, 1]");
        org.junit.Assert.assertNotNull(labelArray18);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(0, "<init>()V", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitInsn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.mockito.asm.Type type13 = signature12.getReturnType();
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type13);
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        boolean boolean17 = type14.equals((java.lang.Object) label15);
        java.lang.Object obj18 = label15.info;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.Object obj21 = label19.info;
        java.lang.Object obj22 = label19.info;
        java.lang.Object obj23 = null;
        label19.info = obj23;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLocalVariable("L1852500780", "L1340227649", "(Ljava/lang/Short;)D", label15, label19, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 156");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.String str16 = label14.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        label14.info = type17;
        label10.info = type17;
        java.lang.Object obj22 = label10.info;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        java.lang.Object obj25 = label23.info;
        java.lang.String str26 = label23.toString();
        java.lang.Object obj27 = label23.info;
        java.lang.String str28 = label23.toString();
        java.lang.Object obj29 = label23.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitLocalVariable("L2017536669", "()V", "S", label10, label23, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 116");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1834546749" + "'", str13, "L1834546749");
        org.junit.Assert.assertNull(obj15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1586398980" + "'", str16, "L1586398980");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "short" + "'", str18, "short");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "S");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L210641968" + "'", str26, "L210641968");
        org.junit.Assert.assertNull(obj27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L210641968" + "'", str28, "L210641968");
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("(Ljava/lang/L;)L;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMaxs(1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFieldInsn(4, "L1799275916", "L1010211844", "L2061722705");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter5.visitParameterAnnotation(106, "hi!()Ljava/lang/Short;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("Hi!", "I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.getTypes(classArray7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray4);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        java.lang.String str12 = type1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LShort; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "()LShort;" + "'", str11, "()LShort;");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LShort;" + "'", str12, "LShort;");
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitMultiANewArrayInsn("L245395834", 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L1768459599");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1768459599" + "'", str1, "L1768459599");
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str3 = type2.toString();
        java.lang.String str4 = type2.toString();
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("L;", type2, typeArray10);
        java.lang.String str12 = signature11.getName();
        java.lang.String str13 = signature11.getName();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L;" + "'", str3, "L;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L;" + "'", str4, "L;");
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L;" + "'", str12, "L;");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L;" + "'", str13, "L;");
    }
}
