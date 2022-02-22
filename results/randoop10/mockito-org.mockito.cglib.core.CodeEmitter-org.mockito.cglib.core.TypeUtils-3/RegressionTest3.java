import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitMaxs((int) (byte) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
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
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter2.visitAnnotation("int", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
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
            classEmitter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitMaxs((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn((int) ' ', "D", "L2017536669", "()L;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = methodAdapter3.visitAnnotation("L;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        label7.info = ' ';
        java.lang.String str13 = label7.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getPackageName(type16);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray18);
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray23);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.Object obj27 = label26.info;
        java.lang.String str28 = label26.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type29);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type29);
        label26.info = type29;
        boolean boolean33 = signature24.equals((java.lang.Object) label26);
        org.mockito.asm.Label label34 = new org.mockito.asm.Label();
        java.lang.Object obj35 = label34.info;
        java.lang.Object obj36 = label34.info;
        java.lang.String str37 = label34.toString();
        java.lang.Object obj38 = label34.info;
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean43 = org.mockito.cglib.core.TypeUtils.isPrimitive(type42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type42);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type46);
        org.mockito.asm.Type type48 = type46.getElementType();
        label34.info = type48;
        java.lang.String str50 = label34.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label7, label26, label34, "(L;)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L445448274" + "'", str10, "L445448274");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L445448274" + "'", str13, "L445448274");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang" + "'", str17, "java.lang");
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(signature20);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNull(obj27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1951650875" + "'", str28, "L1951650875");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "short" + "'", str30, "short");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1067966778" + "'", str37, "L1067966778");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type48);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "L1067966778" + "'", str50, "L1067966778");
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) '4', type2);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type V is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "V" + "'", str3, "V");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "void" + "'", str5, "void");
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
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
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class[] classArray24 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray21);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray27);
        java.lang.String str29 = type18.toString();
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
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class((int) '4', 96, "L692754600", type18, typeArray45, "LL;;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(signature23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "()LShort;" + "'", str28, "()LShort;");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "LShort;" + "'", str29, "LShort;");
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
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
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
            classEmitter2.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
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
            classEmitter2.visitInnerClass("L1092810277", "L851034773", "L205843408", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn((int) (byte) -1, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
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
        java.lang.String str15 = label12.toString();
        label12.info = ' ';
        java.lang.Object obj18 = label12.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitJumpInsn(8, label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L189097068" + "'", str15, "L189097068");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + ' ' + "'", obj18, ' ');
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 158);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.String str9 = label6.toString();
        label6.info = ' ';
        java.lang.Object obj12 = label6.info;
        int[] intArray17 = new int[] { (-1), 13, 5, 10 };
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.Object obj20 = label18.info;
        java.lang.Object obj21 = label18.info;
        java.lang.Object obj22 = label18.info;
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        label18.info = typeArray28;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.Object obj31 = label30.info;
        java.lang.Object obj32 = label30.info;
        java.lang.String str33 = label30.toString();
        java.lang.Object obj34 = label30.info;
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        java.lang.Object obj36 = label35.info;
        java.lang.Object obj37 = label35.info;
        java.lang.String str38 = label35.toString();
        java.lang.String str39 = label35.toString();
        java.lang.Object obj40 = label35.info;
        org.mockito.asm.Label label41 = new org.mockito.asm.Label();
        java.lang.Object obj42 = label41.info;
        java.lang.Object obj43 = label41.info;
        java.lang.Object obj44 = label41.info;
        java.lang.Object obj45 = label41.info;
        org.mockito.asm.Label label46 = new org.mockito.asm.Label();
        java.lang.Object obj47 = label46.info;
        java.lang.String str48 = label46.toString();
        java.lang.Object obj49 = label46.info;
        org.mockito.asm.Label label50 = new org.mockito.asm.Label();
        java.lang.Object obj51 = label50.info;
        java.lang.Object obj52 = label50.info;
        java.lang.String str53 = label50.toString();
        java.lang.Object obj54 = label50.info;
        label46.info = obj54;
        org.mockito.asm.Label[] labelArray56 = new org.mockito.asm.Label[] { label18, label30, label35, label41, label46 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label6, intArray17, labelArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L2042947797" + "'", str9, "L2042947797");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 13, 5, 10]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L1481029904" + "'", str33, "L1481029904");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L1565466046" + "'", str38, "L1565466046");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "L1565466046" + "'", str39, "L1565466046");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "L1107581400" + "'", str48, "L1107581400");
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "L475566861" + "'", str53, "L475566861");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(labelArray56);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitVarInsn((int) (byte) 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitInsn(157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitIincInsn(16, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        label10.info = ' ';
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = type16.getClassName();
        label10.info = type16;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitJumpInsn(130, label10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L480046278" + "'", str13, "L480046278");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "int" + "'", str17, "int");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "int" + "'", str18, "int");
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = methodAdapter7.visitParameterAnnotation(157, "IL1202418377", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
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
            org.mockito.asm.AnnotationVisitor annotationVisitor15 = localVariablesSorter11.visitParameterAnnotation(32, "LL;;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
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
            localVariablesSorter11.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.String str13 = label11.toString();
        java.lang.Object obj14 = label11.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.Object obj17 = label15.info;
        java.lang.String str18 = label15.toString();
        java.lang.Object obj19 = label15.info;
        label11.info = obj19;
        java.lang.String str21 = label11.toString();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.Object obj24 = label22.info;
        java.lang.String str25 = label22.toString();
        label22.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitTryCatchBlock(label7, label11, label22, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L456737236" + "'", str9, "L456737236");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L456737236" + "'", str10, "L456737236");
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L116411037" + "'", str13, "L116411037");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L875032194" + "'", str18, "L875032194");
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L116411037" + "'", str21, "L116411037");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L1503069058" + "'", str25, "L1503069058");
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter4.visitAnnotation("L1325724854", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFieldInsn((int) (byte) 1, "hi!", "L1092810277", "Double");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitIntInsn((int) (byte) 0, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMaxs(9, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter8.visitAnnotation("L692754600", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(112);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.Object obj10 = label7.info;
        java.lang.Object obj11 = null;
        label7.info = obj11;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(0, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitInsn(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitMaxs(56, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTypeInsn((int) (short) 0, "java$2Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn((int) (short) 10, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
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
            org.mockito.cglib.core.CodeEmitter codeEmitter21 = classEmitter0.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str8 = type7.toString();
        int int10 = type7.getOpcode(8);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        java.lang.String str12 = type11.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) type11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L;" + "'", str8, "L;");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L;" + "'", str12, "L;");
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitVarInsn(155, 129);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
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
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter2.visitAnnotation("org.mockito.cglib.core", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = null;
        label6.info = obj7;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
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
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str17 = signature16.getDescriptor();
        java.lang.String str18 = signature16.toString();
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter22 = classEmitter2.begin_method(35, signature16, typeArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4c074f6f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("<init>()V");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
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
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter29.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classAdapter32);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter23.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo30);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.getTypes(classArray3);
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("short", type2, typeArray4);
        int int6 = type2.getSort();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = type2.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
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
            classEmitter2.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn((int) '4', "(L;D)Lt;", "L$3B", "L1403562481");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitVarInsn(52, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        int int19 = type17.getOpcode((int) ' ');
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("int", type17, typeArray22);
        org.mockito.asm.Type[] typeArray24 = signature23.getArgumentTypes();
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray14);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(100, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isPrimitive(type33);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(9, type33);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type33);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean43 = org.mockito.cglib.core.TypeUtils.isPrimitive(type42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type42);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type46);
        org.mockito.asm.Type type48 = type46.getElementType();
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean53 = org.mockito.cglib.core.TypeUtils.isPrimitive(type52);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray51, type52);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray54);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLdcInsn((java.lang.Object) typeArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "V" + "'", str34, "V");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(L;D)Lt;" + "'", str55, "(L;D)Lt;");
        org.junit.Assert.assertNotNull(typeArray56);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitTypeInsn(16, "L1813600832");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitInsn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
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
            classEmitter1.visitInnerClass("org.mockito.cglib.core", "<init>()V", "L1034763014", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitIntInsn((int) '4', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type9);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(11, type9);
        java.lang.String str13 = type9.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor14 = classEmitter2.visitField(128, "L2029575687", "Short", "(Ljava/lang/Short;)D", (java.lang.Object) type9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short" + "'", str10, "short");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "short" + "'", str13, "short");
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(128, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFieldInsn(13, "L851034773", "Lorg/mockito/cglib/core/Signature;", "B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("L$3B");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = null;
        label9.info = obj10;
        java.lang.Object obj12 = label9.info;
        java.lang.Object obj13 = label9.info;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        java.lang.String str17 = label14.toString();
        label14.info = ' ';
        java.lang.Object obj20 = label14.info;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        java.lang.Object obj23 = label21.info;
        java.lang.Object obj24 = label21.info;
        java.lang.Object obj25 = null;
        label21.info = obj25;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitTryCatchBlock(label9, label14, label21, "L897927500");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1950140576" + "'", str17, "L1950140576");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + ' ' + "'", obj20, ' ');
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = null;
        label6.info = obj7;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getPackageName(type11);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        java.lang.String str23 = label21.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type24);
        label21.info = type24;
        boolean boolean28 = signature19.equals((java.lang.Object) label21);
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.Object obj30 = label29.info;
        java.lang.Object obj31 = label29.info;
        java.lang.String str32 = label29.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label6, label21, label29, "L1109657447");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang" + "'", str12, "java.lang");
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(signature15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNull(obj22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1013261263" + "'", str23, "L1013261263");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "short" + "'", str25, "short");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L1058827192" + "'", str32, "L1058827192");
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitMaxs((int) (byte) 1, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type13);
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isArray(type13);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        boolean boolean20 = type13.equals((java.lang.Object) strArray19);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit(157, 112, "L115210646", "L1092810277", "(V)S", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "V" + "'", str14, "V");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "void" + "'", str17, "void");
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(14, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitTypeInsn(14, "L1852500780");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter4.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTypeInsn((int) (short) 1, "L245395834");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTypeInsn((int) (short) -1, "I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.Object obj12 = label9.info;
        java.lang.Object obj13 = label9.info;
        java.lang.Object obj14 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitJumpInsn(52, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("java$2Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
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
            classEmitter30.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
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
            classEmitter2.visitInnerClass("(L;)D", "()V", "java$2Elang", 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter4.visit(9, 0, "L1799275916", "Lorg/mockito/asm/Type;", "(L;)Z", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type19);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor25 = classEmitter7.visitField(157, "L851034773", "(L;Lint;)V", "org.mockito.cglib.core", (java.lang.Object) typeArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "short" + "'", str20, "short");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(V)S" + "'", str23, "(V)S");
        org.junit.Assert.assertNotNull(typeArray24);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L1908549724");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1908549724" + "'", str1, "L1908549724");
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(108, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter5.visitParameterAnnotation((int) '4', "L245395834", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) '4', type2);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        org.mockito.asm.Type type7 = local6.getType();
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1799275916");
        org.mockito.asm.Type[] typeArray10 = signature9.getArgumentTypes();
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        int int12 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray10);
        boolean boolean13 = type7.equals((java.lang.Object) int12);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "V" + "'", str3, "V");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "void" + "'", str5, "void");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(signature9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(signature11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMaxs(5, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("void", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitAttribute(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        int[] intArray16 = new int[] { ' ', 14, 124 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLookupSwitchInsn(label11, intArray16, labelArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 14, 124]");
        org.junit.Assert.assertNotNull(labelArray17);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMultiANewArrayInsn("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(126);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitIincInsn(132, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label7 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(112, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = methodAdapter5.visitParameterAnnotation(7, "B", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
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
            localVariablesSorter11.visitIincInsn(116, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter2.visitField(0, "B", "Void", "L915517561", (java.lang.Object) type22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L915700116" + "'", str11, "L915700116");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type22);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        java.lang.String str14 = label10.toString();
        java.lang.Object obj15 = label10.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitLineNumber(0, label10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1762554496" + "'", str13, "L1762554496");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1762554496" + "'", str14, "L1762554496");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = methodAdapter6.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(100, type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        int int21 = type19.getOpcode((int) ' ');
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("int", type19, typeArray24);
        org.mockito.asm.Type[] typeArray26 = signature25.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitFrame(104, 2, (java.lang.Object[]) typeArray15, 42, (java.lang.Object[]) typeArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "double" + "'", str14, "double");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(signature16);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitMultiANewArrayInsn("Short", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter20);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classAdapter23);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter23);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor27 = classEmitter1.visitField(6, "java.lang", "L1908549724", "LShort;", (java.lang.Object) classAdapter23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str6 = type1.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL;;" + "'", str2, "LL;;");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L;" + "'", str5, "L;");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L;" + "'", str6, "L;");
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitIntInsn(128, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
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
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        int int39 = type37.getOpcode((int) ' ');
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("int", type37, typeArray42);
        org.mockito.asm.Type[] typeArray44 = signature43.getArgumentTypes();
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.getBoxedType(type46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray44, type46);
        int int49 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray44);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray34, typeArray44);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray52);
        java.lang.Class[] classArray54 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray53, typeArray55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray50, typeArray56);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang");
        java.lang.String str60 = org.mockito.cglib.core.TypeUtils.getClassName(type59);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type59);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type59);
        int int64 = type59.getOpcode(1);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) int64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "short" + "'", str32, "short");
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(V)S" + "'", str35, "(V)S");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "java.lang" + "'", str60, "java.lang");
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 5 + "'", int64 == 5);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitMultiANewArrayInsn("int(L;)I", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
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
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLocalVariable("Lorg/mockito/asm/Type;", "byte", "L245395834", label10, label12, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 96");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L868702981" + "'", str15, "L868702981");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type26);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("L1619152913");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
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
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = classEmitter7.visitAnnotation("L115210646", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("L2029575687");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(104);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitIincInsn(96, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
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
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        int int18 = type16.getOpcode((int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type16, typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor24 = classEmitter8.visitMethod((int) (byte) -1, "L115210646", "L2021451540", "java.lang.L179248870", strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@60e02c74");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitMaxs(42, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitInsn(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitVarInsn(126, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
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
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("short", type7, typeArray9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("short", type13, typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray15);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray9);
        org.mockito.asm.Type[] typeArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "()V" + "'", str3, "()V");
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = methodAdapter5.visitAnnotation("L2029575687", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = methodAdapter7.visitParameterAnnotation((int) (byte) 1, "short", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter1.visitMethod(156, "int(L;)I", "Lint;", "L692754600", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'int(L;)I' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitIincInsn((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
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
            localVariablesSorter9.visitFieldInsn(4, "(L;Lint;L;D)Ljava/lang/Short;", "(V)S", "hi!()Ljava/lang/Short;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
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
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type25);
        int int28 = type25.getSize();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("LV;", type25, typeArray29);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter18.visit(13, 100, "Z", "Int", "(Ljava/lang/L;LV;)L;", strArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "short" + "'", str26, "short");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitIincInsn(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
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
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(124, 5, "", "IL1202418377", "", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1753482746" + "'", str9, "L1753482746");
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
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
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(8, 112, "", "hi!()Ljava/lang/Short;", "<init>()V", strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitIntInsn(0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = null;
        label0.info = obj1;
        java.lang.Object obj3 = label0.info;
        java.lang.Object obj4 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
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
        java.lang.String str13 = label9.toString();
        java.lang.Object obj14 = label9.info;
        int[] intArray19 = new int[] { '#', 157, 9, 154 };
        org.mockito.asm.Label[] labelArray20 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLookupSwitchInsn(label9, intArray19, labelArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1269073072" + "'", str12, "L1269073072");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1269073072" + "'", str13, "L1269073072");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 157, 9, 154]");
        org.junit.Assert.assertNotNull(labelArray20);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor14 = classEmitter5.visitField(8, "Double", "", "Double", (java.lang.Object) classEmitter11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor26 = classEmitter17.visitField(0, "Short", "L;", "Lorg/mockito/cglib/core/Signature;", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
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
            classEmitter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
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
            org.mockito.asm.AnnotationVisitor annotationVisitor14 = methodAdapter11.visitAnnotation("L<init>()V;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitMultiANewArrayInsn("(L;)S", 42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getPackageName(type7);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", type7, typeArray14);
        org.mockito.asm.Type type16 = signature15.getReturnType();
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        int int26 = type24.getOpcode((int) ' ');
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("int", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray21);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(100, type35);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type35);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type35);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        boolean boolean42 = org.mockito.cglib.core.TypeUtils.isPrimitive(type40);
        boolean boolean43 = org.mockito.cglib.core.TypeUtils.isArray(type40);
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(9, type40);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray38, type40);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("byte", type17, typeArray38);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("L2029575687", type2, typeArray38);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type48 = type2.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LL;;" + "'", str3, "LL;;");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(signature11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "V" + "'", str41, "V");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(typeArray45);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
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
            classEmitter5.visitAttribute(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
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
        java.lang.Object obj14 = label12.info;
        java.lang.String str15 = label12.toString();
        java.lang.String str16 = label12.toString();
        java.lang.String str17 = label12.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLabel(label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L566538418" + "'", str15, "L566538418");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L566538418" + "'", str16, "L566538418");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L566538418" + "'", str17, "L566538418");
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
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
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = localVariablesSorter9.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("int(L;)I", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitInsn(108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter5.visitMethod(60, "Int", "L1325724854", "D", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5ed129da");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("org.mockito.cglib.core");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org$2Emockito$2Ecglib$2Ecore" + "'", str1, "org$2Emockito$2Ecglib$2Ecore");
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitVarInsn(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
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
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType("Short");
        int int17 = type16.getSize();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor18 = classEmitter9.visitField((int) (short) 0, "L1943638160", "L$243B", "(L;)D", (java.lang.Object) int17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(11, type12);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean21 = type18.equals((java.lang.Object) type20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray27);
        int int29 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray27);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.begin_class(0, 6, "L1384125117", type12, typeArray27, "(L;)I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "short" + "'", str13, "short");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "short" + "'", str16, "short");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LL;;" + "'", str19, "LL;;");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(signature24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "()B" + "'", str28, "()B");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMultiANewArrayInsn("L40020120", 102);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter1.visitField(35, "Ljava/lang/Short;", "boolean", "(L;Lint;L;D)Ljava/lang/Short;", (java.lang.Object) typeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(128);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1799275916");
        org.mockito.asm.Type[] typeArray7 = signature6.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) typeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(typeArray7);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter8.visitMethod((int) (short) 100, "D", "L130113989", "org/mockito/cglib/core/Signature", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3c05793f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit(158, 4, "L1384125117", "java/lang/Short", "boolean", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getPackageName(type11);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        java.lang.String str23 = label21.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type24);
        label21.info = type24;
        boolean boolean28 = signature19.equals((java.lang.Object) label21);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        java.lang.Class[] classArray32 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray33);
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray34, typeArray37);
        boolean boolean39 = signature19.equals((java.lang.Object) typeArray37);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray45 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        int int49 = type47.getOpcode((int) ' ');
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray51);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("int", type47, typeArray52);
        org.mockito.asm.Type[] typeArray54 = signature53.getArgumentTypes();
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray44, typeArray54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray43, typeArray44);
        org.mockito.cglib.core.Signature signature57 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        boolean boolean60 = org.mockito.cglib.core.TypeUtils.isPrimitive(type58);
        boolean boolean61 = org.mockito.cglib.core.TypeUtils.isArray(type58);
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type58);
        int int64 = type58.getOpcode(1);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type58);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str67 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type66);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type66, typeArray69);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.INT_TYPE;
        int int74 = type72.getOpcode((int) ' ');
        java.lang.String[] strArray76 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray76);
        org.mockito.cglib.core.Signature signature78 = new org.mockito.cglib.core.Signature("int", type72, typeArray77);
        org.mockito.asm.Type[] typeArray79 = signature78.getArgumentTypes();
        org.mockito.asm.Type type81 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type82 = org.mockito.cglib.core.TypeUtils.getBoxedType(type81);
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.add(typeArray79, type81);
        int int84 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray79);
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.add(typeArray69, typeArray79);
        java.lang.String[] strArray87 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray88 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray87);
        java.lang.Class[] classArray89 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.getTypes(classArray89);
        org.mockito.asm.Type[] typeArray91 = org.mockito.cglib.core.TypeUtils.add(typeArray88, typeArray90);
        org.mockito.asm.Type[] typeArray92 = org.mockito.cglib.core.TypeUtils.add(typeArray85, typeArray91);
        org.mockito.asm.Type type94 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang");
        java.lang.String str95 = org.mockito.cglib.core.TypeUtils.getClassName(type94);
        org.mockito.asm.Type[] typeArray96 = org.mockito.cglib.core.TypeUtils.add(typeArray85, type94);
        org.mockito.asm.Type[] typeArray97 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type94);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame(42, (int) (byte) -1, (java.lang.Object[]) typeArray37, 0, (java.lang.Object[]) typeArray97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang" + "'", str12, "java.lang");
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(signature15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNull(obj22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1163443187" + "'", str23, "L1163443187");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "short" + "'", str25, "short");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(signature31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(signature57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "V" + "'", str59, "V");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "void" + "'", str62, "void");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 6 + "'", int64 == 6);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "short" + "'", str67, "short");
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "(V)S" + "'", str70, "(V)S");
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 32 + "'", int74 == 32);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(typeArray88);
        org.junit.Assert.assertNotNull(classArray89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(typeArray91);
        org.junit.Assert.assertNotNull(typeArray92);
        org.junit.Assert.assertNotNull(type94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "java.lang" + "'", str95, "java.lang");
        org.junit.Assert.assertNotNull(typeArray96);
        org.junit.Assert.assertNotNull(typeArray97);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(130);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
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
            localVariablesSorter11.visitIincInsn(155, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitMultiANewArrayInsn("()B", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLdcInsn((java.lang.Object) "(L;)L;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTypeInsn(13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.String str15 = label13.toString();
        java.lang.Object obj16 = label13.info;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        java.lang.Object obj19 = label17.info;
        java.lang.String str20 = label17.toString();
        java.lang.Object obj21 = label17.info;
        label13.info = obj21;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitJumpInsn((int) (byte) -1, label13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1404666685" + "'", str15, "L1404666685");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L772045958" + "'", str20, "L772045958");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L60328210");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = localVariablesSorter10.visitAnnotation("$28$29B", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        label9.info = type12;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLineNumber(42, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L175185367" + "'", str11, "L175185367");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "short" + "'", str13, "short");
        org.junit.Assert.assertNotNull(type14);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitMaxs(32, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        java.lang.Object obj15 = label12.info;
        java.lang.Object obj16 = label12.info;
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
        java.lang.String str29 = label17.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLocalVariable("org/mockito/cglib/core/Signature", "L774406697", "", label12, label17, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
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
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1208071799" + "'", str29, "L1208071799");
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.Object obj10 = label7.info;
        java.lang.Object obj11 = label7.info;
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        label7.info = typeArray17;
        label7.info = "S";
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        java.lang.Object obj23 = label21.info;
        java.lang.String str24 = label21.toString();
        java.lang.Object obj25 = label21.info;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.Object obj27 = label26.info;
        java.lang.Object obj28 = label26.info;
        java.lang.Object obj29 = label26.info;
        java.lang.Object obj30 = label26.info;
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        label26.info = typeArray36;
        label26.info = "S";
        org.mockito.asm.Label[] labelArray40 = new org.mockito.asm.Label[] { label21, label26 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn((int) (short) 10, 1, label7, labelArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L128057613" + "'", str24, "L128057613");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(labelArray40);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        java.lang.Object obj6 = label4.info;
        java.lang.String str7 = label4.toString();
        java.lang.String str8 = label4.toString();
        int[] intArray11 = new int[] { (short) -1, 16 };
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.String str13 = label12.toString();
        java.lang.Object obj14 = label12.info;
        org.mockito.asm.Label[] labelArray15 = new org.mockito.asm.Label[] { label12 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLookupSwitchInsn(label4, intArray11, labelArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L2105141328" + "'", str7, "L2105141328");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L2105141328" + "'", str8, "L2105141328");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 16]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L2143214977" + "'", str13, "L2143214977");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(labelArray15);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        int int13 = type11.getOpcode((int) ' ');
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("int", type11, typeArray16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getType("V");
        boolean boolean20 = signature17.equals((java.lang.Object) "V");
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class[] classArray24 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        boolean boolean29 = signature17.equals((java.lang.Object) strArray27);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit((int) (short) 0, 5, "<init>(S)V", "L1111712985", "int(L;)I", strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(signature23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
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
            classEmitter5.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
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
        java.lang.String str15 = label11.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLabel(label11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L151214799" + "'", str14, "L151214799");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L151214799" + "'", str15, "L151214799");
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        java.lang.Object obj3 = label2.info;
        java.lang.Object obj4 = label2.info;
        java.lang.String str5 = label2.toString();
        java.lang.String str6 = label2.toString();
        java.lang.Object obj7 = label2.info;
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray11);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("short", type10, typeArray12);
        java.lang.String str14 = signature13.getName();
        label2.info = str14;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLabel(label2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1273411765" + "'", str5, "L1273411765");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1273411765" + "'", str6, "L1273411765");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "short" + "'", str14, "short");
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter1.visitMethod(153, "Hi!", "B", "L692754600", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@91308b3");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(typeArray11);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("L1325724854");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("short");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(130, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIntInsn(96, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter7.visitAnnotation("D", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
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
            org.mockito.asm.Type type9 = classEmitter2.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter5.visitMethod((int) '#', "L$243B", "LL$3B$3B", "org$2Emockito$2Ecglib$2Ecore", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1376b5cd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        label9.info = type12;
        int[] intArray17 = new int[] { (short) 10 };
        org.mockito.asm.Label[] labelArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLookupSwitchInsn(label9, intArray17, labelArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L649714625" + "'", str11, "L649714625");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "short" + "'", str13, "short");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10]");
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
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
            localVariablesSorter10.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
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
            org.mockito.asm.AnnotationVisitor annotationVisitor20 = classAdapter15.visitAnnotation("Ljava/lang/Short;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        java.lang.String str11 = label7.toString();
        java.lang.Object obj12 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(132, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L2010703157" + "'", str10, "L2010703157");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L2010703157" + "'", str11, "L2010703157");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type13);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray22);
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) typeArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(signature24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(signature29);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
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
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type24 = type23.getElementType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor25 = classAdapter15.visitField(0, "L<init>()V;", "L1943638160", "<init>(S)V", (java.lang.Object) type23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(158, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitInsn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
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
            localVariablesSorter10.visitTypeInsn((int) ' ', "Lint;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.String str16 = signature15.toString();
        org.mockito.asm.Type[] typeArray17 = signature15.getArgumentTypes();
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        java.lang.Class<?> wildcardClass23 = typeArray22.getClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        java.lang.Class<?> wildcardClass29 = typeArray28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        java.lang.Class[] classArray31 = new java.lang.Class[] { wildcardClass23, wildcardClass29 };
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitFrame(2, 35, (java.lang.Object[]) typeArray17, 35, (java.lang.Object[]) classArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(signature15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<init>()V" + "'", str16, "<init>()V");
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str30, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 112);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
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
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor16 = classEmitter9.visitField(8, "S", "Ljava/lang/Void;", "L63122622", obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
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
        java.lang.Object obj14 = label12.info;
        java.lang.String str15 = label12.toString();
        java.lang.Object obj16 = label12.info;
        java.lang.String str17 = label12.toString();
        int[] intArray23 = new int[] { 13, 7, 13, 16, 96 };
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.Object obj25 = label24.info;
        java.lang.String str26 = label24.toString();
        java.lang.Object obj27 = label24.info;
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] { label24 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLookupSwitchInsn(label12, intArray23, labelArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L902639534" + "'", str15, "L902639534");
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L902639534" + "'", str17, "L902639534");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[13, 7, 13, 16, 96]");
        org.junit.Assert.assertNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1471361913" + "'", str26, "L1471361913");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(labelArray28);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
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
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        int int17 = type15.getOpcode((int) ' ');
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("int", type15, typeArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor23 = classEmitter2.visitField((int) '4', "(L;)S", "(V)S", "L;(Ljava/lang/L;LV;)L;", (java.lang.Object) strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn((int) 'a', 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        label0.info = ' ';
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        java.lang.String str8 = type6.getClassName();
        label0.info = type6;
        java.lang.Object obj10 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L323840564" + "'", str3, "L323840564");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "int" + "'", str7, "int");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "int" + "'", str8, "int");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "I");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "I");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "I");
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        int int7 = type4.getSort();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) -1, type4);
        org.mockito.asm.Type type9 = local8.getType();
        int int10 = local8.getIndex();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
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
            classEmitter5.visitSource("(L;)D", "Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
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
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        int int19 = type16.getSize();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("LV;", type16, typeArray20);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor24 = classEmitter2.visitMethod(102, "L477062747", "Lint;", "L1908549724", strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6a506b45");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "short" + "'", str17, "short");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
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
            localVariablesSorter11.visitFieldInsn((int) (short) -1, "L1403562481", "org.mockito.cglib.core", "(L;)S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitMethodInsn(102, "(L;Lint;L;D)Ljava/lang/Short;", "java/lang/Short", "L915517561");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("L315113280", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitMultiANewArrayInsn("org.mockito.cglib.core.Signature", 102);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter2.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
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
        org.mockito.asm.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitAttribute(attribute17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("V");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor12 = classAdapter4.visitField(5, "LV;", "L915517561", "L1943638160", (java.lang.Object) type11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type11);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type5);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type5);
        int int8 = type5.getSort();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (short) -1, type5);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(100, type11);
        int int13 = type11.getSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("(L;Lint;L;D)D", type5, typeArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(L;Lint;L;D)D' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(L;)D" + "'", str20, "(L;)D");
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.String str12 = label9.toString();
        label9.info = ' ';
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        java.lang.String str17 = type15.getClassName();
        label9.info = type15;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLineNumber(124, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1648460108" + "'", str12, "L1648460108");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "int" + "'", str16, "int");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "int" + "'", str17, "int");
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
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
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        int int29 = type27.getOpcode((int) ' ');
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("int", type27, typeArray32);
        org.mockito.asm.Type[] typeArray34 = signature33.getArgumentTypes();
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray24);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(100, type38);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type38);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type38);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        boolean boolean45 = org.mockito.cglib.core.TypeUtils.isPrimitive(type43);
        boolean boolean46 = org.mockito.cglib.core.TypeUtils.isArray(type43);
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local(9, type43);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type43);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean53 = org.mockito.cglib.core.TypeUtils.isPrimitive(type52);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray51, type52);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray51, type56);
        org.mockito.asm.Type type58 = type56.getElementType();
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray60);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean63 = org.mockito.cglib.core.TypeUtils.isPrimitive(type62);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type62);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray64);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray48, typeArray64);
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray68 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray67);
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray70);
        java.lang.Class[] classArray72 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.getTypes(classArray72);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray71, typeArray73);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray67, typeArray71);
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.add(typeArray66, typeArray67);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class(124, 154, "L1910611786", type19, typeArray67, "(L;)S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "V" + "'", str44, "V");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "(L;D)Lt;" + "'", str65, "(L;D)Lt;");
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(classArray72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(typeArray76);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn(124, "", "hi!", "LZ;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs((int) (byte) 0, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitInnerClass("L130113989", "Short", "Hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor19 = classEmitter2.visitMethod(42, "L60328210", "()LShort;", "", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@62a4fd18");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(typeArray18);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java.lang.L179248870");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.getTypes(classArray8);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(100, type13);
        int int15 = type13.getSize();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame((int) '#', 7, (java.lang.Object[]) classArray8, (int) (byte) 0, (java.lang.Object[]) typeArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(L;)D" + "'", str22, "(L;)D");
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
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
            org.mockito.cglib.core.CodeEmitter codeEmitter18 = classEmitter16.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("L723084290", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = localVariablesSorter7.visitParameterAnnotation((int) (byte) -1, "Lorg/mockito/asm/Type;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
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
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = type14.getClassName();
        label8.info = type14;
        java.lang.String str18 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitLineNumber((int) (short) 100, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L739363704" + "'", str11, "L739363704");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "int" + "'", str15, "int");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "int" + "'", str16, "int");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L739363704" + "'", str18, "L739363704");
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        int[] intArray10 = null;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        boolean boolean18 = type15.equals((java.lang.Object) label16);
        java.lang.Object obj19 = label16.info;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.Object obj22 = label20.info;
        java.lang.String str23 = label20.toString();
        java.lang.Object obj24 = label20.info;
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean29 = org.mockito.cglib.core.TypeUtils.isPrimitive(type28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type28);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type32);
        org.mockito.asm.Type type34 = type32.getElementType();
        label20.info = type34;
        java.lang.String str36 = label20.toString();
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] { label16, label20 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLookupSwitchInsn(label7, intArray10, labelArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1617596266" + "'", str9, "L1617596266");
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1466735451" + "'", str23, "L1466735451");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type34);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1466735451" + "'", str36, "L1466735451");
        org.junit.Assert.assertNotNull(labelArray37);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitInsn(7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
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
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor19 = classEmitter2.visitField((int) (byte) -1, "L40020120", "Lorg/mockito/asm/Type;", "L63122622", (java.lang.Object) type17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMaxs((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = methodAdapter6.visitParameterAnnotation(32, "Double", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = methodAdapter8.visitAnnotation("hi!()Ljava/lang/Short;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
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
        java.lang.String[] strArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor19 = classAdapter13.visitMethod((int) ' ', "L652322048", "L2029575687", "(L;)L;", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2624a7b8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitFieldInsn(35, "(L;)Z", "B", "(L;Lint;)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        java.lang.String str5 = signature4.getDescriptor();
        java.lang.String str6 = signature4.toString();
        org.mockito.asm.Type[] typeArray7 = signature4.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("L965538451", type1, typeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "()V" + "'", str5, "()V");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<init>()V" + "'", str6, "<init>()V");
        org.junit.Assert.assertNotNull(typeArray7);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
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
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
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
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        int int33 = type31.getOpcode((int) ' ');
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("int", type31, typeArray36);
        org.mockito.asm.Type[] typeArray38 = signature37.getArgumentTypes();
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter41 = classEmitter18.begin_method(14, signature24, typeArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7e9177da");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(signature24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str3 = type2.toString();
        java.lang.String str4 = type2.toString();
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("L;", type2, typeArray10);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        java.lang.String str13 = type12.getClassName();
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L;" + "'", str3, "L;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L;" + "'", str4, "L;");
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitVarInsn(56, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitMaxs(56, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.String str13 = label11.toString();
        java.lang.Object obj14 = label11.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.Object obj17 = label15.info;
        java.lang.String str18 = label15.toString();
        java.lang.Object obj19 = label15.info;
        label11.info = obj19;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        java.lang.Object obj23 = label21.info;
        java.lang.Object obj24 = label21.info;
        java.lang.Object obj25 = label21.info;
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        label21.info = typeArray31;
        label21.info = "S";
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
        java.lang.String str51 = label49.toString();
        org.mockito.asm.Label[] labelArray52 = new org.mockito.asm.Label[] { label21, label35, label49 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTableSwitchInsn(6, (int) (short) 1, label11, labelArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L393444280" + "'", str13, "L393444280");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L91925294" + "'", str18, "L91925294");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
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
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "L1455409187" + "'", str51, "L1455409187");
        org.junit.Assert.assertNotNull(labelArray52);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        java.lang.Object obj6 = label4.info;
        java.lang.String str7 = label4.toString();
        java.lang.Object obj8 = label4.info;
        java.lang.String str9 = label4.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1831446133" + "'", str7, "L1831446133");
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1831446133" + "'", str9, "L1831446133");
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        java.lang.Object obj5 = label0.info;
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("short", type8, typeArray10);
        java.lang.String str12 = signature11.getName();
        label0.info = str12;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1258102703" + "'", str3, "L1258102703");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1258102703" + "'", str4, "L1258102703");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "short" + "'", str12, "short");
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn((int) 'a', "Double", "L$243B", "LL;;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        java.lang.Object[] objArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame(155, 11, (java.lang.Object[]) typeArray12, 2, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = localVariablesSorter9.visitAnnotation("boolean", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter3.visitAnnotation("Java$2Elang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("<init>()V");
        java.lang.String str2 = type1.getInternalName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<init>()V" + "'", str2, "<init>()V");
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.Object obj11 = label8.info;
        java.lang.Object obj12 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitLineNumber(35, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("I");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn(126, "L774406697", "", "L$3B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
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
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = classAdapter9.visitAnnotation("Lint;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        org.mockito.asm.Type type7 = signature6.getReturnType();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        boolean boolean11 = type8.equals((java.lang.Object) label9);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLineNumber((int) (short) 1, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        java.lang.Object obj8 = label6.info;
        java.lang.String str9 = label6.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type11);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(11, type11);
        java.lang.Class<?> wildcardClass15 = local14.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        label6.info = type16;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1829277732" + "'", str7, "L1829277732");
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1829277732" + "'", str9, "L1829277732");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "short" + "'", str12, "short");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type16);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("(L;D)Lt;");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray15);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        java.lang.Class<?> wildcardClass27 = typeArray26.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.cglib.core.Signature signature32 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray30);
        org.mockito.asm.Type type33 = signature32.getReturnType();
        java.lang.Class<?> wildcardClass34 = signature32.getClass();
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass34);
        java.lang.String str36 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        java.lang.Class<?> wildcardClass41 = typeArray40.getClass();
        java.lang.String str42 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass41);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass41);
        java.lang.String str44 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        java.lang.String str46 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray49);
        java.lang.Class<?> wildcardClass51 = typeArray50.getClass();
        java.lang.String str52 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass51);
        java.lang.String str53 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass51);
        java.lang.String str54 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        java.lang.String str56 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass51);
        java.lang.Class[] classArray57 = new java.lang.Class[] { wildcardClass27, wildcardClass34, wildcardClass41, wildcardClass51 };
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.getTypes(classArray57);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray62 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.getTypes(classArray62);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("short", type61, typeArray63);
        int int65 = type61.getSort();
        java.lang.String str66 = type61.toString();
        java.lang.String str67 = type61.toString();
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.getClassName(type61);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray58, type61);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.INT_TYPE;
        int int73 = type71.getOpcode((int) ' ');
        java.lang.String[] strArray75 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray75);
        org.mockito.cglib.core.Signature signature77 = new org.mockito.cglib.core.Signature("int", type71, typeArray76);
        org.mockito.asm.Type[] typeArray78 = signature77.getArgumentTypes();
        org.mockito.asm.Type type80 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type81 = org.mockito.cglib.core.TypeUtils.getBoxedType(type80);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.add(typeArray78, type80);
        java.lang.String[] strArray84 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray84);
        java.lang.Class[] classArray86 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.getTypes(classArray86);
        org.mockito.asm.Type[] typeArray88 = org.mockito.cglib.core.TypeUtils.add(typeArray85, typeArray87);
        org.mockito.asm.Type[] typeArray89 = org.mockito.cglib.core.TypeUtils.add(typeArray78, typeArray87);
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.add(typeArray69, typeArray78);
        org.mockito.asm.Type[] typeArray91 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray78);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class((int) (short) 1, (int) (byte) 10, "L1587696640", type10, typeArray91, "L154119407");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(signature17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "()LShort;" + "'", str22, "()LShort;");
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str28, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(signature32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str35, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str36, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str42, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str43, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str44, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str46, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str52, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str53, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str54, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str56, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "L;" + "'", str66, "L;");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "L;" + "'", str67, "L;");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 32 + "'", int73 == 32);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertNotNull(classArray86);
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertNotNull(typeArray88);
        org.junit.Assert.assertNotNull(typeArray89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(typeArray91);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L652322048");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
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
            classAdapter9.visitInnerClass("L63122622", "L851034773", "Lorg/mockito/cglib/core/Signature;", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
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
            localVariablesSorter9.visitIntInsn(157, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter7.visit(0, 96, "L;(Ljava/lang/L;LV;)L;", "L1202418377", "void", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter4.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4c62172d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = methodAdapter6.visitParameterAnnotation(6, "L60328210", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter4.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitSource("(L;Lint;)V", "L1011045012");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = methodAdapter5.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
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
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter2.visitAnnotation("L723084290", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.Object obj17 = label15.info;
        java.lang.Object obj18 = label15.info;
        java.lang.Object obj19 = null;
        label15.info = obj19;
        java.lang.String str21 = label15.toString();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.Object obj24 = label22.info;
        java.lang.Object obj25 = label22.info;
        java.lang.Object obj26 = label22.info;
        java.lang.Class[] classArray27 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray27);
        label22.info = typeArray32;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter11.visitLocalVariable("java$2Elang", "", "L477062747", label15, label22, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 153");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1272956738" + "'", str21, "L1272956738");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter2.visitMethod(108, "java.lang.Short", "Void", "L774406697", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@480acd55");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.String str7 = label5.toString();
        java.lang.Object obj8 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLineNumber(13, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1367999354" + "'", str7, "L1367999354");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitIincInsn(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
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
        java.lang.Object obj17 = label14.info;
        java.lang.Object obj18 = label14.info;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.Object obj21 = label19.info;
        java.lang.String str22 = label19.toString();
        java.lang.String str23 = label19.toString();
        java.lang.String str24 = label19.toString();
        java.lang.Object obj25 = label19.info;
        java.lang.String str26 = label19.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLocalVariable("Java$2Elang", "L851034773", "L1768459599", label14, label19, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 56");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L640932499" + "'", str22, "L640932499");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L640932499" + "'", str23, "L640932499");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L640932499" + "'", str24, "L640932499");
        org.junit.Assert.assertNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L640932499" + "'", str26, "L640932499");
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
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
            org.mockito.cglib.core.CodeEmitter codeEmitter15 = classEmitter0.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitMaxs(108, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("L1813600832");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1813600832" + "'", str1, "L1813600832");
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
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
            localVariablesSorter9.visitIntInsn(16, 129);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
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
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitLabel(label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L759344143" + "'", str8, "L759344143");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L759344143" + "'", str9, "L759344143");
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
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter4.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        label0.info = ' ';
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
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1826474881" + "'", str3, "L1826474881");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1826474881" + "'", str6, "L1826474881");
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
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
            classEmitter5.visitInnerClass("L690312719", "IL1202418377", "<init>(S)V", 102);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
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
            classEmitter17.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn(129, "(L;)S", "L245395834", "L1034014722");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = classAdapter1.visitAnnotation("L1034763014", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
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
            org.mockito.asm.Type type9 = classEmitter7.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor("L851034773");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str11 = type10.toString();
        java.lang.String str12 = type10.toString();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("L;", type10, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter21 = classEmitter4.begin_method(100, signature7, typeArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@29f320fa");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(signature7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L;" + "'", str11, "L;");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L;" + "'", str12, "L;");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.String str11 = label8.toString();
        java.lang.String str12 = label8.toString();
        java.lang.Object obj13 = label8.info;
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("short", type16, typeArray18);
        java.lang.String str20 = signature19.getName();
        label8.info = str20;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.String str23 = label22.toString();
        java.lang.Object obj24 = label22.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTryCatchBlock(label7, label8, label22, "I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L513666151" + "'", str11, "L513666151");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L513666151" + "'", str12, "L513666151");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "short" + "'", str20, "short");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1416396987" + "'", str23, "L1416396987");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter2.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter5.visitAnnotation("(Ljava/lang/L;)V", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
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
            org.mockito.cglib.core.CodeEmitter codeEmitter13 = classEmitter2.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visit(11, 158, "L<init>()V;", "L915517561", "Void", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(typeArray17);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("java.lang.Void", "$28$29B", "L1589298560", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        java.lang.Class[] classArray0 = null;
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(L;Lint;)V", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(L;Lint;)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor26 = classEmitter17.visitField(154, "L1589298560", "", "(L;Lint;L;D)Ljava/lang/Short;", (java.lang.Object) 104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
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
            org.mockito.cglib.core.CodeEmitter codeEmitter10 = classEmitter2.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1071d093");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.Object obj10 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLineNumber(126, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1516982515" + "'", str9, "L1516982515");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(116, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1109657447", "L1109657447");
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) -1, "", (org.mockito.asm.MethodVisitor) methodAdapter7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str15 = type14.toString();
        java.lang.String str16 = type14.toString();
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("L;", type14, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter11.visitLdcInsn((java.lang.Object) type24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L;" + "'", str15, "L;");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L;" + "'", str16, "L;");
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type24);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
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
        java.lang.Object obj17 = label14.info;
        java.lang.Object obj18 = label14.info;
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        label14.info = typeArray24;
        label14.info = "S";
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.Object obj29 = label28.info;
        java.lang.String str30 = label28.toString();
        java.lang.Object obj31 = label28.info;
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        java.lang.Object obj33 = label32.info;
        java.lang.Object obj34 = label32.info;
        java.lang.String str35 = label32.toString();
        java.lang.Object obj36 = label32.info;
        label28.info = obj36;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLocalVariable("L1461338839", "L154119407", "V", label14, label28, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 155");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNull(obj29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L933018621" + "'", str30, "L933018621");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L1356670341" + "'", str35, "L1356670341");
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIincInsn(4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
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
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("L;", "(Ljava/lang/L;)V", "(L;)D", label10, label22, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 128");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1295291403" + "'", str11, "L1295291403");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L;" + "'", str20, "L;");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMethodInsn((int) (byte) 100, "hi!()Ljava/lang/Short;", "", "org.mockito.cglib.core");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 132);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
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
            org.mockito.asm.FieldVisitor fieldVisitor26 = classAdapter17.visitField((-1), "L690312719", "Ljava/lang/Short;", "L897927500", (java.lang.Object) "D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
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
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("I", "L1202418377");
        java.lang.String str23 = signature22.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter5.visitField(130, "L306758391", "<init>()V", "IL1202418377", (java.lang.Object) signature22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "I" + "'", str23, "I");
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitMethodInsn(124, "L306758391", "L2029575687", "Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type3 = null;
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor6);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.declare_field(128, "L715803435", type3, (java.lang.Object) localVariablesSorter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(6, 60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = localVariablesSorter8.visitParameterAnnotation(35, "V", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
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
            org.mockito.cglib.core.CodeEmitter codeEmitter15 = classEmitter11.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@66d0115f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
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
            localVariablesSorter10.visitMethodInsn(35, "Lorg/mockito/cglib/core/Signature;", "int(L;)I", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = methodAdapter6.visitParameterAnnotation(0, "L1619152913", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.String str11 = label8.toString();
        java.lang.String str12 = label8.toString();
        java.lang.String str13 = label8.toString();
        int[] intArray17 = new int[] { 12, (byte) 0, 3 };
        org.mockito.asm.Label[] labelArray18 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label8, intArray17, labelArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L990954965" + "'", str11, "L990954965");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L990954965" + "'", str12, "L990954965");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L990954965" + "'", str13, "L990954965");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[12, 0, 3]");
        org.junit.Assert.assertNotNull(labelArray18);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(128);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber((int) (byte) 100, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = methodAdapter8.visitAnnotation("L1768459599", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java/lang/Short");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java/lang/Short" + "'", str1, "Java/lang/Short");
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit(3, 60, "(L;Lint;L;D)Ljava/lang/Short;", "L205843408", "L1461338839", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitTypeInsn((int) (byte) 1, "L306758391");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(11, type12);
        java.lang.Class<?> wildcardClass16 = local15.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        label7.info = type17;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLineNumber(0, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L2143761975" + "'", str8, "L2143761975");
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L2143761975" + "'", str10, "L2143761975");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "short" + "'", str13, "short");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(116);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitMethodInsn(153, "L715803435", "L130113989", "()LShort;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitMethodInsn(7, "LZ;", "(L;)D", "(L;D)Lt;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
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
        // The following exception was thrown during execution in test generation
        try {
            classAdapter12.visitInnerClass("(L;)S", "L115210646", "<init>()V", 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter5.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitInsn(158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitVarInsn(126, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
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
            classEmitter2.visitOuterClass("void", "L1565509129", "()Ljava/lang/IL1202418377;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn(60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitTypeInsn((int) 'a', "L40020120");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
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
            org.mockito.asm.Type type11 = classEmitter1.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str12 = signature11.getDescriptor();
        java.lang.String str13 = signature11.toString();
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        java.lang.Class<?> wildcardClass18 = typeArray17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        boolean boolean23 = signature11.equals((java.lang.Object) wildcardClass18);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("L1587696640");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter26 = classEmitter2.begin_method(56, signature11, typeArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7a1d26d0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str19, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str20, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str21, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(typeArray25);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("short", type15, typeArray17);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("short", type21, typeArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        boolean boolean29 = org.mockito.cglib.core.TypeUtils.isArray(type26);
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        boolean boolean33 = type26.equals((java.lang.Object) strArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray34);
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor38 = classEmitter7.visitMethod(16, "boolean", "(L;)I", "L692754600", strArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@605b10a2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "V" + "'", str27, "V");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "void" + "'", str30, "void");
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(typeArray37);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(158, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.String str13 = label11.toString();
        java.lang.Object obj14 = label11.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.Object obj17 = label15.info;
        java.lang.String str18 = label15.toString();
        java.lang.Object obj19 = label15.info;
        label11.info = obj19;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("L723084290", "L477062747", "(Ljava/lang/Short;)D", label10, label11, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 16");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1591293933" + "'", str13, "L1591293933");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L642570981" + "'", str18, "L642570981");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
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
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        java.lang.Class<?> wildcardClass16 = typeArray15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor21 = classEmitter2.visitField(156, "L2061722705", "L60328210", "L1908549724", (java.lang.Object) type20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str17, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str18, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str19, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type20);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLdcInsn((java.lang.Object) "LShort;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
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
            classEmitter0.visitOuterClass("L869655829", "L1011045012", "L130113989");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMultiANewArrayInsn("Hi!", 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(130);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("L965538451", "(L;)D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(3, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitMaxs(106, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
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
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        java.lang.Class<?> wildcardClass16 = typeArray15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        java.lang.Class<?> wildcardClass23 = signature21.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        java.lang.Class<?> wildcardClass30 = typeArray29.getClass();
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass30);
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass30);
        java.lang.String str33 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        java.lang.Class<?> wildcardClass40 = typeArray39.getClass();
        java.lang.String str41 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass40);
        java.lang.String str42 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray46 = new java.lang.Class[] { wildcardClass16, wildcardClass23, wildcardClass30, wildcardClass40 };
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray51 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.getTypes(classArray51);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("short", type50, typeArray52);
        int int54 = type50.getSort();
        java.lang.String str55 = type50.toString();
        java.lang.String str56 = type50.toString();
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray47, type50);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        int int62 = type60.getOpcode((int) ' ');
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray64);
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("int", type60, typeArray65);
        org.mockito.asm.Type[] typeArray67 = signature66.getArgumentTypes();
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type70 = org.mockito.cglib.core.TypeUtils.getBoxedType(type69);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray67, type69);
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray73);
        java.lang.Class[] classArray75 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.getTypes(classArray75);
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.add(typeArray74, typeArray76);
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.add(typeArray67, typeArray76);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.add(typeArray58, typeArray67);
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray67);
        int int81 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray10);
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
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str17, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(signature21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str24, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str25, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str31, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str32, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str33, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str35, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str41, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str42, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str43, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str45, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "L;" + "'", str55, "L;");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "L;" + "'", str56, "L;");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 32 + "'", int62 == 32);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 124);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIincInsn((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
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
            classEmitter5.visitInnerClass("I", "(Ljava/lang/L;)L;", "java.lang", 56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Object obj7 = label5.info;
        java.lang.Object obj8 = label5.info;
        java.lang.Object obj9 = label5.info;
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        label5.info = typeArray15;
        label5.info = "S";
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.String str20 = label19.toString();
        java.lang.Object obj21 = label19.info;
        java.lang.String str22 = label19.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type24);
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(11, type24);
        java.lang.Class<?> wildcardClass28 = local27.getClass();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        label19.info = type29;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("L1565509129", "Ljava/lang/Void;", "", label5, label19, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L196060533" + "'", str20, "L196060533");
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L196060533" + "'", str22, "L196060533");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "short" + "'", str25, "short");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(type29);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
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
            classEmitter2.visitOuterClass("", "", "(L;Lint;)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("short", type16, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("short", type22, typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray24);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray31);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        int int36 = type34.getOpcode((int) ' ');
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("int", type34, typeArray39);
        org.mockito.asm.Type[] typeArray41 = signature40.getArgumentTypes();
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getBoxedType(type43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type43);
        int int46 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray41);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray41);
        org.mockito.cglib.core.Signature signature48 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getType("()B");
        int int51 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray47, type50);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitFrame(104, 5, (java.lang.Object[]) typeArray26, 132, (java.lang.Object[]) typeArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "short" + "'", str29, "short");
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(V)S" + "'", str32, "(V)S");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(signature48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(typeArray52);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
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
            localVariablesSorter10.visitInsn(106);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        int int14 = type12.getOpcode((int) ' ');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("int", type12, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getBoxedType(type21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type21);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L$3B", type10, typeArray19);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitLdcInsn((java.lang.Object) type25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
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
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLabel(label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L99058896" + "'", str12, "L99058896");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L99058896" + "'", str13, "L99058896");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "short" + "'", str21, "short");
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTypeInsn(52, "L1438273522");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.String str8 = label6.toString();
        java.lang.Object obj9 = label6.info;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = null;
        label14.info = obj15;
        java.lang.Object obj17 = label14.info;
        java.lang.Object obj18 = label14.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label6, label10, label14, "org/mockito/cglib/core/Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L116945303" + "'", str8, "L116945303");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1989491540" + "'", str13, "L1989491540");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L$3B");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitMaxs(104, 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
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
        java.lang.String str18 = label14.toString();
        java.lang.String str19 = label14.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.Object obj22 = label20.info;
        java.lang.String str23 = label20.toString();
        java.lang.Object obj24 = label20.info;
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean29 = org.mockito.cglib.core.TypeUtils.isPrimitive(type28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type28);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type32);
        org.mockito.asm.Type type34 = type32.getElementType();
        label20.info = type34;
        java.lang.String str36 = label20.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLocalVariable("$28$29B", "L245395834", "", label14, label20, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 32");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1422158054" + "'", str17, "L1422158054");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1422158054" + "'", str18, "L1422158054");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1422158054" + "'", str19, "L1422158054");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L717119934" + "'", str23, "L717119934");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type34);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L717119934" + "'", str36, "L717119934");
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L680990058");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(116);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
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
        java.lang.String str16 = label12.toString();
        java.lang.String str17 = label12.toString();
        java.lang.Object obj18 = label12.info;
        java.lang.String str19 = label12.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.Object obj22 = label20.info;
        java.lang.String str23 = label20.toString();
        label20.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLocalVariable("java.lang", "L652322048", "Void", label12, label20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L56725415" + "'", str15, "L56725415");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L56725415" + "'", str16, "L56725415");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L56725415" + "'", str17, "L56725415");
        org.junit.Assert.assertNull(obj18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L56725415" + "'", str19, "L56725415");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L692824022" + "'", str23, "L692824022");
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Label label10 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLineNumber(10, label10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFieldInsn((int) (short) 10, "<init>", "L680990058", "L245395834");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.String str12 = label9.toString();
        java.lang.Object obj13 = label9.info;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        java.lang.String str17 = label14.toString();
        label14.info = ' ';
        java.lang.String str20 = label14.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("Lint;", "", "short(Ljava/lang/V;LV;)Lva/lang;", label9, label14, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 155");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1393601809" + "'", str12, "L1393601809");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1331281082" + "'", str17, "L1331281082");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1331281082" + "'", str20, "L1331281082");
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTypeInsn(154, "B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
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
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean25 = type22.equals((java.lang.Object) type24);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        int int27 = type22.getDimensions();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type31);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type35);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean41 = org.mockito.cglib.core.TypeUtils.isPrimitive(type40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray45 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray44);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray44);
        java.lang.Class[] classArray47 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray44, typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray43, typeArray44);
        org.mockito.cglib.core.Signature signature51 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray50);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter16.begin_class(12, 96, "L965538451", type22, typeArray50, "LL$3B$3B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "LL;;" + "'", str23, "LL;;");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L;" + "'", str26, "L;");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(signature46);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(signature51);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getClassName(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.String str10 = label9.toString();
        java.lang.Object obj11 = label9.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.String str13 = label12.toString();
        java.lang.Object obj14 = label12.info;
        java.lang.Object obj15 = label12.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.Object obj18 = label16.info;
        java.lang.String str19 = label16.toString();
        java.lang.Object obj20 = label16.info;
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isPrimitive(type24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type24);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = type28.getElementType();
        label16.info = type30;
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        java.lang.Object obj34 = label33.info;
        java.lang.String str35 = label33.toString();
        java.lang.Object obj36 = label33.info;
        org.mockito.asm.Label label37 = new org.mockito.asm.Label();
        java.lang.Object obj38 = label37.info;
        java.lang.Object obj39 = label37.info;
        java.lang.String str40 = label37.toString();
        java.lang.Object obj41 = label37.info;
        label33.info = obj41;
        java.lang.String str43 = label33.toString();
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        java.lang.Object obj45 = label44.info;
        java.lang.Object obj46 = label44.info;
        java.lang.Object obj47 = label44.info;
        java.lang.Object obj48 = label44.info;
        java.lang.Class[] classArray49 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        label44.info = typeArray54;
        label44.info = "S";
        org.mockito.asm.Label[] labelArray58 = new org.mockito.asm.Label[] { label12, label16, label32, label33, label44 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTableSwitchInsn(3, 157, label9, labelArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1958483680" + "'", str10, "L1958483680");
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L634838063" + "'", str13, "L634838063");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1162749857" + "'", str19, "L1162749857");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNull(obj34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L617629847" + "'", str35, "L617629847");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "L810504699" + "'", str40, "L810504699");
        org.junit.Assert.assertNull(obj41);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L617629847" + "'", str43, "L617629847");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(labelArray58);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter2.getClassInfo();
        java.lang.String[] strArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter2.visitMethod(153, "L1331900336", "L1565509129", "L245395834", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7fd7af4e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitInsn((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
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
            classAdapter14.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = methodAdapter6.visitAnnotation("L154119407", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
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
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType("Short");
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) '#', type16);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        int int20 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray27);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type22, typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.begin_class(0, 155, "L680990058", type19, typeArray28, "Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.String str15 = label13.toString();
        java.lang.Object obj16 = label13.info;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        java.lang.Object obj19 = label17.info;
        java.lang.String str20 = label17.toString();
        java.lang.Object obj21 = label17.info;
        label13.info = obj21;
        java.lang.String str23 = label13.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter11.visitJumpInsn(6, label13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1264253223" + "'", str15, "L1264253223");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L792614310" + "'", str20, "L792614310");
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1264253223" + "'", str23, "L1264253223");
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
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
            classEmitter2.visitOuterClass("L1438273522", "L<init>()V;", "java/lang/Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter5.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L715803435");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L715803435" + "'", str1, "L715803435");
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLdcInsn((java.lang.Object) classEmitter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo20);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitMultiANewArrayInsn("L1109657447", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        int int3 = type1.getOpcode((int) ' ');
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 0, type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type I is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
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
            org.mockito.asm.FieldVisitor fieldVisitor16 = classEmitter8.visitField((int) (byte) 100, "L2061722705", "L1589298560", "Lint;", (java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn((int) (short) 10, "LL$3B$3B", "LZ;", "L1340227649");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
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
            org.mockito.asm.AnnotationVisitor annotationVisitor19 = classEmitter16.visitAnnotation("L723084290", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTypeInsn(112, "(L;D)Lt;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        org.mockito.asm.Type type5 = signature4.getReturnType();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray11);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("short", type10, typeArray12);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("short", type16, typeArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray18);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("<init>", type5, typeArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getComponentType(type5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type V is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "void" + "'", str7, "void");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(0, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
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
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        int int28 = type26.getOpcode((int) ' ');
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("int", type26, typeArray31);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getType("V");
        boolean boolean35 = signature32.equals((java.lang.Object) "V");
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray36);
        java.lang.Class[] classArray39 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.getTypes(classArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray40);
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray42);
        boolean boolean44 = signature32.equals((java.lang.Object) strArray42);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor45 = classEmitter1.visitMethod(52, "L154119407", "(V)S", "java.lang", strArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@69a5cd3");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(signature38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(52, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(116, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = classEmitter2.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        java.lang.String str6 = label4.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type7);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        label4.info = type7;
        label0.info = type7;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L463273065" + "'", str3, "L463273065");
        org.junit.Assert.assertNull(obj5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L351304992" + "'", str6, "L351304992");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "short" + "'", str8, "short");
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Java/lang/Short");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(108);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor14 = localVariablesSorter9.visitParameterAnnotation((int) (byte) -1, "LL;;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitVarInsn(128, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(104, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitTypeInsn(116, "L1956791564");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = classEmitter2.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L774406697");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn(106, "L2021451540", "Hi!", "L40020120");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(108, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("S");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter4.visitParameterAnnotation(3, "short(Ljava/lang/V;LV;)Lva/lang;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(106);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.mockito.asm.Type type13 = signature12.getReturnType();
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type13);
        boolean boolean15 = type9.equals((java.lang.Object) type14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type19);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type23);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean29 = org.mockito.cglib.core.TypeUtils.isPrimitive(type28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray24);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLdcInsn((java.lang.Object) typeArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(L;Lint;)V" + "'", str32, "(L;Lint;)V");
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = localVariablesSorter7.visitParameterAnnotation(0, "(V)S", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = localVariablesSorter9.visitAnnotation("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitVarInsn(96, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
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
            classAdapter13.visitSource("L;", "byte");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("<init>()V");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLdcInsn((java.lang.Object) type13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type13);
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6c547ce2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.mockito.asm.Type type13 = signature12.getReturnType();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(100, type16);
        int int18 = type16.getSize();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type28 = type27.getElementType();
        int int29 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type27);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("L897927500", type13, typeArray30);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.cglib.core.Signature signature34 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray32);
        java.lang.Class[] classArray35 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.getTypes(classArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray37, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray40);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLdcInsn((java.lang.Object) typeArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(L;)D" + "'", str25, "(L;)D");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(signature34);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "()V" + "'", str42, "()V");
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter4.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
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
            localVariablesSorter9.visitIntInsn(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitFieldInsn((int) (short) 1, "L154119407", "L1910611786", "L$3B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Label label8 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLineNumber(0, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter21 = classEmitter17.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        java.lang.Class<?> wildcardClass14 = typeArray13.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        java.lang.String str18 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLdcInsn((java.lang.Object) str18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str17, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str18, "[Lorg/mockito/asm/Type;");
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.String str13 = label11.toString();
        int[] intArray20 = new int[] { 130, 132, 155, 8, 126, 13 };
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = null;
        label21.info = obj22;
        java.lang.Object obj24 = label21.info;
        java.lang.Object obj25 = label21.info;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.String str27 = label26.toString();
        java.lang.Object obj28 = label26.info;
        java.lang.String str29 = label26.toString();
        org.mockito.asm.Label[] labelArray30 = new org.mockito.asm.Label[] { label21, label26 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLookupSwitchInsn(label11, intArray20, labelArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1601053558" + "'", str13, "L1601053558");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[130, 132, 155, 8, 126, 13]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L528162171" + "'", str27, "L528162171");
        org.junit.Assert.assertNull(obj28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L528162171" + "'", str29, "L528162171");
        org.junit.Assert.assertNotNull(labelArray30);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
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
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor23 = classEmitter5.visitAnnotation("L869655829", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLdcInsn((java.lang.Object) label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(153, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 156);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("(L;)S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L1619152913");
        org.mockito.asm.Type[] typeArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
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
            org.mockito.asm.AnnotationVisitor annotationVisitor21 = classAdapter18.visitAnnotation("(L;Lint;L;D)D", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter2.visitField(32, "java.lang.Void", "int", "L60328210", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitJumpInsn(5, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1973456817" + "'", str9, "L1973456817");
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
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
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean27 = type24.equals((java.lang.Object) type26);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray33);
        java.lang.String[] strArray35 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor36 = classAdapter18.visitMethod(1, "L690312719", "L2017536669", "java.lang.L179248870", strArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5ac303d5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LL;;" + "'", str25, "LL;;");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(signature30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "()B" + "'", str34, "()B");
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        int int7 = type4.getSort();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) -1, type4);
        int int9 = local8.getIndex();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getPackageName(type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray19);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.String str24 = label22.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type25);
        label22.info = type25;
        boolean boolean29 = signature20.equals((java.lang.Object) label22);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber(156, label22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(signature16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNull(obj23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1298999280" + "'", str24, "L1298999280");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "short" + "'", str26, "short");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(11, 2, "L1403562481", "short(Ljava/lang/V;LV;)Lva/lang;", "V", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("<init>()V");
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(1, type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(158, type6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = type6.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitFieldInsn((int) (short) 0, "(Ljava/lang/L;)V", "LShort;", "(L;)D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        int int6 = type1.getDimensions();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL;;" + "'", str2, "LL;;");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L;" + "'", str5, "L;");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTypeInsn((int) (byte) 10, "Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter9.visitTypeInsn(132, "L205843408");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        java.lang.Object[] objArray12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type17);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type21);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean27 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFrame(35, 156, objArray12, (int) (byte) 100, (java.lang.Object[]) typeArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitVarInsn((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(112);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTypeInsn(8, "(L;Lint;L;D)Ljava/lang/Short;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = methodAdapter7.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L38704069" + "'", str1, "L38704069");
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        java.lang.String str14 = type12.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(100, type18);
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        boolean boolean23 = type12.equals((java.lang.Object) signature22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter5.visitField(0, "L690312719", "short", "<init>(D)V", (java.lang.Object) type12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "int" + "'", str13, "int");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "I" + "'", str14, "I");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "double" + "'", str20, "double");
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter1.visitMethod((int) (byte) 10, "t", "(Ljava/lang/L;)L;", "[Lorg/mockito/asm/Type;", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2042bce6");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        java.lang.Object obj14 = label11.info;
        java.lang.Object obj15 = null;
        label11.info = obj15;
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
        boolean boolean33 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        label11.info = boolean33;
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        java.lang.Object obj36 = label35.info;
        java.lang.Object obj37 = label35.info;
        java.lang.String str38 = label35.toString();
        label35.info = ' ';
        java.lang.String str41 = label35.toString();
        java.lang.Object obj42 = label35.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLocalVariable("<init>(S)V", "LZ;", "(L;Lint;L;D)Ljava/lang/Short;", label11, label35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L2075373489" + "'", str20, "L2075373489");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L159781622" + "'", str38, "L159781622");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "L159781622" + "'", str41, "L159781622");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + ' ' + "'", obj42, ' ');
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        java.lang.Object obj10 = null;
        label6.info = obj10;
        java.lang.String str12 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitJumpInsn((int) (short) 0, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L966726820" + "'", str12, "L966726820");
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isPrimitive(type7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type7);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = type3.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.String str10 = label9.toString();
        java.lang.Object obj11 = label9.info;
        java.lang.Object obj12 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLabel(label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1310459495" + "'", str10, "L1310459495");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
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
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        int int19 = type16.getSize();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("LV;", type16, typeArray20);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor24 = classEmitter2.visitMethod(124, "L;", "L1213742046", "L2017536669", strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2e3d79f3");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "short" + "'", str17, "short");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
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
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        java.lang.String str29 = signature28.getDescriptor();
        java.lang.String str30 = signature28.getDescriptor();
        java.lang.String str31 = signature28.getName();
        org.mockito.asm.Type type32 = signature28.getReturnType();
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        java.lang.Object obj34 = label33.info;
        java.lang.Object obj35 = label33.info;
        java.lang.Object obj36 = label33.info;
        java.lang.Object obj37 = label33.info;
        java.lang.Class[] classArray38 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        label33.info = typeArray43;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter45 = classEmitter11.begin_method(14, signature28, typeArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@49c89c54");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(signature28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "()V" + "'", str29, "()V");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "()V" + "'", str30, "()V");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<init>" + "'", str31, "<init>");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray43);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "(L;)D", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter9.visitAttribute(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean11 = type8.equals((java.lang.Object) type10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(32, (int) (byte) 100, "(Ljava/lang/L;)Lt;", "L692754600", "L2017536669", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LL;;" + "'", str9, "LL;;");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "()B" + "'", str18, "()B");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitFieldInsn(132, "L1092810277()LShort;", "L1111712985", "<init>(D)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("L$3B");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(132, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMaxs(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter5.visitAnnotation("byte(D)S", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getPackageName(type11);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        java.lang.String str23 = label21.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type24);
        label21.info = type24;
        boolean boolean28 = signature19.equals((java.lang.Object) label21);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitJumpInsn(56, label21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang" + "'", str12, "java.lang");
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(signature15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNull(obj22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L450389689" + "'", str23, "L450389689");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "short" + "'", str25, "short");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(60, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter8.visitAnnotation("L1852500780", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(155, "()V", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.String str13 = label12.toString();
        java.lang.Object obj14 = label12.info;
        java.lang.String str15 = label12.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(11, type17);
        java.lang.Class<?> wildcardClass21 = local20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        label12.info = type22;
        int[] intArray24 = new int[] {};
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.String str26 = label25.toString();
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.Object obj28 = label27.info;
        java.lang.Object obj29 = label27.info;
        java.lang.String str30 = label27.toString();
        java.lang.String str31 = label27.toString();
        java.lang.String str32 = label27.toString();
        java.lang.Object obj33 = label27.info;
        org.mockito.asm.Label label34 = new org.mockito.asm.Label();
        java.lang.Object obj35 = label34.info;
        java.lang.Object obj36 = label34.info;
        java.lang.Object obj37 = label34.info;
        java.lang.Object obj38 = null;
        label34.info = obj38;
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        java.lang.Object obj41 = label40.info;
        java.lang.Object obj42 = label40.info;
        java.lang.String str43 = label40.toString();
        java.lang.Object obj44 = label40.info;
        org.mockito.asm.Label label45 = new org.mockito.asm.Label();
        java.lang.Object obj46 = label45.info;
        java.lang.Object obj47 = label45.info;
        java.lang.Object obj48 = label45.info;
        java.lang.Object obj49 = null;
        label45.info = obj49;
        java.lang.String str51 = label45.toString();
        org.mockito.asm.Label label52 = new org.mockito.asm.Label();
        java.lang.String str53 = label52.toString();
        org.mockito.asm.Label[] labelArray54 = new org.mockito.asm.Label[] { label25, label27, label34, label40, label45, label52 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitLookupSwitchInsn(label12, intArray24, labelArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L770208245" + "'", str13, "L770208245");
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L770208245" + "'", str15, "L770208245");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "short" + "'", str18, "short");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L258489729" + "'", str26, "L258489729");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L652420376" + "'", str30, "L652420376");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L652420376" + "'", str31, "L652420376");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L652420376" + "'", str32, "L652420376");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L363668080" + "'", str43, "L363668080");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "L2065997545" + "'", str51, "L2065997545");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "L896413753" + "'", str53, "L896413753");
        org.junit.Assert.assertNotNull(labelArray54);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitIincInsn(56, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
